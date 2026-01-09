// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230;

import com.aliyun.tea.*;
import com.aliyun.sls20201230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Sls";
        com.aliyun.gateway.sls.Client gatewayClient = new com.aliyun.gateway.sls.Client();
        this._spi = gatewayClient;
        this._endpointRule = "central";
    }


    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies a Logtail configuration to a machine group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyConfigToMachineGroupResponse
     */
    public ApplyConfigToMachineGroupResponse applyConfigToMachineGroupWithOptions(String project, String machineGroup, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyConfigToMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + "/configs/" + configName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ApplyConfigToMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies a Logtail configuration to a machine group.</p>
     * @return ApplyConfigToMachineGroupResponse
     */
    public ApplyConfigToMachineGroupResponse applyConfigToMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConfigToMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用 ai 工具</p>
     * 
     * @param request CallAiToolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CallAiToolsResponse
     */
    public CallAiToolsResponse callAiToolsWithOptions(CallAiToolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("regionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolName)) {
            body.put("toolName", request.toolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CallAiTools"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/tool/call"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CallAiToolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用 ai 工具</p>
     * 
     * @param request CallAiToolsRequest
     * @return CallAiToolsResponse
     */
    public CallAiToolsResponse callAiTools(CallAiToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callAiToolsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(String project, ChangeResourceGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/resourcegroup"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(String project, ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Connections between consumers and Simple Log Service are established by sending heartbeat messages at regular intervals. If Simple Log Service does not receive heartbeat messages from a consumer on schedule, Simple Log Service deletes the consumer.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ConsumerGroupHeartBeat</code></td>
     * <td align="left"><code>acs:log:${regionId}:${accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/{#ConsumerGroupName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Sends heartbeats to a server from a consumer.</p>
     * 
     * @param request ConsumerGroupHeartBeatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConsumerGroupHeartBeatResponse
     */
    public ConsumerGroupHeartBeatResponse consumerGroupHeartBeatWithOptions(String project, String logstore, String consumerGroup, ConsumerGroupHeartBeatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumer)) {
            query.put("consumer", request.consumer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsumerGroupHeartBeat"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups/" + consumerGroup + "?type=heartbeat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ConsumerGroupHeartBeatResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Connections between consumers and Simple Log Service are established by sending heartbeat messages at regular intervals. If Simple Log Service does not receive heartbeat messages from a consumer on schedule, Simple Log Service deletes the consumer.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ConsumerGroupHeartBeat</code></td>
     * <td align="left"><code>acs:log:${regionId}:${accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/{#ConsumerGroupName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Sends heartbeats to a server from a consumer.</p>
     * 
     * @param request ConsumerGroupHeartBeatRequest
     * @return ConsumerGroupHeartBeatResponse
     */
    public ConsumerGroupHeartBeatResponse consumerGroupHeartBeat(String project, String logstore, String consumerGroup, ConsumerGroupHeartBeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.consumerGroupHeartBeatWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If you do not specify a consumer, you must set <strong>forceSuccess</strong> to <strong>true</strong>. Otherwise, the checkpoint cannot be updated.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the checkpoint of a shard for a consumer group.</p>
     * 
     * @param request ConsumerGroupUpdateCheckPointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConsumerGroupUpdateCheckPointResponse
     */
    public ConsumerGroupUpdateCheckPointResponse consumerGroupUpdateCheckPointWithOptions(String project, String logstore, String consumerGroup, ConsumerGroupUpdateCheckPointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumer)) {
            query.put("consumer", request.consumer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSuccess)) {
            query.put("forceSuccess", request.forceSuccess);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkpoint)) {
            body.put("checkpoint", request.checkpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shard)) {
            body.put("shard", request.shard);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsumerGroupUpdateCheckPoint"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups/" + consumerGroup + "?type=checkpoint"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ConsumerGroupUpdateCheckPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If you do not specify a consumer, you must set <strong>forceSuccess</strong> to <strong>true</strong>. Otherwise, the checkpoint cannot be updated.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the checkpoint of a shard for a consumer group.</p>
     * 
     * @param request ConsumerGroupUpdateCheckPointRequest
     * @return ConsumerGroupUpdateCheckPointResponse
     */
    public ConsumerGroupUpdateCheckPointResponse consumerGroupUpdateCheckPoint(String project, String logstore, String consumerGroup, ConsumerGroupUpdateCheckPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.consumerGroupUpdateCheckPointWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateAgentInstanceConfig</p>
     * 
     * @param request CreateAgentInstanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgentInstanceConfigResponse
     */
    public CreateAgentInstanceConfigResponse createAgentInstanceConfigWithOptions(CreateAgentInstanceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            body.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayConfigs)) {
            body.put("grayConfigs", request.grayConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgentInstanceConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentinstanceconfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAgentInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateAgentInstanceConfig</p>
     * 
     * @param request CreateAgentInstanceConfigRequest
     * @return CreateAgentInstanceConfigResponse
     */
    public CreateAgentInstanceConfigResponse createAgentInstanceConfig(CreateAgentInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentInstanceConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule in a project.</p>
     * 
     * @param request CreateAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlertWithOptions(String project, CreateAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an alert rule in a project.</p>
     * 
     * @param request CreateAlertRequest
     * @return CreateAlertResponse
     */
    public CreateAlertResponse createAlert(String project, CreateAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAlertWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset.</p>
     * 
     * @param request CreateAnnotationDataSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnnotationDataSetResponse
     */
    public CreateAnnotationDataSetResponse createAnnotationDataSetWithOptions(CreateAnnotationDataSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("datasetId", request.datasetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnnotationDataSet"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAnnotationDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dataset.</p>
     * 
     * @param request CreateAnnotationDataSetRequest
     * @return CreateAnnotationDataSetResponse
     */
    public CreateAnnotationDataSetResponse createAnnotationDataSet(CreateAnnotationDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnotationDataSetWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a tag table.</p>
     * 
     * @param request CreateAnnotationLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAnnotationLabelResponse
     */
    public CreateAnnotationLabelResponse createAnnotationLabelWithOptions(CreateAnnotationLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAnnotationLabel"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationlabel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAnnotationLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a tag table.</p>
     * 
     * @param request CreateAnnotationLabelRequest
     * @return CreateAnnotationLabelResponse
     */
    public CreateAnnotationLabelResponse createAnnotationLabel(CreateAnnotationLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnotationLabelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Azure blob文件导入任务</p>
     * 
     * @param request CreateAzureBlobIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAzureBlobIngestionResponse
     */
    public CreateAzureBlobIngestionResponse createAzureBlobIngestionWithOptions(String project, CreateAzureBlobIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Azure blob文件导入任务</p>
     * 
     * @param request CreateAzureBlobIngestionRequest
     * @return CreateAzureBlobIngestionResponse
     */
    public CreateAzureBlobIngestionResponse createAzureBlobIngestion(String project, CreateAzureBlobIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAzureBlobIngestionWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 100 Logtail configurations in a project.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logtail configuration.</p>
     * 
     * @param request CreateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfigWithOptions(String project, CreateConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 100 Logtail configurations in a project.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logtail configuration.</p>
     * 
     * @param request CreateConfigRequest
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfig(String project, CreateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can create up to 30 consumer groups for a Logstore. The name of a consumer group must be unique in a project.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/120035.html">Consume log data</a> and <a href="https://help.aliyun.com/document_detail/28998.html">Use consumer groups to consume data</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group for a Logstore.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroupWithOptions(String project, String logstore, CreateConsumerGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consumerGroup)) {
            body.put("consumerGroup", request.consumerGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConsumerGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can create up to 30 consumer groups for a Logstore. The name of a consumer group must be unique in a project.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/120035.html">Consume log data</a> and <a href="https://help.aliyun.com/document_detail/28998.html">Use consumer groups to consume data</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a consumer group for a Logstore.</p>
     * 
     * @param request CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(String project, String logstore, CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerGroupWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dashboard.</p>
     * 
     * @param request CreateDashboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDashboardResponse
     */
    public CreateDashboardResponse createDashboardWithOptions(String project, CreateDashboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDashboard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dashboards"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDashboardResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a dashboard.</p>
     * 
     * @param request CreateDashboardRequest
     * @return CreateDashboardResponse
     */
    public CreateDashboardResponse createDashboard(String project, CreateDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDashboardWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a new custom domain name to a project.</p>
     * 
     * @param request CreateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(String project, CreateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a new custom domain name to a project.</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(String project, CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDomainWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建下载任务</p>
     * 
     * @param request CreateDownloadJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadJobResponse
     */
    public CreateDownloadJobResponse createDownloadJobWithOptions(String project, CreateDownloadJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDownloadJob"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/downloadjobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDownloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建下载任务</p>
     * 
     * @param request CreateDownloadJobRequest
     * @return CreateDownloadJobResponse
     */
    public CreateDownloadJobResponse createDownloadJob(String project, CreateDownloadJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDownloadJobWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data transformation job in a project.</p>
     * 
     * @param request CreateETLRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateETLResponse
     */
    public CreateETLResponse createETLWithOptions(String project, CreateETLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data transformation job in a project.</p>
     * 
     * @param request CreateETLRequest
     * @return CreateETLResponse
     */
    public CreateETLResponse createETL(String project, CreateETLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createETLWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ES导入任务</p>
     * 
     * @param request CreateElasticsearchIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateElasticsearchIngestionResponse
     */
    public CreateElasticsearchIngestionResponse createElasticsearchIngestionWithOptions(String project, CreateElasticsearchIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ES导入任务</p>
     * 
     * @param request CreateElasticsearchIngestionRequest
     * @return CreateElasticsearchIngestionResponse
     */
    public CreateElasticsearchIngestionResponse createElasticsearchIngestion(String project, CreateElasticsearchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createElasticsearchIngestionWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates indexes for a Logstore.</p>
     * 
     * @param request CreateIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndexWithOptions(String project, String logstore, CreateIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIndex"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/index"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateIndexResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates indexes for a Logstore.</p>
     * 
     * @param request CreateIndexRequest
     * @return CreateIndexResponse
     */
    public CreateIndexResponse createIndex(String project, String logstore, CreateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIndexWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores in each project.</li>
     * <li>If the retention period of a log reaches the data retention period that you specified for the Logstore, the log is deleted.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateLogStore</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logstore.</p>
     * 
     * @param request CreateLogStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStoreWithOptions(String project, CreateLogStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendMeta)) {
            body.put("appendMeta", request.appendMeta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSplit)) {
            body.put("autoSplit", request.autoSplit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTracking)) {
            body.put("enable_tracking", request.enableTracking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptConf)) {
            body.put("encrypt_conf", request.encryptConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTtl)) {
            body.put("hot_ttl", request.hotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrequentAccessTTL)) {
            body.put("infrequentAccessTTL", request.infrequentAccessTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            body.put("logstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSplitShard)) {
            body.put("maxSplitShard", request.maxSplitShard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processorId)) {
            body.put("processorId", request.processorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardCount)) {
            body.put("shardCount", request.shardCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingPolicy)) {
            body.put("shardingPolicy", request.shardingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetryType)) {
            body.put("telemetryType", request.telemetryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores in each project.</li>
     * <li>If the retention period of a log reaches the data retention period that you specified for the Logstore, the log is deleted.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateLogStore</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logstore.</p>
     * 
     * @param request CreateLogStoreRequest
     * @return CreateLogStoreResponse
     */
    public CreateLogStoreResponse createLogStore(String project, CreateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogStoreWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the service log feature for a project.</p>
     * 
     * @param request CreateLoggingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoggingResponse
     */
    public CreateLoggingResponse createLoggingWithOptions(String project, CreateLoggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loggingDetails)) {
            body.put("loggingDetails", request.loggingDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loggingProject)) {
            body.put("loggingProject", request.loggingProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogging"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logging"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateLoggingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the service log feature for a project.</p>
     * 
     * @param request CreateLoggingRequest
     * @return CreateLoggingResponse
     */
    public CreateLoggingResponse createLogging(String project, CreateLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoggingWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logtail pipeline configuration.</p>
     * 
     * @param request CreateLogtailPipelineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogtailPipelineConfigResponse
     */
    public CreateLogtailPipelineConfigResponse createLogtailPipelineConfigWithOptions(String project, CreateLogtailPipelineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregators)) {
            body.put("aggregators", request.aggregators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            body.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flushers)) {
            body.put("flushers", request.flushers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.global)) {
            body.put("global", request.global);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            body.put("inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSample)) {
            body.put("logSample", request.logSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processors)) {
            body.put("processors", request.processors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogtailPipelineConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pipelineconfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateLogtailPipelineConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Logtail pipeline configuration.</p>
     * 
     * @param request CreateLogtailPipelineConfigRequest
     * @return CreateLogtailPipelineConfigResponse
     */
    public CreateLogtailPipelineConfigResponse createLogtailPipelineConfig(String project, CreateLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogtailPipelineConfigWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a machine group.</p>
     * 
     * @param request CreateMachineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMachineGroupResponse
     */
    public CreateMachineGroupResponse createMachineGroupWithOptions(String project, CreateMachineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupAttribute)) {
            body.put("groupAttribute", request.groupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            body.put("groupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineIdentifyType)) {
            body.put("machineIdentifyType", request.machineIdentifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineList)) {
            body.put("machineList", request.machineList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a machine group.</p>
     * 
     * @param request CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     */
    public CreateMachineGroupResponse createMachineGroup(String project, CreateMachineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMachineGroupWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建物化视图</p>
     * 
     * @param request CreateMaterializedViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMaterializedViewResponse
     */
    public CreateMaterializedViewResponse createMaterializedViewWithOptions(String project, CreateMaterializedViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggIntervalMins)) {
            body.put("aggIntervalMins", request.aggIntervalMins);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            body.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSql)) {
            body.put("originalSql", request.originalSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaterializedView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建物化视图</p>
     * 
     * @param request CreateMaterializedViewRequest
     * @return CreateMaterializedViewResponse
     */
    public CreateMaterializedViewResponse createMaterializedView(String project, CreateMaterializedViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMaterializedViewWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a MaxCompute data shipping job.</p>
     * 
     * @param request CreateMaxComputeExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMaxComputeExportResponse
     */
    public CreateMaxComputeExportResponse createMaxComputeExportWithOptions(String project, CreateMaxComputeExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a MaxCompute data shipping job.</p>
     * 
     * @param request CreateMaxComputeExportRequest
     * @return CreateMaxComputeExportResponse
     */
    public CreateMaxComputeExportResponse createMaxComputeExport(String project, CreateMaxComputeExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMaxComputeExportWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Metricstore to store metric data.</p>
     * 
     * @param request CreateMetricStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMetricStoreResponse
     */
    public CreateMetricStoreResponse createMetricStoreWithOptions(String project, CreateMetricStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendMeta)) {
            body.put("appendMeta", request.appendMeta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSplit)) {
            body.put("autoSplit", request.autoSplit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTtl)) {
            body.put("hot_ttl", request.hotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrequentAccessTTL)) {
            body.put("infrequentAccessTTL", request.infrequentAccessTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSplitShard)) {
            body.put("maxSplitShard", request.maxSplitShard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("metricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardCount)) {
            body.put("shardCount", request.shardCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingPolicy)) {
            body.put("shardingPolicy", request.shardingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetricStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMetricStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Metricstore to store metric data.</p>
     * 
     * @param request CreateMetricStoreRequest
     * @return CreateMetricStoreResponse
     */
    public CreateMetricStoreResponse createMetricStore(String project, CreateMetricStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetricStoreWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Ships logs from a Simple Log Service Logstore to an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request CreateOSSExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOSSExportResponse
     */
    public CreateOSSExportResponse createOSSExportWithOptions(String project, CreateOSSExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Ships logs from a Simple Log Service Logstore to an Object Storage Service (OSS) bucket.</p>
     * 
     * @param request CreateOSSExportRequest
     * @return CreateOSSExportResponse
     */
    public CreateOSSExportResponse createOSSExport(String project, CreateOSSExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOSSExportWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an OSS-HDFS data shipping job in a project.</p>
     * 
     * @param request CreateOSSHDFSExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOSSHDFSExportResponse
     */
    public CreateOSSHDFSExportResponse createOSSHDFSExportWithOptions(String project, CreateOSSHDFSExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an OSS-HDFS data shipping job in a project.</p>
     * 
     * @param request CreateOSSHDFSExportRequest
     * @return CreateOSSHDFSExportResponse
     */
    public CreateOSSHDFSExportResponse createOSSHDFSExport(String project, CreateOSSHDFSExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOSSHDFSExportWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) data import job in a project.</p>
     * 
     * @param request CreateOSSIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOSSIngestionResponse
     */
    public CreateOSSIngestionResponse createOSSIngestionWithOptions(String project, CreateOSSIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) data import job in a project.</p>
     * 
     * @param request CreateOSSIngestionRequest
     * @return CreateOSSIngestionResponse
     */
    public CreateOSSIngestionResponse createOSSIngestion(String project, CreateOSSIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOSSIngestionWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataRedundancyType)) {
            body.put("dataRedundancyType", request.dataRedundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recycleBinEnabled)) {
            body.put("recycleBinEnabled", request.recycleBinEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建S3文件导入任务</p>
     * 
     * @param request CreateS3IngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateS3IngestionResponse
     */
    public CreateS3IngestionResponse createS3IngestionWithOptions(String project, CreateS3IngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateS3Ingestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/s3ingestions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateS3IngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建S3文件导入任务</p>
     * 
     * @param request CreateS3IngestionRequest
     * @return CreateS3IngestionResponse
     */
    public CreateS3IngestionResponse createS3Ingestion(String project, CreateS3IngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createS3IngestionWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a saved search.</p>
     * 
     * @param request CreateSavedSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSavedSearchResponse
     */
    public CreateSavedSearchResponse createSavedSearchWithOptions(String project, CreateSavedSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            body.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.savedsearchName)) {
            body.put("savedsearchName", request.savedsearchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchQuery)) {
            body.put("searchQuery", request.searchQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavedSearch"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/savedsearches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateSavedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates a saved search.</p>
     * 
     * @param request CreateSavedSearchRequest
     * @return CreateSavedSearchResponse
     */
    public CreateSavedSearchResponse createSavedSearch(String project, CreateSavedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSavedSearchWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Scheduled SQL job in a project.</p>
     * 
     * @param request CreateScheduledSQLRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledSQLResponse
     */
    public CreateScheduledSQLResponse createScheduledSQLWithOptions(String project, CreateScheduledSQLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Scheduled SQL job in a project.</p>
     * 
     * @param request CreateScheduledSQLRequest
     * @return CreateScheduledSQLResponse
     */
    public CreateScheduledSQLResponse createScheduledSQL(String project, CreateScheduledSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledSQLWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/223777.html">billing</a> of Dedicated SQL.</p>
     * 
     * <b>summary</b> : 
     * <p>If you use the Standard SQL feature to analyze a large amount of data, the logs within the specified time range cannot be fully scanned in a single query request. In this case, the returned results may not contain all matched data. You can increase the number of shards to improve data read and write capabilities. However, this method takes effect only for incremental data. You can enable the Dedicated SQL feature to increase computing resources and the amount of data that can be analyzed in a single query request.</p>
     * 
     * @param request CreateSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSqlInstanceResponse
     */
    public CreateSqlInstanceResponse createSqlInstanceWithOptions(String project, CreateSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cu)) {
            body.put("cu", request.cu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAsDefault)) {
            body.put("useAsDefault", request.useAsDefault);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSqlInstance"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sqlinstance"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateSqlInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/223777.html">billing</a> of Dedicated SQL.</p>
     * 
     * <b>summary</b> : 
     * <p>If you use the Standard SQL feature to analyze a large amount of data, the logs within the specified time range cannot be fully scanned in a single query request. In this case, the returned results may not contain all matched data. You can increase the number of shards to improve data read and write capabilities. However, this method takes effect only for incremental data. You can enable the Dedicated SQL feature to increase computing resources and the amount of data that can be analyzed in a single query request.</p>
     * 
     * @param request CreateSqlInstanceRequest
     * @return CreateSqlInstanceResponse
     */
    public CreateSqlInstanceResponse createSqlInstance(String project, CreateSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSqlInstanceWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建StoreView</p>
     * 
     * @param request CreateStoreViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoreViewResponse
     */
    public CreateStoreViewResponse createStoreViewWithOptions(String project, CreateStoreViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stores)) {
            body.put("stores", request.stores);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStoreView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateStoreViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建StoreView</p>
     * 
     * @param request CreateStoreViewRequest
     * @return CreateStoreViewResponse
     */
    public CreateStoreViewResponse createStoreView(String project, CreateStoreViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStoreViewWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a ticket. Simple Log Service allows you to share the query and analysis pages and dashboard pages with other users and embed the console pages into third-party systems. This way, other users can view your logs in password-free mode. The URLs of the shared pages are referred to as password-free URLs. You can call the CreateTicket operation to obtain a ticket and generate a password-free URL based on the ticket and the URL of the console page that you want to share.</p>
     * 
     * @param request CreateTicketRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenExpirationTime)) {
            query.put("accessTokenExpirationTime", request.accessTokenExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("expirationTime", request.expirationTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tickets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a ticket. Simple Log Service allows you to share the query and analysis pages and dashboard pages with other users and embed the console pages into third-party systems. This way, other users can view your logs in password-free mode. The URLs of the shared pages are referred to as password-free URLs. You can call the CreateTicket operation to obtain a ticket and generate a password-free URL based on the ticket and the URL of the console page that you want to share.</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTicketWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAgentInstanceConfig</p>
     * 
     * @param tmpReq DeleteAgentInstanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAgentInstanceConfigResponse
     */
    public DeleteAgentInstanceConfigResponse deleteAgentInstanceConfigWithOptions(String configType, DeleteAgentInstanceConfigRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAgentInstanceConfigShrinkRequest request = new DeleteAgentInstanceConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "attributes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributesShrink)) {
            query.put("attributes", request.attributesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAgentInstanceConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentinstanceconfigs/" + configType + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAgentInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteAgentInstanceConfig</p>
     * 
     * @param request DeleteAgentInstanceConfigRequest
     * @return DeleteAgentInstanceConfigResponse
     */
    public DeleteAgentInstanceConfigResponse deleteAgentInstanceConfig(String configType, DeleteAgentInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAgentInstanceConfigWithOptions(configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlertWithOptions(String project, String alertName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/" + alertName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an alert rule.</p>
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes data from a dataset.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnnotationDataResponse
     */
    public DeleteAnnotationDataResponse deleteAnnotationDataWithOptions(String datasetId, String annotationdataId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnnotationData"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + "/annotationdata/" + annotationdataId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAnnotationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes data from a dataset.</p>
     * @return DeleteAnnotationDataResponse
     */
    public DeleteAnnotationDataResponse deleteAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a dataset only if no data exists in the dataset.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnnotationDataSetResponse
     */
    public DeleteAnnotationDataSetResponse deleteAnnotationDataSetWithOptions(String datasetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnnotationDataSet"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAnnotationDataSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a dataset only if no data exists in the dataset.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset.</p>
     * @return DeleteAnnotationDataSetResponse
     */
    public DeleteAnnotationDataSetResponse deleteAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only non-built-in tags can be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tag table.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAnnotationLabelResponse
     */
    public DeleteAnnotationLabelResponse deleteAnnotationLabelWithOptions(String labelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAnnotationLabel"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationlabel/" + labelId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAnnotationLabelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only non-built-in tags can be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a tag table.</p>
     * @return DeleteAnnotationLabelResponse
     */
    public DeleteAnnotationLabelResponse deleteAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Azure blob文件导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAzureBlobIngestionResponse
     */
    public DeleteAzureBlobIngestionResponse deleteAzureBlobIngestionWithOptions(String project, String azureBlobIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions/" + azureBlobIngestionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Azure blob文件导入任务</p>
     * @return DeleteAzureBlobIngestionResponse
     */
    public DeleteAzureBlobIngestionResponse deleteAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log collection policy from a cloud service.</p>
     * 
     * @param request DeleteCollectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCollectionPolicyResponse
     */
    public DeleteCollectionPolicyResponse deleteCollectionPolicyWithOptions(String policyName, DeleteCollectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            query.put("dataCode", request.dataCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCollectionPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/collectionpolicy/" + policyName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCollectionPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log collection policy from a cloud service.</p>
     * 
     * @param request DeleteCollectionPolicyRequest
     * @return DeleteCollectionPolicyResponse
     */
    public DeleteCollectionPolicyResponse deleteCollectionPolicy(String policyName, DeleteCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCollectionPolicyWithOptions(policyName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>If a Logtail configuration is applied to a machine group, you cannot collect data from the machine group after you delete the Logtail configuration.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logtail configuration.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfigWithOptions(String project, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs/" + configName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>If a Logtail configuration is applied to a machine group, you cannot collect data from the machine group after you delete the Logtail configuration.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logtail configuration.</p>
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteConsumeProcessor</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumeProcessorResponse
     */
    public DeleteConsumeProcessorResponse deleteConsumeProcessorWithOptions(String project, String processorName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumeProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/consumeprocessors/" + processorName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteConsumeProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteConsumeProcessor</p>
     * @return DeleteConsumeProcessorResponse
     */
    public DeleteConsumeProcessorResponse deleteConsumeProcessor(String project, String processorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumeProcessorWithOptions(project, processorName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a consumer group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(String project, String logstore, String consumerGroup, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConsumerGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups/" + consumerGroup + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>The name of the consumer group is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a consumer group.</p>
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(String project, String logstore, String consumerGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupWithOptions(project, logstore, consumerGroup, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dashboard.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDashboardResponse
     */
    public DeleteDashboardResponse deleteDashboardWithOptions(String project, String dashboardName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDashboard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dashboards/" + dashboardName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDashboardResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dashboard.</p>
     * @return DeleteDashboardResponse
     */
    public DeleteDashboardResponse deleteDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom domain name that is bound to a project.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(String project, String domainName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/domains/" + domainName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom domain name that is bound to a project.</p>
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(String project, String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(project, domainName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a download task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDownloadJobResponse
     */
    public DeleteDownloadJobResponse deleteDownloadJobWithOptions(String project, String downloadJobName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDownloadJob"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/downloadjobs/" + downloadJobName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDownloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a download task.</p>
     * @return DeleteDownloadJobResponse
     */
    public DeleteDownloadJobResponse deleteDownloadJob(String project, String downloadJobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDownloadJobWithOptions(project, downloadJobName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data transformation job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteETLResponse
     */
    public DeleteETLResponse deleteETLWithOptions(String project, String etlName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls/" + etlName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data transformation job.</p>
     * @return DeleteETLResponse
     */
    public DeleteETLResponse deleteETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ES导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteElasticsearchIngestionResponse
     */
    public DeleteElasticsearchIngestionResponse deleteElasticsearchIngestionWithOptions(String project, String esIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions/" + esIngestionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ES导入任务</p>
     * @return DeleteElasticsearchIngestionResponse
     */
    public DeleteElasticsearchIngestionResponse deleteElasticsearchIngestion(String project, String esIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteElasticsearchIngestionWithOptions(project, esIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an index of a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndexWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIndex"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/index"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteIndexResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an index of a Logstore.</p>
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an ingest processor.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIngestProcessorResponse
     */
    public DeleteIngestProcessorResponse deleteIngestProcessorWithOptions(String project, String processorName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIngestProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ingestprocessors/" + processorName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteIngestProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an ingest processor.</p>
     * @return DeleteIngestProcessorResponse
     */
    public DeleteIngestProcessorResponse deleteIngestProcessor(String project, String processorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIngestProcessorWithOptions(project, processorName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore, including all shards and indexes in the Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStoreWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logstore, including all shards and indexes in the Logstore.</p>
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogStoreWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭项目的服务日志记录。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoggingResponse
     */
    public DeleteLoggingResponse deleteLoggingWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogging"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logging"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteLoggingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭项目的服务日志记录。</p>
     * @return DeleteLoggingResponse
     */
    public DeleteLoggingResponse deleteLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoggingWithOptions(project, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logtail pipeline configuration.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogtailPipelineConfigResponse
     */
    public DeleteLogtailPipelineConfigResponse deleteLogtailPipelineConfigWithOptions(String project, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogtailPipelineConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pipelineconfigs/" + configName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteLogtailPipelineConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Logtail pipeline configuration.</p>
     * @return DeleteLogtailPipelineConfigResponse
     */
    public DeleteLogtailPipelineConfigResponse deleteLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a machine group. If the Logtail configurations for log collection are applied to a machine group, the configurations are disassociated from the machine group after the machine group is deleted.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMachineGroupResponse
     */
    public DeleteMachineGroupResponse deleteMachineGroupWithOptions(String project, String machineGroup, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a machine group. If the Logtail configurations for log collection are applied to a machine group, the configurations are disassociated from the machine group after the machine group is deleted.</p>
     * @return DeleteMachineGroupResponse
     */
    public DeleteMachineGroupResponse deleteMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除物化视图</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaterializedViewResponse
     */
    public DeleteMaterializedViewResponse deleteMaterializedViewWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterializedView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除物化视图</p>
     * @return DeleteMaterializedViewResponse
     */
    public DeleteMaterializedViewResponse deleteMaterializedView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMaterializedViewWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute data shipping job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaxComputeExportResponse
     */
    public DeleteMaxComputeExportResponse deleteMaxComputeExportWithOptions(String project, String mcExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports/" + mcExportName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a MaxCompute data shipping job.</p>
     * @return DeleteMaxComputeExportResponse
     */
    public DeleteMaxComputeExportResponse deleteMaxComputeExport(String project, String mcExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMaxComputeExportWithOptions(project, mcExportName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing Metricstore. When you delete a Metricstore, the metric data stored in the Metricstore and associated resources such as associated collection settings and transformation settings are also deleted.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMetricStoreResponse
     */
    public DeleteMetricStoreResponse deleteMetricStoreWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetricStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMetricStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an existing Metricstore. When you delete a Metricstore, the metric data stored in the Metricstore and associated resources such as associated collection settings and transformation settings are also deleted.</p>
     * @return DeleteMetricStoreResponse
     */
    public DeleteMetricStoreResponse deleteMetricStore(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetricStoreWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Object Storage Service (OSS) data shipping job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOSSExportResponse
     */
    public DeleteOSSExportResponse deleteOSSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports/" + ossExportName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Object Storage Service (OSS) data shipping job.</p>
     * @return DeleteOSSExportResponse
     */
    public DeleteOSSExportResponse deleteOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除OSSHDFS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOSSHDFSExportResponse
     */
    public DeleteOSSHDFSExportResponse deleteOSSHDFSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports/" + ossExportName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除OSSHDFS投递任务</p>
     * @return DeleteOSSHDFSExportResponse
     */
    public DeleteOSSHDFSExportResponse deleteOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Object Storage Service (OSS) data import job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOSSIngestionResponse
     */
    public DeleteOSSIngestionResponse deleteOSSIngestionWithOptions(String project, String ossIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions/" + ossIngestionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Object Storage Service (OSS) data import job.</p>
     * @return DeleteOSSIngestionResponse
     */
    public DeleteOSSIngestionResponse deleteOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>After you delete a project, all logs stored in the project and the configurations of the project are deleted and cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String project, DeleteProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceDelete)) {
            query.put("forceDelete", request.forceDelete);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>After you delete a project, all logs stored in the project and the configurations of the project are deleted and cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String project, DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project policy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectPolicyResponse
     */
    public DeleteProjectPolicyResponse deleteProjectPolicyWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProjectPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/policy"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project policy.</p>
     * @return DeleteProjectPolicyResponse
     */
    public DeleteProjectPolicyResponse deleteProjectPolicy(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectPolicyWithOptions(project, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除s3导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteS3IngestionResponse
     */
    public DeleteS3IngestionResponse deleteS3IngestionWithOptions(String project, String s3IngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteS3Ingestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/s3ingestions/" + s3IngestionName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteS3IngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除s3导入任务</p>
     * @return DeleteS3IngestionResponse
     */
    public DeleteS3IngestionResponse deleteS3Ingestion(String project, String s3IngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteS3IngestionWithOptions(project, s3IngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>After you delete a saved search, it cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a saved search.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSavedSearchResponse
     */
    public DeleteSavedSearchResponse deleteSavedSearchWithOptions(String project, String savedsearchName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSavedSearch"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/savedsearches/" + savedsearchName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSavedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>After you delete a saved search, it cannot be restored. Proceed with caution.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a saved search.</p>
     * @return DeleteSavedSearchResponse
     */
    public DeleteSavedSearchResponse deleteSavedSearch(String project, String savedsearchName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSavedSearchWithOptions(project, savedsearchName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Scheduled SQL job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledSQLResponse
     */
    public DeleteScheduledSQLResponse deleteScheduledSQLWithOptions(String project, String scheduledSQLName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls/" + scheduledSQLName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Scheduled SQL job.</p>
     * @return DeleteScheduledSQLResponse
     */
    public DeleteScheduledSQLResponse deleteScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset by using the name of the dataset.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStoreViewResponse
     */
    public DeleteStoreViewResponse deleteStoreViewWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStoreView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews/" + name + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteStoreViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dataset by using the name of the dataset.</p>
     * @return DeleteStoreViewResponse
     */
    public DeleteStoreViewResponse deleteStoreView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStoreViewWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an alert rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAlertResponse
     */
    public DisableAlertResponse disableAlertWithOptions(String project, String alertName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/" + alertName + "?action=disable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DisableAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an alert rule.</p>
     * @return DisableAlertResponse
     */
    public DisableAlertResponse disableAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Scheduled SQL feature.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableScheduledSQLResponse
     */
    public DisableScheduledSQLResponse disableScheduledSQLWithOptions(String project, String scheduledSQLName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls/" + scheduledSQLName + "?action=disable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DisableScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Scheduled SQL feature.</p>
     * @return DisableScheduledSQLResponse
     */
    public DisableScheduledSQLResponse disableScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an alert rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAlertResponse
     */
    public EnableAlertResponse enableAlertWithOptions(String project, String alertName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/" + alertName + "?action=enable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EnableAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an alert rule.</p>
     * @return EnableAlertResponse
     */
    public EnableAlertResponse enableAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Scheduled SQL feature.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableScheduledSQLResponse
     */
    public EnableScheduledSQLResponse enableScheduledSQLWithOptions(String project, String scheduledSQLName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls/" + scheduledSQLName + "?action=enable"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new EnableScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Scheduled SQL feature.</p>
     * @return EnableScheduledSQLResponse
     */
    public EnableScheduledSQLResponse enableScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgentInstanceConfig</p>
     * 
     * @param tmpReq GetAgentInstanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentInstanceConfigResponse
     */
    public GetAgentInstanceConfigResponse getAgentInstanceConfigWithOptions(String configType, GetAgentInstanceConfigRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAgentInstanceConfigShrinkRequest request = new GetAgentInstanceConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "attributes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributesShrink)) {
            query.put("attributes", request.attributesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentInstanceConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentinstanceconfigs/" + configType + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAgentInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgentInstanceConfig</p>
     * 
     * @param request GetAgentInstanceConfigRequest
     * @return GetAgentInstanceConfigResponse
     */
    public GetAgentInstanceConfigResponse getAgentInstanceConfig(String configType, GetAgentInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentInstanceConfigWithOptions(configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an alert rule.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertResponse
     */
    public GetAlertResponse getAlertWithOptions(String project, String alertName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/" + alertName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an alert rule.</p>
     * @return GetAlertResponse
     */
    public GetAlertResponse getAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data in datasets based on the unique identifier of the data.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnnotationDataResponse
     */
    public GetAnnotationDataResponse getAnnotationDataWithOptions(String datasetId, String annotationdataId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnnotationData"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + "/annotationdata/" + annotationdataId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAnnotationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data in datasets based on the unique identifier of the data.</p>
     * @return GetAnnotationDataResponse
     */
    public GetAnnotationDataResponse getAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnnotationDataSetResponse
     */
    public GetAnnotationDataSetResponse getAnnotationDataSetWithOptions(String datasetId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnnotationDataSet"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAnnotationDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dataset.</p>
     * @return GetAnnotationDataSetResponse
     */
    public GetAnnotationDataSetResponse getAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a tag table by using a label ID.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAnnotationLabelResponse
     */
    public GetAnnotationLabelResponse getAnnotationLabelWithOptions(String labelId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnnotationLabel"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationlabel/" + labelId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAnnotationLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a tag table by using a label ID.</p>
     * @return GetAnnotationLabelResponse
     */
    public GetAnnotationLabelResponse getAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Logtail configurations that are applied to a machine group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppliedConfigsResponse
     */
    public GetAppliedConfigsResponse getAppliedConfigsWithOptions(String project, String machineGroup, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppliedConfigs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + "/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAppliedConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Logtail configurations that are applied to a machine group.</p>
     * @return GetAppliedConfigsResponse
     */
    public GetAppliedConfigsResponse getAppliedConfigs(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedConfigsWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the machine groups to which a Logtail configuration is bound.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppliedMachineGroupsResponse
     */
    public GetAppliedMachineGroupsResponse getAppliedMachineGroupsWithOptions(String project, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppliedMachineGroups"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs/" + configName + "/machinegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAppliedMachineGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the machine groups to which a Logtail configuration is bound.</p>
     * @return GetAppliedMachineGroupsResponse
     */
    public GetAppliedMachineGroupsResponse getAppliedMachineGroups(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedMachineGroupsWithOptions(project, configName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步SQL的状态以及结果</p>
     * 
     * @param request GetAsyncSqlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncSqlResponse
     */
    public GetAsyncSqlResponse getAsyncSqlWithOptions(String project, String queryId, GetAsyncSqlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncSql"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/asyncsql/" + queryId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAsyncSqlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取异步SQL的状态以及结果</p>
     * 
     * @param request GetAsyncSqlRequest
     * @return GetAsyncSqlResponse
     */
    public GetAsyncSqlResponse getAsyncSql(String project, String queryId, GetAsyncSqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncSqlWithOptions(project, queryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Azure blob文件导入任务信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAzureBlobIngestionResponse
     */
    public GetAzureBlobIngestionResponse getAzureBlobIngestionWithOptions(String project, String azureBlobIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions/" + azureBlobIngestionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Azure blob文件导入任务信息</p>
     * @return GetAzureBlobIngestionResponse
     */
    public GetAzureBlobIngestionResponse getAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the checkpoints of a shard from which data is consumed by a consumer group.</p>
     * 
     * @param request GetCheckPointRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCheckPointResponse
     */
    public GetCheckPointResponse getCheckPointWithOptions(String project, String logstore, String consumerGroup, GetCheckPointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shard)) {
            query.put("shard", request.shard);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCheckPoint"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups/" + consumerGroup + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetCheckPointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the checkpoints of a shard from which data is consumed by a consumer group.</p>
     * 
     * @param request GetCheckPointRequest
     * @return GetCheckPointResponse
     */
    public GetCheckPointResponse getCheckPoint(String project, String logstore, String consumerGroup, GetCheckPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCheckPointWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>调用GetCollectionPolicy获取对应的规则</p>
     * 
     * @param request GetCollectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCollectionPolicyResponse
     */
    public GetCollectionPolicyResponse getCollectionPolicyWithOptions(String policyName, GetCollectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            query.put("dataCode", request.dataCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCollectionPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/collectionpolicy/" + policyName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetCollectionPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>调用GetCollectionPolicy获取对应的规则</p>
     * 
     * @param request GetCollectionPolicyRequest
     * @return GetCollectionPolicyResponse
     */
    public GetCollectionPolicyResponse getCollectionPolicy(String policyName, GetCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCollectionPolicyWithOptions(policyName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Logtail configuration.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfigWithOptions(String project, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs/" + configName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The name of the required Logtail configuration is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29043.html">ListConfig</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Logtail configuration.</p>
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a consumer processor</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConsumeProcessorResponse
     */
    public GetConsumeProcessorResponse getConsumeProcessorWithOptions(String project, String processorName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConsumeProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/consumeprocessors/" + processorName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetConsumeProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the details of a consumer processor</p>
     * @return GetConsumeProcessorResponse
     */
    public GetConsumeProcessorResponse getConsumeProcessor(String project, String processorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumeProcessorWithOptions(project, processorName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>The values of the pack_id and pack_meta fields are obtained before you query logs. The fields are internal fields, and you can obtain the values by using the debugging feature of your browser in the Simple Log Service console.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreContextLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the contextual logs of a specified log.</p>
     * 
     * @param request GetContextLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextLogsResponse
     */
    public GetContextLogsResponse getContextLogsWithOptions(String project, String logstore, GetContextLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backLines)) {
            query.put("back_lines", request.backLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardLines)) {
            query.put("forward_lines", request.forwardLines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packId)) {
            query.put("pack_id", request.packId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packMeta)) {
            query.put("pack_meta", request.packMeta);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextLogs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "?type=context_log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetContextLogsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>The values of the pack_id and pack_meta fields are obtained before you query logs. The fields are internal fields, and you can obtain the values by using the debugging feature of your browser in the Simple Log Service console.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreContextLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the contextual logs of a specified log.</p>
     * 
     * @param request GetContextLogsRequest
     * @return GetContextLogsResponse
     */
    public GetContextLogsResponse getContextLogs(String project, String logstore, GetContextLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContextLogsWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The following content describes the relationships among a cursor, project, Logstore, and shard:<ul>
     * <li>A project can have multiple Logstores.</li>
     * <li>A Logstore can have multiple shards.</li>
     * <li>You can use a cursor to obtain a log in a shard.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a cursor based on a point in time.</p>
     * 
     * @param request GetCursorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCursorResponse
     */
    public GetCursorResponse getCursorWithOptions(String project, String logstore, String shardId, GetCursorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCursor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards/" + shardId + "?type=cursor"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetCursorResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The following content describes the relationships among a cursor, project, Logstore, and shard:<ul>
     * <li>A project can have multiple Logstores.</li>
     * <li>A Logstore can have multiple shards.</li>
     * <li>You can use a cursor to obtain a log in a shard.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a cursor based on a point in time.</p>
     * 
     * @param request GetCursorRequest
     * @return GetCursorResponse
     */
    public GetCursorResponse getCursor(String project, String logstore, String shardId, GetCursorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCursorWithOptions(project, logstore, shardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server time of a cursor.</p>
     * 
     * @param request GetCursorTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCursorTimeResponse
     */
    public GetCursorTimeResponse getCursorTimeWithOptions(String project, String logstore, String shardId, GetCursorTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("cursor", request.cursor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCursorTime"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards/" + shardId + "?type=cursor_time"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetCursorTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server time of a cursor.</p>
     * 
     * @param request GetCursorTimeRequest
     * @return GetCursorTimeResponse
     */
    public GetCursorTimeResponse getCursorTime(String project, String logstore, String shardId, GetCursorTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCursorTimeWithOptions(project, logstore, shardId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a dashboard.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDashboardResponse
     */
    public GetDashboardResponse getDashboardWithOptions(String project, String dashboardName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDashboard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dashboards/" + dashboardName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDashboardResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a dashboard.</p>
     * @return GetDashboardResponse
     */
    public GetDashboardResponse getDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a download task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDownloadJobResponse
     */
    public GetDownloadJobResponse getDownloadJobWithOptions(String project, String downloadJobName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDownloadJob"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/downloadjobs/" + downloadJobName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDownloadJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a download task.</p>
     * @return GetDownloadJobResponse
     */
    public GetDownloadJobResponse getDownloadJob(String project, String downloadJobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDownloadJobWithOptions(project, downloadJobName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a data transformation job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetETLResponse
     */
    public GetETLResponse getETLWithOptions(String project, String etlName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls/" + etlName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a data transformation job.</p>
     * @return GetETLResponse
     */
    public GetETLResponse getETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取ElasticSearch导入任务信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElasticsearchIngestionResponse
     */
    public GetElasticsearchIngestionResponse getElasticsearchIngestionWithOptions(String project, String esIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions/" + esIngestionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取ElasticSearch导入任务信息</p>
     * @return GetElasticsearchIngestionResponse
     */
    public GetElasticsearchIngestionResponse getElasticsearchIngestion(String project, String esIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElasticsearchIngestionWithOptions(project, esIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:<ul>
     * <li>Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.</li>
     * <li>Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     * After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/462234.html">Use GetHistograms to query the distribution of logs</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution of logs that meet the specified search conditions in a Logstore.</p>
     * 
     * @param request GetHistogramsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHistogramsResponse
     */
    public GetHistogramsResponse getHistogramsWithOptions(String project, String logstore, GetHistogramsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHistograms"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/index?type=histogram"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetHistogramsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:<ul>
     * <li>Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.</li>
     * <li>Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     * After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see <a href="https://help.aliyun.com/document_detail/462234.html">Use GetHistograms to query the distribution of logs</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution of logs that meet the specified search conditions in a Logstore.</p>
     * 
     * @param request GetHistogramsRequest
     * @return GetHistogramsResponse
     */
    public GetHistogramsResponse getHistograms(String project, String logstore, GetHistogramsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHistogramsWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the index of a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIndexResponse
     */
    public GetIndexResponse getIndexWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndex"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/index"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetIndexResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the index of a Logstore.</p>
     * @return GetIndexResponse
     */
    public GetIndexResponse getIndex(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an ingest processor.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIngestProcessorResponse
     */
    public GetIngestProcessorResponse getIngestProcessorWithOptions(String project, String processorName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIngestProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ingestprocessors/" + processorName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetIngestProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an ingest processor.</p>
     * @return GetIngestProcessorResponse
     */
    public GetIngestProcessorResponse getIngestProcessor(String project, String processorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIngestProcessorWithOptions(project, processorName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogStoreResponse
     */
    public GetLogStoreResponse getLogStoreWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a Logstore.</p>
     * @return GetLogStoreResponse
     */
    public GetLogStoreResponse getLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing mode of a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogStoreMeteringModeResponse
     */
    public GetLogStoreMeteringModeResponse getLogStoreMeteringModeWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogStoreMeteringMode"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/meteringmode"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLogStoreMeteringModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing mode of a Logstore.</p>
     * @return GetLogStoreMeteringModeResponse
     */
    public GetLogStoreMeteringModeResponse getLogStoreMeteringMode(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreMeteringModeWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the service log configuration of a project.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoggingResponse
     */
    public GetLoggingResponse getLoggingWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogging"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logging"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLoggingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the service log configuration of a project.</p>
     * @return GetLoggingResponse
     */
    public GetLoggingResponse getLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoggingWithOptions(project, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p><strong>Note</strong> Simple Log Service allows you to create a Scheduled SQL job. For more information, see <a href="https://help.aliyun.com/document_detail/286457.html">Create a scheduled SQL job</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete results. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete results. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or the GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:<ul>
     * <li>Real-time data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds\]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios.</li>
     * <li>Historical data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with an approximate latency of 3 seconds.
     * <strong>Note</strong> Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates when Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds\], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see <a href="https://help.aliyun.com/document_detail/407683.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Java</a> and <a href="https://help.aliyun.com/document_detail/407684.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Python</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Logstore in a project.</p>
     * 
     * @param request GetLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogsResponse
     */
    public GetLogsResponse getLogsWithOptions(String project, String logstore, GetLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            query.put("line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerSql)) {
            query.put("powerSql", request.powerSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "?type=log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLogsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p><strong>Note</strong> Simple Log Service allows you to create a Scheduled SQL job. For more information, see <a href="https://help.aliyun.com/document_detail/286457.html">Create a scheduled SQL job</a>.</p>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete results. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete results. Each time you call this operation, the same number of charge units (CUs) are consumed.</li>
     * <li>After a log is written to a Logstore, you can call the GetHistograms or the GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:<ul>
     * <li>Real-time data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds\]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios.</li>
     * <li>Historical data: The difference between the time record in a log of this type and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with an approximate latency of 3 seconds.
     * <strong>Note</strong> Simple Log Service calculates the difference between the log time that is specified by the <strong>time</strong> field and the receiving time that is specified by the <strong>tag</strong>:<strong>receive_time</strong> field for each log. The receiving time indicates when Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds\], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.</li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see <a href="https://help.aliyun.com/document_detail/407683.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Java</a> and <a href="https://help.aliyun.com/document_detail/407684.html">Examples of calling the GetLogs operation by using Simple Log Service SDK for Python</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Logstore in a project.</p>
     * 
     * @param request GetLogsRequest
     * @return GetLogsResponse
     */
    public GetLogsResponse getLogs(String project, String logstore, GetLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogsWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation by using Simple Log Service SDK for Go, Java, or Python. You can call this operation by using Alibaba Cloud SDK for all programming languages.</p>
     * <ul>
     * <li>When you call this operation, take note of the compression method that you use. The supported compression algorithms vary based on the programming language. For more information, see the description of the Accept-Encoding parameter in this topic.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/2771313.html">GetLogs</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a Resource Access Management (RAM) policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the raw log data in a Logstore of a project. The returned result contains the raw log data within a specific time range. The returned result is compressed before transmission.</p>
     * 
     * @param request GetLogsV2Request
     * @param headers GetLogsV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogsV2Response
     */
    public GetLogsV2Response getLogsV2WithOptions(String project, String logstore, GetLogsV2Request request, GetLogsV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forward)) {
            body.put("forward", request.forward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highlight)) {
            body.put("highlight", request.highlight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            body.put("line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            body.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.powerSql)) {
            body.put("powerSql", request.powerSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            body.put("reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.session)) {
            body.put("session", request.session);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("to", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("Accept-Encoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogsV2"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/logs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLogsV2Response());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation by using Simple Log Service SDK for Go, Java, or Python. You can call this operation by using Alibaba Cloud SDK for all programming languages.</p>
     * <ul>
     * <li>When you call this operation, take note of the compression method that you use. The supported compression algorithms vary based on the programming language. For more information, see the description of the Accept-Encoding parameter in this topic.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/2771313.html">GetLogs</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a Resource Access Management (RAM) policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the raw log data in a Logstore of a project. The returned result contains the raw log data within a specific time range. The returned result is compressed before transmission.</p>
     * 
     * @param request GetLogsV2Request
     * @return GetLogsV2Response
     */
    public GetLogsV2Response getLogsV2(String project, String logstore, GetLogsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLogsV2Headers headers = new GetLogsV2Headers();
        return this.getLogsV2WithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a Logtail pipeline configuration.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogtailPipelineConfigResponse
     */
    public GetLogtailPipelineConfigResponse getLogtailPipelineConfigWithOptions(String project, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogtailPipelineConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pipelineconfigs/" + configName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLogtailPipelineConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a Logtail pipeline configuration.</p>
     * @return GetLogtailPipelineConfigResponse
     */
    public GetLogtailPipelineConfigResponse getLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must obtain the following basic permissions before you call this operation:
     *     {
     *         &quot;Version&quot;: &quot;1&quot;,
     *         &quot;Statement&quot;: [
     *             {
     *                 &quot;Action&quot;: [
     *                     &quot;log:Get*&quot;
     *                 ],
     *                 &quot;Resource&quot;: [
     *                     &quot;acs:log:<em>:</em>:mlservice/sls_builtin_*&quot;
     *                 ],
     *                 &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *         ]
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Simple Log Service provides intelligent analysis capabilities that can be used to analyze basic data such as logs, metrics, and traces. You can call the GetMLServiceResults operation to obtain the analysis results of a model. You can call the operation in the following scenarios: Named Entity Recognition (NER) tasks on logs, anomaly detection on time series, and root cause analysis on high-latency traces.</p>
     * 
     * @param request GetMLServiceResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMLServiceResultsResponse
     */
    public GetMLServiceResultsResponse getMLServiceResultsWithOptions(String serviceName, GetMLServiceResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowBuiltin)) {
            query.put("allowBuiltin", request.allowBuiltin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMLServiceResults"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/service/" + serviceName + "/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMLServiceResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must obtain the following basic permissions before you call this operation:
     *     {
     *         &quot;Version&quot;: &quot;1&quot;,
     *         &quot;Statement&quot;: [
     *             {
     *                 &quot;Action&quot;: [
     *                     &quot;log:Get*&quot;
     *                 ],
     *                 &quot;Resource&quot;: [
     *                     &quot;acs:log:<em>:</em>:mlservice/sls_builtin_*&quot;
     *                 ],
     *                 &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *         ]
     *     }</p>
     * 
     * <b>summary</b> : 
     * <p>Simple Log Service provides intelligent analysis capabilities that can be used to analyze basic data such as logs, metrics, and traces. You can call the GetMLServiceResults operation to obtain the analysis results of a model. You can call the operation in the following scenarios: Named Entity Recognition (NER) tasks on logs, anomaly detection on time series, and root cause analysis on high-latency traces.</p>
     * 
     * @param request GetMLServiceResultsRequest
     * @return GetMLServiceResultsResponse
     */
    public GetMLServiceResultsResponse getMLServiceResults(String serviceName, GetMLServiceResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMLServiceResultsWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a machine group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMachineGroupResponse
     */
    public GetMachineGroupResponse getMachineGroupWithOptions(String project, String machineGroup, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a machine group.</p>
     * @return GetMachineGroupResponse
     */
    public GetMachineGroupResponse getMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取物化视图</p>
     * 
     * @param headers GetMaterializedViewHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMaterializedViewResponse
     */
    public GetMaterializedViewResponse getMaterializedViewWithOptions(String project, String name, GetMaterializedViewHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.contentType)) {
            realHeaders.put("Content-Type", com.aliyun.teautil.Common.toJSONString(headers.contentType));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMaterializedView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取物化视图</p>
     * @return GetMaterializedViewResponse
     */
    public GetMaterializedViewResponse getMaterializedView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetMaterializedViewHeaders headers = new GetMaterializedViewHeaders();
        return this.getMaterializedViewWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a MaxCompute data shipping job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMaxComputeExportResponse
     */
    public GetMaxComputeExportResponse getMaxComputeExportWithOptions(String project, String mcExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports/" + mcExportName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a MaxCompute data shipping job.</p>
     * @return GetMaxComputeExportResponse
     */
    public GetMaxComputeExportResponse getMaxComputeExport(String project, String mcExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMaxComputeExportWithOptions(project, mcExportName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information about Metricstores, see <a href="https://help.aliyun.com/document_detail/171723.html">Metricstores</a>. For more information about metric data, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>. You can call this operation to query the settings of a Metricstore. To query the metric data in a Metricstore, see <a href="https://help.aliyun.com/document_detail/174968.html">Query and analysis</a> and <a href="https://help.aliyun.com/document_detail/2771318.html">GetLogsV2</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Metricstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricStoreResponse
     */
    public GetMetricStoreResponse getMetricStoreWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetricStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMetricStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information about Metricstores, see <a href="https://help.aliyun.com/document_detail/171723.html">Metricstores</a>. For more information about metric data, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>. You can call this operation to query the settings of a Metricstore. To query the metric data in a Metricstore, see <a href="https://help.aliyun.com/document_detail/174968.html">Query and analysis</a> and <a href="https://help.aliyun.com/document_detail/2771318.html">GetLogsV2</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Metricstore.</p>
     * @return GetMetricStoreResponse
     */
    public GetMetricStoreResponse getMetricStore(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricStoreWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing mode of a Metricstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetricStoreMeteringModeResponse
     */
    public GetMetricStoreMeteringModeResponse getMetricStoreMeteringModeWithOptions(String project, String metricStore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetricStoreMeteringMode"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + metricStore + "/meteringmode"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMetricStoreMeteringModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the billing mode of a Metricstore.</p>
     * @return GetMetricStoreMeteringModeResponse
     */
    public GetMetricStoreMeteringModeResponse getMetricStoreMeteringMode(String project, String metricStore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricStoreMeteringModeWithOptions(project, metricStore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSExportResponse
     */
    public GetOSSExportResponse getOSSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports/" + ossExportName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取OSS投递任务</p>
     * @return GetOSSExportResponse
     */
    public GetOSSExportResponse getOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get OSSHDFS Exports</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSHDFSExportResponse
     */
    public GetOSSHDFSExportResponse getOSSHDFSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports/" + ossExportName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get OSSHDFS Exports</p>
     * @return GetOSSHDFSExportResponse
     */
    public GetOSSHDFSExportResponse getOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an Object Storage Service (OSS) data import job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOSSIngestionResponse
     */
    public GetOSSIngestionResponse getOSSIngestionWithOptions(String project, String ossIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions/" + ossIngestionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an Object Storage Service (OSS) data import job.</p>
     * @return GetOSSIngestionResponse
     */
    public GetOSSIngestionResponse getOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a project.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a project.</p>
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(project, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>You must set query to a standard SQL statement.</li>
     * <li>You must specify a Logstore in the FROM clause of an SQL statement. A Logstore can be used as an SQL table.</li>
     * <li>You must specify a time range in an SQL statement by using the <strong>date</strong> or <strong>time</strong> parameter. The value of the <strong>date</strong> parameter is a timestamp. The value of the <strong>time</strong> parameter is an integer, and the unit of the value is seconds.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetProjectLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries logs in a project. You can use this operation to query logs at the project level.</p>
     * 
     * @param request GetProjectLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectLogsResponse
     */
    public GetProjectLogsResponse getProjectLogsWithOptions(String project, GetProjectLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.powerSql)) {
            query.put("powerSql", request.powerSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectLogs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectLogsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>Indexes are configured before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * <li>You must set query to a standard SQL statement.</li>
     * <li>You must specify a Logstore in the FROM clause of an SQL statement. A Logstore can be used as an SQL table.</li>
     * <li>You must specify a time range in an SQL statement by using the <strong>date</strong> or <strong>time</strong> parameter. The value of the <strong>date</strong> parameter is a timestamp. The value of the <strong>time</strong> parameter is an integer, and the unit of the value is seconds.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetProjectLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries logs in a project. You can use this operation to query logs at the project level.</p>
     * 
     * @param request GetProjectLogsRequest
     * @return GetProjectLogsResponse
     */
    public GetProjectLogsResponse getProjectLogs(String project, GetProjectLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectLogsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a project policy.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectPolicyResponse
     */
    public GetProjectPolicyResponse getProjectPolicyWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProjectPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/policy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetProjectPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a project policy.</p>
     * @return GetProjectPolicyResponse
     */
    public GetProjectPolicyResponse getProjectPolicy(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectPolicyWithOptions(project, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取s3导入任务信息</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetS3IngestionResponse
     */
    public GetS3IngestionResponse getS3IngestionWithOptions(String project, String s3IngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetS3Ingestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/s3ingestions/" + s3IngestionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetS3IngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取s3导入任务信息</p>
     * @return GetS3IngestionResponse
     */
    public GetS3IngestionResponse getS3Ingestion(String project, String s3IngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getS3IngestionWithOptions(project, s3IngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call the ListSavedSearch operation to query the name of a saved search.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries a saved search.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavedSearchResponse
     */
    public GetSavedSearchResponse getSavedSearchWithOptions(String project, String savedsearchName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavedSearch"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/savedsearches/" + savedsearchName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSavedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call the ListSavedSearch operation to query the name of a saved search.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries a saved search.</p>
     * @return GetSavedSearchResponse
     */
    public GetSavedSearchResponse getSavedSearch(String project, String savedsearchName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSavedSearchWithOptions(project, savedsearchName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Scheduled SQL job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledSQLResponse
     */
    public GetScheduledSQLResponse getScheduledSQLWithOptions(String project, String scheduledSQLName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls/" + scheduledSQLName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Scheduled SQL job.</p>
     * @return GetScheduledSQLResponse
     */
    public GetScheduledSQLResponse getScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the activation status of Simple Log Service. You must use the endpoint for Simple Log Service only in the China (Shanghai) or Singapore region.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSlsServiceResponse
     */
    public GetSlsServiceResponse getSlsServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSlsService"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/slsservice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSlsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the activation status of Simple Log Service. You must use the endpoint for Simple Log Service only in the China (Shanghai) or Singapore region.</p>
     * @return GetSlsServiceResponse
     */
    public GetSlsServiceResponse getSlsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSlsServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of the Dedicated SQL feature.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSqlInstanceResponse
     */
    public GetSqlInstanceResponse getSqlInstanceWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSqlInstance"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sqlinstance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetSqlInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of the Dedicated SQL feature.</p>
     * @return GetSqlInstanceResponse
     */
    public GetSqlInstanceResponse getSqlInstance(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlInstanceWithOptions(project, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a dataset by using the name of the dataset.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStoreViewResponse
     */
    public GetStoreViewResponse getStoreViewWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStoreView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetStoreViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a dataset by using the name of the dataset.</p>
     * @return GetStoreViewResponse
     */
    public GetStoreViewResponse getStoreView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoreViewWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the indexes of a dataset by using the name of the dataset. Only datasets of the logstore type are supported.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStoreViewIndexResponse
     */
    public GetStoreViewIndexResponse getStoreViewIndexWithOptions(String project, String name, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStoreViewIndex"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews/" + name + "/index"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetStoreViewIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the indexes of a dataset by using the name of the dataset. Only datasets of the logstore type are supported.</p>
     * @return GetStoreViewIndexResponse
     */
    public GetStoreViewIndexResponse getStoreViewIndex(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoreViewIndexWithOptions(project, name, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentInstanceConfigs</p>
     * 
     * @param request ListAgentInstanceConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentInstanceConfigsResponse
     */
    public ListAgentInstanceConfigsResponse listAgentInstanceConfigsWithOptions(ListAgentInstanceConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentInstanceConfigs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentinstanceconfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAgentInstanceConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListAgentInstanceConfigs</p>
     * 
     * @param request ListAgentInstanceConfigsRequest
     * @return ListAgentInstanceConfigsResponse
     */
    public ListAgentInstanceConfigsResponse listAgentInstanceConfigs(ListAgentInstanceConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentInstanceConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 ai 工具列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAiToolsResponse
     */
    public ListAiToolsResponse listAiToolsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAiTools"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/tool/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAiToolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取 ai 工具列表</p>
     * @return ListAiToolsResponse
     */
    public ListAiToolsResponse listAiTools() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAiToolsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of alert rules in a project.</p>
     * 
     * @param request ListAlertsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlertsWithOptions(String project, ListAlertsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlerts"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAlertsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of alert rules in a project.</p>
     * 
     * @param request ListAlertsRequest
     * @return ListAlertsResponse
     */
    public ListAlertsResponse listAlerts(String project, ListAlertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAlertsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data in datasets.</p>
     * 
     * @param request ListAnnotationDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnnotationDataResponse
     */
    public ListAnnotationDataResponse listAnnotationDataWithOptions(String datasetId, ListAnnotationDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnnotationData"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + "/annotationdata"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAnnotationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data in datasets.</p>
     * 
     * @param request ListAnnotationDataRequest
     * @return ListAnnotationDataResponse
     */
    public ListAnnotationDataResponse listAnnotationData(String datasetId, ListAnnotationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationDataWithOptions(datasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets.</p>
     * 
     * @param request ListAnnotationDataSetsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnnotationDataSetsResponse
     */
    public ListAnnotationDataSetsResponse listAnnotationDataSetsWithOptions(ListAnnotationDataSetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnnotationDataSets"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAnnotationDataSetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of datasets.</p>
     * 
     * @param request ListAnnotationDataSetsRequest
     * @return ListAnnotationDataSetsResponse
     */
    public ListAnnotationDataSetsResponse listAnnotationDataSets(ListAnnotationDataSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationDataSetsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tag tables.</p>
     * 
     * @param request ListAnnotationLabelsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAnnotationLabelsResponse
     */
    public ListAnnotationLabelsResponse listAnnotationLabelsWithOptions(ListAnnotationLabelsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAnnotationLabels"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationlabel"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAnnotationLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tag tables.</p>
     * 
     * @param request ListAnnotationLabelsRequest
     * @return ListAnnotationLabelsResponse
     */
    public ListAnnotationLabelsResponse listAnnotationLabels(ListAnnotationLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationLabelsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出Azure blob文件导入任务</p>
     * 
     * @param request ListAzureBlobIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAzureBlobIngestionResponse
     */
    public ListAzureBlobIngestionResponse listAzureBlobIngestionWithOptions(String project, ListAzureBlobIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出Azure blob文件导入任务</p>
     * 
     * @param request ListAzureBlobIngestionRequest
     * @return ListAzureBlobIngestionResponse
     */
    public ListAzureBlobIngestionResponse listAzureBlobIngestion(String project, ListAzureBlobIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAzureBlobIngestionWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of log collection policies for cloud services.</p>
     * 
     * @param request ListCollectionPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCollectionPoliciesResponse
     */
    public ListCollectionPoliciesResponse listCollectionPoliciesWithOptions(ListCollectionPoliciesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.centralProject)) {
            query.put("centralProject", request.centralProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            query.put("dataCode", request.dataCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCollectionPolicies"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/collectionpolicy"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListCollectionPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai), Singapore, or Heyuan ACDR Auto region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of log collection policies for cloud services.</p>
     * 
     * @param request ListCollectionPoliciesRequest
     * @return ListCollectionPoliciesResponse
     */
    public ListCollectionPoliciesResponse listCollectionPolicies(ListCollectionPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCollectionPoliciesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all Logtail configurations in a project.</p>
     * 
     * @param request ListConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigResponse
     */
    public ListConfigResponse listConfigWithOptions(String project, ListConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            query.put("logstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries all Logtail configurations in a project.</p>
     * 
     * @param request ListConfigRequest
     * @return ListConfigResponse
     */
    public ListConfigResponse listConfig(String project, ListConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumption processors that meet specific conditions.</p>
     * 
     * @param request ListConsumeProcessorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumeProcessorsResponse
     */
    public ListConsumeProcessorsResponse listConsumeProcessorsWithOptions(String project, ListConsumeProcessorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processorName)) {
            query.put("processorName", request.processorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumeProcessors"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/consumeprocessors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListConsumeProcessorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of consumption processors that meet specific conditions.</p>
     * 
     * @param request ListConsumeProcessorsRequest
     * @return ListConsumeProcessorsResponse
     */
    public ListConsumeProcessorsResponse listConsumeProcessors(String project, ListConsumeProcessorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumeProcessorsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries all consumer groups of a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumerGroupResponse
     */
    public ListConsumerGroupResponse listConsumerGroupWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumerGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries all consumer groups of a Logstore.</p>
     * @return ListConsumerGroupResponse
     */
    public ListConsumerGroupResponse listConsumerGroup(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of dashboards.</p>
     * 
     * @param tmpReq ListDashboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardResponse
     */
    public ListDashboardResponse listDashboardWithOptions(String project, ListDashboardRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        ListDashboardShrinkRequest request = new ListDashboardShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dashboardName)) {
            query.put("dashboardName", request.dashboardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDashboard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dashboards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDashboardResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of dashboards.</p>
     * 
     * @param request ListDashboardRequest
     * @return ListDashboardResponse
     */
    public ListDashboardResponse listDashboard(String project, ListDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>Only one custom domain name can be bound to each project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the custom domain names that are bound to projects.</p>
     * 
     * @param request ListDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(String project, ListDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("domainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>Only one custom domain name can be bound to each project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the custom domain names that are bound to projects.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(String project, ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDomainsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of log download tasks in a project.</p>
     * 
     * @param request ListDownloadJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownloadJobsResponse
     */
    public ListDownloadJobsResponse listDownloadJobsWithOptions(String project, ListDownloadJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownloadJobs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/downloadjobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDownloadJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of log download tasks in a project.</p>
     * 
     * @param request ListDownloadJobsRequest
     * @return ListDownloadJobsResponse
     */
    public ListDownloadJobsResponse listDownloadJobs(String project, ListDownloadJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDownloadJobsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data transformation jobs in a project.</p>
     * 
     * @param request ListETLsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListETLsResponse
     */
    public ListETLsResponse listETLsWithOptions(String project, ListETLsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListETLs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListETLsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of data transformation jobs in a project.</p>
     * 
     * @param request ListETLsRequest
     * @return ListETLsResponse
     */
    public ListETLsResponse listETLs(String project, ListETLsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listETLsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建ES导入任务</p>
     * 
     * @param request ListElasticsearchIngestionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListElasticsearchIngestionsResponse
     */
    public ListElasticsearchIngestionsResponse listElasticsearchIngestionsWithOptions(String project, ListElasticsearchIngestionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListElasticsearchIngestions"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListElasticsearchIngestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建ES导入任务</p>
     * 
     * @param request ListElasticsearchIngestionsRequest
     * @return ListElasticsearchIngestionsResponse
     */
    public ListElasticsearchIngestionsResponse listElasticsearchIngestions(String project, ListElasticsearchIngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listElasticsearchIngestionsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ingest processors that meet specific conditions.</p>
     * 
     * @param request ListIngestProcessorsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIngestProcessorsResponse
     */
    public ListIngestProcessorsResponse listIngestProcessorsWithOptions(String project, ListIngestProcessorsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processorName)) {
            query.put("processorName", request.processorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIngestProcessors"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ingestprocessors"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListIngestProcessorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of ingest processors that meet specific conditions.</p>
     * 
     * @param request ListIngestProcessorsRequest
     * @return ListIngestProcessorsResponse
     */
    public ListIngestProcessorsResponse listIngestProcessors(String project, ListIngestProcessorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIngestProcessorsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListLogStores</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries all Logstores or Logstores that match specific conditions in a project.</p>
     * 
     * @param request ListLogStoresRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStoresWithOptions(String project, ListLogStoresRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            query.put("logstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetryType)) {
            query.put("telemetryType", request.telemetryType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogStores"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListLogStoresResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListLogStores</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/*</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries all Logstores or Logstores that match specific conditions in a project.</p>
     * 
     * @param request ListLogStoresRequest
     * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStores(String project, ListLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogStoresWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Logtail pipeline configurations that meet the specified conditions.</p>
     * 
     * @param request ListLogtailPipelineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogtailPipelineConfigResponse
     */
    public ListLogtailPipelineConfigResponse listLogtailPipelineConfigWithOptions(String project, ListLogtailPipelineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configType)) {
            query.put("configType", request.configType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            query.put("logstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogtailPipelineConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pipelineconfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListLogtailPipelineConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Logtail pipeline configurations that meet the specified conditions.</p>
     * 
     * @param request ListLogtailPipelineConfigRequest
     * @return ListLogtailPipelineConfigResponse
     */
    public ListLogtailPipelineConfigResponse listLogtailPipelineConfig(String project, ListLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogtailPipelineConfigWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the machine groups of a project.</p>
     * 
     * @param request ListMachineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMachineGroupResponse
     */
    public ListMachineGroupResponse listMachineGroupWithOptions(String project, ListMachineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the machine groups of a project.</p>
     * 
     * @param request ListMachineGroupRequest
     * @return ListMachineGroupResponse
     */
    public ListMachineGroupResponse listMachineGroup(String project, ListMachineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMachineGroupWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of machines that are connected to Simple Log Service in a specified machine group.</p>
     * 
     * @param request ListMachinesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMachinesResponse
     */
    public ListMachinesResponse listMachinesWithOptions(String project, String machineGroup, ListMachinesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMachines"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + "/machines"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMachinesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of machines that are connected to Simple Log Service in a specified machine group.</p>
     * 
     * @param request ListMachinesRequest
     * @return ListMachinesResponse
     */
    public ListMachinesResponse listMachines(String project, String machineGroup, ListMachinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMachinesWithOptions(project, machineGroup, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举物化视图</p>
     * 
     * @param request ListMaterializedViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMaterializedViewResponse
     */
    public ListMaterializedViewResponse listMaterializedViewWithOptions(String project, ListMaterializedViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMaterializedView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举物化视图</p>
     * 
     * @param request ListMaterializedViewRequest
     * @return ListMaterializedViewResponse
     */
    public ListMaterializedViewResponse listMaterializedView(String project, ListMaterializedViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMaterializedViewWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举物化视图</p>
     * 
     * @param request ListMaterializedViewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMaterializedViewsResponse
     */
    public ListMaterializedViewsResponse listMaterializedViewsWithOptions(String project, ListMaterializedViewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMaterializedViews"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMaterializedViewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举物化视图</p>
     * 
     * @param request ListMaterializedViewsRequest
     * @return ListMaterializedViewsResponse
     */
    public ListMaterializedViewsResponse listMaterializedViews(String project, ListMaterializedViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMaterializedViewsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute data shipping jobs.</p>
     * 
     * @param request ListMaxComputeExportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMaxComputeExportsResponse
     */
    public ListMaxComputeExportsResponse listMaxComputeExportsWithOptions(String project, ListMaxComputeExportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMaxComputeExports"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMaxComputeExportsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of MaxCompute data shipping jobs.</p>
     * 
     * @param request ListMaxComputeExportsRequest
     * @return ListMaxComputeExportsResponse
     */
    public ListMaxComputeExportsResponse listMaxComputeExports(String project, ListMaxComputeExportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMaxComputeExportsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Metricstores in a project. You can use fuzzy search to query the Metricstores by Metricstore name.</p>
     * 
     * @param request ListMetricStoresRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMetricStoresResponse
     */
    public ListMetricStoresResponse listMetricStoresWithOptions(String project, ListMetricStoresRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetricStores"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMetricStoresResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of Metricstores in a project. You can use fuzzy search to query the Metricstores by Metricstore name.</p>
     * 
     * @param request ListMetricStoresRequest
     * @return ListMetricStoresResponse
     */
    public ListMetricStoresResponse listMetricStores(String project, ListMetricStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetricStoresWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出OSS投递任务</p>
     * 
     * @param request ListOSSExportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOSSExportsResponse
     */
    public ListOSSExportsResponse listOSSExportsWithOptions(String project, ListOSSExportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOSSExports"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListOSSExportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出OSS投递任务</p>
     * 
     * @param request ListOSSExportsRequest
     * @return ListOSSExportsResponse
     */
    public ListOSSExportsResponse listOSSExports(String project, ListOSSExportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOSSExportsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举OSSHDFS投递任务</p>
     * 
     * @param request ListOSSHDFSExportsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOSSHDFSExportsResponse
     */
    public ListOSSHDFSExportsResponse listOSSHDFSExportsWithOptions(String project, ListOSSHDFSExportsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOSSHDFSExports"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListOSSHDFSExportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举OSSHDFS投递任务</p>
     * 
     * @param request ListOSSHDFSExportsRequest
     * @return ListOSSHDFSExportsResponse
     */
    public ListOSSHDFSExportsResponse listOSSHDFSExports(String project, ListOSSHDFSExportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOSSHDFSExportsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Object Storage Service (OSS) data import jobs in a project.</p>
     * 
     * @param request ListOSSIngestionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOSSIngestionsResponse
     */
    public ListOSSIngestionsResponse listOSSIngestionsWithOptions(String project, ListOSSIngestionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOSSIngestions"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListOSSIngestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Object Storage Service (OSS) data import jobs in a project.</p>
     * 
     * @param request ListOSSIngestionsRequest
     * @return ListOSSIngestionsResponse
     */
    public ListOSSIngestionsResponse listOSSIngestions(String project, ListOSSIngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOSSIngestionsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the projects that meet specified conditions.</p>
     * 
     * @param request ListProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchQuota)) {
            query.put("fetchQuota", request.fetchQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("projectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProject"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the projects that meet specified conditions.</p>
     * 
     * @param request ListProjectRequest
     * @return ListProjectResponse
     */
    public ListProjectResponse listProject(ListProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProjectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出s3导入任务</p>
     * 
     * @param request ListS3IngestionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListS3IngestionsResponse
     */
    public ListS3IngestionsResponse listS3IngestionsWithOptions(String project, ListS3IngestionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListS3Ingestions"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/s3ingestions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListS3IngestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出s3导入任务</p>
     * 
     * @param request ListS3IngestionsRequest
     * @return ListS3IngestionsResponse
     */
    public ListS3IngestionsResponse listS3Ingestions(String project, ListS3IngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listS3IngestionsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of saved searches.</p>
     * 
     * @param request ListSavedSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSavedSearchResponse
     */
    public ListSavedSearchResponse listSavedSearchWithOptions(String project, ListSavedSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSavedSearch"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/savedsearches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListSavedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of saved searches.</p>
     * 
     * @param request ListSavedSearchRequest
     * @return ListSavedSearchResponse
     */
    public ListSavedSearchResponse listSavedSearch(String project, ListSavedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSavedSearchWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Scheduled SQL jobs in a project.</p>
     * 
     * @param request ListScheduledSQLsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledSQLsResponse
     */
    public ListScheduledSQLsResponse listScheduledSQLsWithOptions(String project, ListScheduledSQLsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            query.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledSQLs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListScheduledSQLsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Scheduled SQL jobs in a project.</p>
     * 
     * @param request ListScheduledSQLsRequest
     * @return ListScheduledSQLsResponse
     */
    public ListScheduledSQLsResponse listScheduledSQLs(String project, ListScheduledSQLsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledSQLsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of shards in a Logstore.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListShardsResponse
     */
    public ListShardsResponse listShardsWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShards"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListShardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of shards in a Logstore.</p>
     * @return ListShardsResponse
     */
    public ListShardsResponse listShards(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardsWithOptions(project, logstore, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries datasets in a project.</p>
     * 
     * @param request ListStoreViewsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStoreViewsResponse
     */
    public ListStoreViewsResponse listStoreViewsWithOptions(String project, ListStoreViewsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            query.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStoreViews"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListStoreViewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries datasets in a project.</p>
     * 
     * @param request ListStoreViewsRequest
     * @return ListStoreViewsResponse
     */
    public ListStoreViewsResponse listStoreViews(String project, ListStoreViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStoreViewsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListTagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags for one or more resources. You can query tags for resources by resource type or filter resources by tag. Each tag is a key-value pair.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "resourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("resourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ListTagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tags for one or more resources. You can query tags for resources by resource type or filter resources by tag. Each tag is a key-value pair.</p>
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
     * <p>合并两个相邻的readwrite状态的Shards。在参数中指定一个shardID，服务端自动找相邻的下一个Shard进行合并。</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MergeShardResponse
     */
    public MergeShardResponse mergeShardWithOptions(String project, String logstore, String shard, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MergeShard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards/" + shard + "?action=merge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new MergeShardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合并两个相邻的readwrite状态的Shards。在参数中指定一个shardID，服务端自动找相邻的下一个Shard进行合并。</p>
     * @return MergeShardResponse
     */
    public MergeShardResponse mergeShard(String project, String logstore, String shard) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeShardWithOptions(project, logstore, shard, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates Simple Log Service. You must use the endpoint for Simple Log Service only in the China (Shanghai) or Singapore region.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenSlsServiceResponse
     */
    public OpenSlsServiceResponse openSlsServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenSlsService"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/slsservice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new OpenSlsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates Simple Log Service. You must use the endpoint for Simple Log Service only in the China (Shanghai) or Singapore region.</p>
     * @return OpenSlsServiceResponse
     */
    public OpenSlsServiceResponse openSlsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSlsServiceWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see SLS SDK Reference.</li>
     * <li>You must specify a shard when you query the logs.</li>
     * <li>You can query only logs in the Protocol Buffers (protobuf) format. For more information, see <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries logs based on the specified cursors. You can call this operation to obtain raw logs. To query and analyze logs, you can call the GetLogsV2 operation.</p>
     * 
     * @param request PullLogsRequest
     * @param headers PullLogsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PullLogsResponse
     */
    public PullLogsResponse pullLogsWithOptions(String project, String logStore, String shardId, PullLogsRequest request, PullLogsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endCursor)) {
            query.put("end_cursor", request.endCursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("query", request.query);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("Accept-Encoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullLogs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logStore + "/shards/" + shardId + "?type=log"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PullLogsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see SLS SDK Reference.</li>
     * <li>You must specify a shard when you query the logs.</li>
     * <li>You can query only logs in the Protocol Buffers (protobuf) format. For more information, see <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries logs based on the specified cursors. You can call this operation to obtain raw logs. To query and analyze logs, you can call the GetLogsV2 operation.</p>
     * 
     * @param request PullLogsRequest
     * @return PullLogsResponse
     */
    public PullLogsResponse pullLogs(String project, String logStore, String shardId, PullLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PullLogsHeaders headers = new PullLogsHeaders();
        return this.pullLogsWithOptions(project, logStore, shardId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds data to a dataset for storage.</p>
     * 
     * @param request PutAnnotationDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutAnnotationDataResponse
     */
    public PutAnnotationDataResponse putAnnotationDataWithOptions(String datasetId, PutAnnotationDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotationdataId)) {
            query.put("annotationdataId", request.annotationdataId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mlDataParam)) {
            body.put("mlDataParam", request.mlDataParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rawLog)) {
            body.put("rawLog", request.rawLog);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutAnnotationData"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + "/annotationdata"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutAnnotationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds data to a dataset for storage.</p>
     * 
     * @param request PutAnnotationDataRequest
     * @return PutAnnotationDataResponse
     */
    public PutAnnotationDataResponse putAnnotationData(String datasetId, PutAnnotationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putAnnotationDataWithOptions(datasetId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a consumption processor.</p>
     * 
     * @param request PutConsumeProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutConsumeProcessorResponse
     */
    public PutConsumeProcessorResponse putConsumeProcessorWithOptions(String project, String processorName, PutConsumeProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutConsumeProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/consumeprocessors/" + processorName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutConsumeProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a consumption processor.</p>
     * 
     * @param request PutConsumeProcessorRequest
     * @return PutConsumeProcessorResponse
     */
    public PutConsumeProcessorResponse putConsumeProcessor(String project, String processorName, PutConsumeProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putConsumeProcessorWithOptions(project, processorName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an ingest processor.</p>
     * 
     * @param request PutIngestProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutIngestProcessorResponse
     */
    public PutIngestProcessorResponse putIngestProcessorWithOptions(String project, String processorName, PutIngestProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutIngestProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ingestprocessors/" + processorName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutIngestProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies an ingest processor.</p>
     * 
     * @param request PutIngestProcessorRequest
     * @return PutIngestProcessorResponse
     */
    public PutIngestProcessorResponse putIngestProcessor(String project, String processorName, PutIngestProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putIngestProcessorWithOptions(project, processorName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see SLS SDK Reference.</li>
     * <li>When you call the PutLogs operation to write logs to Simple Log Service, Simple Log Servicechecks the format of the logs. If a log does not meet the format requirements, the request fails and no logs are written to Simple Log Service.</li>
     * <li>You can write logs only in the Protocol Buffers (Protobuf) format as log groups. For more information, see <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</li>
     * <li>You can write logs in one of the following modes:<ul>
     * <li>LoadBalance mode: In this mode, Log Service automatically writes logs to all writable shards in a Logstore. This mode delivers high availability for write operations and is suitable for data consumption scenarios in which you do not need to preserve the order of logs.</li>
     * <li>KeyHash: In this mode, a key field is added in the URL parameter. Log Service writes logs to a shard based on the key field. The hash key is optional. If you do not configure the hash key, logs are written to shards in LoadBalance mode. For example, you can use the KeyHash mode to write data from a producer, such as an instance, to the shard whose hash value range includes the hash value of the producer name. This ensures that the data that is written to the shard is ordered and the data in the shard is consumed based on the order. This way, when a shard is split or when shards are merged, the data that is associated with the same hash key is stored only in one shard at a point in time. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shard</a>.</li>
     * </ul>
     * </li>
     * <li>You can call the PutLogs operation to write up to 10 MB of raw logs at a time. We recommend that you keep the total size of the values for each log in a log group to or below 1 MB. Historical versions of SDKs may have different limits. We recommend that you upgrade your SDK to the latest version.</li>
     * <li>The references for Log Service SDK for Java and Log Service SDK for Python provide examples on how to call the PutLogs operation. For more information, see <a href="https://help.aliyun.com/document_detail/279525.html">Get started with Simple Log Service SDK for Java</a> and <a href="https://help.aliyun.com/document_detail/284638.html">Get started with Simple Log Service SDK for Python</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes logs to a Logstore.</p>
     * 
     * @param request PutLogsRequest
     * @param headers PutLogsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutLogsResponse
     */
    public PutLogsResponse putLogsWithOptions(String project, String logstore, PutLogsRequest request, PutLogsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xLogCompresstype)) {
            realHeaders.put("x-log-compresstype", com.aliyun.teautil.Common.toJSONString(headers.xLogCompresstype));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLogs"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards/lb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "protobuf"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLogsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> You cannot call this operation in OpenAPI Explorer. You can use Simple Log Service SDK to call this operation. For more information, see SLS SDK Reference.</li>
     * <li>When you call the PutLogs operation to write logs to Simple Log Service, Simple Log Servicechecks the format of the logs. If a log does not meet the format requirements, the request fails and no logs are written to Simple Log Service.</li>
     * <li>You can write logs only in the Protocol Buffers (Protobuf) format as log groups. For more information, see <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</li>
     * <li>You can write logs in one of the following modes:<ul>
     * <li>LoadBalance mode: In this mode, Log Service automatically writes logs to all writable shards in a Logstore. This mode delivers high availability for write operations and is suitable for data consumption scenarios in which you do not need to preserve the order of logs.</li>
     * <li>KeyHash: In this mode, a key field is added in the URL parameter. Log Service writes logs to a shard based on the key field. The hash key is optional. If you do not configure the hash key, logs are written to shards in LoadBalance mode. For example, you can use the KeyHash mode to write data from a producer, such as an instance, to the shard whose hash value range includes the hash value of the producer name. This ensures that the data that is written to the shard is ordered and the data in the shard is consumed based on the order. This way, when a shard is split or when shards are merged, the data that is associated with the same hash key is stored only in one shard at a point in time. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shard</a>.</li>
     * </ul>
     * </li>
     * <li>You can call the PutLogs operation to write up to 10 MB of raw logs at a time. We recommend that you keep the total size of the values for each log in a log group to or below 1 MB. Historical versions of SDKs may have different limits. We recommend that you upgrade your SDK to the latest version.</li>
     * <li>The references for Log Service SDK for Java and Log Service SDK for Python provide examples on how to call the PutLogs operation. For more information, see <a href="https://help.aliyun.com/document_detail/279525.html">Get started with Simple Log Service SDK for Java</a> and <a href="https://help.aliyun.com/document_detail/284638.html">Get started with Simple Log Service SDK for Python</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes logs to a Logstore.</p>
     * 
     * @param request PutLogsRequest
     * @return PutLogsResponse
     */
    public PutLogsResponse putLogs(String project, String logstore, PutLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PutLogsHeaders headers = new PutLogsHeaders();
        return this.putLogsWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.<ul>
     * <li>You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see <a href="https://help.aliyun.com/document_detail/128139.html">RAM</a>.</li>
     * <li>If you set the Principal element to an asterisk (\<em>) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\</em>) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.</li>
     * <li>You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project policy.</p>
     * 
     * @param request PutProjectPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutProjectPolicyResponse
     */
    public PutProjectPolicyResponse putProjectPolicyWithOptions(String project, PutProjectPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProjectPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/policy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutProjectPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.<ul>
     * <li>You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see <a href="https://help.aliyun.com/document_detail/128139.html">RAM</a>.</li>
     * <li>If you set the Principal element to an asterisk (\<em>) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\</em>) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.</li>
     * <li>You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project policy.</p>
     * 
     * @param request PutProjectPolicyRequest
     * @return PutProjectPolicyResponse
     */
    public PutProjectPolicyResponse putProjectPolicy(String project, PutProjectPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProjectPolicyWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables transfer acceleration.</p>
     * 
     * @param request PutProjectTransferAccelerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutProjectTransferAccelerationResponse
     */
    public PutProjectTransferAccelerationResponse putProjectTransferAccelerationWithOptions(String project, PutProjectTransferAccelerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutProjectTransferAcceleration"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/transferacceleration"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutProjectTransferAccelerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables transfer acceleration.</p>
     * 
     * @param request PutProjectTransferAccelerationRequest
     * @return PutProjectTransferAccelerationResponse
     */
    public PutProjectTransferAccelerationResponse putProjectTransferAcceleration(String project, PutProjectTransferAccelerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putProjectTransferAccelerationWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call this operation to collect logs from web pages or clients.</li>
     * <li>If you use web tracking to collect logs and you do not call this operation, you can send only one log to Simple Log Service in a request. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>If you want to collect a large amount of log data, you can call this operation to send multiple logs to Simple Log Service in one request.</li>
     * <li>Before you can call this operation to send logs to a Logstore, you must enable web tracking for the Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>You cannot call this operation to send the logs of multiple topics to Simple Log Service at a time.</li>
     * <li>If you call this operation, anonymous users from the Internet are granted the write permissions on the Logstore. This may generate dirty data because AccessKey pair-based authentication is not performed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends multiple logs to Simple Log Service in one request.</p>
     * 
     * @param request PutWebtrackingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutWebtrackingResponse
     */
    public PutWebtrackingResponse putWebtrackingWithOptions(String project, String logstoreName, PutWebtrackingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logs)) {
            body.put("__logs__", request.logs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("__source__", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("__tags__", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("__topic__", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutWebtracking"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstoreName + "/track"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutWebtrackingResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>You can call this operation to collect logs from web pages or clients.</li>
     * <li>If you use web tracking to collect logs and you do not call this operation, you can send only one log to Simple Log Service in a request. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>If you want to collect a large amount of log data, you can call this operation to send multiple logs to Simple Log Service in one request.</li>
     * <li>Before you can call this operation to send logs to a Logstore, you must enable web tracking for the Logstore. For more information, see <a href="https://help.aliyun.com/document_detail/31752.html">Use web tracking to collect logs</a>.</li>
     * <li>You cannot call this operation to send the logs of multiple topics to Simple Log Service at a time.</li>
     * <li>If you call this operation, anonymous users from the Internet are granted the write permissions on the Logstore. This may generate dirty data because AccessKey pair-based authentication is not performed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends multiple logs to Simple Log Service in one request.</p>
     * 
     * @param request PutWebtrackingRequest
     * @return PutWebtrackingResponse
     */
    public PutWebtrackingResponse putWebtracking(String project, String logstoreName, PutWebtrackingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putWebtrackingWithOptions(project, logstoreName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>刷新token</p>
     * 
     * @param request RefreshTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshTokenResponse
     */
    public RefreshTokenResponse refreshTokenWithOptions(RefreshTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenExpirationTime)) {
            query.put("accessTokenExpirationTime", request.accessTokenExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshToken"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/token/refresh"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RefreshTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>刷新token</p>
     * 
     * @param request RefreshTokenRequest
     * @return RefreshTokenResponse
     */
    public RefreshTokenResponse refreshToken(RefreshTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Logtail configuration from a machine group.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveConfigFromMachineGroupResponse
     */
    public RemoveConfigFromMachineGroupResponse removeConfigFromMachineGroupWithOptions(String project, String machineGroup, String configName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveConfigFromMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + "/configs/" + configName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveConfigFromMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Logtail configuration from a machine group.</p>
     * @return RemoveConfigFromMachineGroupResponse
     */
    public RemoveConfigFromMachineGroupResponse removeConfigFromMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConfigFromMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the <code>[BeginKey,EndKey)</code> format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shard</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Splits a shard in the readwrite state.</p>
     * 
     * @param request SplitShardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SplitShardResponse
     */
    public SplitShardResponse splitShardWithOptions(String project, String logstore, String shard, SplitShardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardCount)) {
            query.put("shardCount", request.shardCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SplitShard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shards/" + shard + "?action=split"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SplitShardResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the <code>[BeginKey,EndKey)</code> format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shard</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Splits a shard in the readwrite state.</p>
     * 
     * @param request SplitShardRequest
     * @return SplitShardResponse
     */
    public SplitShardResponse splitShard(String project, String logstore, String shard, SplitShardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.splitShardWithOptions(project, logstore, shard, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动Azure blob文件导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAzureBlobIngestionResponse
     */
    public StartAzureBlobIngestionResponse startAzureBlobIngestionWithOptions(String project, String azureBlobIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions/" + azureBlobIngestionName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动Azure blob文件导入任务</p>
     * @return StartAzureBlobIngestionResponse
     */
    public StartAzureBlobIngestionResponse startAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data transformation job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartETLResponse
     */
    public StartETLResponse startETLWithOptions(String project, String etlName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls/" + etlName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data transformation job.</p>
     * @return StartETLResponse
     */
    public StartETLResponse startETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动ES导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartElasticsearchIngestionResponse
     */
    public StartElasticsearchIngestionResponse startElasticsearchIngestionWithOptions(String project, String elasticsearchIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions/" + elasticsearchIngestionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动ES导入任务</p>
     * @return StartElasticsearchIngestionResponse
     */
    public StartElasticsearchIngestionResponse startElasticsearchIngestion(String project, String elasticsearchIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startElasticsearchIngestionWithOptions(project, elasticsearchIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts a MaxCompute data shipping job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMaxComputeExportResponse
     */
    public StartMaxComputeExportResponse startMaxComputeExportWithOptions(String project, String mcExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports/" + mcExportName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts a MaxCompute data shipping job.</p>
     * @return StartMaxComputeExportResponse
     */
    public StartMaxComputeExportResponse startMaxComputeExport(String project, String mcExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startMaxComputeExportWithOptions(project, mcExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动OSS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOSSExportResponse
     */
    public StartOSSExportResponse startOSSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports/" + ossExportName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动OSS投递任务</p>
     * @return StartOSSExportResponse
     */
    public StartOSSExportResponse startOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动OSSHDFS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOSSHDFSExportResponse
     */
    public StartOSSHDFSExportResponse startOSSHDFSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports/" + ossExportName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动OSSHDFS投递任务</p>
     * @return StartOSSHDFSExportResponse
     */
    public StartOSSHDFSExportResponse startOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an Object Storage Service (OSS) data import job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartOSSIngestionResponse
     */
    public StartOSSIngestionResponse startOSSIngestionWithOptions(String project, String ossIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions/" + ossIngestionName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an Object Storage Service (OSS) data import job.</p>
     * @return StartOSSIngestionResponse
     */
    public StartOSSIngestionResponse startOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动Azure blob文件导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAzureBlobIngestionResponse
     */
    public StopAzureBlobIngestionResponse stopAzureBlobIngestionWithOptions(String project, String azureBlobIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions/" + azureBlobIngestionName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动Azure blob文件导入任务</p>
     * @return StopAzureBlobIngestionResponse
     */
    public StopAzureBlobIngestionResponse stopAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data transformation job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopETLResponse
     */
    public StopETLResponse stopETLWithOptions(String project, String etlName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls/" + etlName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a data transformation job.</p>
     * @return StopETLResponse
     */
    public StopETLResponse stopETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止ES导入任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopElasticsearchIngestionResponse
     */
    public StopElasticsearchIngestionResponse stopElasticsearchIngestionWithOptions(String project, String elasticsearchIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestion/" + elasticsearchIngestionName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止ES导入任务</p>
     * @return StopElasticsearchIngestionResponse
     */
    public StopElasticsearchIngestionResponse stopElasticsearchIngestion(String project, String elasticsearchIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopElasticsearchIngestionWithOptions(project, elasticsearchIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a MaxCompute data shipping job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMaxComputeExportResponse
     */
    public StopMaxComputeExportResponse stopMaxComputeExportWithOptions(String project, String mcExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports/" + mcExportName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops a MaxCompute data shipping job.</p>
     * @return StopMaxComputeExportResponse
     */
    public StopMaxComputeExportResponse stopMaxComputeExport(String project, String mcExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMaxComputeExportWithOptions(project, mcExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止OSS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOSSExportResponse
     */
    public StopOSSExportResponse stopOSSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports/" + ossExportName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止OSS投递任务</p>
     * @return StopOSSExportResponse
     */
    public StopOSSExportResponse stopOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止OSSHDFS投递任务</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOSSHDFSExportResponse
     */
    public StopOSSHDFSExportResponse stopOSSHDFSExportWithOptions(String project, String ossExportName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports/" + ossExportName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止OSSHDFS投递任务</p>
     * @return StopOSSHDFSExportResponse
     */
    public StopOSSHDFSExportResponse stopOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an Object Storage Service (OSS) data import job.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopOSSIngestionResponse
     */
    public StopOSSIngestionResponse stopOSSIngestionWithOptions(String project, String ossIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions/" + ossIngestionName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an Object Storage Service (OSS) data import job.</p>
     * @return StopOSSIngestionResponse
     */
    public StopOSSIngestionResponse stopOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步SQL请求</p>
     * 
     * @param request SubmitAsyncSqlRequest
     * @param headers SubmitAsyncSqlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAsyncSqlResponse
     */
    public SubmitAsyncSqlResponse submitAsyncSqlWithOptions(String project, SubmitAsyncSqlRequest request, SubmitAsyncSqlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accept)) {
            realHeaders.put("Accept", com.aliyun.teautil.Common.toJSONString(headers.accept));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.acceptEncoding)) {
            realHeaders.put("Accept-Encoding", com.aliyun.teautil.Common.toJSONString(headers.acceptEncoding));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAsyncSql"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/asyncsql"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "none"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SubmitAsyncSqlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交异步SQL请求</p>
     * 
     * @param request SubmitAsyncSqlRequest
     * @return SubmitAsyncSqlResponse
     */
    public SubmitAsyncSqlResponse submitAsyncSql(String project, SubmitAsyncSqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubmitAsyncSqlHeaders headers = new SubmitAsyncSqlHeaders();
        return this.submitAsyncSqlWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:TagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags to a resource. You can add tags only to projects.</p>
     * 
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:TagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Creates and adds tags to a resource. You can add tags only to projects.</p>
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UntagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Detaches one or more tags from a resource. You can detach tags only from Simple Log Service projects. You can detach multiple or all tags from a Simple Log Service project at a time.</p>
     * 
     * @param request UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("all", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("resourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("resourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/untag"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> For more information, see <a href="https://help.aliyun.com/document_detail/29049.html">Authorization rules</a>. The following types of resources are supported: project, Logstore, dashboard, machine group, and Logtail configuration.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UntagResources</code></td>
     * <td align="left">The resource format varies based on the resource type.\-<code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logstore/${logstoreName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/dashboard/${dashboardName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/machinegroup/${machineGroupName}</code>\-<code>acs:log:${regionName}:${accountId}:project/${projectName}/logtailconfig/${logtailConfigName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Detaches one or more tags from a resource. You can detach tags only from Simple Log Service projects. You can detach multiple or all tags from a Simple Log Service project at a time.</p>
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
     * <b>summary</b> : 
     * <p>UpdateAgentInstanceConfig</p>
     * 
     * @param tmpReq UpdateAgentInstanceConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentInstanceConfigResponse
     */
    public UpdateAgentInstanceConfigResponse updateAgentInstanceConfigWithOptions(String configType, UpdateAgentInstanceConfigRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentInstanceConfigShrinkRequest request = new UpdateAgentInstanceConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "attributes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributesShrink)) {
            query.put("attributes", request.attributesShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayConfigs)) {
            body.put("grayConfigs", request.grayConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentInstanceConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/agentinstanceconfigs/" + configType + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAgentInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>UpdateAgentInstanceConfig</p>
     * 
     * @param request UpdateAgentInstanceConfigRequest
     * @return UpdateAgentInstanceConfigResponse
     */
    public UpdateAgentInstanceConfigResponse updateAgentInstanceConfig(String configType, UpdateAgentInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentInstanceConfigWithOptions(configType, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an alert rule.</p>
     * 
     * @param request UpdateAlertRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlertResponse
     */
    public UpdateAlertResponse updateAlertWithOptions(String project, String alertName, UpdateAlertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAlert"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/alerts/" + alertName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAlertResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an alert rule.</p>
     * 
     * @param request UpdateAlertRequest
     * @return UpdateAlertResponse
     */
    public UpdateAlertResponse updateAlert(String project, String alertName, UpdateAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlertWithOptions(project, alertName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a dataset.</p>
     * 
     * @param request UpdateAnnotationDataSetRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAnnotationDataSetResponse
     */
    public UpdateAnnotationDataSetResponse updateAnnotationDataSetWithOptions(String datasetId, UpdateAnnotationDataSetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAnnotationDataSet"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationdataset/" + datasetId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAnnotationDataSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a dataset.</p>
     * 
     * @param request UpdateAnnotationDataSetRequest
     * @return UpdateAnnotationDataSetResponse
     */
    public UpdateAnnotationDataSetResponse updateAnnotationDataSet(String datasetId, UpdateAnnotationDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAnnotationDataSetWithOptions(datasetId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can update only the names of the tags in a tag set.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tag table.</p>
     * 
     * @param request UpdateAnnotationLabelRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAnnotationLabelResponse
     */
    public UpdateAnnotationLabelResponse updateAnnotationLabelWithOptions(UpdateAnnotationLabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAnnotationLabel"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/annotationlabel"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAnnotationLabelResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can update only the names of the tags in a tag set.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a tag table.</p>
     * 
     * @param request UpdateAnnotationLabelRequest
     * @return UpdateAnnotationLabelResponse
     */
    public UpdateAnnotationLabelResponse updateAnnotationLabel(UpdateAnnotationLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAnnotationLabelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Azure blob文件导入任务</p>
     * 
     * @param request UpdateAzureBlobIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAzureBlobIngestionResponse
     */
    public UpdateAzureBlobIngestionResponse updateAzureBlobIngestionWithOptions(String project, String azureBlobIngestionName, UpdateAzureBlobIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAzureBlobIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/azureblobingestions/" + azureBlobIngestionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateAzureBlobIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Azure blob文件导入任务</p>
     * 
     * @param request UpdateAzureBlobIngestionRequest
     * @return UpdateAzureBlobIngestionResponse
     */
    public UpdateAzureBlobIngestionResponse updateAzureBlobIngestion(String project, String azureBlobIngestionName, UpdateAzureBlobIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAzureBlobIngestionWithOptions(project, azureBlobIngestionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>After you update a Logtail configuration that is applied to a machine group, the new configuration immediately takes effect.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Logtail configuration.</p>
     * 
     * @param request UpdateConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfigWithOptions(String project, String configName, UpdateConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/configs/" + configName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>After you update a Logtail configuration that is applied to a machine group, the new configuration immediately takes effect.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>The Logtail configuration is planned out. For more information, see <a href="https://help.aliyun.com/document_detail/29058.html">Logtail configurations</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies a Logtail configuration.</p>
     * 
     * @param request UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    public UpdateConfigResponse updateConfig(String project, String configName, UpdateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigWithOptions(project, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a consumer group.</p>
     * 
     * @param request UpdateConsumerGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(String project, String logstore, String consumerGroup, UpdateConsumerGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConsumerGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/consumergroups/" + consumerGroup + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateConsumerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateConsumerGroup</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#logstoreName}/consumergroup/{#ConsumerGroup}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a consumer group.</p>
     * 
     * @param request UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    public UpdateConsumerGroupResponse updateConsumerGroup(String project, String logstore, String consumerGroup, UpdateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumerGroupWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a dashboard.</p>
     * 
     * @param request UpdateDashboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDashboardResponse
     */
    public UpdateDashboardResponse updateDashboardWithOptions(String project, String dashboardName, UpdateDashboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attribute)) {
            body.put("attribute", request.attribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.charts)) {
            body.put("charts", request.charts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardName)) {
            body.put("dashboardName", request.dashboardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDashboard"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dashboards/" + dashboardName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDashboardResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a dashboard.</p>
     * 
     * @param request UpdateDashboardRequest
     * @return UpdateDashboardResponse
     */
    public UpdateDashboardResponse updateDashboard(String project, String dashboardName, UpdateDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDashboardWithOptions(project, dashboardName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data transformation job.</p>
     * 
     * @param request UpdateETLRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateETLResponse
     */
    public UpdateETLResponse updateETLWithOptions(String project, String etlName, UpdateETLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateETL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/etls/" + etlName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateETLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a data transformation job.</p>
     * 
     * @param request UpdateETLRequest
     * @return UpdateETLResponse
     */
    public UpdateETLResponse updateETL(String project, String etlName, UpdateETLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateETLWithOptions(project, etlName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新ES导入任务</p>
     * 
     * @param request UpdateElasticsearchIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateElasticsearchIngestionResponse
     */
    public UpdateElasticsearchIngestionResponse updateElasticsearchIngestionWithOptions(String project, String elasticsearchIngestionName, UpdateElasticsearchIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateElasticsearchIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/elasticsearchingestions/" + elasticsearchIngestionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateElasticsearchIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新ES导入任务</p>
     * 
     * @param request UpdateElasticsearchIngestionRequest
     * @return UpdateElasticsearchIngestionResponse
     */
    public UpdateElasticsearchIngestionResponse updateElasticsearchIngestion(String project, String elasticsearchIngestionName, UpdateElasticsearchIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateElasticsearchIngestionWithOptions(project, elasticsearchIngestionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the indexes of a Logstore.</p>
     * 
     * @param request UpdateIndexRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIndexResponse
     */
    public UpdateIndexResponse updateIndexWithOptions(String project, String logstore, UpdateIndexRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIndex"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/index"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateIndexResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the indexes of a Logstore.</p>
     * 
     * @param request UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    public UpdateIndexResponse updateIndex(String project, String logstore, UpdateIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIndexWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a Logstore.</p>
     * 
     * @param request UpdateLogStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogStoreResponse
     */
    public UpdateLogStoreResponse updateLogStoreWithOptions(String project, String logstore, UpdateLogStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendMeta)) {
            body.put("appendMeta", request.appendMeta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSplit)) {
            body.put("autoSplit", request.autoSplit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTracking)) {
            body.put("enable_tracking", request.enableTracking);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptConf)) {
            body.put("encrypt_conf", request.encryptConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTtl)) {
            body.put("hot_ttl", request.hotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrequentAccessTTL)) {
            body.put("infrequentAccessTTL", request.infrequentAccessTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstoreName)) {
            body.put("logstoreName", request.logstoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSplitShard)) {
            body.put("maxSplitShard", request.maxSplitShard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardCount)) {
            body.put("shardCount", request.shardCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingPolicy)) {
            body.put("shardingPolicy", request.shardingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.telemetryType)) {
            body.put("telemetryType", request.telemetryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLogStoreResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</li>
     * <li>You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a Logstore.</p>
     * 
     * @param request UpdateLogStoreRequest
     * @return UpdateLogStoreResponse
     */
    public UpdateLogStoreResponse updateLogStore(String project, String logstore, UpdateLogStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogStoreWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>If you specify a data encryption method when you configure data encryption settings, you cannot switch to the other method after the configuration. In addition, you cannot change the encryption algorithm or the encryption type. You can only enable or disable the encryption feature by using the enable parameter. If you specify the encryption method by using the service key of Simple Log Service when you configure data encryption settings, you cannot switch to the encryption method by using Bring Your Own Key (BYOK) keys after the configuration.</p>
     * <h2><a href="#"></a>Create encryption configurations</h2>
     * <h3><a href="#"></a>Encryption by using service keys</h3>
     * <p>Simple Log Service is fully responsible for data encryption and key management. No additional operations are required. When you create encryption configurations for the Logstore, you must specify the enable and encryptType parameters.</p>
     * <h3><a href="#byok"></a>Encryption by using BYOK keys</h3>
     * <p>You must create a customer master key (CMK) in Key Management Service (KMS). Then, Simple Log Service encrypts logs by using the CMK. When you create encryption configurations for the Logstore, you must specify the enable, encryptType, and userCmkInfo parameters.</p>
     * <h2><a href="#"></a>Enable or disable the encryption feature</h2>
     * <p>After you create encryption configurations for the Logstore, you cannot modify the encryptType or userCmkInfo parameters. However, you can enable and disable the encryption feature by using the enable parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption configuration of a Logstore. You can create encryption configurations for the Logstore and enable or disable the encryption feature.</p>
     * 
     * @param request UpdateLogStoreEncryptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogStoreEncryptionResponse
     */
    public UpdateLogStoreEncryptionResponse updateLogStoreEncryptionWithOptions(String project, String logstore, UpdateLogStoreEncryptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptType)) {
            body.put("encryptType", request.encryptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCmkInfo)) {
            body.put("userCmkInfo", request.userCmkInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogStoreEncryption"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/encryption"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLogStoreEncryptionResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Limits</h2>
     * <p>If you specify a data encryption method when you configure data encryption settings, you cannot switch to the other method after the configuration. In addition, you cannot change the encryption algorithm or the encryption type. You can only enable or disable the encryption feature by using the enable parameter. If you specify the encryption method by using the service key of Simple Log Service when you configure data encryption settings, you cannot switch to the encryption method by using Bring Your Own Key (BYOK) keys after the configuration.</p>
     * <h2><a href="#"></a>Create encryption configurations</h2>
     * <h3><a href="#"></a>Encryption by using service keys</h3>
     * <p>Simple Log Service is fully responsible for data encryption and key management. No additional operations are required. When you create encryption configurations for the Logstore, you must specify the enable and encryptType parameters.</p>
     * <h3><a href="#byok"></a>Encryption by using BYOK keys</h3>
     * <p>You must create a customer master key (CMK) in Key Management Service (KMS). Then, Simple Log Service encrypts logs by using the CMK. When you create encryption configurations for the Logstore, you must specify the enable, encryptType, and userCmkInfo parameters.</p>
     * <h2><a href="#"></a>Enable or disable the encryption feature</h2>
     * <p>After you create encryption configurations for the Logstore, you cannot modify the encryptType or userCmkInfo parameters. However, you can enable and disable the encryption feature by using the enable parameter.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the encryption configuration of a Logstore. You can create encryption configurations for the Logstore and enable or disable the encryption feature.</p>
     * 
     * @param request UpdateLogStoreEncryptionRequest
     * @return UpdateLogStoreEncryptionResponse
     */
    public UpdateLogStoreEncryptionResponse updateLogStoreEncryption(String project, String logstore, UpdateLogStoreEncryptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogStoreEncryptionWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the billing mode of a Logstore.</p>
     * 
     * @param request UpdateLogStoreMeteringModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogStoreMeteringModeResponse
     */
    public UpdateLogStoreMeteringModeResponse updateLogStoreMeteringModeWithOptions(String project, String logstore, UpdateLogStoreMeteringModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meteringMode)) {
            body.put("meteringMode", request.meteringMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogStoreMeteringMode"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/meteringmode"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLogStoreMeteringModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the billing mode of a Logstore.</p>
     * 
     * @param request UpdateLogStoreMeteringModeRequest
     * @return UpdateLogStoreMeteringModeResponse
     */
    public UpdateLogStoreMeteringModeResponse updateLogStoreMeteringMode(String project, String logstore, UpdateLogStoreMeteringModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogStoreMeteringModeWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the ingest processor that is associated with a Logstore.</p>
     * 
     * @param request UpdateLogStoreProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogStoreProcessorResponse
     */
    public UpdateLogStoreProcessorResponse updateLogStoreProcessorWithOptions(String project, String logstore, UpdateLogStoreProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processorName)) {
            body.put("processorName", request.processorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogStoreProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/processor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLogStoreProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the ingest processor that is associated with a Logstore.</p>
     * 
     * @param request UpdateLogStoreProcessorRequest
     * @return UpdateLogStoreProcessorResponse
     */
    public UpdateLogStoreProcessorResponse updateLogStoreProcessor(String project, String logstore, UpdateLogStoreProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogStoreProcessorWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the service log configurations of a project.</p>
     * 
     * @param request UpdateLoggingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoggingResponse
     */
    public UpdateLoggingResponse updateLoggingWithOptions(String project, UpdateLoggingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loggingDetails)) {
            body.put("loggingDetails", request.loggingDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loggingProject)) {
            body.put("loggingProject", request.loggingProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogging"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logging"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLoggingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the service log configurations of a project.</p>
     * 
     * @param request UpdateLoggingRequest
     * @return UpdateLoggingResponse
     */
    public UpdateLoggingResponse updateLogging(String project, UpdateLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoggingWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a Logtail pipeline configuration.</p>
     * 
     * @param request UpdateLogtailPipelineConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLogtailPipelineConfigResponse
     */
    public UpdateLogtailPipelineConfigResponse updateLogtailPipelineConfigWithOptions(String project, String configName, UpdateLogtailPipelineConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregators)) {
            body.put("aggregators", request.aggregators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            body.put("configName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flushers)) {
            body.put("flushers", request.flushers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.global)) {
            body.put("global", request.global);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputs)) {
            body.put("inputs", request.inputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSample)) {
            body.put("logSample", request.logSample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processors)) {
            body.put("processors", request.processors);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            body.put("task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLogtailPipelineConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pipelineconfigs/" + configName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLogtailPipelineConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The UK (London) region is supported. Supported regions are constantly updated.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a Logtail pipeline configuration.</p>
     * 
     * @param request UpdateLogtailPipelineConfigRequest
     * @return UpdateLogtailPipelineConfigResponse
     */
    public UpdateLogtailPipelineConfigResponse updateLogtailPipelineConfig(String project, String configName, UpdateLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogtailPipelineConfigWithOptions(project, configName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a machine group.</p>
     * 
     * @param request UpdateMachineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMachineGroupResponse
     */
    public UpdateMachineGroupResponse updateMachineGroupWithOptions(String project, String groupName, UpdateMachineGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupAttribute)) {
            body.put("groupAttribute", request.groupAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            body.put("groupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineIdentifyType)) {
            body.put("machineIdentifyType", request.machineIdentifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineList)) {
            body.put("machineList", request.machineList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMachineGroup"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + groupName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMachineGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration of a machine group.</p>
     * 
     * @param request UpdateMachineGroupRequest
     * @return UpdateMachineGroupResponse
     */
    public UpdateMachineGroupResponse updateMachineGroup(String project, String groupName, UpdateMachineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMachineGroupWithOptions(project, groupName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the machines in a machine group. You can add machine to or remove machines from the machine group.</p>
     * 
     * @param request UpdateMachineGroupMachineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMachineGroupMachineResponse
     */
    public UpdateMachineGroupMachineResponse updateMachineGroupMachineWithOptions(String project, String machineGroup, UpdateMachineGroupMachineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            query.put("action", request.action);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMachineGroupMachine"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/machinegroups/" + machineGroup + "/machines"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMachineGroupMachineResponse());
    }

    /**
     * <b>description</b> :
     * <p>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the machines in a machine group. You can add machine to or remove machines from the machine group.</p>
     * 
     * @param request UpdateMachineGroupMachineRequest
     * @return UpdateMachineGroupMachineResponse
     */
    public UpdateMachineGroupMachineResponse updateMachineGroupMachine(String project, String machineGroup, UpdateMachineGroupMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMachineGroupMachineWithOptions(project, machineGroup, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新物化视图</p>
     * 
     * @param request UpdateMaterializedViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMaterializedViewResponse
     */
    public UpdateMaterializedViewResponse updateMaterializedViewWithOptions(String project, String name, UpdateMaterializedViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggIntervalMins)) {
            body.put("aggIntervalMins", request.aggIntervalMins);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalSql)) {
            body.put("originalSql", request.originalSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMaterializedView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/materializedviews/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新物化视图</p>
     * 
     * @param request UpdateMaterializedViewRequest
     * @return UpdateMaterializedViewResponse
     */
    public UpdateMaterializedViewResponse updateMaterializedView(String project, String name, UpdateMaterializedViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMaterializedViewWithOptions(project, name, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a MaxCompute data shipping job.</p>
     * 
     * @param request UpdateMaxComputeExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMaxComputeExportResponse
     */
    public UpdateMaxComputeExportResponse updateMaxComputeExportWithOptions(String project, String mcExportName, UpdateMaxComputeExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMaxComputeExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/maxcomputeexports/" + mcExportName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMaxComputeExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</p>
     * <ul>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a MaxCompute data shipping job.</p>
     * 
     * @param request UpdateMaxComputeExportRequest
     * @return UpdateMaxComputeExportResponse
     */
    public UpdateMaxComputeExportResponse updateMaxComputeExport(String project, String mcExportName, UpdateMaxComputeExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMaxComputeExportWithOptions(project, mcExportName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of an existing Metricstore. Metricstores are used to store metric data.</p>
     * 
     * @param request UpdateMetricStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricStoreResponse
     */
    public UpdateMetricStoreResponse updateMetricStoreWithOptions(String project, String name, UpdateMetricStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendMeta)) {
            body.put("appendMeta", request.appendMeta);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoSplit)) {
            body.put("autoSplit", request.autoSplit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotTtl)) {
            body.put("hot_ttl", request.hotTtl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infrequentAccessTTL)) {
            body.put("infrequentAccessTTL", request.infrequentAccessTTL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSplitShard)) {
            body.put("maxSplitShard", request.maxSplitShard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shardingPolicy)) {
            body.put("shardingPolicy", request.shardingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("ttl", request.ttl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetricStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMetricStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Metricstores are used to store metric data. For more information, see <a href="https://help.aliyun.com/document_detail/174965.html">Metric data</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query metric data is obtained. The information includes the name of the project to which the metric data belong and the region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create up to 200 Logstores or Metricstores in a project.</li>
     * <li>Metric data is automatically deleted when the retention period of the metric data ends.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of an existing Metricstore. Metricstores are used to store metric data.</p>
     * 
     * @param request UpdateMetricStoreRequest
     * @return UpdateMetricStoreResponse
     */
    public UpdateMetricStoreResponse updateMetricStore(String project, String name, UpdateMetricStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetricStoreWithOptions(project, name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MetricStore 计量模式</p>
     * 
     * @param request UpdateMetricStoreMeteringModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricStoreMeteringModeResponse
     */
    public UpdateMetricStoreMeteringModeResponse updateMetricStoreMeteringModeWithOptions(String project, String metricStore, UpdateMetricStoreMeteringModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.meteringMode)) {
            body.put("meteringMode", request.meteringMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetricStoreMeteringMode"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + metricStore + "/meteringmode"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMetricStoreMeteringModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MetricStore 计量模式</p>
     * 
     * @param request UpdateMetricStoreMeteringModeRequest
     * @return UpdateMetricStoreMeteringModeResponse
     */
    public UpdateMetricStoreMeteringModeResponse updateMetricStoreMeteringMode(String project, String metricStore, UpdateMetricStoreMeteringModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetricStoreMeteringModeWithOptions(project, metricStore, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the ingest processor that is associated with a Metricstore.</p>
     * 
     * @param request UpdateMetricStoreProcessorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMetricStoreProcessorResponse
     */
    public UpdateMetricStoreProcessorResponse updateMetricStoreProcessorWithOptions(String project, String metricstore, UpdateMetricStoreProcessorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.processorName)) {
            body.put("processorName", request.processorName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetricStoreProcessor"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/metricstores/" + metricstore + "/processor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMetricStoreProcessorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the ingest processor that is associated with a Metricstore.</p>
     * 
     * @param request UpdateMetricStoreProcessorRequest
     * @return UpdateMetricStoreProcessorResponse
     */
    public UpdateMetricStoreProcessorResponse updateMetricStoreProcessor(String project, String metricstore, UpdateMetricStoreProcessorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetricStoreProcessorWithOptions(project, metricstore, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新OSS投递任务</p>
     * 
     * @param request UpdateOSSExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOSSExportResponse
     */
    public UpdateOSSExportResponse updateOSSExportWithOptions(String project, String ossExportName, UpdateOSSExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOSSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossexports/" + ossExportName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateOSSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新OSS投递任务</p>
     * 
     * @param request UpdateOSSExportRequest
     * @return UpdateOSSExportResponse
     */
    public UpdateOSSExportResponse updateOSSExport(String project, String ossExportName, UpdateOSSExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOSSExportWithOptions(project, ossExportName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新OSSHDFS投递任务</p>
     * 
     * @param request UpdateOSSHDFSExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOSSHDFSExportResponse
     */
    public UpdateOSSHDFSExportResponse updateOSSHDFSExportWithOptions(String project, String ossExportName, UpdateOSSHDFSExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOSSHDFSExport"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/osshdfsexports/" + ossExportName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateOSSHDFSExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新OSSHDFS投递任务</p>
     * 
     * @param request UpdateOSSHDFSExportRequest
     * @return UpdateOSSHDFSExportResponse
     */
    public UpdateOSSHDFSExportResponse updateOSSHDFSExport(String project, String ossExportName, UpdateOSSHDFSExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOSSHDFSExportWithOptions(project, ossExportName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an Object Storage Service (OSS) data import job.</p>
     * 
     * @param request UpdateOSSIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOSSIngestionResponse
     */
    public UpdateOSSIngestionResponse updateOSSIngestionWithOptions(String project, String ossIngestionName, UpdateOSSIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOSSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ossingestions/" + ossIngestionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateOSSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an Object Storage Service (OSS) data import job.</p>
     * 
     * @param request UpdateOSSIngestionRequest
     * @return UpdateOSSIngestionResponse
     */
    public UpdateOSSIngestionResponse updateOSSIngestion(String project, String ossIngestionName, UpdateOSSIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOSSIngestionWithOptions(project, ossIngestionName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates a project.</p>
     * 
     * @param request UpdateProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(String project, UpdateProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recycleBinEnabled)) {
            body.put("recycleBinEnabled", request.recycleBinEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates a project.</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(String project, UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProjectWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates a saved search.</p>
     * 
     * @param request UpdateSavedSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSavedSearchResponse
     */
    public UpdateSavedSearchResponse updateSavedSearchWithOptions(String project, String savedsearchName, UpdateSavedSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logstore)) {
            body.put("logstore", request.logstore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.savedsearchName)) {
            body.put("savedsearchName", request.savedsearchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchQuery)) {
            body.put("searchQuery", request.searchQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSavedSearch"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/savedsearches/" + savedsearchName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSavedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.</li>
     * <li>An AccessKey pair is created and obtained. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and authorize the RAM user to access Simple Log Service</a>.</li>
     * <li>The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Limits are imposed when you use Simple Log Service to query logs. We recommend that you specify query statements and query time ranges based on the limits. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log search overview</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis overview</a>.</li>
     * </ul>
     * <h3>Authentication resources</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateSavedSearch</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/savedsearch/{#SavedSearchName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates a saved search.</p>
     * 
     * @param request UpdateSavedSearchRequest
     * @return UpdateSavedSearchResponse
     */
    public UpdateSavedSearchResponse updateSavedSearch(String project, String savedsearchName, UpdateSavedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSavedSearchWithOptions(project, savedsearchName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Scheduled SQL job.</p>
     * 
     * @param request UpdateScheduledSQLRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledSQLResponse
     */
    public UpdateScheduledSQLResponse updateScheduledSQLWithOptions(String project, String scheduledSQLName, UpdateScheduledSQLRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configuration)) {
            body.put("configuration", request.configuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedule)) {
            body.put("schedule", request.schedule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledSQL"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scheduledsqls/" + scheduledSQLName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateScheduledSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Scheduled SQL job.</p>
     * 
     * @param request UpdateScheduledSQLRequest
     * @return UpdateScheduledSQLResponse
     */
    public UpdateScheduledSQLResponse updateScheduledSQL(String project, String scheduledSQLName, UpdateScheduledSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateScheduledSQLWithOptions(project, scheduledSQLName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of the Dedicated SQL feature.</p>
     * 
     * @param request UpdateSqlInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSqlInstanceResponse
     */
    public UpdateSqlInstanceResponse updateSqlInstanceWithOptions(String project, UpdateSqlInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cu)) {
            body.put("cu", request.cu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useAsDefault)) {
            body.put("useAsDefault", request.useAsDefault);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSqlInstance"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/sqlinstance"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSqlInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of the Dedicated SQL feature.</p>
     * 
     * @param request UpdateSqlInstanceRequest
     * @return UpdateSqlInstanceResponse
     */
    public UpdateSqlInstanceResponse updateSqlInstance(String project, UpdateSqlInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSqlInstanceWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a dataset.</p>
     * 
     * @param request UpdateStoreViewRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStoreViewResponse
     */
    public UpdateStoreViewResponse updateStoreViewWithOptions(String project, String name, UpdateStoreViewRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stores)) {
            body.put("stores", request.stores);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStoreView"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/storeviews/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateStoreViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configurations of a dataset.</p>
     * 
     * @param request UpdateStoreViewRequest
     * @return UpdateStoreViewResponse
     */
    public UpdateStoreViewResponse updateStoreView(String project, String name, UpdateStoreViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStoreViewWithOptions(project, name, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a log collection policy for a cloud service. This way, logs can be automatically collected from the service.</p>
     * 
     * @param request UpsertCollectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertCollectionPolicyResponse
     */
    public UpsertCollectionPolicyResponse upsertCollectionPolicyWithOptions(UpsertCollectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.centralizeConfig)) {
            body.put("centralizeConfig", request.centralizeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.centralizeEnabled)) {
            body.put("centralizeEnabled", request.centralizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            body.put("dataCode", request.dataCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataConfig)) {
            body.put("dataConfig", request.dataConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyConfig)) {
            body.put("policyConfig", request.policyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("productCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDirectory)) {
            body.put("resourceDirectory", request.resourceDirectory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertCollectionPolicy"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/collectionpolicy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpsertCollectionPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must use the Simple Log Service endpoint for the China (Shanghai) or Singapore region to call the operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a log collection policy for a cloud service. This way, logs can be automatically collected from the service.</p>
     * 
     * @param request UpsertCollectionPolicyRequest
     * @return UpsertCollectionPolicyResponse
     */
    public UpsertCollectionPolicyResponse upsertCollectionPolicy(UpsertCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upsertCollectionPolicyWithOptions(request, headers, runtime);
    }
}

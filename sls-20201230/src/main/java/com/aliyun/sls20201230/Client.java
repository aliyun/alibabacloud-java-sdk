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
     * <ul>
     * <li>The Host consists of the project name and the Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account provides full access to all API operations. This poses a security risk. For security reasons, we recommend that you create and use a RAM user for API access or routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>Create a Logtail configuration and obtain its name. For more information, see <a href="https://help.aliyun.com/document_detail/29042.html">CreateConfig</a>.</li>
     * <li>Create a machine group and obtain its name. For more information, see <a href="https://help.aliyun.com/document_detail/29032.html">CreateMachineGroup</a>.</li>
     * </ul>
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
     * <ul>
     * <li>The Host consists of the project name and the Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account provides full access to all API operations. This poses a security risk. For security reasons, we recommend that you create and use a RAM user for API access or routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>Create a Logtail configuration and obtain its name. For more information, see <a href="https://help.aliyun.com/document_detail/29042.html">CreateConfig</a>.</li>
     * <li>Create a machine group and obtain its name. For more information, see <a href="https://help.aliyun.com/document_detail/29032.html">CreateMachineGroup</a>.</li>
     * </ul>
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
     * <p>Calls observable AI tools. The capabilities of these tools are continuously updated. You can call the tool list API to retrieve the currently supported capabilities.</p>
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
     * <p>Calls observable AI tools. The capabilities of these tools are continuously updated. You can call the tool list API to retrieve the currently supported capabilities.</p>
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
     * <h3>API description</h3>
     * <ul>
     * <li>The Host consists of a project name and a Simple Log Service Endpoint. You must specify the project in the Host.</li>
     * <li>A consumer sends heartbeats to the server at fixed intervals to maintain its connection. If the server does not receive a heartbeat from the consumer within a specified period, the consumer is deleted.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair of an Alibaba Cloud account has permissions for all API operations. This poses a high security threat. We recommend that you create and use a RAM user to call API operations or perform routine O\&amp;M. The RAM user must have permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, region, and Logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Obtain the consumer group name. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authorization information</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy to grant a RAM user or RAM role the permissions to call this API operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ConsumerGroupHeartBeat</code></td>
     * <td align="left"><code>acs:log:${regionId}:${accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/{#ConsumerGroupName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>A consumer sends a heartbeat to the server to maintain its active status.</p>
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
     * <h3>API description</h3>
     * <ul>
     * <li>The Host consists of a project name and a Simple Log Service Endpoint. You must specify the project in the Host.</li>
     * <li>A consumer sends heartbeats to the server at fixed intervals to maintain its connection. If the server does not receive a heartbeat from the consumer within a specified period, the consumer is deleted.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair of an Alibaba Cloud account has permissions for all API operations. This poses a high security threat. We recommend that you create and use a RAM user to call API operations or perform routine O\&amp;M. The RAM user must have permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, region, and Logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Obtain the consumer group name. For more information, see <a href="https://help.aliyun.com/document_detail/74964.html">ListConsumerGroup</a>.</li>
     * </ul>
     * <h3>Authorization information</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy to grant a RAM user or RAM role the permissions to call this API operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:ConsumerGroupHeartBeat</code></td>
     * <td align="left"><code>acs:log:${regionId}:${accountId}:project/{#ProjectName}/logstore/{#LogstoreName}/consumergroup/{#ConsumerGroupName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>A consumer sends a heartbeat to the server to maintain its active status.</p>
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
     * <p>Creates a process-level configuration.</p>
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
     * <p>Creates a process-level configuration.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an annotation label table.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an annotation label table.</p>
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
     * <p>Creates an Azure BLOB ingestion task.</p>
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
     * <p>Creates an Azure BLOB ingestion task.</p>
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
     * <p>Creates a log download task in a specified project.</p>
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
     * <p>Creates a log download task in a specified project.</p>
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
     * <p>Creates a data transformation job in a specified project.</p>
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
     * <p>Creates a data transformation job in a specified project.</p>
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
     * <p>Creates an ES or OpenSearch import job.</p>
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
     * <p>Creates an ES or OpenSearch import job.</p>
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
     * <b>summary</b> : 
     * <p>Creates an Ingestion to import files from Google Cloud Storage.</p>
     * 
     * @param request CreateGCSIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGCSIngestionResponse
     */
    public CreateGCSIngestionResponse createGCSIngestionWithOptions(String project, CreateGCSIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateGCSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateGCSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Ingestion to import files from Google Cloud Storage.</p>
     * 
     * @param request CreateGCSIngestionRequest
     * @return CreateGCSIngestionResponse
     */
    public CreateGCSIngestionResponse createGCSIngestion(String project, CreateGCSIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGCSIngestionWithOptions(project, request, headers, runtime);
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
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. Specify the project in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full access to all API operations, which poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name and the region where the project is located. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>Each project can contain a maximum of 200 Logstores.</li>
     * <li>Logs are deleted after the specified data retention period expires.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the permissions required for this operation. To grant a RAM user or RAM role the permissions to call this operation, add this information to the Action element of a RAM policy.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
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
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. Specify the project in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full access to all API operations, which poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user to call API operations or perform routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name and the region where the project is located. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>Each project can contain a maximum of 200 Logstores.</li>
     * <li>Logs are deleted after the specified data retention period expires.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the permissions required for this operation. To grant a RAM user or RAM role the permissions to call this operation, add this information to the Action element of a RAM policy.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>.</p>
     * <ul>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service Endpoint. The project name must be specified in the Host.</li>
     * <li>An AccessKey pair is required. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full permissions on all API operations. This poses a high security risk. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform operations and maintenance (O\&amp;M). If you use a RAM user, you must grant the RAM user the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>The name and region of the project are required. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>A project can contain a maximum of 200 Logstores or Metricstores.</li>
     * <li>Metrics are deleted after the specified data retention period ends.</li>
     * <li>A Logstore and a Metricstore in the same project cannot have the same name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Metricstore to store metrics.</p>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>.</p>
     * <ul>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service Endpoint. The project name must be specified in the Host.</li>
     * <li>An AccessKey pair is required. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full permissions on all API operations. This poses a high security risk. We recommend that you use a Resource Access Management (RAM) user to call API operations or perform operations and maintenance (O\&amp;M). If you use a RAM user, you must grant the RAM user the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>The name and region of the project are required. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>A project can contain a maximum of 200 Logstores or Metricstores.</li>
     * <li>Metrics are deleted after the specified data retention period ends.</li>
     * <li>A Logstore and a Metricstore in the same project cannot have the same name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Metricstore to store metrics.</p>
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
     * <p>Exports logs from a Logstore to an OSS bucket.</p>
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
     * <p>Exports logs from a Logstore to an OSS bucket.</p>
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
     * <p>Creates an export job from OSS to HDFS in a specified project.</p>
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
     * <p>Creates an export job from OSS to HDFS in a specified project.</p>
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
     * <p>Creates an OSS import task in a specified project.</p>
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
     * <p>Creates an OSS import task in a specified project.</p>
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
     * <b>description</b> :
     * <h3>接口说明</h3>
     * <ul>
     * <li>已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</li>
     * <li>Project名称在阿里云地域内全局唯一，创建后不可修改。</li>
     * <li>每个阿里云账号支持添加的project数量请参见<a href="https://help.aliyun.com/document_detail/86660.html">基础资源</a>。</li>
     * </ul>
     * <h3>鉴权资源</h3>
     * <p>下表列出了API对应的授权信息。您可以在RAM权限策略语句的Action元素中添加该信息，用于为RAM用户或RAM角色授予调用此API的权限。</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">动作（Action）</th>
     * <th align="left">授权策略中的资源描述方式（Resource）</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
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
     * <b>description</b> :
     * <h3>接口说明</h3>
     * <ul>
     * <li>已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</li>
     * <li>Project名称在阿里云地域内全局唯一，创建后不可修改。</li>
     * <li>每个阿里云账号支持添加的project数量请参见<a href="https://help.aliyun.com/document_detail/86660.html">基础资源</a>。</li>
     * </ul>
     * <h3>鉴权资源</h3>
     * <p>下表列出了API对应的授权信息。您可以在RAM权限策略语句的Action元素中添加该信息，用于为RAM用户或RAM角色授予调用此API的权限。</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">动作（Action）</th>
     * <th align="left">授权策略中的资源描述方式（Resource）</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:CreateProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
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
     * <p>Creates an S3 file import job.</p>
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
     * <p>Creates an S3 file import job.</p>
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
     * <p>Creates a scheduled SQL job in a specified project.</p>
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
     * <p>Creates a scheduled SQL job in a specified project.</p>
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
     * <p><em>Ensure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/223777.html">pricing</a> of Dedicated SQL before you use this operation.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>If you use Standard SQL to analyze a large volume of data, a single query may not be able to scan all logs within a specified time range, which can result in incomplete data. Adding shards improves read and write performance, but this change applies only to new data. To analyze a larger volume of data in a single query, you can enable Dedicated SQL and increase its compute resources.</p>
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
     * <p><em>Ensure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/223777.html">pricing</a> of Dedicated SQL before you use this operation.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>If you use Standard SQL to analyze a large volume of data, a single query may not be able to scan all logs within a specified time range, which can result in incomplete data. Adding shards improves read and write performance, but this change applies only to new data. To analyze a larger volume of data in a single query, you can enable Dedicated SQL and increase its compute resources.</p>
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
     * <p>Creates a dataset.</p>
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
     * <p>Creates a dataset.</p>
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
     * <p>Deletes a process configuration.</p>
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
     * <p>Deletes a process configuration.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes data from a dataset.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes data from a dataset.</p>
     * @return DeleteAnnotationDataResponse
     */
    public DeleteAnnotationDataResponse deleteAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset. You can delete a dataset only if it contains no data structures.</p>
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
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a dataset. You can delete a dataset only if it contains no data structures.</p>
     * @return DeleteAnnotationDataSetResponse
     */
    public DeleteAnnotationDataSetResponse deleteAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom annotation label.</p>
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
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom annotation label.</p>
     * @return DeleteAnnotationLabelResponse
     */
    public DeleteAnnotationLabelResponse deleteAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a file import task from Azure Blob</p>
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
     * <p>Create a file import task from Azure Blob</p>
     * @return DeleteAzureBlobIngestionResponse
     */
    public DeleteAzureBlobIngestionResponse deleteAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API can be called only from endpoints in the China (Shanghai), Singapore, and China (Heyuan) Automotive Compliance Cloud (cn-heyuan-acdr-1) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log collection rule for an Alibaba Cloud product.</p>
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
     * <p>This API can be called only from endpoints in the China (Shanghai), Singapore, and China (Heyuan) Automotive Compliance Cloud (cn-heyuan-acdr-1) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a log collection rule for an Alibaba Cloud product.</p>
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
     * <p>Deletes a consume processor.</p>
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
     * <p>Deletes a consume processor.</p>
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
     * <p>Deletes a download job.</p>
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
     * <p>Deletes a download job.</p>
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
     * <p>Deletes an ES/OpenSearch ingestion task.</p>
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
     * <p>Deletes an ES/OpenSearch ingestion task.</p>
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
     * <b>description</b> :
     * <p>The host must be specified as a combination of the project name and the Simple Log Service endpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the service log for a specified project.</p>
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
     * <b>description</b> :
     * <p>The host must be specified as a combination of the project name and the Simple Log Service endpoint.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the service log for a specified project.</p>
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
     * <p>Deletes a specified OSS data shipping job.</p>
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
     * <p>Deletes a specified OSS data shipping job.</p>
     * @return DeleteOSSExportResponse
     */
    public DeleteOSSExportResponse deleteOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an OSS-HDFS data shipping job.</p>
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
     * <p>Deletes an OSS-HDFS data shipping job.</p>
     * @return DeleteOSSHDFSExportResponse
     */
    public DeleteOSSHDFSExportResponse deleteOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an OSS import task.</p>
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
     * <p>Deletes an OSS import task.</p>
     * @return DeleteOSSIngestionResponse
     */
    public DeleteOSSIngestionResponse deleteOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li>The Host parameter consists of a project name and a Simple Log Service Endpoint. You must specify the project name in the Host parameter.</li>
     * <li>You must create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations, which poses a high security threat. We recommend that you use a RAM user to call API operations or perform O\&amp;M. The RAM user must have the permissions to operate on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>When you delete a project, all its log data and configurations are released and cannot be recovered. To prevent data loss, confirm the action before you delete the project.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table lists the authorization information for this API operation. To grant a RAM user or RAM role the permissions to call this API operation, add this information to the Action element of a RAM access policy statement.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified project.</p>
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
     * <h3>Description</h3>
     * <ul>
     * <li>The Host parameter consists of a project name and a Simple Log Service Endpoint. You must specify the project name in the Host parameter.</li>
     * <li>You must create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations, which poses a high security threat. We recommend that you use a RAM user to call API operations or perform O\&amp;M. The RAM user must have the permissions to operate on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>When you delete a project, all its log data and configurations are released and cannot be recovered. To prevent data loss, confirm the action before you delete the project.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table lists the authorization information for this API operation. To grant a RAM user or RAM role the permissions to call this API operation, add this information to the Action element of a RAM access policy statement.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:DeleteProject</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified project.</p>
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
     * <p>Deletes an S3 import task.</p>
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
     * <p>Deletes an S3 import task.</p>
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
     * <p>Returns a list of active regions.</p>
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
     * <p>Returns a list of active regions.</p>
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
     * <p>Retrieves a process-level configuration.</p>
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
     * <p>Retrieves a process-level configuration.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a data struct from a dataset by its unique identity.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a data struct from a dataset by its unique identity.</p>
     * @return GetAnnotationDataResponse
     */
    public GetAnnotationDataResponse getAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a dataset.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about a dataset.</p>
     * @return GetAnnotationDataSetResponse
     */
    public GetAnnotationDataSetResponse getAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a label table by its ID.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a label table by its ID.</p>
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
     * <b>description</b> :
     * <p>After you submit an SQL request using the SubmitAsyncSql operation, you can use this operation to poll the execution status of the request. You can set the polling interval to 1 second or longer. When the query is complete, use the GetAsyncSql operation to retrieve the results in pages.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status and results of an asynchronous SQL query.</p>
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
     * <b>description</b> :
     * <p>After you submit an SQL request using the SubmitAsyncSql operation, you can use this operation to poll the execution status of the request. You can set the polling interval to 1 second or longer. When the query is complete, use the GetAsyncSql operation to retrieve the results in pages.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status and results of an asynchronous SQL query.</p>
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
     * <p>Retrieves information about an Azure BLOB import task.</p>
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
     * <p>Retrieves information about an Azure BLOB import task.</p>
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
     * <p>The endpoint for this operation is available only in the China (Shanghai), Singapore, and China (Heyuan) Automotive Compliance Cloud (cn-heyuan-acdr-1) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetCollectionPolicy operation to retrieve the details of a specific rule.</p>
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
     * <p>The endpoint for this operation is available only in the China (Shanghai), Singapore, and China (Heyuan) Automotive Compliance Cloud (cn-heyuan-acdr-1) regions.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetCollectionPolicy operation to retrieve the details of a specific rule.</p>
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
     * <p>Retrieves the details of a consume processor.</p>
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
     * <p>Retrieves the details of a consume processor.</p>
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
     * <h3>Description</h3>
     * <ul>
     * <li>The host consists of a project name and a Simple Log Service endpoint. You must specify the project name in the host.</li>
     * <li>The relationship among a cursor, a project, a Logstore, and a shard is as follows:<ul>
     * <li>A project contains multiple Logstores.</li>
     * <li>Each Logstore contains multiple shards.</li>
     * <li>A cursor indicates the position of a specific log.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a cursor based on a specified time.</p>
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
     * <h3>Description</h3>
     * <ul>
     * <li>The host consists of a project name and a Simple Log Service endpoint. You must specify the project name in the host.</li>
     * <li>The relationship among a cursor, a project, a Logstore, and a shard is as follows:<ul>
     * <li>A project contains multiple Logstores.</li>
     * <li>Each Logstore contains multiple shards.</li>
     * <li>A cursor indicates the position of a specific log.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a cursor based on a specified time.</p>
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
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li>The host consists of a project name and a Simple Log Service endpoint. You must specify the project in the host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has access permissions on all API operations. Using this AccessKey pair poses a high security threat. For security, we recommend that you create and use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted the permissions to perform operations on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, the project\&quot;s region, and the logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a logstore</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy to grant a RAM user or RAM role the permissions to call this API operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Action</th>
     * <th>Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>log:GetCursorOrData</code></td>
     * <td><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the server time that corresponds to a cursor.</p>
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
     * <b>description</b> :
     * <h3>Description</h3>
     * <ul>
     * <li>The host consists of a project name and a Simple Log Service endpoint. You must specify the project in the host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has access permissions on all API operations. Using this AccessKey pair poses a high security threat. For security, we recommend that you create and use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted the permissions to perform operations on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, the project\&quot;s region, and the logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a logstore</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy to grant a RAM user or RAM role the permissions to call this API operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Action</th>
     * <th>Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>log:GetCursorOrData</code></td>
     * <td><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the server time that corresponds to a cursor.</p>
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
     * <p>Retrieves information about a download task.</p>
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
     * <p>Retrieves information about a download task.</p>
     * @return GetDownloadJobResponse
     */
    public GetDownloadJobResponse getDownloadJob(String project, String downloadJobName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDownloadJobWithOptions(project, downloadJobName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the configuration of a specified extract, transform, and load (ETL) job.</p>
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
     * <p>Retrieves the configuration of a specified extract, transform, and load (ETL) job.</p>
     * @return GetETLResponse
     */
    public GetETLResponse getETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about an ES/OpenSearch import job.</p>
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
     * <p>Retrieves information about an ES/OpenSearch import job.</p>
     * @return GetElasticsearchIngestionResponse
     */
    public GetElasticsearchIngestionResponse getElasticsearchIngestion(String project, String esIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getElasticsearchIngestionWithOptions(project, esIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a Google Cloud Storage (GCS) file import task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGCSIngestionResponse
     */
    public GetGCSIngestionResponse getGCSIngestionWithOptions(String project, String gcsIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGCSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions/" + gcsIngestionName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetGCSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a Google Cloud Storage (GCS) file import task.</p>
     * @return GetGCSIngestionResponse
     */
    public GetGCSIngestionResponse getGCSIngestion(String project, String gcsIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGCSIngestionWithOptions(project, gcsIngestionName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Interface description</h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service Endpoint. You must specify the project in the Host.</li>
     * <li>The subintervals in the response are divided consistently. If the requested time range is the same, the subinterval division in the response is also the same.</li>
     * <li>If the number of logs in a query varies greatly, the Simple Log Service application programming interface (API) cannot predict how many calls are needed to retrieve the full result. You must check the status of the progress member in each response. This status indicates whether to call the operation again to retrieve the final result. Each repeated call consumes the same number of query CUs.</li>
     * <li>The delay between when a log is written to a Logstore and when it can be queried using the GetHistograms and GetLogs operations varies by log type. Simple Log Service classifies logs into two types based on their timestamps:<ul>
     * <li>Real-time data: The log timestamp is within the range of (-180 seconds, +900 seconds] relative to the server\&quot;s current time. For example, if a log\&quot;s timestamp is UTC 2014-09-25 12:03:00 and the server receives it at UTC 2014-09-25 12:05:00, the log is processed as real-time data. The maximum latency for real-time data to become searchable is 3 seconds. In 99.9% of cases, the data is searchable within 1 second.</li>
     * <li>Historical data: The log timestamp is within the range of [-7 × 86400 seconds, -180 seconds) relative to the server\&quot;s current time. For example, if a log\&quot;s timestamp is UTC 2014-09-25 12:00:00 and the server receives it at UTC 2014-09-25 12:05:00, the log is processed as historical data. This typically happens during data backfill.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time (the <strong>time</strong> field) and the time the server received the log (the <strong>tag</strong>:<strong>receive_time</strong> field). If the difference is in the range of (-180 seconds, 900 seconds], the data is real-time data. If the difference is in the range of [-7 × 86400 seconds, -180 seconds), the data is historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides a Java software development kit (SDK) example for using the GetHistograms query. For more information, see <a href="https://help.aliyun.com/document_detail/462234.html">Use GetHistograms to query log distribution</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetHistograms operation to query the distribution of logs that meet the search criteria in a specified Logstore.</p>
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
     * <h3>Interface description</h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service Endpoint. You must specify the project in the Host.</li>
     * <li>The subintervals in the response are divided consistently. If the requested time range is the same, the subinterval division in the response is also the same.</li>
     * <li>If the number of logs in a query varies greatly, the Simple Log Service application programming interface (API) cannot predict how many calls are needed to retrieve the full result. You must check the status of the progress member in each response. This status indicates whether to call the operation again to retrieve the final result. Each repeated call consumes the same number of query CUs.</li>
     * <li>The delay between when a log is written to a Logstore and when it can be queried using the GetHistograms and GetLogs operations varies by log type. Simple Log Service classifies logs into two types based on their timestamps:<ul>
     * <li>Real-time data: The log timestamp is within the range of (-180 seconds, +900 seconds] relative to the server\&quot;s current time. For example, if a log\&quot;s timestamp is UTC 2014-09-25 12:03:00 and the server receives it at UTC 2014-09-25 12:05:00, the log is processed as real-time data. The maximum latency for real-time data to become searchable is 3 seconds. In 99.9% of cases, the data is searchable within 1 second.</li>
     * <li>Historical data: The log timestamp is within the range of [-7 × 86400 seconds, -180 seconds) relative to the server\&quot;s current time. For example, if a log\&quot;s timestamp is UTC 2014-09-25 12:00:00 and the server receives it at UTC 2014-09-25 12:05:00, the log is processed as historical data. This typically happens during data backfill.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time (the <strong>time</strong> field) and the time the server received the log (the <strong>tag</strong>:<strong>receive_time</strong> field). If the difference is in the range of (-180 seconds, 900 seconds], the data is real-time data. If the difference is in the range of [-7 × 86400 seconds, -180 seconds), the data is historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides a Java software development kit (SDK) example for using the GetHistograms query. For more information, see <a href="https://help.aliyun.com/document_detail/462234.html">Use GetHistograms to query log distribution</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call the GetHistograms operation to query the distribution of logs that meet the search criteria in a specified Logstore.</p>
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
     * <p>Retrieves information about an ingest processor.</p>
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
     * <p>Retrieves information about an ingest processor.</p>
     * @return GetIngestProcessorResponse
     */
    public GetIngestProcessorResponse getIngestProcessor(String project, String processorName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIngestProcessorWithOptions(project, processorName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>The Host consists of the project name and the Simple Log Service Endpoint. You must specify the project in the Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a Logstore.</p>
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
     * <h3>Description</h3>
     * <p>The Host consists of the project name and the Simple Log Service Endpoint. You must specify the project in the Host.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a Logstore.</p>
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
     * <h3></h3>
     * <blockquote>
     * <p>Simple Log Service supports scheduled SQL jobs. For more information, see <a href="https://help.aliyun.com/document_detail/286457.html">Create a scheduled SQL job</a>.</p>
     * </blockquote>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. You must specify the project name in the Host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/2766629.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has permissions to access all APIs. This poses a high security risk. We strongly recommend that you create and use a RAM user to make API calls or perform routine operations and maintenance (O\&amp;M). The RAM user must have the required permissions to access Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the name and region of the project, and the name of the Logstore that contains the logs you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Simple Log Service imposes limits on log queries. Therefore, you must design appropriate query and analytic statements and set a reasonable query time range. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log query limits</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis limits</a>.</li>
     * <li>You must configure indexes before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>If the number of logs that match a query varies greatly, the Simple Log Service API cannot predict the number of times you must call this operation to obtain the complete result. Check the value of the x-log-progress header in each response to determine whether to call the operation again. Each repeated call consumes the same number of query capacity units (CUs).</li>
     * <li>When a log is written to a Logstore, the latency before the log is queryable using the GetHistograms and GetLogs operations varies based on the log type. Simple Log Service classifies logs into the following two types based on their timestamps:<ul>
     * <li>Real-time data: The timestamp of the log is within the time range of (-180 seconds, 900 seconds] relative to the current server time. For example, if a log is generated at UTC 2014-09-25 12:03:00 and is received by the server at UTC 2014-09-25 12:05:00, the log is processed as real-time data. This typically occurs in normal scenarios. The latency for real-time data to become queryable is about 3 seconds.</li>
     * <li>Historical data: The timestamp of the log is within the time range of [-7 × 86,400 seconds, -180 seconds) relative to the current server time. For example, if a log is generated at UTC 2014-09-25 12:00:00 and is received by the server at UTC 2014-09-25 12:05:00, the log is processed as historical data. This typically occurs in data backfill scenarios.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time (the <strong>time</strong> field) and the server receipt time (the <strong>tag</strong>: <strong>receive_time</strong> field). If the difference is in the range of (-180 seconds, 900 seconds], the log is real-time data. If the difference is in the range of [-7 × 86,400 seconds, -180 seconds), the log is historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples of how to use the GetLogs operation in Java and Python software development kits (SDKs). For more information, see <a href="https://help.aliyun.com/document_detail/407683.html">GetLogs examples for Java</a> and <a href="https://help.aliyun.com/document_detail/407684.html">GetLogs examples for Python</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add this information to the Action element of a RAM access policy statement to grant RAM users or RAM roles the permission to call this operation.</p>
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
     * <p>This operation queries log data in a Logstore of a specified project.</p>
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
     * <h3></h3>
     * <blockquote>
     * <p>Simple Log Service supports scheduled SQL jobs. For more information, see <a href="https://help.aliyun.com/document_detail/286457.html">Create a scheduled SQL job</a>.</p>
     * </blockquote>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. You must specify the project name in the Host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/2766629.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has permissions to access all APIs. This poses a high security risk. We strongly recommend that you create and use a RAM user to make API calls or perform routine operations and maintenance (O\&amp;M). The RAM user must have the required permissions to access Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the name and region of the project, and the name of the Logstore that contains the logs you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage a Logstore</a>.</li>
     * <li>Simple Log Service imposes limits on log queries. Therefore, you must design appropriate query and analytic statements and set a reasonable query time range. For more information, see <a href="https://help.aliyun.com/document_detail/43772.html">Log query limits</a> and <a href="https://help.aliyun.com/document_detail/53608.html">Log analysis limits</a>.</li>
     * <li>You must configure indexes before you query logs. For more information, see <a href="https://help.aliyun.com/document_detail/90732.html">Create indexes</a>.</li>
     * <li>If the number of logs that match a query varies greatly, the Simple Log Service API cannot predict the number of times you must call this operation to obtain the complete result. Check the value of the x-log-progress header in each response to determine whether to call the operation again. Each repeated call consumes the same number of query capacity units (CUs).</li>
     * <li>When a log is written to a Logstore, the latency before the log is queryable using the GetHistograms and GetLogs operations varies based on the log type. Simple Log Service classifies logs into the following two types based on their timestamps:<ul>
     * <li>Real-time data: The timestamp of the log is within the time range of (-180 seconds, 900 seconds] relative to the current server time. For example, if a log is generated at UTC 2014-09-25 12:03:00 and is received by the server at UTC 2014-09-25 12:05:00, the log is processed as real-time data. This typically occurs in normal scenarios. The latency for real-time data to become queryable is about 3 seconds.</li>
     * <li>Historical data: The timestamp of the log is within the time range of [-7 × 86,400 seconds, -180 seconds) relative to the current server time. For example, if a log is generated at UTC 2014-09-25 12:00:00 and is received by the server at UTC 2014-09-25 12:05:00, the log is processed as historical data. This typically occurs in data backfill scenarios.<blockquote>
     * <p>Simple Log Service calculates the difference between the log time (the <strong>time</strong> field) and the server receipt time (the <strong>tag</strong>: <strong>receive_time</strong> field). If the difference is in the range of (-180 seconds, 900 seconds], the log is real-time data. If the difference is in the range of [-7 × 86,400 seconds, -180 seconds), the log is historical data.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Simple Log Service provides examples of how to use the GetLogs operation in Java and Python software development kits (SDKs). For more information, see <a href="https://help.aliyun.com/document_detail/407683.html">GetLogs examples for Java</a> and <a href="https://help.aliyun.com/document_detail/407684.html">GetLogs examples for Python</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization information that is required for this operation. You can add this information to the Action element of a RAM access policy statement to grant RAM users or RAM roles the permission to call this operation.</p>
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
     * <p>This operation queries log data in a Logstore of a specified project.</p>
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
     * <ul>
     * <li>The Simple Log Service software development kit (SDK) is available for Go, Java, and Python. You can also call all OpenAPI operations directly.</li>
     * <li>Specify a compression method when you call this operation. Available compression algorithms depend on your programming language. For more information, see the Accept-Encoding request parameter.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/2771313.html">GetLogs</a>.</li>
     * </ul>
     * <h3>Permissions</h3>
     * <p>The following table lists the permissions required to call this API operation. Add the action to a RAM policy statement to grant a RAM user or RAM role permission to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries raw logs from a specified Logstore in a project. The response contains raw logs within a specified time range and is compressed for transmission.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.isAccurate)) {
            body.put("isAccurate", request.isAccurate);
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
     * <ul>
     * <li>The Simple Log Service software development kit (SDK) is available for Go, Java, and Python. You can also call all OpenAPI operations directly.</li>
     * <li>Specify a compression method when you call this operation. Available compression algorithms depend on your programming language. For more information, see the Accept-Encoding request parameter.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/2771313.html">GetLogs</a>.</li>
     * </ul>
     * <h3>Permissions</h3>
     * <p>The following table lists the permissions required to call this API operation. Add the action to a RAM policy statement to grant a RAM user or RAM role permission to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:GetLogStoreLogs</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries raw logs from a specified Logstore in a project. The response contains raw logs within a specified time range and is compressed for transmission.</p>
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
     * <p>This API endpoint is available only in the China (Shanghai) and Singapore regions.
     * The following basic permissions are required:</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Action&quot;: [
     *                 &quot;log:Get*&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;acs:log:*:*:mlservice/sls_builtin_*&quot;
     *             ],
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *         }
     *     ]
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Alibaba Cloud Simple Log Service (SLS) provides intelligent analysis for data such as logs, metrics, and traces. You can call models to obtain analysis results directly. Its main features include Named Entity Recognition (NER) for log data, anomaly detection for time series data, and root cause analysis for high-latency trace spans.</p>
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
     * <p>This API endpoint is available only in the China (Shanghai) and Singapore regions.
     * The following basic permissions are required:</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Action&quot;: [
     *                 &quot;log:Get*&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;acs:log:*:*:mlservice/sls_builtin_*&quot;
     *             ],
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *         }
     *     ]
     * }
     * </code></pre>
     * 
     * <b>summary</b> : 
     * <p>Alibaba Cloud Simple Log Service (SLS) provides intelligent analysis for data such as logs, metrics, and traces. You can call models to obtain analysis results directly. Its main features include Named Entity Recognition (NER) for log data, anomaly detection for time series data, and root cause analysis for high-latency trace spans.</p>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>. This operation queries only the configuration of a Metricstore. To query the metric data, see <a href="https://help.aliyun.com/document_detail/174968.html">Query and analyze data</a> and <a href="https://help.aliyun.com/document_detail/2771318.html">GetLogsV2</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full access permissions to all API operations. This poses a high security threat. For security, we recommend that you use a RAM user for API access or routine O\&amp;M. Grant the RAM user the required permissions to operate Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Obtain the name and region of the project that contains the Metricstore. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>You can create a maximum of 200 Logstores or Metricstores in a project.</li>
     * <li>Metrics are deleted after their retention period expires.</li>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>. This operation queries only the configuration of a Metricstore. To query the metric data, see <a href="https://help.aliyun.com/document_detail/174968.html">Query and analyze data</a> and <a href="https://help.aliyun.com/document_detail/2771318.html">GetLogsV2</a>.</p>
     * <ul>
     * <li>You must specify an existing Metricstore.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full access permissions to all API operations. This poses a high security threat. For security, we recommend that you use a RAM user for API access or routine O\&amp;M. Grant the RAM user the required permissions to operate Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Obtain the name and region of the project that contains the Metricstore. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * <li>You can create a maximum of 200 Logstores or Metricstores in a project.</li>
     * <li>Metrics are deleted after their retention period expires.</li>
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
     * <b>description</b> :
     * <p>时序库支持两种计费模式，<a href="https://help.aliyun.com/document_detail/48220.html">按使用功能计费</a> 与 <a href="https://help.aliyun.com/document_detail/2365756.html">按写入数据量计费</a>。</p>
     * <ul>
     * <li>此接口需要指定一个已存在的时序库。</li>
     * <li>请求语法中的Host由Project名称和日志服务Endpoint构成，您需要在Host中指定Project。</li>
     * <li>已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</li>
     * <li>已明确您查询日志所属的Project名称、所属地域等信息。如何查询，请参见<a href="https://help.aliyun.com/document_detail/48984.html">管理Project</a>。</li>
     * <li>一个Project中，最多创建 200 个 Logstore 或 MetricStore。</li>
     * <li>当时序数据保存时间达到您所设置的数据保存时间后，数据将被删除。</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>时序库支持两种计费模式，<a href="https://help.aliyun.com/document_detail/48220.html">按使用功能计费</a> 与 <a href="https://help.aliyun.com/document_detail/2365756.html">按写入数据量计费</a>。</p>
     * <ul>
     * <li>此接口需要指定一个已存在的时序库。</li>
     * <li>请求语法中的Host由Project名称和日志服务Endpoint构成，您需要在Host中指定Project。</li>
     * <li>已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</li>
     * <li>已明确您查询日志所属的Project名称、所属地域等信息。如何查询，请参见<a href="https://help.aliyun.com/document_detail/48984.html">管理Project</a>。</li>
     * <li>一个Project中，最多创建 200 个 Logstore 或 MetricStore。</li>
     * <li>当时序数据保存时间达到您所设置的数据保存时间后，数据将被删除。</li>
     * </ul>
     * 
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
     * <p>Retrieves the specified OSS data shipping job.</p>
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
     * <p>Retrieves the specified OSS data shipping job.</p>
     * @return GetOSSExportResponse
     */
    public GetOSSExportResponse getOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified OSS-HDFS delivery job.</p>
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
     * <p>Retrieves the details of a specified OSS-HDFS delivery job.</p>
     * @return GetOSSHDFSExportResponse
     */
    public GetOSSHDFSExportResponse getOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a specified OSS import job.</p>
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
     * <p>Retrieves a specified OSS import job.</p>
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
     * <p>Retrieves information about an S3 import task.</p>
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
     * <p>Retrieves information about an S3 import task.</p>
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
     * <p>Retrieves the specified Scheduled SQL job.</p>
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
     * <p>Retrieves the specified Scheduled SQL job.</p>
     * @return GetScheduledSQLResponse
     */
    public GetScheduledSQLResponse getScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation requires an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account grants full access to all APIs. This poses a high security threat. Create and use a RAM user for API access or routine operations and maintenance (O\&amp;M). The RAM user must have permissions to operate Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the GetSlsService operation to retrieve the activation status of Simple Log Service. The endpoint must be China (Shanghai) or Singapore.</p>
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
     * <b>description</b> :
     * <p>This operation requires an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account grants full access to all APIs. This poses a high security threat. Create and use a RAM user for API access or routine operations and maintenance (O\&amp;M). The RAM user must have permissions to operate Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the GetSlsService operation to retrieve the activation status of Simple Log Service. The endpoint must be China (Shanghai) or Singapore.</p>
     * @return GetSlsServiceResponse
     */
    public GetSlsServiceResponse getSlsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSlsServiceWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the Dedicated SQL instance of a project, such as the number of compute units (CUs) and whether the Dedicated SQL instance is enabled by default. Before you call this operation, you must create a Dedicated SQL instance by calling the CreateSqlInstance or UpdateSqlInstance operation.</p>
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
     * <p>Queries information about the Dedicated SQL instance of a project, such as the number of compute units (CUs) and whether the Dedicated SQL instance is enabled by default. Before you call this operation, you must create a Dedicated SQL instance by calling the CreateSqlInstance or UpdateSqlInstance operation.</p>
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
     * <b>description</b> :
     * <p>Retrieves a list of process-level configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation lists process-level configurations.</p>
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
     * <b>description</b> :
     * <p>Retrieves a list of process-level configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation lists process-level configurations.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the AI tools provided by the observability service, including Copilot capabilities for various services.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this API is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the AI tools provided by the observability service, including Copilot capabilities for various services.</p>
     * @return ListAiToolsResponse
     */
    public ListAiToolsResponse listAiTools() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAiToolsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the alert rules in a specified project.</p>
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
     * <p>Lists the alert rules in a specified project.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data records in a specified dataset.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data records in a specified dataset.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of dataset structs.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Returns a list of dataset structs.</p>
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
     * <b>description</b> :
     * <p>This API operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists annotation label tables.</p>
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
     * <b>description</b> :
     * <p>This API operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists annotation label tables.</p>
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
     * <p>Lists the import tasks for Azure BLOB files.</p>
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
     * <p>Lists the import tasks for Azure BLOB files.</p>
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
     * <p>This API operation is available only at the endpoints in the following regions: China (Shanghai), Singapore, and Heyuan Automotive Compliance Cloud (cn-heyuan-acdr-1).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the collection rules for logs from Alibaba Cloud services.</p>
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
     * <p>This API operation is available only at the endpoints in the following regions: China (Shanghai), Singapore, and Heyuan Automotive Compliance Cloud (cn-heyuan-acdr-1).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the collection rules for logs from Alibaba Cloud services.</p>
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
     * <p>Retrieves a list of consume processors that match the specified parameters.</p>
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
     * <p>Retrieves a list of consume processors that match the specified parameters.</p>
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
     * <h3>Description</h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. You must specify the project name in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has the permissions to call all API operations. This is a high-risk practice. We recommend that you create and use a RAM user to call API operations or perform routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project that contains the logs you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries dashboards.</p>
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
     * <h3>Description</h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. You must specify the project name in the Host.</li>
     * <li>Create an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has the permissions to call all API operations. This is a high-risk practice. We recommend that you create and use a RAM user to call API operations or perform routine O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project that contains the logs you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries dashboards.</p>
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
     * <p>Lists the log download jobs in a specified project.</p>
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
     * <p>Lists the log download jobs in a specified project.</p>
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
     * <p>Lists the data transformation jobs in a project.</p>
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
     * <p>Lists the data transformation jobs in a project.</p>
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
     * <p>Lists the Elasticsearch and OpenSearch ingestion jobs.</p>
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
     * <p>Lists the Elasticsearch and OpenSearch ingestion jobs.</p>
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
     * <p>Lists Google Cloud Storage (GCS) file import jobs.</p>
     * 
     * @param request ListGCSIngestionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGCSIngestionsResponse
     */
    public ListGCSIngestionsResponse listGCSIngestionsWithOptions(String project, ListGCSIngestionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListGCSIngestions"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListGCSIngestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists Google Cloud Storage (GCS) file import jobs.</p>
     * 
     * @param request ListGCSIngestionsRequest
     * @return ListGCSIngestionsResponse
     */
    public ListGCSIngestionsResponse listGCSIngestions(String project, ListGCSIngestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGCSIngestionsWithOptions(project, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists ingest processors that meet the specified conditions.</p>
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
     * <p>Lists ingest processors that meet the specified conditions.</p>
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
     * <b>summary</b> : 
     * <p>Lists the names of Logtail pipeline configurations that meet specified criteria.</p>
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
     * <b>summary</b> : 
     * <p>Lists the names of Logtail pipeline configurations that meet specified criteria.</p>
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
     * <ul>
     * <li>The Host consists of the project name and the Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions to access all APIs. This poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user for API access or daily O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project that contains the logs to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists MaxCompute delivery tasks.</p>
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
     * <ul>
     * <li>The Host consists of the project name and the Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Create and obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions to access all APIs. This poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user for API access or daily O\&amp;M. The RAM user must have the permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Identify the name and region of the project that contains the logs to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists MaxCompute delivery tasks.</p>
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
     * <p>Queries the OSS shipping jobs in a specified project.</p>
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
     * <p>Queries the OSS shipping jobs in a specified project.</p>
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
     * <p>Lists the OSS-HDFS export tasks in a specified project.</p>
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
     * <p>Lists the OSS-HDFS export tasks in a specified project.</p>
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
     * <p>Lists OSS import tasks in a specified project.</p>
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
     * <p>Lists OSS import tasks in a specified project.</p>
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
     * <h3>API description</h3>
     * <p>The host consists of a project name and a Simple Log Service endpoint. You must specify the project in the host.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists projects that meet the specified criteria.</p>
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
     * <h3>API description</h3>
     * <p>The host consists of a project name and a Simple Log Service endpoint. You must specify the project in the host.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists projects that meet the specified criteria.</p>
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
     * <p>Lists S3 import tasks.</p>
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
     * <p>Lists S3 import tasks.</p>
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
     * <p>Lists the Scheduled SQLs in a specified project.</p>
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
     * <p>Lists the Scheduled SQLs in a specified project.</p>
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
     * <b>description</b> :
     * <h3>API description</h3>
     * <ul>
     * <li>The host consists of the project name and the Simple Log Service endpoint. You must specify the project in the host.</li>
     * <li>Each shard has a range, which is a left-closed, right-open MD5 interval of <code>[BeginKey,EndKey)</code>. The status of a shard can be readwrite or readonly. You can split and merge shards. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shards</a>.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has access permissions for all APIs. This poses a high security threat. We recommend that you create and use a RAM user for API calls or routine O\&amp;M. The RAM user must have the required permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>You must have the project name, region, and Logstore name for the logs that you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Merges adjacent read/write shards.</p>
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
     * <b>description</b> :
     * <h3>API description</h3>
     * <ul>
     * <li>The host consists of the project name and the Simple Log Service endpoint. You must specify the project in the host.</li>
     * <li>Each shard has a range, which is a left-closed, right-open MD5 interval of <code>[BeginKey,EndKey)</code>. The status of a shard can be readwrite or readonly. You can split and merge shards. For more information, see <a href="https://help.aliyun.com/document_detail/28976.html">Shards</a>.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has access permissions for all APIs. This poses a high security threat. We recommend that you create and use a RAM user for API calls or routine O\&amp;M. The RAM user must have the required permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>You must have the project name, region, and Logstore name for the logs that you want to query. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Merges adjacent read/write shards.</p>
     * @return MergeShardResponse
     */
    public MergeShardResponse mergeShard(String project, String logstore, String shard) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeShardWithOptions(project, logstore, shard, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>该接口需要您已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</p>
     * 
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
     * <b>description</b> :
     * <p>该接口需要您已创建并获取AccessKey。更多信息，请参见<a href="https://help.aliyun.com/document_detail/29009.html">访问密钥</a>。
     *  阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维。RAM用户需具备操作日志服务资源的权限。具体操作，请参见<a href="https://help.aliyun.com/document_detail/47664.html">创建RAM用户及授权</a>。</p>
     * 
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
     * <blockquote>
     * <p>Warning: 
     * This operation is not supported by the OpenAPI SDK. Use the <a href="https://help.aliyun.com/document_detail/29063.html">Simple Log Service SDK</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Specify a shard to retrieve logs.</li>
     * <li>This operation supports reading data in only the <a href="https://help.aliyun.com/document_detail/29055.html">Protocol Buffer</a> format.</li>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. Specify the project in the Host.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the PullLogs operation to retrieve log data from a specified cursor position. This operation retrieves raw logs. To query or analyze logs, call the GetLogsV2 operation.</p>
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
     * <blockquote>
     * <p>Warning: 
     * This operation is not supported by the OpenAPI SDK. Use the <a href="https://help.aliyun.com/document_detail/29063.html">Simple Log Service SDK</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Specify a shard to retrieve logs.</li>
     * <li>This operation supports reading data in only the <a href="https://help.aliyun.com/document_detail/29055.html">Protocol Buffer</a> format.</li>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service endpoint. Specify the project in the Host.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Call the PullLogs operation to retrieve log data from a specified cursor position. This operation retrieves raw logs. To query or analyze logs, call the GetLogsV2 operation.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stores annotation data in a dataset.</p>
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
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Stores annotation data in a dataset.</p>
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
     * <p>Creates or updates a consume processor.</p>
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
     * <p>Creates or updates a consume processor.</p>
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
     * <li>The <code>Host</code> in the request header must contain both the <code>Project</code> name and the Simple Log Service (SLS) endpoint.</li>
     * <li>This operation requires an AccessKey. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">Access Key</a>.
     * An AccessKey for an Alibaba Cloud account grants full access to all APIs and poses a high security risk. We strongly recommend that you create and use a RAM user for API access and daily operations. The RAM user must have the necessary permissions to operate SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Identify the names of the target <code>Project</code>, <code>Region</code>, and <code>Logstore</code>. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage Project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstore</a>.</li>
     * </ul>
     * <h3>Permissions</h3>
     * <p>To grant a RAM user or RAM role permission to call this operation, add the Action and Resource in the following table to a permission policy in Resource Access Management (RAM).</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Actions</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:PutLogStoreConfig</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a Logstore.</p>
     * 
     * @param request PutLogStoreConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutLogStoreConfigResponse
     */
    public PutLogStoreConfigResponse putLogStoreConfigWithOptions(String project, String logstore, PutLogStoreConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIpHeaders)) {
            body.put("clientIpHeaders", request.clientIpHeaders);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutLogStoreConfig"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/config"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutLogStoreConfigResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <code>Host</code> in the request header must contain both the <code>Project</code> name and the Simple Log Service (SLS) endpoint.</li>
     * <li>This operation requires an AccessKey. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">Access Key</a>.
     * An AccessKey for an Alibaba Cloud account grants full access to all APIs and poses a high security risk. We strongly recommend that you create and use a RAM user for API access and daily operations. The RAM user must have the necessary permissions to operate SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Identify the names of the target <code>Project</code>, <code>Region</code>, and <code>Logstore</code>. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage Project</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstore</a>.</li>
     * </ul>
     * <h3>Permissions</h3>
     * <p>To grant a RAM user or RAM role permission to call this operation, add the Action and Resource in the following table to a permission policy in Resource Access Management (RAM).</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Actions</th>
     * <th align="left">Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:PutLogStoreConfig</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a Logstore.</p>
     * 
     * @param request PutLogStoreConfigRequest
     * @return PutLogStoreConfigResponse
     */
    public PutLogStoreConfigResponse putLogStoreConfig(String project, String logstore, PutLogStoreConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putLogStoreConfigWithOptions(project, logstore, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The OpenAPI SDK does not support this operation. Use the <a href="https://help.aliyun.com/document_detail/29063.html">Simple Log Service (SLS) SDK</a> instead.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The service checks the format of log data for each PutLogs request. If any log entry is invalid, the entire request fails and no logs are written.</li>
     * <li>This operation supports only log data in <a href="https://help.aliyun.com/document_detail/29055.html">protobuf format</a>. The log data is structured as a LogGroup.</li>
     * <li>Logs can be written in two modes:<ul>
     * <li>LoadBalance mode: Data is automatically written to all writable shards in a logstore. This method provides high availability and is suitable for data consumption scenarios that do not require a specific order. Request syntax:<pre><code class="language-plaintext">POST /logstores/logstoreName/shards/lb HTTP/1.1
     * Authorization: LOG yourAccessKeyId:yourSignature
     * Content-Type: application/x-protobuf
     * Content-Length: Content Length
     * Content-MD5: Content MD5
     * Date: GMT Date
     * Host: ProjectName.Endpoint
     * x-log-apiversion: 0.6.0
     * x-log-bodyrawsize: BodyRawSize
     * x-log-compresstype: lz4
     * x-log-signaturemethod: hmac-sha1
     * &lt;Compressed log data in protobuf format&gt;
     * </code></pre>
     * </li>
     * <li>KeyHash mode: Add a key parameter to the URL to determine which shard receives the data. This parameter is optional. If you do not set this parameter, the system automatically switches to the load balancing mode. For example, pin a producer, such as an instance, to a specific shard based on its name hash. This ensures that data written to and consumed from the shard is strictly ordered. During merge and split operations, a key is associated with only one shard at any given time. Request syntax:<pre><code class="language-plaintext">POST /logstores/logstoreName/shards/route?key=14d2f850ad6ea48e46e4547edbbb27e0
     * Authorization: LOG yourAccessKeyId:yourSignature
     * Content-Type: application/x-protobuf
     * Content-Length: Content Length
     * Content-MD5: Content MD5
     * Date: GMT Date
     * Host: ProjectName.Endpoint
     * x-log-apiversion: 0.6.0
     * x-log-bodyrawsize: BodyRawSize
     * x-log-compresstype: lz4
     * x-log-signaturemethod: hmac-sha1
     * &lt;Compressed log data in protobuf format&gt;
     * </code></pre>
     * </li>
     * </ul>
     * </li>
     * <li>The maximum size of raw logs for each PutLogs request is 10 MB. The Value of each log in a log group must not exceed 1 MB. Older SDK versions may have different limits. Upgrade to the latest SDK version.</li>
     * <li>SLS provides examples of how to use PutLogs with the Java and Python SDKs.</li>
     * </ul>
     * <h2>Protobuf data</h2>
     * <p>This section describes the fields for compressed log data in protobuf format. For more information, see <a href="https://help.aliyun.com/document_detail/29054.html">Data model</a> and <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</p>
     * <ul>
     * <li>Log<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Time</td>
     * <td>Integer</td>
     * <td>Yes</td>
     * <td>The time of the log. The value is a UNIX timestamp that represents the number of seconds that have elapsed since 1970-1-1 00:00:00 UTC.</td>
     * </tr>
     * <tr>
     * <td>Contents</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of log fields. The list must contain at least one element. For the element type, see the Content table below.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>Content<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Key</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The custom key name.</td>
     * </tr>
     * <tr>
     * <td>Value</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The value that corresponds to the custom key.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>LogTag<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Key</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The custom key name.</td>
     * </tr>
     * <tr>
     * <td>Value</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The value that corresponds to the custom key.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>LogGroup<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Logs</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of logs. For each element, see the Log table.</td>
     * </tr>
     * <tr>
     * <td>Topic</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The topic of the logs. Use this custom field to distinguish log data with different features.</td>
     * </tr>
     * <tr>
     * <td>Source</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The source of the logs, such as the IP address of the machine that generated the logs.</td>
     * </tr>
     * <tr>
     * <td>LogTags</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of log tags. For each element, see the LogTag table.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes log data to a specified logstore.</p>
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
     * <blockquote>
     * <ul>
     * <li>The OpenAPI SDK does not support this operation. Use the <a href="https://help.aliyun.com/document_detail/29063.html">Simple Log Service (SLS) SDK</a> instead.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The service checks the format of log data for each PutLogs request. If any log entry is invalid, the entire request fails and no logs are written.</li>
     * <li>This operation supports only log data in <a href="https://help.aliyun.com/document_detail/29055.html">protobuf format</a>. The log data is structured as a LogGroup.</li>
     * <li>Logs can be written in two modes:<ul>
     * <li>LoadBalance mode: Data is automatically written to all writable shards in a logstore. This method provides high availability and is suitable for data consumption scenarios that do not require a specific order. Request syntax:<pre><code class="language-plaintext">POST /logstores/logstoreName/shards/lb HTTP/1.1
     * Authorization: LOG yourAccessKeyId:yourSignature
     * Content-Type: application/x-protobuf
     * Content-Length: Content Length
     * Content-MD5: Content MD5
     * Date: GMT Date
     * Host: ProjectName.Endpoint
     * x-log-apiversion: 0.6.0
     * x-log-bodyrawsize: BodyRawSize
     * x-log-compresstype: lz4
     * x-log-signaturemethod: hmac-sha1
     * &lt;Compressed log data in protobuf format&gt;
     * </code></pre>
     * </li>
     * <li>KeyHash mode: Add a key parameter to the URL to determine which shard receives the data. This parameter is optional. If you do not set this parameter, the system automatically switches to the load balancing mode. For example, pin a producer, such as an instance, to a specific shard based on its name hash. This ensures that data written to and consumed from the shard is strictly ordered. During merge and split operations, a key is associated with only one shard at any given time. Request syntax:<pre><code class="language-plaintext">POST /logstores/logstoreName/shards/route?key=14d2f850ad6ea48e46e4547edbbb27e0
     * Authorization: LOG yourAccessKeyId:yourSignature
     * Content-Type: application/x-protobuf
     * Content-Length: Content Length
     * Content-MD5: Content MD5
     * Date: GMT Date
     * Host: ProjectName.Endpoint
     * x-log-apiversion: 0.6.0
     * x-log-bodyrawsize: BodyRawSize
     * x-log-compresstype: lz4
     * x-log-signaturemethod: hmac-sha1
     * &lt;Compressed log data in protobuf format&gt;
     * </code></pre>
     * </li>
     * </ul>
     * </li>
     * <li>The maximum size of raw logs for each PutLogs request is 10 MB. The Value of each log in a log group must not exceed 1 MB. Older SDK versions may have different limits. Upgrade to the latest SDK version.</li>
     * <li>SLS provides examples of how to use PutLogs with the Java and Python SDKs.</li>
     * </ul>
     * <h2>Protobuf data</h2>
     * <p>This section describes the fields for compressed log data in protobuf format. For more information, see <a href="https://help.aliyun.com/document_detail/29054.html">Data model</a> and <a href="https://help.aliyun.com/document_detail/29055.html">Data encoding</a>.</p>
     * <ul>
     * <li>Log<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Time</td>
     * <td>Integer</td>
     * <td>Yes</td>
     * <td>The time of the log. The value is a UNIX timestamp that represents the number of seconds that have elapsed since 1970-1-1 00:00:00 UTC.</td>
     * </tr>
     * <tr>
     * <td>Contents</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of log fields. The list must contain at least one element. For the element type, see the Content table below.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>Content<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Key</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The custom key name.</td>
     * </tr>
     * <tr>
     * <td>Value</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The value that corresponds to the custom key.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>LogTag<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Key</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The custom key name.</td>
     * </tr>
     * <tr>
     * <td>Value</td>
     * <td>String</td>
     * <td>Yes</td>
     * <td>The value that corresponds to the custom key.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * <li>LogGroup<table>
     * <thead>
     * <tr>
     * <th><strong>Parameter</strong></th>
     * <th><strong>Data type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Logs</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of logs. For each element, see the Log table.</td>
     * </tr>
     * <tr>
     * <td>Topic</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The topic of the logs. Use this custom field to distinguish log data with different features.</td>
     * </tr>
     * <tr>
     * <td>Source</td>
     * <td>String</td>
     * <td>No</td>
     * <td>The source of the logs, such as the IP address of the machine that generated the logs.</td>
     * </tr>
     * <tr>
     * <td>LogTags</td>
     * <td>List</td>
     * <td>Yes</td>
     * <td>A list of log tags. For each element, see the LogTag table.</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Writes log data to a specified logstore.</p>
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
     * <h3></h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service (SLS) endpoint. You must specify the project in the Host.</li>
     * <li>You have created an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account provides full access to all API operations. This is a high security risk. We recommend that you create and use a Resource Access Management (RAM) user for API access or daily O\&amp;M. The RAM user must have permissions to manage SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, region, and Logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * <li>A project policy is an authorization policy for projects in SLS. You can use a project policy to grant other users access to your specified SLS resources.<ul>
     * <li>Before you configure a project policy using policy syntax, you must understand the classification of SLS actions, resources, and conditions. For more information, see <a href="https://help.aliyun.com/document_detail/128139.html">Resource Access Management</a>.</li>
     * <li>When you configure a project policy, if you grant permissions to an anonymous account (\<em>) and do not specify a condition, the policy applies to all users except the project owner. If you grant permissions to an anonymous account (\</em>) and specify a condition, the policy applies to all users, including the project owner.</li>
     * <li>You can add multiple project policies, but their total size cannot exceed 16 KB.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project access policy.</p>
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
     * <h3></h3>
     * <ul>
     * <li>The Host in the request syntax consists of the project name and the Simple Log Service (SLS) endpoint. You must specify the project in the Host.</li>
     * <li>You have created an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account provides full access to all API operations. This is a high security risk. We recommend that you create and use a Resource Access Management (RAM) user for API access or daily O\&amp;M. The RAM user must have permissions to manage SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, region, and Logstore name. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * <li>A project policy is an authorization policy for projects in SLS. You can use a project policy to grant other users access to your specified SLS resources.<ul>
     * <li>Before you configure a project policy using policy syntax, you must understand the classification of SLS actions, resources, and conditions. For more information, see <a href="https://help.aliyun.com/document_detail/128139.html">Resource Access Management</a>.</li>
     * <li>When you configure a project policy, if you grant permissions to an anonymous account (\<em>) and do not specify a condition, the policy applies to all users except the project owner. If you grant permissions to an anonymous account (\</em>) and specify a condition, the policy applies to all users, including the project owner.</li>
     * <li>You can add multiple project policies, but their total size cannot exceed 16 KB.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a project access policy.</p>
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
     * <p>Refreshes an access token using a ticket. The access token is used to call console API operations.</p>
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
     * <p>Refreshes an access token using a ticket. The access token is used to call console API operations.</p>
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
     * <p>Starts an Azure BLOB file import task.</p>
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
     * <p>Starts an Azure BLOB file import task.</p>
     * @return StartAzureBlobIngestionResponse
     */
    public StartAzureBlobIngestionResponse startAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a data transformation task.</p>
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
     * <p>Starts a data transformation task.</p>
     * @return StartETLResponse
     */
    public StartETLResponse startETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an ES or OpenSearch ingestion task.</p>
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
            new TeaPair("pathname", "/elasticsearchingestions/" + elasticsearchIngestionName + "?action=START"),
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
     * <p>Starts an ES or OpenSearch ingestion task.</p>
     * @return StartElasticsearchIngestionResponse
     */
    public StartElasticsearchIngestionResponse startElasticsearchIngestion(String project, String elasticsearchIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startElasticsearchIngestionWithOptions(project, elasticsearchIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a GCS file import task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartGCSIngestionResponse
     */
    public StartGCSIngestionResponse startGCSIngestionWithOptions(String project, String gcsIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartGCSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions/" + gcsIngestionName + "?action=START"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StartGCSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a GCS file import task.</p>
     * @return StartGCSIngestionResponse
     */
    public StartGCSIngestionResponse startGCSIngestion(String project, String gcsIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startGCSIngestionWithOptions(project, gcsIngestionName, headers, runtime);
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
     * <p>Starts an Object Storage Service (OSS) data shipping job.</p>
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
     * <p>Starts an Object Storage Service (OSS) data shipping job.</p>
     * @return StartOSSExportResponse
     */
    public StartOSSExportResponse startOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an OSS-HDFS data shipping job.</p>
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
     * <p>Starts an OSS-HDFS data shipping job.</p>
     * @return StartOSSHDFSExportResponse
     */
    public StartOSSHDFSExportResponse startOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a specified OSS import task.</p>
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
     * <p>Starts a specified OSS import task.</p>
     * @return StartOSSIngestionResponse
     */
    public StartOSSIngestionResponse startOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Start a file import task from Azure Blob</p>
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
     * <p>Start a file import task from Azure Blob</p>
     * @return StopAzureBlobIngestionResponse
     */
    public StopAzureBlobIngestionResponse stopAzureBlobIngestion(String project, String azureBlobIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAzureBlobIngestionWithOptions(project, azureBlobIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a specified data transformation task.</p>
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
     * <p>Stops a specified data transformation task.</p>
     * @return StopETLResponse
     */
    public StopETLResponse stopETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an ES or OpenSearch import job.</p>
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
            new TeaPair("pathname", "/elasticsearchingestions/" + elasticsearchIngestionName + "?action=STOP"),
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
     * <p>Stops an ES or OpenSearch import job.</p>
     * @return StopElasticsearchIngestionResponse
     */
    public StopElasticsearchIngestionResponse stopElasticsearchIngestion(String project, String elasticsearchIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopElasticsearchIngestionWithOptions(project, elasticsearchIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a GCP Cloud Storage file import task.</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopGCSIngestionResponse
     */
    public StopGCSIngestionResponse stopGCSIngestionWithOptions(String project, String gcsIngestionName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopGCSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions/" + gcsIngestionName + "?action=STOP"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new StopGCSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a GCP Cloud Storage file import task.</p>
     * @return StopGCSIngestionResponse
     */
    public StopGCSIngestionResponse stopGCSIngestion(String project, String gcsIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopGCSIngestionWithOptions(project, gcsIngestionName, headers, runtime);
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
     * <p>Stops an Object Storage Service (OSS) data shipping job.</p>
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
     * <p>Stops an Object Storage Service (OSS) data shipping job.</p>
     * @return StopOSSExportResponse
     */
    public StopOSSExportResponse stopOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an OSS-HDFS data shipping job.</p>
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
     * <p>Stops an OSS-HDFS data shipping job.</p>
     * @return StopOSSHDFSExportResponse
     */
    public StopOSSHDFSExportResponse stopOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the specified OSS import task.</p>
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
     * <p>Stops the specified OSS import task.</p>
     * @return StopOSSIngestionResponse
     */
    public StopOSSIngestionResponse stopOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an asynchronous SQL request.</p>
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
     * <p>Submits an asynchronous SQL request.</p>
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
     * <p>Updates process-level configurations.</p>
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
     * <p>Updates process-level configurations.</p>
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
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
     * <b>description</b> :
     * <p>The endpoint for this operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
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
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a label table. You can update only the names of labels in a label set.</p>
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
     * <p>This operation is available only in the China (Shanghai) and Singapore regions.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a label table. You can update only the names of labels in a label set.</p>
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
     * <p>Updates an Azure BLOB file import job.</p>
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
     * <p>Updates an Azure BLOB file import job.</p>
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
     * <p>Updates the configuration of a specified data transformation task and restarts it.</p>
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
     * <p>Updates the configuration of a specified data transformation task and restarts it.</p>
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
     * <p>Updates an ES or OpenSearch ingestion task.</p>
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
     * <p>Updates an ES or OpenSearch ingestion task.</p>
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
     * <b>summary</b> : 
     * <p>Updates a GCS file import task.</p>
     * 
     * @param request UpdateGCSIngestionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGCSIngestionResponse
     */
    public UpdateGCSIngestionResponse updateGCSIngestionWithOptions(String project, String gcsIngestionName, UpdateGCSIngestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpdateGCSIngestion"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/gcsingestions/" + gcsIngestionName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGCSIngestionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a GCS file import task.</p>
     * 
     * @param request UpdateGCSIngestionRequest
     * @return UpdateGCSIngestionResponse
     */
    public UpdateGCSIngestionResponse updateGCSIngestion(String project, String gcsIngestionName, UpdateGCSIngestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGCSIngestionWithOptions(project, gcsIngestionName, request, headers, runtime);
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
     * <li>Before you update a Logstore, call the GetLogStore operation to retrieve the configuration of the Logstore. Then, modify the configuration and pass it to the UpdateLogStore operation.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service (SLS) endpoint. You must specify the project in the Host.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations. This poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user to make API calls or perform routine O\&amp;M. The RAM user must be granted the required permissions to operate SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, the Logstore name, and the region where the project resides. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization required for this operation. To grant a RAM user or RAM role permission to call this operation, add the required action to the Action element of a RAM policy.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateLogStore</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the properties of a Logstore.</p>
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
     * <li>Before you update a Logstore, call the GetLogStore operation to retrieve the configuration of the Logstore. Then, modify the configuration and pass it to the UpdateLogStore operation.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service (SLS) endpoint. You must specify the project in the Host.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations. This poses a high security risk. We recommend that you create and use a Resource Access Management (RAM) user to make API calls or perform routine O\&amp;M. The RAM user must be granted the required permissions to operate SLS resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>Obtain the project name, the Logstore name, and the region where the project resides. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a> and <a href="https://help.aliyun.com/document_detail/48990.html">Manage Logstores</a>.</li>
     * </ul>
     * <h3>Authorization</h3>
     * <p>The following table describes the authorization required for this operation. To grant a RAM user or RAM role permission to call this operation, add the required action to the Action element of a RAM policy.</p>
     * <table>
     * <thead>
     * <tr>
     * <th align="left">Action</th>
     * <th align="left">Resource description in an authorization policy</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td align="left"><code>log:UpdateLogStore</code></td>
     * <td align="left"><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/{#LogstoreName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates the properties of a Logstore.</p>
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
     * <p>Updates the ingest processor for a Logstore.</p>
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
     * <p>Updates the ingest processor for a Logstore.</p>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>.</p>
     * <ul>
     * <li>The Metricstore that you want to update must already exist.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify a project in the Host.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full permissions for all API operations, which poses a security risk. We recommend that you use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted only the permissions required to access Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>You must know the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create a maximum of 200 Logstores or Metricstores in a project.</li>
     * <li>Metrics are deleted after their retention period expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an existing Metricstore. A Metricstore is used to store metrics.</p>
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
     * <p>A <a href="https://help.aliyun.com/document_detail/171723.html">Metricstore</a> is used to store <a href="https://help.aliyun.com/document_detail/174965.html">metrics</a>.</p>
     * <ul>
     * <li>The Metricstore that you want to update must already exist.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify a project in the Host.</li>
     * <li>You must have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has full permissions for all API operations, which poses a security risk. We recommend that you use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted only the permissions required to access Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create and authorize a RAM user</a>.</li>
     * <li>You must know the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage a project</a>.</li>
     * <li>You can create a maximum of 200 Logstores or Metricstores in a project.</li>
     * <li>Metrics are deleted after their retention period expires.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of an existing Metricstore. A Metricstore is used to store metrics.</p>
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
     * <b>description</b> :
     * <p>A Metricstore supports two billing modes: <a href="https://help.aliyun.com/document_detail/48220.html">Pay-by-feature</a> and <a href="https://help.aliyun.com/document_detail/2365756.html">Pay-by-ingested-data</a>.</p>
     * <ul>
     * <li>Specify an existing Metricstore.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has permissions for all API operations, which poses a high security threat. We recommend that you use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted the required permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Obtain the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the billing mode of a specified Metricstore.</p>
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
     * <b>description</b> :
     * <p>A Metricstore supports two billing modes: <a href="https://help.aliyun.com/document_detail/48220.html">Pay-by-feature</a> and <a href="https://help.aliyun.com/document_detail/2365756.html">Pay-by-ingested-data</a>.</p>
     * <ul>
     * <li>Specify an existing Metricstore.</li>
     * <li>The Host in the request syntax consists of a project name and a Simple Log Service endpoint. You must specify the project in the Host.</li>
     * <li>Obtain an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair that belongs to an Alibaba Cloud account has permissions for all API operations, which poses a high security threat. We recommend that you use a RAM user to call API operations or perform routine operations and maintenance (O\&amp;M). The RAM user must be granted the required permissions to manage Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * <li>Obtain the name and region of the project. For more information, see <a href="https://help.aliyun.com/document_detail/48984.html">Manage projects</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the billing mode of a specified Metricstore.</p>
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
     * <p>Updates an Object Storage Service (OSS) data shipping job.</p>
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
     * <p>Updates an Object Storage Service (OSS) data shipping job.</p>
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
     * <p>Updates an OSS-HDFS data shipping job.</p>
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
     * <p>Updates an OSS-HDFS data shipping job.</p>
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
     * <p>Updates the specified OSS import task.</p>
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
     * <p>Updates the specified OSS import task.</p>
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
     * <li>The Host parameter consists of a project name and a Simple Log Service endpoint. You must specify a project in the Host parameter.</li>
     * <li>Make sure that you have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations, which poses a high security risk. For security, we recommend that you create and use a Resource Access Management (RAM) user to make API calls or perform routine O\&amp;M. The RAM user must have permissions to operate on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * </ul>
     * <h3>Authorization resources</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy statement to grant a RAM user or RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>log:UpdateProject</code></td>
     * <td><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates project information.</p>
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
     * <li>The Host parameter consists of a project name and a Simple Log Service endpoint. You must specify a project in the Host parameter.</li>
     * <li>Make sure that you have an AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/29009.html">AccessKey pair</a>.
     * An AccessKey pair for an Alibaba Cloud account has permissions on all API operations, which poses a high security risk. For security, we recommend that you create and use a Resource Access Management (RAM) user to make API calls or perform routine O\&amp;M. The RAM user must have permissions to operate on Simple Log Service resources. For more information, see <a href="https://help.aliyun.com/document_detail/47664.html">Create a RAM user and grant permissions</a>.</li>
     * </ul>
     * <h3>Authorization resources</h3>
     * <p>The following table describes the authorization information for this operation. Add this information to the Action element of a RAM policy statement to grant a RAM user or RAM role the permissions to call this operation.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Action</th>
     * <th>Resource</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>log:UpdateProject</code></td>
     * <td><code>acs:log:{#regionId}:{#accountId}:project/{#ProjectName}</code></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Updates project information.</p>
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
     * <p>Updates the specified scheduled SQL task.</p>
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
     * <p>Updates the specified scheduled SQL task.</p>
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/223777.html">pricing</a> for Dedicated SQL.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>When you use Standard SQL to analyze large amounts of data, a single query may not scan all logs within a specific time range, which can result in incomplete data. Although adding shards improves read and write performance, this improvement applies only to new data. To analyze more data in a single query, enable Dedicated SQL and add more compute resources.</p>
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/223777.html">pricing</a> for Dedicated SQL.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>When you use Standard SQL to analyze large amounts of data, a single query may not scan all logs within a specific time range, which can result in incomplete data. Although adding shards improves read and write performance, this improvement applies only to new data. To analyze more data in a single query, enable Dedicated SQL and add more compute resources.</p>
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

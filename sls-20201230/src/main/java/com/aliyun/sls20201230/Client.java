// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230;

import com.aliyun.tea.*;
import com.aliyun.sls20201230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public com.aliyun.gateway.spi.Client _client;
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._client = new com.aliyun.gateway.sls.Client();
        this._spi = _client;
        this._signatureAlgorithm = "v2";
        this._endpointRule = "central";
    }


    /**
     * @summary Applies a Logtail configuration to a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Applies a Logtail configuration to a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return ApplyConfigToMachineGroupResponse
     */
    public ApplyConfigToMachineGroupResponse applyConfigToMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConfigToMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

    /**
     * @summary Modifies the resource group of a resource.
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
     * @summary Modifies the resource group of a resource.
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
     * @summary Sends heartbeats to a server from a consumer.
     *
     * @description ### Usage notes
     * *   Connections between consumers and servers are established by sending heartbeats at regular intervals. If a server does not receive heartbeats from a consumer on schedule, the server deletes the consumer.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Sends heartbeats to a server from a consumer.
     *
     * @description ### Usage notes
     * *   Connections between consumers and servers are established by sending heartbeats at regular intervals. If a server does not receive heartbeats from a consumer on schedule, the server deletes the consumer.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 更新指定消费组消费数据时Shard的checkpoint。
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toArray(request.body))
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
     * @summary 更新指定消费组消费数据时Shard的checkpoint。
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
     * @summary CreateAlert
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
     * @summary CreateAlert
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
     * @summary Creates a dataset.
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
     * @summary Creates a dataset.
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
     * @summary Creates a tag table.
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
     * @summary Creates a tag table.
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
     * @summary Creates a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   You can create up to 100 Logtail configurations in a project.
     * *   The Logtail configuration is planned out. For more information, see [Logtail configurations](https://help.aliyun.com/document_detail/29058.html).
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
     * @summary Creates a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   You can create up to 100 Logtail configurations in a project.
     * *   The Logtail configuration is planned out. For more information, see [Logtail configurations](https://help.aliyun.com/document_detail/29058.html).
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
     * @summary Creates a consumer group for a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   You can create up to 30 consumer groups for a Logstore.
     * *   Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDKs for Java. For more information, see [Consume log data](https://help.aliyun.com/document_detail/120035.html) and [Use consumer groups to consume data](https://help.aliyun.com/document_detail/28998.html).
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
     * @summary Creates a consumer group for a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   You can create up to 30 consumer groups for a Logstore.
     * *   Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDKs for Java. For more information, see [Consume log data](https://help.aliyun.com/document_detail/120035.html) and [Use consumer groups to consume data](https://help.aliyun.com/document_detail/28998.html).
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
     * @summary Creates a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Creates a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Binds a new custom domain name to a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Binds a new custom domain name to a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 创建数据加工任务
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
     * @summary 创建数据加工任务
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
     * @summary Creates indexes for a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            body.put("line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduce)) {
            body.put("log_reduce", request.logReduce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduceBlackList)) {
            body.put("log_reduce_black_list", request.logReduceBlackList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduceWhiteList)) {
            body.put("log_reduce_white_list", request.logReduceWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTextLen)) {
            body.put("max_text_len", request.maxTextLen);
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
     * @summary Creates indexes for a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Create a Logstore
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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

        if (!com.aliyun.teautil.Common.isUnset(request.shardCount)) {
            body.put("shardCount", request.shardCount);
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
     * @summary Create a Logstore
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Enables the service log feature for a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Enables the service log feature for a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Creates a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Creates a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Creates a machine group.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Creates a machine group.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 创建OSS投递任务
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
     * @summary 创建OSS投递任务
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
     * @summary 创建OSSHDFS投递任务
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
     * @summary 创建OSSHDFS投递任务
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
     * @summary 创建OSS导入任务
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
     * @summary 创建OSS导入任务
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
     * @summary Creates an Object Storage Service (OSS) external store.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request CreateOssExternalStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssExternalStoreResponse
     */
    public CreateOssExternalStoreResponse createOssExternalStoreWithOptions(String project, CreateOssExternalStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalStoreName)) {
            body.put("externalStoreName", request.externalStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            body.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateOssExternalStoreResponse());
    }

    /**
     * @summary Creates an Object Storage Service (OSS) external store.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request CreateOssExternalStoreRequest
     * @return CreateOssExternalStoreResponse
     */
    public CreateOssExternalStoreResponse createOssExternalStore(String project, CreateOssExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOssExternalStoreWithOptions(project, request, headers, runtime);
    }

    /**
     * @summary Creates a project.
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
     * @summary Creates a project.
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
     * @summary Creates an ApsaraDB RDS external store.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request CreateRdsExternalStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRdsExternalStoreResponse
     */
    public CreateRdsExternalStoreResponse createRdsExternalStoreWithOptions(String project, CreateRdsExternalStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalStoreName)) {
            body.put("externalStoreName", request.externalStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            body.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRdsExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateRdsExternalStoreResponse());
    }

    /**
     * @summary Creates an ApsaraDB RDS external store.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request CreateRdsExternalStoreRequest
     * @return CreateRdsExternalStoreResponse
     */
    public CreateRdsExternalStoreResponse createRdsExternalStore(String project, CreateRdsExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRdsExternalStoreWithOptions(project, request, headers, runtime);
    }

    /**
     * @summary Creates a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Creates a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 创建定时SQL任务
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
     * @summary 创建定时SQL任务
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
     * @summary 创建独享sql实例
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
     * @summary 创建独享sql实例
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
     * @summary 创建StoreView
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
     * @summary 创建StoreView
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
     * @summary 创建Ticket
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
     * @summary 创建Ticket
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
     * @summary 删除告警
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
     * @summary 删除告警
     *
     * @return DeleteAlertResponse
     */
    public DeleteAlertResponse deleteAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * @summary Removes data from a dataset.
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
     * @summary Removes data from a dataset.
     *
     * @return DeleteAnnotationDataResponse
     */
    public DeleteAnnotationDataResponse deleteAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * @summary Deletes a dataset.
     *
     * @description You can delete a dataset only if no data exists in the dataset.
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
     * @summary Deletes a dataset.
     *
     * @description You can delete a dataset only if no data exists in the dataset.
     *
     * @return DeleteAnnotationDataSetResponse
     */
    public DeleteAnnotationDataSetResponse deleteAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * @summary Deletes a tag table.
     *
     * @description Only non-built-in tags can be deleted.
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
     * @summary Deletes a tag table.
     *
     * @description Only non-built-in tags can be deleted.
     *
     * @return DeleteAnnotationLabelResponse
     */
    public DeleteAnnotationLabelResponse deleteAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
     * @summary 通过调用DeleteCollectionPolicy删除配置的日志采集规则
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteCollectionPolicyResponse());
    }

    /**
     * @summary 通过调用DeleteCollectionPolicy删除配置的日志采集规则
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
     * @summary Deletes a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If a Logtail configuration is applied to a machine group, you cannot collect data from the machine group after you delete the Logtail configuration.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The name of the required Logtail configuration is obtained. For more information, see [ListConfig](https://help.aliyun.com/document_detail/29043.html).
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
     * @summary Deletes a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If a Logtail configuration is applied to a machine group, you cannot collect data from the machine group after you delete the Logtail configuration.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The name of the required Logtail configuration is obtained. For more information, see [ListConfig](https://help.aliyun.com/document_detail/29043.html).
     *
     * @return DeleteConfigResponse
     */
    public DeleteConfigResponse deleteConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * @summary Deletes a consumer group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a consumer group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(String project, String logstore, String consumerGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupWithOptions(project, logstore, consumerGroup, headers, runtime);
    }

    /**
     * @summary Deletes a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Deletes a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     *
     * @return DeleteDashboardResponse
     */
    public DeleteDashboardResponse deleteDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
     * @summary Deletes a custom domain name that is bound to a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a custom domain name that is bound to a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(String project, String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(project, domainName, headers, runtime);
    }

    /**
     * @summary 删除数据加工任务
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
     * @summary 删除数据加工任务
     *
     * @return DeleteETLResponse
     */
    public DeleteETLResponse deleteETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * @summary Deletes an external store.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExternalStoreResponse
     */
    public DeleteExternalStoreResponse deleteExternalStoreWithOptions(String project, String externalStoreName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores/" + externalStoreName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteExternalStoreResponse());
    }

    /**
     * @summary Deletes an external store.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteExternalStoreResponse
     */
    public DeleteExternalStoreResponse deleteExternalStore(String project, String externalStoreName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExternalStoreWithOptions(project, externalStoreName, headers, runtime);
    }

    /**
     * @summary Deletes an index of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes an index of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteIndexResponse
     */
    public DeleteIndexResponse deleteIndex(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIndexWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary Deletes a Logstore, including all shards and indexes in the Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a Logstore, including all shards and indexes in the Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogStoreWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary 关闭项目的服务日志记录。
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
     * @summary 关闭项目的服务日志记录。
     *
     * @return DeleteLoggingResponse
     */
    public DeleteLoggingResponse deleteLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoggingWithOptions(project, headers, runtime);
    }

    /**
     * @summary Deletes a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Deletes a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
     *
     * @return DeleteLogtailPipelineConfigResponse
     */
    public DeleteLogtailPipelineConfigResponse deleteLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * @summary Deletes a machine group. If the Logtail configurations for log collection are applied to a machine group, the configurations are disassociated from the machine group after the machine group is deleted.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a machine group. If the Logtail configurations for log collection are applied to a machine group, the configurations are disassociated from the machine group after the machine group is deleted.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteMachineGroupResponse
     */
    public DeleteMachineGroupResponse deleteMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * @summary 删除OSS投递任务
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
     * @summary 删除OSS投递任务
     *
     * @return DeleteOSSExportResponse
     */
    public DeleteOSSExportResponse deleteOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 删除OSSHDFS投递任务
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
     * @summary 删除OSSHDFS投递任务
     *
     * @return DeleteOSSHDFSExportResponse
     */
    public DeleteOSSHDFSExportResponse deleteOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 删除OSS导入任务
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
     * @summary 删除OSS导入任务
     *
     * @return DeleteOSSIngestionResponse
     */
    public DeleteOSSIngestionResponse deleteOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * @summary 删除project
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(String project, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
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
     * @summary 删除project
     *
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(project, headers, runtime);
    }

    /**
     * @summary Deletes a project policy.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a project policy.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteProjectPolicyResponse
     */
    public DeleteProjectPolicyResponse deleteProjectPolicy(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectPolicyWithOptions(project, headers, runtime);
    }

    /**
     * @summary Deletes a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Deletes a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteSavedSearchResponse
     */
    public DeleteSavedSearchResponse deleteSavedSearch(String project, String savedsearchName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSavedSearchWithOptions(project, savedsearchName, headers, runtime);
    }

    /**
     * @summary 删除定时SQL任务
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
     * @summary 删除定时SQL任务
     *
     * @return DeleteScheduledSQLResponse
     */
    public DeleteScheduledSQLResponse deleteScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * @deprecated OpenAPI DeleteShipper is deprecated
     *
     * @summary Deletes the log shipping job of a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteShipperResponse
     */
    // Deprecated
    public DeleteShipperResponse deleteShipperWithOptions(String project, String logstore, String shipperName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteShipper"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shipper/" + shipperName + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteShipperResponse());
    }

    /**
     * @deprecated OpenAPI DeleteShipper is deprecated
     *
     * @summary Deletes the log shipping job of a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return DeleteShipperResponse
     */
    // Deprecated
    public DeleteShipperResponse deleteShipper(String project, String logstore, String shipperName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteShipperWithOptions(project, logstore, shipperName, headers, runtime);
    }

    /**
     * @summary 删除StoreView
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
     * @summary 删除StoreView
     *
     * @return DeleteStoreViewResponse
     */
    public DeleteStoreViewResponse deleteStoreView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStoreViewWithOptions(project, name, headers, runtime);
    }

    /**
     * @summary 禁用告警
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
     * @summary 禁用告警
     *
     * @return DisableAlertResponse
     */
    public DisableAlertResponse disableAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * @summary 禁用定时SQL任务
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
     * @summary 禁用定时SQL任务
     *
     * @return DisableScheduledSQLResponse
     */
    public DisableScheduledSQLResponse disableScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * @summary 启用告警
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
     * @summary 启用告警
     *
     * @return EnableAlertResponse
     */
    public EnableAlertResponse enableAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * @summary 启用定时SQL任务
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
     * @summary 启用定时SQL任务
     *
     * @return EnableScheduledSQLResponse
     */
    public EnableScheduledSQLResponse enableScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * @summary GetAlert
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
     * @summary GetAlert
     *
     * @return GetAlertResponse
     */
    public GetAlertResponse getAlert(String project, String alertName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAlertWithOptions(project, alertName, headers, runtime);
    }

    /**
     * @summary Queries data in a dataset based on the unique identifier of the data.
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
     * @summary Queries data in a dataset based on the unique identifier of the data.
     *
     * @return GetAnnotationDataResponse
     */
    public GetAnnotationDataResponse getAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

    /**
     * @summary Queries a dataset.
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
     * @summary Queries a dataset.
     *
     * @return GetAnnotationDataSetResponse
     */
    public GetAnnotationDataSetResponse getAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

    /**
     * @summary Queries a tag table by using a label id.
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
     * @summary Queries a tag table by using a label id.
     *
     * @return GetAnnotationLabelResponse
     */
    public GetAnnotationLabelResponse getAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
     * @summary Queries the Logtail configurations that are applied to a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the Logtail configurations that are applied to a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetAppliedConfigsResponse
     */
    public GetAppliedConfigsResponse getAppliedConfigs(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedConfigsWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * @summary Queries the machine groups to which a Logtail configuration is bound.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the machine groups to which a Logtail configuration is bound.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetAppliedMachineGroupsResponse
     */
    public GetAppliedMachineGroupsResponse getAppliedMachineGroups(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedMachineGroupsWithOptions(project, configName, headers, runtime);
    }

    /**
     * @summary Queries the checkpoints of a shard from which data is consumed by a consumer group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the checkpoints of a shard from which data is consumed by a consumer group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 调用GetCollectionPolicy获取对应的规则
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
     * @summary 调用GetCollectionPolicy获取对应的规则
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
     * @summary Queries the details of a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The name of the required Logtail configuration is obtained. For more information, see [ListConfig](https://help.aliyun.com/document_detail/29043.html).
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
     * @summary Queries the details of a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The name of the required Logtail configuration is obtained. For more information, see [ListConfig](https://help.aliyun.com/document_detail/29043.html).
     *
     * @return GetConfigResponse
     */
    public GetConfigResponse getConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * @summary Queries the contextual logs of a specified log.
     *
     * @description *   You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
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
            new TeaPair("pathname", "/logstores/" + logstore + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetContextLogsResponse());
    }

    /**
     * @summary Queries the contextual logs of a specified log.
     *
     * @description *   You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a cursor based on a point in time.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   The following content describes the relationships among a cursor, project, Logstore, and shard:
     *     *   A project can have multiple Logstores.
     *     *   A Logstore can have multiple shards.
     *     *   You can use a cursor to obtain a log in a shard.
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
     * @summary Queries a cursor based on a point in time.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   The following content describes the relationships among a cursor, project, Logstore, and shard:
     *     *   A project can have multiple Logstores.
     *     *   A Logstore can have multiple shards.
     *     *   You can use a cursor to obtain a log in a shard.
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
     * @summary Queries the server time of a cursor.
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
     * @summary Queries the server time of a cursor.
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
     * @summary Queries a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Queries a dashboard.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     *
     * @return GetDashboardResponse
     */
    public GetDashboardResponse getDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
     * @summary 获取数据加工任务信息
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
     * @summary 获取数据加工任务信息
     *
     * @return GetETLResponse
     */
    public GetETLResponse getETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * @summary Queries the details of an external store.
     *
     * @description *   The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExternalStoreResponse
     */
    public GetExternalStoreResponse getExternalStoreWithOptions(String project, String externalStoreName, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores/" + externalStoreName + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetExternalStoreResponse());
    }

    /**
     * @summary Queries the details of an external store.
     *
     * @description *   The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetExternalStoreResponse
     */
    public GetExternalStoreResponse getExternalStore(String project, String externalStoreName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getExternalStoreWithOptions(project, externalStoreName, headers, runtime);
    }

    /**
     * @summary Queries the distribution of logs that meet the specified search conditions in a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
     *     *   Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.
     *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
     * > Simple Log Service calculates the difference between the log time that is specified by the __time__ field and the receiving time that is specified by the __tag__:__receive_time__ field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
     * *   Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see [Use GetHistograms to query the distribution of logs](https://help.aliyun.com/document_detail/462234.html).
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
     * @summary Queries the distribution of logs that meet the specified search conditions in a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
     *     *   Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.
     *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
     * > Simple Log Service calculates the difference between the log time that is specified by the __time__ field and the receiving time that is specified by the __tag__:__receive_time__ field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
     * *   Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see [Use GetHistograms to query the distribution of logs](https://help.aliyun.com/document_detail/462234.html).
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
     * @summary Queries the index of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the index of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetIndexResponse
     */
    public GetIndexResponse getIndex(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndexWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary Queries the details of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the details of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetLogStoreResponse
     */
    public GetLogStoreResponse getLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary 获取LogStore计量模式
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
     * @summary 获取LogStore计量模式
     *
     * @return GetLogStoreMeteringModeResponse
     */
    public GetLogStoreMeteringModeResponse getLogStoreMeteringMode(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreMeteringModeWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary Queries the service log configuration of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the service log configuration of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetLoggingResponse
     */
    public GetLoggingResponse getLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoggingWithOptions(project, headers, runtime);
    }

    /**
     * @summary Queries the logs of a Logstore in a project.
     *
     * @description ### Usage notes
     * > Simple Log Service allows you to create a Scheduled SQL job. For more information, see [Create a Scheduled SQL job](https://help.aliyun.com/document_detail/286457.html).
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot forecast the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
     *         Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios. 
     *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
     * > Simple Log Service calculates the difference between the log time that is specified by the __time__ field and the receiving time that is specified by the __tag__:**receive_time** field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
     * *   Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see [Examples of calling the GetLogs operation by using Simple Log Service SDK for Java](https://help.aliyun.com/document_detail/407683.html) and [Examples of calling the GetLogs operation by using Simple Log Service SDK for Python](https://help.aliyun.com/document_detail/407684.html).
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
     * @summary Queries the logs of a Logstore in a project.
     *
     * @description ### Usage notes
     * > Simple Log Service allows you to create a Scheduled SQL job. For more information, see [Create a Scheduled SQL job](https://help.aliyun.com/document_detail/286457.html).
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot forecast the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
     *         Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios. 
     *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
     *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
     * > Simple Log Service calculates the difference between the log time that is specified by the __time__ field and the receiving time that is specified by the __tag__:**receive_time** field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval [-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
     * *   Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see [Examples of calling the GetLogs operation by using Simple Log Service SDK for Java](https://help.aliyun.com/document_detail/407683.html) and [Examples of calling the GetLogs operation by using Simple Log Service SDK for Python](https://help.aliyun.com/document_detail/407684.html).
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
     * @summary Queries the raw log data in a Logstore of a project. The returned result shows the raw log data in a specific time range. The returned results are compressed and transmitted.
     *
     * @description *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times you must call this API operation to obtain a complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation again to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:
     * 1.  1.  Real-time data: The difference between the time record in the log and the current server time is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as real-time data. This type of log is usually generated in common scenarios.
     * 2.  2.  Historical data: The difference between the time record in the log and the current server time is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
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
     * @summary Queries the raw log data in a Logstore of a project. The returned result shows the raw log data in a specific time range. The returned results are compressed and transmitted.
     *
     * @description *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times you must call this API operation to obtain a complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation again to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
     * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:
     * 1.  1.  Real-time data: The difference between the time record in the log and the current server time is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as real-time data. This type of log is usually generated in common scenarios.
     * 2.  2.  Historical data: The difference between the time record in the log and the current server time is within the interval [-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
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
     * @summary Queries the details of a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Queries the details of a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
     *
     * @return GetLogtailPipelineConfigResponse
     */
    public GetLogtailPipelineConfigResponse getLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    /**
     * @summary GetMLServiceResults
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
     * @summary GetMLServiceResults
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
     * @summary Queries the details of a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the details of a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetMachineGroupResponse
     */
    public GetMachineGroupResponse getMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

    /**
     * @summary 获取 MetricStore 计量模式
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
     * @summary 获取 MetricStore 计量模式
     *
     * @return GetMetricStoreMeteringModeResponse
     */
    public GetMetricStoreMeteringModeResponse getMetricStoreMeteringMode(String project, String metricStore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetricStoreMeteringModeWithOptions(project, metricStore, headers, runtime);
    }

    /**
     * @summary 获取OSS投递任务
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
     * @summary 获取OSS投递任务
     *
     * @return GetOSSExportResponse
     */
    public GetOSSExportResponse getOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary Get OSSHDFS Exports
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
     * @summary Get OSSHDFS Exports
     *
     * @return GetOSSHDFSExportResponse
     */
    public GetOSSHDFSExportResponse getOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 获取oss导入任务信息
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
     * @summary 获取oss导入任务信息
     *
     * @return GetOSSIngestionResponse
     */
    public GetOSSIngestionResponse getOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * @summary Queries the details of a project.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the details of a project.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectWithOptions(project, headers, runtime);
    }

    /**
     * @summary Queries logs in a project. You can use this operation to query logs at the project level.
     *
     * @description ### Usage notes
     * *   You can use the query parameter to specify a standard SQL statement.
     * *   You must specify a project in the domain name of the request.
     * *   You must specify a Logstore in the FROM clause of the SQL statement. A Logstore can be used as an SQL table.
     * *   You must specify a time range in the SQL statement by using the __date__ parameter or __time__ parameter. The value of the __date__ parameter is a timestamp, and the value of the __time__ parameter is an integer. The unit of the __time__ parameter is seconds.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries logs in a project. You can use this operation to query logs at the project level.
     *
     * @description ### Usage notes
     * *   You can use the query parameter to specify a standard SQL statement.
     * *   You must specify a project in the domain name of the request.
     * *   You must specify a Logstore in the FROM clause of the SQL statement. A Logstore can be used as an SQL table.
     * *   You must specify a time range in the SQL statement by using the __date__ parameter or __time__ parameter. The value of the __date__ parameter is a timestamp, and the value of the __time__ parameter is an integer. The unit of the __time__ parameter is seconds.
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a project policy.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a project policy.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetProjectPolicyResponse
     */
    public GetProjectPolicyResponse getProjectPolicy(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProjectPolicyWithOptions(project, headers, runtime);
    }

    /**
     * @summary Queries a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a saved search.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return GetSavedSearchResponse
     */
    public GetSavedSearchResponse getSavedSearch(String project, String savedsearchName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSavedSearchWithOptions(project, savedsearchName, headers, runtime);
    }

    /**
     * @summary 查看定时SQL任务
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
     * @summary 查看定时SQL任务
     *
     * @return GetScheduledSQLResponse
     */
    public GetScheduledSQLResponse getScheduledSQL(String project, String scheduledSQLName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledSQLWithOptions(project, scheduledSQLName, headers, runtime);
    }

    /**
     * @deprecated OpenAPI GetShipperStatus is deprecated
     *
     * @summary Queries the status of a log shipping job.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request GetShipperStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetShipperStatusResponse
     */
    // Deprecated
    public GetShipperStatusResponse getShipperStatusWithOptions(String project, String logstore, String shipperName, GetShipperStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("from", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("to", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShipperStatus"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shipper/" + shipperName + "/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetShipperStatusResponse());
    }

    /**
     * @deprecated OpenAPI GetShipperStatus is deprecated
     *
     * @summary Queries the status of a log shipping job.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request GetShipperStatusRequest
     * @return GetShipperStatusResponse
     */
    // Deprecated
    public GetShipperStatusResponse getShipperStatus(String project, String logstore, String shipperName, GetShipperStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShipperStatusWithOptions(project, logstore, shipperName, request, headers, runtime);
    }

    /**
     * @summary getSlsService
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
     * @summary getSlsService
     *
     * @return GetSlsServiceResponse
     */
    public GetSlsServiceResponse getSlsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSlsServiceWithOptions(headers, runtime);
    }

    /**
     * @summary 查询独享sql实例
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
     * @summary 查询独享sql实例
     *
     * @return GetSqlInstanceResponse
     */
    public GetSqlInstanceResponse getSqlInstance(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSqlInstanceWithOptions(project, headers, runtime);
    }

    /**
     * @summary 查询StoreView
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
     * @summary 查询StoreView
     *
     * @return GetStoreViewResponse
     */
    public GetStoreViewResponse getStoreView(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoreViewWithOptions(project, name, headers, runtime);
    }

    /**
     * @summary 查询StoreView索引
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
     * @summary 查询StoreView索引
     *
     * @return GetStoreViewIndexResponse
     */
    public GetStoreViewIndexResponse getStoreViewIndex(String project, String name) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoreViewIndexWithOptions(project, name, headers, runtime);
    }

    /**
     * @summary 查询告警列表
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
     * @summary 查询告警列表
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
     * @summary Queries data in a dataset.
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
     * @summary Queries data in a dataset.
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
     * @summary Queries a list of datasets.
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
     * @summary Queries a list of datasets.
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
     * @summary Queries a list of tag tables.
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
     * @summary Queries a list of tag tables.
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
     * @summary 通过调用ListCollectionPolicies接口查看配置的日志采集规则
     *
     * @param tmpReq ListCollectionPoliciesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCollectionPoliciesResponse
     */
    public ListCollectionPoliciesResponse listCollectionPoliciesWithOptions(ListCollectionPoliciesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCollectionPoliciesShrinkRequest request = new ListCollectionPoliciesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attribute)) {
            request.attributeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attribute, "attribute", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeShrink)) {
            query.put("attribute", request.attributeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            query.put("dataCode", request.dataCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("policyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("productCode", request.productCode);
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
     * @summary 通过调用ListCollectionPolicies接口查看配置的日志采集规则
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
     * @summary Queries all Logtail configurations in a project.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Queries all Logtail configurations in a project.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Queries all consumer groups of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries all consumer groups of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return ListConsumerGroupResponse
     */
    public ListConsumerGroupResponse listConsumerGroup(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary Queries a list of dashboards.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     *
     * @param request ListDashboardRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDashboardResponse
     */
    public ListDashboardResponse listDashboardWithOptions(String project, ListDashboardRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * @summary Queries a list of dashboards.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
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
     * @summary Queries the custom domain names that are bound to projects.
     *
     * @description *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Only one custom domain name can be bound to each project.
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
     * @summary Queries the custom domain names that are bound to projects.
     *
     * @description *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Only one custom domain name can be bound to each project.
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
     * @summary 列出数据加工任务
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
     * @summary 列出数据加工任务
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
     * @summary Queries a list of external stores.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request ListExternalStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExternalStoreResponse
     */
    public ListExternalStoreResponse listExternalStoreWithOptions(String project, ListExternalStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalStoreName)) {
            query.put("externalStoreName", request.externalStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizs)) {
            query.put("sizs", request.sizs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListExternalStoreResponse());
    }

    /**
     * @summary Queries a list of external stores.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request ListExternalStoreRequest
     * @return ListExternalStoreResponse
     */
    public ListExternalStoreResponse listExternalStore(String project, ListExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listExternalStoreWithOptions(project, request, headers, runtime);
    }

    /**
     * @summary Queries all Logstores or Logstores that match specific conditions in a project.
     *
     * @description ### Usage notes
     * * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * * An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * * The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * ### Authentication resources
     * The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.
     * |Action|Resource|
     * |:---|:---|
     * |`log:ListLogStores`|`acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/*`|
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
     * @summary Queries all Logstores or Logstores that match specific conditions in a project.
     *
     * @description ### Usage notes
     * * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * * An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O&#x26;M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * * The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * ### Authentication resources
     * The following table describes the authorization information that is required for this operation. You can add the information to the Action element of a RAM policy statement to grant a RAM user or a RAM role the permissions to call this operation.
     * |Action|Resource|
     * |:---|:---|
     * |`log:ListLogStores`|`acs:log:{#regionId}:{#accountId}:project/{#ProjectName}/logstore/*`|
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
     * @summary Queries a list of Logtail pipeline configurations that meet the specified conditions.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Queries a list of Logtail pipeline configurations that meet the specified conditions.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Queries the machine groups of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries the machine groups of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a list of machines that are connected to Simple Log Service in a specified machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a list of machines that are connected to Simple Log Service in a specified machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 列出OSS投递任务
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
     * @summary 列出OSS投递任务
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
     * @summary 列举OSSHDFS投递任务
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
     * @summary 列举OSSHDFS投递任务
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
     * @summary 列出oss导入任务
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
     * @summary 列出oss导入任务
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
     * @summary Queries the projects that meet specified conditions.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request ListProjectRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectResponse
     */
    public ListProjectResponse listProjectWithOptions(ListProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary Queries the projects that meet specified conditions.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a list of saved searches.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a list of saved searches.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 列举定时SQL任务
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
     * @summary 列举定时SQL任务
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
     * @summary Queries a list of shards in a Logstore.
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
     * @summary Queries a list of shards in a Logstore.
     *
     * @return ListShardsResponse
     */
    public ListShardsResponse listShards(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardsWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @deprecated OpenAPI ListShipper is deprecated
     *
     * @summary Queries a list of log shipping jobs in a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListShipperResponse
     */
    // Deprecated
    public ListShipperResponse listShipperWithOptions(String project, String logstore, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShipper"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/logstores/" + logstore + "/shipper"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListShipperResponse());
    }

    /**
     * @deprecated OpenAPI ListShipper is deprecated
     *
     * @summary Queries a list of log shipping jobs in a Logstore.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return ListShipperResponse
     */
    // Deprecated
    public ListShipperResponse listShipper(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShipperWithOptions(project, logstore, headers, runtime);
    }

    /**
     * @summary 查询StoreView列表
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
     * @summary 查询StoreView列表
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
     * @summary Queries a list of tags for one or more resources. You can query tags for resources by resource type or filter resources by tag. Each tag is a key-value pair.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Queries a list of tags for one or more resources. You can query tags for resources by resource type or filter resources by tag. Each tag is a key-value pair.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 合并两个相邻的readwrite状态的Shards。在参数中指定一个shardID，服务端自动找相邻的下一个Shard进行合并。
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
     * @summary 合并两个相邻的readwrite状态的Shards。在参数中指定一个shardID，服务端自动找相邻的下一个Shard进行合并。
     *
     * @return MergeShardResponse
     */
    public MergeShardResponse mergeShard(String project, String logstore, String shard) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.mergeShardWithOptions(project, logstore, shard, headers, runtime);
    }

    /**
     * @summary openSlsService
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
     * @summary openSlsService
     *
     * @return OpenSlsServiceResponse
     */
    public OpenSlsServiceResponse openSlsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSlsServiceWithOptions(headers, runtime);
    }

    /**
     * @summary Adds data to a dataset for storage.
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
     * @summary Adds data to a dataset for storage.
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
     * @summary Creates a project policy.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.
     *     *   You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see [RAM](https://help.aliyun.com/document_detail/128139.html).
     *     *   If you set the Principal element to an asterisk (\\*) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\\*) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.
     *     *   You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.
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
     * @summary Creates a project policy.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.
     *     *   You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see [RAM](https://help.aliyun.com/document_detail/128139.html).
     *     *   If you set the Principal element to an asterisk (\\*) and do not configure the Condition element when you configure a project policy, the policy applies to all users except for the project owner. If you set the Principal element to an asterisk (\\*) and configure the Condition element when you configure a project policy, the policy applies to all users including the project owner.
     *     *   You can configure multiple project policies for a project. The total size of the policies cannot exceed 16 KB.
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
     * @summary 设置project传输加速状态
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
     * @summary 设置project传输加速状态
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
     * @summary Sends multiple logs to Simple Log Service in one request.
     *
     * @description ### [](#)Usage notes
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html) and [Manage a Logstore](https://help.aliyun.com/document_detail/48990.html).
     * *   You can call this operation to collect logs from web pages or clients.
     * *   If you use web tracking to collect logs and you do not call this operation, you can send only one log to Simple Log Service in a request. For more information, see [Use web tracking to collect logs](https://help.aliyun.com/document_detail/31752.html).
     * *   If you want to collect a large amount of log data, you can call this operation to send multiple logs to Simple Log Service in one request.
     * *   Before you can call this operation to send logs to a Logstore, you must enable web tracking for the Logstore. For more information, see [Use web tracking to collect logs](https://help.aliyun.com/document_detail/31752.html).
     * *   You cannot call this operation to send the logs of multiple topics to Simple Log Service at a time.
     * *   If you call this operation, anonymous users from the Internet are granted the write permissions on the Logstore. This may generate dirty data because AccessKey pair-based authentication is not performed.
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
     * @summary Sends multiple logs to Simple Log Service in one request.
     *
     * @description ### [](#)Usage notes
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong, the region of the project, and the name of the Logstore to which the logs belong. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html) and [Manage a Logstore](https://help.aliyun.com/document_detail/48990.html).
     * *   You can call this operation to collect logs from web pages or clients.
     * *   If you use web tracking to collect logs and you do not call this operation, you can send only one log to Simple Log Service in a request. For more information, see [Use web tracking to collect logs](https://help.aliyun.com/document_detail/31752.html).
     * *   If you want to collect a large amount of log data, you can call this operation to send multiple logs to Simple Log Service in one request.
     * *   Before you can call this operation to send logs to a Logstore, you must enable web tracking for the Logstore. For more information, see [Use web tracking to collect logs](https://help.aliyun.com/document_detail/31752.html).
     * *   You cannot call this operation to send the logs of multiple topics to Simple Log Service at a time.
     * *   If you call this operation, anonymous users from the Internet are granted the write permissions on the Logstore. This may generate dirty data because AccessKey pair-based authentication is not performed.
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
     * @deprecated OpenAPI QueryMLServiceResults is deprecated
     *
     * @summary queryMLServiceResults
     *
     * @param request QueryMLServiceResultsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMLServiceResultsResponse
     */
    // Deprecated
    public QueryMLServiceResultsResponse queryMLServiceResultsWithOptions(String serviceName, QueryMLServiceResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowBuiltin)) {
            query.put("allowBuiltin", request.allowBuiltin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMLServiceResults"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ml/service/" + serviceName + "/analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryMLServiceResultsResponse());
    }

    /**
     * @deprecated OpenAPI QueryMLServiceResults is deprecated
     *
     * @summary queryMLServiceResults
     *
     * @param request QueryMLServiceResultsRequest
     * @return QueryMLServiceResultsResponse
     */
    // Deprecated
    public QueryMLServiceResultsResponse queryMLServiceResults(String serviceName, QueryMLServiceResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMLServiceResultsWithOptions(serviceName, request, headers, runtime);
    }

    /**
     * @summary 刷新token
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
     * @summary 刷新token
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
     * @summary Removes a Logtail configuration from a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Removes a Logtail configuration from a machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @return RemoveConfigFromMachineGroupResponse
     */
    public RemoveConfigFromMachineGroupResponse removeConfigFromMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConfigFromMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

    /**
     * @summary Splits a shard in the readwrite state.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the `[BeginKey,EndKey)` format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see [Shard](https://help.aliyun.com/document_detail/28976.html).
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
     * @summary Splits a shard in the readwrite state.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the `[BeginKey,EndKey)` format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see [Shard](https://help.aliyun.com/document_detail/28976.html).
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
     * @summary 启动数据加工任务
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
     * @summary 启动数据加工任务
     *
     * @return StartETLResponse
     */
    public StartETLResponse startETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * @summary 启动OSS投递任务
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
     * @summary 启动OSS投递任务
     *
     * @return StartOSSExportResponse
     */
    public StartOSSExportResponse startOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 启动OSSHDFS投递任务
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
     * @summary 启动OSSHDFS投递任务
     *
     * @return StartOSSHDFSExportResponse
     */
    public StartOSSHDFSExportResponse startOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 启动OSS导入任务
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
     * @summary 启动OSS导入任务
     *
     * @return StartOSSIngestionResponse
     */
    public StartOSSIngestionResponse startOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * @summary 停止数据加工任务
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
     * @summary 停止数据加工任务
     *
     * @return StopETLResponse
     */
    public StopETLResponse stopETL(String project, String etlName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopETLWithOptions(project, etlName, headers, runtime);
    }

    /**
     * @summary 停止OSS投递任务
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
     * @summary 停止OSS投递任务
     *
     * @return StopOSSExportResponse
     */
    public StopOSSExportResponse stopOSSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 停止OSSHDFS投递任务
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
     * @summary 停止OSSHDFS投递任务
     *
     * @return StopOSSHDFSExportResponse
     */
    public StopOSSHDFSExportResponse stopOSSHDFSExport(String project, String ossExportName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSHDFSExportWithOptions(project, ossExportName, headers, runtime);
    }

    /**
     * @summary 停止OSS导入任务
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
     * @summary 停止OSS导入任务
     *
     * @return StopOSSIngestionResponse
     */
    public StopOSSIngestionResponse stopOSSIngestion(String project, String ossIngestionName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopOSSIngestionWithOptions(project, ossIngestionName, headers, runtime);
    }

    /**
     * @summary Creates and adds one or more tags to a specified resource. You can add tags only to projects.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Creates and adds one or more tags to a specified resource. You can add tags only to projects.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Detaches one or more tags from a resource. You can detach tags only from Simple Log Service projects. You can detach multiple or all tags from a Simple Log Service project at a time.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Detaches one or more tags from a resource. You can detach tags only from Simple Log Service projects. You can detach multiple or all tags from a Simple Log Service project at a time.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary 更新告警
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
     * @summary 更新告警
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
     * @summary Updates a dataset.
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
     * @summary Updates a dataset.
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
     * @summary Updates a tag table.
     *
     * @description You can update only the names of the tags in a tag set.
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
     * @summary Updates a tag table.
     *
     * @description You can update only the names of the tags in a tag set.
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
     * @summary Updates a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   After you update a Logtail configuration that is applied to a machine group, the new configuration immediately takes effect.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The Logtail configuration is planned out. For more information, see [Logtail configurations](https://help.aliyun.com/document_detail/29058.html).
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
     * @summary Updates a Logtail configuration.
     *
     * @description ### [](#)Usage notes
     * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     * *   After you update a Logtail configuration that is applied to a machine group, the new configuration immediately takes effect.
     * *   An AccessKey pair is created and obtained. For more information, see [AccessKey pair](https://help.aliyun.com/document_detail/29009.html).
     * The AccessKey pair of an Alibaba Cloud account has permissions on all API operations. Using these credentials to perform operations in Simple Log Service is a high-risk operation. We recommend that you use a RAM user to call API operations or perform routine O\\&M. To create a RAM user, log on to the RAM console. Make sure that the RAM user has the management permissions on Simple Log Service resources. For more information, see [Create a RAM user and authorize the RAM user to access Simple Log Service](https://help.aliyun.com/document_detail/47664.html).
     * *   The information that is required to query logs is obtained. The information includes the name of the project to which the logs belong and the region of the project. For more information, see [Manage a project](https://help.aliyun.com/document_detail/48984.html).
     * *   The Logtail configuration is planned out. For more information, see [Logtail configurations](https://help.aliyun.com/document_detail/29058.html).
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
     * @summary Updates the attributes of a consumer group.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates the attributes of a consumer group.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates a dashboard.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates a dashboard.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 更新数据加工任务
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
     * @summary 更新数据加工任务
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
     * @summary Updates the indexes of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keys)) {
            body.put("keys", request.keys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.line)) {
            body.put("line", request.line);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduce)) {
            body.put("log_reduce", request.logReduce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduceBlackList)) {
            body.put("log_reduce_black_list", request.logReduceBlackList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logReduceWhiteList)) {
            body.put("log_reduce_white_list", request.logReduceWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTextLen)) {
            body.put("max_text_len", request.maxTextLen);
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
     * @summary Updates the indexes of a Logstore.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates the attributes of a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
     * *   You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.
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
     * @summary Updates the attributes of a Logstore.
     *
     * @description ### Usage notes
     * *   Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
     * *   You can call the UpdateLogStore operation to change only the time-to-live (TTL) attribute.
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
     * @summary 更新LogStore计量模式
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
     * @summary 更新LogStore计量模式
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
     * @summary Updates the service log configurations of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates the service log configurations of a project.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Updates a Logtail pipeline configuration.
     *
     * @description The UK (London) region is supported. Supported regions are constantly updated.
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
     * @summary Modifies the configuration of a machine group.
     *
     * @description Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Modifies the configuration of a machine group.
     *
     * @description Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
     * @summary Modifies the machines in a machine group. You can add machine to or remove machines from the machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Modifies the machines in a machine group. You can add machine to or remove machines from the machine group.
     *
     * @description Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary 更新 MetricStore 计量模式
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
     * @summary 更新 MetricStore 计量模式
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
     * @summary 更新OSS投递任务
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
     * @summary 更新OSS投递任务
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
     * @summary 更新OSSHDFS投递任务
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
     * @summary 更新OSSHDFS投递任务
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
     * @summary 更新oss导入任务
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
     * @summary 更新oss导入任务
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
     * @summary Updates an Object Storage Service (OSS) external store.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request UpdateOssExternalStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssExternalStoreResponse
     */
    public UpdateOssExternalStoreResponse updateOssExternalStoreWithOptions(String project, String externalStoreName, UpdateOssExternalStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalStoreName)) {
            body.put("externalStoreName", request.externalStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            body.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores/" + externalStoreName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateOssExternalStoreResponse());
    }

    /**
     * @summary Updates an Object Storage Service (OSS) external store.
     *
     * @description ### [](#)Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
     *
     * @param request UpdateOssExternalStoreRequest
     * @return UpdateOssExternalStoreResponse
     */
    public UpdateOssExternalStoreResponse updateOssExternalStore(String project, String externalStoreName, UpdateOssExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOssExternalStoreWithOptions(project, externalStoreName, request, headers, runtime);
    }

    /**
     * @summary Updates a project.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates a project.
     *
     * @description ### Usage notes
     * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
     * @summary Updates an ApsaraDB RDS external store.
     *
     * @description Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
     *
     * @param request UpdateRdsExternalStoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRdsExternalStoreResponse
     */
    public UpdateRdsExternalStoreResponse updateRdsExternalStoreWithOptions(String project, String externalStoreName, UpdateRdsExternalStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> hostMap = new java.util.HashMap<>();
        hostMap.put("project", project);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalStoreName)) {
            body.put("externalStoreName", request.externalStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            body.put("parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeType)) {
            body.put("storeType", request.storeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("hostMap", hostMap),
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRdsExternalStore"),
            new TeaPair("version", "2020-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/externalstores/" + externalStoreName + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRdsExternalStoreResponse());
    }

    /**
     * @summary Updates an ApsaraDB RDS external store.
     *
     * @description Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
     *
     * @param request UpdateRdsExternalStoreRequest
     * @return UpdateRdsExternalStoreResponse
     */
    public UpdateRdsExternalStoreResponse updateRdsExternalStore(String project, String externalStoreName, UpdateRdsExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRdsExternalStoreWithOptions(project, externalStoreName, request, headers, runtime);
    }

    /**
     * @summary Updates a saved search.
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
     * @summary Updates a saved search.
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
     * @summary 更新定时SQL任务
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
     * @summary 更新定时SQL任务
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
     * @summary 更新独享sql实例
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
     * @summary 更新独享sql实例
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
     * @summary 更新StoreView
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
     * @summary 更新StoreView
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
     * @summary 调用UpsertCollectionPolicy接口更新采集策略的属性信息
     *
     * @param request UpsertCollectionPolicyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertCollectionPolicyResponse
     */
    public UpsertCollectionPolicyResponse upsertCollectionPolicyWithOptions(UpsertCollectionPolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attribute)) {
            body.put("attribute", request.attribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.centralizeConfig)) {
            body.put("centralizeConfig", request.centralizeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.centralizeEnabled)) {
            body.put("centralizeEnabled", request.centralizeEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataCode)) {
            body.put("dataCode", request.dataCode);
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpsertCollectionPolicyResponse());
    }

    /**
     * @summary 调用UpsertCollectionPolicy接口更新采集策略的属性信息
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

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
        this._endpointRule = "central";
    }


    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return ApplyConfigToMachineGroupResponse
     */
    public ApplyConfigToMachineGroupResponse applyConfigToMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConfigToMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

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

    public ChangeResourceGroupResponse changeResourceGroup(String project, ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.changeResourceGroupWithOptions(project, request, headers, runtime);
    }

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

    public ConsumerGroupHeartBeatResponse consumerGroupHeartBeat(String project, String logstore, String consumerGroup, ConsumerGroupHeartBeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.consumerGroupHeartBeatWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

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

    public CreateAnnotationDataSetResponse createAnnotationDataSet(CreateAnnotationDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnotationDataSetWithOptions(request, headers, runtime);
    }

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

    public CreateAnnotationLabelResponse createAnnotationLabel(CreateAnnotationLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAnnotationLabelWithOptions(request, headers, runtime);
    }

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

    public CreateConfigResponse createConfig(String project, CreateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigWithOptions(project, request, headers, runtime);
    }

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   You can create up to 30 consumer groups for a Logstore.
      * *   Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDKs for Java. For more information, see [Consume log data](~~120035~~) and [Use consumer groups to consume data](~~28998~~).
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
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   You can create up to 30 consumer groups for a Logstore.
      * *   Simple Log Service provides examples of both regular log consumption and consumer group-based log consumption by using Simple Log Service SDKs for Java. For more information, see [Consume log data](~~120035~~) and [Use consumer groups to consume data](~~28998~~).
      *
      * @param request CreateConsumerGroupRequest
      * @return CreateConsumerGroupResponse
     */
    public CreateConsumerGroupResponse createConsumerGroup(String project, String logstore, CreateConsumerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerGroupWithOptions(project, logstore, request, headers, runtime);
    }

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

    public CreateDashboardResponse createDashboard(String project, CreateDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDashboardWithOptions(project, request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
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
      * ### Usage notes
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request CreateLoggingRequest
      * @return CreateLoggingResponse
     */
    public CreateLoggingResponse createLogging(String project, CreateLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLoggingWithOptions(project, request, headers, runtime);
    }

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

    public CreateLogtailPipelineConfigResponse createLogtailPipelineConfig(String project, CreateLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLogtailPipelineConfigWithOptions(project, request, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProjectWithOptions(request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
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
      * ### Usage notes
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

    public DeleteAnnotationDataResponse deleteAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

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

    public DeleteAnnotationDataSetResponse deleteAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

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

    public DeleteAnnotationLabelResponse deleteAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAnnotationLabelWithOptions(labelId, headers, runtime);
    }

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

    public DeleteCollectionPolicyResponse deleteCollectionPolicy(String policyName, DeleteCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCollectionPolicyWithOptions(policyName, request, headers, runtime);
    }

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

    public DeleteConfigResponse deleteConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigWithOptions(project, configName, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteConsumerGroupResponse
     */
    public DeleteConsumerGroupResponse deleteConsumerGroup(String project, String logstore, String consumerGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConsumerGroupWithOptions(project, logstore, consumerGroup, headers, runtime);
    }

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

    public DeleteDashboardResponse deleteDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(String project, String domainName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(project, domainName, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteExternalStoreResponse
     */
    public DeleteExternalStoreResponse deleteExternalStore(String project, String externalStoreName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteExternalStoreWithOptions(project, externalStoreName, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteLogStoreResponse
     */
    public DeleteLogStoreResponse deleteLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogStoreWithOptions(project, logstore, headers, runtime);
    }

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

    public DeleteLoggingResponse deleteLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLoggingWithOptions(project, headers, runtime);
    }

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

    public DeleteLogtailPipelineConfigResponse deleteLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteMachineGroupResponse
     */
    public DeleteMachineGroupResponse deleteMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

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

    public DeleteProjectResponse deleteProject(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProjectWithOptions(project, headers, runtime);
    }

    /**
      * ### Usage notes
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteProjectPolicyResponse());
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteShipperResponse
     */
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return DeleteShipperResponse
     */
    public DeleteShipperResponse deleteShipper(String project, String logstore, String shipperName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteShipperWithOptions(project, logstore, shipperName, headers, runtime);
    }

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

    public GetAnnotationDataResponse getAnnotationData(String datasetId, String annotationdataId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataWithOptions(datasetId, annotationdataId, headers, runtime);
    }

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

    public GetAnnotationDataSetResponse getAnnotationDataSet(String datasetId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationDataSetWithOptions(datasetId, headers, runtime);
    }

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

    public GetAnnotationLabelResponse getAnnotationLabel(String labelId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnnotationLabelWithOptions(labelId, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return GetAppliedConfigsResponse
     */
    public GetAppliedConfigsResponse getAppliedConfigs(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedConfigsWithOptions(project, machineGroup, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return GetAppliedMachineGroupsResponse
     */
    public GetAppliedMachineGroupsResponse getAppliedMachineGroups(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAppliedMachineGroupsWithOptions(project, configName, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request GetCheckPointRequest
      * @return GetCheckPointResponse
     */
    public GetCheckPointResponse getCheckPoint(String project, String logstore, String consumerGroup, GetCheckPointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCheckPointWithOptions(project, logstore, consumerGroup, request, headers, runtime);
    }

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

    public GetCollectionPolicyResponse getCollectionPolicy(String policyName, GetCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCollectionPolicyWithOptions(policyName, request, headers, runtime);
    }

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

    public GetConfigResponse getConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConfigWithOptions(project, configName, headers, runtime);
    }

    /**
      * *   You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.
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
      * *   You can specify a log as the start log. The time range of a contextual query is one day before and one day after the generation time of the start log.
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
      * ### Usage notes
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
      * ### Usage notes
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

    public GetCursorTimeResponse getCursorTime(String project, String logstore, String shardId, GetCursorTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCursorTimeWithOptions(project, logstore, shardId, request, headers, runtime);
    }

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

    public GetDashboardResponse getDashboard(String project, String dashboardName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDashboardWithOptions(project, dashboardName, headers, runtime);
    }

    /**
      * *   The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).
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
      * *   The supported data sources of external stores include Object Storage Service (OSS) buckets and ApsaraDB RDS for MySQL databases in a virtual private cloud (VPC).
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
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *     *   Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:\\__receive_time\\_\\_ field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see [Use GetHistograms to query the distribution of logs](~~462234~~).
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
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   The time range is evenly divided into subintervals in the responses. If the time range that is specified in the request remains unchanged, the subintervals in the responses also remain unchanged.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *     *   Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds.
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:\\__receive_time\\_\\_ field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetHistograms operation by using Simple Log Service SDK for Java. For more information, see [Use GetHistograms to query the distribution of logs](~~462234~~).
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return GetLogStoreResponse
     */
    public GetLogStoreResponse getLogStore(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreWithOptions(project, logstore, headers, runtime);
    }

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

    public GetLogStoreMeteringModeResponse getLogStoreMeteringMode(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogStoreMeteringModeWithOptions(project, logstore, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return GetLoggingResponse
     */
    public GetLoggingResponse getLogging(String project) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLoggingWithOptions(project, headers, runtime);
    }

    /**
      * ### Usage notes
      * > Simple Log Service allows you to create a Scheduled SQL job. For more information, see [Create a Scheduled SQL job](~~286457~~).
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot forecast the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *         Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios. 
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:**receive_time** field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see [Examples of calling the GetLogs operation by using Simple Log Service SDK for Java](~~407683~~) and [Examples of calling the GetLogs operation by using Simple Log Service SDK for Python](~~407684~~).
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
      * ### Usage notes
      * > Simple Log Service allows you to create a Scheduled SQL job. For more information, see [Create a Scheduled SQL job](~~286457~~).
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot forecast the number of times that you must call this operation to obtain the complete result. In this case, you must check the value of the x-log-progress parameter in the response of each request and determine whether to call this operation one more time to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log after a short latency. The latency of a query varies based on the type of the log. Simple Log Service classifies logs into the following types based on the log time:
      *         Real-time data: The difference between the time record in a log and the current time on Simple Log Service is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as real-time data. This type of log is usually generated in common scenarios. 
      *     *   Historical data: The difference between the time record in a log and the current time on Simple Log Service is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and Simple Log Service received the log at 12:05:00, September 25, 2014 (UTC), Simple Log Service processes the log as historical data. This type of log is usually generated in data backfill scenarios.
      *     After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      * > Simple Log Service calculates the difference between the log time that is specified by the \\__time\\_\\_ field and the receiving time that is specified by the \\__tag\\_\\_:**receive_time** field for each log. The receiving time indicates the time at which Simple Log Service receives the log. If the difference is within the interval (-180 seconds,900 seconds], Simple Log Service processes the log as real-time data. If the difference is within the interval \\[-604,800 seconds,-180 seconds), Simple Log Service processes the log as historical data.
      * *   Simple Log Service provides examples on how to call the GetLogs operation by using Simple Log Service SDK for Java and Simple Log Service SDK for Python. For more information, see [Examples of calling the GetLogs operation by using Simple Log Service SDK for Java](~~407683~~) and [Examples of calling the GetLogs operation by using Simple Log Service SDK for Python](~~407684~~).
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
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times you must call this API operation to obtain a complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation again to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:
      * 1.  1.  Real-time data: The difference between the time record in the log and the current server time is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as real-time data. This type of log is usually generated in common scenarios.
      * 2.  2.  Historical data: The difference between the time record in the log and the current server time is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
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

        if (!com.aliyun.teautil.Common.isUnset(request.shard)) {
            body.put("shard", request.shard);
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
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   If the number of logs in a Logstore significantly changes, Simple Log Service cannot predict the number of times you must call this API operation to obtain a complete result. In this case, you must check the value of the progress parameter in the response of each request and determine whether to call this operation again to obtain the complete result. Each time you call this operation, the same number of charge units (CUs) are consumed.
      * *   After a log is written to a Logstore, you can call the GetHistograms or GetLogs operation to query the log. The latency of the query varies based on the type of the log. Simple Log Service classifies logs into the following types based on log timestamps:
      * 1.  1.  Real-time data: The difference between the time record in the log and the current server time is within the interval (-180 seconds,900 seconds]. For example, if a log was generated at 12:03:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as real-time data. This type of log is usually generated in common scenarios.
      * 2.  2.  Historical data: The difference between the time record in the log and the current server time is within the interval \\[-604,800 seconds,-180 seconds). For example, if a log was generated at 12:00:00, September 25, 2014 (UTC) and the server received the log at 12:05:00, September 25, 2014 (UTC), the server processes the log as historical data. This type of log is usually generated in data backfill scenarios. After real-time data is written to a Logstore, the data can be queried with a maximum latency of 3 seconds. For 99.9% of queries, the latency is no more than 1 second.
      *
      * @param request GetLogsV2Request
      * @return GetLogsV2Response
     */
    public GetLogsV2Response getLogsV2(String project, String logstore, GetLogsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetLogsV2Headers headers = new GetLogsV2Headers();
        return this.getLogsV2WithOptions(project, logstore, request, headers, runtime);
    }

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

    public GetLogtailPipelineConfigResponse getLogtailPipelineConfig(String project, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLogtailPipelineConfigWithOptions(project, configName, headers, runtime);
    }

    public GetMLServiceResultsResponse getMLServiceResultsWithOptions(String serviceName, GetMLServiceResultsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    public GetMLServiceResultsResponse getMLServiceResults(String serviceName, GetMLServiceResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMLServiceResultsWithOptions(serviceName, request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return GetMachineGroupResponse
     */
    public GetMachineGroupResponse getMachineGroup(String project, String machineGroup) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMachineGroupWithOptions(project, machineGroup, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
      * *   You can use the query parameter to specify a standard SQL statement.
      * *   You must specify a project in the domain name of the request.
      * *   You must specify a Logstore in the FROM clause of the SQL statement. A Logstore can be used as an SQL table.
      * *   You must specify a time range in the SQL statement by using the \\__date\\_\\_ parameter or \\__time\\_\\_ parameter. The value of the \\__date\\_\\_ parameter is a timestamp, and the value of the \\__time\\_\\_ parameter is an integer. The unit of the \\__time\\_\\_ parameter is seconds.
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
      * ### Usage notes
      * *   You can use the query parameter to specify a standard SQL statement.
      * *   You must specify a project in the domain name of the request.
      * *   You must specify a Logstore in the FROM clause of the SQL statement. A Logstore can be used as an SQL table.
      * *   You must specify a time range in the SQL statement by using the \\__date\\_\\_ parameter or \\__time\\_\\_ parameter. The value of the \\__date\\_\\_ parameter is a timestamp, and the value of the \\__time\\_\\_ parameter is an integer. The unit of the \\__time\\_\\_ parameter is seconds.
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request GetShipperStatusRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetShipperStatusResponse
     */
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request GetShipperStatusRequest
      * @return GetShipperStatusResponse
     */
    public GetShipperStatusResponse getShipperStatus(String project, String logstore, String shipperName, GetShipperStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShipperStatusWithOptions(project, logstore, shipperName, request, headers, runtime);
    }

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

    public ListAnnotationDataResponse listAnnotationData(String datasetId, ListAnnotationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationDataWithOptions(datasetId, request, headers, runtime);
    }

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

    public ListAnnotationDataSetsResponse listAnnotationDataSets(ListAnnotationDataSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationDataSetsWithOptions(request, headers, runtime);
    }

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

    public ListAnnotationLabelsResponse listAnnotationLabels(ListAnnotationLabelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAnnotationLabelsWithOptions(request, headers, runtime);
    }

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

    public ListCollectionPoliciesResponse listCollectionPolicies(ListCollectionPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCollectionPoliciesWithOptions(request, headers, runtime);
    }

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

    public ListConfigResponse listConfig(String project, ListConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConfigWithOptions(project, request, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return ListConsumerGroupResponse
     */
    public ListConsumerGroupResponse listConsumerGroup(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumerGroupWithOptions(project, logstore, headers, runtime);
    }

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

    public ListDashboardResponse listDashboard(String project, ListDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardWithOptions(project, request, headers, runtime);
    }

    /**
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request ListLogStoresRequest
      * @return ListLogStoresResponse
     */
    public ListLogStoresResponse listLogStores(String project, ListLogStoresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogStoresWithOptions(project, request, headers, runtime);
    }

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

    public ListLogtailPipelineConfigResponse listLogtailPipelineConfig(String project, ListLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogtailPipelineConfigWithOptions(project, request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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

    public ListShardsResponse listShards(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShardsWithOptions(project, logstore, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListShipperResponse
     */
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return ListShipperResponse
     */
    public ListShipperResponse listShipper(String project, String logstore) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShipperWithOptions(project, logstore, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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

    public PutAnnotationDataResponse putAnnotationData(String datasetId, PutAnnotationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putAnnotationDataWithOptions(datasetId, request, headers, runtime);
    }

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.
      *     *   You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see [RAM](~~128139~~).
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
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutProjectPolicyResponse());
    }

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Alibaba Cloud Simple Log Service allows you to configure a project policy to authorize other users to access the specified Log Service resources.
      *     *   You must configure a project policy based on policy syntax. Before you configure a project policy, you must be familiar with the Action, Resource, and Condition parameters. For more information, see [RAM](~~128139~~).
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
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PutWebtrackingResponse());
    }

    public PutWebtrackingResponse putWebtracking(String project, String logstoreName, PutWebtrackingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putWebtrackingWithOptions(project, logstoreName, request, headers, runtime);
    }

    /**
      * @deprecated
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
      * @deprecated
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @return RemoveConfigFromMachineGroupResponse
     */
    public RemoveConfigFromMachineGroupResponse removeConfigFromMachineGroup(String project, String machineGroup, String configName) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConfigFromMachineGroupWithOptions(project, machineGroup, configName, headers, runtime);
    }

    /**
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the `[BeginKey,EndKey)` format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see [Shard](~~28976~~).
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
      * ### Usage notes
      * *   Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      * *   Each shard has an MD5 hash range, and each range is a left-closed, right-open interval. The interval is in the `[BeginKey,EndKey)` format. A shard can be in the readwrite or readonly state. You can split a shard and merge shards. For more information, see [Shard](~~28976~~).
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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

    public UpdateAnnotationDataSetResponse updateAnnotationDataSet(String datasetId, UpdateAnnotationDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAnnotationDataSetWithOptions(datasetId, request, headers, runtime);
    }

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

    public UpdateAnnotationLabelResponse updateAnnotationLabel(UpdateAnnotationLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAnnotationLabelWithOptions(request, headers, runtime);
    }

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

    public UpdateConfigResponse updateConfig(String project, String configName, UpdateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigWithOptions(project, configName, request, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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

    public UpdateDashboardResponse updateDashboard(String project, String dashboardName, UpdateDashboardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDashboardWithOptions(project, dashboardName, request, headers, runtime);
    }

    /**
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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
      * ### Usage notes
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

    public UpdateLogStoreMeteringModeResponse updateLogStoreMeteringMode(String project, String logstore, UpdateLogStoreMeteringModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogStoreMeteringModeWithOptions(project, logstore, request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
      *
      * @param request UpdateLoggingRequest
      * @return UpdateLoggingResponse
     */
    public UpdateLoggingResponse updateLogging(String project, UpdateLoggingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLoggingWithOptions(project, request, headers, runtime);
    }

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

    public UpdateLogtailPipelineConfigResponse updateLogtailPipelineConfig(String project, String configName, UpdateLogtailPipelineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLogtailPipelineConfigWithOptions(project, configName, request, headers, runtime);
    }

    /**
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Simple Log Service endpoint. You must specify a project in Host.
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
      * ### Usage notes
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
      * ### Usage notes
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
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
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
      * Host consists of a project name and a Log Service endpoint. You must specify a project in Host.
      *
      * @param request UpdateRdsExternalStoreRequest
      * @return UpdateRdsExternalStoreResponse
     */
    public UpdateRdsExternalStoreResponse updateRdsExternalStore(String project, String externalStoreName, UpdateRdsExternalStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRdsExternalStoreWithOptions(project, externalStoreName, request, headers, runtime);
    }

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

    public UpdateSavedSearchResponse updateSavedSearch(String project, String savedsearchName, UpdateSavedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSavedSearchWithOptions(project, savedsearchName, request, headers, runtime);
    }

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

    public UpsertCollectionPolicyResponse upsertCollectionPolicy(UpsertCollectionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upsertCollectionPolicyWithOptions(request, headers, runtime);
    }
}

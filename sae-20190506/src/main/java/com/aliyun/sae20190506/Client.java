// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506;

import com.aliyun.tea.*;
import com.aliyun.sae20190506.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sae", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortAndRollbackChangeOrderWithOptions(request, headers, runtime);
    }

    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderWithOptions(AbortAndRollbackChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortAndRollbackChangeOrder"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/AbortAndRollbackChangeOrder"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortAndRollbackChangeOrderResponse());
    }

    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeOrderWithOptions(request, headers, runtime);
    }

    public AbortChangeOrderResponse abortChangeOrderWithOptions(AbortChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortChangeOrder"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/AbortChangeOrder"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortChangeOrderResponse());
    }

    public BatchStartApplicationsResponse batchStartApplications(BatchStartApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchStartApplicationsWithOptions(request, headers, runtime);
    }

    public BatchStartApplicationsResponse batchStartApplicationsWithOptions(BatchStartApplicationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartApplications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/batchStartApplications"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartApplicationsResponse());
    }

    public BatchStopApplicationsResponse batchStopApplications(BatchStopApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchStopApplicationsWithOptions(request, headers, runtime);
    }

    public BatchStopApplicationsResponse batchStopApplicationsWithOptions(BatchStopApplicationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopApplications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/batchStopApplications"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopApplicationsResponse());
    }

    public BindSlbResponse bindSlb(BindSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSlbWithOptions(request, headers, runtime);
    }

    public BindSlbResponse bindSlbWithOptions(BindSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internet)) {
            query.put("Internet", request.internet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbId)) {
            query.put("InternetSlbId", request.internetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranet)) {
            query.put("Intranet", request.intranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbId)) {
            query.put("IntranetSlbId", request.intranetSlbId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSlb"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/slb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSlbResponse());
    }

    public ConfirmPipelineBatchResponse confirmPipelineBatch(ConfirmPipelineBatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmPipelineBatchWithOptions(request, headers, runtime);
    }

    public ConfirmPipelineBatchResponse confirmPipelineBatchWithOptions(ConfirmPipelineBatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confirm)) {
            query.put("Confirm", request.confirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmPipelineBatch"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/ConfirmPipelineBatch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmPipelineBatchResponse());
    }

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrAssumeRoleArn)) {
            query.put("AcrAssumeRoleArn", request.acrAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appDescription)) {
            query.put("AppDescription", request.appDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoConfig)) {
            query.put("AutoConfig", request.autoConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHostAlias)) {
            query.put("CustomHostAlias", request.customHostAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploy)) {
            query.put("Deploy", request.deploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartArgs)) {
            query.put("JarStartArgs", request.jarStartArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartOptions)) {
            query.put("JarStartOptions", request.jarStartOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jdk)) {
            query.put("Jdk", request.jdk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaEndpoint)) {
            query.put("KafkaEndpoint", request.kafkaEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaInstanceId)) {
            query.put("KafkaInstanceId", request.kafkaInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaLogfileConfig)) {
            query.put("KafkaLogfileConfig", request.kafkaLogfileConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDesc)) {
            query.put("MountDesc", request.mountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountHost)) {
            query.put("MountHost", request.mountHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openCollectToKafka)) {
            query.put("OpenCollectToKafka", request.openCollectToKafka);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpArmsConfigLocation)) {
            query.put("PhpArmsConfigLocation", request.phpArmsConfigLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfigLocation)) {
            query.put("PhpConfigLocation", request.phpConfigLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            query.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tomcatConfig)) {
            query.put("TomcatConfig", request.tomcatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warStartOptions)) {
            query.put("WarStartOptions", request.warStartOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            body.put("AcrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associateEip)) {
            body.put("AssociateEip", request.associateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMapMountDesc)) {
            body.put("ConfigMapMountDesc", request.configMapMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAkId)) {
            body.put("OssAkId", request.ossAkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAkSecret)) {
            body.put("OssAkSecret", request.ossAkSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossMountDescs)) {
            body.put("OssMountDescs", request.ossMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfig)) {
            body.put("PhpConfig", request.phpConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/createApplication"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    public CreateApplicationScalingRuleResponse createApplicationScalingRule(CreateApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public CreateApplicationScalingRuleResponse createApplicationScalingRuleWithOptions(CreateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleEnable)) {
            query.put("ScalingRuleEnable", request.scalingRuleEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleMetric)) {
            query.put("ScalingRuleMetric", request.scalingRuleMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTimer)) {
            query.put("ScalingRuleTimer", request.scalingRuleTimer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleType)) {
            query.put("ScalingRuleType", request.scalingRuleType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/applicationScalingRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationScalingRuleResponse());
    }

    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigMapWithOptions(request, headers, runtime);
    }

    public CreateConfigMapResponse createConfigMapWithOptions(CreateConfigMapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigMap"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/configmap/configMap"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigMapResponse());
    }

    public CreateGreyTagRouteResponse createGreyTagRoute(CreateGreyTagRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGreyTagRouteWithOptions(request, headers, runtime);
    }

    public CreateGreyTagRouteResponse createGreyTagRouteWithOptions(CreateGreyTagRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboRules)) {
            query.put("DubboRules", request.dubboRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scRules)) {
            query.put("ScRules", request.scRules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGreyTagRoute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/tagroute/greyTagRoute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGreyTagRouteResponse());
    }

    public CreateIngressResponse createIngress(CreateIngressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIngressWithOptions(request, headers, runtime);
    }

    public CreateIngressResponse createIngressWithOptions(CreateIngressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            query.put("DefaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIngress"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/ingress/Ingress"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIngressResponse());
    }

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNamespaceWithOptions(request, headers, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceDescription)) {
            query.put("NamespaceDescription", request.namespaceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/namespace"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/deleteApplication"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRuleWithOptions(DeleteApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/applicationScalingRule"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationScalingRuleResponse());
    }

    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigMapWithOptions(request, headers, runtime);
    }

    public DeleteConfigMapResponse deleteConfigMapWithOptions(DeleteConfigMapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configMapId)) {
            query.put("ConfigMapId", request.configMapId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigMap"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/configmap/configMap"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigMapResponse());
    }

    public DeleteGreyTagRouteResponse deleteGreyTagRoute(DeleteGreyTagRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGreyTagRouteWithOptions(request, headers, runtime);
    }

    public DeleteGreyTagRouteResponse deleteGreyTagRouteWithOptions(DeleteGreyTagRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.greyTagRouteId)) {
            query.put("GreyTagRouteId", request.greyTagRouteId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGreyTagRoute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/tagroute/greyTagRoute"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGreyTagRouteResponse());
    }

    public DeleteIngressResponse deleteIngress(DeleteIngressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIngressWithOptions(request, headers, runtime);
    }

    public DeleteIngressResponse deleteIngressWithOptions(DeleteIngressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ingressId)) {
            query.put("IngressId", request.ingressId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIngress"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/ingress/Ingress"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIngressResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNamespaceWithOptions(request, headers, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/namespace"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    public DeployApplicationResponse deployApplication(DeployApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployApplicationWithOptions(request, headers, runtime);
    }

    public DeployApplicationResponse deployApplicationWithOptions(DeployApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrAssumeRoleArn)) {
            query.put("AcrAssumeRoleArn", request.acrAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoEnableApplicationScalingRule)) {
            query.put("AutoEnableApplicationScalingRule", request.autoEnableApplicationScalingRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderDesc)) {
            query.put("ChangeOrderDesc", request.changeOrderDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHostAlias)) {
            query.put("CustomHostAlias", request.customHostAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGreyTagRoute)) {
            query.put("EnableGreyTagRoute", request.enableGreyTagRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartArgs)) {
            query.put("JarStartArgs", request.jarStartArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartOptions)) {
            query.put("JarStartOptions", request.jarStartOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jdk)) {
            query.put("Jdk", request.jdk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaEndpoint)) {
            query.put("KafkaEndpoint", request.kafkaEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaInstanceId)) {
            query.put("KafkaInstanceId", request.kafkaInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaLogfileConfig)) {
            query.put("KafkaLogfileConfig", request.kafkaLogfileConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountDesc)) {
            query.put("MountDesc", request.mountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountHost)) {
            query.put("MountHost", request.mountHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openCollectToKafka)) {
            query.put("OpenCollectToKafka", request.openCollectToKafka);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpArmsConfigLocation)) {
            query.put("PhpArmsConfigLocation", request.phpArmsConfigLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfigLocation)) {
            query.put("PhpConfigLocation", request.phpConfigLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postStart)) {
            query.put("PostStart", request.postStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preStop)) {
            query.put("PreStop", request.preStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            query.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tomcatConfig)) {
            query.put("TomcatConfig", request.tomcatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStrategy)) {
            query.put("UpdateStrategy", request.updateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warStartOptions)) {
            query.put("WarStartOptions", request.warStartOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webContainer)) {
            query.put("WebContainer", request.webContainer);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            body.put("AcrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associateEip)) {
            body.put("AssociateEip", request.associateEip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMapMountDesc)) {
            body.put("ConfigMapMountDesc", request.configMapMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAkId)) {
            body.put("OssAkId", request.ossAkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossAkSecret)) {
            body.put("OssAkSecret", request.ossAkSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossMountDescs)) {
            body.put("OssMountDescs", request.ossMountDescs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfig)) {
            body.put("PhpConfig", request.phpConfig);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/deployApplication"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApplicationResponse());
    }

    public DescribeAppServiceDetailResponse describeAppServiceDetail(DescribeAppServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppServiceDetailWithOptions(request, headers, runtime);
    }

    public DescribeAppServiceDetailResponse describeAppServiceDetailWithOptions(DescribeAppServiceDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceGroup)) {
            query.put("ServiceGroup", request.serviceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceVersion)) {
            query.put("ServiceVersion", request.serviceVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppServiceDetail"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/service/describeAppServiceDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppServiceDetailResponse());
    }

    public DescribeApplicationConfigResponse describeApplicationConfig(DescribeApplicationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationConfigWithOptions(request, headers, runtime);
    }

    public DescribeApplicationConfigResponse describeApplicationConfigWithOptions(DescribeApplicationConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationConfig"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/describeApplicationConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationConfigResponse());
    }

    public DescribeApplicationGroupsResponse describeApplicationGroups(DescribeApplicationGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationGroupsWithOptions(request, headers, runtime);
    }

    public DescribeApplicationGroupsResponse describeApplicationGroupsWithOptions(DescribeApplicationGroupsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationGroups"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/describeApplicationGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationGroupsResponse());
    }

    public DescribeApplicationImageResponse describeApplicationImage(DescribeApplicationImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationImageWithOptions(request, headers, runtime);
    }

    public DescribeApplicationImageResponse describeApplicationImageWithOptions(DescribeApplicationImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationImage"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/container/describeApplicationImage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationImageResponse());
    }

    public DescribeApplicationInstancesResponse describeApplicationInstances(DescribeApplicationInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationInstancesWithOptions(request, headers, runtime);
    }

    public DescribeApplicationInstancesResponse describeApplicationInstancesWithOptions(DescribeApplicationInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationInstances"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/describeApplicationInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationInstancesResponse());
    }

    public DescribeApplicationScalingRuleResponse describeApplicationScalingRule(DescribeApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public DescribeApplicationScalingRuleResponse describeApplicationScalingRuleWithOptions(DescribeApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/applicationScalingRule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationScalingRuleResponse());
    }

    public DescribeApplicationScalingRulesResponse describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationScalingRulesWithOptions(request, headers, runtime);
    }

    public DescribeApplicationScalingRulesResponse describeApplicationScalingRulesWithOptions(DescribeApplicationScalingRulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationScalingRules"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/applicationScalingRules"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationScalingRulesResponse());
    }

    public DescribeApplicationSlbsResponse describeApplicationSlbs(DescribeApplicationSlbsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationSlbsWithOptions(request, headers, runtime);
    }

    public DescribeApplicationSlbsResponse describeApplicationSlbsWithOptions(DescribeApplicationSlbsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationSlbs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/slb"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationSlbsResponse());
    }

    public DescribeApplicationStatusResponse describeApplicationStatus(DescribeApplicationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationStatusWithOptions(request, headers, runtime);
    }

    public DescribeApplicationStatusResponse describeApplicationStatusWithOptions(DescribeApplicationStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationStatus"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/describeApplicationStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationStatusResponse());
    }

    public DescribeChangeOrderResponse describeChangeOrder(DescribeChangeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeOrderWithOptions(request, headers, runtime);
    }

    public DescribeChangeOrderResponse describeChangeOrderWithOptions(DescribeChangeOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChangeOrder"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/DescribeChangeOrder"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChangeOrderResponse());
    }

    public DescribeComponentsResponse describeComponents(DescribeComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeComponentsWithOptions(request, headers, runtime);
    }

    public DescribeComponentsResponse describeComponentsWithOptions(DescribeComponentsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponents"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/resource/components"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentsResponse());
    }

    public DescribeConfigMapResponse describeConfigMap(DescribeConfigMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigMapWithOptions(request, headers, runtime);
    }

    public DescribeConfigMapResponse describeConfigMapWithOptions(DescribeConfigMapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configMapId)) {
            query.put("ConfigMapId", request.configMapId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigMap"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/configmap/configMap"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigMapResponse());
    }

    public DescribeConfigurationPriceResponse describeConfigurationPrice(DescribeConfigurationPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigurationPriceWithOptions(request, headers, runtime);
    }

    public DescribeConfigurationPriceResponse describeConfigurationPriceWithOptions(DescribeConfigurationPriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigurationPrice"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/configurationPrice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigurationPriceResponse());
    }

    public DescribeEdasContainersResponse describeEdasContainers() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdasContainersWithOptions(headers, runtime);
    }

    public DescribeEdasContainersResponse describeEdasContainersWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEdasContainers"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/resource/edasContainers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEdasContainersResponse());
    }

    public DescribeGreyTagRouteResponse describeGreyTagRoute(DescribeGreyTagRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGreyTagRouteWithOptions(request, headers, runtime);
    }

    public DescribeGreyTagRouteResponse describeGreyTagRouteWithOptions(DescribeGreyTagRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.greyTagRouteId)) {
            query.put("GreyTagRouteId", request.greyTagRouteId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGreyTagRoute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/tagroute/greyTagRoute"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGreyTagRouteResponse());
    }

    public DescribeIngressResponse describeIngress(DescribeIngressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIngressWithOptions(request, headers, runtime);
    }

    public DescribeIngressResponse describeIngressWithOptions(DescribeIngressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ingressId)) {
            query.put("IngressId", request.ingressId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIngress"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/ingress/Ingress"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIngressResponse());
    }

    public DescribeInstanceLogResponse describeInstanceLog(DescribeInstanceLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceLogWithOptions(request, headers, runtime);
    }

    public DescribeInstanceLogResponse describeInstanceLogWithOptions(DescribeInstanceLogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceLog"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/instance/describeInstanceLog"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceLogResponse());
    }

    public DescribeInstanceSpecificationsResponse describeInstanceSpecifications() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceSpecificationsWithOptions(headers, runtime);
    }

    public DescribeInstanceSpecificationsResponse describeInstanceSpecificationsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpecifications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/quota/instanceSpecifications"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecificationsResponse());
    }

    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceWithOptions(request, headers, runtime);
    }

    public DescribeNamespaceResponse describeNamespaceWithOptions(DescribeNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespace"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/namespace"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespaceResponse());
    }

    public DescribeNamespaceListResponse describeNamespaceList(DescribeNamespaceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceListWithOptions(request, headers, runtime);
    }

    public DescribeNamespaceListResponse describeNamespaceListWithOptions(DescribeNamespaceListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containCustom)) {
            query.put("ContainCustom", request.containCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridCloudExclude)) {
            query.put("HybridCloudExclude", request.hybridCloudExclude);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespaceList"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/namespace/describeNamespaceList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespaceListResponse());
    }

    public DescribeNamespaceResourcesResponse describeNamespaceResources(DescribeNamespaceResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceResourcesWithOptions(request, headers, runtime);
    }

    public DescribeNamespaceResourcesResponse describeNamespaceResourcesWithOptions(DescribeNamespaceResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespaceResources"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/namespace/describeNamespaceResources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespaceResourcesResponse());
    }

    public DescribeNamespacesResponse describeNamespaces(DescribeNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespacesWithOptions(request, headers, runtime);
    }

    public DescribeNamespacesResponse describeNamespacesWithOptions(DescribeNamespacesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNamespaces"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/namespaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespacesResponse());
    }

    public DescribePipelineResponse describePipeline(DescribePipelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineWithOptions(request, headers, runtime);
    }

    public DescribePipelineResponse describePipelineWithOptions(DescribePipelineRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePipeline"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/DescribePipeline"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePipelineResponse());
    }

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/regionConfig"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DisableApplicationScalingRuleResponse disableApplicationScalingRule(DisableApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public DisableApplicationScalingRuleResponse disableApplicationScalingRuleWithOptions(DisableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/disableApplicationScalingRule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationScalingRuleResponse());
    }

    public DownloadFilesResponse downloadFiles(DownloadFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadFilesWithOptions(request, headers, runtime);
    }

    public DownloadFilesResponse downloadFilesWithOptions(DownloadFilesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localpath)) {
            query.put("Localpath", request.localpath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadFiles"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/downloadFiles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadFilesResponse());
    }

    public EnableApplicationScalingRuleResponse enableApplicationScalingRule(EnableApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public EnableApplicationScalingRuleResponse enableApplicationScalingRuleWithOptions(EnableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/enableApplicationScalingRule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationScalingRuleResponse());
    }

    public ListAppEventsResponse listAppEvents(ListAppEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppEventsWithOptions(request, headers, runtime);
    }

    public ListAppEventsResponse listAppEventsWithOptions(ListAppEventsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKind)) {
            query.put("ObjectKind", request.objectKind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectName)) {
            query.put("ObjectName", request.objectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppEvents"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/listAppEvents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppEventsResponse());
    }

    public ListAppServicesPageResponse listAppServicesPage(ListAppServicesPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppServicesPageWithOptions(request, headers, runtime);
    }

    public ListAppServicesPageResponse listAppServicesPageWithOptions(ListAppServicesPageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppServicesPage"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/service/listAppServicesPage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppServicesPageResponse());
    }

    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppVersionsWithOptions(request, headers, runtime);
    }

    public ListAppVersionsResponse listAppVersionsWithOptions(ListAppVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppVersions"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/listAppVersions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppVersionsResponse());
    }

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationsWithOptions(request, headers, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldType)) {
            query.put("FieldType", request.fieldType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldValue)) {
            query.put("FieldValue", request.fieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/listApplications"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    public ListChangeOrdersResponse listChangeOrders(ListChangeOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangeOrdersWithOptions(request, headers, runtime);
    }

    public ListChangeOrdersResponse listChangeOrdersWithOptions(ListChangeOrdersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coStatus)) {
            query.put("CoStatus", request.coStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coType)) {
            query.put("CoType", request.coType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChangeOrders"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/ListChangeOrders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChangeOrdersResponse());
    }

    public ListConsumedServicesResponse listConsumedServices(ListConsumedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumedServicesWithOptions(request, headers, runtime);
    }

    public ListConsumedServicesResponse listConsumedServicesWithOptions(ListConsumedServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConsumedServices"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/service/listConsumedServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConsumedServicesResponse());
    }

    public ListGreyTagRouteResponse listGreyTagRoute(ListGreyTagRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGreyTagRouteWithOptions(request, headers, runtime);
    }

    public ListGreyTagRouteResponse listGreyTagRouteWithOptions(ListGreyTagRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGreyTagRoute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/tagroute/greyTagRouteList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGreyTagRouteResponse());
    }

    public ListIngressesResponse listIngresses(ListIngressesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIngressesWithOptions(request, headers, runtime);
    }

    public ListIngressesResponse listIngressesWithOptions(ListIngressesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIngresses"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/ingress/IngressList"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIngressesResponse());
    }

    public ListLogConfigsResponse listLogConfigs(ListLogConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogConfigsWithOptions(request, headers, runtime);
    }

    public ListLogConfigsResponse listLogConfigsWithOptions(ListLogConfigsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogConfigs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/log/listLogConfigs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogConfigsResponse());
    }

    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespaceChangeOrdersWithOptions(request, headers, runtime);
    }

    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrdersWithOptions(ListNamespaceChangeOrdersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coStatus)) {
            query.put("CoStatus", request.coStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coType)) {
            query.put("CoType", request.coType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespaceChangeOrders"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/changeorder/listNamespaceChangeOrders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespaceChangeOrdersResponse());
    }

    public ListNamespacedConfigMapsResponse listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespacedConfigMapsWithOptions(request, headers, runtime);
    }

    public ListNamespacedConfigMapsResponse listNamespacedConfigMapsWithOptions(ListNamespacedConfigMapsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNamespacedConfigMaps"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/configmap/listNamespacedConfigMaps"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespacedConfigMapsResponse());
    }

    public ListPublishedServicesResponse listPublishedServices(ListPublishedServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedServicesWithOptions(request, headers, runtime);
    }

    public ListPublishedServicesResponse listPublishedServicesWithOptions(ListPublishedServicesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedServices"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/service/listPublishedServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedServicesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public OpenSaeServiceResponse openSaeService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSaeServiceWithOptions(headers, runtime);
    }

    public OpenSaeServiceResponse openSaeServiceWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenSaeService"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/service/open"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenSaeServiceResponse());
    }

    public QueryResourceStaticsResponse queryResourceStatics(QueryResourceStaticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceStaticsWithOptions(request, headers, runtime);
    }

    public QueryResourceStaticsResponse queryResourceStaticsWithOptions(QueryResourceStaticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResourceStatics"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/quota/queryResourceStatics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResourceStaticsResponse());
    }

    public ReduceApplicationCapacityByInstanceIdsResponse reduceApplicationCapacityByInstanceIds(ReduceApplicationCapacityByInstanceIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reduceApplicationCapacityByInstanceIdsWithOptions(request, headers, runtime);
    }

    public ReduceApplicationCapacityByInstanceIdsResponse reduceApplicationCapacityByInstanceIdsWithOptions(ReduceApplicationCapacityByInstanceIdsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReduceApplicationCapacityByInstanceIds"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/ScaleInApplicationWithInstanceIds"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReduceApplicationCapacityByInstanceIdsResponse());
    }

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rescaleApplicationWithOptions(request, headers, runtime);
    }

    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoEnableApplicationScalingRule)) {
            query.put("AutoEnableApplicationScalingRule", request.autoEnableApplicationScalingRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/rescaleApplication"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleApplicationResponse());
    }

    public RescaleApplicationVerticallyResponse rescaleApplicationVertically(RescaleApplicationVerticallyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rescaleApplicationVerticallyWithOptions(request, headers, runtime);
    }

    public RescaleApplicationVerticallyResponse rescaleApplicationVerticallyWithOptions(RescaleApplicationVerticallyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleApplicationVertically"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/rescaleApplicationVertically"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleApplicationVerticallyResponse());
    }

    public RestartApplicationResponse restartApplication(RestartApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartApplicationWithOptions(request, headers, runtime);
    }

    public RestartApplicationResponse restartApplicationWithOptions(RestartApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/restartApplication"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartApplicationResponse());
    }

    public RestartInstancesResponse restartInstances(RestartInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstancesWithOptions(request, headers, runtime);
    }

    public RestartInstancesResponse restartInstancesWithOptions(RestartInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstances"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/restartInstances"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstancesResponse());
    }

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackApplicationWithOptions(request, headers, runtime);
    }

    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoEnableApplicationScalingRule)) {
            query.put("AutoEnableApplicationScalingRule", request.autoEnableApplicationScalingRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.batchWaitTime)) {
            query.put("BatchWaitTime", request.batchWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStrategy)) {
            query.put("UpdateStrategy", request.updateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/rollbackApplication"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackApplicationResponse());
    }

    public StartApplicationResponse startApplication(StartApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApplicationWithOptions(request, headers, runtime);
    }

    public StartApplicationResponse startApplicationWithOptions(StartApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/startApplication"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartApplicationResponse());
    }

    public StopApplicationResponse stopApplication(StopApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApplicationWithOptions(request, headers, runtime);
    }

    public StopApplicationResponse stopApplicationWithOptions(StopApplicationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/stopApplication"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopApplicationResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesWithOptions(request, headers, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public UnbindSlbResponse unbindSlb(UnbindSlbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindSlbWithOptions(request, headers, runtime);
    }

    public UnbindSlbResponse unbindSlbWithOptions(UnbindSlbRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internet)) {
            query.put("Internet", request.internet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranet)) {
            query.put("Intranet", request.intranet);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindSlb"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/slb"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindSlbResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAll)) {
            query.put("DeleteAll", request.deleteAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            query.put("TagKeys", request.tagKeys);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UpdateAppSecurityGroupResponse updateAppSecurityGroup(UpdateAppSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppSecurityGroupWithOptions(request, headers, runtime);
    }

    public UpdateAppSecurityGroupResponse updateAppSecurityGroupWithOptions(UpdateAppSecurityGroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppSecurityGroup"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/updateAppSecurityGroup"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppSecurityGroupResponse());
    }

    public UpdateApplicationScalingRuleResponse updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    public UpdateApplicationScalingRuleResponse updateApplicationScalingRuleWithOptions(UpdateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleMetric)) {
            query.put("ScalingRuleMetric", request.scalingRuleMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleTimer)) {
            query.put("ScalingRuleTimer", request.scalingRuleTimer);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationScalingRule"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/scale/applicationScalingRule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationScalingRuleResponse());
    }

    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigMapWithOptions(request, headers, runtime);
    }

    public UpdateConfigMapResponse updateConfigMapWithOptions(UpdateConfigMapRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configMapId)) {
            query.put("ConfigMapId", request.configMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigMap"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/configmap/configMap"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigMapResponse());
    }

    public UpdateGreyTagRouteResponse updateGreyTagRoute(UpdateGreyTagRouteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGreyTagRouteWithOptions(request, headers, runtime);
    }

    public UpdateGreyTagRouteResponse updateGreyTagRouteWithOptions(UpdateGreyTagRouteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dubboRules)) {
            query.put("DubboRules", request.dubboRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greyTagRouteId)) {
            query.put("GreyTagRouteId", request.greyTagRouteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scRules)) {
            query.put("ScRules", request.scRules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGreyTagRoute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/tagroute/greyTagRoute"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGreyTagRouteResponse());
    }

    public UpdateIngressResponse updateIngress(UpdateIngressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIngressWithOptions(request, headers, runtime);
    }

    public UpdateIngressResponse updateIngressWithOptions(UpdateIngressRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            query.put("DefaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ingressId)) {
            query.put("IngressId", request.ingressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIngress"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/ingress/Ingress"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIngressResponse());
    }

    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceWithOptions(request, headers, runtime);
    }

    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceDescription)) {
            query.put("NamespaceDescription", request.namespaceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespace"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/paas/namespace"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceResponse());
    }

    public UpdateNamespaceVpcResponse updateNamespaceVpc(UpdateNamespaceVpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceVpcWithOptions(request, headers, runtime);
    }

    public UpdateNamespaceVpcResponse updateNamespaceVpcWithOptions(UpdateNamespaceVpcRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespaceVpc"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/namespace/updateNamespaceVpc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceVpcResponse());
    }

    public UploadFilesResponse uploadFiles(UploadFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadFilesWithOptions(request, headers, runtime);
    }

    public UploadFilesResponse uploadFilesWithOptions(UploadFilesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudUrl)) {
            query.put("CloudUrl", request.cloudUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localpath)) {
            query.put("Localpath", request.localpath);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFiles"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/uploadFiles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFilesResponse());
    }
}

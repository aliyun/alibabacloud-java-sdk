// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506;

import com.aliyun.tea.*;
import com.aliyun.sae20190506.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @summary ba386059-69b1-4e65-b1e5-0682d9fa\\*\\*\\*\\*
     *
     * @param request AbortAndRollbackChangeOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortAndRollbackChangeOrderResponse
     */
    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrderWithOptions(AbortAndRollbackChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary ba386059-69b1-4e65-b1e5-0682d9fa\\*\\*\\*\\*
     *
     * @param request AbortAndRollbackChangeOrderRequest
     * @return AbortAndRollbackChangeOrderResponse
     */
    public AbortAndRollbackChangeOrderResponse abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortAndRollbackChangeOrderWithOptions(request, headers, runtime);
    }

    /**
     * @param request AbortChangeOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortChangeOrderResponse
     */
    public AbortChangeOrderResponse abortChangeOrderWithOptions(AbortChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeOrderWithOptions(request, headers, runtime);
    }

    /**
     * @summary cn-shanghai
     *
     * @param request BatchStartApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStartApplicationsResponse
     */
    public BatchStartApplicationsResponse batchStartApplicationsWithOptions(BatchStartApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary cn-shanghai
     *
     * @param request BatchStartApplicationsRequest
     * @return BatchStartApplicationsResponse
     */
    public BatchStartApplicationsResponse batchStartApplications(BatchStartApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchStartApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * @param request BatchStopApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStopApplicationsResponse
     */
    public BatchStopApplicationsResponse batchStopApplicationsWithOptions(BatchStopApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request BatchStopApplicationsRequest
     * @return BatchStopApplicationsResponse
     */
    public BatchStopApplicationsResponse batchStopApplications(BatchStopApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchStopApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * @param request BindSlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindSlbResponse
     */
    public BindSlbResponse bindSlbWithOptions(BindSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request BindSlbRequest
     * @return BindSlbResponse
     */
    public BindSlbResponse bindSlb(BindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindSlbWithOptions(request, headers, runtime);
    }

    /**
     * @param request ConfirmPipelineBatchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmPipelineBatchResponse
     */
    public ConfirmPipelineBatchResponse confirmPipelineBatchWithOptions(ConfirmPipelineBatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confirm)) {
            query.put("Confirm", request.confirm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ConfirmPipelineBatchRequest
     * @return ConfirmPipelineBatchResponse
     */
    public ConfirmPipelineBatchResponse confirmPipelineBatch(ConfirmPipelineBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmPipelineBatchWithOptions(request, headers, runtime);
    }

    /**
     * @param request CreateApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableEbpf)) {
            query.put("EnableEbpf", request.enableEbpf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePullSecrets)) {
            query.put("ImagePullSecrets", request.imagePullSecrets);
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

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaConfigs)) {
            query.put("KafkaConfigs", request.kafkaConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistration)) {
            query.put("MicroRegistration", request.microRegistration);
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

        if (!com.aliyun.teautil.Common.isUnset(request.nasConfigs)) {
            query.put("NasConfigs", request.nasConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.programmingLanguage)) {
            query.put("ProgrammingLanguage", request.programmingLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pvtzDiscoverySvc)) {
            query.put("PvtzDiscoverySvc", request.pvtzDiscoverySvc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.python)) {
            query.put("Python", request.python);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonModules)) {
            query.put("PythonModules", request.pythonModules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readiness)) {
            query.put("Readiness", request.readiness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saeVersion)) {
            query.put("SaeVersion", request.saeVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.php)) {
            body.put("Php", request.php);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfig)) {
            body.put("PhpConfig", request.phpConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Null
     *
     * @description The HTTP status code. Take note of the following rules:
     * *   **2xx**: The call was successful.
     * *   **3xx**: The call was redirected.
     * *   **4xx**: The call failed.
     * *   **5xx**: A server error occurred.
     *
     * @param request CreateApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationScalingRuleResponse
     */
    public CreateApplicationScalingRuleResponse createApplicationScalingRuleWithOptions(CreateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Null
     *
     * @description The HTTP status code. Take note of the following rules:
     * *   **2xx**: The call was successful.
     * *   **3xx**: The call was redirected.
     * *   **4xx**: The call failed.
     * *   **5xx**: A server error occurred.
     *
     * @param request CreateApplicationScalingRuleRequest
     * @return CreateApplicationScalingRuleResponse
     */
    public CreateApplicationScalingRuleResponse createApplicationScalingRule(CreateApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @summary name
     *
     * @param request CreateConfigMapRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigMapResponse
     */
    public CreateConfigMapResponse createConfigMapWithOptions(CreateConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary name
     *
     * @param request CreateConfigMapRequest
     * @return CreateConfigMapResponse
     */
    public CreateConfigMapResponse createConfigMap(CreateConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * @summary Creates a canary release rule for a Spring Cloud or Dubbo application.
     *
     * @description >  You can configure only one canary release rule for each application.
     *
     * @param request CreateGreyTagRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGreyTagRouteResponse
     */
    public CreateGreyTagRouteResponse createGreyTagRouteWithOptions(CreateGreyTagRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albRules)) {
            query.put("AlbRules", request.albRules);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a canary release rule for a Spring Cloud or Dubbo application.
     *
     * @description >  You can configure only one canary release rule for each application.
     *
     * @param request CreateGreyTagRouteRequest
     * @return CreateGreyTagRouteResponse
     */
    public CreateGreyTagRouteResponse createGreyTagRoute(CreateGreyTagRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGreyTagRouteWithOptions(request, headers, runtime);
    }

    /**
     * @summary {"appId":"395b60e4-0550-458d-9c54-a265d036\\*\\*\\*\\*","containerPort":8080}
     *
     * @param request CreateIngressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIngressResponse
     */
    public CreateIngressResponse createIngressWithOptions(CreateIngressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalanceType)) {
            query.put("LoadBalanceType", request.loadBalanceType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary {"appId":"395b60e4-0550-458d-9c54-a265d036\\*\\*\\*\\*","containerPort":8080}
     *
     * @param request CreateIngressRequest
     * @return CreateIngressResponse
     */
    public CreateIngressResponse createIngress(CreateIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIngressWithOptions(request, headers, runtime);
    }

    /**
     * @summary Updates a job template.
     *
     * @param request CreateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.backoffLimit)) {
            query.put("BackoffLimit", request.backoffLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrencyPolicy)) {
            query.put("ConcurrencyPolicy", request.concurrencyPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHostAlias)) {
            query.put("CustomHostAlias", request.customHostAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePullSecrets)) {
            query.put("ImagePullSecrets", request.imagePullSecrets);
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

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.programmingLanguage)) {
            query.put("ProgrammingLanguage", request.programmingLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.python)) {
            query.put("Python", request.python);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonModules)) {
            query.put("PythonModules", request.pythonModules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refAppId)) {
            query.put("RefAppId", request.refAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slice)) {
            query.put("Slice", request.slice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceEnvs)) {
            query.put("SliceEnvs", request.sliceEnvs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            query.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tomcatConfig)) {
            query.put("TomcatConfig", request.tomcatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            query.put("TriggerConfig", request.triggerConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.workload)) {
            query.put("Workload", request.workload);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrInstanceId)) {
            body.put("AcrInstanceId", request.acrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMapMountDesc)) {
            body.put("ConfigMapMountDesc", request.configMapMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableImageAccl)) {
            body.put("EnableImageAccl", request.enableImageAccl);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/createJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * @summary Updates a job template.
     *
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJobWithOptions(request, headers, runtime);
    }

    /**
     * @summary desc
     *
     * @param request CreateNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableMicroRegistration)) {
            query.put("EnableMicroRegistration", request.enableMicroRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceDescription)) {
            query.put("NamespaceDescription", request.namespaceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary desc
     *
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary Null
     *
     * @param tmpReq CreateSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecretWithOptions(CreateSecretRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecretShrinkRequest request = new CreateSecretShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.secretData)) {
            request.secretDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.secretData, "SecretData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretDataShrink)) {
            query.put("SecretData", request.secretDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretType)) {
            query.put("SecretType", request.secretType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecret"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/secret/secret"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecretResponse());
    }

    /**
     * @summary Null
     *
     * @param request CreateSecretRequest
     * @return CreateSecretResponse
     */
    public CreateSecretResponse createSecret(CreateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSecretWithOptions(request, headers, runtime);
    }

    /**
     * @param request DeleteApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary 7171a6ca-d1cd-4928-8642-7d5cfe69\\*\\*\\*\\*
     *
     * @param request DeleteApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationScalingRuleResponse
     */
    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRuleWithOptions(DeleteApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 7171a6ca-d1cd-4928-8642-7d5cfe69\\*\\*\\*\\*
     *
     * @param request DeleteApplicationScalingRuleRequest
     * @return DeleteApplicationScalingRuleResponse
     */
    public DeleteApplicationScalingRuleResponse deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @param request DeleteConfigMapRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConfigMapResponse
     */
    public DeleteConfigMapResponse deleteConfigMapWithOptions(DeleteConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configMapId)) {
            query.put("ConfigMapId", request.configMapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     */
    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * @summary 1
     *
     * @param request DeleteGreyTagRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGreyTagRouteResponse
     */
    public DeleteGreyTagRouteResponse deleteGreyTagRouteWithOptions(DeleteGreyTagRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.greyTagRouteId)) {
            query.put("GreyTagRouteId", request.greyTagRouteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 1
     *
     * @param request DeleteGreyTagRouteRequest
     * @return DeleteGreyTagRouteResponse
     */
    public DeleteGreyTagRouteResponse deleteGreyTagRoute(DeleteGreyTagRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGreyTagRouteWithOptions(request, headers, runtime);
    }

    /**
     * @summary Deletes a job.
     *
     * @param request DeleteHistoryJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHistoryJobResponse
     */
    public DeleteHistoryJobResponse deleteHistoryJobWithOptions(DeleteHistoryJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHistoryJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/deleteHistoryJob"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHistoryJobResponse());
    }

    /**
     * @summary Deletes a job.
     *
     * @param request DeleteHistoryJobRequest
     * @return DeleteHistoryJobResponse
     */
    public DeleteHistoryJobResponse deleteHistoryJob(DeleteHistoryJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteHistoryJobWithOptions(request, headers, runtime);
    }

    /**
     * @param request DeleteIngressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIngressResponse
     */
    public DeleteIngressResponse deleteIngressWithOptions(DeleteIngressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ingressId)) {
            query.put("IngressId", request.ingressId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteIngressRequest
     * @return DeleteIngressResponse
     */
    public DeleteIngressResponse deleteIngress(DeleteIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIngressWithOptions(request, headers, runtime);
    }

    /**
     * @summary Deletes a job template.
     *
     * @param request DeleteJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/deleteJob"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobResponse());
    }

    /**
     * @summary Deletes a job template.
     *
     * @param request DeleteJobRequest
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJobWithOptions(request, headers, runtime);
    }

    /**
     * @param request DeleteNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary Deletes a Secret.
     *
     * @param request DeleteSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecretWithOptions(DeleteSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecret"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/secret/secret"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretResponse());
    }

    /**
     * @summary Deletes a Secret.
     *
     * @param request DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    public DeleteSecretResponse deleteSecret(DeleteSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSecretWithOptions(request, headers, runtime);
    }

    /**
     * @summary Deploys an application.
     *
     * @param request DeployApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplicationWithOptions(DeployApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGreyTagRoute)) {
            query.put("EnableGreyTagRoute", request.enableGreyTagRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePullSecrets)) {
            query.put("ImagePullSecrets", request.imagePullSecrets);
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

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaConfigs)) {
            query.put("KafkaConfigs", request.kafkaConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveness)) {
            query.put("Liveness", request.liveness);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistration)) {
            query.put("MicroRegistration", request.microRegistration);
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

        if (!com.aliyun.teautil.Common.isUnset(request.nasConfigs)) {
            query.put("NasConfigs", request.nasConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.pvtzDiscoverySvc)) {
            query.put("PvtzDiscoverySvc", request.pvtzDiscoverySvc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.python)) {
            query.put("Python", request.python);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonModules)) {
            query.put("PythonModules", request.pythonModules);
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

        if (!com.aliyun.teautil.Common.isUnset(request.updateStrategy)) {
            query.put("UpdateStrategy", request.updateStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.php)) {
            body.put("Php", request.php);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfig)) {
            body.put("PhpConfig", request.phpConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deploys an application.
     *
     * @param request DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplication(DeployApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the metadata details of the service of an application.
     *
     * @param request DescribeAppServiceDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppServiceDetailResponse
     */
    public DescribeAppServiceDetailResponse describeAppServiceDetailWithOptions(DescribeAppServiceDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacosInstanceId)) {
            query.put("NacosInstanceId", request.nacosInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nacosNamespaceId)) {
            query.put("NacosNamespaceId", request.nacosNamespaceId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the metadata details of the service of an application.
     *
     * @param request DescribeAppServiceDetailRequest
     * @return DescribeAppServiceDetailResponse
     */
    public DescribeAppServiceDetailResponse describeAppServiceDetail(DescribeAppServiceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppServiceDetailWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeApplicationConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationConfigResponse
     */
    public DescribeApplicationConfigResponse describeApplicationConfigWithOptions(DescribeApplicationConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeApplicationConfigRequest
     * @return DescribeApplicationConfigResponse
     */
    public DescribeApplicationConfigResponse describeApplicationConfig(DescribeApplicationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationConfigWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeApplicationGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationGroupsResponse
     */
    public DescribeApplicationGroupsResponse describeApplicationGroupsWithOptions(DescribeApplicationGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeApplicationGroupsRequest
     * @return DescribeApplicationGroupsResponse
     */
    public DescribeApplicationGroupsResponse describeApplicationGroups(DescribeApplicationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationGroupsWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeApplicationImageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationImageResponse
     */
    public DescribeApplicationImageResponse describeApplicationImageWithOptions(DescribeApplicationImageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeApplicationImageRequest
     * @return DescribeApplicationImageResponse
     */
    public DescribeApplicationImageResponse describeApplicationImage(DescribeApplicationImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationImageWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries application instances.
     *
     * @param request DescribeApplicationInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationInstancesResponse
     */
    public DescribeApplicationInstancesResponse describeApplicationInstancesWithOptions(DescribeApplicationInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries application instances.
     *
     * @param request DescribeApplicationInstancesRequest
     * @return DescribeApplicationInstancesResponse
     */
    public DescribeApplicationInstancesResponse describeApplicationInstances(DescribeApplicationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationInstancesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries a specified auto scaling policy of an application.
     *
     * @param request DescribeApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationScalingRuleResponse
     */
    public DescribeApplicationScalingRuleResponse describeApplicationScalingRuleWithOptions(DescribeApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries a specified auto scaling policy of an application.
     *
     * @param request DescribeApplicationScalingRuleRequest
     * @return DescribeApplicationScalingRuleResponse
     */
    public DescribeApplicationScalingRuleResponse describeApplicationScalingRule(DescribeApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the auto scaling policies of an application.
     *
     * @param request DescribeApplicationScalingRulesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationScalingRulesResponse
     */
    public DescribeApplicationScalingRulesResponse describeApplicationScalingRulesWithOptions(DescribeApplicationScalingRulesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the auto scaling policies of an application.
     *
     * @param request DescribeApplicationScalingRulesRequest
     * @return DescribeApplicationScalingRulesResponse
     */
    public DescribeApplicationScalingRulesResponse describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationScalingRulesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 017f39b8-dfa4-4e16-a84b-1dcee4b1\\*\\*\\*\\*
     *
     * @param request DescribeApplicationSlbsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationSlbsResponse
     */
    public DescribeApplicationSlbsResponse describeApplicationSlbsWithOptions(DescribeApplicationSlbsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 017f39b8-dfa4-4e16-a84b-1dcee4b1\\*\\*\\*\\*
     *
     * @param request DescribeApplicationSlbsRequest
     * @return DescribeApplicationSlbsResponse
     */
    public DescribeApplicationSlbsResponse describeApplicationSlbs(DescribeApplicationSlbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationSlbsWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeApplicationStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationStatusResponse
     */
    public DescribeApplicationStatusResponse describeApplicationStatusWithOptions(DescribeApplicationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeApplicationStatusRequest
     * @return DescribeApplicationStatusResponse
     */
    public DescribeApplicationStatusResponse describeApplicationStatus(DescribeApplicationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationStatusWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeChangeOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChangeOrderResponse
     */
    public DescribeChangeOrderResponse describeChangeOrderWithOptions(DescribeChangeOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderId)) {
            query.put("ChangeOrderId", request.changeOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeChangeOrderRequest
     * @return DescribeChangeOrderResponse
     */
    public DescribeChangeOrderResponse describeChangeOrder(DescribeChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeOrderWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeComponentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentsResponse
     */
    public DescribeComponentsResponse describeComponentsWithOptions(DescribeComponentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeComponentsRequest
     * @return DescribeComponentsResponse
     */
    public DescribeComponentsResponse describeComponents(DescribeComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeComponentsWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeConfigMapRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigMapResponse
     */
    public DescribeConfigMapResponse describeConfigMapWithOptions(DescribeConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configMapId)) {
            query.put("ConfigMapId", request.configMapId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     */
    public DescribeConfigMapResponse describeConfigMap(DescribeConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeConfigurationPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigurationPriceResponse
     */
    public DescribeConfigurationPriceResponse describeConfigurationPriceWithOptions(DescribeConfigurationPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workload)) {
            query.put("Workload", request.workload);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeConfigurationPriceRequest
     * @return DescribeConfigurationPriceResponse
     */
    public DescribeConfigurationPriceResponse describeConfigurationPrice(DescribeConfigurationPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigurationPriceWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEdasContainersResponse
     */
    public DescribeEdasContainersResponse describeEdasContainersWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeEdasContainersResponse
     */
    public DescribeEdasContainersResponse describeEdasContainers() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdasContainersWithOptions(headers, runtime);
    }

    /**
     * @summary Queries the details of a canary release rule based on the specified rule ID.
     *
     * @param request DescribeGreyTagRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGreyTagRouteResponse
     */
    public DescribeGreyTagRouteResponse describeGreyTagRouteWithOptions(DescribeGreyTagRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.greyTagRouteId)) {
            query.put("GreyTagRouteId", request.greyTagRouteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a canary release rule based on the specified rule ID.
     *
     * @param request DescribeGreyTagRouteRequest
     * @return DescribeGreyTagRouteResponse
     */
    public DescribeGreyTagRouteResponse describeGreyTagRoute(DescribeGreyTagRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeGreyTagRouteWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeIngressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIngressResponse
     */
    public DescribeIngressResponse describeIngressWithOptions(DescribeIngressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ingressId)) {
            query.put("IngressId", request.ingressId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeIngressRequest
     * @return DescribeIngressResponse
     */
    public DescribeIngressResponse describeIngress(DescribeIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIngressWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeInstanceLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceLogResponse
     */
    public DescribeInstanceLogResponse describeInstanceLogWithOptions(DescribeInstanceLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     */
    public DescribeInstanceLogResponse describeInstanceLog(DescribeInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceLogWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSpecificationsResponse
     */
    public DescribeInstanceSpecificationsResponse describeInstanceSpecificationsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeInstanceSpecificationsResponse
     */
    public DescribeInstanceSpecificationsResponse describeInstanceSpecifications() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceSpecificationsWithOptions(headers, runtime);
    }

    /**
     * @summary Queries the configurations of a job template.
     *
     * @param request DescribeJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJobWithOptions(DescribeJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/describeJob"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResponse());
    }

    /**
     * @summary Queries the configurations of a job template.
     *
     * @param request DescribeJobRequest
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJob(DescribeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeJobWithOptions(request, headers, runtime);
    }

    /**
     * @summary Query the information about jobs.
     *
     * @param request DescribeJobHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobHistoryResponse
     */
    public DescribeJobHistoryResponse describeJobHistoryWithOptions(DescribeJobHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobHistory"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/describeJobHistory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobHistoryResponse());
    }

    /**
     * @summary Query the information about jobs.
     *
     * @param request DescribeJobHistoryRequest
     * @return DescribeJobHistoryResponse
     */
    public DescribeJobHistoryResponse describeJobHistory(DescribeJobHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeJobHistoryWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the status of a job.
     *
     * @param request DescribeJobStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobStatusResponse
     */
    public DescribeJobStatusResponse describeJobStatusWithOptions(DescribeJobStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobStatus"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/describeJobStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobStatusResponse());
    }

    /**
     * @summary Queries the status of a job.
     *
     * @param request DescribeJobStatusRequest
     * @return DescribeJobStatusResponse
     */
    public DescribeJobStatusResponse describeJobStatus(DescribeJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeJobStatusWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the details of a namespace.
     *
     * @param request DescribeNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespaceResponse
     */
    public DescribeNamespaceResponse describeNamespaceWithOptions(DescribeNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a namespace.
     *
     * @param request DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeNamespaceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespaceListResponse
     */
    public DescribeNamespaceListResponse describeNamespaceListWithOptions(DescribeNamespaceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containCustom)) {
            query.put("ContainCustom", request.containCustom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridCloudExclude)) {
            query.put("HybridCloudExclude", request.hybridCloudExclude);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeNamespaceListRequest
     * @return DescribeNamespaceListResponse
     */
    public DescribeNamespaceListResponse describeNamespaceList(DescribeNamespaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceListWithOptions(request, headers, runtime);
    }

    /**
     * @param request DescribeNamespaceResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespaceResourcesResponse
     */
    public DescribeNamespaceResourcesResponse describeNamespaceResourcesWithOptions(DescribeNamespaceResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     */
    public DescribeNamespaceResourcesResponse describeNamespaceResources(DescribeNamespaceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the details of namespaces.
     *
     * @param request DescribeNamespacesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespacesResponse
     */
    public DescribeNamespacesResponse describeNamespacesWithOptions(DescribeNamespacesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of namespaces.
     *
     * @param request DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    public DescribeNamespacesResponse describeNamespaces(DescribeNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespacesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the information of a batch.
     *
     * @param request DescribePipelineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePipelineResponse
     */
    public DescribePipelineResponse describePipelineWithOptions(DescribePipelineRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information of a batch.
     *
     * @param request DescribePipelineRequest
     * @return DescribePipelineResponse
     */
    public DescribePipelineResponse describePipeline(DescribePipelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePipelineWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries available regions.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries available regions.
     *
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * @summary Queries the details of a Secret instance.
     *
     * @param request DescribeSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecretResponse
     */
    public DescribeSecretResponse describeSecretWithOptions(DescribeSecretRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecret"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/secret/secret"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecretResponse());
    }

    /**
     * @summary Queries the details of a Secret instance.
     *
     * @param request DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    public DescribeSecretResponse describeSecret(DescribeSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSecretWithOptions(request, headers, runtime);
    }

    /**
     * @param request DisableApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationScalingRuleResponse
     */
    public DisableApplicationScalingRuleResponse disableApplicationScalingRuleWithOptions(DisableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DisableApplicationScalingRuleRequest
     * @return DisableApplicationScalingRuleResponse
     */
    public DisableApplicationScalingRuleResponse disableApplicationScalingRule(DisableApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @summary Enables an auto scaling policy for an application.
     *
     * @param request EnableApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationScalingRuleResponse
     */
    public EnableApplicationScalingRuleResponse enableApplicationScalingRuleWithOptions(EnableApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scalingRuleName)) {
            query.put("ScalingRuleName", request.scalingRuleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Enables an auto scaling policy for an application.
     *
     * @param request EnableApplicationScalingRuleRequest
     * @return EnableApplicationScalingRuleResponse
     */
    public EnableApplicationScalingRuleResponse enableApplicationScalingRule(EnableApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @param request ExecJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecJobResponse
     */
    public ExecJobResponse execJobWithOptions(ExecJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartArgs)) {
            query.put("JarStartArgs", request.jarStartArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jarStartOptions)) {
            query.put("JarStartOptions", request.jarStartOptions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.time)) {
            query.put("Time", request.time);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warStartOptions)) {
            query.put("WarStartOptions", request.warStartOptions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/execJob"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecJobResponse());
    }

    /**
     * @param request ExecJobRequest
     * @return ExecJobResponse
     */
    public ExecJobResponse execJob(ExecJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execJobWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the top N applications in Application Monitoring.
     *
     * @param request GetArmsTopNMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArmsTopNMetricResponse
     */
    public GetArmsTopNMetricResponse getArmsTopNMetricWithOptions(GetArmsTopNMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuStrategy)) {
            query.put("CpuStrategy", request.cpuStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArmsTopNMetric"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/getArmsTopNMetric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetArmsTopNMetricResponse());
    }

    /**
     * @summary Queries the top N applications in Application Monitoring.
     *
     * @param request GetArmsTopNMetricRequest
     * @return GetArmsTopNMetricResponse
     */
    public GetArmsTopNMetricResponse getArmsTopNMetric(GetArmsTopNMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getArmsTopNMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the top N applications in which abnormal instances exist. The applications are sorted by the total number of abnormal instances.
     *
     * @param request GetAvailabilityMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAvailabilityMetricResponse
     */
    public GetAvailabilityMetricResponse getAvailabilityMetricWithOptions(GetAvailabilityMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuStrategy)) {
            query.put("CpuStrategy", request.cpuStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvailabilityMetric"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/getAvailabilityMetric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvailabilityMetricResponse());
    }

    /**
     * @summary Queries the top N applications in which abnormal instances exist. The applications are sorted by the total number of abnormal instances.
     *
     * @param request GetAvailabilityMetricRequest
     * @return GetAvailabilityMetricResponse
     */
    public GetAvailabilityMetricResponse getAvailabilityMetric(GetAvailabilityMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAvailabilityMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries top N applications in abnormal change orders.
     *
     * @param request GetChangeOrderMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChangeOrderMetricResponse
     */
    public GetChangeOrderMetricResponse getChangeOrderMetricWithOptions(GetChangeOrderMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuStrategy)) {
            query.put("CpuStrategy", request.cpuStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTime)) {
            query.put("CreateTime", request.createTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChangeOrderMetric"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/getChangeOrderMetric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChangeOrderMetricResponse());
    }

    /**
     * @summary Queries top N applications in abnormal change orders.
     *
     * @param request GetChangeOrderMetricRequest
     * @return GetChangeOrderMetricResponse
     */
    public GetChangeOrderMetricResponse getChangeOrderMetric(GetChangeOrderMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChangeOrderMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the top N applications in which auto scaling takes effect.
     *
     * @param request GetScaleAppMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScaleAppMetricResponse
     */
    public GetScaleAppMetricResponse getScaleAppMetricWithOptions(GetScaleAppMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuStrategy)) {
            query.put("CpuStrategy", request.cpuStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScaleAppMetric"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/getScaleAppMetric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScaleAppMetricResponse());
    }

    /**
     * @summary Queries the top N applications in which auto scaling takes effect.
     *
     * @param request GetScaleAppMetricRequest
     * @return GetScaleAppMetricResponse
     */
    public GetScaleAppMetricResponse getScaleAppMetric(GetScaleAppMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScaleAppMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the top N applications in which Warning events occur.
     *
     * @param request GetWarningEventMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWarningEventMetricResponse
     */
    public GetWarningEventMetricResponse getWarningEventMetricWithOptions(GetWarningEventMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuStrategy)) {
            query.put("CpuStrategy", request.cpuStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWarningEventMetric"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/getWarningEventMetric"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWarningEventMetricResponse());
    }

    /**
     * @summary Queries the top N applications in which Warning events occur.
     *
     * @param request GetWarningEventMetricRequest
     * @return GetWarningEventMetricResponse
     */
    public GetWarningEventMetricResponse getWarningEventMetric(GetWarningEventMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWarningEventMetricWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the events that occurred in an application.
     *
     * @param request ListAppEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppEventsResponse
     */
    public ListAppEventsResponse listAppEventsWithOptions(ListAppEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the events that occurred in an application.
     *
     * @param request ListAppEventsRequest
     * @return ListAppEventsResponse
     */
    public ListAppEventsResponse listAppEvents(ListAppEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppEventsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 6dcc8c9e-d3da-478a-a066-86dcf820\\*\\*\\*\\*
     *
     * @param request ListAppServicesPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppServicesPageResponse
     */
    public ListAppServicesPageResponse listAppServicesPageWithOptions(ListAppServicesPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 6dcc8c9e-d3da-478a-a066-86dcf820\\*\\*\\*\\*
     *
     * @param request ListAppServicesPageRequest
     * @return ListAppServicesPageResponse
     */
    public ListAppServicesPageResponse listAppServicesPage(ListAppServicesPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppServicesPageWithOptions(request, headers, runtime);
    }

    /**
     * @summary 7171a6ca-d1cd-4928-8642-7d5cfe69\\*\\*\\*\\*
     *
     * @param request ListAppVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppVersionsResponse
     */
    public ListAppVersionsResponse listAppVersionsWithOptions(ListAppVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 7171a6ca-d1cd-4928-8642-7d5cfe69\\*\\*\\*\\*
     *
     * @param request ListAppVersionsRequest
     * @return ListAppVersionsResponse
     */
    public ListAppVersionsResponse listAppVersions(ListAppVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppVersionsWithOptions(request, headers, runtime);
    }

    /**
     * @summary The ID of the namespace.
     *
     * @param request ListApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary The ID of the namespace.
     *
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListChangeOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChangeOrdersResponse
     */
    public ListChangeOrdersResponse listChangeOrdersWithOptions(ListChangeOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ListChangeOrdersRequest
     * @return ListChangeOrdersResponse
     */
    public ListChangeOrdersResponse listChangeOrders(ListChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangeOrdersWithOptions(request, headers, runtime);
    }

    /**
     * @summary b2a8a925-477a-4ed7-b825-d5e22500\\*\\*\\*\\*
     *
     * @param request ListConsumedServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConsumedServicesResponse
     */
    public ListConsumedServicesResponse listConsumedServicesWithOptions(ListConsumedServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary b2a8a925-477a-4ed7-b825-d5e22500\\*\\*\\*\\*
     *
     * @param request ListConsumedServicesRequest
     * @return ListConsumedServicesResponse
     */
    public ListConsumedServicesResponse listConsumedServices(ListConsumedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listConsumedServicesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the details of a canary release rule based on an application ID.
     *
     * @description >  You can configure only one canary release rule for each application.
     *
     * @param request ListGreyTagRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGreyTagRouteResponse
     */
    public ListGreyTagRouteResponse listGreyTagRouteWithOptions(ListGreyTagRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a canary release rule based on an application ID.
     *
     * @description >  You can configure only one canary release rule for each application.
     *
     * @param request ListGreyTagRouteRequest
     * @return ListGreyTagRouteResponse
     */
    public ListGreyTagRouteResponse listGreyTagRoute(ListGreyTagRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGreyTagRouteWithOptions(request, headers, runtime);
    }

    /**
     * @summary The returned message.
     * *   **success** is returned when the request succeeds.
     * *   An error code is returned when the request fails.
     *
     * @param request ListIngressesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIngressesResponse
     */
    public ListIngressesResponse listIngressesWithOptions(ListIngressesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary The returned message.
     * *   **success** is returned when the request succeeds.
     * *   An error code is returned when the request fails.
     *
     * @param request ListIngressesRequest
     * @return ListIngressesResponse
     */
    public ListIngressesResponse listIngresses(ListIngressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIngressesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the information about job templates.
     *
     * @param request ListJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.workload)) {
            query.put("Workload", request.workload);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/listJobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * @summary Queries the information about job templates.
     *
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listJobsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 56f77b65-788d-442a-9885-7f20d91f\\*\\*\\*\\*
     *
     * @param request ListLogConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogConfigsResponse
     */
    public ListLogConfigsResponse listLogConfigsWithOptions(ListLogConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 56f77b65-788d-442a-9885-7f20d91f\\*\\*\\*\\*
     *
     * @param request ListLogConfigsRequest
     * @return ListLogConfigsResponse
     */
    public ListLogConfigsResponse listLogConfigs(ListLogConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogConfigsWithOptions(request, headers, runtime);
    }

    /**
     * @param request ListNamespaceChangeOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespaceChangeOrdersResponse
     */
    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrdersWithOptions(ListNamespaceChangeOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ListNamespaceChangeOrdersRequest
     * @return ListNamespaceChangeOrdersResponse
     */
    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespaceChangeOrdersWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the ConfigMap instances in a namespace.
     *
     * @param request ListNamespacedConfigMapsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespacedConfigMapsResponse
     */
    public ListNamespacedConfigMapsResponse listNamespacedConfigMapsWithOptions(ListNamespacedConfigMapsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the ConfigMap instances in a namespace.
     *
     * @param request ListNamespacedConfigMapsRequest
     * @return ListNamespacedConfigMapsResponse
     */
    public ListNamespacedConfigMapsResponse listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespacedConfigMapsWithOptions(request, headers, runtime);
    }

    /**
     * @summary b2a8a925-477a-4ed7-b825-d5e22500\\*\\*\\*\\*
     *
     * @param request ListPublishedServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedServicesResponse
     */
    public ListPublishedServicesResponse listPublishedServicesWithOptions(ListPublishedServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary b2a8a925-477a-4ed7-b825-d5e22500\\*\\*\\*\\*
     *
     * @param request ListPublishedServicesRequest
     * @return ListPublishedServicesResponse
     */
    public ListPublishedServicesResponse listPublishedServices(ListPublishedServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPublishedServicesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the information about Secrets in a namespace.
     *
     * @param request ListSecretsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecretsWithOptions(ListSecretsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecrets"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/secret/secrets"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretsResponse());
    }

    /**
     * @summary Queries the information about Secrets in a namespace.
     *
     * @param request ListSecretsRequest
     * @return ListSecretsResponse
     */
    public ListSecretsResponse listSecrets(ListSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSecretsWithOptions(request, headers, runtime);
    }

    /**
     * @summary Queries the mapping relationships between applications and tags.
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the mapping relationships between applications and tags.
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
     * @summary Activates the Serverless App Engine (SAE) service for free.
     *
     * @description > Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenSaeServiceResponse
     */
    public OpenSaeServiceResponse openSaeServiceWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Activates the Serverless App Engine (SAE) service for free.
     *
     * @description > Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.
     *
     * @return OpenSaeServiceResponse
     */
    public OpenSaeServiceResponse openSaeService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSaeServiceWithOptions(headers, runtime);
    }

    /**
     * @summary Queries the resource usage of an application.
     *
     * @param request QueryResourceStaticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResourceStaticsResponse
     */
    public QueryResourceStaticsResponse queryResourceStaticsWithOptions(QueryResourceStaticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the resource usage of an application.
     *
     * @param request QueryResourceStaticsRequest
     * @return QueryResourceStaticsResponse
     */
    public QueryResourceStaticsResponse queryResourceStatics(QueryResourceStaticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryResourceStaticsWithOptions(request, headers, runtime);
    }

    /**
     * @summary Reduces capacity by instance IDs.
     *
     * @param request ReduceApplicationCapacityByInstanceIdsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReduceApplicationCapacityByInstanceIdsResponse
     */
    public ReduceApplicationCapacityByInstanceIdsResponse reduceApplicationCapacityByInstanceIdsWithOptions(ReduceApplicationCapacityByInstanceIdsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Reduces capacity by instance IDs.
     *
     * @param request ReduceApplicationCapacityByInstanceIdsRequest
     * @return ReduceApplicationCapacityByInstanceIdsResponse
     */
    public ReduceApplicationCapacityByInstanceIdsResponse reduceApplicationCapacityByInstanceIds(ReduceApplicationCapacityByInstanceIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reduceApplicationCapacityByInstanceIdsWithOptions(request, headers, runtime);
    }

    /**
     * @summary Scales an application.
     *
     * @param request RescaleApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RescaleApplicationResponse
     */
    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Scales an application.
     *
     * @param request RescaleApplicationRequest
     * @return RescaleApplicationResponse
     */
    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rescaleApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Changes the instance specifications of an application.
     *
     * @param request RescaleApplicationVerticallyRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RescaleApplicationVerticallyResponse
     */
    public RescaleApplicationVerticallyResponse rescaleApplicationVerticallyWithOptions(RescaleApplicationVerticallyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Changes the instance specifications of an application.
     *
     * @param request RescaleApplicationVerticallyRequest
     * @return RescaleApplicationVerticallyResponse
     */
    public RescaleApplicationVerticallyResponse rescaleApplicationVertically(RescaleApplicationVerticallyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rescaleApplicationVerticallyWithOptions(request, headers, runtime);
    }

    /**
     * @summary Restarts an application.
     *
     * @param request RestartApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartApplicationResponse
     */
    public RestartApplicationResponse restartApplicationWithOptions(RestartApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Restarts an application.
     *
     * @param request RestartApplicationRequest
     * @return RestartApplicationResponse
     */
    public RestartApplicationResponse restartApplication(RestartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Restarts one or more instances in an application.
     *
     * @param request RestartInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstancesResponse
     */
    public RestartInstancesResponse restartInstancesWithOptions(RestartInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Restarts one or more instances in an application.
     *
     * @param request RestartInstancesRequest
     * @return RestartInstancesResponse
     */
    public RestartInstancesResponse restartInstances(RestartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restartInstancesWithOptions(request, headers, runtime);
    }

    /**
     * @summary Rolls back an application.
     *
     * @param request RollbackApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackApplicationResponse
     */
    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Rolls back an application.
     *
     * @param request RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rollbackApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Starts an application.
     *
     * @param request StartApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartApplicationResponse
     */
    public StartApplicationResponse startApplicationWithOptions(StartApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Starts an application.
     *
     * @param request StartApplicationRequest
     * @return StartApplicationResponse
     */
    public StartApplicationResponse startApplication(StartApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary 0099b7be-5f5b-4512-a7fc-56049ef1\\*\\*\\*\\*
     *
     * @param request StopApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopApplicationResponse
     */
    public StopApplicationResponse stopApplicationWithOptions(StopApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 0099b7be-5f5b-4512-a7fc-56049ef1\\*\\*\\*\\*
     *
     * @param request StopApplicationRequest
     * @return StopApplicationResponse
     */
    public StopApplicationResponse stopApplication(StopApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopApplicationWithOptions(request, headers, runtime);
    }

    /**
     * @summary Suspends a job.
     *
     * @param request SuspendJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendJobResponse
     */
    public SuspendJobResponse suspendJobWithOptions(SuspendJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suspend)) {
            query.put("Suspend", request.suspend);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/suspendJob"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendJobResponse());
    }

    /**
     * @summary Suspends a job.
     *
     * @param request SuspendJobRequest
     * @return SuspendJobResponse
     */
    public SuspendJobResponse suspendJob(SuspendJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.suspendJobWithOptions(request, headers, runtime);
    }

    /**
     * @summary cn-beijing
     *
     * @param request TagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary cn-beijing
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
     * @summary 0099b7be-5f5b-4512-a7fc-56049ef1\\*\\*\\*\\*
     *
     * @param request UnbindSlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindSlbResponse
     */
    public UnbindSlbResponse unbindSlbWithOptions(UnbindSlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 0099b7be-5f5b-4512-a7fc-56049ef1\\*\\*\\*\\*
     *
     * @param request UnbindSlbRequest
     * @return UnbindSlbResponse
     */
    public UnbindSlbResponse unbindSlb(UnbindSlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindSlbWithOptions(request, headers, runtime);
    }

    /**
     * @param request UntagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 017f39b8-dfa4-4e16-a84b-1dcee4b1\\*\\*\\*\\*
     *
     * @param request UpdateAppSecurityGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppSecurityGroupResponse
     */
    public UpdateAppSecurityGroupResponse updateAppSecurityGroupWithOptions(UpdateAppSecurityGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 017f39b8-dfa4-4e16-a84b-1dcee4b1\\*\\*\\*\\*
     *
     * @param request UpdateAppSecurityGroupRequest
     * @return UpdateAppSecurityGroupResponse
     */
    public UpdateAppSecurityGroupResponse updateAppSecurityGroup(UpdateAppSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppSecurityGroupWithOptions(request, headers, runtime);
    }

    /**
     * @summary 更新应用描述信息
     *
     * @param request UpdateApplicationDescriptionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationDescriptionResponse
     */
    public UpdateApplicationDescriptionResponse updateApplicationDescriptionWithOptions(UpdateApplicationDescriptionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appDescription)) {
            query.put("AppDescription", request.appDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationDescription"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/updateAppDescription"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationDescriptionResponse());
    }

    /**
     * @summary 更新应用描述信息
     *
     * @param request UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    public UpdateApplicationDescriptionResponse updateApplicationDescription(UpdateApplicationDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationDescriptionWithOptions(request, headers, runtime);
    }

    /**
     * @summary Updates the auto scaling policy of an application.
     *
     * @description ##
     * If you want to configure more than 50 instances for an application, you must submit a [ticket](https://workorder.console.aliyun.com/#/ticket/createIndex) to add your account to the whitelist.
     *
     * @param request UpdateApplicationScalingRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationScalingRuleResponse
     */
    public UpdateApplicationScalingRuleResponse updateApplicationScalingRuleWithOptions(UpdateApplicationScalingRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Updates the auto scaling policy of an application.
     *
     * @description ##
     * If you want to configure more than 50 instances for an application, you must submit a [ticket](https://workorder.console.aliyun.com/#/ticket/createIndex) to add your account to the whitelist.
     *
     * @param request UpdateApplicationScalingRuleRequest
     * @return UpdateApplicationScalingRuleResponse
     */
    public UpdateApplicationScalingRuleResponse updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationScalingRuleWithOptions(request, headers, runtime);
    }

    /**
     * @param request UpdateApplicationVswitchesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationVswitchesResponse
     */
    public UpdateApplicationVswitchesResponse updateApplicationVswitchesWithOptions(UpdateApplicationVswitchesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationVswitches"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/updateAppVswitches"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationVswitchesResponse());
    }

    /**
     * @param request UpdateApplicationVswitchesRequest
     * @return UpdateApplicationVswitchesResponse
     */
    public UpdateApplicationVswitchesResponse updateApplicationVswitches(UpdateApplicationVswitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationVswitchesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 1
     *
     * @param request UpdateConfigMapRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigMapResponse
     */
    public UpdateConfigMapResponse updateConfigMapWithOptions(UpdateConfigMapRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 1
     *
     * @param request UpdateConfigMapRequest
     * @return UpdateConfigMapResponse
     */
    public UpdateConfigMapResponse updateConfigMap(UpdateConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * @summary Updates a canary release rule.
     *
     * @param request UpdateGreyTagRouteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGreyTagRouteResponse
     */
    public UpdateGreyTagRouteResponse updateGreyTagRouteWithOptions(UpdateGreyTagRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albRules)) {
            query.put("AlbRules", request.albRules);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Updates a canary release rule.
     *
     * @param request UpdateGreyTagRouteRequest
     * @return UpdateGreyTagRouteResponse
     */
    public UpdateGreyTagRouteResponse updateGreyTagRoute(UpdateGreyTagRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGreyTagRouteWithOptions(request, headers, runtime);
    }

    /**
     * @param request UpdateIngressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIngressResponse
     */
    public UpdateIngressResponse updateIngressWithOptions(UpdateIngressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalanceType)) {
            query.put("LoadBalanceType", request.loadBalanceType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rules)) {
            body.put("Rules", request.rules);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateIngressRequest
     * @return UpdateIngressResponse
     */
    public UpdateIngressResponse updateIngress(UpdateIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIngressWithOptions(request, headers, runtime);
    }

    /**
     * @summary Updates a job template.
     *
     * @param request UpdateJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrAssumeRoleArn)) {
            query.put("AcrAssumeRoleArn", request.acrAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backoffLimit)) {
            query.put("BackoffLimit", request.backoffLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commandArgs)) {
            query.put("CommandArgs", request.commandArgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.concurrencyPolicy)) {
            query.put("ConcurrencyPolicy", request.concurrencyPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customHostAlias)) {
            query.put("CustomHostAlias", request.customHostAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePullSecrets)) {
            query.put("ImagePullSecrets", request.imagePullSecrets);
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

        if (!com.aliyun.teautil.Common.isUnset(request.mountDesc)) {
            query.put("MountDesc", request.mountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountHost)) {
            query.put("MountHost", request.mountHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nasId)) {
            query.put("NasId", request.nasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageUrl)) {
            query.put("PackageUrl", request.packageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageVersion)) {
            query.put("PackageVersion", request.packageVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.programmingLanguage)) {
            query.put("ProgrammingLanguage", request.programmingLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.python)) {
            query.put("Python", request.python);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonModules)) {
            query.put("PythonModules", request.pythonModules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refAppId)) {
            query.put("RefAppId", request.refAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slice)) {
            query.put("Slice", request.slice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sliceEnvs)) {
            query.put("SliceEnvs", request.sliceEnvs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminationGracePeriodSeconds)) {
            query.put("TerminationGracePeriodSeconds", request.terminationGracePeriodSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            query.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tomcatConfig)) {
            query.put("TomcatConfig", request.tomcatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfig)) {
            query.put("TriggerConfig", request.triggerConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.configMapMountDesc)) {
            body.put("ConfigMapMountDesc", request.configMapMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableImageAccl)) {
            body.put("EnableImageAccl", request.enableImageAccl);
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

        if (!com.aliyun.teautil.Common.isUnset(request.php)) {
            body.put("Php", request.php);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phpConfig)) {
            body.put("PhpConfig", request.phpConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/job/updateJob"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    /**
     * @summary Updates a job template.
     *
     * @param request UpdateJobRequest
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJobWithOptions(request, headers, runtime);
    }

    /**
     * @summary Updates the information about a namespace.
     *
     * @param request UpdateNamespaceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespaceWithOptions(UpdateNamespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableMicroRegistration)) {
            query.put("EnableMicroRegistration", request.enableMicroRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceDescription)) {
            query.put("NamespaceDescription", request.namespaceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceName)) {
            query.put("NamespaceName", request.namespaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Updates the information about a namespace.
     *
     * @param request UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    public UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * @summary cn-beijing:test
     *
     * @param request UpdateNamespaceVpcRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceVpcResponse
     */
    public UpdateNamespaceVpcResponse updateNamespaceVpcWithOptions(UpdateNamespaceVpcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary cn-beijing:test
     *
     * @param request UpdateNamespaceVpcRequest
     * @return UpdateNamespaceVpcResponse
     */
    public UpdateNamespaceVpcResponse updateNamespaceVpc(UpdateNamespaceVpcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceVpcWithOptions(request, headers, runtime);
    }

    /**
     * @summary The HTTP status code. Valid values:
     * *   **2xx**: The call was successful.
     * *   **3xx**: The call was redirected.
     * *   **4xx**: The call failed.
     * *   **5xx**: A server error occurred.
     *
     * @param tmpReq UpdateSecretRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecretWithOptions(UpdateSecretRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecretShrinkRequest request = new UpdateSecretShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.secretData)) {
            request.secretDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.secretData, "SecretData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretDataShrink)) {
            query.put("SecretData", request.secretDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecret"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/secret/secret"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretResponse());
    }

    /**
     * @summary The HTTP status code. Valid values:
     * *   **2xx**: The call was successful.
     * *   **3xx**: The call was redirected.
     * *   **4xx**: The call failed.
     * *   **5xx**: A server error occurred.
     *
     * @param request UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSecretWithOptions(request, headers, runtime);
    }
}

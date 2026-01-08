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
     * <b>summary</b> : 
     * <p>Terminates a change order and rolls back the corresponding application.</p>
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
     * <b>summary</b> : 
     * <p>Terminates a change order and rolls back the corresponding application.</p>
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
     * <b>summary</b> : 
     * <p>Terminate a change order.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.rollback)) {
            query.put("Rollback", request.rollback);
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
     * <b>summary</b> : 
     * <p>Terminate a change order.</p>
     * 
     * @param request AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    public AbortChangeOrderResponse abortChangeOrder(AbortChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortChangeOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts applications in batches.</p>
     * 
     * @param request BatchRestartApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRestartApplicationsResponse
     */
    public BatchRestartApplicationsResponse batchRestartApplicationsWithOptions(BatchRestartApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRestartApplications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/batchRestartApplications"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRestartApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts applications in batches.</p>
     * 
     * @param request BatchRestartApplicationsRequest
     * @return BatchRestartApplicationsResponse
     */
    public BatchRestartApplicationsResponse batchRestartApplications(BatchRestartApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchRestartApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts multiple applications at a time.</p>
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
     * <b>summary</b> : 
     * <p>Starts multiple applications at a time.</p>
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
     * <b>summary</b> : 
     * <p>Stop applications in batches.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stop applications in batches.</p>
     * 
     * @param request BatchStopApplicationsRequest
     * @return BatchStopApplicationsResponse
     */
    public BatchStopApplicationsResponse batchStopApplications(BatchStopApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchStopApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Network Load Balancer (NLB) instance with an application.</p>
     * 
     * @param request BindNlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindNlbResponse
     */
    public BindNlbResponse bindNlbWithOptions(BindNlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listeners)) {
            query.put("Listeners", request.listeners);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlbId)) {
            query.put("NlbId", request.nlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindNlb"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/nlb"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindNlbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a Network Load Balancer (NLB) instance with an application.</p>
     * 
     * @param request BindNlbRequest
     * @return BindNlbResponse
     */
    public BindNlbResponse bindNlb(BindNlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindNlbWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbChargeType)) {
            query.put("InternetSlbChargeType", request.internetSlbChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetSlbId)) {
            query.put("InternetSlbId", request.internetSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranet)) {
            query.put("Intranet", request.intranet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetSlbChargeType)) {
            query.put("IntranetSlbChargeType", request.intranetSlbChargeType);
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
     * <b>summary</b> : 
     * <p>Confirms whether to start the next batch.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Confirms whether to start the next batch.</p>
     * 
     * @param request ConfirmPipelineBatchRequest
     * @return ConfirmPipelineBatchResponse
     */
    public ConfirmPipelineBatchResponse confirmPipelineBatch(ConfirmPipelineBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmPipelineBatchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param tmpReq CreateApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApplicationShrinkRequest request = new CreateApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.initContainersConfig)) {
            request.initContainersConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.initContainersConfig, "InitContainersConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sidecarContainersConfig)) {
            request.sidecarContainersConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sidecarContainersConfig, "SidecarContainersConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrAssumeRoleArn)) {
            query.put("AcrAssumeRoleArn", request.acrAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
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

        if (!com.aliyun.teautil.Common.isUnset(request.customImageNetworkType)) {
            query.put("CustomImageNetworkType", request.customImageNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploy)) {
            query.put("Deploy", request.deploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dotnet)) {
            query.put("Dotnet", request.dotnet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCpuBurst)) {
            query.put("EnableCpuBurst", request.enableCpuBurst);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEbpf)) {
            query.put("EnableEbpf", request.enableEbpf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNamespaceAgentVersion)) {
            query.put("EnableNamespaceAgentVersion", request.enableNamespaceAgentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNamespaceSlsConfig)) {
            query.put("EnableNamespaceSlsConfig", request.enableNamespaceSlsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNewArms)) {
            query.put("EnableNewArms", request.enableNewArms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePrometheus)) {
            query.put("EnablePrometheus", request.enablePrometheus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuConfig)) {
            query.put("GpuConfig", request.gpuConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.headlessPvtzDiscoverySvc)) {
            query.put("HeadlessPvtzDiscoverySvc", request.headlessPvtzDiscoverySvc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html)) {
            query.put("Html", request.html);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imagePullSecrets)) {
            query.put("ImagePullSecrets", request.imagePullSecrets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isStateful)) {
            query.put("IsStateful", request.isStateful);
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

        if (!com.aliyun.teautil.Common.isUnset(request.lokiConfigs)) {
            query.put("LokiConfigs", request.lokiConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistration)) {
            query.put("MicroRegistration", request.microRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microserviceEngineConfig)) {
            query.put("MicroserviceEngineConfig", request.microserviceEngineConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.newSaeVersion)) {
            query.put("NewSaeVersion", request.newSaeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcRoleName)) {
            query.put("OidcRoleName", request.oidcRoleName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saeVersion)) {
            query.put("SaeVersion", request.saeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretMountDesc)) {
            query.put("SecretMountDesc", request.secretMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogEnvTags)) {
            query.put("SlsLogEnvTags", request.slsLogEnvTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startupProbe)) {
            query.put("StartupProbe", request.startupProbe);
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

        if (!com.aliyun.teautil.Common.isUnset(request.baseAppId)) {
            body.put("BaseAppId", request.baseAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMapMountDesc)) {
            body.put("ConfigMapMountDesc", request.configMapMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emptyDirDesc)) {
            body.put("EmptyDirDesc", request.emptyDirDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSidecarResourceIsolated)) {
            body.put("EnableSidecarResourceIsolated", request.enableSidecarResourceIsolated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainersConfigShrink)) {
            body.put("InitContainersConfig", request.initContainersConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistrationConfig)) {
            body.put("MicroRegistrationConfig", request.microRegistrationConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTags)) {
            body.put("ServiceTags", request.serviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarContainersConfigShrink)) {
            body.put("SidecarContainersConfig", request.sidecarContainersConfigShrink);
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
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Precautions</h2>
     * <ul>
     * <li>You can create up to five auto scaling policies for one application.</li>
     * <li>You can create up to 20 trigger points within one day in a scheduled auto scaling policy.</li>
     * <li>If an auto scaling policy is enabled for an application, you cannot manually manage the lifecycle of the application. For example, you cannot scale, deploy (including single-batch release, phased release, and canary release), stop, or restart the application, or change the instance type. If you want to perform the preceding operations on the application, disable the auto scaling policy and then manually perform the operations.</li>
     * <li>If an application is in the process of scale-out, scale-in, deployment (including single-batch release, phased release, and canary release), instance type change, restart, or stop, you cannot add or enable an auto scaling policy for the application.</li>
     * <li>If you want to configure more than 50 instances for an application, you must contact SAE technical support to add your account to the whitelist. For more information, see <a href="https://help.aliyun.com/document_detail/146530.html">Contact us</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an auto scaling policy for an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableIdle)) {
            query.put("EnableIdle", request.enableIdle);
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
     * <b>description</b> :
     * <h2><a href="#"></a>Precautions</h2>
     * <ul>
     * <li>You can create up to five auto scaling policies for one application.</li>
     * <li>You can create up to 20 trigger points within one day in a scheduled auto scaling policy.</li>
     * <li>If an auto scaling policy is enabled for an application, you cannot manually manage the lifecycle of the application. For example, you cannot scale, deploy (including single-batch release, phased release, and canary release), stop, or restart the application, or change the instance type. If you want to perform the preceding operations on the application, disable the auto scaling policy and then manually perform the operations.</li>
     * <li>If an application is in the process of scale-out, scale-in, deployment (including single-batch release, phased release, and canary release), instance type change, restart, or stop, you cannot add or enable an auto scaling policy for the application.</li>
     * <li>If you want to configure more than 50 instances for an application, you must contact SAE technical support to add your account to the whitelist. For more information, see <a href="https://help.aliyun.com/document_detail/146530.html">Contact us</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an auto scaling policy for an application.</p>
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
     * <b>summary</b> : 
     * <p>Create a ConfigMap in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Create a ConfigMap in a namespace.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a canary release rule for a Spring Cloud or Dubbo application.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a canary release rule for a Spring Cloud or Dubbo application.</p>
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
     * <b>summary</b> : 
     * <p>Creates a routing rule.</p>
     * 
     * @param request CreateIngressRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIngressResponse
     */
    public CreateIngressResponse createIngressWithOptions(CreateIngressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certId)) {
            query.put("CertId", request.certId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certIds)) {
            query.put("CertIds", request.certIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corsConfig)) {
            query.put("CorsConfig", request.corsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            query.put("DefaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGzip)) {
            query.put("EnableGzip", request.enableGzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedFor)) {
            query.put("EnableXForwardedFor", request.enableXForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForClientSrcPort)) {
            query.put("EnableXForwardedForClientSrcPort", request.enableXForwardedForClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForProto)) {
            query.put("EnableXForwardedForProto", request.enableXForwardedForProto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForSlbId)) {
            query.put("EnableXForwardedForSlbId", request.enableXForwardedForSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForSlbPort)) {
            query.put("EnableXForwardedForSlbPort", request.enableXForwardedForSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerEdition)) {
            query.put("LoadBalancerEdition", request.loadBalancerEdition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slbId)) {
            query.put("SlbId", request.slbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            query.put("ZoneMappings", request.zoneMappings);
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
     * <b>summary</b> : 
     * <p>Creates a routing rule.</p>
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
     * <b>summary</b> : 
     * <p>Create a job template.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bestEffortType)) {
            query.put("BestEffortType", request.bestEffortType);
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
     * <b>summary</b> : 
     * <p>Create a job template.</p>
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
     * <b>summary</b> : 
     * <p>Create a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Create a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Creates or updates a lane.</p>
     * 
     * @param tmpReq CreateOrUpdateSwimmingLaneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateSwimmingLaneResponse
     */
    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLaneWithOptions(CreateOrUpdateSwimmingLaneRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrUpdateSwimmingLaneShrinkRequest request = new CreateOrUpdateSwimmingLaneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appEntryRule)) {
            request.appEntryRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appEntryRule, "AppEntryRule", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mseGatewayEntryRule)) {
            request.mseGatewayEntryRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mseGatewayEntryRule, "MseGatewayEntryRule", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appEntryRuleShrink)) {
            query.put("AppEntryRule", request.appEntryRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.canaryModel)) {
            query.put("CanaryModel", request.canaryModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneName)) {
            query.put("LaneName", request.laneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneTag)) {
            query.put("LaneTag", request.laneTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseGatewayEntryRuleShrink)) {
            query.put("MseGatewayEntryRule", request.mseGatewayEntryRuleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateSwimmingLane"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/createOrUpdateSwimmingLane"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateSwimmingLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a lane.</p>
     * 
     * @param request CreateOrUpdateSwimmingLaneRequest
     * @return CreateOrUpdateSwimmingLaneResponse
     */
    public CreateOrUpdateSwimmingLaneResponse createOrUpdateSwimmingLane(CreateOrUpdateSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrUpdateSwimmingLaneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a lane group.</p>
     * 
     * @param tmpReq CreateOrUpdateSwimmingLaneGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrUpdateSwimmingLaneGroupResponse
     */
    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroupWithOptions(CreateOrUpdateSwimmingLaneGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrUpdateSwimmingLaneGroupShrinkRequest request = new CreateOrUpdateSwimmingLaneGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appIds)) {
            request.appIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appIds, "AppIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdsShrink)) {
            query.put("AppIds", request.appIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryAppId)) {
            query.put("EntryAppId", request.entryAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryAppType)) {
            query.put("EntryAppType", request.entryAppType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimVersion)) {
            query.put("SwimVersion", request.swimVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrUpdateSwimmingLaneGroup"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/createOrUpdateSwimmingLaneGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrUpdateSwimmingLaneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a lane group.</p>
     * 
     * @param request CreateOrUpdateSwimmingLaneGroupRequest
     * @return CreateOrUpdateSwimmingLaneGroupResponse
     */
    public CreateOrUpdateSwimmingLaneGroupResponse createOrUpdateSwimmingLaneGroup(CreateOrUpdateSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrUpdateSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Secret in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Creates a Secret in a namespace.</p>
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
     * <b>description</b> :
     * <p>Call the CreateWebApplication operation to create a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a web application</p>
     * 
     * @param request CreateWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebApplicationResponse
     */
    public CreateWebApplicationResponse createWebApplicationWithOptions(CreateWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the CreateWebApplication operation to create a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a web application</p>
     * 
     * @param request CreateWebApplicationRequest
     * @return CreateWebApplicationResponse
     */
    public CreateWebApplicationResponse createWebApplication(CreateWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWebApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create a custom domain name for the web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a custom domain name for the web application.</p>
     * 
     * @param request CreateWebCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebCustomDomainResponse
     */
    public CreateWebCustomDomainResponse createWebCustomDomainWithOptions(CreateWebCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebCustomDomain"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/custom-domains"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebCustomDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create a custom domain name for the web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a custom domain name for the web application.</p>
     * 
     * @param request CreateWebCustomDomainRequest
     * @return CreateWebCustomDomainResponse
     */
    public CreateWebCustomDomainResponse createWebCustomDomain(CreateWebCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWebCustomDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
     * 
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\<em>\</em>\<em>\</em></p>
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
     * <b>summary</b> : 
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69\<em>\</em>\<em>\</em></p>
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
     * <b>summary</b> : 
     * <p>Deletes a ConfigMap.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a ConfigMap.</p>
     * 
     * @param request DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     */
    public DeleteConfigMapResponse deleteConfigMap(DeleteConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a canary release rule based on the specified rule ID.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a canary release rule based on the specified rule ID.</p>
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
     * <b>summary</b> : 
     * <p>Delete a job.</p>
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
     * <b>summary</b> : 
     * <p>Delete a job.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a routing rule.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a routing rule.</p>
     * 
     * @param request DeleteIngressRequest
     * @return DeleteIngressResponse
     */
    public DeleteIngressResponse deleteIngress(DeleteIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIngressWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application instance.</p>
     * 
     * @param request DeleteInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteInstances"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/deleteInstances"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application instance.</p>
     * 
     * @param request DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a job template.</p>
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
     * <b>summary</b> : 
     * <p>Delete a job template.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteNamespaceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Secret.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a Secret.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a lane group.</p>
     * 
     * @param request DeleteSwimmingLaneGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSwimmingLaneGroupResponse
     */
    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroupWithOptions(DeleteSwimmingLaneGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSwimmingLaneGroup"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/deleteSwimmingLaneGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSwimmingLaneGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a lane group.</p>
     * 
     * @param request DeleteSwimmingLaneGroupRequest
     * @return DeleteSwimmingLaneGroupResponse
     */
    public DeleteSwimmingLaneGroupResponse deleteSwimmingLaneGroup(DeleteSwimmingLaneGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSwimmingLaneGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the DeleteWebApplication operation to delete a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a web application.</p>
     * 
     * @param request DeleteWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebApplicationResponse
     */
    public DeleteWebApplicationResponse deleteWebApplicationWithOptions(String ApplicationId, DeleteWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the DeleteWebApplication operation to delete a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a web application.</p>
     * 
     * @param request DeleteWebApplicationRequest
     * @return DeleteWebApplicationResponse
     */
    public DeleteWebApplicationResponse deleteWebApplication(String ApplicationId, DeleteWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWebApplicationWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete a web application version.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a web application version.</p>
     * 
     * @param request DeleteWebApplicationRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebApplicationRevisionResponse
     */
    public DeleteWebApplicationRevisionResponse deleteWebApplicationRevisionWithOptions(String ApplicationId, String RevisionId, DeleteWebApplicationRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteWebApplicationRevision"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(RevisionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebApplicationRevisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete a web application version.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a web application version.</p>
     * 
     * @param request DeleteWebApplicationRevisionRequest
     * @return DeleteWebApplicationRevisionResponse
     */
    public DeleteWebApplicationRevisionResponse deleteWebApplicationRevision(String ApplicationId, String RevisionId, DeleteWebApplicationRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWebApplicationRevisionWithOptions(ApplicationId, RevisionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Delete a custom domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a custom domain name.</p>
     * 
     * @param request DeleteWebCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebCustomDomainResponse
     */
    public DeleteWebCustomDomainResponse deleteWebCustomDomainWithOptions(String DomainName, DeleteWebCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteWebCustomDomain"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebCustomDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Delete a custom domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete a custom domain name.</p>
     * 
     * @param request DeleteWebCustomDomainRequest
     * @return DeleteWebCustomDomainResponse
     */
    public DeleteWebCustomDomainResponse deleteWebCustomDomain(String DomainName, DeleteWebCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteWebCustomDomainWithOptions(DomainName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys an application.</p>
     * 
     * @param tmpReq DeployApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplicationWithOptions(DeployApplicationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeployApplicationShrinkRequest request = new DeployApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.initContainersConfig)) {
            request.initContainersConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.initContainersConfig, "InitContainersConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sidecarContainersConfig)) {
            request.sidecarContainersConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sidecarContainersConfig, "SidecarContainersConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrAssumeRoleArn)) {
            query.put("AcrAssumeRoleArn", request.acrAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            query.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.albIngressReadinessGate)) {
            query.put("AlbIngressReadinessGate", request.albIngressReadinessGate);
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

        if (!com.aliyun.teautil.Common.isUnset(request.customImageNetworkType)) {
            query.put("CustomImageNetworkType", request.customImageNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploy)) {
            query.put("Deploy", request.deploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dotnet)) {
            query.put("Dotnet", request.dotnet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edasContainerVersion)) {
            query.put("EdasContainerVersion", request.edasContainerVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCpuBurst)) {
            query.put("EnableCpuBurst", request.enableCpuBurst);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGreyTagRoute)) {
            query.put("EnableGreyTagRoute", request.enableGreyTagRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNamespaceAgentVersion)) {
            query.put("EnableNamespaceAgentVersion", request.enableNamespaceAgentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableNewArms)) {
            query.put("EnableNewArms", request.enableNewArms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePrometheus)) {
            query.put("EnablePrometheus", request.enablePrometheus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envs)) {
            query.put("Envs", request.envs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuConfig)) {
            query.put("GpuConfig", request.gpuConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.html)) {
            query.put("Html", request.html);
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

        if (!com.aliyun.teautil.Common.isUnset(request.lokiConfigs)) {
            query.put("LokiConfigs", request.lokiConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSurgeInstanceRatio)) {
            query.put("MaxSurgeInstanceRatio", request.maxSurgeInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSurgeInstances)) {
            query.put("MaxSurgeInstances", request.maxSurgeInstances);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistration)) {
            query.put("MicroRegistration", request.microRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microserviceEngineConfig)) {
            query.put("MicroserviceEngineConfig", request.microserviceEngineConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.newSaeVersion)) {
            query.put("NewSaeVersion", request.newSaeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcRoleName)) {
            query.put("OidcRoleName", request.oidcRoleName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.secretMountDesc)) {
            query.put("SecretMountDesc", request.secretMountDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogEnvTags)) {
            query.put("SlsLogEnvTags", request.slsLogEnvTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startupProbe)) {
            query.put("StartupProbe", request.startupProbe);
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

        if (!com.aliyun.teautil.Common.isUnset(request.emptyDirDesc)) {
            body.put("EmptyDirDesc", request.emptyDirDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSidecarResourceIsolated)) {
            body.put("EnableSidecarResourceIsolated", request.enableSidecarResourceIsolated);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initContainersConfigShrink)) {
            body.put("InitContainersConfig", request.initContainersConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.microRegistrationConfig)) {
            body.put("MicroRegistrationConfig", request.microRegistrationConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceTags)) {
            body.put("ServiceTags", request.serviceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sidecarContainersConfigShrink)) {
            body.put("SidecarContainersConfig", request.sidecarContainersConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swimlanePvtzDiscoverySvc)) {
            body.put("SwimlanePvtzDiscoverySvc", request.swimlanePvtzDiscoverySvc);
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
     * <b>summary</b> : 
     * <p>Deploys an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the metadata details of the service of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the metadata details of the service of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the configurations of an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the configurations of an application.</p>
     * 
     * @param request DescribeApplicationConfigRequest
     * @return DescribeApplicationConfigResponse
     */
    public DescribeApplicationConfigResponse describeApplicationConfig(DescribeApplicationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationConfigWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance groups of an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the instance groups of an application.</p>
     * 
     * @param request DescribeApplicationGroupsRequest
     * @return DescribeApplicationGroupsResponse
     */
    public DescribeApplicationGroupsResponse describeApplicationGroups(DescribeApplicationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the image of an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information about the image of an application.</p>
     * 
     * @param request DescribeApplicationImageRequest
     * @return DescribeApplicationImageResponse
     */
    public DescribeApplicationImageResponse describeApplicationImage(DescribeApplicationImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationImageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of application instances.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipelineId)) {
            query.put("PipelineId", request.pipelineId);
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
     * <b>summary</b> : 
     * <p>Queries a list of application instances.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information of the associated MSE microservice governance application.</p>
     * 
     * @param request DescribeApplicationMseServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationMseServiceResponse
     */
    public DescribeApplicationMseServiceResponse describeApplicationMseServiceWithOptions(DescribeApplicationMseServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAhas)) {
            query.put("EnableAhas", request.enableAhas);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationMseService"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/applicationMseService"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationMseServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of the associated MSE microservice governance application.</p>
     * 
     * @param request DescribeApplicationMseServiceRequest
     * @return DescribeApplicationMseServiceResponse
     */
    public DescribeApplicationMseServiceResponse describeApplicationMseService(DescribeApplicationMseServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationMseServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Network Load Balancer (NLB) instances bound to an application and their listeners.</p>
     * 
     * @param request DescribeApplicationNlbsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationNlbsResponse
     */
    public DescribeApplicationNlbsResponse describeApplicationNlbsWithOptions(DescribeApplicationNlbsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeApplicationNlbs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/nlb"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationNlbsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Network Load Balancer (NLB) instances bound to an application and their listeners.</p>
     * 
     * @param request DescribeApplicationNlbsRequest
     * @return DescribeApplicationNlbsResponse
     */
    public DescribeApplicationNlbsResponse describeApplicationNlbs(DescribeApplicationNlbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationNlbsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an Auto Scaling policy of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries an Auto Scaling policy of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the auto scaling policies of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the auto scaling policies of an application.</p>
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
     * <b>summary</b> : 
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1\<em>\</em>\<em>\</em></p>
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
     * <b>summary</b> : 
     * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1\<em>\</em>\<em>\</em></p>
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
     * <b>summary</b> : 
     * <p>Queries the status of an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the status of an application.</p>
     * 
     * @param request DescribeApplicationStatusRequest
     * @return DescribeApplicationStatusResponse
     */
    public DescribeApplicationStatusResponse describeApplicationStatus(DescribeApplicationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeApplicationStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a change order.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the information of a change order.</p>
     * 
     * @param request DescribeChangeOrderRequest
     * @return DescribeChangeOrderResponse
     */
    public DescribeChangeOrderResponse describeChangeOrder(DescribeChangeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChangeOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the version of the component that is required when you create and deploy an application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the version of the component that is required when you create and deploy an application.</p>
     * 
     * @param request DescribeComponentsRequest
     * @return DescribeComponentsResponse
     */
    public DescribeComponentsResponse describeComponents(DescribeComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeComponentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a ConfigMap.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the details of a ConfigMap.</p>
     * 
     * @param request DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     */
    public DescribeConfigMapResponse describeConfigMap(DescribeConfigMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigMapWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query configuration price.</p>
     * 
     * @param request DescribeConfigurationPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigurationPriceResponse
     */
    public DescribeConfigurationPriceResponse describeConfigurationPriceWithOptions(DescribeConfigurationPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bestEffortType)) {
            query.put("BestEffortType", request.bestEffortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSaeVersion)) {
            query.put("NewSaeVersion", request.newSaeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
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
     * <b>summary</b> : 
     * <p>Query configuration price.</p>
     * 
     * @param request DescribeConfigurationPriceRequest
     * @return DescribeConfigurationPriceResponse
     */
    public DescribeConfigurationPriceResponse describeConfigurationPrice(DescribeConfigurationPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeConfigurationPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the container components of a microservices application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the container components of a microservices application.</p>
     * @return DescribeEdasContainersResponse
     */
    public DescribeEdasContainersResponse describeEdasContainers() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEdasContainersWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a canary release rule based on the specified rule ID.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a canary release rule based on the specified rule ID.</p>
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
     * <b>summary</b> : 
     * <p>Call the DescribeIngress operation to query the details of an Ingress.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Call the DescribeIngress operation to query the details of an Ingress.</p>
     * 
     * @param request DescribeIngressRequest
     * @return DescribeIngressResponse
     */
    public DescribeIngressResponse describeIngress(DescribeIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIngressWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a sidecar container instance.</p>
     * 
     * @param request DescribeInstanceLogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceLogResponse
     */
    public DescribeInstanceLogResponse describeInstanceLogWithOptions(DescribeInstanceLogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerId)) {
            query.put("ContainerId", request.containerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previous)) {
            query.put("Previous", request.previous);
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
     * <b>summary</b> : 
     * <p>Queries the logs of a sidecar container instance.</p>
     * 
     * @param request DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     */
    public DescribeInstanceLogResponse describeInstanceLog(DescribeInstanceLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceLogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all instance types.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries all instance types.</p>
     * @return DescribeInstanceSpecificationsResponse
     */
    public DescribeInstanceSpecificationsResponse describeInstanceSpecifications() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceSpecificationsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a job template.</p>
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
     * <b>summary</b> : 
     * <p>Queries the configurations of a job template.</p>
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
     * <b>summary</b> : 
     * <p>Query the information about jobs.</p>
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
     * <b>summary</b> : 
     * <p>Query the information about jobs.</p>
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
     * <b>summary</b> : 
     * <p>Queries the status of a job.</p>
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
     * <b>summary</b> : 
     * <p>Queries the status of a job.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
     * 
     * @param request DescribeNamespaceListRequest
     * @return DescribeNamespaceListResponse
     */
    public DescribeNamespaceListResponse describeNamespaceList(DescribeNamespaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the information about resources in a namespace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query the information about resources in a namespace.</p>
     * 
     * @param request DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     */
    public DescribeNamespaceResourcesResponse describeNamespaceResources(DescribeNamespaceResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeNamespaceResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
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
     * <b>summary</b> : 
     * <p>View batch information</p>
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
     * <b>summary</b> : 
     * <p>View batch information</p>
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
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
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
     * <b>summary</b> : 
     * <p>Queries available regions.</p>
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Secret.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of a Secret.</p>
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
     * <b>summary</b> : 
     * <p>Queries details about swimlanes.</p>
     * 
     * @param request DescribeSwimmingLaneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSwimmingLaneResponse
     */
    public DescribeSwimmingLaneResponse describeSwimmingLaneWithOptions(DescribeSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSwimmingLane"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/describeSwimmingLane"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSwimmingLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about swimlanes.</p>
     * 
     * @param request DescribeSwimmingLaneRequest
     * @return DescribeSwimmingLaneResponse
     */
    public DescribeSwimmingLaneResponse describeSwimmingLane(DescribeSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSwimmingLaneWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplication operation to query web applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Query web applications.</p>
     * 
     * @param request DescribeWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebApplicationResponse
     */
    public DescribeWebApplicationResponse describeWebApplicationWithOptions(String ApplicationId, DescribeWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplication operation to query web applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Query web applications.</p>
     * 
     * @param request DescribeWebApplicationRequest
     * @return DescribeWebApplicationResponse
     */
    public DescribeWebApplicationResponse describeWebApplication(String ApplicationId, DescribeWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebApplicationWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the resource usage of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the resource usage of a web application.</p>
     * 
     * @param request DescribeWebApplicationResourceStaticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebApplicationResourceStaticsResponse
     */
    public DescribeWebApplicationResourceStaticsResponse describeWebApplicationResourceStaticsWithOptions(String ApplicationId, DescribeWebApplicationResourceStaticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
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
            new TeaPair("action", "DescribeWebApplicationResourceStatics"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications-observability/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebApplicationResourceStaticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the resource usage of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the resource usage of a web application.</p>
     * 
     * @param request DescribeWebApplicationResourceStaticsRequest
     * @return DescribeWebApplicationResourceStaticsResponse
     */
    public DescribeWebApplicationResourceStaticsResponse describeWebApplicationResourceStatics(String ApplicationId, DescribeWebApplicationResourceStaticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebApplicationResourceStaticsWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Describe a web application version.</p>
     * 
     * <b>summary</b> : 
     * <p>Describe a web application version.</p>
     * 
     * @param request DescribeWebApplicationRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebApplicationRevisionResponse
     */
    public DescribeWebApplicationRevisionResponse describeWebApplicationRevisionWithOptions(String ApplicationId, String RevisionId, DescribeWebApplicationRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebApplicationRevision"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(RevisionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebApplicationRevisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Describe a web application version.</p>
     * 
     * <b>summary</b> : 
     * <p>Describe a web application version.</p>
     * 
     * @param request DescribeWebApplicationRevisionRequest
     * @return DescribeWebApplicationRevisionResponse
     */
    public DescribeWebApplicationRevisionResponse describeWebApplicationRevision(String ApplicationId, String RevisionId, DescribeWebApplicationRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebApplicationRevisionWithOptions(ApplicationId, RevisionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationScalingConfig operation to obtain the scaling configuration of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Describe the scaling configuration of a web application.</p>
     * 
     * @param request DescribeWebApplicationScalingConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebApplicationScalingConfigResponse
     */
    public DescribeWebApplicationScalingConfigResponse describeWebApplicationScalingConfigWithOptions(String ApplicationId, DescribeWebApplicationScalingConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebApplicationScalingConfig"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-scaling/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebApplicationScalingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationScalingConfig operation to obtain the scaling configuration of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Describe the scaling configuration of a web application.</p>
     * 
     * @param request DescribeWebApplicationScalingConfigRequest
     * @return DescribeWebApplicationScalingConfigResponse
     */
    public DescribeWebApplicationScalingConfigResponse describeWebApplicationScalingConfig(String ApplicationId, DescribeWebApplicationScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebApplicationScalingConfigWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationTrafficConfig operation to query the traffic configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the traffic configurations of a web application.</p>
     * 
     * @param request DescribeWebApplicationTrafficConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebApplicationTrafficConfigResponse
     */
    public DescribeWebApplicationTrafficConfigResponse describeWebApplicationTrafficConfigWithOptions(String ApplicationId, DescribeWebApplicationTrafficConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebApplicationTrafficConfig"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-traffic/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebApplicationTrafficConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationTrafficConfig operation to query the traffic configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the traffic configurations of a web application.</p>
     * 
     * @param request DescribeWebApplicationTrafficConfigRequest
     * @return DescribeWebApplicationTrafficConfigResponse
     */
    public DescribeWebApplicationTrafficConfigResponse describeWebApplicationTrafficConfig(String ApplicationId, DescribeWebApplicationTrafficConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebApplicationTrafficConfigWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * @param request DescribeWebCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebCustomDomainResponse
     */
    public DescribeWebCustomDomainResponse describeWebCustomDomainWithOptions(String DomainName, DescribeWebCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebCustomDomain"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebCustomDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * @param request DescribeWebCustomDomainRequest
     * @return DescribeWebCustomDomainResponse
     */
    public DescribeWebCustomDomainResponse describeWebCustomDomain(String DomainName, DescribeWebCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebCustomDomainWithOptions(DomainName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Obtain the logs of web application instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the logs of web application instances.</p>
     * 
     * @param request DescribeWebInstanceLogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWebInstanceLogsResponse
     */
    public DescribeWebInstanceLogsResponse describeWebInstanceLogsWithOptions(String ApplicationId, String InstanceId, DescribeWebInstanceLogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeWebInstanceLogs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications-observability/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/instances/" + com.aliyun.openapiutil.Client.getEncodeParam(InstanceId) + "/logs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWebInstanceLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Obtain the logs of web application instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the logs of web application instances.</p>
     * 
     * @param request DescribeWebInstanceLogsRequest
     * @return DescribeWebInstanceLogsResponse
     */
    public DescribeWebInstanceLogsResponse describeWebInstanceLogs(String ApplicationId, String InstanceId, DescribeWebInstanceLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeWebInstanceLogsWithOptions(ApplicationId, InstanceId, request, headers, runtime);
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
     * <b>summary</b> : 
     * <p>Disables ARMS monitoring.</p>
     * 
     * @param request DisableArmsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableArmsResponse
     */
    public DisableArmsResponse disableArmsWithOptions(DisableArmsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableArms"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/arms/disableArms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableArmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables ARMS monitoring.</p>
     * 
     * @param request DisableArmsRequest
     * @return DisableArmsResponse
     */
    public DisableArmsResponse disableArms(DisableArmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableArmsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disable ARMS Advanced Edition monitoring.</p>
     * 
     * @param request DowngradeApplicationApmServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DowngradeApplicationApmServiceResponse
     */
    public DowngradeApplicationApmServiceResponse downgradeApplicationApmServiceWithOptions(DowngradeApplicationApmServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DowngradeApplicationApmService"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/applicationApmService"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DowngradeApplicationApmServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disable ARMS Advanced Edition monitoring.</p>
     * 
     * @param request DowngradeApplicationApmServiceRequest
     * @return DowngradeApplicationApmServiceResponse
     */
    public DowngradeApplicationApmServiceResponse downgradeApplicationApmService(DowngradeApplicationApmServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downgradeApplicationApmServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an auto scaling policy for an application.</p>
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
     * <b>summary</b> : 
     * <p>Enables an auto scaling policy for an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the basic information of an application.</p>
     * 
     * @param request GetApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/getApplication"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic information of an application.</p>
     * 
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getApplicationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The application name.</p>
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
     * <b>summary</b> : 
     * <p>The application name.</p>
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
     * <b>summary</b> : 
     * <p>Queries the top N applications in which abnormal instances exist. The applications are sorted by the total number of abnormal instances.</p>
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
     * <b>summary</b> : 
     * <p>Queries the top N applications in which abnormal instances exist. The applications are sorted by the total number of abnormal instances.</p>
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
     * <b>summary</b> : 
     * <p>Queries top N applications in abnormal change orders.</p>
     * 
     * @param request GetChangeOrderMetricRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChangeOrderMetricResponse
     */
    public GetChangeOrderMetricResponse getChangeOrderMetricWithOptions(GetChangeOrderMetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSource)) {
            query.put("AppSource", request.appSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coType)) {
            query.put("CoType", request.coType);
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
     * <b>summary</b> : 
     * <p>Queries top N applications in abnormal change orders.</p>
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
     * <b>summary</b> : 
     * <p>Queries the top N applications in which auto scaling takes effect.</p>
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
     * <b>summary</b> : 
     * <p>Queries the top N applications in which auto scaling takes effect.</p>
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
     * <b>summary</b> : 
     * <p>The number of Warning events.</p>
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
     * <b>summary</b> : 
     * <p>The number of Warning events.</p>
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
     * <b>summary</b> : 
     * <p>Obtains the token used to remotely log on to the Webshell of an instance.</p>
     * 
     * @param request GetWebshellTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWebshellTokenResponse
     */
    public GetWebshellTokenResponse getWebshellTokenWithOptions(GetWebshellTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerName)) {
            query.put("ContainerName", request.containerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podName)) {
            query.put("PodName", request.podName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebshellToken"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/instance/webshellToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWebshellTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the token used to remotely log on to the Webshell of an instance.</p>
     * 
     * @param request GetWebshellTokenRequest
     * @return GetWebshellTokenResponse
     */
    public GetWebshellTokenResponse getWebshellToken(GetWebshellTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWebshellTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lane groups.</p>
     * 
     * @param request ListAllSwimmingLaneGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllSwimmingLaneGroupsResponse
     */
    public ListAllSwimmingLaneGroupsResponse listAllSwimmingLaneGroupsWithOptions(ListAllSwimmingLaneGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAllSwimmingLaneGroups"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/listSwimmingLaneGroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllSwimmingLaneGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lane groups.</p>
     * 
     * @param request ListAllSwimmingLaneGroupsRequest
     * @return ListAllSwimmingLaneGroupsResponse
     */
    public ListAllSwimmingLaneGroupsResponse listAllSwimmingLaneGroups(ListAllSwimmingLaneGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllSwimmingLaneGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all swimlanes.</p>
     * 
     * @param request ListAllSwimmingLanesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllSwimmingLanesResponse
     */
    public ListAllSwimmingLanesResponse listAllSwimmingLanesWithOptions(ListAllSwimmingLanesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllSwimmingLanes"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/listSwimmingLanes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllSwimmingLanesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all swimlanes.</p>
     * 
     * @param request ListAllSwimmingLanesRequest
     * @return ListAllSwimmingLanesResponse
     */
    public ListAllSwimmingLanesResponse listAllSwimmingLanes(ListAllSwimmingLanesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAllSwimmingLanesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the events that occurred in an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the events that occurred in an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the list of microservices.</p>
     * 
     * @param request ListAppServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppServicesResponse
     */
    public ListAppServicesResponse listAppServicesWithOptions(ListAppServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryType)) {
            query.put("RegistryType", request.registryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppServices"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/service/listAppServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of microservices.</p>
     * 
     * @param request ListAppServicesRequest
     * @return ListAppServicesResponse
     */
    public ListAppServicesResponse listAppServices(ListAppServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAppServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the services of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the services of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the deployment versions of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the deployment versions of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of applications.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.isStateful)) {
            query.put("IsStateful", request.isStateful);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSaeVersion)) {
            query.put("NewSaeVersion", request.newSaeVersion);
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
     * <b>summary</b> : 
     * <p>Queries a list of applications.</p>
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
     * <b>summary</b> : 
     * <p>Obtains the application list for the end-to-end grayscale pull application list.</p>
     * 
     * @param request ListApplicationsForSwimmingLaneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForSwimmingLaneResponse
     */
    public ListApplicationsForSwimmingLaneResponse listApplicationsForSwimmingLaneWithOptions(ListApplicationsForSwimmingLaneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForSwimmingLane"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/listApplicationsForSwimmingLane"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForSwimmingLaneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the application list for the end-to-end grayscale pull application list.</p>
     * 
     * @param request ListApplicationsForSwimmingLaneRequest
     * @return ListApplicationsForSwimmingLaneResponse
     */
    public ListApplicationsForSwimmingLaneResponse listApplicationsForSwimmingLane(ListApplicationsForSwimmingLaneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listApplicationsForSwimmingLaneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a list of change orders.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
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
     * <b>summary</b> : 
     * <p>Query a list of change orders.</p>
     * 
     * @param request ListChangeOrdersRequest
     * @return ListChangeOrdersResponse
     */
    public ListChangeOrdersResponse listChangeOrders(ListChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangeOrdersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of microservices that are subscribed.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of microservices that are subscribed.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a canary release rule based on an application ID.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a canary release rule based on an application ID.</p>
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
     * <b>summary</b> : 
     * <p>Use ListIngress API call to query Ingress list</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
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
     * <b>summary</b> : 
     * <p>Use ListIngress API call to query Ingress list</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about job templates.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about job templates.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of application logs.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of application logs.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of change orders in a namespace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of change orders in a namespace.</p>
     * 
     * @param request ListNamespaceChangeOrdersRequest
     * @return ListNamespaceChangeOrdersResponse
     */
    public ListNamespaceChangeOrdersResponse listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNamespaceChangeOrdersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ConfigMap instances in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the ConfigMap instances in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of microservices that are published.</p>
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
     * <b>summary</b> : 
     * <p>Queries a list of microservices that are published.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about Secrets in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Queries the information about Secrets in a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Query the gateway routes that are available for a lane</p>
     * 
     * @param request ListSwimmingLaneGatewayRoutesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSwimmingLaneGatewayRoutesResponse
     */
    public ListSwimmingLaneGatewayRoutesResponse listSwimmingLaneGatewayRoutesWithOptions(ListSwimmingLaneGatewayRoutesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayUniqueId)) {
            query.put("GatewayUniqueId", request.gatewayUniqueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSwimmingLaneGatewayRoutes"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/listSwimmingLaneGatewayRoutes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSwimmingLaneGatewayRoutesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the gateway routes that are available for a lane</p>
     * 
     * @param request ListSwimmingLaneGatewayRoutesRequest
     * @return ListSwimmingLaneGatewayRoutesResponse
     */
    public ListSwimmingLaneGatewayRoutesResponse listSwimmingLaneGatewayRoutes(ListSwimmingLaneGatewayRoutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneGatewayRoutesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lane tags.</p>
     * 
     * @param request ListSwimmingLaneGroupTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSwimmingLaneGroupTagsResponse
     */
    public ListSwimmingLaneGroupTagsResponse listSwimmingLaneGroupTagsWithOptions(ListSwimmingLaneGroupTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSwimmingLaneGroupTags"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/listSwimmingLaneGroupTags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSwimmingLaneGroupTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all lane tags.</p>
     * 
     * @param request ListSwimmingLaneGroupTagsRequest
     * @return ListSwimmingLaneGroupTagsResponse
     */
    public ListSwimmingLaneGroupTagsResponse listSwimmingLaneGroupTags(ListSwimmingLaneGroupTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSwimmingLaneGroupTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mapping relationships between applications and tags.</p>
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
     * <b>summary</b> : 
     * <p>Queries the mapping relationships between applications and tags.</p>
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
     * <p>Query the list of web application instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web application instances.</p>
     * 
     * @param tmpReq ListWebApplicationInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWebApplicationInstancesResponse
     */
    public ListWebApplicationInstancesResponse listWebApplicationInstancesWithOptions(String ApplicationId, ListWebApplicationInstancesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWebApplicationInstancesShrinkRequest request = new ListWebApplicationInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statuses)) {
            request.statusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statuses, "Statuses", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.versionIds)) {
            request.versionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.versionIds, "VersionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusesShrink)) {
            query.put("Statuses", request.statusesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionIdsShrink)) {
            query.put("VersionIds", request.versionIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWebApplicationInstances"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications-observability/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWebApplicationInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the list of web application instances.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web application instances.</p>
     * 
     * @param request ListWebApplicationInstancesRequest
     * @return ListWebApplicationInstancesResponse
     */
    public ListWebApplicationInstancesResponse listWebApplicationInstances(String ApplicationId, ListWebApplicationInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWebApplicationInstancesWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the list of web application versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web application versions.</p>
     * 
     * @param request ListWebApplicationRevisionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWebApplicationRevisionsResponse
     */
    public ListWebApplicationRevisionsResponse listWebApplicationRevisionsWithOptions(String ApplicationId, ListWebApplicationRevisionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWebApplicationRevisions"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/revisions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWebApplicationRevisionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query the list of web application versions.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web application versions.</p>
     * 
     * @param request ListWebApplicationRevisionsRequest
     * @return ListWebApplicationRevisionsResponse
     */
    public ListWebApplicationRevisionsResponse listWebApplicationRevisions(String ApplicationId, ListWebApplicationRevisionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWebApplicationRevisionsWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the ListWebApplications operation to query the list of web applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web applications.</p>
     * 
     * @param request ListWebApplicationsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWebApplicationsResponse
     */
    public ListWebApplicationsResponse listWebApplicationsWithOptions(ListWebApplicationsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWebApplications"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWebApplicationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the ListWebApplications operation to query the list of web applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of web applications.</p>
     * 
     * @param request ListWebApplicationsRequest
     * @return ListWebApplicationsResponse
     */
    public ListWebApplicationsResponse listWebApplications(ListWebApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWebApplicationsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query available custom domain names.</p>
     * 
     * <b>summary</b> : 
     * <p>Query available custom domain names.</p>
     * 
     * @param request ListWebCustomDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWebCustomDomainsResponse
     */
    public ListWebCustomDomainsResponse listWebCustomDomainsWithOptions(ListWebCustomDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWebCustomDomains"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/custom-domains"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWebCustomDomainsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query available custom domain names.</p>
     * 
     * <b>summary</b> : 
     * <p>Query available custom domain names.</p>
     * 
     * @param request ListWebCustomDomainsRequest
     * @return ListWebCustomDomainsResponse
     */
    public ListWebCustomDomainsResponse listWebCustomDomains(ListWebCustomDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWebCustomDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates Serverless App Engine (SAE) for free.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Activates Serverless App Engine (SAE) for free.</p>
     * @return OpenSaeServiceResponse
     */
    public OpenSaeServiceResponse openSaeService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSaeServiceWithOptions(headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Publish a web application version. You can change the configurations of the version and create a new version.</p>
     * 
     * <b>summary</b> : 
     * <p>Publish a web application version.</p>
     * 
     * @param request PublishWebApplicationRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishWebApplicationRevisionResponse
     */
    public PublishWebApplicationRevisionResponse publishWebApplicationRevisionWithOptions(String ApplicationId, PublishWebApplicationRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishWebApplicationRevision"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-revisions/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/revisions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishWebApplicationRevisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Publish a web application version. You can change the configurations of the version and create a new version.</p>
     * 
     * <b>summary</b> : 
     * <p>Publish a web application version.</p>
     * 
     * @param request PublishWebApplicationRevisionRequest
     * @return PublishWebApplicationRevisionResponse
     */
    public PublishWebApplicationRevisionResponse publishWebApplicationRevision(String ApplicationId, PublishWebApplicationRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishWebApplicationRevisionWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether ARMS monitoring is enabled for a specified application.</p>
     * 
     * @param request QueryArmsEnableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryArmsEnableResponse
     */
    public QueryArmsEnableResponse queryArmsEnableWithOptions(QueryArmsEnableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryArmsEnable"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/arms/queryArms"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryArmsEnableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether ARMS monitoring is enabled for a specified application.</p>
     * 
     * @param request QueryArmsEnableRequest
     * @return QueryArmsEnableResponse
     */
    public QueryArmsEnableResponse queryArmsEnable(QueryArmsEnableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryArmsEnableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource usage of an application.</p>
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
     * <b>summary</b> : 
     * <p>Queries the resource usage of an application.</p>
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
     * <b>summary</b> : 
     * <p>Scales in an application based on instance IDs.</p>
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
     * <b>summary</b> : 
     * <p>Scales in an application based on instance IDs.</p>
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
     * <b>summary</b> : 
     * <p>Rescale an application.</p>
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
     * <b>summary</b> : 
     * <p>Rescale an application.</p>
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
     * <b>summary</b> : 
     * <p>Changes the instance specifications of an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.deploy)) {
            query.put("Deploy", request.deploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            query.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoEnableApplicationScalingRule)) {
            query.put("autoEnableApplicationScalingRule", request.autoEnableApplicationScalingRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("minReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("minReadyInstances", request.minReadyInstances);
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
     * <b>summary</b> : 
     * <p>Changes the instance specifications of an application.</p>
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
     * <b>summary</b> : 
     * <p>Restarts an application.</p>
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
     * <b>summary</b> : 
     * <p>Restarts an application.</p>
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
     * <b>summary</b> : 
     * <p>Restarts one or more instances in an application.</p>
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
     * <b>summary</b> : 
     * <p>Restarts one or more instances in an application.</p>
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
     * <b>summary</b> : 
     * <p>Resumes traffic from Classic Load Balancer (CLB) application access, Network Load Balancer (NLB) application access, CLB gateway routing, Application Load Balancer (ALB) gateway routing, and Kubernetes Services on an instance.</p>
     * 
     * @param request ResumeTrafficRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTrafficResponse
     */
    public ResumeTrafficResponse resumeTrafficWithOptions(ResumeTrafficRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ResumeTraffic"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/instanceTrafficResume"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTrafficResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes traffic from Classic Load Balancer (CLB) application access, Network Load Balancer (NLB) application access, CLB gateway routing, Application Load Balancer (ALB) gateway routing, and Kubernetes Services on an instance.</p>
     * 
     * @param request ResumeTrafficRequest
     * @return ResumeTrafficResponse
     */
    public ResumeTrafficResponse resumeTraffic(ResumeTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeTrafficWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back an application.</p>
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
     * <b>summary</b> : 
     * <p>Rolls back an application.</p>
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
     * <b>summary</b> : 
     * <p>Starts an application.</p>
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
     * <b>summary</b> : 
     * <p>Starts an application.</p>
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
     * <b>description</b> :
     * <p>Call the StartWebApplication operation to start a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Start a web application.</p>
     * 
     * @param request StartWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartWebApplicationResponse
     */
    public StartWebApplicationResponse startWebApplicationWithOptions(String ApplicationId, StartWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "StartWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-ops/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/start"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the StartWebApplication operation to start a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Start a web application.</p>
     * 
     * @param request StartWebApplicationRequest
     * @return StartWebApplicationResponse
     */
    public StartWebApplicationResponse startWebApplication(String ApplicationId, StartWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startWebApplicationWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an application.</p>
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
     * <b>summary</b> : 
     * <p>Stops an application.</p>
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
     * <b>description</b> :
     * <p>Call the StopWebApplication operation to stop a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop a web application.</p>
     * 
     * @param request StopWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopWebApplicationResponse
     */
    public StopWebApplicationResponse stopWebApplicationWithOptions(String ApplicationId, StopWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "StopWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-ops/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + "/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the StopWebApplication operation to stop a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop a web application.</p>
     * 
     * @param request StopWebApplicationRequest
     * @return StopWebApplicationResponse
     */
    public StopWebApplicationResponse stopWebApplication(String ApplicationId, StopWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopWebApplicationWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends one or more jobs.</p>
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
     * <b>summary</b> : 
     * <p>Suspends one or more jobs.</p>
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
     * <b>summary</b> : 
     * <p>Removes traffic routed from Classic Load Balancer (CLB) application access, Network Load Balancer (NLB) application access, CLB gateway routes, Application Load Balancer (ALB) gateway routes, or Kubernetes (K8s) services.</p>
     * 
     * @param request SuspendTrafficRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendTrafficResponse
     */
    public SuspendTrafficResponse suspendTrafficWithOptions(SuspendTrafficRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SuspendTraffic"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/instanceTrafficSuspend"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendTrafficResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes traffic routed from Classic Load Balancer (CLB) application access, Network Load Balancer (NLB) application access, CLB gateway routes, Application Load Balancer (ALB) gateway routes, or Kubernetes (K8s) services.</p>
     * 
     * @param request SuspendTrafficRequest
     * @return SuspendTrafficResponse
     */
    public SuspendTrafficResponse suspendTraffic(SuspendTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.suspendTrafficWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
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
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
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
     * <p>Calls the UnbindNlb operation to delete an NLB listener bound for application access</p>
     * 
     * @param request UnbindNlbRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindNlbResponse
     */
    public UnbindNlbResponse unbindNlbWithOptions(UnbindNlbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlbId)) {
            query.put("NlbId", request.nlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindNlb"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/nlb"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindNlbResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the UnbindNlb operation to delete an NLB listener bound for application access</p>
     * 
     * @param request UnbindNlbRequest
     * @return UnbindNlbResponse
     */
    public UnbindNlbResponse unbindNlb(UnbindNlbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindNlbWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an internal-facing or Internet-facing SLB instance from an application.</p>
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
     * <b>summary</b> : 
     * <p>Disassociates an internal-facing or Internet-facing SLB instance from an application.</p>
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
     * <b>summary</b> : 
     * <p>Application Idle Mode Update</p>
     * 
     * @param request UpdateAppModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppModeResponse
     */
    public UpdateAppModeResponse updateAppModeWithOptions(UpdateAppModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appIds)) {
            query.put("AppIds", request.appIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIdle)) {
            query.put("EnableIdle", request.enableIdle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleHour)) {
            query.put("IdleHour", request.idleHour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppMode"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/updateAppMode"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Application Idle Mode Update</p>
     * 
     * @param request UpdateAppModeRequest
     * @return UpdateAppModeResponse
     */
    public UpdateAppModeResponse updateAppMode(UpdateAppModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppModeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the security group of an application.</p>
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
     * <b>summary</b> : 
     * <p>Updates the security group of an application.</p>
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
     * <b>summary</b> : 
     * <p>Updates the description of an application.</p>
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
     * <b>summary</b> : 
     * <p>Updates the description of an application.</p>
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
     * <b>description</b> :
     * <h2></h2>
     * <p>If you want to configure more than 50 instances for an application, you must submit a <a href="https://workorder.console.aliyun.com/#/ticket/createIndex">ticket</a> to add your account to the whitelist.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the auto scaling policy of an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableIdle)) {
            query.put("EnableIdle", request.enableIdle);
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
     * <b>description</b> :
     * <h2></h2>
     * <p>If you want to configure more than 50 instances for an application, you must submit a <a href="https://workorder.console.aliyun.com/#/ticket/createIndex">ticket</a> to add your account to the whitelist.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the auto scaling policy of an application.</p>
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
     * <b>summary</b> : 
     * <p>Update the configuration of a vSwitch.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.deploy)) {
            query.put("Deploy", request.deploy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstanceRatio)) {
            query.put("MinReadyInstanceRatio", request.minReadyInstanceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minReadyInstances)) {
            query.put("MinReadyInstances", request.minReadyInstances);
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
     * <b>summary</b> : 
     * <p>Update the configuration of a vSwitch.</p>
     * 
     * @param request UpdateApplicationVswitchesRequest
     * @return UpdateApplicationVswitchesResponse
     */
    public UpdateApplicationVswitchesResponse updateApplicationVswitches(UpdateApplicationVswitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApplicationVswitchesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a ConfigMap instance.</p>
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
     * <b>summary</b> : 
     * <p>Updates a ConfigMap instance.</p>
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
     * <b>summary</b> : 
     * <p>Updates a canary release rule.</p>
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
     * <b>summary</b> : 
     * <p>Updates a canary release rule.</p>
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
     * <b>summary</b> : 
     * <p>Update the configurations of an Ingress instance.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.corsConfig)) {
            query.put("CorsConfig", request.corsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            query.put("DefaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGzip)) {
            query.put("EnableGzip", request.enableGzip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedFor)) {
            query.put("EnableXForwardedFor", request.enableXForwardedFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForClientSrcPort)) {
            query.put("EnableXForwardedForClientSrcPort", request.enableXForwardedForClientSrcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForProto)) {
            query.put("EnableXForwardedForProto", request.enableXForwardedForProto);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForSlbId)) {
            query.put("EnableXForwardedForSlbId", request.enableXForwardedForSlbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableXForwardedForSlbPort)) {
            query.put("EnableXForwardedForSlbPort", request.enableXForwardedForSlbPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
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

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyId)) {
            query.put("SecurityPolicyId", request.securityPolicyId);
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
     * <b>summary</b> : 
     * <p>Update the configurations of an Ingress instance.</p>
     * 
     * @param request UpdateIngressRequest
     * @return UpdateIngressResponse
     */
    public UpdateIngressResponse updateIngress(UpdateIngressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIngressWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a job template.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bestEffortType)) {
            query.put("BestEffortType", request.bestEffortType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.nasConfigs)) {
            query.put("NasConfigs", request.nasConfigs);
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
     * <b>summary</b> : 
     * <p>Updates a job template.</p>
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
     * <b>summary</b> : 
     * <p>Updates the information about a namespace.</p>
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
     * <b>summary</b> : 
     * <p>Updates the information about a namespace.</p>
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
     * <b>summary</b> : 
     * <p>更新命名空间级别sls配置</p>
     * 
     * @param request UpdateNamespaceSlsConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNamespaceSlsConfigsResponse
     */
    public UpdateNamespaceSlsConfigsResponse updateNamespaceSlsConfigsWithOptions(UpdateNamespaceSlsConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nameSpaceShortId)) {
            query.put("NameSpaceShortId", request.nameSpaceShortId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsConfigs)) {
            query.put("SlsConfigs", request.slsConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsLogEnvTags)) {
            query.put("SlsLogEnvTags", request.slsLogEnvTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNamespaceSlsConfigs"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/cas/namespace/updateNamespaceSlsConfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNamespaceSlsConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新命名空间级别sls配置</p>
     * 
     * @param request UpdateNamespaceSlsConfigsRequest
     * @return UpdateNamespaceSlsConfigsResponse
     */
    public UpdateNamespaceSlsConfigsResponse updateNamespaceSlsConfigs(UpdateNamespaceSlsConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNamespaceSlsConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>cn-beijing:test</p>
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
     * <b>summary</b> : 
     * <p>cn-beijing:test</p>
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
     * <b>summary</b> : 
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
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
     * <b>summary</b> : 
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * @param request UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    public UpdateSecretResponse updateSecret(UpdateSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSecretWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the enabled property of the swimlane.</p>
     * 
     * @param request UpdateSwimmingLaneEnableAttributeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSwimmingLaneEnableAttributeResponse
     */
    public UpdateSwimmingLaneEnableAttributeResponse updateSwimmingLaneEnableAttributeWithOptions(UpdateSwimmingLaneEnableAttributeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.laneId)) {
            query.put("LaneId", request.laneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSwimmingLaneEnableAttribute"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/cas/gray/updateSwimmingLaneEnableAttribute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSwimmingLaneEnableAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the enabled property of the swimlane.</p>
     * 
     * @param request UpdateSwimmingLaneEnableAttributeRequest
     * @return UpdateSwimmingLaneEnableAttributeResponse
     */
    public UpdateSwimmingLaneEnableAttributeResponse updateSwimmingLaneEnableAttribute(UpdateSwimmingLaneEnableAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSwimmingLaneEnableAttributeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplication operation to update the configuration at the web application level.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration at the web application level.</p>
     * 
     * @param request UpdateWebApplicationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebApplicationResponse
     */
    public UpdateWebApplicationResponse updateWebApplicationWithOptions(String ApplicationId, UpdateWebApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebApplication"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/applications/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplication operation to update the configuration at the web application level.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration at the web application level.</p>
     * 
     * @param request UpdateWebApplicationRequest
     * @return UpdateWebApplicationResponse
     */
    public UpdateWebApplicationResponse updateWebApplication(String ApplicationId, UpdateWebApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWebApplicationWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplicationScalingConfig operation to update the scaling configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the scaling configuration of a web application.</p>
     * 
     * @param request UpdateWebApplicationScalingConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebApplicationScalingConfigResponse
     */
    public UpdateWebApplicationScalingConfigResponse updateWebApplicationScalingConfigWithOptions(String ApplicationId, UpdateWebApplicationScalingConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebApplicationScalingConfig"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-scaling/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebApplicationScalingConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplicationScalingConfig operation to update the scaling configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the scaling configuration of a web application.</p>
     * 
     * @param request UpdateWebApplicationScalingConfigRequest
     * @return UpdateWebApplicationScalingConfigResponse
     */
    public UpdateWebApplicationScalingConfigResponse updateWebApplicationScalingConfig(String ApplicationId, UpdateWebApplicationScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWebApplicationScalingConfigWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call the UpdateWebApplicationTrafficConfig operation to update the traffic configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the traffic configurations of a web application.</p>
     * 
     * @param request UpdateWebApplicationTrafficConfigRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebApplicationTrafficConfigResponse
     */
    public UpdateWebApplicationTrafficConfigResponse updateWebApplicationTrafficConfigWithOptions(String ApplicationId, UpdateWebApplicationTrafficConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebApplicationTrafficConfig"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/application-traffic/" + com.aliyun.openapiutil.Client.getEncodeParam(ApplicationId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebApplicationTrafficConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call the UpdateWebApplicationTrafficConfig operation to update the traffic configurations of a web application.</p>
     * 
     * <b>summary</b> : 
     * <p>Update the traffic configurations of a web application.</p>
     * 
     * @param request UpdateWebApplicationTrafficConfigRequest
     * @return UpdateWebApplicationTrafficConfigResponse
     */
    public UpdateWebApplicationTrafficConfigResponse updateWebApplicationTrafficConfig(String ApplicationId, UpdateWebApplicationTrafficConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWebApplicationTrafficConfigWithOptions(ApplicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update a custom domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Update a custom domain name.</p>
     * 
     * @param request UpdateWebCustomDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebCustomDomainResponse
     */
    public UpdateWebCustomDomainResponse updateWebCustomDomainWithOptions(String DomainName, UpdateWebCustomDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.namespaceId)) {
            query.put("NamespaceId", request.namespaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebCustomDomain"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v2/api/web/custom-domains/" + com.aliyun.openapiutil.Client.getEncodeParam(DomainName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebCustomDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update a custom domain name.</p>
     * 
     * <b>summary</b> : 
     * <p>Update a custom domain name.</p>
     * 
     * @param request UpdateWebCustomDomainRequest
     * @return UpdateWebCustomDomainResponse
     */
    public UpdateWebCustomDomainResponse updateWebCustomDomain(String DomainName, UpdateWebCustomDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWebCustomDomainWithOptions(DomainName, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You are charged when you use the ARMS advanced monitoring feature. Enable this feature based on your business requirements. For more information, see <a href="https://www.alibabacloud.com/help/zh/arms/application-monitoring/product-overview/billing-overview-1">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the advanced monitoring feature of Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request UpgradeApplicationApmServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeApplicationApmServiceResponse
     */
    public UpgradeApplicationApmServiceResponse upgradeApplicationApmServiceWithOptions(UpgradeApplicationApmServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpgradeApplicationApmService"),
            new TeaPair("version", "2019-05-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pop/v1/sam/app/applicationApmService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeApplicationApmServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You are charged when you use the ARMS advanced monitoring feature. Enable this feature based on your business requirements. For more information, see <a href="https://www.alibabacloud.com/help/zh/arms/application-monitoring/product-overview/billing-overview-1">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the advanced monitoring feature of Application Real-Time Monitoring Service (ARMS).</p>
     * 
     * @param request UpgradeApplicationApmServiceRequest
     * @return UpgradeApplicationApmServiceResponse
     */
    public UpgradeApplicationApmServiceResponse upgradeApplicationApmService(UpgradeApplicationApmServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeApplicationApmServiceWithOptions(request, headers, runtime);
    }
}

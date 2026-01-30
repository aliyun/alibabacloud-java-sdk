// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212;

import com.aliyun.tea.*;
import com.aliyun.vs20181212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AddVsPullStreamInfoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddVsPullStreamInfoConfigResponse
     */
    public AddVsPullStreamInfoConfigResponse addVsPullStreamInfoConfigWithOptions(AddVsPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.always)) {
            query.put("Always", request.always);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            query.put("SourceUrl", request.sourceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddVsPullStreamInfoConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddVsPullStreamInfoConfigResponse());
    }

    /**
     * @param request AddVsPullStreamInfoConfigRequest
     * @return AddVsPullStreamInfoConfigResponse
     */
    public AddVsPullStreamInfoConfigResponse addVsPullStreamInfoConfig(AddVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将满足特定条件的实例与指定项目进行关联。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>云应用服务实例与项目进行关联。</p>
     * 
     * @param tmpReq AssociateRenderingProjectInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateRenderingProjectInstancesResponse
     */
    public AssociateRenderingProjectInstancesResponse associateRenderingProjectInstancesWithOptions(AssociateRenderingProjectInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AssociateRenderingProjectInstancesShrinkRequest request = new AssociateRenderingProjectInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateRenderingProjectInstances"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateRenderingProjectInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将满足特定条件的实例与指定项目进行关联。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>云应用服务实例与项目进行关联。</p>
     * 
     * @param request AssociateRenderingProjectInstancesRequest
     * @return AssociateRenderingProjectInstancesResponse
     */
    public AssociateRenderingProjectInstancesResponse associateRenderingProjectInstances(AssociateRenderingProjectInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateRenderingProjectInstancesWithOptions(request, runtime);
    }

    /**
     * @param request BatchBindDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchBindDirectoriesResponse
     */
    public BatchBindDirectoriesResponse batchBindDirectoriesWithOptions(BatchBindDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindDirectories"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindDirectoriesResponse());
    }

    /**
     * @param request BatchBindDirectoriesRequest
     * @return BatchBindDirectoriesResponse
     */
    public BatchBindDirectoriesResponse batchBindDirectories(BatchBindDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindDirectoriesWithOptions(request, runtime);
    }

    /**
     * @param request BatchBindParentPlatformDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchBindParentPlatformDevicesResponse
     */
    public BatchBindParentPlatformDevicesResponse batchBindParentPlatformDevicesWithOptions(BatchBindParentPlatformDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentPlatformId)) {
            query.put("ParentPlatformId", request.parentPlatformId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindParentPlatformDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindParentPlatformDevicesResponse());
    }

    /**
     * @param request BatchBindParentPlatformDevicesRequest
     * @return BatchBindParentPlatformDevicesResponse
     */
    public BatchBindParentPlatformDevicesResponse batchBindParentPlatformDevices(BatchBindParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchBindPurchasedDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchBindPurchasedDevicesResponse
     */
    public BatchBindPurchasedDevicesResponse batchBindPurchasedDevicesWithOptions(BatchBindPurchasedDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindPurchasedDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindPurchasedDevicesResponse());
    }

    /**
     * @param request BatchBindPurchasedDevicesRequest
     * @return BatchBindPurchasedDevicesResponse
     */
    public BatchBindPurchasedDevicesResponse batchBindPurchasedDevices(BatchBindPurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindPurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchBindTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchBindTemplateResponse
     */
    public BatchBindTemplateResponse batchBindTemplateWithOptions(BatchBindTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyAll)) {
            query.put("ApplyAll", request.applyAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replace)) {
            query.put("Replace", request.replace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindTemplateResponse());
    }

    /**
     * @param request BatchBindTemplateRequest
     * @return BatchBindTemplateResponse
     */
    public BatchBindTemplateResponse batchBindTemplate(BatchBindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindTemplateWithOptions(request, runtime);
    }

    /**
     * @param request BatchBindTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchBindTemplatesResponse
     */
    public BatchBindTemplatesResponse batchBindTemplatesWithOptions(BatchBindTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyAll)) {
            query.put("ApplyAll", request.applyAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replace)) {
            query.put("Replace", request.replace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchBindTemplates"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchBindTemplatesResponse());
    }

    /**
     * @param request BatchBindTemplatesRequest
     * @return BatchBindTemplatesResponse
     */
    public BatchBindTemplatesResponse batchBindTemplates(BatchBindTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request BatchDeleteDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevicesWithOptions(BatchDeleteDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteDevicesResponse());
    }

    /**
     * @param request BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchDeleteVsDomainConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteVsDomainConfigsResponse
     */
    public BatchDeleteVsDomainConfigsResponse batchDeleteVsDomainConfigsWithOptions(BatchDeleteVsDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteVsDomainConfigs"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteVsDomainConfigsResponse());
    }

    /**
     * @param request BatchDeleteVsDomainConfigsRequest
     * @return BatchDeleteVsDomainConfigsResponse
     */
    public BatchDeleteVsDomainConfigsResponse batchDeleteVsDomainConfigs(BatchDeleteVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * @param request BatchForbidVsStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchForbidVsStreamResponse
     */
    public BatchForbidVsStreamResponse batchForbidVsStreamWithOptions(BatchForbidVsStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlStreamAction)) {
            query.put("ControlStreamAction", request.controlStreamAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveStreamType)) {
            query.put("LiveStreamType", request.liveStreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneshot)) {
            query.put("Oneshot", request.oneshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resumeTime)) {
            query.put("ResumeTime", request.resumeTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchForbidVsStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchForbidVsStreamResponse());
    }

    /**
     * @param request BatchForbidVsStreamRequest
     * @return BatchForbidVsStreamResponse
     */
    public BatchForbidVsStreamResponse batchForbidVsStream(BatchForbidVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchForbidVsStreamWithOptions(request, runtime);
    }

    /**
     * @param request BatchResumeVsStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchResumeVsStreamResponse
     */
    public BatchResumeVsStreamResponse batchResumeVsStreamWithOptions(BatchResumeVsStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlStreamAction)) {
            query.put("ControlStreamAction", request.controlStreamAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveStreamType)) {
            query.put("LiveStreamType", request.liveStreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchResumeVsStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchResumeVsStreamResponse());
    }

    /**
     * @param request BatchResumeVsStreamRequest
     * @return BatchResumeVsStreamResponse
     */
    public BatchResumeVsStreamResponse batchResumeVsStream(BatchResumeVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchResumeVsStreamWithOptions(request, runtime);
    }

    /**
     * @param request BatchSetVsDomainConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSetVsDomainConfigsResponse
     */
    public BatchSetVsDomainConfigsResponse batchSetVsDomainConfigsWithOptions(BatchSetVsDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNames)) {
            query.put("DomainNames", request.domainNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            query.put("Functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetVsDomainConfigs"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetVsDomainConfigsResponse());
    }

    /**
     * @param request BatchSetVsDomainConfigsRequest
     * @return BatchSetVsDomainConfigsResponse
     */
    public BatchSetVsDomainConfigsResponse batchSetVsDomainConfigs(BatchSetVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * @param request BatchStartDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStartDevicesResponse
     */
    public BatchStartDevicesResponse batchStartDevicesWithOptions(BatchStartDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartDevicesResponse());
    }

    /**
     * @param request BatchStartDevicesRequest
     * @return BatchStartDevicesResponse
     */
    public BatchStartDevicesResponse batchStartDevices(BatchStartDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchStartStreamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStartStreamsResponse
     */
    public BatchStartStreamsResponse batchStartStreamsWithOptions(BatchStartStreamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStartStreams"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStartStreamsResponse());
    }

    /**
     * @param request BatchStartStreamsRequest
     * @return BatchStartStreamsResponse
     */
    public BatchStartStreamsResponse batchStartStreams(BatchStartStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartStreamsWithOptions(request, runtime);
    }

    /**
     * @param request BatchStopDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStopDevicesResponse
     */
    public BatchStopDevicesResponse batchStopDevicesWithOptions(BatchStopDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopDevicesResponse());
    }

    /**
     * @param request BatchStopDevicesRequest
     * @return BatchStopDevicesResponse
     */
    public BatchStopDevicesResponse batchStopDevices(BatchStopDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchStopStreamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchStopStreamsResponse
     */
    public BatchStopStreamsResponse batchStopStreamsWithOptions(BatchStopStreamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchStopStreams"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchStopStreamsResponse());
    }

    /**
     * @param request BatchStopStreamsRequest
     * @return BatchStopStreamsResponse
     */
    public BatchStopStreamsResponse batchStopStreams(BatchStopStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopStreamsWithOptions(request, runtime);
    }

    /**
     * @param request BatchUnbindDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUnbindDirectoriesResponse
     */
    public BatchUnbindDirectoriesResponse batchUnbindDirectoriesWithOptions(BatchUnbindDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindDirectories"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindDirectoriesResponse());
    }

    /**
     * @param request BatchUnbindDirectoriesRequest
     * @return BatchUnbindDirectoriesResponse
     */
    public BatchUnbindDirectoriesResponse batchUnbindDirectories(BatchUnbindDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindDirectoriesWithOptions(request, runtime);
    }

    /**
     * @param request BatchUnbindParentPlatformDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUnbindParentPlatformDevicesResponse
     */
    public BatchUnbindParentPlatformDevicesResponse batchUnbindParentPlatformDevicesWithOptions(BatchUnbindParentPlatformDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentPlatformId)) {
            query.put("ParentPlatformId", request.parentPlatformId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindParentPlatformDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindParentPlatformDevicesResponse());
    }

    /**
     * @param request BatchUnbindParentPlatformDevicesRequest
     * @return BatchUnbindParentPlatformDevicesResponse
     */
    public BatchUnbindParentPlatformDevicesResponse batchUnbindParentPlatformDevices(BatchUnbindParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchUnbindPurchasedDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUnbindPurchasedDevicesResponse
     */
    public BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevicesWithOptions(BatchUnbindPurchasedDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindPurchasedDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindPurchasedDevicesResponse());
    }

    /**
     * @param request BatchUnbindPurchasedDevicesRequest
     * @return BatchUnbindPurchasedDevicesResponse
     */
    public BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevices(BatchUnbindPurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindPurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * @param request BatchUnbindTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUnbindTemplateResponse
     */
    public BatchUnbindTemplateResponse batchUnbindTemplateWithOptions(BatchUnbindTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindTemplateResponse());
    }

    /**
     * @param request BatchUnbindTemplateRequest
     * @return BatchUnbindTemplateResponse
     */
    public BatchUnbindTemplateResponse batchUnbindTemplate(BatchUnbindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindTemplateWithOptions(request, runtime);
    }

    /**
     * @param request BatchUnbindTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUnbindTemplatesResponse
     */
    public BatchUnbindTemplatesResponse batchUnbindTemplatesWithOptions(BatchUnbindTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUnbindTemplates"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUnbindTemplatesResponse());
    }

    /**
     * @param request BatchUnbindTemplatesRequest
     * @return BatchUnbindTemplatesResponse
     */
    public BatchUnbindTemplatesResponse batchUnbindTemplates(BatchUnbindTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request BindDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindDirectoryResponse
     */
    public BindDirectoryResponse bindDirectoryWithOptions(BindDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDirectoryResponse());
    }

    /**
     * @param request BindDirectoryRequest
     * @return BindDirectoryResponse
     */
    public BindDirectoryResponse bindDirectory(BindDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDirectoryWithOptions(request, runtime);
    }

    /**
     * @param request BindParentPlatformDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindParentPlatformDeviceResponse
     */
    public BindParentPlatformDeviceResponse bindParentPlatformDeviceWithOptions(BindParentPlatformDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentPlatformId)) {
            query.put("ParentPlatformId", request.parentPlatformId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindParentPlatformDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindParentPlatformDeviceResponse());
    }

    /**
     * @param request BindParentPlatformDeviceRequest
     * @return BindParentPlatformDeviceResponse
     */
    public BindParentPlatformDeviceResponse bindParentPlatformDevice(BindParentPlatformDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindParentPlatformDeviceWithOptions(request, runtime);
    }

    /**
     * @param request BindPurchasedDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindPurchasedDeviceResponse
     */
    public BindPurchasedDeviceResponse bindPurchasedDeviceWithOptions(BindPurchasedDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindPurchasedDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindPurchasedDeviceResponse());
    }

    /**
     * @param request BindPurchasedDeviceRequest
     * @return BindPurchasedDeviceResponse
     */
    public BindPurchasedDeviceResponse bindPurchasedDevice(BindPurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * @param request BindTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindTemplateResponse
     */
    public BindTemplateResponse bindTemplateWithOptions(BindTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyAll)) {
            query.put("ApplyAll", request.applyAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replace)) {
            query.put("Replace", request.replace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindTemplateResponse());
    }

    /**
     * @param request BindTemplateRequest
     * @return BindTemplateResponse
     */
    public BindTemplateResponse bindTemplate(BindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindTemplateWithOptions(request, runtime);
    }

    /**
     * @param request ContinuousAdjustRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinuousAdjustResponse
     */
    public ContinuousAdjustResponse continuousAdjustWithOptions(ContinuousAdjustRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.focus)) {
            query.put("Focus", request.focus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iris)) {
            query.put("Iris", request.iris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinuousAdjust"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinuousAdjustResponse());
    }

    /**
     * @param request ContinuousAdjustRequest
     * @return ContinuousAdjustResponse
     */
    public ContinuousAdjustResponse continuousAdjust(ContinuousAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuousAdjustWithOptions(request, runtime);
    }

    /**
     * @param request ContinuousMoveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinuousMoveResponse
     */
    public ContinuousMoveResponse continuousMoveWithOptions(ContinuousMoveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pan)) {
            query.put("Pan", request.pan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tilt)) {
            query.put("Tilt", request.tilt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoom)) {
            query.put("Zoom", request.zoom);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinuousMove"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinuousMoveResponse());
    }

    /**
     * @param request ContinuousMoveRequest
     * @return ContinuousMoveResponse
     */
    public ContinuousMoveResponse continuousMove(ContinuousMoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuousMoveWithOptions(request, runtime);
    }

    /**
     * @param request CreateDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMethod)) {
            query.put("AlarmMethod", request.alarmMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDirectory)) {
            query.put("AutoDirectory", request.autoDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPos)) {
            query.put("AutoPos", request.autoPos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsn)) {
            query.put("Dsn", request.dsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posInterval)) {
            query.put("PosInterval", request.posInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceResponse());
    }

    /**
     * @param request CreateDeviceRequest
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    /**
     * @param request CreateDeviceAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDeviceAlarmResponse
     */
    public CreateDeviceAlarmResponse createDeviceAlarmWithOptions(CreateDeviceAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarm)) {
            query.put("Alarm", request.alarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("Expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subAlarm)) {
            query.put("SubAlarm", request.subAlarm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeviceAlarm"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceAlarmResponse());
    }

    /**
     * @param request CreateDeviceAlarmRequest
     * @return CreateDeviceAlarmResponse
     */
    public CreateDeviceAlarmResponse createDeviceAlarm(CreateDeviceAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceAlarmWithOptions(request, runtime);
    }

    /**
     * @param request CreateDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectoryWithOptions(CreateDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirectoryResponse());
    }

    /**
     * @param request CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirectoryWithOptions(request, runtime);
    }

    /**
     * @param request CreateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.app)) {
            query.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            query.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lazyPull)) {
            query.put("LazyPull", request.lazyPull);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            query.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushDomain)) {
            query.put("PushDomain", request.pushDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * @param request CreateParentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParentPlatformResponse
     */
    public CreateParentPlatformResponse createParentPlatformWithOptions(CreateParentPlatformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAuth)) {
            query.put("ClientAuth", request.clientAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPassword)) {
            query.put("ClientPassword", request.clientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUsername)) {
            query.put("ClientUsername", request.clientUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParentPlatform"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParentPlatformResponse());
    }

    /**
     * @param request CreateParentPlatformRequest
     * @return CreateParentPlatformResponse
     */
    public CreateParentPlatformResponse createParentPlatform(CreateParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建云渲染数据包</p>
     * 
     * @param request CreateRenderingDataPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRenderingDataPackageResponse
     */
    public CreateRenderingDataPackageResponse createRenderingDataPackageWithOptions(CreateRenderingDataPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceBillingCycle)) {
            query.put("InstanceBillingCycle", request.instanceBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRenderingDataPackage"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRenderingDataPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建云渲染数据包</p>
     * 
     * @param request CreateRenderingDataPackageRequest
     * @return CreateRenderingDataPackageResponse
     */
    public CreateRenderingDataPackageResponse createRenderingDataPackage(CreateRenderingDataPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingDataPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请云渲染资源实例</p>
     * 
     * @param tmpReq CreateRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRenderingInstanceResponse
     */
    public CreateRenderingInstanceResponse createRenderingInstanceWithOptions(CreateRenderingInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRenderingInstanceShrinkRequest request = new CreateRenderingInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "Attributes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientInfo)) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientInfo, "ClientInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributesShrink)) {
            query.put("Attributes", request.attributesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientInfoShrink)) {
            query.put("ClientInfo", request.clientInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceBillingCycle)) {
            query.put("InstanceBillingCycle", request.instanceBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidth)) {
            query.put("InternetMaxBandwidth", request.internetMaxBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingSpec)) {
            query.put("RenderingSpec", request.renderingSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请云渲染资源实例</p>
     * 
     * @param request CreateRenderingInstanceRequest
     * @return CreateRenderingInstanceResponse
     */
    public CreateRenderingInstanceResponse createRenderingInstance(CreateRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义网关</p>
     * 
     * @param request CreateRenderingInstanceGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRenderingInstanceGatewayResponse
     */
    public CreateRenderingInstanceGatewayResponse createRenderingInstanceGatewayWithOptions(CreateRenderingInstanceGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayInstanceId)) {
            query.put("GatewayInstanceId", request.gatewayInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRenderingInstanceGateway"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRenderingInstanceGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义网关</p>
     * 
     * @param request CreateRenderingInstanceGatewayRequest
     * @return CreateRenderingInstanceGatewayResponse
     */
    public CreateRenderingInstanceGatewayResponse createRenderingInstanceGateway(CreateRenderingInstanceGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingInstanceGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个新的云应用服务项目，并设置相关属性。</p>
     * 
     * @param tmpReq CreateRenderingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRenderingProjectResponse
     */
    public CreateRenderingProjectResponse createRenderingProjectWithOptions(CreateRenderingProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRenderingProjectShrinkRequest request = new CreateRenderingProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionAttribs)) {
            request.sessionAttribsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionAttribs, "SessionAttribs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionAttribsShrink)) {
            query.put("SessionAttribs", request.sessionAttribsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRenderingProject"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRenderingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个新的云应用服务项目，并设置相关属性。</p>
     * 
     * @param request CreateRenderingProjectRequest
     * @return CreateRenderingProjectResponse
     */
    public CreateRenderingProjectResponse createRenderingProject(CreateRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingProjectWithOptions(request, runtime);
    }

    /**
     * @param request CreateStreamSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamSnapshotResponse
     */
    public CreateStreamSnapshotResponse createStreamSnapshotWithOptions(CreateStreamSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamSnapshot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamSnapshotResponse());
    }

    /**
     * @param request CreateStreamSnapshotRequest
     * @return CreateStreamSnapshotResponse
     */
    public CreateStreamSnapshotResponse createStreamSnapshot(CreateStreamSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamSnapshotWithOptions(request, runtime);
    }

    /**
     * @param request CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            query.put("FileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flv)) {
            query.put("Flv", request.flv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hlsM3u8)) {
            query.put("HlsM3u8", request.hlsM3u8);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hlsTs)) {
            query.put("HlsTs", request.hlsTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgOnDemand)) {
            query.put("JpgOnDemand", request.jpgOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgOverwrite)) {
            query.put("JpgOverwrite", request.jpgOverwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgSequence)) {
            query.put("JpgSequence", request.jpgSequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4)) {
            query.put("Mp4", request.mp4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFilePrefix)) {
            query.put("OssFilePrefix", request.ossFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transConfigsJSON)) {
            query.put("TransConfigsJSON", request.transConfigsJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("Trigger", request.trigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云应用</p>
     * 
     * @param request DeleteCloudAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudAppResponse
     */
    public DeleteCloudAppResponse deleteCloudAppWithOptions(DeleteCloudAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudApp"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云应用</p>
     * 
     * @param request DeleteCloudAppRequest
     * @return DeleteCloudAppResponse
     */
    public DeleteCloudAppResponse deleteCloudApp(DeleteCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudAppWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceResponse());
    }

    /**
     * @param request DeleteDeviceRequest
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectoryWithOptions(DeleteDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoryResponse());
    }

    /**
     * @param request DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件对象。</p>
     * 
     * @param request DeleteFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件对象。</p>
     * 
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    /**
     * @param request DeleteGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * @param request DeleteParentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParentPlatformResponse
     */
    public DeleteParentPlatformResponse deleteParentPlatformWithOptions(DeleteParentPlatformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParentPlatform"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParentPlatformResponse());
    }

    /**
     * @param request DeleteParentPlatformRequest
     * @return DeleteParentPlatformResponse
     */
    public DeleteParentPlatformResponse deleteParentPlatform(DeleteParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteParentPlatformWithOptions(request, runtime);
    }

    /**
     * @param request DeletePresetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePresetResponse
     */
    public DeletePresetResponse deletePresetWithOptions(DeletePresetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.presetId)) {
            query.put("PresetId", request.presetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePreset"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePresetResponse());
    }

    /**
     * @param request DeletePresetRequest
     * @return DeletePresetResponse
     */
    public DeletePresetResponse deletePreset(DeletePresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePresetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除公钥信息</p>
     * 
     * @param request DeletePublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePublicKeyResponse
     */
    public DeletePublicKeyResponse deletePublicKeyWithOptions(DeletePublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePublicKey"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除公钥信息</p>
     * 
     * @param request DeletePublicKeyRequest
     * @return DeletePublicKeyResponse
     */
    public DeletePublicKeyResponse deletePublicKey(DeletePublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除云渲染实例配置参数</p>
     * 
     * @param tmpReq DeleteRenderingInstanceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRenderingInstanceConfigurationResponse
     */
    public DeleteRenderingInstanceConfigurationResponse deleteRenderingInstanceConfigurationWithOptions(DeleteRenderingInstanceConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRenderingInstanceConfigurationShrinkRequest request = new DeleteRenderingInstanceConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configuration)) {
            request.configurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configuration, "Configuration", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationShrink)) {
            body.put("Configuration", request.configurationShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRenderingInstanceConfiguration"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRenderingInstanceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除云渲染实例配置参数</p>
     * 
     * @param request DeleteRenderingInstanceConfigurationRequest
     * @return DeleteRenderingInstanceConfigurationResponse
     */
    public DeleteRenderingInstanceConfigurationResponse deleteRenderingInstanceConfiguration(DeleteRenderingInstanceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingInstanceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义网关</p>
     * 
     * @param request DeleteRenderingInstanceGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRenderingInstanceGatewayResponse
     */
    public DeleteRenderingInstanceGatewayResponse deleteRenderingInstanceGatewayWithOptions(DeleteRenderingInstanceGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRenderingInstanceGateway"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRenderingInstanceGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义网关</p>
     * 
     * @param request DeleteRenderingInstanceGatewayRequest
     * @return DeleteRenderingInstanceGatewayResponse
     */
    public DeleteRenderingInstanceGatewayResponse deleteRenderingInstanceGateway(DeleteRenderingInstanceGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingInstanceGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清除实例设置</p>
     * 
     * @param tmpReq DeleteRenderingInstanceSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRenderingInstanceSettingsResponse
     */
    public DeleteRenderingInstanceSettingsResponse deleteRenderingInstanceSettingsWithOptions(DeleteRenderingInstanceSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRenderingInstanceSettingsShrinkRequest request = new DeleteRenderingInstanceSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributeNames)) {
            request.attributeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributeNames, "AttributeNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeNamesShrink)) {
            query.put("AttributeNames", request.attributeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRenderingInstanceSettings"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRenderingInstanceSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清除实例设置</p>
     * 
     * @param request DeleteRenderingInstanceSettingsRequest
     * @return DeleteRenderingInstanceSettingsResponse
     */
    public DeleteRenderingInstanceSettingsResponse deleteRenderingInstanceSettings(DeleteRenderingInstanceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingInstanceSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个云应用服务项目，有在线会话等业务调度数据的项目不允许删除。</p>
     * 
     * @param request DeleteRenderingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRenderingProjectResponse
     */
    public DeleteRenderingProjectResponse deleteRenderingProjectWithOptions(DeleteRenderingProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRenderingProject"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRenderingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个云应用服务项目，有在线会话等业务调度数据的项目不允许删除。</p>
     * 
     * @param request DeleteRenderingProjectRequest
     * @return DeleteRenderingProjectResponse
     */
    public DeleteRenderingProjectResponse deleteRenderingProject(DeleteRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingProjectWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DeleteVsPullStreamInfoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVsPullStreamInfoConfigResponse
     */
    public DeleteVsPullStreamInfoConfigResponse deleteVsPullStreamInfoConfigWithOptions(DeleteVsPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVsPullStreamInfoConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVsPullStreamInfoConfigResponse());
    }

    /**
     * @param request DeleteVsPullStreamInfoConfigRequest
     * @return DeleteVsPullStreamInfoConfigResponse
     */
    public DeleteVsPullStreamInfoConfigResponse deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * @param request DeleteVsStreamsNotifyUrlConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVsStreamsNotifyUrlConfigResponse
     */
    public DeleteVsStreamsNotifyUrlConfigResponse deleteVsStreamsNotifyUrlConfigWithOptions(DeleteVsStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVsStreamsNotifyUrlConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVsStreamsNotifyUrlConfigResponse());
    }

    /**
     * @param request DeleteVsStreamsNotifyUrlConfigRequest
     * @return DeleteVsStreamsNotifyUrlConfigResponse
     */
    public DeleteVsStreamsNotifyUrlConfigResponse deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAccountStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountStatResponse
     */
    public DescribeAccountStatResponse describeAccountStatWithOptions(DescribeAccountStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountStat"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountStatResponse());
    }

    /**
     * @param request DescribeAccountStatRequest
     * @return DescribeAccountStatResponse
     */
    public DescribeAccountStatResponse describeAccountStat(DescribeAccountStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountStatWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceResponse
     */
    public DescribeDeviceResponse describeDeviceWithOptions(DescribeDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDirectory)) {
            query.put("IncludeDirectory", request.includeDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeStats)) {
            query.put("IncludeStats", request.includeStats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceResponse());
    }

    /**
     * @param request DescribeDeviceRequest
     * @return DescribeDeviceResponse
     */
    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDeviceChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceChannelsResponse
     */
    public DescribeDeviceChannelsResponse describeDeviceChannelsWithOptions(DescribeDeviceChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceChannels"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceChannelsResponse());
    }

    /**
     * @param request DescribeDeviceChannelsRequest
     * @return DescribeDeviceChannelsResponse
     */
    public DescribeDeviceChannelsResponse describeDeviceChannels(DescribeDeviceChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDeviceGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceGatewayResponse
     */
    public DescribeDeviceGatewayResponse describeDeviceGatewayWithOptions(DescribeDeviceGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("Expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceGateway"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceGatewayResponse());
    }

    /**
     * @param request DescribeDeviceGatewayRequest
     * @return DescribeDeviceGatewayResponse
     */
    public DescribeDeviceGatewayResponse describeDeviceGateway(DescribeDeviceGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceGatewayWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDeviceURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceURLResponse
     */
    public DescribeDeviceURLResponse describeDeviceURLWithOptions(DescribeDeviceURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            query.put("Auth", request.auth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("Expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            query.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            query.put("Stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceURL"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceURLResponse());
    }

    /**
     * @param request DescribeDeviceURLRequest
     * @return DescribeDeviceURLResponse
     */
    public DescribeDeviceURLResponse describeDeviceURL(DescribeDeviceURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceURLWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDevicesResponse
     */
    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsn)) {
            query.put("Dsn", request.dsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDirectory)) {
            query.put("IncludeDirectory", request.includeDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeStats)) {
            query.put("IncludeStats", request.includeStats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDevicesResponse());
    }

    /**
     * @param request DescribeDevicesRequest
     * @return DescribeDevicesResponse
     */
    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDirectoriesResponse
     */
    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noPagination)) {
            query.put("NoPagination", request.noPagination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirectories"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirectoriesResponse());
    }

    /**
     * @param request DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDirectoryResponse
     */
    public DescribeDirectoryResponse describeDirectoryWithOptions(DescribeDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDirectoryResponse());
    }

    /**
     * @param request DescribeDirectoryRequest
     * @return DescribeDirectoryResponse
     */
    public DescribeDirectoryResponse describeDirectory(DescribeDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoryWithOptions(request, runtime);
    }

    /**
     * @param request DescribeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupResponse
     */
    public DescribeGroupResponse describeGroupWithOptions(DescribeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeStats)) {
            query.put("IncludeStats", request.includeStats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroup"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupResponse());
    }

    /**
     * @param request DescribeGroupRequest
     * @return DescribeGroupResponse
     */
    public DescribeGroupResponse describeGroup(DescribeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupWithOptions(request, runtime);
    }

    /**
     * @param request DescribeGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroupsWithOptions(DescribeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            query.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeStats)) {
            query.put("IncludeStats", request.includeStats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroups"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupsResponse());
    }

    /**
     * @param request DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeParentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParentPlatformResponse
     */
    public DescribeParentPlatformResponse describeParentPlatformWithOptions(DescribeParentPlatformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParentPlatform"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParentPlatformResponse());
    }

    /**
     * @param request DescribeParentPlatformRequest
     * @return DescribeParentPlatformResponse
     */
    public DescribeParentPlatformResponse describeParentPlatform(DescribeParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformWithOptions(request, runtime);
    }

    /**
     * @param request DescribeParentPlatformDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParentPlatformDevicesResponse
     */
    public DescribeParentPlatformDevicesResponse describeParentPlatformDevicesWithOptions(DescribeParentPlatformDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParentPlatformDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParentPlatformDevicesResponse());
    }

    /**
     * @param request DescribeParentPlatformDevicesRequest
     * @return DescribeParentPlatformDevicesResponse
     */
    public DescribeParentPlatformDevicesResponse describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeParentPlatformsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParentPlatformsResponse
     */
    public DescribeParentPlatformsResponse describeParentPlatformsWithOptions(DescribeParentPlatformsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParentPlatforms"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParentPlatformsResponse());
    }

    /**
     * @param request DescribeParentPlatformsRequest
     * @return DescribeParentPlatformsResponse
     */
    public DescribeParentPlatformsResponse describeParentPlatforms(DescribeParentPlatformsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePresetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePresetsResponse
     */
    public DescribePresetsResponse describePresetsWithOptions(DescribePresetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePresets"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePresetsResponse());
    }

    /**
     * @param request DescribePresetsRequest
     * @return DescribePresetsResponse
     */
    public DescribePresetsResponse describePresets(DescribePresetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePresetsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePublishStreamStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePublishStreamStatusResponse
     */
    public DescribePublishStreamStatusResponse describePublishStreamStatusWithOptions(DescribePublishStreamStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublishStreamStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublishStreamStatusResponse());
    }

    /**
     * @param request DescribePublishStreamStatusRequest
     * @return DescribePublishStreamStatusResponse
     */
    public DescribePublishStreamStatusResponse describePublishStreamStatus(DescribePublishStreamStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePublishStreamStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribePurchasedDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurchasedDeviceResponse
     */
    public DescribePurchasedDeviceResponse describePurchasedDeviceWithOptions(DescribePurchasedDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedDeviceResponse());
    }

    /**
     * @param request DescribePurchasedDeviceRequest
     * @return DescribePurchasedDeviceResponse
     */
    public DescribePurchasedDeviceResponse describePurchasedDevice(DescribePurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * @param request DescribePurchasedDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePurchasedDevicesResponse
     */
    public DescribePurchasedDevicesResponse describePurchasedDevicesWithOptions(DescribePurchasedDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subType)) {
            query.put("SubType", request.subType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePurchasedDevices"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePurchasedDevicesResponse());
    }

    /**
     * @param request DescribePurchasedDevicesRequest
     * @return DescribePurchasedDevicesResponse
     */
    public DescribePurchasedDevicesResponse describePurchasedDevices(DescribePurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordsResponse
     */
    public DescribeRecordsResponse describeRecordsWithOptions(DescribeRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateBucket)) {
            query.put("PrivateBucket", request.privateBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamId)) {
            query.put("StreamId", request.streamId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecords"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordsResponse());
    }

    /**
     * @param request DescribeRecordsRequest
     * @return DescribeRecordsResponse
     */
    public DescribeRecordsResponse describeRecords(DescribeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云渲染实例详细信息。</p>
     * 
     * @param request DescribeRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRenderingInstanceResponse
     */
    public DescribeRenderingInstanceResponse describeRenderingInstanceWithOptions(DescribeRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云渲染实例详细信息。</p>
     * 
     * @param request DescribeRenderingInstanceRequest
     * @return DescribeRenderingInstanceResponse
     */
    public DescribeRenderingInstanceResponse describeRenderingInstance(DescribeRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云渲染实例模块配置参数</p>
     * 
     * @param tmpReq DescribeRenderingInstanceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRenderingInstanceConfigurationResponse
     */
    public DescribeRenderingInstanceConfigurationResponse describeRenderingInstanceConfigurationWithOptions(DescribeRenderingInstanceConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeRenderingInstanceConfigurationShrinkRequest request = new DescribeRenderingInstanceConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configuration)) {
            request.configurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configuration, "Configuration", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenderingInstanceConfiguration"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenderingInstanceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云渲染实例模块配置参数</p>
     * 
     * @param request DescribeRenderingInstanceConfigurationRequest
     * @return DescribeRenderingInstanceConfigurationResponse
     */
    public DescribeRenderingInstanceConfigurationResponse describeRenderingInstanceConfiguration(DescribeRenderingInstanceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenderingInstanceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例配置</p>
     * 
     * @param tmpReq DescribeRenderingInstanceSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRenderingInstanceSettingsResponse
     */
    public DescribeRenderingInstanceSettingsResponse describeRenderingInstanceSettingsWithOptions(DescribeRenderingInstanceSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeRenderingInstanceSettingsShrinkRequest request = new DescribeRenderingInstanceSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributeNames)) {
            request.attributeNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributeNames, "AttributeNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeNamesShrink)) {
            query.put("AttributeNames", request.attributeNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenderingInstanceSettings"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenderingInstanceSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例配置</p>
     * 
     * @param request DescribeRenderingInstanceSettingsRequest
     * @return DescribeRenderingInstanceSettingsResponse
     */
    public DescribeRenderingInstanceSettingsResponse describeRenderingInstanceSettings(DescribeRenderingInstanceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenderingInstanceSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>输出会话的详情信息，包含关联的实例、网络出口等信息。</p>
     * 
     * @param request DescribeRenderingSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRenderingSessionResponse
     */
    public DescribeRenderingSessionResponse describeRenderingSessionWithOptions(DescribeRenderingSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRenderingSession"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRenderingSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>输出会话的详情信息，包含关联的实例、网络出口等信息。</p>
     * 
     * @param request DescribeRenderingSessionRequest
     * @return DescribeRenderingSessionResponse
     */
    public DescribeRenderingSessionResponse describeRenderingSession(DescribeRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenderingSessionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamResponse
     */
    public DescribeStreamResponse describeStreamWithOptions(DescribeStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamResponse());
    }

    /**
     * @param request DescribeStreamRequest
     * @return DescribeStreamResponse
     */
    public DescribeStreamResponse describeStream(DescribeStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStreamURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamURLResponse
     */
    public DescribeStreamURLResponse describeStreamURLWithOptions(DescribeStreamURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            query.put("Auth", request.auth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expire)) {
            query.put("Expire", request.expire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            query.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcode)) {
            query.put("Transcode", request.transcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreamURL"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamURLResponse());
    }

    /**
     * @param request DescribeStreamURLRequest
     * @return DescribeStreamURLResponse
     */
    public DescribeStreamURLResponse describeStreamURL(DescribeStreamURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamURLWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStreamVodListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamVodListResponse
     */
    public DescribeStreamVodListResponse describeStreamVodListWithOptions(DescribeStreamVodListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreamVodList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamVodListResponse());
    }

    /**
     * @param request DescribeStreamVodListRequest
     * @return DescribeStreamVodListResponse
     */
    public DescribeStreamVodListResponse describeStreamVodList(DescribeStreamVodListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamVodListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeStreamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamsResponse
     */
    public DescribeStreamsResponse describeStreamsWithOptions(DescribeStreamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.app)) {
            query.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreams"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamsResponse());
    }

    /**
     * @param request DescribeStreamsRequest
     * @return DescribeStreamsResponse
     */
    public DescribeStreamsResponse describeStreams(DescribeStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateResponse
     */
    public DescribeTemplateResponse describeTemplateWithOptions(DescribeTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateResponse());
    }

    /**
     * @param request DescribeTemplateRequest
     * @return DescribeTemplateResponse
     */
    public DescribeTemplateResponse describeTemplate(DescribeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortDirection)) {
            query.put("SortDirection", request.sortDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplates"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplatesResponse());
    }

    /**
     * @param request DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVodStreamURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVodStreamURLResponse
     */
    public DescribeVodStreamURLResponse describeVodStreamURLWithOptions(DescribeVodStreamURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVodStreamURL"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVodStreamURLResponse());
    }

    /**
     * @param request DescribeVodStreamURLRequest
     * @return DescribeVodStreamURLResponse
     */
    public DescribeVodStreamURLResponse describeVodStreamURL(DescribeVodStreamURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodStreamURLWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsCertificateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsCertificateDetailResponse
     */
    public DescribeVsCertificateDetailResponse describeVsCertificateDetailWithOptions(DescribeVsCertificateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsCertificateDetail"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsCertificateDetailResponse());
    }

    /**
     * @param request DescribeVsCertificateDetailRequest
     * @return DescribeVsCertificateDetailResponse
     */
    public DescribeVsCertificateDetailResponse describeVsCertificateDetail(DescribeVsCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsCertificateDetailWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsCertificateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsCertificateListResponse
     */
    public DescribeVsCertificateListResponse describeVsCertificateListWithOptions(DescribeVsCertificateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsCertificateList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsCertificateListResponse());
    }

    /**
     * @param request DescribeVsCertificateListRequest
     * @return DescribeVsCertificateListResponse
     */
    public DescribeVsCertificateListResponse describeVsCertificateList(DescribeVsCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsCertificateListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDevicesDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDevicesDataResponse
     */
    public DescribeVsDevicesDataResponse describeVsDevicesDataWithOptions(DescribeVsDevicesDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDevicesData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDevicesDataResponse());
    }

    /**
     * @param request DescribeVsDevicesDataRequest
     * @return DescribeVsDevicesDataResponse
     */
    public DescribeVsDevicesDataResponse describeVsDevicesData(DescribeVsDevicesDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDevicesDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainBpsDataResponse
     */
    public DescribeVsDomainBpsDataResponse describeVsDomainBpsDataWithOptions(DescribeVsDomainBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainBpsData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainBpsDataResponse());
    }

    /**
     * @param request DescribeVsDomainBpsDataRequest
     * @return DescribeVsDomainBpsDataResponse
     */
    public DescribeVsDomainBpsDataResponse describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainBpsDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainCertificateInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainCertificateInfoResponse
     */
    public DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfoWithOptions(DescribeVsDomainCertificateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainCertificateInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainCertificateInfoResponse());
    }

    /**
     * @param request DescribeVsDomainCertificateInfoRequest
     * @return DescribeVsDomainCertificateInfoResponse
     */
    public DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainConfigsResponse
     */
    public DescribeVsDomainConfigsResponse describeVsDomainConfigsWithOptions(DescribeVsDomainConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNames)) {
            query.put("FunctionNames", request.functionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainConfigs"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainConfigsResponse());
    }

    /**
     * @param request DescribeVsDomainConfigsRequest
     * @return DescribeVsDomainConfigsResponse
     */
    public DescribeVsDomainConfigsResponse describeVsDomainConfigs(DescribeVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainDetailResponse
     */
    public DescribeVsDomainDetailResponse describeVsDomainDetailWithOptions(DescribeVsDomainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainDetail"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainDetailResponse());
    }

    /**
     * @param request DescribeVsDomainDetailRequest
     * @return DescribeVsDomainDetailResponse
     */
    public DescribeVsDomainDetailResponse describeVsDomainDetail(DescribeVsDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainDetailWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainPvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainPvDataResponse
     */
    public DescribeVsDomainPvDataResponse describeVsDomainPvDataWithOptions(DescribeVsDomainPvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainPvData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainPvDataResponse());
    }

    /**
     * @param request DescribeVsDomainPvDataRequest
     * @return DescribeVsDomainPvDataResponse
     */
    public DescribeVsDomainPvDataResponse describeVsDomainPvData(DescribeVsDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainPvDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainPvUvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainPvUvDataResponse
     */
    public DescribeVsDomainPvUvDataResponse describeVsDomainPvUvDataWithOptions(DescribeVsDomainPvUvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainPvUvData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainPvUvDataResponse());
    }

    /**
     * @param request DescribeVsDomainPvUvDataRequest
     * @return DescribeVsDomainPvUvDataResponse
     */
    public DescribeVsDomainPvUvDataResponse describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainPvUvDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainRecordDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainRecordDataResponse
     */
    public DescribeVsDomainRecordDataResponse describeVsDomainRecordDataWithOptions(DescribeVsDomainRecordDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainRecordData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainRecordDataResponse());
    }

    /**
     * @param request DescribeVsDomainRecordDataRequest
     * @return DescribeVsDomainRecordDataResponse
     */
    public DescribeVsDomainRecordDataResponse describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainRecordDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainRegionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainRegionDataResponse
     */
    public DescribeVsDomainRegionDataResponse describeVsDomainRegionDataWithOptions(DescribeVsDomainRegionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainRegionData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainRegionDataResponse());
    }

    /**
     * @param request DescribeVsDomainRegionDataRequest
     * @return DescribeVsDomainRegionDataResponse
     */
    public DescribeVsDomainRegionDataResponse describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainRegionDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainReqBpsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainReqBpsDataResponse
     */
    public DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsDataWithOptions(DescribeVsDomainReqBpsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainReqBpsData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainReqBpsDataResponse());
    }

    /**
     * @param request DescribeVsDomainReqBpsDataRequest
     * @return DescribeVsDomainReqBpsDataResponse
     */
    public DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainReqBpsDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainReqTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainReqTrafficDataResponse
     */
    public DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficDataWithOptions(DescribeVsDomainReqTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainReqTrafficData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainReqTrafficDataResponse());
    }

    /**
     * @param request DescribeVsDomainReqTrafficDataRequest
     * @return DescribeVsDomainReqTrafficDataResponse
     */
    public DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainReqTrafficDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainSnapshotDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainSnapshotDataResponse
     */
    public DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotDataWithOptions(DescribeVsDomainSnapshotDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainSnapshotData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainSnapshotDataResponse());
    }

    /**
     * @param request DescribeVsDomainSnapshotDataRequest
     * @return DescribeVsDomainSnapshotDataResponse
     */
    public DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainSnapshotDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainTrafficDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainTrafficDataResponse
     */
    public DescribeVsDomainTrafficDataResponse describeVsDomainTrafficDataWithOptions(DescribeVsDomainTrafficDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ispNameEn)) {
            query.put("IspNameEn", request.ispNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationNameEn)) {
            query.put("LocationNameEn", request.locationNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainTrafficData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainTrafficDataResponse());
    }

    /**
     * @param request DescribeVsDomainTrafficDataRequest
     * @return DescribeVsDomainTrafficDataResponse
     */
    public DescribeVsDomainTrafficDataResponse describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainTrafficDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsDomainUvDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsDomainUvDataResponse
     */
    public DescribeVsDomainUvDataResponse describeVsDomainUvDataWithOptions(DescribeVsDomainUvDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsDomainUvData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsDomainUvDataResponse());
    }

    /**
     * @param request DescribeVsDomainUvDataRequest
     * @return DescribeVsDomainUvDataResponse
     */
    public DescribeVsDomainUvDataResponse describeVsDomainUvData(DescribeVsDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainUvDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsPullStreamInfoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsPullStreamInfoConfigResponse
     */
    public DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfigWithOptions(DescribeVsPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsPullStreamInfoConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsPullStreamInfoConfigResponse());
    }

    /**
     * @param request DescribeVsPullStreamInfoConfigRequest
     * @return DescribeVsPullStreamInfoConfigResponse
     */
    public DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsStreamsNotifyUrlConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsStreamsNotifyUrlConfigResponse
     */
    public DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfigWithOptions(DescribeVsStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsStreamsNotifyUrlConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsStreamsNotifyUrlConfigResponse());
    }

    /**
     * @param request DescribeVsStreamsNotifyUrlConfigRequest
     * @return DescribeVsStreamsNotifyUrlConfigResponse
     */
    public DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsStreamsOnlineListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsStreamsOnlineListResponse
     */
    public DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineListWithOptions(DescribeVsStreamsOnlineListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsStreamsOnlineList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsStreamsOnlineListResponse());
    }

    /**
     * @param request DescribeVsStreamsOnlineListRequest
     * @return DescribeVsStreamsOnlineListResponse
     */
    public DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsOnlineListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsStreamsPublishListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsStreamsPublishListResponse
     */
    public DescribeVsStreamsPublishListResponse describeVsStreamsPublishListWithOptions(DescribeVsStreamsPublishListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsStreamsPublishList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsStreamsPublishListResponse());
    }

    /**
     * @param request DescribeVsStreamsPublishListRequest
     * @return DescribeVsStreamsPublishListResponse
     */
    public DescribeVsStreamsPublishListResponse describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsPublishListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsTopDomainsByFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsTopDomainsByFlowResponse
     */
    public DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlowWithOptions(DescribeVsTopDomainsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsTopDomainsByFlow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsTopDomainsByFlowResponse());
    }

    /**
     * @param request DescribeVsTopDomainsByFlowRequest
     * @return DescribeVsTopDomainsByFlowResponse
     */
    public DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsTopDomainsByFlowWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsUpPeakPublishStreamDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsUpPeakPublishStreamDataResponse
     */
    public DescribeVsUpPeakPublishStreamDataResponse describeVsUpPeakPublishStreamDataWithOptions(DescribeVsUpPeakPublishStreamDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainSwitch)) {
            query.put("DomainSwitch", request.domainSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsUpPeakPublishStreamData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsUpPeakPublishStreamDataResponse());
    }

    /**
     * @param request DescribeVsUpPeakPublishStreamDataRequest
     * @return DescribeVsUpPeakPublishStreamDataResponse
     */
    public DescribeVsUpPeakPublishStreamDataResponse describeVsUpPeakPublishStreamData(DescribeVsUpPeakPublishStreamDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsUpPeakPublishStreamDataWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsUserResourcePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsUserResourcePackageResponse
     */
    public DescribeVsUserResourcePackageResponse describeVsUserResourcePackageWithOptions(DescribeVsUserResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsUserResourcePackage"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsUserResourcePackageResponse());
    }

    /**
     * @param request DescribeVsUserResourcePackageRequest
     * @return DescribeVsUserResourcePackageResponse
     */
    public DescribeVsUserResourcePackageResponse describeVsUserResourcePackage(DescribeVsUserResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsUserResourcePackageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeVsVerifyContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVsVerifyContentResponse
     */
    public DescribeVsVerifyContentResponse describeVsVerifyContentWithOptions(DescribeVsVerifyContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVsVerifyContent"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVsVerifyContentResponse());
    }

    /**
     * @param request DescribeVsVerifyContentRequest
     * @return DescribeVsVerifyContentResponse
     */
    public DescribeVsVerifyContentResponse describeVsVerifyContent(DescribeVsVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云应用服务实例与项目解除关联</p>
     * 
     * @param tmpReq DisassociateRenderingProjectInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateRenderingProjectInstancesResponse
     */
    public DisassociateRenderingProjectInstancesResponse disassociateRenderingProjectInstancesWithOptions(DisassociateRenderingProjectInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisassociateRenderingProjectInstancesShrinkRequest request = new DisassociateRenderingProjectInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateRenderingProjectInstances"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateRenderingProjectInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云应用服务实例与项目解除关联</p>
     * 
     * @param request DisassociateRenderingProjectInstancesRequest
     * @return DisassociateRenderingProjectInstancesResponse
     */
    public DisassociateRenderingProjectInstancesResponse disassociateRenderingProjectInstances(DisassociateRenderingProjectInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateRenderingProjectInstancesWithOptions(request, runtime);
    }

    /**
     * @param request ForbidVsStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ForbidVsStreamResponse
     */
    public ForbidVsStreamResponse forbidVsStreamWithOptions(ForbidVsStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlStreamAction)) {
            query.put("ControlStreamAction", request.controlStreamAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveStreamType)) {
            query.put("LiveStreamType", request.liveStreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oneshot)) {
            query.put("Oneshot", request.oneshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resumeTime)) {
            query.put("ResumeTime", request.resumeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForbidVsStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForbidVsStreamResponse());
    }

    /**
     * @param request ForbidVsStreamRequest
     * @return ForbidVsStreamResponse
     */
    public ForbidVsStreamResponse forbidVsStream(ForbidVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forbidVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询命令的执行状态与结果。</p>
     * 
     * @param request GetRenderingInstanceCommandsStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRenderingInstanceCommandsStatusResponse
     */
    public GetRenderingInstanceCommandsStatusResponse getRenderingInstanceCommandsStatusWithOptions(GetRenderingInstanceCommandsStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cmdId)) {
            query.put("CmdId", request.cmdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRenderingInstanceCommandsStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRenderingInstanceCommandsStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询命令的执行状态与结果。</p>
     * 
     * @param request GetRenderingInstanceCommandsStatusRequest
     * @return GetRenderingInstanceCommandsStatusResponse
     */
    public GetRenderingInstanceCommandsStatusResponse getRenderingInstanceCommandsStatus(GetRenderingInstanceCommandsStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRenderingInstanceCommandsStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云渲染实例流连接信息，每次流化建联前都需要调用此接口获取最新连接信息</p>
     * 
     * @param request GetRenderingInstanceStreamingInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRenderingInstanceStreamingInfoResponse
     */
    public GetRenderingInstanceStreamingInfoResponse getRenderingInstanceStreamingInfoWithOptions(GetRenderingInstanceStreamingInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRenderingInstanceStreamingInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRenderingInstanceStreamingInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云渲染实例流连接信息，每次流化建联前都需要调用此接口获取最新连接信息</p>
     * 
     * @param request GetRenderingInstanceStreamingInfoRequest
     * @return GetRenderingInstanceStreamingInfoResponse
     */
    public GetRenderingInstanceStreamingInfoResponse getRenderingInstanceStreamingInfo(GetRenderingInstanceStreamingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRenderingInstanceStreamingInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>输出满足特定条件的资源各状态数据量统计值。</p>
     * 
     * @param request GetRenderingProjectInstanceStateMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRenderingProjectInstanceStateMetricsResponse
     */
    public GetRenderingProjectInstanceStateMetricsResponse getRenderingProjectInstanceStateMetricsWithOptions(GetRenderingProjectInstanceStateMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRenderingProjectInstanceStateMetrics"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRenderingProjectInstanceStateMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>输出满足特定条件的资源各状态数据量统计值。</p>
     * 
     * @param request GetRenderingProjectInstanceStateMetricsRequest
     * @return GetRenderingProjectInstanceStateMetricsResponse
     */
    public GetRenderingProjectInstanceStateMetricsResponse getRenderingProjectInstanceStateMetrics(GetRenderingProjectInstanceStateMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRenderingProjectInstanceStateMetricsWithOptions(request, runtime);
    }

    /**
     * @param request GotoPresetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GotoPresetResponse
     */
    public GotoPresetResponse gotoPresetWithOptions(GotoPresetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.presetId)) {
            query.put("PresetId", request.presetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GotoPreset"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GotoPresetResponse());
    }

    /**
     * @param request GotoPresetRequest
     * @return GotoPresetResponse
     */
    public GotoPresetResponse gotoPreset(GotoPresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.gotoPresetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安装云应用</p>
     * 
     * @param tmpReq InstallCloudAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallCloudAppResponse
     */
    public InstallCloudAppResponse installCloudAppWithOptions(InstallCloudAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallCloudAppShrinkRequest request = new InstallCloudAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.patchId)) {
            query.put("PatchId", request.patchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallCloudApp"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallCloudAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安装云应用</p>
     * 
     * @param request InstallCloudAppRequest
     * @return InstallCloudAppResponse
     */
    public InstallCloudAppResponse installCloudApp(InstallCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installCloudAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云应用安装信息列表</p>
     * 
     * @param request ListCloudAppInstallationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAppInstallationsResponse
     */
    public ListCloudAppInstallationsResponse listCloudAppInstallationsWithOptions(ListCloudAppInstallationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudAppInstallations"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAppInstallationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云应用安装信息列表</p>
     * 
     * @param request ListCloudAppInstallationsRequest
     * @return ListCloudAppInstallationsResponse
     */
    public ListCloudAppInstallationsResponse listCloudAppInstallations(ListCloudAppInstallationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAppInstallationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个云应用的Patch列表。</p>
     * 
     * @param request ListCloudAppPatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAppPatchesResponse
     */
    public ListCloudAppPatchesResponse listCloudAppPatchesWithOptions(ListCloudAppPatchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchId)) {
            query.put("PatchId", request.patchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchName)) {
            query.put("PatchName", request.patchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudAppPatches"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAppPatchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个云应用的Patch列表。</p>
     * 
     * @param request ListCloudAppPatchesRequest
     * @return ListCloudAppPatchesResponse
     */
    public ListCloudAppPatchesResponse listCloudAppPatches(ListCloudAppPatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAppPatchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云应用列表</p>
     * 
     * @param request ListCloudAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAppsResponse
     */
    public ListCloudAppsResponse listCloudAppsWithOptions(ListCloudAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudApps"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云应用列表</p>
     * 
     * @param request ListCloudAppsRequest
     * @return ListCloudAppsResponse
     */
    public ListCloudAppsResponse listCloudApps(ListCloudAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询文件的实例推送状态信息列表。</p>
     * 
     * @param request ListFilePushStatusesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilePushStatusesResponse
     */
    public ListFilePushStatusesResponse listFilePushStatusesWithOptions(ListFilePushStatusesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFilePushStatuses"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilePushStatusesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询文件的实例推送状态信息列表。</p>
     * 
     * @param request ListFilePushStatusesRequest
     * @return ListFilePushStatusesResponse
     */
    public ListFilePushStatusesResponse listFilePushStatuses(ListFilePushStatusesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilePushStatusesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询可用文件列表。</p>
     * 
     * @param request ListFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFilesResponse
     */
    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFiles"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询可用文件列表。</p>
     * 
     * @param request ListFilesRequest
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询公钥信息</p>
     * 
     * @param request ListPublicKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublicKeysResponse
     */
    public ListPublicKeysResponse listPublicKeysWithOptions(ListPublicKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublicKeys"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublicKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询公钥信息</p>
     * 
     * @param request ListPublicKeysRequest
     * @return ListPublicKeysResponse
     */
    public ListPublicKeysResponse listPublicKeys(ListPublicKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublicKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有云应用数据包信息，支持分页查询。</p>
     * 
     * @param request ListRenderingDataPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingDataPackagesResponse
     */
    public ListRenderingDataPackagesResponse listRenderingDataPackagesWithOptions(ListRenderingDataPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPackageId)) {
            query.put("DataPackageId", request.dataPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingDataPackages"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingDataPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有云应用数据包信息，支持分页查询。</p>
     * 
     * @param request ListRenderingDataPackagesRequest
     * @return ListRenderingDataPackagesResponse
     */
    public ListRenderingDataPackagesResponse listRenderingDataPackages(ListRenderingDataPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingDataPackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义网关</p>
     * 
     * @param request ListRenderingInstanceGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingInstanceGatewayResponse
     */
    public ListRenderingInstanceGatewayResponse listRenderingInstanceGatewayWithOptions(ListRenderingInstanceGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayInstanceId)) {
            query.put("GatewayInstanceId", request.gatewayInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingInstanceGateway"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingInstanceGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自定义网关</p>
     * 
     * @param request ListRenderingInstanceGatewayRequest
     * @return ListRenderingInstanceGatewayResponse
     */
    public ListRenderingInstanceGatewayResponse listRenderingInstanceGateway(ListRenderingInstanceGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingInstanceGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有云渲染实例信息，支持分页查询。</p>
     * 
     * @param request ListRenderingInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingInstancesResponse
     */
    public ListRenderingInstancesResponse listRenderingInstancesWithOptions(ListRenderingInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingInstances"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有云渲染实例信息，支持分页查询。</p>
     * 
     * @param request ListRenderingInstancesRequest
     * @return ListRenderingInstancesResponse
     */
    public ListRenderingInstancesResponse listRenderingInstances(ListRenderingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过多种筛选条件（如状态、实例ID等）来查询指定项目下的云应用服务实例。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询项目关联的云应用服务实例列表。</p>
     * 
     * @param request ListRenderingProjectInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingProjectInstancesResponse
     */
    public ListRenderingProjectInstancesResponse listRenderingProjectInstancesWithOptions(ListRenderingProjectInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingProjectInstances"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingProjectInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过多种筛选条件（如状态、实例ID等）来查询指定项目下的云应用服务实例。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询项目关联的云应用服务实例列表。</p>
     * 
     * @param request ListRenderingProjectInstancesRequest
     * @return ListRenderingProjectInstancesResponse
     */
    public ListRenderingProjectInstancesResponse listRenderingProjectInstances(ListRenderingProjectInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingProjectInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于分页查询指定用户下的渲染项目基本信息列表。</li>
     * <li>可通过 <code>ProjectId</code> 和 <code>ProjectName</code> 进行过滤查询。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询用户下的云应用服务项目基本信息列表。</p>
     * 
     * @param request ListRenderingProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingProjectsResponse
     */
    public ListRenderingProjectsResponse listRenderingProjectsWithOptions(ListRenderingProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingProjects"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingProjectsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于分页查询指定用户下的渲染项目基本信息列表。</li>
     * <li>可通过 <code>ProjectId</code> 和 <code>ProjectName</code> 进行过滤查询。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询用户下的云应用服务项目基本信息列表。</p>
     * 
     * @param request ListRenderingProjectsRequest
     * @return ListRenderingProjectsResponse
     */
    public ListRenderingProjectsResponse listRenderingProjects(ListRenderingProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingProjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过多种参数组合来过滤和分页查询用户的渲染会话列表。</li>
     * <li><code>SessionId</code> 和 <code>ClientId</code> 参数至少需要提供一个，但两者都不是必选的。如果同时提供了两个参数，则将根据这两个参数进行更精确的匹配。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询指定条件下的渲染会话列表。</p>
     * 
     * @param request ListRenderingSessionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRenderingSessionsResponse
     */
    public ListRenderingSessionsResponse listRenderingSessionsWithOptions(ListRenderingSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchId)) {
            query.put("PatchId", request.patchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRenderingSessions"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRenderingSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过多种参数组合来过滤和分页查询用户的渲染会话列表。</li>
     * <li><code>SessionId</code> 和 <code>ClientId</code> 参数至少需要提供一个，但两者都不是必选的。如果同时提供了两个参数，则将根据这两个参数进行更精确的匹配。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>分页查询指定条件下的渲染会话列表。</p>
     * 
     * @param request ListRenderingSessionsRequest
     * @return ListRenderingSessionsResponse
     */
    public ListRenderingSessionsResponse listRenderingSessions(ListRenderingSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingSessionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安全登陆管理</p>
     * 
     * @param request ManageLoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManageLoginResponse
     */
    public ManageLoginResponse manageLoginWithOptions(ManageLoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyGroup)) {
            query.put("KeyGroup", request.keyGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManageLogin"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManageLoginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安全登陆管理</p>
     * 
     * @param request ManageLoginRequest
     * @return ManageLoginResponse
     */
    public ManageLoginResponse manageLogin(ManageLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageLoginWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceResponse
     */
    public ModifyDeviceResponse modifyDeviceWithOptions(ModifyDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmMethod)) {
            query.put("AlarmMethod", request.alarmMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoDirectory)) {
            query.put("AutoDirectory", request.autoDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPos)) {
            query.put("AutoPos", request.autoPos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latitude)) {
            query.put("Latitude", request.latitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.longitude)) {
            query.put("Longitude", request.longitude);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.posInterval)) {
            query.put("PosInterval", request.posInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendor)) {
            query.put("Vendor", request.vendor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceResponse());
    }

    /**
     * @param request ModifyDeviceRequest
     * @return ModifyDeviceResponse
     */
    public ModifyDeviceResponse modifyDevice(ModifyDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDeviceAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceAlarmResponse
     */
    public ModifyDeviceAlarmResponse modifyDeviceAlarmWithOptions(ModifyDeviceAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmId)) {
            query.put("AlarmId", request.alarmId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeviceAlarm"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceAlarmResponse());
    }

    /**
     * @param request ModifyDeviceAlarmRequest
     * @return ModifyDeviceAlarmResponse
     */
    public ModifyDeviceAlarmResponse modifyDeviceAlarm(ModifyDeviceAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceAlarmWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDeviceCaptureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceCaptureResponse
     */
    public ModifyDeviceCaptureResponse modifyDeviceCaptureWithOptions(ModifyDeviceCaptureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.video)) {
            query.put("Video", request.video);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeviceCapture"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceCaptureResponse());
    }

    /**
     * @param request ModifyDeviceCaptureRequest
     * @return ModifyDeviceCaptureResponse
     */
    public ModifyDeviceCaptureResponse modifyDeviceCapture(ModifyDeviceCaptureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceCaptureWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDeviceChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDeviceChannelsResponse
     */
    public ModifyDeviceChannelsResponse modifyDeviceChannelsWithOptions(ModifyDeviceChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channels)) {
            query.put("Channels", request.channels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceStatus)) {
            query.put("DeviceStatus", request.deviceStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsn)) {
            query.put("Dsn", request.dsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDeviceChannels"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDeviceChannelsResponse());
    }

    /**
     * @param request ModifyDeviceChannelsRequest
     * @return ModifyDeviceChannelsResponse
     */
    public ModifyDeviceChannelsResponse modifyDeviceChannels(ModifyDeviceChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceChannelsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDirectoryResponse
     */
    public ModifyDirectoryResponse modifyDirectoryWithOptions(ModifyDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDirectoryResponse());
    }

    /**
     * @param request ModifyDirectoryRequest
     * @return ModifyDirectoryResponse
     */
    public ModifyDirectoryResponse modifyDirectory(ModifyDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDirectoryWithOptions(request, runtime);
    }

    /**
     * @param request ModifyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGroupResponse
     */
    public ModifyGroupResponse modifyGroupWithOptions(ModifyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inProtocol)) {
            query.put("InProtocol", request.inProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lazyPull)) {
            query.put("LazyPull", request.lazyPull);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outProtocol)) {
            query.put("OutProtocol", request.outProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushDomain)) {
            query.put("PushDomain", request.pushDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGroup"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGroupResponse());
    }

    /**
     * @param request ModifyGroupRequest
     * @return ModifyGroupResponse
     */
    public ModifyGroupResponse modifyGroup(ModifyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGroupWithOptions(request, runtime);
    }

    /**
     * @param request ModifyParentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyParentPlatformResponse
     */
    public ModifyParentPlatformResponse modifyParentPlatformWithOptions(ModifyParentPlatformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientAuth)) {
            query.put("ClientAuth", request.clientAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPassword)) {
            query.put("ClientPassword", request.clientPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUsername)) {
            query.put("ClientUsername", request.clientUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gbId)) {
            query.put("GbId", request.gbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyParentPlatform"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyParentPlatformResponse());
    }

    /**
     * @param request ModifyParentPlatformRequest
     * @return ModifyParentPlatformResponse
     */
    public ModifyParentPlatformResponse modifyParentPlatform(ModifyParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变配云渲染资源实例付费类型</p>
     * 
     * @param request ModifyRenderingChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRenderingChargeTypeResponse
     */
    public ModifyRenderingChargeTypeResponse modifyRenderingChargeTypeWithOptions(ModifyRenderingChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceBillingCycle)) {
            query.put("InstanceBillingCycle", request.instanceBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRenderingChargeType"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRenderingChargeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变配云渲染资源实例付费类型</p>
     * 
     * @param request ModifyRenderingChargeTypeRequest
     * @return ModifyRenderingChargeTypeResponse
     */
    public ModifyRenderingChargeTypeResponse modifyRenderingChargeType(ModifyRenderingChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRenderingChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变配云渲染资源实例</p>
     * 
     * @param request ModifyRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRenderingInstanceResponse
     */
    public ModifyRenderingInstanceResponse modifyRenderingInstanceWithOptions(ModifyRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingSpec)) {
            query.put("RenderingSpec", request.renderingSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变配云渲染资源实例</p>
     * 
     * @param request ModifyRenderingInstanceRequest
     * @return ModifyRenderingInstanceResponse
     */
    public ModifyRenderingInstanceResponse modifyRenderingInstance(ModifyRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改云应用服务实例密码</p>
     * 
     * @param request ModifyRenderingInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRenderingInstanceAttributeResponse
     */
    public ModifyRenderingInstanceAttributeResponse modifyRenderingInstanceAttributeWithOptions(ModifyRenderingInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRenderingInstanceAttribute"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRenderingInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改云应用服务实例密码</p>
     * 
     * @param request ModifyRenderingInstanceAttributeRequest
     * @return ModifyRenderingInstanceAttributeResponse
     */
    public ModifyRenderingInstanceAttributeResponse modifyRenderingInstanceAttribute(ModifyRenderingInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRenderingInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改云渲染实例限速带宽</p>
     * 
     * @param request ModifyRenderingInstanceBandwidthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRenderingInstanceBandwidthResponse
     */
    public ModifyRenderingInstanceBandwidthResponse modifyRenderingInstanceBandwidthWithOptions(ModifyRenderingInstanceBandwidthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxEgressBandwidth)) {
            query.put("MaxEgressBandwidth", request.maxEgressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxIngressBandwidth)) {
            query.put("MaxIngressBandwidth", request.maxIngressBandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRenderingInstanceBandwidth"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRenderingInstanceBandwidthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改云渲染实例限速带宽</p>
     * 
     * @param request ModifyRenderingInstanceBandwidthRequest
     * @return ModifyRenderingInstanceBandwidthResponse
     */
    public ModifyRenderingInstanceBandwidthResponse modifyRenderingInstanceBandwidth(ModifyRenderingInstanceBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRenderingInstanceBandwidthWithOptions(request, runtime);
    }

    /**
     * @param request ModifyTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTemplateResponse
     */
    public ModifyTemplateResponse modifyTemplateWithOptions(ModifyTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callback)) {
            query.put("Callback", request.callback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            query.put("FileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flv)) {
            query.put("Flv", request.flv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hlsM3u8)) {
            query.put("HlsM3u8", request.hlsM3u8);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hlsTs)) {
            query.put("HlsTs", request.hlsTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgOnDemand)) {
            query.put("JpgOnDemand", request.jpgOnDemand);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgOverwrite)) {
            query.put("JpgOverwrite", request.jpgOverwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jpgSequence)) {
            query.put("JpgSequence", request.jpgSequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mp4)) {
            query.put("Mp4", request.mp4);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFilePrefix)) {
            query.put("OssFilePrefix", request.ossFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retention)) {
            query.put("Retention", request.retention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transConfigsJSON)) {
            query.put("TransConfigsJSON", request.transConfigsJSON);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trigger)) {
            query.put("Trigger", request.trigger);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTemplateResponse());
    }

    /**
     * @param request ModifyTemplateRequest
     * @return ModifyTemplateResponse
     */
    public ModifyTemplateResponse modifyTemplate(ModifyTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateWithOptions(request, runtime);
    }

    /**
     * @param request OpenVsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenVsServiceResponse
     */
    public OpenVsServiceResponse openVsServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenVsService"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenVsServiceResponse());
    }

    /**
     * @return OpenVsServiceResponse
     */
    public OpenVsServiceResponse openVsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openVsServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预推文件到云渲染实例。</p>
     * 
     * @param request PushFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushFileResponse
     */
    public PushFileResponse pushFileWithOptions(PushFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushFile"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预推文件到云渲染实例。</p>
     * 
     * @param request PushFileRequest
     * @return PushFileResponse
     */
    public PushFileResponse pushFile(PushFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重启云渲染实例</p>
     * 
     * @param request RebootRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootRenderingInstanceResponse
     */
    public RebootRenderingInstanceResponse rebootRenderingInstanceWithOptions(RebootRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重启云渲染实例</p>
     * 
     * @param request RebootRenderingInstanceRequest
     * @return RebootRenderingInstanceResponse
     */
    public RebootRenderingInstanceResponse rebootRenderingInstance(RebootRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云应用服务实例主机重启</p>
     * 
     * @param tmpReq RebootRenderingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootRenderingServerResponse
     */
    public RebootRenderingServerResponse rebootRenderingServerWithOptions(RebootRenderingServerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebootRenderingServerShrinkRequest request = new RebootRenderingServerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootRenderingServer"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootRenderingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云应用服务实例主机重启</p>
     * 
     * @param request RebootRenderingServerRequest
     * @return RebootRenderingServerResponse
     */
    public RebootRenderingServerResponse rebootRenderingServer(RebootRenderingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootRenderingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复数据到云渲染实例</p>
     * 
     * @param request RecoverRenderingDataPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverRenderingDataPackageResponse
     */
    public RecoverRenderingDataPackageResponse recoverRenderingDataPackageWithOptions(RecoverRenderingDataPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPackageId)) {
            query.put("DataPackageId", request.dataPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadMode)) {
            query.put("LoadMode", request.loadMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverRenderingDataPackage"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverRenderingDataPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复数据到云渲染实例</p>
     * 
     * @param request RecoverRenderingDataPackageRequest
     * @return RecoverRenderingDataPackageResponse
     */
    public RecoverRenderingDataPackageResponse recoverRenderingDataPackage(RecoverRenderingDataPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverRenderingDataPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例流连接信息</p>
     * 
     * @param tmpReq RefreshRenderingInstanceStreamingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshRenderingInstanceStreamingResponse
     */
    public RefreshRenderingInstanceStreamingResponse refreshRenderingInstanceStreamingWithOptions(RefreshRenderingInstanceStreamingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefreshRenderingInstanceStreamingShrinkRequest request = new RefreshRenderingInstanceStreamingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientInfo)) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientInfo, "ClientInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientInfoShrink)) {
            query.put("ClientInfo", request.clientInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshRenderingInstanceStreaming"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshRenderingInstanceStreamingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例流连接信息</p>
     * 
     * @param request RefreshRenderingInstanceStreamingRequest
     * @return RefreshRenderingInstanceStreamingResponse
     */
    public RefreshRenderingInstanceStreamingResponse refreshRenderingInstanceStreaming(RefreshRenderingInstanceStreamingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshRenderingInstanceStreamingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放云渲染数据包</p>
     * 
     * @param request ReleaseRenderingDataPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseRenderingDataPackageResponse
     */
    public ReleaseRenderingDataPackageResponse releaseRenderingDataPackageWithOptions(ReleaseRenderingDataPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPackageId)) {
            query.put("DataPackageId", request.dataPackageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseRenderingDataPackage"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseRenderingDataPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放云渲染数据包</p>
     * 
     * @param request ReleaseRenderingDataPackageRequest
     * @return ReleaseRenderingDataPackageResponse
     */
    public ReleaseRenderingDataPackageResponse releaseRenderingDataPackage(ReleaseRenderingDataPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseRenderingDataPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放云渲染实例</p>
     * 
     * @param request ReleaseRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseRenderingInstanceResponse
     */
    public ReleaseRenderingInstanceResponse releaseRenderingInstanceWithOptions(ReleaseRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放云渲染实例</p>
     * 
     * @param request ReleaseRenderingInstanceRequest
     * @return ReleaseRenderingInstanceResponse
     */
    public ReleaseRenderingInstanceResponse releaseRenderingInstance(ReleaseRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>续费云渲染资源实例</p>
     * 
     * @param request RenewRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewRenderingInstanceResponse
     */
    public RenewRenderingInstanceResponse renewRenderingInstanceWithOptions(RenewRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>续费云渲染资源实例</p>
     * 
     * @param request RenewRenderingInstanceRequest
     * @return RenewRenderingInstanceResponse
     */
    public RenewRenderingInstanceResponse renewRenderingInstance(RenewRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置云渲染实例</p>
     * 
     * @param request ResetRenderingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetRenderingInstanceResponse
     */
    public ResetRenderingInstanceResponse resetRenderingInstanceWithOptions(ResetRenderingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPackageId)) {
            query.put("DataPackageId", request.dataPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetRenderingInstance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetRenderingInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置云渲染实例</p>
     * 
     * @param request ResetRenderingInstanceRequest
     * @return ResetRenderingInstanceResponse
     */
    public ResetRenderingInstanceResponse resetRenderingInstance(ResetRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * @param request ResumeVsStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeVsStreamResponse
     */
    public ResumeVsStreamResponse resumeVsStreamWithOptions(ResumeVsStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlStreamAction)) {
            query.put("ControlStreamAction", request.controlStreamAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveStreamType)) {
            query.put("LiveStreamType", request.liveStreamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeVsStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeVsStreamResponse());
    }

    /**
     * @param request ResumeVsStreamRequest
     * @return ResumeVsStreamResponse
     */
    public ResumeVsStreamResponse resumeVsStream(ResumeVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下发shell命令，支持同步/异步响应命令。</p>
     * 
     * @param request SendRenderingInstanceCommandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendRenderingInstanceCommandsResponse
     */
    public SendRenderingInstanceCommandsResponse sendRenderingInstanceCommandsWithOptions(SendRenderingInstanceCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commands)) {
            body.put("Commands", request.commands);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendRenderingInstanceCommands"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendRenderingInstanceCommandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下发shell命令，支持同步/异步响应命令。</p>
     * 
     * @param request SendRenderingInstanceCommandsRequest
     * @return SendRenderingInstanceCommandsResponse
     */
    public SendRenderingInstanceCommandsResponse sendRenderingInstanceCommands(SendRenderingInstanceCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRenderingInstanceCommandsWithOptions(request, runtime);
    }

    /**
     * @param request SetPresetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPresetResponse
     */
    public SetPresetResponse setPresetWithOptions(SetPresetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.presetId)) {
            query.put("PresetId", request.presetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPreset"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPresetResponse());
    }

    /**
     * @param request SetPresetRequest
     * @return SetPresetResponse
     */
    public SetPresetResponse setPreset(SetPresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPresetWithOptions(request, runtime);
    }

    /**
     * @param request SetVsDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetVsDomainCertificateResponse
     */
    public SetVsDomainCertificateResponse setVsDomainCertificateWithOptions(SetVsDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            query.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            query.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSet)) {
            query.put("ForceSet", request.forceSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPri)) {
            query.put("SSLPri", request.SSLPri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLProtocol)) {
            query.put("SSLProtocol", request.SSLProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLPub)) {
            query.put("SSLPub", request.SSLPub);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVsDomainCertificate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVsDomainCertificateResponse());
    }

    /**
     * @param request SetVsDomainCertificateRequest
     * @return SetVsDomainCertificateResponse
     */
    public SetVsDomainCertificateResponse setVsDomainCertificate(SetVsDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVsDomainCertificateWithOptions(request, runtime);
    }

    /**
     * @param request SetVsStreamsNotifyUrlConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetVsStreamsNotifyUrlConfigResponse
     */
    public SetVsStreamsNotifyUrlConfigResponse setVsStreamsNotifyUrlConfigWithOptions(SetVsStreamsNotifyUrlConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetVsStreamsNotifyUrlConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetVsStreamsNotifyUrlConfigResponse());
    }

    /**
     * @param request SetVsStreamsNotifyUrlConfigRequest
     * @return SetVsStreamsNotifyUrlConfigResponse
     */
    public SetVsStreamsNotifyUrlConfigResponse setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * @param request StartDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDeviceResponse
     */
    public StartDeviceResponse startDeviceWithOptions(StartDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDeviceResponse());
    }

    /**
     * @param request StartDeviceRequest
     * @return StartDeviceResponse
     */
    public StartDeviceResponse startDevice(StartDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDeviceWithOptions(request, runtime);
    }

    /**
     * @param request StartParentPlatformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartParentPlatformResponse
     */
    public StartParentPlatformResponse startParentPlatformWithOptions(StartParentPlatformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartParentPlatform"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartParentPlatformResponse());
    }

    /**
     * @param request StartParentPlatformRequest
     * @return StartParentPlatformResponse
     */
    public StartParentPlatformResponse startParentPlatform(StartParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startParentPlatformWithOptions(request, runtime);
    }

    /**
     * @param request StartPublishStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPublishStreamResponse
     */
    public StartPublishStreamResponse startPublishStreamWithOptions(StartPublishStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishUrl)) {
            query.put("PublishUrl", request.publishUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPublishStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPublishStreamResponse());
    }

    /**
     * @param request StartPublishStreamRequest
     * @return StartPublishStreamResponse
     */
    public StartPublishStreamResponse startPublishStream(StartPublishStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPublishStreamWithOptions(request, runtime);
    }

    /**
     * @param request StartRecordStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRecordStreamResponse
     */
    public StartRecordStreamResponse startRecordStreamWithOptions(StartRecordStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.app)) {
            query.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRecordStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRecordStreamResponse());
    }

    /**
     * @param request StartRecordStreamRequest
     * @return StartRecordStreamResponse
     */
    public StartRecordStreamResponse startRecordStream(StartRecordStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRecordStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调度一个空闲云应用服务实例，并完成服务启动。</p>
     * 
     * @param tmpReq StartRenderingSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRenderingSessionResponse
     */
    public StartRenderingSessionResponse startRenderingSessionWithOptions(StartRenderingSessionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartRenderingSessionShrinkRequest request = new StartRenderingSessionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clientParams)) {
            request.clientParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clientParams, "ClientParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientParamsShrink)) {
            query.put("ClientParams", request.clientParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchId)) {
            query.put("PatchId", request.patchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRenderingSession"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRenderingSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调度一个空闲云应用服务实例，并完成服务启动。</p>
     * 
     * @param request StartRenderingSessionRequest
     * @return StartRenderingSessionResponse
     */
    public StartRenderingSessionResponse startRenderingSession(StartRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRenderingSessionWithOptions(request, runtime);
    }

    /**
     * @param request StartStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartStreamResponse
     */
    public StartStreamResponse startStreamWithOptions(StartStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartStreamResponse());
    }

    /**
     * @param request StartStreamRequest
     * @return StartStreamResponse
     */
    public StartStreamResponse startStream(StartStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startStreamWithOptions(request, runtime);
    }

    /**
     * @param request StartTransferStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTransferStreamResponse
     */
    public StartTransferStreamResponse startTransferStreamWithOptions(StartTransferStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcode)) {
            query.put("Transcode", request.transcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTransferStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTransferStreamResponse());
    }

    /**
     * @param request StartTransferStreamRequest
     * @return StartTransferStreamResponse
     */
    public StartTransferStreamResponse startTransferStream(StartTransferStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTransferStreamWithOptions(request, runtime);
    }

    /**
     * @param request StopAdjustRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAdjustResponse
     */
    public StopAdjustResponse stopAdjustWithOptions(StopAdjustRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.focus)) {
            query.put("Focus", request.focus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iris)) {
            query.put("Iris", request.iris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAdjust"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAdjustResponse());
    }

    /**
     * @param request StopAdjustRequest
     * @return StopAdjustResponse
     */
    public StopAdjustResponse stopAdjust(StopAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAdjustWithOptions(request, runtime);
    }

    /**
     * @param request StopDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDeviceResponse
     */
    public StopDeviceResponse stopDeviceWithOptions(StopDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDeviceResponse());
    }

    /**
     * @param request StopDeviceRequest
     * @return StopDeviceResponse
     */
    public StopDeviceResponse stopDevice(StopDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDeviceWithOptions(request, runtime);
    }

    /**
     * @param request StopMoveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMoveResponse
     */
    public StopMoveResponse stopMoveWithOptions(StopMoveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pan)) {
            query.put("Pan", request.pan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tilt)) {
            query.put("Tilt", request.tilt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoom)) {
            query.put("Zoom", request.zoom);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMove"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMoveResponse());
    }

    /**
     * @param request StopMoveRequest
     * @return StopMoveResponse
     */
    public StopMoveResponse stopMove(StopMoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMoveWithOptions(request, runtime);
    }

    /**
     * @param request StopPublishStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopPublishStreamResponse
     */
    public StopPublishStreamResponse stopPublishStreamWithOptions(StopPublishStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPublishStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPublishStreamResponse());
    }

    /**
     * @param request StopPublishStreamRequest
     * @return StopPublishStreamResponse
     */
    public StopPublishStreamResponse stopPublishStream(StopPublishStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopPublishStreamWithOptions(request, runtime);
    }

    /**
     * @param request StopRecordStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopRecordStreamResponse
     */
    public StopRecordStreamResponse stopRecordStreamWithOptions(StopRecordStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.app)) {
            query.put("App", request.app);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRecordStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRecordStreamResponse());
    }

    /**
     * @param request StopRecordStreamRequest
     * @return StopRecordStreamResponse
     */
    public StopRecordStreamResponse stopRecordStream(StopRecordStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRecordStreamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>关闭指定的云应用服务会话并回收相关实例资源。</p>
     * 
     * @param request StopRenderingSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopRenderingSessionResponse
     */
    public StopRenderingSessionResponse stopRenderingSessionWithOptions(StopRenderingSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRenderingSession"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRenderingSessionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>关闭指定的云应用服务会话并回收相关实例资源。</p>
     * 
     * @param request StopRenderingSessionRequest
     * @return StopRenderingSessionResponse
     */
    public StopRenderingSessionResponse stopRenderingSession(StopRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRenderingSessionWithOptions(request, runtime);
    }

    /**
     * @param request StopStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopStreamResponse
     */
    public StopStreamResponse stopStreamWithOptions(StopStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStreamResponse());
    }

    /**
     * @param request StopStreamRequest
     * @return StopStreamResponse
     */
    public StopStreamResponse stopStream(StopStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStreamWithOptions(request, runtime);
    }

    /**
     * @param request StopTransferStreamRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTransferStreamResponse
     */
    public StopTransferStreamResponse stopTransferStreamWithOptions(StopTransferStreamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcode)) {
            query.put("Transcode", request.transcode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTransferStream"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTransferStreamResponse());
    }

    /**
     * @param request StopTransferStreamRequest
     * @return StopTransferStreamResponse
     */
    public StopTransferStreamResponse stopTransferStream(StopTransferStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTransferStreamWithOptions(request, runtime);
    }

    /**
     * @param request SyncCatalogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncCatalogsResponse
     */
    public SyncCatalogsResponse syncCatalogsWithOptions(SyncCatalogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncCatalogs"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncCatalogsResponse());
    }

    /**
     * @param request SyncCatalogsRequest
     * @return SyncCatalogsResponse
     */
    public SyncCatalogsResponse syncCatalogs(SyncCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncCatalogsWithOptions(request, runtime);
    }

    /**
     * @param request UnbindDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDirectoryResponse
     */
    public UnbindDirectoryResponse unbindDirectoryWithOptions(UnbindDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDirectory"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDirectoryResponse());
    }

    /**
     * @param request UnbindDirectoryRequest
     * @return UnbindDirectoryResponse
     */
    public UnbindDirectoryResponse unbindDirectory(UnbindDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDirectoryWithOptions(request, runtime);
    }

    /**
     * @param request UnbindParentPlatformDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindParentPlatformDeviceResponse
     */
    public UnbindParentPlatformDeviceResponse unbindParentPlatformDeviceWithOptions(UnbindParentPlatformDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentPlatformId)) {
            query.put("ParentPlatformId", request.parentPlatformId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindParentPlatformDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindParentPlatformDeviceResponse());
    }

    /**
     * @param request UnbindParentPlatformDeviceRequest
     * @return UnbindParentPlatformDeviceResponse
     */
    public UnbindParentPlatformDeviceResponse unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindParentPlatformDeviceWithOptions(request, runtime);
    }

    /**
     * @param request UnbindPurchasedDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindPurchasedDeviceResponse
     */
    public UnbindPurchasedDeviceResponse unbindPurchasedDeviceWithOptions(UnbindPurchasedDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindPurchasedDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindPurchasedDeviceResponse());
    }

    /**
     * @param request UnbindPurchasedDeviceRequest
     * @return UnbindPurchasedDeviceResponse
     */
    public UnbindPurchasedDeviceResponse unbindPurchasedDevice(UnbindPurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * @param request UnbindTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindTemplateResponse
     */
    public UnbindTemplateResponse unbindTemplateWithOptions(UnbindTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindTemplateResponse());
    }

    /**
     * @param request UnbindTemplateRequest
     * @return UnbindTemplateResponse
     */
    public UnbindTemplateResponse unbindTemplate(UnbindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卸载云应用</p>
     * 
     * @param tmpReq UninstallCloudAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallCloudAppResponse
     */
    public UninstallCloudAppResponse uninstallCloudAppWithOptions(UninstallCloudAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UninstallCloudAppShrinkRequest request = new UninstallCloudAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.patchId)) {
            query.put("PatchId", request.patchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallCloudApp"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallCloudAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>卸载云应用</p>
     * 
     * @param request UninstallCloudAppRequest
     * @return UninstallCloudAppResponse
     */
    public UninstallCloudAppResponse uninstallCloudApp(UninstallCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallCloudAppWithOptions(request, runtime);
    }

    /**
     * @param request UnlockDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockDeviceResponse
     */
    public UnlockDeviceResponse unlockDeviceWithOptions(UnlockDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockDeviceResponse());
    }

    /**
     * @param request UnlockDeviceRequest
     * @return UnlockDeviceResponse
     */
    public UnlockDeviceResponse unlockDevice(UnlockDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新云应用信息</p>
     * 
     * @param tmpReq UpdateCloudAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudAppInfoResponse
     */
    public UpdateCloudAppInfoResponse updateCloudAppInfoWithOptions(UpdateCloudAppInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudAppInfoShrinkRequest request = new UpdateCloudAppInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.patch)) {
            request.patchShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.patch, "Patch", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pkgLabels)) {
            request.pkgLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pkgLabels, "PkgLabels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgLabelsShrink)) {
            query.put("PkgLabels", request.pkgLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stablePatchId)) {
            query.put("StablePatchId", request.stablePatchId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.patchShrink)) {
            body.put("Patch", request.patchShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudAppInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudAppInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新云应用信息</p>
     * 
     * @param request UpdateCloudAppInfoRequest
     * @return UpdateCloudAppInfoResponse
     */
    public UpdateCloudAppInfoResponse updateCloudAppInfo(UpdateCloudAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文件信息。</p>
     * 
     * @param request UpdateFileInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileInfoResponse
     */
    public UpdateFileInfoResponse updateFileInfoWithOptions(UpdateFileInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFileInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFileInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新文件信息。</p>
     * 
     * @param request UpdateFileInfoRequest
     * @return UpdateFileInfoResponse
     */
    public UpdateFileInfoResponse updateFileInfo(UpdateFileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFileInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新云渲染实例配置参数</p>
     * 
     * @param tmpReq UpdateRenderingInstanceConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRenderingInstanceConfigurationResponse
     */
    public UpdateRenderingInstanceConfigurationResponse updateRenderingInstanceConfigurationWithOptions(UpdateRenderingInstanceConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRenderingInstanceConfigurationShrinkRequest request = new UpdateRenderingInstanceConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configuration)) {
            request.configurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configuration, "Configuration", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationShrink)) {
            body.put("Configuration", request.configurationShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRenderingInstanceConfiguration"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRenderingInstanceConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新云渲染实例配置参数</p>
     * 
     * @param request UpdateRenderingInstanceConfigurationRequest
     * @return UpdateRenderingInstanceConfigurationResponse
     */
    public UpdateRenderingInstanceConfigurationResponse updateRenderingInstanceConfiguration(UpdateRenderingInstanceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRenderingInstanceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例设置</p>
     * 
     * @param tmpReq UpdateRenderingInstanceSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRenderingInstanceSettingsResponse
     */
    public UpdateRenderingInstanceSettingsResponse updateRenderingInstanceSettingsWithOptions(UpdateRenderingInstanceSettingsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRenderingInstanceSettingsShrinkRequest request = new UpdateRenderingInstanceSettingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.settings)) {
            request.settingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.settings, "Settings", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceId)) {
            query.put("RenderingInstanceId", request.renderingInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingsShrink)) {
            query.put("Settings", request.settingsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRenderingInstanceSettings"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRenderingInstanceSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例设置</p>
     * 
     * @param request UpdateRenderingInstanceSettingsRequest
     * @return UpdateRenderingInstanceSettingsResponse
     */
    public UpdateRenderingInstanceSettingsResponse updateRenderingInstanceSettings(UpdateRenderingInstanceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRenderingInstanceSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个项目的属性信息</p>
     * 
     * @param tmpReq UpdateRenderingProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRenderingProjectResponse
     */
    public UpdateRenderingProjectResponse updateRenderingProjectWithOptions(UpdateRenderingProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRenderingProjectShrinkRequest request = new UpdateRenderingProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionAttribs)) {
            request.sessionAttribsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionAttribs, "SessionAttribs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            query.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionAttribsShrink)) {
            query.put("SessionAttribs", request.sessionAttribsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRenderingProject"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRenderingProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个项目的属性信息</p>
     * 
     * @param request UpdateRenderingProjectRequest
     * @return UpdateRenderingProjectResponse
     */
    public UpdateRenderingProjectResponse updateRenderingProject(UpdateRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRenderingProjectWithOptions(request, runtime);
    }

    /**
     * @param request UpdateVsPullStreamInfoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVsPullStreamInfoConfigResponse
     */
    public UpdateVsPullStreamInfoConfigResponse updateVsPullStreamInfoConfigWithOptions(UpdateVsPullStreamInfoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.always)) {
            query.put("Always", request.always);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            query.put("SourceUrl", request.sourceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamName)) {
            query.put("StreamName", request.streamName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVsPullStreamInfoConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVsPullStreamInfoConfigResponse());
    }

    /**
     * @param request UpdateVsPullStreamInfoConfigRequest
     * @return UpdateVsPullStreamInfoConfigResponse
     */
    public UpdateVsPullStreamInfoConfigResponse updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用上架</p>
     * 
     * @param tmpReq UploadCloudAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadCloudAppResponse
     */
    public UploadCloudAppResponse uploadCloudAppWithOptions(UploadCloudAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadCloudAppShrinkRequest request = new UploadCloudAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pkgLabels)) {
            request.pkgLabelsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pkgLabels, "PkgLabels", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadUrl)) {
            query.put("DownloadUrl", request.downloadUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgFormat)) {
            query.put("PkgFormat", request.pkgFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgLabelsShrink)) {
            query.put("PkgLabels", request.pkgLabelsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkgType)) {
            query.put("PkgType", request.pkgType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadCloudApp"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadCloudAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用上架</p>
     * 
     * @param request UploadCloudAppRequest
     * @return UploadCloudAppResponse
     */
    public UploadCloudAppResponse uploadCloudApp(UploadCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadCloudAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传</p>
     * 
     * @param request UploadFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originUrl)) {
            query.put("OriginUrl", request.originUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPath)) {
            query.put("TargetPath", request.targetPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFile"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文件上传</p>
     * 
     * @param request UploadFileRequest
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传公钥，用于安全登陆鉴权。</p>
     * 
     * @param request UploadPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadPublicKeyResponse
     */
    public UploadPublicKeyResponse uploadPublicKeyWithOptions(UploadPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyGroup)) {
            query.put("KeyGroup", request.keyGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyType)) {
            query.put("KeyType", request.keyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadPublicKey"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传公钥，用于安全登陆鉴权。</p>
     * 
     * @param request UploadPublicKeyRequest
     * @return UploadPublicKeyResponse
     */
    public UploadPublicKeyResponse uploadPublicKey(UploadPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadPublicKeyWithOptions(request, runtime);
    }

    /**
     * @param request VerifyVsDomainOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyVsDomainOwnerResponse
     */
    public VerifyVsDomainOwnerResponse verifyVsDomainOwnerWithOptions(VerifyVsDomainOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyType)) {
            query.put("VerifyType", request.verifyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyVsDomainOwner"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyVsDomainOwnerResponse());
    }

    /**
     * @param request VerifyVsDomainOwnerRequest
     * @return VerifyVsDomainOwnerResponse
     */
    public VerifyVsDomainOwnerResponse verifyVsDomainOwner(VerifyVsDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVsDomainOwnerWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212;

import com.aliyun.tea.*;
import com.aliyun.vs20181212.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shenzhen", "vs.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai", "vs.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "vs.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "vs.cn-beijing.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li><strong>HiveId</strong> is a required parameter that specifies the ID of the target cluster.</li>
     * <li><strong>InstanceIds</strong> is a required parameter that specifies a list of instance IDs to add.</li>
     * <li>Adding an instance that already exists in the target cluster returns an error message.</li>
     * <li>The response includes lists of successful and failed instances. This allows you to verify which instances were added and review the reasons for any failures.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more instances to a specified cluster.</p>
     * 
     * @param tmpReq AddHiveEdgeWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddHiveEdgeWorkersResponse
     */
    public AddHiveEdgeWorkersResponse addHiveEdgeWorkersWithOptions(AddHiveEdgeWorkersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddHiveEdgeWorkersShrinkRequest request = new AddHiveEdgeWorkersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddHiveEdgeWorkers"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddHiveEdgeWorkersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li><strong>HiveId</strong> is a required parameter that specifies the ID of the target cluster.</li>
     * <li><strong>InstanceIds</strong> is a required parameter that specifies a list of instance IDs to add.</li>
     * <li>Adding an instance that already exists in the target cluster returns an error message.</li>
     * <li>The response includes lists of successful and failed instances. This allows you to verify which instances were added and review the reasons for any failures.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more instances to a specified cluster.</p>
     * 
     * @param request AddHiveEdgeWorkersRequest
     * @return AddHiveEdgeWorkersResponse
     */
    public AddHiveEdgeWorkersResponse addHiveEdgeWorkers(AddHiveEdgeWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHiveEdgeWorkersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a stream pulling configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds a stream pulling configuration.</p>
     * 
     * @param request AddVsPullStreamInfoConfigRequest
     * @return AddVsPullStreamInfoConfigResponse
     */
    public AddVsPullStreamInfoConfigResponse addVsPullStreamInfoConfig(AddVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation associates instances that meet specific conditions with a specified project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates cloud application service instances with a project.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation associates instances that meet specific conditions with a specified project.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Associates cloud application service instances with a project.</p>
     * 
     * @param request AssociateRenderingProjectInstancesRequest
     * @return AssociateRenderingProjectInstancesResponse
     */
    public AssociateRenderingProjectInstancesResponse associateRenderingProjectInstances(AssociateRenderingProjectInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateRenderingProjectInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds multiple devices to directories in a single operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds multiple devices to directories in a single operation.</p>
     * 
     * @param request BatchBindDirectoriesRequest
     * @return BatchBindDirectoriesResponse
     */
    public BatchBindDirectoriesResponse batchBindDirectories(BatchBindDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds multiple devices to a parent platform for push in batches.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds multiple devices to a parent platform for push in batches.</p>
     * 
     * @param request BatchBindParentPlatformDevicesRequest
     * @return BatchBindParentPlatformDevicesResponse
     */
    public BatchBindParentPlatformDevicesResponse batchBindParentPlatformDevices(BatchBindParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds multiple purchased devices.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds multiple purchased devices.</p>
     * 
     * @param request BatchBindPurchasedDevicesRequest
     * @return BatchBindPurchasedDevicesResponse
     */
    public BatchBindPurchasedDevicesResponse batchBindPurchasedDevices(BatchBindPurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindPurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Bind templates to multiple specified instances, such as instances bound to spaces and streams.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Bind templates to multiple specified instances, such as instances bound to spaces and streams.</p>
     * 
     * @param request BatchBindTemplateRequest
     * @return BatchBindTemplateResponse
     */
    public BatchBindTemplateResponse batchBindTemplate(BatchBindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds multiple templates in a single operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds multiple templates in a single operation.</p>
     * 
     * @param request BatchBindTemplatesRequest
     * @return BatchBindTemplatesResponse
     */
    public BatchBindTemplatesResponse batchBindTemplates(BatchBindTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchBindTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Authentication</strong>: Requests must include the <code>AliUid</code> parameter for identity verification.</li>
     * <li><strong>Instance specification</strong>: Use <code>RenderingInstanceIds</code> to specify the instances to capture screenshots from.</li>
     * <li><strong>Screenshot quality</strong>: Use the <code>Quality</code> parameter to set the image quality of screenshots. The default value is 75 (if not configured). Valid values: 1 to 100.</li>
     * <li><strong>Response handling</strong>: The response contains lists of successful and failed instances with related information, including download URLs and screenshot completion times.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves screenshots of cloud application service instances.</p>
     * 
     * @param tmpReq BatchCaptureRenderingInstanceScreenshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCaptureRenderingInstanceScreenshotResponse
     */
    public BatchCaptureRenderingInstanceScreenshotResponse batchCaptureRenderingInstanceScreenshotWithOptions(BatchCaptureRenderingInstanceScreenshotRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchCaptureRenderingInstanceScreenshotShrinkRequest request = new BatchCaptureRenderingInstanceScreenshotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renderingInstanceIds)) {
            request.renderingInstanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renderingInstanceIds, "RenderingInstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quality)) {
            query.put("Quality", request.quality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renderingInstanceIdsShrink)) {
            query.put("RenderingInstanceIds", request.renderingInstanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCaptureRenderingInstanceScreenshot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCaptureRenderingInstanceScreenshotResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Authentication</strong>: Requests must include the <code>AliUid</code> parameter for identity verification.</li>
     * <li><strong>Instance specification</strong>: Use <code>RenderingInstanceIds</code> to specify the instances to capture screenshots from.</li>
     * <li><strong>Screenshot quality</strong>: Use the <code>Quality</code> parameter to set the image quality of screenshots. The default value is 75 (if not configured). Valid values: 1 to 100.</li>
     * <li><strong>Response handling</strong>: The response contains lists of successful and failed instances with related information, including download URLs and screenshot completion times.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves screenshots of cloud application service instances.</p>
     * 
     * @param request BatchCaptureRenderingInstanceScreenshotRequest
     * @return BatchCaptureRenderingInstanceScreenshotResponse
     */
    public BatchCaptureRenderingInstanceScreenshotResponse batchCaptureRenderingInstanceScreenshot(BatchCaptureRenderingInstanceScreenshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCaptureRenderingInstanceScreenshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple devices in a single operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes multiple devices in a single operation.</p>
     * 
     * @param request BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     */
    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes domain name configurations in a batch.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes domain name configurations in a batch.</p>
     * 
     * @param request BatchDeleteVsDomainConfigsRequest
     * @return BatchDeleteVsDomainConfigsResponse
     */
    public BatchDeleteVsDomainConfigsResponse batchDeleteVsDomainConfigs(BatchDeleteVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDeleteVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stop stream ingest for one or more streams. You can schedule when to resume ingest.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stop stream ingest for one or more streams. You can schedule when to resume ingest.</p>
     * 
     * @param request BatchForbidVsStreamRequest
     * @return BatchForbidVsStreamResponse
     */
    public BatchForbidVsStreamResponse batchForbidVsStream(BatchForbidVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchForbidVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes stream ingest for one or more streams.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Resumes stream ingest for one or more streams.</p>
     * 
     * @param request BatchResumeVsStreamRequest
     * @return BatchResumeVsStreamResponse
     */
    public BatchResumeVsStreamResponse batchResumeVsStream(BatchResumeVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchResumeVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configure multiple domain names in batch.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Configure multiple domain names in batch.</p>
     * 
     * @param request BatchSetVsDomainConfigsRequest
     * @return BatchSetVsDomainConfigsResponse
     */
    public BatchSetVsDomainConfigsResponse batchSetVsDomainConfigs(BatchSetVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Start stream pulling for multiple devices at once.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Start stream pulling for multiple devices at once.</p>
     * 
     * @param request BatchStartDevicesRequest
     * @return BatchStartDevicesResponse
     */
    public BatchStartDevicesResponse batchStartDevices(BatchStartDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts multiple streams.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts multiple streams.</p>
     * 
     * @param request BatchStartStreamsRequest
     * @return BatchStartStreamsResponse
     */
    public BatchStartStreamsResponse batchStartStreams(BatchStartStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStartStreamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops stream pulling for multiple devices.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops stream pulling for multiple devices.</p>
     * 
     * @param request BatchStopDevicesRequest
     * @return BatchStopDevicesResponse
     */
    public BatchStopDevicesResponse batchStopDevices(BatchStopDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops multiple streams in a batch.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops multiple streams in a batch.</p>
     * 
     * @param request BatchStopStreamsRequest
     * @return BatchStopStreamsResponse
     */
    public BatchStopStreamsResponse batchStopStreams(BatchStopStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopStreamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches multiple devices from a folder in bulk.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Detaches multiple devices from a folder in bulk.</p>
     * 
     * @param request BatchUnbindDirectoriesRequest
     * @return BatchUnbindDirectoriesResponse
     */
    public BatchUnbindDirectoriesResponse batchUnbindDirectories(BatchUnbindDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch unbind multiple devices from parent platform push.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Batch unbind multiple devices from parent platform push.</p>
     * 
     * @param request BatchUnbindParentPlatformDevicesRequest
     * @return BatchUnbindParentPlatformDevicesResponse
     */
    public BatchUnbindParentPlatformDevicesResponse batchUnbindParentPlatformDevices(BatchUnbindParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detach multiple purchased devices from a space in a single operation.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Detach multiple purchased devices from a space in a single operation.</p>
     * 
     * @param request BatchUnbindPurchasedDevicesRequest
     * @return BatchUnbindPurchasedDevicesResponse
     */
    public BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevices(BatchUnbindPurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindPurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of TemplateId or TemplateType.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detach a template from multiple specified instances, such as space instances or stream instances.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of TemplateId or TemplateType.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Detach a template from multiple specified instances, such as space instances or stream instances.</p>
     * 
     * @param request BatchUnbindTemplateRequest
     * @return BatchUnbindTemplateResponse
     */
    public BatchUnbindTemplateResponse batchUnbindTemplate(BatchUnbindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind multiple templates simultaneously.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Unbind multiple templates simultaneously.</p>
     * 
     * @param request BatchUnbindTemplatesRequest
     * @return BatchUnbindTemplatesResponse
     */
    public BatchUnbindTemplatesResponse batchUnbindTemplates(BatchUnbindTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchUnbindTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attach a device to a folder.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Attach a device to a folder.</p>
     * 
     * @param request BindDirectoryRequest
     * @return BindDirectoryResponse
     */
    public BindDirectoryResponse bindDirectory(BindDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a device to push streams to a parent platform.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds a device to push streams to a parent platform.</p>
     * 
     * @param request BindParentPlatformDeviceRequest
     * @return BindParentPlatformDeviceResponse
     */
    public BindParentPlatformDeviceResponse bindParentPlatformDevice(BindParentPlatformDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindParentPlatformDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attach purchased devices to a space.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Attach purchased devices to a space.</p>
     * 
     * @param request BindPurchasedDeviceRequest
     * @return BindPurchasedDeviceResponse
     */
    public BindPurchasedDeviceResponse bindPurchasedDevice(BindPurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindPurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a template to a specified instance, such as a group or stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Binds a template to a specified instance, such as a group or stream.</p>
     * 
     * @param request BindTemplateRequest
     * @return BindTemplateResponse
     */
    public BindTemplateResponse bindTemplate(BindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before canceling the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels a Comfy task.</p>
     * 
     * @param request CancelComfyTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelComfyTaskResponse
     */
    public CancelComfyTaskResponse cancelComfyTaskWithOptions(CancelComfyTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelComfyTask"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelComfyTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before canceling the task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels a Comfy task.</p>
     * 
     * @param request CancelComfyTaskRequest
     * @return CancelComfyTaskResponse
     */
    public CancelComfyTaskResponse cancelComfyTask(CancelComfyTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelComfyTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Continuously adjust lens parameters such as aperture and zoom.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Continuously adjust lens parameters such as aperture and zoom.</p>
     * 
     * @param request ContinuousAdjustRequest
     * @return ContinuousAdjustResponse
     */
    public ContinuousAdjustResponse continuousAdjust(ContinuousAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuousAdjustWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rotate the camera continuously by panning, tilting, or zooming.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Rotate the camera continuously by panning, tilting, or zooming.</p>
     * 
     * @param request ContinuousMoveRequest
     * @return ContinuousMoveResponse
     */
    public ContinuousMoveResponse continuousMove(ContinuousMoveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continuousMoveWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must first enable the on-demand screenshot feature in the associated screenshot template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts a Comfy task.</p>
     * 
     * @param request CreateComfyTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComfyTaskResponse
     */
    public CreateComfyTaskResponse createComfyTaskWithOptions(CreateComfyTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userParameters)) {
            query.put("UserParameters", request.userParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComfyTask"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComfyTaskResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must first enable the on-demand screenshot feature in the associated screenshot template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts a Comfy task.</p>
     * 
     * @param request CreateComfyTaskRequest
     * @return CreateComfyTaskResponse
     */
    public CreateComfyTaskResponse createComfyTask(CreateComfyTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComfyTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must specify either a template ID or a template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory for user data.</p>
     * 
     * @param request CreateComfyUserDataDirRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComfyUserDataDirResponse
     */
    public CreateComfyUserDataDirResponse createComfyUserDataDirWithOptions(CreateComfyUserDataDirRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComfyUserDataDir"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComfyUserDataDirResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must specify either a template ID or a template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory for user data.</p>
     * 
     * @param request CreateComfyUserDataDirRequest
     * @return CreateComfyUserDataDirResponse
     */
    public CreateComfyUserDataDirResponse createComfyUserDataDir(CreateComfyUserDataDirRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComfyUserDataDirWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must enable the on-demand screenshot feature in the associated screenshot template before calling this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a Comfy workflow.</p>
     * 
     * @param request CreateComfyWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComfyWorkflowResponse
     */
    public CreateComfyWorkflowResponse createComfyWorkflowWithOptions(CreateComfyWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflow)) {
            query.put("Workflow", request.workflow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComfyWorkflow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComfyWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must enable the on-demand screenshot feature in the associated screenshot template before calling this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a Comfy workflow.</p>
     * 
     * @param request CreateComfyWorkflowRequest
     * @return CreateComfyWorkflowResponse
     */
    public CreateComfyWorkflowResponse createComfyWorkflow(CreateComfyWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComfyWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a new device.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Add a new device.</p>
     * 
     * @param request CreateDeviceRequest
     * @return CreateDeviceResponse
     */
    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reports a device alert.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Reports a device alert.</p>
     * 
     * @param request CreateDeviceAlarmRequest
     * @return CreateDeviceAlarmResponse
     */
    public CreateDeviceAlarmResponse createDeviceAlarm(CreateDeviceAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeviceAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new folder.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Creates a new folder.</p>
     * 
     * @param request CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new workspace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Create a new workspace.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation creates an empty cluster to manage workloads.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
     * 
     * @param request CreateHiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHiveResponse
     */
    public CreateHiveResponse createHiveWithOptions(CreateHiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHive"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHiveResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation creates an empty cluster to manage workloads.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
     * 
     * @param request CreateHiveRequest
     * @return CreateHiveResponse
     */
    public CreateHiveResponse createHive(CreateHiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHiveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a new parent platform.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Adds a new parent platform.</p>
     * 
     * @param request CreateParentPlatformRequest
     * @return CreateParentPlatformResponse
     */
    public CreateParentPlatformResponse createParentPlatform(CreateParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data pack for a cloud application service.</p>
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
     * <p>Creates a data pack for a cloud application service.</p>
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
     * <p>Call CreateRenderingInstance to create a cloud application service instance.</p>
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
     * <p>Call CreateRenderingInstance to create a cloud application service instance.</p>
     * 
     * @param request CreateRenderingInstanceRequest
     * @return CreateRenderingInstanceResponse
     */
    public CreateRenderingInstanceResponse createRenderingInstance(CreateRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can specify a template ID or a template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom gateway.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can specify a template ID or a template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom gateway.</p>
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
     * <p>Creates a cloud application service project and configures its properties, such as session attributes.</p>
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
     * <p>Creates a cloud application service project and configures its properties, such as session attributes.</p>
     * 
     * @param request CreateRenderingProjectRequest
     * @return CreateRenderingProjectResponse
     */
    public CreateRenderingProjectResponse createRenderingProject(CreateRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRenderingProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must first enable the on-demand snapshot feature in the attached snapshot template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an on-demand snapshot for the specified stream.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>You must first enable the on-demand snapshot feature in the attached snapshot template.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an on-demand snapshot for the specified stream.</p>
     * 
     * @param request CreateStreamSnapshotRequest
     * @return CreateStreamSnapshotResponse
     */
    public CreateStreamSnapshotResponse createStreamSnapshot(CreateStreamSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a new template.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Create a new template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>HiveId</strong> 是必填参数，表示要操作的集群ID。</li>
     * <li><strong>InstanceIds</strong> 是必填参数，需要提供一个负载ID列表，用于指定要从集群中解绑的负载实例。</li>
     * <li>解绑操作成功后，会返回成功和失败的负载实例列表及其相关信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>从集群删除负载</p>
     * 
     * @param tmpReq DelHiveEdgeWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelHiveEdgeWorkersResponse
     */
    public DelHiveEdgeWorkersResponse delHiveEdgeWorkersWithOptions(DelHiveEdgeWorkersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DelHiveEdgeWorkersShrinkRequest request = new DelHiveEdgeWorkersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelHiveEdgeWorkers"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelHiveEdgeWorkersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>HiveId</strong> 是必填参数，表示要操作的集群ID。</li>
     * <li><strong>InstanceIds</strong> 是必填参数，需要提供一个负载ID列表，用于指定要从集群中解绑的负载实例。</li>
     * <li>解绑操作成功后，会返回成功和失败的负载实例列表及其相关信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>从集群删除负载</p>
     * 
     * @param request DelHiveEdgeWorkersRequest
     * @return DelHiveEdgeWorkersResponse
     */
    public DelHiveEdgeWorkersResponse delHiveEdgeWorkers(DelHiveEdgeWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delHiveEdgeWorkersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cloud application. You cannot delete a cloud application that is in use.</p>
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
     * <p>Deletes a cloud application. You cannot delete a cloud application that is in use.</p>
     * 
     * @param request DeleteCloudAppRequest
     * @return DeleteCloudAppResponse
     */
    public DeleteCloudAppResponse deleteCloudApp(DeleteCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before you delete a production.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deleting artifacts</p>
     * 
     * @param request DeleteComfyProductionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComfyProductionResponse
     */
    public DeleteComfyProductionResponse deleteComfyProductionWithOptions(DeleteComfyProductionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComfyProduction"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComfyProductionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before you delete a production.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deleting artifacts</p>
     * 
     * @param request DeleteComfyProductionRequest
     * @return DeleteComfyProductionResponse
     */
    public DeleteComfyProductionResponse deleteComfyProduction(DeleteComfyProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComfyProductionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the upper-level platform before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file or directory from user data.</p>
     * 
     * @param request DeleteComfyUserDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComfyUserDataResponse
     */
    public DeleteComfyUserDataResponse deleteComfyUserDataWithOptions(DeleteComfyUserDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComfyUserData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComfyUserDataResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the upper-level platform before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a file or directory from user data.</p>
     * 
     * @param request DeleteComfyUserDataRequest
     * @return DeleteComfyUserDataResponse
     */
    public DeleteComfyUserDataResponse deleteComfyUserData(DeleteComfyUserDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComfyUserDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the parent platform before you can delete the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Comfy workflow.</p>
     * 
     * @param request DeleteComfyWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComfyWorkflowResponse
     */
    public DeleteComfyWorkflowResponse deleteComfyWorkflowWithOptions(DeleteComfyWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComfyWorkflow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComfyWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the parent platform before you can delete the workflow.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a Comfy workflow.</p>
     * 
     * @param request DeleteComfyWorkflowRequest
     * @return DeleteComfyWorkflowResponse
     */
    public DeleteComfyWorkflowResponse deleteComfyWorkflow(DeleteComfyWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComfyWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a device from a space.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a device from a space.</p>
     * 
     * @param request DeleteDeviceRequest
     * @return DeleteDeviceResponse
     */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a folder.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a folder.</p>
     * 
     * @param request DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You cannot delete a file while it is uploading or pre-pushing. After deletion, all related push records become invalid. You can push a file with the same name again.</p>
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
     * <p>You cannot delete a file while it is uploading or pre-pushing. After deletion, all related push records become invalid. You can push a file with the same name again.</p>
     * 
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a workspace.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete a workspace.</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>需要确保该集群内所有应用服务已清空，否则无法执行删除操作。</li>
     * <li><code>HiveId</code> 是必填参数，用于标识待删除的集群。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除集群</p>
     * 
     * @param request DeleteHiveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHiveResponse
     */
    public DeleteHiveResponse deleteHiveWithOptions(DeleteHiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHive"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHiveResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>需要确保该集群内所有应用服务已清空，否则无法执行删除操作。</li>
     * <li><code>HiveId</code> 是必填参数，用于标识待删除的集群。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除集群</p>
     * 
     * @param request DeleteHiveRequest
     * @return DeleteHiveResponse
     */
    public DeleteHiveResponse deleteHive(DeleteHiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHiveWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the parent platform before you delete it.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a parent platform.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>You must stop the parent platform before you delete it.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a parent platform.</p>
     * 
     * @param request DeleteParentPlatformRequest
     * @return DeleteParentPlatformResponse
     */
    public DeleteParentPlatformResponse deleteParentPlatform(DeleteParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a preset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a preset.</p>
     * 
     * @param request DeletePresetRequest
     * @return DeletePresetResponse
     */
    public DeletePresetResponse deletePreset(DeletePresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePresetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified public key. This action automatically revokes logon authorization for all associated cloud application service instances.</p>
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
     * <p>Deletes a specified public key. This action automatically revokes logon authorization for all associated cloud application service instances.</p>
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
     * <p>Deletes the configuration of a cloud application service instance. This operation deletes only module properties that are configured using the UpdateRenderingInstanceConfiguration operation.</p>
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
     * <p>Deletes the configuration of a cloud application service instance. This operation deletes only module properties that are configured using the UpdateRenderingInstanceConfiguration operation.</p>
     * 
     * @param request DeleteRenderingInstanceConfigurationRequest
     * @return DeleteRenderingInstanceConfigurationResponse
     */
    public DeleteRenderingInstanceConfigurationResponse deleteRenderingInstanceConfiguration(DeleteRenderingInstanceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingInstanceConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before you delete the gateway.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom gateway.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Stop the parent platform before you delete the gateway.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom gateway.</p>
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
     * <p>You can call DeleteRenderingInstanceSettings to delete the settings of a cloud application service instance.</p>
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
     * <p>You can call DeleteRenderingInstanceSettings to delete the settings of a cloud application service instance.</p>
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
     * <p>Delete a Data Service Project. Projects that have business scheduling data, such as active sessions, cannot be deleted.</p>
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
     * <p>Delete a Data Service Project. Projects that have business scheduling data, such as active sessions, cannot be deleted.</p>
     * 
     * @param request DeleteRenderingProjectRequest
     * @return DeleteRenderingProjectResponse
     */
    public DeleteRenderingProjectResponse deleteRenderingProject(DeleteRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRenderingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete stream pulling information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Delete stream pulling information.</p>
     * 
     * @param request DeleteVsPullStreamInfoConfigRequest
     * @return DeleteVsPullStreamInfoConfigResponse
     */
    public DeleteVsPullStreamInfoConfigResponse deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the callback configuration for stream ingest.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Deletes the callback configuration for stream ingest.</p>
     * 
     * @param request DeleteVsStreamsNotifyUrlConfigRequest
     * @return DeleteVsStreamsNotifyUrlConfigResponse
     */
    public DeleteVsStreamsNotifyUrlConfigResponse deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query all resource information for an account in a specified region.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query all resource information for an account in a specified region.</p>
     * 
     * @param request DescribeAccountStatRequest
     * @return DescribeAccountStatResponse
     */
    public DescribeAccountStatResponse describeAccountStat(DescribeAccountStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountStatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Screenshot queries do not support pagination and must be performed iteratively. To fetch the next page, use the extStartTime value from the response as the StartTime for your subsequent request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a download link for a production.</p>
     * 
     * @param request DescribeComfyProductionDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyProductionDownloadUrlResponse
     */
    public DescribeComfyProductionDownloadUrlResponse describeComfyProductionDownloadUrlWithOptions(DescribeComfyProductionDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyProductionDownloadUrl"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyProductionDownloadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Screenshot queries do not support pagination and must be performed iteratively. To fetch the next page, use the extStartTime value from the response as the StartTime for your subsequent request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a download link for a production.</p>
     * 
     * @param request DescribeComfyProductionDownloadUrlRequest
     * @return DescribeComfyProductionDownloadUrlResponse
     */
    public DescribeComfyProductionDownloadUrlResponse describeComfyProductionDownloadUrl(DescribeComfyProductionDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyProductionDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API uses pagination. Use the PageNumber and PageSize parameters to navigate through the results.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Lists a user\&quot;s productions.</p>
     * 
     * @param request DescribeComfyProductionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyProductionsResponse
     */
    public DescribeComfyProductionsResponse describeComfyProductionsWithOptions(DescribeComfyProductionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyProductions"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyProductionsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API uses pagination. Use the PageNumber and PageSize parameters to navigate through the results.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Lists a user\&quot;s productions.</p>
     * 
     * @param request DescribeComfyProductionsRequest
     * @return DescribeComfyProductionsResponse
     */
    public DescribeComfyProductionsResponse describeComfyProductions(DescribeComfyProductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyProductionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Querying by screenshot does not support pagination and only supports iteration. To request the next page, use the extStartTime parameter value from the response as the StartTime for the new request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Comfy tasks.</p>
     * 
     * @param request DescribeComfyTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyTasksResponse
     */
    public DescribeComfyTasksResponse describeComfyTasksWithOptions(DescribeComfyTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskState)) {
            query.put("TaskState", request.taskState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyTasks"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyTasksResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Querying by screenshot does not support pagination and only supports iteration. To request the next page, use the extStartTime parameter value from the response as the StartTime for the new request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Comfy tasks.</p>
     * 
     * @param request DescribeComfyTasksRequest
     * @return DescribeComfyTasksResponse
     */
    public DescribeComfyTasksResponse describeComfyTasks(DescribeComfyTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a download URL for user data.</p>
     * 
     * @param request DescribeComfyUserDataDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyUserDataDownloadUrlResponse
     */
    public DescribeComfyUserDataDownloadUrlResponse describeComfyUserDataDownloadUrlWithOptions(DescribeComfyUserDataDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyUserDataDownloadUrl"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyUserDataDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a download URL for user data.</p>
     * 
     * @param request DescribeComfyUserDataDownloadUrlRequest
     * @return DescribeComfyUserDataDownloadUrlResponse
     */
    public DescribeComfyUserDataDownloadUrlResponse describeComfyUserDataDownloadUrl(DescribeComfyUserDataDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyUserDataDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can upload files using the retrieved URL and the Alibaba Cloud OSS software development kit (SDK).</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a URL to upload a user file.</p>
     * 
     * @param request DescribeComfyUserDataUploadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyUserDataUploadUrlResponse
     */
    public DescribeComfyUserDataUploadUrlResponse describeComfyUserDataUploadUrlWithOptions(DescribeComfyUserDataUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            query.put("ContentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileMd5)) {
            query.put("FileMd5", request.fileMd5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSizeBytes)) {
            query.put("FileSizeBytes", request.fileSizeBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyUserDataUploadUrl"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyUserDataUploadUrlResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can upload files using the retrieved URL and the Alibaba Cloud OSS software development kit (SDK).</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a URL to upload a user file.</p>
     * 
     * @param request DescribeComfyUserDataUploadUrlRequest
     * @return DescribeComfyUserDataUploadUrlResponse
     */
    public DescribeComfyUserDataUploadUrlResponse describeComfyUserDataUploadUrl(DescribeComfyUserDataUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyUserDataUploadUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If StartTime and EndTime are not specified, data from the last 24 hours is read by default. To query a specific time range, you must specify both StartTime and EndTime. The maximum time range for a query is 31 days.</p>
     * <ul>
     * <li>You can query multiple domain names in a batch. Separate the domain names with a comma (,).</li>
     * <li>You can retrieve data from the last 90 days.</li>
     * <li>The time granularity is one hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists all files and folders in the user data.</p>
     * 
     * @param request DescribeComfyUserDatasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyUserDatasResponse
     */
    public DescribeComfyUserDatasResponse describeComfyUserDatasWithOptions(DescribeComfyUserDatasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyUserDatas"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyUserDatasResponse());
    }

    /**
     * <b>description</b> :
     * <p>If StartTime and EndTime are not specified, data from the last 24 hours is read by default. To query a specific time range, you must specify both StartTime and EndTime. The maximum time range for a query is 31 days.</p>
     * <ul>
     * <li>You can query multiple domain names in a batch. Separate the domain names with a comma (,).</li>
     * <li>You can retrieve data from the last 90 days.</li>
     * <li>The time granularity is one hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists all files and folders in the user data.</p>
     * 
     * @param request DescribeComfyUserDatasRequest
     * @return DescribeComfyUserDatasResponse
     */
    public DescribeComfyUserDatasResponse describeComfyUserDatas(DescribeComfyUserDatasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyUserDatasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>\&gt; 截图查询目前不支持分页，仅支持按迭代方式。使用返回结果里的extStartTime参数值，作为新请求的StartTime可请求下一页。</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves a paginated list of your Comfy workflows.</p>
     * 
     * @param request DescribeComfyWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComfyWorkflowsResponse
     */
    public DescribeComfyWorkflowsResponse describeComfyWorkflowsWithOptions(DescribeComfyWorkflowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComfyWorkflows"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComfyWorkflowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>\&gt; 截图查询目前不支持分页，仅支持按迭代方式。使用返回结果里的extStartTime参数值，作为新请求的StartTime可请求下一页。</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves a paginated list of your Comfy workflows.</p>
     * 
     * @param request DescribeComfyWorkflowsRequest
     * @return DescribeComfyWorkflowsResponse
     */
    public DescribeComfyWorkflowsResponse describeComfyWorkflows(DescribeComfyWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComfyWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about a device.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query information about a device.</p>
     * 
     * @param request DescribeDeviceRequest
     * @return DescribeDeviceResponse
     */
    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of device channels.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of device channels.</p>
     * 
     * @param request DescribeDeviceChannelsRequest
     * @return DescribeDeviceChannelsResponse
     */
    public DescribeDeviceChannelsResponse describeDeviceChannels(DescribeDeviceChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a device gateway.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a device gateway.</p>
     * 
     * @param request DescribeDeviceGatewayRequest
     * @return DescribeDeviceGatewayResponse
     */
    public DescribeDeviceGatewayResponse describeDeviceGateway(DescribeDeviceGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the URL information for a device stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the URL information for a device stream.</p>
     * 
     * @param request DescribeDeviceURLRequest
     * @return DescribeDeviceURLResponse
     */
    public DescribeDeviceURLResponse describeDeviceURL(DescribeDeviceURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceURLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of devices.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of devices.</p>
     * 
     * @param request DescribeDevicesRequest
     * @return DescribeDevicesResponse
     */
    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of directories.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query the list of directories.</p>
     * 
     * @param request DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a directory.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a directory.</p>
     * 
     * @param request DescribeDirectoryRequest
     * @return DescribeDirectoryResponse
     */
    public DescribeDirectoryResponse describeDirectory(DescribeDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a space.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves information about a space.</p>
     * 
     * @param request DescribeGroupRequest
     * @return DescribeGroupResponse
     */
    public DescribeGroupResponse describeGroup(DescribeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can query the list of spaces.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can query the list of spaces.</p>
     * 
     * @param request DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a parent platform.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries information about a parent platform.</p>
     * 
     * @param request DescribeParentPlatformRequest
     * @return DescribeParentPlatformResponse
     */
    public DescribeParentPlatformResponse describeParentPlatform(DescribeParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of devices under a parent platform.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the list of devices under a parent platform.</p>
     * 
     * @param request DescribeParentPlatformDevicesRequest
     * @return DescribeParentPlatformDevicesResponse
     */
    public DescribeParentPlatformDevicesResponse describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of parent platforms.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query the list of parent platforms.</p>
     * 
     * @param request DescribeParentPlatformsRequest
     * @return DescribeParentPlatformsResponse
     */
    public DescribeParentPlatformsResponse describeParentPlatforms(DescribeParentPlatformsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentPlatformsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of presets.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve the list of presets.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries information about purchased devices.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries information about purchased devices.</p>
     * 
     * @param request DescribePurchasedDeviceRequest
     * @return DescribePurchasedDeviceResponse
     */
    public DescribePurchasedDeviceResponse describePurchasedDevice(DescribePurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of purchased devices.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the list of purchased devices.</p>
     * 
     * @param request DescribePurchasedDevicesRequest
     * @return DescribePurchasedDevicesResponse
     */
    public DescribePurchasedDevicesResponse describePurchasedDevices(DescribePurchasedDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePurchasedDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Paging is not supported for snapshot queries. Only iteration is supported. To request the next page, use the NextStartTime value from the response as the StartTime for the new request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of recordings.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Paging is not supported for snapshot queries. Only iteration is supported. To request the next page, use the NextStartTime value from the response as the StartTime for the new request.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of recordings.</p>
     * 
     * @param request DescribeRecordsRequest
     * @return DescribeRecordsResponse
     */
    public DescribeRecordsResponse describeRecords(DescribeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a cloud application service instance.</p>
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
     * <p>Queries the details of a cloud application service instance.</p>
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
     * <p>Queries the real-time configuration of a cloud application service instance.</p>
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
     * <p>Queries the real-time configuration of a cloud application service instance.</p>
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
     * <p>DescribeRenderingInstanceSettings queries the configuration of a Cloud Application service instance.</p>
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
     * <p>DescribeRenderingInstanceSettings queries the configuration of a Cloud Application service instance.</p>
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
     * <p>Retrieve details about a rendering session, including the current session state, network access IP address and port, and the location of the cloud application service instance.</p>
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
     * <p>Retrieve details about a rendering session, including the current session state, network access IP address and port, and the location of the cloud application service instance.</p>
     * 
     * @param request DescribeRenderingSessionRequest
     * @return DescribeRenderingSessionResponse
     */
    public DescribeRenderingSessionResponse describeRenderingSession(DescribeRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRenderingSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries information about a stream.</p>
     * 
     * @param request DescribeStreamRequest
     * @return DescribeStreamResponse
     */
    public DescribeStreamResponse describeStream(DescribeStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL of a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the URL of a stream.</p>
     * 
     * @param request DescribeStreamURLRequest
     * @return DescribeStreamURLResponse
     */
    public DescribeStreamURLResponse describeStreamURL(DescribeStreamURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamURLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the stream VOD record list, such as historical stream list from NVR.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Get the stream VOD record list, such as historical stream list from NVR.</p>
     * 
     * @param request DescribeStreamVodListRequest
     * @return DescribeStreamVodListResponse
     */
    public DescribeStreamVodListResponse describeStreamVodList(DescribeStreamVodListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamVodListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists video streams. You can filter the results by stream ID, name, group ID, device ID, or other criteria.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists video streams. You can filter the results by stream ID, name, group ID, device ID, or other criteria.</p>
     * 
     * @param request DescribeStreamsRequest
     * @return DescribeStreamsResponse
     */
    public DescribeStreamsResponse describeStreams(DescribeStreamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about a template.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query information about a template.</p>
     * 
     * @param request DescribeTemplateRequest
     * @return DescribeTemplateResponse
     */
    public DescribeTemplateResponse describeTemplate(DescribeTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List templates.</p>
     * 
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
     * <b>summary</b> : 
     * <p>List templates.</p>
     * 
     * @param request DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the URL information of a video-on-demand (VOD) stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the URL information of a video-on-demand (VOD) stream.</p>
     * 
     * @param request DescribeVodStreamURLRequest
     * @return DescribeVodStreamURLResponse
     */
    public DescribeVodStreamURLResponse describeVodStreamURL(DescribeVodStreamURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVodStreamURLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve certificate details.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve certificate details.</p>
     * 
     * @param request DescribeVsCertificateDetailRequest
     * @return DescribeVsCertificateDetailResponse
     */
    public DescribeVsCertificateDetailResponse describeVsCertificateDetail(DescribeVsCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsCertificateDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of domain name certificates.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves a list of domain name certificates.</p>
     * 
     * @param request DescribeVsCertificateListRequest
     * @return DescribeVsCertificateListResponse
     */
    public DescribeVsCertificateListResponse describeVsCertificateList(DescribeVsCertificateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsCertificateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you do not specify \<code>StartTime\\</code> and \<code>EndTime\\</code>, the API retrieves data from the last 24 hours by default. To query data for a specific time range, you must specify both \<code>StartTime\\</code> and \<code>EndTime\\</code>. The maximum time range for a single query is 31 days.</p>
     * <ul>
     * <li>You can query multiple domain names at once. Separate the domain names with commas.</li>
     * <li>You can retrieve data from the last 90 days.</li>
     * <li>The time granularity is one hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves usage data for connected devices.</p>
     * 
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
     * <b>description</b> :
     * <p>If you do not specify \<code>StartTime\\</code> and \<code>EndTime\\</code>, the API retrieves data from the last 24 hours by default. To query data for a specific time range, you must specify both \<code>StartTime\\</code> and \<code>EndTime\\</code>. The maximum time range for a single query is 31 days.</p>
     * <ul>
     * <li>You can query multiple domain names at once. Separate the domain names with commas.</li>
     * <li>You can retrieve data from the last 90 days.</li>
     * <li>The time granularity is one hour.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves usage data for connected devices.</p>
     * 
     * @param request DescribeVsDevicesDataRequest
     * @return DescribeVsDevicesDataResponse
     */
    public DescribeVsDevicesDataResponse describeVsDevicesData(DescribeVsDevicesDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDevicesDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network bandwidth monitoring data for Domain Names.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries network bandwidth monitoring data for Domain Names.</p>
     * 
     * @param request DescribeVsDomainBpsDataRequest
     * @return DescribeVsDomainBpsDataResponse
     */
    public DescribeVsDomainBpsDataResponse describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the certificate information for a specified accelerated domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves the certificate information for a specified accelerated domain name.</p>
     * 
     * @param request DescribeVsDomainCertificateInfoRequest
     * @return DescribeVsDomainCertificateInfoResponse
     */
    public DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainCertificateInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries domain name configurations. You can query the configurations of multiple features in a single request.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries domain name configurations. You can query the configurations of multiple features in a single request.</p>
     * 
     * @param request DescribeVsDomainConfigsRequest
     * @return DescribeVsDomainConfigsResponse
     */
    public DescribeVsDomainConfigsResponse describeVsDomainConfigs(DescribeVsDomainConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the basic configuration information for a specified Visual Edge Computing Service domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Obtains the basic configuration information for a specified Visual Edge Computing Service domain name.</p>
     * 
     * @param request DescribeVsDomainDetailRequest
     * @return DescribeVsDomainDetailResponse
     */
    public DescribeVsDomainDetailResponse describeVsDomainDetail(DescribeVsDomainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the page view (PV) data for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the page view (PV) data for a domain name.</p>
     * 
     * @param request DescribeVsDomainPvDataRequest
     * @return DescribeVsDomainPvDataResponse
     */
    public DescribeVsDomainPvDataResponse describeVsDomainPvData(DescribeVsDomainPvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainPvDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve page view (PV) and unique visitor (UV) data for a Visual Edge Computing Service domain.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve page view (PV) and unique visitor (UV) data for a Visual Edge Computing Service domain.</p>
     * 
     * @param request DescribeVsDomainPvUvDataRequest
     * @return DescribeVsDomainPvUvDataResponse
     */
    public DescribeVsDomainPvUvDataResponse describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainPvUvDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve domain name record data.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve domain name record data.</p>
     * 
     * @param request DescribeVsDomainRecordDataRequest
     * @return DescribeVsDomainRecordDataResponse
     */
    public DescribeVsDomainRecordDataResponse describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainRecordDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves domain region data.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves domain region data.</p>
     * 
     * @param request DescribeVsDomainRegionDataRequest
     * @return DescribeVsDomainRegionDataResponse
     */
    public DescribeVsDomainRegionDataResponse describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainRegionDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query network request monitoring data for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Query network request monitoring data for a domain name.</p>
     * 
     * @param request DescribeVsDomainReqBpsDataRequest
     * @return DescribeVsDomainReqBpsDataResponse
     */
    public DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainReqBpsDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain traffic data for domain name requests.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Obtain traffic data for domain name requests.</p>
     * 
     * @param request DescribeVsDomainReqTrafficDataRequest
     * @return DescribeVsDomainReqTrafficDataResponse
     */
    public DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainReqTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves snapshot data for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves snapshot data for a domain name.</p>
     * 
     * @param request DescribeVsDomainSnapshotDataRequest
     * @return DescribeVsDomainSnapshotDataResponse
     */
    public DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainSnapshotDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve traffic data for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve traffic data for a domain name.</p>
     * 
     * @param request DescribeVsDomainTrafficDataRequest
     * @return DescribeVsDomainTrafficDataResponse
     */
    public DescribeVsDomainTrafficDataResponse describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainTrafficDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve UV data by domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve UV data by domain name.</p>
     * 
     * @param request DescribeVsDomainUvDataRequest
     * @return DescribeVsDomainUvDataResponse
     */
    public DescribeVsDomainUvDataResponse describeVsDomainUvData(DescribeVsDomainUvDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsDomainUvDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pull stream configurations for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the pull stream configurations for a domain name.</p>
     * 
     * @param request DescribeVsPullStreamInfoConfigRequest
     * @return DescribeVsPullStreamInfoConfigResponse
     */
    public DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the stream ingest callback configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the stream ingest callback configuration.</p>
     * 
     * @param request DescribeVsStreamsNotifyUrlConfigRequest
     * @return DescribeVsStreamsNotifyUrlConfigResponse
     */
    public DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about all active streams for a specified domain name or application.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves information about all active streams for a specified domain name or application.</p>
     * 
     * @param request DescribeVsStreamsOnlineListRequest
     * @return DescribeVsStreamsOnlineListResponse
     */
    public DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsOnlineListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve stream ingest records for a domain, an application under that domain, or a specific stream within a specified time range.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieve stream ingest records for a domain, an application under that domain, or a specific stream within a specified time range.</p>
     * 
     * @param request DescribeVsStreamsPublishListRequest
     * @return DescribeVsStreamsPublishListResponse
     */
    public DescribeVsStreamsPublishListResponse describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsStreamsPublishListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a user\&quot;s domain names ranked by traffic.
     * If you do not specify StartTime and EndTime, data for the current month is retrieved by default. To query data over a specific time range, you must specify both StartTime and EndTime.
     * \* You can retrieve data for a maximum of 90 days.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Retrieves a user\&quot;s domain names ranked by traffic.
     * If you do not specify StartTime and EndTime, data for the current month is retrieved by default. To query data over a specific time range, you must specify both StartTime and EndTime.
     * \* You can retrieve data for a maximum of 90 days.</p>
     * 
     * @param request DescribeVsTopDomainsByFlowRequest
     * @return DescribeVsTopDomainsByFlowResponse
     */
    public DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsTopDomainsByFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the daily peak number of concurrent stream ingest operations.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries the daily peak number of concurrent stream ingest operations.</p>
     * 
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
     * <b>summary</b> : 
     * <p>DescribeVsVerifyContent</p>
     * 
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
     * <b>summary</b> : 
     * <p>DescribeVsVerifyContent</p>
     * 
     * @param request DescribeVsVerifyContentRequest
     * @return DescribeVsVerifyContentResponse
     */
    public DescribeVsVerifyContentResponse describeVsVerifyContent(DescribeVsVerifyContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVsVerifyContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociate cloud application service instances from a project.</p>
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
     * <p>Disassociate cloud application service instances from a project.</p>
     * 
     * @param request DisassociateRenderingProjectInstancesRequest
     * @return DisassociateRenderingProjectInstancesResponse
     */
    public DisassociateRenderingProjectInstancesResponse disassociateRenderingProjectInstances(DisassociateRenderingProjectInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateRenderingProjectInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Forbids pushing a specific stream. You can schedule a time to resume the stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Forbids pushing a specific stream. You can schedule a time to resume the stream.</p>
     * 
     * @param request ForbidVsStreamRequest
     * @return ForbidVsStreamResponse
     */
    public ForbidVsStreamResponse forbidVsStream(ForbidVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.forbidVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution status of a control command to determine whether the command was successful and to retrieve the result string.</p>
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
     * <p>Queries the execution status of a control command to determine whether the command was successful and to retrieve the result string.</p>
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
     * <p>Retrieves the streaming connection information for a cloud application service instance. Call this operation before establishing each streaming connection to obtain the latest connection details.</p>
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
     * <p>Retrieves the streaming connection information for a cloud application service instance. Call this operation before establishing each streaming connection to obtain the latest connection details.</p>
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
     * <p>Queries the data volume statistics for the states of project instances that meet specified conditions.</p>
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
     * <p>Queries the data volume statistics for the states of project instances that meet specified conditions.</p>
     * 
     * @param request GetRenderingProjectInstanceStateMetricsRequest
     * @return GetRenderingProjectInstanceStateMetricsResponse
     */
    public GetRenderingProjectInstanceStateMetricsResponse getRenderingProjectInstanceStateMetrics(GetRenderingProjectInstanceStateMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRenderingProjectInstanceStateMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves to a specified preset.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Moves to a specified preset.</p>
     * 
     * @param request GotoPresetRequest
     * @return GotoPresetResponse
     */
    public GotoPresetResponse gotoPreset(GotoPresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.gotoPresetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs a cloud application to a specified cloud application instance. This is an asynchronous interface. To monitor the installation progress, use the ListCloudAppInstallations interface.</p>
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
     * <p>Installs a cloud application to a specified cloud application instance. This is an asynchronous interface. To monitor the installation progress, use the ListCloudAppInstallations interface.</p>
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
     * <p>Lists cloud application installations. The response includes the installation status of cloud application service instances and supports paged queries.</p>
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
     * <p>Lists cloud application installations. The response includes the installation status of cloud application service instances and supports paged queries.</p>
     * 
     * @param request ListCloudAppInstallationsRequest
     * @return ListCloudAppInstallationsResponse
     */
    public ListCloudAppInstallationsResponse listCloudAppInstallations(ListCloudAppInstallationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAppInstallationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of the template ID or the template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of patches for a cloud application.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of the template ID or the template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of patches for a cloud application.</p>
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
     * <p>Queries a list of cloud applications. This operation supports paged queries.</p>
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
     * <p>Queries a list of cloud applications. This operation supports paged queries.</p>
     * 
     * @param request ListCloudAppsRequest
     * @return ListCloudAppsResponse
     */
    public ListCloudAppsResponse listCloudApps(ListCloudAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API queries payload information for cloud application services and supports filtering and paged queries using various parameters.</li>
     * <li>Optional parameters include <code>Spec</code>, <code>Statuses</code>, <code>InstanceIds</code>, <code>PlanIds</code>, and <code>HiveIds</code>.</li>
     * <li>For paged queries, you can use the <code>PageNumber</code> and <code>PageSize</code> parameters to control the amount of data returned. The default page size is 10 records, and the maximum is 100 records.</li>
     * <li>You can specify a time range for the query using the <code>StartTime</code> and <code>EndTime</code> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries payload information for cloud application services. This operation supports paged queries.</p>
     * 
     * @param tmpReq ListEdgeWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEdgeWorkersResponse
     */
    public ListEdgeWorkersResponse listEdgeWorkersWithOptions(ListEdgeWorkersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListEdgeWorkersShrinkRequest request = new ListEdgeWorkersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hiveIds)) {
            request.hiveIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hiveIds, "HiveIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.planIds)) {
            request.planIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.planIds, "PlanIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statuses)) {
            request.statusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statuses, "Statuses", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveIdsShrink)) {
            query.put("HiveIds", request.hiveIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planIdsShrink)) {
            query.put("PlanIds", request.planIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusesShrink)) {
            query.put("Statuses", request.statusesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEdgeWorkers"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEdgeWorkersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API queries payload information for cloud application services and supports filtering and paged queries using various parameters.</li>
     * <li>Optional parameters include <code>Spec</code>, <code>Statuses</code>, <code>InstanceIds</code>, <code>PlanIds</code>, and <code>HiveIds</code>.</li>
     * <li>For paged queries, you can use the <code>PageNumber</code> and <code>PageSize</code> parameters to control the amount of data returned. The default page size is 10 records, and the maximum is 100 records.</li>
     * <li>You can specify a time range for the query using the <code>StartTime</code> and <code>EndTime</code> parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries payload information for cloud application services. This operation supports paged queries.</p>
     * 
     * @param request ListEdgeWorkersRequest
     * @return ListEdgeWorkersResponse
     */
    public ListEdgeWorkersResponse listEdgeWorkers(ListEdgeWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEdgeWorkersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the push status records for a file pushed to cloud application service instances. It supports paged query.</p>
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
     * <p>Lists the push status records for a file pushed to cloud application service instances. It supports paged query.</p>
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
     * <p>Lists uploaded files. The response includes the upload status for each file and supports paged queries.</p>
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
     * <p>Lists uploaded files. The response includes the upload status for each file and supports paged queries.</p>
     * 
     * @param request ListFilesRequest
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于查询用户创建的所有集群信息。</li>
     * <li>支持通过 <code>HiveId</code> 和 <code>Name</code> 参数进行过滤查询。</li>
     * <li>分页参数 <code>PageNumber</code> 和 <code>PageSize</code> 可以控制返回结果的数量和页码，默认每页显示10条记录，最大支持100条。</li>
     * <li><code>StartTime</code> 和 <code>EndTime</code> 参数可用于指定时间范围内的集群信息查询，但非必填项。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询所有集群信息，支持分页查询。</p>
     * 
     * @param request ListHivesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHivesResponse
     */
    public ListHivesResponse listHivesWithOptions(ListHivesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHives"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHivesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于查询用户创建的所有集群信息。</li>
     * <li>支持通过 <code>HiveId</code> 和 <code>Name</code> 参数进行过滤查询。</li>
     * <li>分页参数 <code>PageNumber</code> 和 <code>PageSize</code> 可以控制返回结果的数量和页码，默认每页显示10条记录，最大支持100条。</li>
     * <li><code>StartTime</code> 和 <code>EndTime</code> 参数可用于指定时间范围内的集群信息查询，但非必填项。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询所有集群信息，支持分页查询。</p>
     * 
     * @param request ListHivesRequest
     * @return ListHivesResponse
     */
    public ListHivesResponse listHives(ListHivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHivesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of public keys that match the specified criteria. This operation supports pagination.</p>
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
     * <p>Retrieves a list of public keys that match the specified criteria. This operation supports pagination.</p>
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
     * <p>Queries information about the data packets of cloud applications. Paged queries are supported.</p>
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
     * <p>Queries information about the data packets of cloud applications. Paged queries are supported.</p>
     * 
     * @param request ListRenderingDataPackagesRequest
     * @return ListRenderingDataPackagesResponse
     */
    public ListRenderingDataPackagesResponse listRenderingDataPackages(ListRenderingDataPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingDataPackagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least the template ID or the template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom gateways.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least the template ID or the template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries custom gateways.</p>
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
     * <p>Lists basic information about cloud application service instances and supports paged queries.</p>
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
     * <p>Lists basic information about cloud application service instances and supports paged queries.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation enables you to query cloud application service instances in a project using multiple filter conditions, such as status and instance ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a paginated list of cloud application service instances associated with a project.</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation enables you to query cloud application service instances in a project using multiple filter conditions, such as status and instance ID.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieve a paginated list of cloud application service instances associated with a project.</p>
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
     * <h2>Request details</h2>
     * <ul>
     * <li>This operation returns a paged list of basic information about rendering projects for a specified user.</li>
     * <li>Filter results by <code>ProjectId</code> or <code>ProjectName</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain a paged list of basic information about cloud application projects for the current user.</p>
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
     * <h2>Request details</h2>
     * <ul>
     * <li>This operation returns a paged list of basic information about rendering projects for a specified user.</li>
     * <li>Filter results by <code>ProjectId</code> or <code>ProjectName</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtain a paged list of basic information about cloud application projects for the current user.</p>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API supports filtering and paged query of user rendering session lists with various parameter combinations.</li>
     * <li>You must provide at least one of the <code>SessionId</code> or <code>ClientId</code> parameters. Neither parameter is mandatory independently. If both parameters are provided, a more precise match is performed based on these two parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for the list of cloud application service sessions based on specified conditions.</p>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API supports filtering and paged query of user rendering session lists with various parameter combinations.</li>
     * <li>You must provide at least one of the <code>SessionId</code> or <code>ClientId</code> parameters. Neither parameter is mandatory independently. If both parameters are provided, a more precise match is performed based on these two parameters.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Performs a paged query for the list of cloud application service sessions based on specified conditions.</p>
     * 
     * @param request ListRenderingSessionsRequest
     * @return ListRenderingSessionsResponse
     */
    public ListRenderingSessionsResponse listRenderingSessions(ListRenderingSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRenderingSessionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于查询所有可用的云应用服务规格信息。</li>
     * <li>支持通过 <code>Specification</code> 参数过滤特定规格。</li>
     * <li>分页查询时，可以通过 <code>PageNumber</code> 和 <code>PageSize</code> 参数控制返回的数据量。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询规格信息，支持分页查询。</p>
     * 
     * @param request ListSpecificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSpecificationsResponse
     */
    public ListSpecificationsResponse listSpecificationsWithOptions(ListSpecificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSpecifications"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSpecificationsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于查询所有可用的云应用服务规格信息。</li>
     * <li>支持通过 <code>Specification</code> 参数过滤特定规格。</li>
     * <li>分页查询时，可以通过 <code>PageNumber</code> 和 <code>PageSize</code> 参数控制返回的数据量。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询规格信息，支持分页查询。</p>
     * 
     * @param request ListSpecificationsRequest
     * @return ListSpecificationsResponse
     */
    public ListSpecificationsResponse listSpecifications(ListSpecificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSpecificationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Manages secure logons.</p>
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
     * <p>Manages secure logons.</p>
     * 
     * @param request ManageLoginRequest
     * @return ManageLoginResponse
     */
    public ManageLoginResponse manageLogin(ManageLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manageLoginWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>\&gt; 截图查询目前不支持分页，仅支持按迭代方式。使用返回结果里的extStartTime参数值，作为新请求的StartTime可请求下一页。</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the metadata of a specified workflow.</p>
     * 
     * @param request ModifyComfyWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyComfyWorkflowResponse
     */
    public ModifyComfyWorkflowResponse modifyComfyWorkflowWithOptions(ModifyComfyWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowName)) {
            query.put("WorkflowName", request.workflowName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyComfyWorkflow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyComfyWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>\&gt; 截图查询目前不支持分页，仅支持按迭代方式。使用返回结果里的extStartTime参数值，作为新请求的StartTime可请求下一页。</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the metadata of a specified workflow.</p>
     * 
     * @param request ModifyComfyWorkflowRequest
     * @return ModifyComfyWorkflowResponse
     */
    public ModifyComfyWorkflowResponse modifyComfyWorkflow(ModifyComfyWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyComfyWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update device information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Update device information.</p>
     * 
     * @param request ModifyDeviceRequest
     * @return ModifyDeviceResponse
     */
    public ModifyDeviceResponse modifyDevice(ModifyDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the alarm status of a device.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the alarm status of a device.</p>
     * 
     * @param request ModifyDeviceAlarmRequest
     * @return ModifyDeviceAlarmResponse
     */
    public ModifyDeviceAlarmResponse modifyDeviceAlarm(ModifyDeviceAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the device image capture configuration.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modify the device image capture configuration.</p>
     * 
     * @param request ModifyDeviceCaptureRequest
     * @return ModifyDeviceCaptureResponse
     */
    public ModifyDeviceCaptureResponse modifyDeviceCapture(ModifyDeviceCaptureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceCaptureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the list of channels for a device.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the list of channels for a device.</p>
     * 
     * @param request ModifyDeviceChannelsRequest
     * @return ModifyDeviceChannelsResponse
     */
    public ModifyDeviceChannelsResponse modifyDeviceChannels(ModifyDeviceChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDeviceChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a directory.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modifies the information of a directory.</p>
     * 
     * @param request ModifyDirectoryRequest
     * @return ModifyDirectoryResponse
     */
    public ModifyDirectoryResponse modifyDirectory(ModifyDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can modify the details of a space.</p>
     * 
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
     * <b>summary</b> : 
     * <p>You can modify the details of a space.</p>
     * 
     * @param request ModifyGroupRequest
     * @return ModifyGroupResponse
     */
    public ModifyGroupResponse modifyGroup(ModifyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API modifies the name and/or description of an existing cluster.</li>
     * <li><code>HiveId</code> is a required parameter that identifies the cluster to modify.</li>
     * <li>The <code>Name</code> and <code>Description</code> parameters are optional. You can specify either or both to update the corresponding attributes of the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or description of a specified cluster.</p>
     * 
     * @param request ModifyHiveAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHiveAttributeResponse
     */
    public ModifyHiveAttributeResponse modifyHiveAttributeWithOptions(ModifyHiveAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHiveAttribute"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHiveAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API modifies the name and/or description of an existing cluster.</li>
     * <li><code>HiveId</code> is a required parameter that identifies the cluster to modify.</li>
     * <li>The <code>Name</code> and <code>Description</code> parameters are optional. You can specify either or both to update the corresponding attributes of the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the name or description of a specified cluster.</p>
     * 
     * @param request ModifyHiveAttributeRequest
     * @return ModifyHiveAttributeResponse
     */
    public ModifyHiveAttributeResponse modifyHiveAttribute(ModifyHiveAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHiveAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a parent platform.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modifies the information of a parent platform.</p>
     * 
     * @param request ModifyParentPlatformRequest
     * @return ModifyParentPlatformResponse
     */
    public ModifyParentPlatformResponse modifyParentPlatform(ModifyParentPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParentPlatformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Change the billing method for a Graphic Computing Service instance.</p>
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
     * <p>Change the billing method for a Graphic Computing Service instance.</p>
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
     * <p>Upgrades or downgrades a cloud application service instance.</p>
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
     * <p>Upgrades or downgrades a cloud application service instance.</p>
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
     * <p>Modifies the attributes of a cloud application service instance.</p>
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
     * <p>Modifies the attributes of a cloud application service instance.</p>
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
     * <p>Updates the rate limiting bandwidth for a cloud application service instance. You can call the DescribeRenderingInstance operation to retrieve the current rate limiting value and check the status of the rate limiting update.</p>
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
     * <p>Updates the rate limiting bandwidth for a cloud application service instance. You can call the DescribeRenderingInstance operation to retrieve the current rate limiting value and check the status of the rate limiting update.</p>
     * 
     * @param request ModifyRenderingInstanceBandwidthRequest
     * @return ModifyRenderingInstanceBandwidthResponse
     */
    public ModifyRenderingInstanceBandwidthResponse modifyRenderingInstanceBandwidth(ModifyRenderingInstanceBandwidthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRenderingInstanceBandwidthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies template information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Modifies template information.</p>
     * 
     * @param request ModifyTemplateRequest
     * @return ModifyTemplateResponse
     */
    public ModifyTemplateResponse modifyTemplate(ModifyTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Ensure the target Hive has sufficient resources to accommodate the instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves the specified cloud application service instances from their current cluster to the target Hive.</p>
     * 
     * @param tmpReq MoveHiveEdgeWorkersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveHiveEdgeWorkersResponse
     */
    public MoveHiveEdgeWorkersResponse moveHiveEdgeWorkersWithOptions(MoveHiveEdgeWorkersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MoveHiveEdgeWorkersShrinkRequest request = new MoveHiveEdgeWorkersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hiveId)) {
            query.put("HiveId", request.hiveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveHiveEdgeWorkers"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveHiveEdgeWorkersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Ensure the target Hive has sufficient resources to accommodate the instances.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves the specified cloud application service instances from their current cluster to the target Hive.</p>
     * 
     * @param request MoveHiveEdgeWorkersRequest
     * @return MoveHiveEdgeWorkersResponse
     */
    public MoveHiveEdgeWorkersResponse moveHiveEdgeWorkers(MoveHiveEdgeWorkersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveHiveEdgeWorkersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the service.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Activates the service.</p>
     * @return OpenVsServiceResponse
     */
    public OpenVsServiceResponse openVsService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openVsServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Push a file to a specified cloud application service instance. This is an asynchronous operation. You can query the push progress using the ListFilePushStatuses operation.</p>
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
     * <p>Push a file to a specified cloud application service instance. This is an asynchronous operation. You can query the push progress using the ListFilePushStatuses operation.</p>
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
     * <p>Restarts a cloud application service instance. You can call the DescribeRenderingInstance API to monitor the restart progress.</p>
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
     * <p>Restarts a cloud application service instance. You can call the DescribeRenderingInstance API to monitor the restart progress.</p>
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
     * <p>Restarts the host of a cloud application service instance.</p>
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
     * <p>Restarts the host of a cloud application service instance.</p>
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
     * <p>Recover data to a Graphic Computing Service instance</p>
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
     * <p>Recover data to a Graphic Computing Service instance</p>
     * 
     * @param request RecoverRenderingDataPackageRequest
     * @return RecoverRenderingDataPackageResponse
     */
    public RecoverRenderingDataPackageResponse recoverRenderingDataPackage(RecoverRenderingDataPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverRenderingDataPackageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of the template ID or template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call RefreshRenderingInstanceStreaming to refresh the stream connection for a cloud application service instance.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of the template ID or template type.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Call RefreshRenderingInstanceStreaming to refresh the stream connection for a cloud application service instance.</p>
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
     * <p>Release a cloud application service data pack</p>
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
     * <p>Release a cloud application service data pack</p>
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
     * <p>Invoke ReleaseRenderingInstance to release a Graphic Computing Service application instance.</p>
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
     * <p>Invoke ReleaseRenderingInstance to release a Graphic Computing Service application instance.</p>
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
     * <p>Invoke RenewRenderingInstance to renew a cloud application service instance.</p>
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
     * <p>Invoke RenewRenderingInstance to renew a cloud application service instance.</p>
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
     * <p>Resets a cloud application service instance. You can query the DescribeRenderingInstance interface to obtain the reset progress.</p>
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
     * <p>Resets a cloud application service instance. You can query the DescribeRenderingInstance interface to obtain the reset progress.</p>
     * 
     * @param request ResetRenderingInstanceRequest
     * @return ResetRenderingInstanceResponse
     */
    public ResetRenderingInstanceResponse resetRenderingInstance(ResetRenderingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetRenderingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes pushing for a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Resumes pushing for a stream.</p>
     * 
     * @param request ResumeVsStreamRequest
     * @return ResumeVsStreamResponse
     */
    public ResumeVsStreamResponse resumeVsStream(ResumeVsStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeVsStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends shell control instructions to a cloud application service instance. This operation supports both sync and asynchronous command responses. The sync scenario is not suitable for time-consuming commands. The maximum execution time cannot exceed 30 s. In an asynchronous scenario, you can call the GetRenderingInstanceCommandsStatus operation to query the execution status and result of a command.</p>
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
     * <p>Sends shell control instructions to a cloud application service instance. This operation supports both sync and asynchronous command responses. The sync scenario is not suitable for time-consuming commands. The maximum execution time cannot exceed 30 s. In an asynchronous scenario, you can call the GetRenderingInstanceCommandsStatus operation to query the execution status and result of a command.</p>
     * 
     * @param request SendRenderingInstanceCommandsRequest
     * @return SendRenderingInstanceCommandsResponse
     */
    public SendRenderingInstanceCommandsResponse sendRenderingInstanceCommands(SendRenderingInstanceCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendRenderingInstanceCommandsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set a preset position.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Set a preset position.</p>
     * 
     * @param request SetPresetRequest
     * @return SetPresetResponse
     */
    public SetPresetResponse setPreset(SetPresetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPresetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enable or disable the certificate feature for a domain name.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Enable or disable the certificate feature for a domain name.</p>
     * 
     * @param request SetVsDomainCertificateRequest
     * @return SetVsDomainCertificateResponse
     */
    public SetVsDomainCertificateResponse setVsDomainCertificate(SetVsDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVsDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configure stream ingest callbacks.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Configure stream ingest callbacks.</p>
     * 
     * @param request SetVsStreamsNotifyUrlConfigRequest
     * @return SetVsStreamsNotifyUrlConfigResponse
     */
    public SetVsStreamsNotifyUrlConfigResponse setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each device currently supports only one ingest endpoint. The effect is the same as StartStream.</p>
     * 
     * <b>summary</b> : 
     * <p>Start stream pulling from a device. This action starts all streams on the device.</p>
     * 
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
     * <b>description</b> :
     * <p>Each device currently supports only one ingest endpoint. The effect is the same as StartStream.</p>
     * 
     * <b>summary</b> : 
     * <p>Start stream pulling from a device. This action starts all streams on the device.</p>
     * 
     * @param request StartDeviceRequest
     * @return StartDeviceResponse
     */
    public StartDeviceResponse startDevice(StartDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts interactions with the parent platform, such as registration and keep-alive.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts interactions with the parent platform, such as registration and keep-alive.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li><p>An on-demand record template is required. You must first attach one to the space or stream.</p>
     * </li>
     * <li><p>You can specify a stream in two ways: using its ID or its PlayDomain/App/Name.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts on-demand recording for the specified stream.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li><p>An on-demand record template is required. You must first attach one to the space or stream.</p>
     * </li>
     * <li><p>You can specify a stream in two ways: using its ID or its PlayDomain/App/Name.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts on-demand recording for the specified stream.</p>
     * 
     * @param request StartRecordStreamRequest
     * @return StartRecordStreamResponse
     */
    public StartRecordStreamResponse startRecordStream(StartRecordStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRecordStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Schedules an idle cloud application service instance for the requesting client (ClientId) and starts the service. If the requesting client (ClientId) sends another start request after a successful start and the associated session is in the SessionStartSuspended state, the session is restarted. If the session is in any other state, the session information is returned directly.</p>
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
     * <p>Schedules an idle cloud application service instance for the requesting client (ClientId) and starts the service. If the requesting client (ClientId) sends another start request after a successful start and the associated session is in the SessionStartSuspended state, the session is restarted. If the session is in any other state, the session information is returned directly.</p>
     * 
     * @param request StartRenderingSessionRequest
     * @return StartRenderingSessionResponse
     */
    public StartRenderingSessionResponse startRenderingSession(StartRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRenderingSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Start a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Start a stream.</p>
     * 
     * @param request StartStreamRequest
     * @return StartStreamResponse
     */
    public StartStreamResponse startStream(StartStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts forwarding a stream to an external address.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Starts forwarding a stream to an external address.</p>
     * 
     * @param request StartTransferStreamRequest
     * @return StartTransferStreamResponse
     */
    public StartTransferStreamResponse startTransferStream(StartTransferStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTransferStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops lens adjustments, such as aperture or zoom changes.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops lens adjustments, such as aperture or zoom changes.</p>
     * 
     * @param request StopAdjustRequest
     * @return StopAdjustResponse
     */
    public StopAdjustResponse stopAdjust(StopAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAdjustWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Stops stream pulling for a device. This operation terminates all streams on that device.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops stream pulling for a device. This operation terminates all streams on that device.</p>
     * 
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
     * <b>description</b> :
     * <p>Stops stream pulling for a device. This operation terminates all streams on that device.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops stream pulling for a device. This operation terminates all streams on that device.</p>
     * 
     * @param request StopDeviceRequest
     * @return StopDeviceResponse
     */
    public StopDeviceResponse stopDevice(StopDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops camera movement, such as panning, tilting, and zooming.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops camera movement, such as panning, tilting, and zooming.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can specify a stream by ID or by PlayDomain/App/Name.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Stops on-demand recording for a specified stream.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can specify a stream by ID or by PlayDomain/App/Name.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Stops on-demand recording for a specified stream.</p>
     * 
     * @param request StopRecordStreamRequest
     * @return StopRecordStreamResponse
     */
    public StopRecordStreamResponse stopRecordStream(StopRecordStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRecordStreamWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request information</h2>
     * 
     * <b>summary</b> : 
     * <p>Shut down the specified cloud application service session and revoke the associated instance resources.</p>
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
     * <h2>Request information</h2>
     * 
     * <b>summary</b> : 
     * <p>Shut down the specified cloud application service session and revoke the associated instance resources.</p>
     * 
     * @param request StopRenderingSessionRequest
     * @return StopRenderingSessionResponse
     */
    public StopRenderingSessionResponse stopRenderingSession(StopRenderingSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRenderingSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops a stream.</p>
     * 
     * @param request StopStreamRequest
     * @return StopStreamResponse
     */
    public StopStreamResponse stopStream(StopStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a stream.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Stops a stream.</p>
     * 
     * @param request StopTransferStreamRequest
     * @return StopTransferStreamResponse
     */
    public StopTransferStreamResponse stopTransferStream(StopTransferStreamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTransferStreamWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes platform channel information.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Synchronizes platform channel information.</p>
     * 
     * @param request SyncCatalogsRequest
     * @return SyncCatalogsResponse
     */
    public SyncCatalogsResponse syncCatalogs(SyncCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncCatalogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detach a device from a folder.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Detach a device from a folder.</p>
     * 
     * @param request UnbindDirectoryRequest
     * @return UnbindDirectoryResponse
     */
    public UnbindDirectoryResponse unbindDirectory(UnbindDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dissociates a device from a parent platform push configuration so that the device is no longer pushed.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Dissociates a device from a parent platform push configuration so that the device is no longer pushed.</p>
     * 
     * @param request UnbindParentPlatformDeviceRequest
     * @return UnbindParentPlatformDeviceResponse
     */
    public UnbindParentPlatformDeviceResponse unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindParentPlatformDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a purchased device from a space.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Unbinds a purchased device from a space.</p>
     * 
     * @param request UnbindPurchasedDeviceRequest
     * @return UnbindPurchasedDeviceResponse
     */
    public UnbindPurchasedDeviceResponse unbindPurchasedDevice(UnbindPurchasedDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindPurchasedDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of TemplateId or TemplateType.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unbind a template from a specified instance, such as a group instance or a stream.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Specify at least one of TemplateId or TemplateType.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unbind a template from a specified instance, such as a group instance or a stream.</p>
     * 
     * @param request UnbindTemplateRequest
     * @return UnbindTemplateResponse
     */
    public UnbindTemplateResponse unbindTemplate(UnbindTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can uninstall a specified cloud application from a specified cloud application instance. This operation is asynchronous. You can use the ListCloudAppInstallations operation to check the uninstallation progress. After successful uninstallation, the query operation no longer returns related information.</p>
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
     * <p>You can uninstall a specified cloud application from a specified cloud application instance. This operation is asynchronous. You can use the ListCloudAppInstallations operation to check the uninstallation progress. After successful uninstallation, the query operation no longer returns related information.</p>
     * 
     * @param request UninstallCloudAppRequest
     * @return UninstallCloudAppResponse
     */
    public UninstallCloudAppResponse uninstallCloudApp(UninstallCloudAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallCloudAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlock a device.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Unlock a device.</p>
     * 
     * @param request UnlockDeviceRequest
     * @return UnlockDeviceResponse
     */
    public UnlockDeviceResponse unlockDevice(UnlockDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information for a cloud application, such as its description and tags. You can upload patch or hotfix packages and create hotfix packages for the Android cloud application marketplace. A cloud application supports up to 20 patch packages, but only one package can be in the uploading state at a time.</p>
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
     * <p>Updates information for a cloud application, such as its description and tags. You can upload patch or hotfix packages and create hotfix packages for the Android cloud application marketplace. A cloud application supports up to 20 patch packages, but only one package can be in the uploading state at a time.</p>
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
     * <p>Update basic information for a file, such as its description.</p>
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
     * <p>Update basic information for a file, such as its description.</p>
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
     * <p>This operation updates the configuration parameters of a cloud application service instance. It lets you modify various configurations of the Cloud Android system, such as prop, location, and network, to create a real device simulation.
     * You can retrieve the configured values for the real device simulation by calling the DescribeRenderingInstance API.
     * To query the configuration parameters of the real-time environment, see the DescribeRenderingInstanceConfiguration API.</p>
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
     * <p>This operation updates the configuration parameters of a cloud application service instance. It lets you modify various configurations of the Cloud Android system, such as prop, location, and network, to create a real device simulation.
     * You can retrieve the configured values for the real device simulation by calling the DescribeRenderingInstance API.
     * To query the configuration parameters of the real-time environment, see the DescribeRenderingInstanceConfiguration API.</p>
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
     * <p>Updates the settings of a cloud application service instance.</p>
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
     * <p>Updates the settings of a cloud application service instance.</p>
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
     * <p>Updates a project’s properties.</p>
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
     * <p>Updates a project’s properties.</p>
     * 
     * @param request UpdateRenderingProjectRequest
     * @return UpdateRenderingProjectResponse
     */
    public UpdateRenderingProjectResponse updateRenderingProject(UpdateRenderingProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRenderingProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration for stream pulling. You can modify the start and end times of origin server addresses in an existing stream pulling task.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Updates the configuration for stream pulling. You can modify the start and end times of origin server addresses in an existing stream pulling task.</p>
     * 
     * @param request UpdateVsPullStreamInfoConfigRequest
     * @return UpdateVsPullStreamInfoConfigResponse
     */
    public UpdateVsPullStreamInfoConfigResponse updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upload or list a cloud application package. This is an asynchronous API. Use the ListCloudApps API to check upload progress.</p>
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
     * <p>Upload or list a cloud application package. This is an asynchronous API. Use the ListCloudApps API to check upload progress.</p>
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
     * <p>Uploads a file from a public URL to local or cloud storage. This is an asynchronous operation. You can call the ListFiles operation to monitor the upload progress.</p>
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
     * <p>Uploads a file from a public URL to local or cloud storage. This is an asynchronous operation. You can call the ListFiles operation to monitor the upload progress.</p>
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
     * <p>Upload a new public key.</p>
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
     * <p>Upload a new public key.</p>
     * 
     * @param request UploadPublicKeyRequest
     * @return UploadPublicKeyResponse
     */
    public UploadPublicKeyResponse uploadPublicKey(UploadPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>VerifyVsDomainOwner</p>
     * 
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
     * <b>summary</b> : 
     * <p>VerifyVsDomainOwner</p>
     * 
     * @param request VerifyVsDomainOwnerRequest
     * @return VerifyVsDomainOwnerResponse
     */
    public VerifyVsDomainOwnerResponse verifyVsDomainOwner(VerifyVsDomainOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVsDomainOwnerWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624;

import com.aliyun.tea.*;
import com.aliyun.schedulerx320240624.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("eu-central-1", "schedulerx3.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "schedulerx3.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "schedulerx3.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "schedulerx3.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "schedulerx3.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "schedulerx3.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "schedulerx3.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "schedulerx3.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "schedulerx3.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "schedulerx3.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "schedulerx3.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "schedulerx3.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("schedulerx3", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an app.</p>
     * 
     * @param request CreateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppResponse
     */
    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            body.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLog)) {
            body.put("EnableLog", request.enableLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelRouteStrategy)) {
            body.put("LabelRouteStrategy", request.labelRouteStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApp"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an app.</p>
     * 
     * @param request CreateAppRequest
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a custom calendar for SchedulerX.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom calendar.</p>
     * 
     * @param request CreateCalendarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCalendarResponse
     */
    public CreateCalendarResponse createCalendarWithOptions(CreateCalendarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarName)) {
            body.put("CalendarName", request.calendarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            body.put("Months", request.months);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCalendar"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCalendarResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a custom calendar for SchedulerX.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom calendar.</p>
     * 
     * @param request CreateCalendarRequest
     * @return CreateCalendarResponse
     */
    public CreateCalendarResponse createCalendar(CreateCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCalendarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
     * 
     * @param tmpReq CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterShrinkRequest request = new CreateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitches)) {
            request.vSwitchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitches, "VSwitches", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSpec)) {
            body.put("ClusterSpec", request.clusterSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            body.put("ClusterType", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            body.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchesShrink)) {
            body.put("VSwitches", request.vSwitchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cluster.</p>
     * 
     * @param request CreateClusterRequest
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建自定义联系人</p>
     * 
     * <b>summary</b> : 
     * <p>创建通知联系人</p>
     * 
     * @param request CreateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContactResponse
     */
    public CreateContactResponse createContactWithOptions(CreateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContact"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>创建自定义联系人</p>
     * 
     * <b>summary</b> : 
     * <p>创建通知联系人</p>
     * 
     * @param request CreateContactRequest
     * @return CreateContactResponse
     */
    public CreateContactResponse createContact(CreateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a data source</p>
     * 
     * @param request CreateDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatasourceResponse
     */
    public CreateDatasourceResponse createDatasourceWithOptions(CreateDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionParams)) {
            body.put("ConnectionParams", request.connectionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatasource"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a data source</p>
     * 
     * @param request CreateDatasourceRequest
     * @return CreateDatasourceResponse
     */
    public CreateDatasourceResponse createDatasource(CreateDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>手动导入执行器</p>
     * 
     * <b>summary</b> : 
     * <p>添加执行器组</p>
     * 
     * @param request CreateExecutorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExecutorGroupResponse
     */
    public CreateExecutorGroupResponse createExecutorGroupWithOptions(CreateExecutorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            body.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoScale)) {
            body.put("AutoScale", request.autoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmsWorkspaceId)) {
            body.put("CmsWorkspaceId", request.cmsWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrationType)) {
            body.put("IntegrationType", request.integrationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerType)) {
            body.put("WorkerType", request.workerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workers)) {
            body.put("Workers", request.workers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExecutorGroup"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExecutorGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>手动导入执行器</p>
     * 
     * <b>summary</b> : 
     * <p>添加执行器组</p>
     * 
     * @param request CreateExecutorGroupRequest
     * @return CreateExecutorGroupResponse
     */
    public CreateExecutorGroupResponse createExecutorGroup(CreateExecutorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExecutorGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Imports one or more executors.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports one or more executors.</p>
     * 
     * @param request CreateExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExecutorsResponse
     */
    public CreateExecutorsResponse createExecutorsWithOptions(CreateExecutorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerType)) {
            body.put("WorkerType", request.workerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workers)) {
            body.put("Workers", request.workers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExecutors"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExecutorsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Imports one or more executors.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports one or more executors.</p>
     * 
     * @param request CreateExecutorsRequest
     * @return CreateExecutorsResponse
     */
    public CreateExecutorsResponse createExecutors(CreateExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node.</p>
     * 
     * @param tmpReq CreateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateJobShrinkRequest request = new CreateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.coordinate)) {
            request.coordinateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.coordinate, "Coordinate", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.noticeConfig)) {
            request.noticeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.noticeConfig, "NoticeConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.noticeContacts)) {
            request.noticeContactsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.noticeContacts, "NoticeContacts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attemptInterval)) {
            body.put("AttemptInterval", request.attemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childJobId)) {
            body.put("ChildJobId", request.childJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coordinateShrink)) {
            body.put("Coordinate", request.coordinateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentStrategy)) {
            body.put("DependentStrategy", request.dependentStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorBlockStrategy)) {
            body.put("ExecutorBlockStrategy", request.executorBlockStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobHandler)) {
            body.put("JobHandler", request.jobHandler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttempt)) {
            body.put("MaxAttempt", request.maxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeConfigShrink)) {
            body.put("NoticeConfig", request.noticeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeContactsShrink)) {
            body.put("NoticeContacts", request.noticeContactsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeStrategy)) {
            body.put("RouteStrategy", request.routeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            body.put("Script", request.script);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeType)) {
            body.put("StartTimeType", request.startTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            body.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node.</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param request CreateWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflowWithOptions(CreateWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a workflow.</p>
     * 
     * @param request CreateWorkflowRequest
     * @return CreateWorkflowResponse
     */
    public CreateWorkflowResponse createWorkflow(CreateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an App Group.</p>
     * 
     * @param request DeleteAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApp"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an App Group.</p>
     * 
     * @param request DeleteAppRequest
     * @return DeleteAppResponse
     */
    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified calendar.</p>
     * 
     * @param request DeleteCalendarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCalendarResponse
     */
    public DeleteCalendarResponse deleteCalendarWithOptions(DeleteCalendarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarName)) {
            body.put("CalendarName", request.calendarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCalendar"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCalendarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified calendar.</p>
     * 
     * @param request DeleteCalendarRequest
     * @return DeleteCalendarResponse
     */
    public DeleteCalendarResponse deleteCalendar(DeleteCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCalendarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>删除自定义联系人</p>
     * 
     * <b>summary</b> : 
     * <p>删除通知联系人</p>
     * 
     * @param request DeleteContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContactWithOptions(DeleteContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContact"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>删除自定义联系人</p>
     * 
     * <b>summary</b> : 
     * <p>删除通知联系人</p>
     * 
     * @param request DeleteContactRequest
     * @return DeleteContactResponse
     */
    public DeleteContactResponse deleteContact(DeleteContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete data source</p>
     * 
     * @param request DeleteDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatasourceResponse
     */
    public DeleteDatasourceResponse deleteDatasourceWithOptions(DeleteDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatasource"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete data source</p>
     * 
     * @param request DeleteDatasourceRequest
     * @return DeleteDatasourceResponse
     */
    public DeleteDatasourceResponse deleteDatasource(DeleteDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加执行器组</p>
     * 
     * @param request DeleteExecutorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExecutorGroupResponse
     */
    public DeleteExecutorGroupResponse deleteExecutorGroupWithOptions(DeleteExecutorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExecutorGroup"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExecutorGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加执行器组</p>
     * 
     * @param request DeleteExecutorGroupRequest
     * @return DeleteExecutorGroupResponse
     */
    public DeleteExecutorGroupResponse deleteExecutorGroup(DeleteExecutorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExecutorGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple jobs in a batch.</p>
     * 
     * @param tmpReq DeleteJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobsWithOptions(DeleteJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteJobsShrinkRequest request = new DeleteJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple jobs in a batch.</p>
     * 
     * @param request DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobs(DeleteJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Workflow.</p>
     * 
     * @param request DeleteWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflowWithOptions(DeleteWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteJobs)) {
            body.put("DeleteJobs", request.deleteJobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Workflow.</p>
     * 
     * @param request DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    public DeleteWorkflowResponse deleteWorkflow(DeleteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more workflows.</p>
     * 
     * @param tmpReq DeleteWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkflowsResponse
     */
    public DeleteWorkflowsResponse deleteWorkflowsWithOptions(DeleteWorkflowsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteWorkflowsShrinkRequest request = new DeleteWorkflowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowIds)) {
            request.workflowIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowIds, "WorkflowIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteJobs)) {
            body.put("DeleteJobs", request.deleteJobs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowIdsShrink)) {
            body.put("WorkflowIds", request.workflowIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes one or more workflows.</p>
     * 
     * @param request DeleteWorkflowsRequest
     * @return DeleteWorkflowsResponse
     */
    public DeleteWorkflowsResponse deleteWorkflows(DeleteWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports job information in bulk.</p>
     * 
     * @param tmpReq ExportJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportJobsResponse
     */
    public ExportJobsResponse exportJobsWithOptions(ExportJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportJobsShrinkRequest request = new ExportJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportJobType)) {
            body.put("ExportJobType", request.exportJobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "byte")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports job information in bulk.</p>
     * 
     * @param request ExportJobsRequest
     * @return ExportJobsResponse
     */
    public ExportJobsResponse exportJobs(ExportJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the definitions of one or more Workflows in JSON format. The exported data includes the basic information, all Nodes, and the Directed Acyclic Graph (DAG) dependencies for each Workflow.</p>
     * 
     * @param tmpReq ExportWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportWorkflowsResponse
     */
    public ExportWorkflowsResponse exportWorkflowsWithOptions(ExportWorkflowsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportWorkflowsShrinkRequest request = new ExportWorkflowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowId)) {
            request.workflowIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowId, "WorkflowId", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowIdShrink)) {
            body.put("WorkflowId", request.workflowIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "byte")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the definitions of one or more Workflows in JSON format. The exported data includes the basic information, all Nodes, and the Directed Acyclic Graph (DAG) dependencies for each Workflow.</p>
     * 
     * @param request ExportWorkflowsRequest
     * @return ExportWorkflowsResponse
     */
    public ExportWorkflowsResponse exportWorkflows(ExportWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified application.</p>
     * 
     * @param request GetAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppResponse
     */
    public GetAppResponse getAppWithOptions(GetAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApp"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified application.</p>
     * 
     * @param request GetAppRequest
     * @return GetAppResponse
     */
    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified calendar.</p>
     * 
     * @param request GetCalendarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCalendarResponse
     */
    public GetCalendarResponse getCalendarWithOptions(GetCalendarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarName)) {
            query.put("CalendarName", request.calendarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            query.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCalendar"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCalendarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified calendar.</p>
     * 
     * @param request GetCalendarRequest
     * @return GetCalendarResponse
     */
    public GetCalendarResponse getCalendar(GetCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCalendarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a cluster.</p>
     * 
     * @param request GetClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterResponse
     */
    public GetClusterResponse getClusterWithOptions(GetClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a cluster.</p>
     * 
     * @param request GetClusterRequest
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the designation information for a job.</p>
     * 
     * @param request GetDesigateInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDesigateInfoResponse
     */
    public GetDesigateInfoResponse getDesigateInfoWithOptions(GetDesigateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDesigateInfo"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDesigateInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the designation information for a job.</p>
     * 
     * @param request GetDesigateInfoRequest
     * @return GetDesigateInfoResponse
     */
    public GetDesigateInfoResponse getDesigateInfo(GetDesigateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDesigateInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to extend the Executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>before</strong> the <code>xxl-job-core</code> dependency in the <code>pom.xml</code> file.
     * <strong>For more information, see</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Version Documentation</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the configuration for a specified Executor.</p>
     * 
     * @param request GetExecutorConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecutorConfigResponse
     */
    public GetExecutorConfigResponse getExecutorConfigWithOptions(GetExecutorConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecutorConfig"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecutorConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to extend the Executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>before</strong> the <code>xxl-job-core</code> dependency in the <code>pom.xml</code> file.
     * <strong>For more information, see</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Version Documentation</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the configuration for a specified Executor.</p>
     * 
     * @param request GetExecutorConfigRequest
     * @return GetExecutorConfigResponse
     */
    public GetExecutorConfigResponse getExecutorConfig(GetExecutorConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExecutorConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the details of a Task Execution.</p>
     * 
     * @param request GetJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobExecutionResponse
     */
    public GetJobExecutionResponse getJobExecutionWithOptions(GetJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mseSessionId)) {
            query.put("MseSessionId", request.mseSessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the details of a Task Execution.</p>
     * 
     * @param request GetJobExecutionRequest
     * @return GetJobExecutionResponse
     */
    public GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to enhance the capabilities of the Executor.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in your pom.xml.
     * <strong>See also</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Release Notes</a></p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a sharding task execution.</p>
     * 
     * @param request GetJobExecutionProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobExecutionProgressResponse
     */
    public GetJobExecutionProgressResponse getJobExecutionProgressWithOptions(GetJobExecutionProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobExecutionProgress"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobExecutionProgressResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to enhance the capabilities of the Executor.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in your pom.xml.
     * <strong>See also</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Release Notes</a></p>
     * 
     * <b>summary</b> : 
     * <p>Gets the details of a sharding task execution.</p>
     * 
     * @param request GetJobExecutionProgressRequest
     * @return GetJobExecutionProgressResponse
     */
    public GetJobExecutionProgressResponse getJobExecutionProgress(GetJobExecutionProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobExecutionProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to extend the executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency.
     * <strong>For more information, see</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin versioning documentation</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the thread dump for a specific job execution.</p>
     * 
     * @param request GetJobExecutionThreadDumpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobExecutionThreadDumpResponse
     */
    public GetJobExecutionThreadDumpResponse getJobExecutionThreadDumpWithOptions(GetJobExecutionThreadDumpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobExecutionThreadDump"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobExecutionThreadDumpResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the Enhancement Plugin to your <code>pom.xml</code> file to extend the executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency.
     * <strong>For more information, see</strong>: <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin versioning documentation</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the thread dump for a specific job execution.</p>
     * 
     * @param request GetJobExecutionThreadDumpRequest
     * @return GetJobExecutionThreadDumpResponse
     */
    public GetJobExecutionThreadDumpResponse getJobExecutionThreadDump(GetJobExecutionThreadDumpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobExecutionThreadDumpWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves log entries.</p>
     * 
     * @param request GetLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogResponse
     */
    public GetLogResponse getLogWithOptions(GetLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLog"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves log entries.</p>
     * 
     * @param request GetLogRequest
     * @return GetLogResponse
     */
    public GetLogResponse getLog(GetLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Events.</p>
     * 
     * @param request GetLogEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogEventResponse
     */
    public GetLogEventResponse getLogEventWithOptions(GetLogEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogEvent"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Events.</p>
     * 
     * @param request GetLogEventRequest
     * @return GetLogEventResponse
     */
    public GetLogEventResponse getLogEvent(GetLogEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>获取分页日志</p>
     * 
     * @param request GetPageLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPageLogResponse
     */
    public GetPageLogResponse getPageLogWithOptions(GetPageLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverse)) {
            query.put("Reverse", request.reverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerAddr)) {
            query.put("WorkerAddr", request.workerAddr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPageLog"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPageLogResponse());
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>获取分页日志</p>
     * 
     * @param request GetPageLogRequest
     * @return GetPageLogResponse
     */
    public GetPageLogResponse getPageLog(GetPageLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPageLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information for a specified workflow.</p>
     * 
     * @param request GetWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowResponse
     */
    public GetWorkflowResponse getWorkflowWithOptions(GetWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the basic information for a specified workflow.</p>
     * 
     * @param request GetWorkflowRequest
     * @return GetWorkflowResponse
     */
    public GetWorkflowResponse getWorkflow(GetWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the Directed Acyclic Graph (DAG) of a workflow.</p>
     * 
     * @param request GetWorkflowDAGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowDAGResponse
     */
    public GetWorkflowDAGResponse getWorkflowDAGWithOptions(GetWorkflowDAGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowDAG"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowDAGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the Directed Acyclic Graph (DAG) of a workflow.</p>
     * 
     * @param request GetWorkflowDAGRequest
     * @return GetWorkflowDAGResponse
     */
    public GetWorkflowDAGResponse getWorkflowDAG(GetWorkflowDAGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowDAGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the DAG for a previous workflow version.</p>
     * 
     * @param request GetWorkflowDAGPreviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowDAGPreviewResponse
     */
    public GetWorkflowDAGPreviewResponse getWorkflowDAGPreviewWithOptions(GetWorkflowDAGPreviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            query.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowDAGPreview"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowDAGPreviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the DAG for a previous workflow version.</p>
     * 
     * @param request GetWorkflowDAGPreviewRequest
     * @return GetWorkflowDAGPreviewResponse
     */
    public GetWorkflowDAGPreviewResponse getWorkflowDAGPreview(GetWorkflowDAGPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowDAGPreviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the DAG information for a workflow instance.</p>
     * 
     * @param request GetWorkflowExecutionDAGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkflowExecutionDAGResponse
     */
    public GetWorkflowExecutionDAGResponse getWorkflowExecutionDAGWithOptions(GetWorkflowExecutionDAGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            query.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowExecutionDAG"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowExecutionDAGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the DAG information for a workflow instance.</p>
     * 
     * @param request GetWorkflowExecutionDAGRequest
     * @return GetWorkflowExecutionDAGResponse
     */
    public GetWorkflowExecutionDAGResponse getWorkflowExecutionDAG(GetWorkflowExecutionDAGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkflowExecutionDAGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a calendar.</p>
     * 
     * @param request ImportCalendarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportCalendarResponse
     */
    public ImportCalendarResponse importCalendarWithOptions(ImportCalendarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            body.put("Months", request.months);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportCalendar"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportCalendarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a calendar.</p>
     * 
     * @param request ImportCalendarRequest
     * @return ImportCalendarResponse
     */
    public ImportCalendarResponse importCalendar(ImportCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCalendarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports jobs in bulk.</p>
     * 
     * @param request ImportJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportJobsResponse
     */
    public ImportJobsResponse importJobsWithOptions(ImportJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateApp)) {
            body.put("AutoCreateApp", request.autoCreateApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            body.put("Overwrite", request.overwrite);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports jobs in bulk.</p>
     * 
     * @param request ImportJobsRequest
     * @return ImportJobsResponse
     */
    public ImportJobsResponse importJobs(ImportJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports one or more workflows.</p>
     * 
     * @param request ImportWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportWorkflowsResponse
     */
    public ImportWorkflowsResponse importWorkflowsWithOptions(ImportWorkflowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateApp)) {
            body.put("AutoCreateApp", request.autoCreateApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            body.put("Overwrite", request.overwrite);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports one or more workflows.</p>
     * 
     * @param request ImportWorkflowsRequest
     * @return ImportWorkflowsResponse
     */
    public ImportWorkflowsResponse importWorkflows(ImportWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves alert events.</p>
     * 
     * @param request ListAlarmEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlarmEventResponse
     */
    public ListAlarmEventResponse listAlarmEventWithOptions(ListAlarmEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlarmEvent"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves alert events.</p>
     * 
     * @param request ListAlarmEventRequest
     * @return ListAlarmEventResponse
     */
    public ListAlarmEventResponse listAlarmEvent(ListAlarmEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAlarmEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of application names.</p>
     * 
     * @param request ListAppNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppNamesResponse
     */
    public ListAppNamesResponse listAppNamesWithOptions(ListAppNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppNames"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of application names.</p>
     * 
     * @param request ListAppNamesRequest
     * @return ListAppNamesResponse
     */
    public ListAppNamesResponse listAppNames(ListAppNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppNamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of applications.</p>
     * 
     * @param request ListAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppsResponse
     */
    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApps"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of applications.</p>
     * 
     * @param request ListAppsRequest
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all Calendar names.</p>
     * 
     * @param request ListCalendarNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCalendarNamesResponse
     */
    public ListCalendarNamesResponse listCalendarNamesWithOptions(ListCalendarNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalendarNames"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalendarNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all Calendar names.</p>
     * 
     * @param request ListCalendarNamesRequest
     * @return ListCalendarNamesResponse
     */
    public ListCalendarNamesResponse listCalendarNames(ListCalendarNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalendarNamesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of calendars.</p>
     * 
     * @param request ListCalendarsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCalendarsResponse
     */
    public ListCalendarsResponse listCalendarsWithOptions(ListCalendarsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarName)) {
            query.put("CalendarName", request.calendarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fetchCalendarDetail)) {
            query.put("FetchCalendarDetail", request.fetchCalendarDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            query.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCalendars"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCalendarsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of calendars.</p>
     * 
     * @param request ListCalendarsRequest
     * @return ListCalendarsResponse
     */
    public ListCalendarsResponse listCalendars(ListCalendarsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCalendarsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of instances.</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>查看联系人</p>
     * 
     * <b>summary</b> : 
     * <p>查询通知联系人列表</p>
     * 
     * @param request ListContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContactsResponse
     */
    public ListContactsResponse listContactsWithOptions(ListContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
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
            new TeaPair("action", "ListContacts"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContactsResponse());
    }

    /**
     * <b>description</b> :
     * <p>查看联系人</p>
     * 
     * <b>summary</b> : 
     * <p>查询通知联系人列表</p>
     * 
     * @param request ListContactsRequest
     * @return ListContactsResponse
     */
    public ListContactsResponse listContacts(ListContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the data source list</p>
     * 
     * @param request ListDatasourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatasourcesResponse
     */
    public ListDatasourcesResponse listDatasourcesWithOptions(ListDatasourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatasources"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatasourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the data source list</p>
     * 
     * @param request ListDatasourcesRequest
     * @return ListDatasourcesResponse
     */
    public ListDatasourcesResponse listDatasources(ListDatasourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatasourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>获取执行器组列表</p>
     * 
     * @param request ListExecutorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutorGroupResponse
     */
    public ListExecutorGroupResponse listExecutorGroupWithOptions(ListExecutorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerType)) {
            query.put("WorkerType", request.workerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutorGroup"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutorGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>获取执行器组列表</p>
     * 
     * @param request ListExecutorGroupRequest
     * @return ListExecutorGroupResponse
     */
    public ListExecutorGroupResponse listExecutorGroup(ListExecutorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutorGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists executors.</p>
     * 
     * @param request ListExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutorsResponse
     */
    public ListExecutorsResponse listExecutorsWithOptions(ListExecutorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutors"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists executors.</p>
     * 
     * @param request ListExecutorsRequest
     * @return ListExecutorsResponse
     */
    public ListExecutorsResponse listExecutors(ListExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of task instances.</p>
     * 
     * @param request ListJobExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobExecutionsResponse
     */
    public ListJobExecutionsResponse listJobExecutionsWithOptions(ListJobExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            query.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobExecutions"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a list of task instances.</p>
     * 
     * @param request ListJobExecutionsRequest
     * @return ListJobExecutionsResponse
     */
    public ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the script history for a job.</p>
     * 
     * @param request ListJobScriptHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobScriptHistoryResponse
     */
    public ListJobScriptHistoryResponse listJobScriptHistoryWithOptions(ListJobScriptHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobScriptHistory"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobScriptHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the script history for a job.</p>
     * 
     * @param request ListJobScriptHistoryRequest
     * @return ListJobScriptHistoryResponse
     */
    public ListJobScriptHistoryResponse listJobScriptHistory(ListJobScriptHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobScriptHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a task list.</p>
     * 
     * @param request ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobHandler)) {
            query.put("JobHandler", request.jobHandler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a task list.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the enhancement plugin to your <code>pom.xml</code> file to extend the Executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in your pom.xml file.
     * <strong>For more information:</strong> <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin version release notes</a></p>
     * 
     * <b>summary</b> : 
     * <p>Lists k8s resources.</p>
     * 
     * @param request ListK8sResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListK8sResourceResponse
     */
    public ListK8sResourceResponse listK8sResourceWithOptions(ListK8sResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sClusterId)) {
            query.put("K8sClusterId", request.k8sClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.k8sNamespace)) {
            query.put("K8sNamespace", request.k8sNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListK8sResource"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListK8sResourceResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the enhancement plugin to your <code>pom.xml</code> file to extend the Executor\&quot;s capabilities.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in your pom.xml file.
     * <strong>For more information:</strong> <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin version release notes</a></p>
     * 
     * <b>summary</b> : 
     * <p>Lists k8s resources.</p>
     * 
     * @param request ListK8sResourceRequest
     * @return ListK8sResourceResponse
     */
    public ListK8sResourceResponse listK8sResource(ListK8sResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listK8sResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of labels for an Executor.</p>
     * 
     * @param request ListLablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLablesResponse
     */
    public ListLablesResponse listLablesWithOptions(ListLablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLables"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of labels for an Executor.</p>
     * 
     * @param request ListLablesRequest
     * @return ListLablesResponse
     */
    public ListLablesResponse listLables(ListLablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the zone list.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionZoneResponse
     */
    public ListRegionZoneResponse listRegionZoneWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegionZone"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the zone list.</p>
     * @return ListRegionZoneResponse
     */
    public ListRegionZoneResponse listRegionZone() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionZoneWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the List of all Regions.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain the List of all Regions.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists scheduled events.</p>
     * 
     * @param request ListScheduleEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduleEventResponse
     */
    public ListScheduleEventResponse listScheduleEventWithOptions(ListScheduleEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduleEvent"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduleEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists scheduled events.</p>
     * 
     * @param request ListScheduleEventRequest
     * @return ListScheduleEventResponse
     */
    public ListScheduleEventResponse listScheduleEvent(ListScheduleEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduleEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the next five scheduled times based on the specified time type and time expression.</p>
     * 
     * @param request ListScheduleTimesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduleTimesResponse
     */
    public ListScheduleTimesResponse listScheduleTimesWithOptions(ListScheduleTimesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduleTimes"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduleTimesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the next five scheduled times based on the specified time type and time expression.</p>
     * 
     * @param request ListScheduleTimesRequest
     * @return ListScheduleTimesResponse
     */
    public ListScheduleTimesResponse listScheduleTimes(ListScheduleTimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduleTimesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workflow instances.</p>
     * 
     * @param request ListWorkflowExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowExecutionsResponse
     */
    public ListWorkflowExecutionsResponse listWorkflowExecutionsWithOptions(ListWorkflowExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            query.put("WorkflowExecutionId", request.workflowExecutionId);
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
            new TeaPair("action", "ListWorkflowExecutions"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of workflow instances.</p>
     * 
     * @param request ListWorkflowExecutionsRequest
     * @return ListWorkflowExecutionsResponse
     */
    public ListWorkflowExecutionsResponse listWorkflowExecutions(ListWorkflowExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the versions for a specified workflow.</p>
     * 
     * @param request ListWorkflowVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowVersionsResponse
     */
    public ListWorkflowVersionsResponse listWorkflowVersionsWithOptions(ListWorkflowVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowVersions"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the versions for a specified workflow.</p>
     * 
     * @param request ListWorkflowVersionsRequest
     * @return ListWorkflowVersionsResponse
     */
    public ListWorkflowVersionsResponse listWorkflowVersions(ListWorkflowVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists your workflows.</p>
     * 
     * @param request ListWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflowsWithOptions(ListWorkflowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            query.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists your workflows.</p>
     * 
     * @param request ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    public ListWorkflowsResponse listWorkflows(ListWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Backfills historical data for a specified workflow.</p>
     * 
     * @param request OperateBackfillWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateBackfillWorkflowResponse
     */
    public OperateBackfillWorkflowResponse operateBackfillWorkflowWithOptions(OperateBackfillWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateBackfillWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateBackfillWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Backfills historical data for a specified workflow.</p>
     * 
     * @param request OperateBackfillWorkflowRequest
     * @return OperateBackfillWorkflowResponse
     */
    public OperateBackfillWorkflowResponse operateBackfillWorkflow(OperateBackfillWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateBackfillWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Connect to a data source</p>
     * 
     * @param request OperateConnectDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateConnectDatasourceResponse
     */
    public OperateConnectDatasourceResponse operateConnectDatasourceWithOptions(OperateConnectDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionParams)) {
            body.put("ConnectionParams", request.connectionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateConnectDatasource"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateConnectDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Connect to a data source</p>
     * 
     * @param request OperateConnectDatasourceRequest
     * @return OperateConnectDatasourceResponse
     */
    public OperateConnectDatasourceResponse operateConnectDatasource(OperateConnectDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateConnectDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Designates one or more executors for a job.</p>
     * 
     * @param tmpReq OperateDesignateExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateDesignateExecutorsResponse
     */
    public OperateDesignateExecutorsResponse operateDesignateExecutorsWithOptions(OperateDesignateExecutorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateDesignateExecutorsShrinkRequest request = new OperateDesignateExecutorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addressList)) {
            request.addressListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addressList, "AddressList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressListShrink)) {
            body.put("AddressList", request.addressListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.designateType)) {
            body.put("DesignateType", request.designateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferable)) {
            body.put("Transferable", request.transferable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateDesignateExecutors"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateDesignateExecutorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Designates one or more executors for a job.</p>
     * 
     * @param request OperateDesignateExecutorsRequest
     * @return OperateDesignateExecutorsResponse
     */
    public OperateDesignateExecutorsResponse operateDesignateExecutors(OperateDesignateExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateDesignateExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables multiple jobs.</p>
     * 
     * @param tmpReq OperateDisableJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateDisableJobsResponse
     */
    public OperateDisableJobsResponse operateDisableJobsWithOptions(OperateDisableJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateDisableJobsShrinkRequest request = new OperateDisableJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateDisableJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateDisableJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables multiple jobs.</p>
     * 
     * @param request OperateDisableJobsRequest
     * @return OperateDisableJobsResponse
     */
    public OperateDisableJobsResponse operateDisableJobs(OperateDisableJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateDisableJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables one or more specified workflows.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more workflows.</p>
     * 
     * @param tmpReq OperateDisableWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateDisableWorkflowsResponse
     */
    public OperateDisableWorkflowsResponse operateDisableWorkflowsWithOptions(OperateDisableWorkflowsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateDisableWorkflowsShrinkRequest request = new OperateDisableWorkflowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowIds)) {
            request.workflowIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowIds, "WorkflowIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowIdsShrink)) {
            body.put("WorkflowIds", request.workflowIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateDisableWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateDisableWorkflowsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables one or more specified workflows.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more workflows.</p>
     * 
     * @param request OperateDisableWorkflowsRequest
     * @return OperateDisableWorkflowsResponse
     */
    public OperateDisableWorkflowsResponse operateDisableWorkflows(OperateDisableWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateDisableWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables multiple jobs in a batch.</p>
     * 
     * @param tmpReq OperateEnableJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateEnableJobsResponse
     */
    public OperateEnableJobsResponse operateEnableJobsWithOptions(OperateEnableJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateEnableJobsShrinkRequest request = new OperateEnableJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateEnableJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateEnableJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables multiple jobs in a batch.</p>
     * 
     * @param request OperateEnableJobsRequest
     * @return OperateEnableJobsResponse
     */
    public OperateEnableJobsResponse operateEnableJobs(OperateEnableJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateEnableJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables one or more workflows.</p>
     * 
     * @param tmpReq OperateEnableWorkflowsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateEnableWorkflowsResponse
     */
    public OperateEnableWorkflowsResponse operateEnableWorkflowsWithOptions(OperateEnableWorkflowsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateEnableWorkflowsShrinkRequest request = new OperateEnableWorkflowsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.workflowIds)) {
            request.workflowIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.workflowIds, "WorkflowIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowIdsShrink)) {
            body.put("WorkflowIds", request.workflowIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateEnableWorkflows"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateEnableWorkflowsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables one or more workflows.</p>
     * 
     * @param request OperateEnableWorkflowsRequest
     * @return OperateEnableWorkflowsResponse
     */
    public OperateEnableWorkflowsResponse operateEnableWorkflows(OperateEnableWorkflowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateEnableWorkflowsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a job on demand.</p>
     * 
     * @param request OperateExecuteJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateExecuteJobResponse
     */
    public OperateExecuteJobResponse operateExecuteJobWithOptions(OperateExecuteJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceParameters)) {
            body.put("InstanceParameters", request.instanceParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            body.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worker)) {
            body.put("Worker", request.worker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateExecuteJob"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateExecuteJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes a job on demand.</p>
     * 
     * @param request OperateExecuteJobRequest
     * @return OperateExecuteJobResponse
     */
    public OperateExecuteJobResponse operateExecuteJob(OperateExecuteJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateExecuteJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation starts a new workflow instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a workflow.</p>
     * 
     * @param request OperateExecuteWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateExecuteWorkflowResponse
     */
    public OperateExecuteWorkflowResponse operateExecuteWorkflowWithOptions(OperateExecuteWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateExecuteWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateExecuteWorkflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation starts a new workflow instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes a workflow.</p>
     * 
     * @param request OperateExecuteWorkflowRequest
     * @return OperateExecuteWorkflowResponse
     */
    public OperateExecuteWorkflowResponse operateExecuteWorkflow(OperateExecuteWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateExecuteWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Holds a pending job execution.</p>
     * 
     * @param request OperateHoldJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateHoldJobExecutionResponse
     */
    public OperateHoldJobExecutionResponse operateHoldJobExecutionWithOptions(OperateHoldJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateHoldJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateHoldJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Holds a pending job execution.</p>
     * 
     * @param request OperateHoldJobExecutionRequest
     * @return OperateHoldJobExecutionResponse
     */
    public OperateHoldJobExecutionResponse operateHoldJobExecution(OperateHoldJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateHoldJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Puts a Workflow Execution on hold, suspending all its unexecuted nodes.</p>
     * 
     * @param request OperateHoldWorkflowExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateHoldWorkflowExecutionResponse
     */
    public OperateHoldWorkflowExecutionResponse operateHoldWorkflowExecutionWithOptions(OperateHoldWorkflowExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            body.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateHoldWorkflowExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateHoldWorkflowExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Puts a Workflow Execution on hold, suspending all its unexecuted nodes.</p>
     * 
     * @param request OperateHoldWorkflowExecutionRequest
     * @return OperateHoldWorkflowExecutionResponse
     */
    public OperateHoldWorkflowExecutionResponse operateHoldWorkflowExecution(OperateHoldWorkflowExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateHoldWorkflowExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Marks a job execution as successful.</p>
     * 
     * @param request OperateMarkSuccessJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateMarkSuccessJobExecutionResponse
     */
    public OperateMarkSuccessJobExecutionResponse operateMarkSuccessJobExecutionWithOptions(OperateMarkSuccessJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateMarkSuccessJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateMarkSuccessJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Marks a job execution as successful.</p>
     * 
     * @param request OperateMarkSuccessJobExecutionRequest
     * @return OperateMarkSuccessJobExecutionResponse
     */
    public OperateMarkSuccessJobExecutionResponse operateMarkSuccessJobExecution(OperateMarkSuccessJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateMarkSuccessJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Marks a workflow execution as successful.</p>
     * 
     * @param request OperateMarkSuccessWorkflowExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateMarkSuccessWorkflowExecutionResponse
     */
    public OperateMarkSuccessWorkflowExecutionResponse operateMarkSuccessWorkflowExecutionWithOptions(OperateMarkSuccessWorkflowExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            body.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateMarkSuccessWorkflowExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateMarkSuccessWorkflowExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Marks a workflow execution as successful.</p>
     * 
     * @param request OperateMarkSuccessWorkflowExecutionRequest
     * @return OperateMarkSuccessWorkflowExecutionResponse
     */
    public OperateMarkSuccessWorkflowExecutionResponse operateMarkSuccessWorkflowExecution(OperateMarkSuccessWorkflowExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateMarkSuccessWorkflowExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reruns historical data for a job within a specified time range.</p>
     * 
     * @param request OperateRerunJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateRerunJobResponse
     */
    public OperateRerunJobResponse operateRerunJobWithOptions(OperateRerunJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataTime)) {
            query.put("DataTime", request.dataTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateRerunJob"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateRerunJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reruns historical data for a job within a specified time range.</p>
     * 
     * @param request OperateRerunJobRequest
     * @return OperateRerunJobResponse
     */
    public OperateRerunJobResponse operateRerunJob(OperateRerunJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateRerunJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a failed Job Instance.</p>
     * 
     * @param tmpReq OperateRetryJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateRetryJobExecutionResponse
     */
    public OperateRetryJobExecutionResponse operateRetryJobExecutionWithOptions(OperateRetryJobExecutionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateRetryJobExecutionShrinkRequest request = new OperateRetryJobExecutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskList)) {
            request.taskListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskList, "TaskList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskListShrink)) {
            query.put("TaskList", request.taskListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerChild)) {
            query.put("TriggerChild", request.triggerChild);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateRetryJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateRetryJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a failed Job Instance.</p>
     * 
     * @param request OperateRetryJobExecutionRequest
     * @return OperateRetryJobExecutionResponse
     */
    public OperateRetryJobExecutionResponse operateRetryJobExecution(OperateRetryJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateRetryJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a workflow execution.</p>
     * 
     * @param request OperateRetryWorkflowExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateRetryWorkflowExecutionResponse
     */
    public OperateRetryWorkflowExecutionResponse operateRetryWorkflowExecutionWithOptions(OperateRetryWorkflowExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyFailed)) {
            body.put("OnlyFailed", request.onlyFailed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            body.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateRetryWorkflowExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateRetryWorkflowExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a workflow execution.</p>
     * 
     * @param request OperateRetryWorkflowExecutionRequest
     * @return OperateRetryWorkflowExecutionResponse
     */
    public OperateRetryWorkflowExecutionResponse operateRetryWorkflowExecution(OperateRetryWorkflowExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateRetryWorkflowExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Skips a job execution.</p>
     * 
     * @param request OperateSkipJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateSkipJobExecutionResponse
     */
    public OperateSkipJobExecutionResponse operateSkipJobExecutionWithOptions(OperateSkipJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateSkipJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateSkipJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Skips a job execution.</p>
     * 
     * @param request OperateSkipJobExecutionRequest
     * @return OperateSkipJobExecutionResponse
     */
    public OperateSkipJobExecutionResponse operateSkipJobExecution(OperateSkipJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateSkipJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a running Job Execution.</p>
     * 
     * @param tmpReq OperateStopJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateStopJobExecutionResponse
     */
    public OperateStopJobExecutionResponse operateStopJobExecutionWithOptions(OperateStopJobExecutionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateStopJobExecutionShrinkRequest request = new OperateStopJobExecutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskList)) {
            request.taskListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskList, "TaskList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskListShrink)) {
            query.put("TaskList", request.taskListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateStopJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateStopJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a running Job Execution.</p>
     * 
     * @param request OperateStopJobExecutionRequest
     * @return OperateStopJobExecutionResponse
     */
    public OperateStopJobExecutionResponse operateStopJobExecution(OperateStopJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateStopJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a running workflow execution.</p>
     * 
     * @param request OperateStopWorkflowExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateStopWorkflowExecutionResponse
     */
    public OperateStopWorkflowExecutionResponse operateStopWorkflowExecutionWithOptions(OperateStopWorkflowExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            body.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateStopWorkflowExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateStopWorkflowExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a running workflow execution.</p>
     * 
     * @param request OperateStopWorkflowExecutionRequest
     * @return OperateStopWorkflowExecutionResponse
     */
    public OperateStopWorkflowExecutionResponse operateStopWorkflowExecution(OperateStopWorkflowExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateStopWorkflowExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a Job Execution that is in the Hold state.</p>
     * 
     * @param request OperateUnholdJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateUnholdJobExecutionResponse
     */
    public OperateUnholdJobExecutionResponse operateUnholdJobExecutionWithOptions(OperateUnholdJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateUnholdJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateUnholdJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a Job Execution that is in the Hold state.</p>
     * 
     * @param request OperateUnholdJobExecutionRequest
     * @return OperateUnholdJobExecutionResponse
     */
    public OperateUnholdJobExecutionResponse operateUnholdJobExecution(OperateUnholdJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateUnholdJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a workflow execution that is on hold.</p>
     * 
     * @param request OperateUnholdWorkflowExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateUnholdWorkflowExecutionResponse
     */
    public OperateUnholdWorkflowExecutionResponse operateUnholdWorkflowExecutionWithOptions(OperateUnholdWorkflowExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowExecutionId)) {
            body.put("WorkflowExecutionId", request.workflowExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateUnholdWorkflowExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateUnholdWorkflowExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a workflow execution that is on hold.</p>
     * 
     * @param request OperateUnholdWorkflowExecutionRequest
     * @return OperateUnholdWorkflowExecutionResponse
     */
    public OperateUnholdWorkflowExecutionResponse operateUnholdWorkflowExecution(OperateUnholdWorkflowExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateUnholdWorkflowExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a skipped job execution.</p>
     * 
     * @param request OperateUnskipJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateUnskipJobExecutionResponse
     */
    public OperateUnskipJobExecutionResponse operateUnskipJobExecutionWithOptions(OperateUnskipJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            query.put("JobExecutionId", request.jobExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateUnskipJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateUnskipJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes a skipped job execution.</p>
     * 
     * @param request OperateUnskipJobExecutionRequest
     * @return OperateUnskipJobExecutionResponse
     */
    public OperateUnskipJobExecutionResponse operateUnskipJobExecution(OperateUnskipJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateUnskipJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes jobs.</p>
     * 
     * @param tmpReq SyncJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncJobsResponse
     */
    public SyncJobsResponse syncJobsWithOptions(SyncJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncJobsShrinkRequest request = new SyncJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            body.put("JobIds", request.jobIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalAppName)) {
            body.put("OriginalAppName", request.originalAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalClusterId)) {
            body.put("OriginalClusterId", request.originalClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetAppName)) {
            body.put("TargetAppName", request.targetAppName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetClusterId)) {
            body.put("TargetClusterId", request.targetClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncJobs"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes jobs.</p>
     * 
     * @param request SyncJobsRequest
     * @return SyncJobsResponse
     */
    public SyncJobsResponse syncJobs(SyncJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application group.</p>
     * 
     * @param request UpdateAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessToken)) {
            body.put("AccessToken", request.accessToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLog)) {
            body.put("EnableLog", request.enableLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelRouteStrategy)) {
            body.put("LabelRouteStrategy", request.labelRouteStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerId)) {
            body.put("WorkerId", request.workerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApp"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application group.</p>
     * 
     * @param request UpdateAppRequest
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a calendar.</p>
     * 
     * @param request UpdateCalendarRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCalendarResponse
     */
    public UpdateCalendarResponse updateCalendarWithOptions(UpdateCalendarRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calendarName)) {
            body.put("CalendarName", request.calendarName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incremental)) {
            body.put("Incremental", request.incremental);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            body.put("Months", request.months);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.year)) {
            body.put("Year", request.year);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCalendar"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCalendarResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a calendar.</p>
     * 
     * @param request UpdateCalendarRequest
     * @return UpdateCalendarResponse
     */
    public UpdateCalendarResponse updateCalendar(UpdateCalendarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCalendarWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a cluster.</p>
     * 
     * @param request UpdateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            body.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            body.put("IpWhitelist", request.ipWhitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCluster"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a cluster.</p>
     * 
     * @param request UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>更新通知联系人</p>
     * 
     * <b>summary</b> : 
     * <p>更新通知联系人</p>
     * 
     * @param request UpdateContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContactWithOptions(UpdateContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            body.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContact"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContactResponse());
    }

    /**
     * <b>description</b> :
     * <p>更新通知联系人</p>
     * 
     * <b>summary</b> : 
     * <p>更新通知联系人</p>
     * 
     * @param request UpdateContactRequest
     * @return UpdateContactResponse
     */
    public UpdateContactResponse updateContact(UpdateContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update data source</p>
     * 
     * @param request UpdateDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatasourceResponse
     */
    public UpdateDatasourceResponse updateDatasourceWithOptions(UpdateDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionParams)) {
            body.put("ConnectionParams", request.connectionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDatasource"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update data source</p>
     * 
     * @param request UpdateDatasourceRequest
     * @return UpdateDatasourceResponse
     */
    public UpdateDatasourceResponse updateDatasource(UpdateDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>更新执行器组</p>
     * 
     * @param request UpdateExecutorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExecutorGroupResponse
     */
    public UpdateExecutorGroupResponse updateExecutorGroupWithOptions(UpdateExecutorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            body.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            body.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoScale)) {
            body.put("AutoScale", request.autoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmsWorkspaceId)) {
            body.put("CmsWorkspaceId", request.cmsWorkspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("Network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerType)) {
            body.put("WorkerType", request.workerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workers)) {
            body.put("Workers", request.workers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExecutorGroup"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExecutorGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h1>引入增强插件</h1>
     * <p>在<code>pom.xml</code>文件中添加增强插件以提升Executor的能力。
     * <strong>注意</strong>：请确保该插件在pom中放置在<code>xxl-job-core</code> 依赖的<strong>上方</strong>。
     * <strong>详细信息请参考</strong>：<a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">插件版本说明文档</a></p>
     * 
     * <b>summary</b> : 
     * <p>更新执行器组</p>
     * 
     * @param request UpdateExecutorGroupRequest
     * @return UpdateExecutorGroupResponse
     */
    public UpdateExecutorGroupResponse updateExecutorGroup(UpdateExecutorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExecutorGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the enhancement plugin to the <code>pom.xml</code> file to extend the capabilities of the Executor.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in the pom.xml file.
     * <strong>For more information, see the</strong> <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Version Description Document</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of one or more Executors.</p>
     * 
     * @param request UpdateExecutorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExecutorsResponse
     */
    public UpdateExecutorsResponse updateExecutorsWithOptions(UpdateExecutorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerType)) {
            body.put("WorkerType", request.workerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workers)) {
            body.put("Workers", request.workers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExecutors"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExecutorsResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Add the enhancement plugin</h1>
     * <p>Add the enhancement plugin to the <code>pom.xml</code> file to extend the capabilities of the Executor.
     * <strong>Note</strong>: Place this plugin <strong>above</strong> the <code>xxl-job-core</code> dependency in the pom.xml file.
     * <strong>For more information, see the</strong> <a href="https://help.aliyun.com/zh/schedulerx/schedulerx-xxljob/product-overview/plugin-version-description">Plugin Version Description Document</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of one or more Executors.</p>
     * 
     * @param request UpdateExecutorsRequest
     * @return UpdateExecutorsResponse
     */
    public UpdateExecutorsResponse updateExecutors(UpdateExecutorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExecutorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates node information.</p>
     * 
     * @param tmpReq UpdateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateJobShrinkRequest request = new UpdateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.noticeConfig)) {
            request.noticeConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.noticeConfig, "NoticeConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.noticeContacts)) {
            request.noticeContactsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.noticeContacts, "NoticeContacts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attemptInterval)) {
            body.put("AttemptInterval", request.attemptInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childJobId)) {
            body.put("ChildJobId", request.childJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependentStrategy)) {
            body.put("DependentStrategy", request.dependentStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorBlockStrategy)) {
            body.put("ExecutorBlockStrategy", request.executorBlockStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobHandler)) {
            body.put("JobHandler", request.jobHandler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAttempt)) {
            body.put("MaxAttempt", request.maxAttempt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeConfigShrink)) {
            body.put("NoticeConfig", request.noticeConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeContactsShrink)) {
            body.put("NoticeContacts", request.noticeContactsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            body.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeStrategy)) {
            body.put("RouteStrategy", request.routeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            body.put("Script", request.script);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeType)) {
            body.put("StartTimeType", request.startTimeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weight)) {
            body.put("Weight", request.weight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XAttrs)) {
            body.put("XAttrs", request.XAttrs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJob"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates node information.</p>
     * 
     * @param request UpdateJobRequest
     * @return UpdateJobResponse
     */
    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update task instance</p>
     * 
     * @param request UpdateJobExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobExecutionResponse
     */
    public UpdateJobExecutionResponse updateJobExecutionWithOptions(UpdateJobExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobExecutionId)) {
            body.put("JobExecutionId", request.jobExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleTime)) {
            body.put("ScheduleTime", request.scheduleTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJobExecution"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update task instance</p>
     * 
     * @param request UpdateJobExecutionRequest
     * @return UpdateJobExecutionResponse
     */
    public UpdateJobExecutionResponse updateJobExecution(UpdateJobExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateJobExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a job script.</p>
     * 
     * @param request UpdateJobScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateJobScriptResponse
     */
    public UpdateJobScriptResponse updateJobScriptWithOptions(UpdateJobScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptContent)) {
            body.put("ScriptContent", request.scriptContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionDescription)) {
            body.put("VersionDescription", request.versionDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateJobScript"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateJobScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a job script.</p>
     * 
     * @param request UpdateJobScriptRequest
     * @return UpdateJobScriptResponse
     */
    public UpdateJobScriptResponse updateJobScript(UpdateJobScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateJobScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an existing workflow.</p>
     * 
     * @param request UpdateWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflowWithOptions(UpdateWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calendar)) {
            body.put("Calendar", request.calendar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConcurrency)) {
            body.put("MaxConcurrency", request.maxConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeExpression)) {
            body.put("TimeExpression", request.timeExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeType)) {
            body.put("TimeType", request.timeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timezone)) {
            body.put("Timezone", request.timezone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflow"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an existing workflow.</p>
     * 
     * @param request UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    public UpdateWorkflowResponse updateWorkflow(UpdateWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workflow\&quot;s Directed Acyclic Graph (DAG), including node coordinates and edges.</p>
     * 
     * @param tmpReq UpdateWorkflowDAGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowDAGResponse
     */
    public UpdateWorkflowDAGResponse updateWorkflowDAGWithOptions(UpdateWorkflowDAGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkflowDAGShrinkRequest request = new UpdateWorkflowDAGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dag)) {
            request.dagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dag, "Dag", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagShrink)) {
            body.put("Dag", request.dagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            body.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowDAG"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowDAGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workflow\&quot;s Directed Acyclic Graph (DAG), including node coordinates and edges.</p>
     * 
     * @param request UpdateWorkflowDAGRequest
     * @return UpdateWorkflowDAGResponse
     */
    public UpdateWorkflowDAGResponse updateWorkflowDAG(UpdateWorkflowDAGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowDAGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Directed Acyclic Graph (DAG) version for a Workflow.</p>
     * 
     * @param request UpdateWorkflowDAGVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkflowDAGVersionResponse
     */
    public UpdateWorkflowDAGVersionResponse updateWorkflowDAGVersionWithOptions(UpdateWorkflowDAGVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            body.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowId)) {
            body.put("WorkflowId", request.workflowId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowDAGVersion"),
            new TeaPair("version", "2024-06-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowDAGVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the Directed Acyclic Graph (DAG) version for a Workflow.</p>
     * 
     * @param request UpdateWorkflowDAGVersionRequest
     * @return UpdateWorkflowDAGVersionResponse
     */
    public UpdateWorkflowDAGVersionResponse updateWorkflowDAGVersion(UpdateWorkflowDAGVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkflowDAGVersionWithOptions(request, runtime);
    }
}

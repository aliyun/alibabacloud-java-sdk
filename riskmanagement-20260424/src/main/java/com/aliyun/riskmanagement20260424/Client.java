// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424;

import com.aliyun.tea.*;
import com.aliyun.riskmanagement20260424.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("riskmanagement", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>sas-绑定授权到机器</p>
     * 
     * @param tmpReq BindAuthToMachineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAuthToMachineResponse
     */
    public BindAuthToMachineResponse bindAuthToMachineWithOptions(BindAuthToMachineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindAuthToMachineShrinkRequest request = new BindAuthToMachineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAuthToMachine"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAuthToMachineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-绑定授权到机器</p>
     * 
     * @param request BindAuthToMachineRequest
     * @return BindAuthToMachineResponse
     */
    public BindAuthToMachineResponse bindAuthToMachine(BindAuthToMachineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAuthToMachineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-初始化云安全中心模块规则</p>
     * 
     * @param tmpReq CreateSasTrialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSasTrialResponse
     */
    public CreateSasTrialResponse createSasTrialWithOptions(CreateSasTrialRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSasTrialShrinkRequest request = new CreateSasTrialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSasTrial"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSasTrialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-初始化云安全中心模块规则</p>
     * 
     * @param request CreateSasTrialRequest
     * @return CreateSasTrialResponse
     */
    public CreateSasTrialResponse createSasTrial(CreateSasTrialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSasTrialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-创建服务关联角色</p>
     * 
     * @param tmpReq CreateServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateServiceLinkedRoleShrinkRequest request = new CreateServiceLinkedRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-创建服务关联角色</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建全盘扫描任务</p>
     * 
     * @param request CreateVirusScanOnceTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirusScanOnceTaskResponse
     */
    public CreateVirusScanOnceTaskResponse createVirusScanOnceTaskWithOptions(CreateVirusScanOnceTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirusScanOnceTask"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirusScanOnceTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建全盘扫描任务</p>
     * 
     * @param request CreateVirusScanOnceTaskRequest
     * @return CreateVirusScanOnceTaskResponse
     */
    public CreateVirusScanOnceTaskResponse createVirusScanOnceTask(CreateVirusScanOnceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirusScanOnceTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询云安全中心实例列表</p>
     * 
     * @param tmpReq DescribeCloudCenterInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudCenterInstancesResponse
     */
    public DescribeCloudCenterInstancesResponse describeCloudCenterInstancesWithOptions(DescribeCloudCenterInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCloudCenterInstancesShrinkRequest request = new DescribeCloudCenterInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudCenterInstances"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudCenterInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询云安全中心实例列表</p>
     * 
     * @param request DescribeCloudCenterInstancesRequest
     * @return DescribeCloudCenterInstancesResponse
     */
    public DescribeCloudCenterInstancesResponse describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudCenterInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询服务关联角色状态</p>
     * 
     * @param tmpReq DescribeServiceLinkedRoleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    public DescribeServiceLinkedRoleStatusResponse describeServiceLinkedRoleStatusWithOptions(DescribeServiceLinkedRoleStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeServiceLinkedRoleStatusShrinkRequest request = new DescribeServiceLinkedRoleStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceLinkedRoleStatus"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServiceLinkedRoleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询服务关联角色状态</p>
     * 
     * @param request DescribeServiceLinkedRoleStatusRequest
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    public DescribeServiceLinkedRoleStatusResponse describeServiceLinkedRoleStatus(DescribeServiceLinkedRoleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServiceLinkedRoleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询安全告警事件</p>
     * 
     * @param tmpReq DescribeSuspEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSuspEventsShrinkRequest request = new DescribeSuspEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEvents"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查询安全告警事件</p>
     * 
     * @param request DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查看已购买的云安全中心实例的版本详情</p>
     * 
     * @param tmpReq DescribeVersionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVersionConfigResponse
     */
    public DescribeVersionConfigResponse describeVersionConfigWithOptions(DescribeVersionConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeVersionConfigShrinkRequest request = new DescribeVersionConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVersionConfig"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-查看已购买的云安全中心实例的版本详情</p>
     * 
     * @param request DescribeVersionConfigRequest
     * @return DescribeVersionConfigResponse
     */
    public DescribeVersionConfigResponse describeVersionConfig(DescribeVersionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVersionConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取告警记录分析结果</p>
     * 
     * @param tmpReq GetAlertRecordAnalysisResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlertRecordAnalysisResultResponse
     */
    public GetAlertRecordAnalysisResultResponse getAlertRecordAnalysisResultWithOptions(GetAlertRecordAnalysisResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAlertRecordAnalysisResultShrinkRequest request = new GetAlertRecordAnalysisResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uniqueTagList)) {
            request.uniqueTagListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uniqueTagList, "UniqueTagList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmUniqueInfo)) {
            query.put("AlarmUniqueInfo", request.alarmUniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueInfo)) {
            query.put("UniqueInfo", request.uniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueTagListShrink)) {
            query.put("UniqueTagList", request.uniqueTagListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlertRecordAnalysisResult"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlertRecordAnalysisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取告警记录分析结果</p>
     * 
     * @param request GetAlertRecordAnalysisResultRequest
     * @return GetAlertRecordAnalysisResultResponse
     */
    public GetAlertRecordAnalysisResultResponse getAlertRecordAnalysisResult(GetAlertRecordAnalysisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlertRecordAnalysisResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用云安全中心部分接口</p>
     * 
     * @param tmpReq GetAliYunSafeCenterResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAliYunSafeCenterResultResponse
     */
    public GetAliYunSafeCenterResultResponse getAliYunSafeCenterResultWithOptions(GetAliYunSafeCenterResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAliYunSafeCenterResultShrinkRequest request = new GetAliYunSafeCenterResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createSimilarSecurityEventsQueryTaskRequest)) {
            request.createSimilarSecurityEventsQueryTaskRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createSimilarSecurityEventsQueryTaskRequest, "CreateSimilarSecurityEventsQueryTaskRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.describeInstancesFullStatusRequest)) {
            request.describeInstancesFullStatusRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.describeInstancesFullStatusRequest, "DescribeInstancesFullStatusRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.describeSecurityEventOperationStatusRequest)) {
            request.describeSecurityEventOperationStatusRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.describeSecurityEventOperationStatusRequest, "DescribeSecurityEventOperationStatusRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.describeSimilarSecurityEventsRequest)) {
            request.describeSimilarSecurityEventsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.describeSimilarSecurityEventsRequest, "DescribeSimilarSecurityEventsRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.getAssetDetailByUuidRequest)) {
            request.getAssetDetailByUuidRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.getAssetDetailByUuidRequest, "GetAssetDetailByUuidRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.handleSecurityEventsRequest)) {
            request.handleSecurityEventsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.handleSecurityEventsRequest, "HandleSecurityEventsRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.handleSimilarSecurityEventsRequest)) {
            request.handleSimilarSecurityEventsRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.handleSimilarSecurityEventsRequest, "HandleSimilarSecurityEventsRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listInstancesRequest)) {
            request.listInstancesRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listInstancesRequest, "ListInstancesRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createSimilarSecurityEventsQueryTaskRequestShrink)) {
            query.put("CreateSimilarSecurityEventsQueryTaskRequest", request.createSimilarSecurityEventsQueryTaskRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeInstancesFullStatusRequestShrink)) {
            query.put("DescribeInstancesFullStatusRequest", request.describeInstancesFullStatusRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeSecurityEventOperationStatusRequestShrink)) {
            query.put("DescribeSecurityEventOperationStatusRequest", request.describeSecurityEventOperationStatusRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeSimilarSecurityEventsRequestShrink)) {
            query.put("DescribeSimilarSecurityEventsRequest", request.describeSimilarSecurityEventsRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getAssetDetailByUuidRequestShrink)) {
            query.put("GetAssetDetailByUuidRequest", request.getAssetDetailByUuidRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handleSecurityEventsRequestShrink)) {
            query.put("HandleSecurityEventsRequest", request.handleSecurityEventsRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handleSimilarSecurityEventsRequestShrink)) {
            query.put("HandleSimilarSecurityEventsRequest", request.handleSimilarSecurityEventsRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interfaceCode)) {
            query.put("InterfaceCode", request.interfaceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listInstancesRequestShrink)) {
            query.put("ListInstancesRequest", request.listInstancesRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliYunSafeCenterResult"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliYunSafeCenterResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用云安全中心部分接口</p>
     * 
     * @param request GetAliYunSafeCenterResultRequest
     * @return GetAliYunSafeCenterResultResponse
     */
    public GetAliYunSafeCenterResultResponse getAliYunSafeCenterResult(GetAliYunSafeCenterResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAliYunSafeCenterResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-获取能否试用</p>
     * 
     * @param tmpReq GetCanTrySasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCanTrySasResponse
     */
    public GetCanTrySasResponse getCanTrySasWithOptions(GetCanTrySasRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCanTrySasShrinkRequest request = new GetCanTrySasShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCanTrySas"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCanTrySasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-获取能否试用</p>
     * 
     * @param request GetCanTrySasRequest
     * @return GetCanTrySasResponse
     */
    public GetCanTrySasResponse getCanTrySas(GetCanTrySasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCanTrySasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全合规包id</p>
     * 
     * @param request GetCompliancePackIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompliancePackIdResponse
     */
    public GetCompliancePackIdResponse getCompliancePackIdWithOptions(GetCompliancePackIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompliancePackId"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompliancePackIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全合规包id</p>
     * 
     * @param request GetCompliancePackIdRequest
     * @return GetCompliancePackIdResponse
     */
    public GetCompliancePackIdResponse getCompliancePackId(GetCompliancePackIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一键处置赋权状态</p>
     * 
     * @param request GetDisposalToolStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDisposalToolStatusResponse
     */
    public GetDisposalToolStatusResponse getDisposalToolStatusWithOptions(GetDisposalToolStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDisposalToolStatus"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDisposalToolStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一键处置赋权状态</p>
     * 
     * @param request GetDisposalToolStatusRequest
     * @return GetDisposalToolStatusResponse
     */
    public GetDisposalToolStatusResponse getDisposalToolStatus(GetDisposalToolStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDisposalToolStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户确认安全联系人记录</p>
     * 
     * @param request GetNotificationClickRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotificationClickRecordResponse
     */
    public GetNotificationClickRecordResponse getNotificationClickRecordWithOptions(GetNotificationClickRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotificationClickRecord"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotificationClickRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户确认安全联系人记录</p>
     * 
     * @param request GetNotificationClickRecordRequest
     * @return GetNotificationClickRecordResponse
     */
    public GetNotificationClickRecordResponse getNotificationClickRecord(GetNotificationClickRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotificationClickRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全联系人全部信息</p>
     * 
     * @param request GetNotificationContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotificationContactsResponse
     */
    public GetNotificationContactsResponse getNotificationContactsWithOptions(GetNotificationContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotificationContacts"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotificationContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全联系人全部信息</p>
     * 
     * @param request GetNotificationContactsRequest
     * @return GetNotificationContactsResponse
     */
    public GetNotificationContactsResponse getNotificationContacts(GetNotificationContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotificationContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全联系人待处理数</p>
     * 
     * @param request GetNotificationPendNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNotificationPendNumberResponse
     */
    public GetNotificationPendNumberResponse getNotificationPendNumberWithOptions(GetNotificationPendNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotificationPendNumber"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotificationPendNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全联系人待处理数</p>
     * 
     * @param request GetNotificationPendNumberRequest
     * @return GetNotificationPendNumberResponse
     */
    public GetNotificationPendNumberResponse getNotificationPendNumber(GetNotificationPendNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNotificationPendNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源管控事件详情</p>
     * 
     * @param tmpReq GetResourceControlEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceControlEventResponse
     */
    public GetResourceControlEventResponse getResourceControlEventWithOptions(GetResourceControlEventRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceControlEventShrinkRequest request = new GetResourceControlEventShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventIdList)) {
            request.eventIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventIdList, "EventIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIdListShrink)) {
            query.put("EventIdList", request.eventIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceControlEvent"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceControlEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源管控事件详情</p>
     * 
     * @param request GetResourceControlEventRequest
     * @return GetResourceControlEventResponse
     */
    public GetResourceControlEventResponse getResourceControlEvent(GetResourceControlEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceControlEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全体检基础信息</p>
     * 
     * @param request GetSecurityCheckBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityCheckBaseInfoResponse
     */
    public GetSecurityCheckBaseInfoResponse getSecurityCheckBaseInfoWithOptions(GetSecurityCheckBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecurityCheckBaseInfo"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityCheckBaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全体检基础信息</p>
     * 
     * @param request GetSecurityCheckBaseInfoRequest
     * @return GetSecurityCheckBaseInfoResponse
     */
    public GetSecurityCheckBaseInfoResponse getSecurityCheckBaseInfo(GetSecurityCheckBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityCheckBaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全检查结果基础信息</p>
     * 
     * @param request GetSecurityCheckResultBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityCheckResultBaseInfoResponse
     */
    public GetSecurityCheckResultBaseInfoResponse getSecurityCheckResultBaseInfoWithOptions(GetSecurityCheckResultBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecurityCheckResultBaseInfo"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityCheckResultBaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全检查结果基础信息</p>
     * 
     * @param request GetSecurityCheckResultBaseInfoRequest
     * @return GetSecurityCheckResultBaseInfoResponse
     */
    public GetSecurityCheckResultBaseInfoResponse getSecurityCheckResultBaseInfo(GetSecurityCheckResultBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityCheckResultBaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全优化建议列表</p>
     * 
     * @param tmpReq GetSecuritySuggestionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecuritySuggestionListResponse
     */
    public GetSecuritySuggestionListResponse getSecuritySuggestionListWithOptions(GetSecuritySuggestionListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSecuritySuggestionListShrinkRequest request = new GetSecuritySuggestionListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listConfigRulesRequest)) {
            request.listConfigRulesRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listConfigRulesRequest, "ListConfigRulesRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listConfigRulesRequestShrink)) {
            query.put("ListConfigRulesRequest", request.listConfigRulesRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecuritySuggestionList"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecuritySuggestionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全优化建议列表</p>
     * 
     * @param request GetSecuritySuggestionListRequest
     * @return GetSecuritySuggestionListResponse
     */
    public GetSecuritySuggestionListResponse getSecuritySuggestionList(GetSecuritySuggestionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecuritySuggestionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全优化建议条数</p>
     * 
     * @param request GetSecuritySuggestionNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecuritySuggestionNumberResponse
     */
    public GetSecuritySuggestionNumberResponse getSecuritySuggestionNumberWithOptions(GetSecuritySuggestionNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecuritySuggestionNumber"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecuritySuggestionNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取安全优化建议条数</p>
     * 
     * @param request GetSecuritySuggestionNumberRequest
     * @return GetSecuritySuggestionNumberResponse
     */
    public GetSecuritySuggestionNumberResponse getSecuritySuggestionNumber(GetSecuritySuggestionNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecuritySuggestionNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务关联角色状态</p>
     * 
     * @param request GetServiceLinkedRoleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceLinkedRoleStatusResponse
     */
    public GetServiceLinkedRoleStatusResponse getServiceLinkedRoleStatusWithOptions(GetServiceLinkedRoleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceLinkedRoleStatus"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceLinkedRoleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取服务关联角色状态</p>
     * 
     * @param request GetServiceLinkedRoleStatusRequest
     * @return GetServiceLinkedRoleStatusResponse
     */
    public GetServiceLinkedRoleStatusResponse getServiceLinkedRoleStatus(GetServiceLinkedRoleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceLinkedRoleStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-获取有效抵扣实例</p>
     * 
     * @param tmpReq GetValidDeductInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetValidDeductInstancesResponse
     */
    public GetValidDeductInstancesResponse getValidDeductInstancesWithOptions(GetValidDeductInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetValidDeductInstancesShrinkRequest request = new GetValidDeductInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetValidDeductInstances"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetValidDeductInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-获取有效抵扣实例</p>
     * 
     * @param request GetValidDeductInstancesRequest
     * @return GetValidDeductInstancesResponse
     */
    public GetValidDeductInstancesResponse getValidDeductInstances(GetValidDeductInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getValidDeductInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-初始化云安全中心模块规则</p>
     * 
     * @param tmpReq InitSasModuleRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitSasModuleRuleResponse
     */
    public InitSasModuleRuleResponse initSasModuleRuleWithOptions(InitSasModuleRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InitSasModuleRuleShrinkRequest request = new InitSasModuleRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instances)) {
            request.instancesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instances, "Instances", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoBind)) {
            query.put("AutoBind", request.autoBind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancesShrink)) {
            query.put("Instances", request.instancesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTrial)) {
            query.put("IsTrial", request.isTrial);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitSasModuleRule"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitSasModuleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-初始化云安全中心模块规则</p>
     * 
     * @param request InitSasModuleRuleRequest
     * @return InitSasModuleRuleResponse
     */
    public InitSasModuleRuleResponse initSasModuleRule(InitSasModuleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initSasModuleRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询全盘扫描结果</p>
     * 
     * @param request ListVirusScanMachineEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirusScanMachineEventResponse
     */
    public ListVirusScanMachineEventResponse listVirusScanMachineEventWithOptions(ListVirusScanMachineEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTaskId)) {
            query.put("OperateTaskId", request.operateTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirusScanMachineEvent"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirusScanMachineEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询全盘扫描结果</p>
     * 
     * @param request ListVirusScanMachineEventRequest
     * @return ListVirusScanMachineEventResponse
     */
    public ListVirusScanMachineEventResponse listVirusScanMachineEvent(ListVirusScanMachineEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirusScanMachineEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-开启试用套餐</p>
     * 
     * @param request OpenTrialPackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenTrialPackageResponse
     */
    public OpenTrialPackageResponse openTrialPackageWithOptions(OpenTrialPackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCloseSwitch)) {
            query.put("AutoCloseSwitch", request.autoCloseSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenTrialPackage"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenTrialPackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-开启试用套餐</p>
     * 
     * @param request OpenTrialPackageRequest
     * @return OpenTrialPackageResponse
     */
    public OpenTrialPackageResponse openTrialPackage(OpenTrialPackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openTrialPackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账号安全事件</p>
     * 
     * @param request QueryAccountSafetyIncidentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountSafetyIncidentResponse
     */
    public QueryAccountSafetyIncidentResponse queryAccountSafetyIncidentWithOptions(QueryAccountSafetyIncidentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseCode)) {
            query.put("CaseCode", request.caseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishEndTime)) {
            query.put("PunishEndTime", request.punishEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishStartTime)) {
            query.put("PunishStartTime", request.punishStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountSafetyIncident"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountSafetyIncidentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账号安全事件</p>
     * 
     * @param request QueryAccountSafetyIncidentRequest
     * @return QueryAccountSafetyIncidentResponse
     */
    public QueryAccountSafetyIncidentResponse queryAccountSafetyIncident(QueryAccountSafetyIncidentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountSafetyIncidentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云上安全指南的订阅状态</p>
     * 
     * @param request QueryGuideSubStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryGuideSubStatusResponse
     */
    public QueryGuideSubStatusResponse queryGuideSubStatusWithOptions(QueryGuideSubStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideSubStatus"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideSubStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云上安全指南的订阅状态</p>
     * 
     * @param request QueryGuideSubStatusRequest
     * @return QueryGuideSubStatusResponse
     */
    public QueryGuideSubStatusResponse queryGuideSubStatus(QueryGuideSubStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGuideSubStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源管控事件</p>
     * 
     * @param tmpReq QueryResourceControlEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResourceControlEventsResponse
     */
    public QueryResourceControlEventsResponse queryResourceControlEventsWithOptions(QueryResourceControlEventsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryResourceControlEventsShrinkRequest request = new QueryResourceControlEventsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionCodes)) {
            request.actionCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionCodes, "ActionCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.caseCodesPrefix)) {
            request.caseCodesPrefixShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.caseCodesPrefix, "CaseCodesPrefix", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventCodes)) {
            request.eventCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventCodes, "EventCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventIdList)) {
            request.eventIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventIdList, "EventIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeActionCodes)) {
            request.excludeActionCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeActionCodes, "ExcludeActionCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeEventCodes)) {
            request.excludeEventCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeEventCodes, "ExcludeEventCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeReasons)) {
            request.excludeReasonsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeReasons, "ExcludeReasons", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.includeReasons)) {
            request.includeReasonsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.includeReasons, "IncludeReasons", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceCodes)) {
            request.sourceCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceCodes, "SourceCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            query.put("ActionCode", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionCodesShrink)) {
            query.put("ActionCodes", request.actionCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunLang)) {
            query.put("AliyunLang", request.aliyunLang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessCode)) {
            query.put("BusinessCode", request.businessCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caseCodesPrefixShrink)) {
            query.put("CaseCodesPrefix", request.caseCodesPrefixShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("EventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCodesShrink)) {
            query.put("EventCodes", request.eventCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIdListShrink)) {
            query.put("EventIdList", request.eventIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeActionCodesShrink)) {
            query.put("ExcludeActionCodes", request.excludeActionCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeEventCodesShrink)) {
            query.put("ExcludeEventCodes", request.excludeEventCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeReasonsShrink)) {
            query.put("ExcludeReasons", request.excludeReasonsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeReasonsShrink)) {
            query.put("IncludeReasons", request.includeReasonsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishEndTime)) {
            query.put("PunishEndTime", request.punishEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishStartTime)) {
            query.put("PunishStartTime", request.punishStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCodesShrink)) {
            query.put("SourceCodes", request.sourceCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResourceControlEvents"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResourceControlEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云资源管控事件</p>
     * 
     * @param request QueryResourceControlEventsRequest
     * @return QueryResourceControlEventsResponse
     */
    public QueryResourceControlEventsResponse queryResourceControlEvents(QueryResourceControlEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResourceControlEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全体检简报</p>
     * 
     * @param request QuerySecurityCheckReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySecurityCheckReportResponse
     */
    public QuerySecurityCheckReportResponse querySecurityCheckReportWithOptions(QuerySecurityCheckReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySecurityCheckReport"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySecurityCheckReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全体检简报</p>
     * 
     * @param request QuerySecurityCheckReportRequest
     * @return QuerySecurityCheckReportResponse
     */
    public QuerySecurityCheckReportResponse querySecurityCheckReport(QuerySecurityCheckReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySecurityCheckReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启处置工具授权</p>
     * 
     * @param request StartDisposalToolServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDisposalToolServiceResponse
     */
    public StartDisposalToolServiceResponse startDisposalToolServiceWithOptions(StartDisposalToolServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDisposalToolService"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDisposalToolServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启处置工具授权</p>
     * 
     * @param request StartDisposalToolServiceRequest
     * @return StartDisposalToolServiceResponse
     */
    public StartDisposalToolServiceResponse startDisposalToolService(StartDisposalToolServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDisposalToolServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启安全体检</p>
     * 
     * @param request StartSecurityCheckServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSecurityCheckServiceResponse
     */
    public StartSecurityCheckServiceResponse startSecurityCheckServiceWithOptions(StartSecurityCheckServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSecurityCheckService"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSecurityCheckServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启安全体检</p>
     * 
     * @param request StartSecurityCheckServiceRequest
     * @return StartSecurityCheckServiceResponse
     */
    public StartSecurityCheckServiceResponse startSecurityCheckService(StartSecurityCheckServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSecurityCheckServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请解封</p>
     * 
     * @param tmpReq SubmitApplyRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitApplyRecordResponse
     */
    public SubmitApplyRecordResponse submitApplyRecordWithOptions(SubmitApplyRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitApplyRecordShrinkRequest request = new SubmitApplyRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventIdList)) {
            request.eventIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventIdList, "EventIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyRequest)) {
            query.put("ApplyRequest", request.applyRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commitmentLetter)) {
            query.put("CommitmentLetter", request.commitmentLetter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIdListShrink)) {
            query.put("EventIdList", request.eventIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.qualificationProof)) {
            query.put("QualificationProof", request.qualificationProof);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trial)) {
            query.put("Trial", request.trial);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitApplyRecord"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitApplyRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请解封</p>
     * 
     * @param request SubmitApplyRecordRequest
     * @return SubmitApplyRecordResponse
     */
    public SubmitApplyRecordResponse submitApplyRecord(SubmitApplyRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitApplyRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>sas-更新后付费绑定关系</p>
     * 
     * @param tmpReq UpdatePostPaidBindRelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePostPaidBindRelResponse
     */
    public UpdatePostPaidBindRelResponse updatePostPaidBindRelWithOptions(UpdatePostPaidBindRelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePostPaidBindRelShrinkRequest request = new UpdatePostPaidBindRelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkRequest)) {
            request.sdkRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkRequest, "SdkRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sdkRequestShrink)) {
            query.put("SdkRequest", request.sdkRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePostPaidBindRel"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePostPaidBindRelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>sas-更新后付费绑定关系</p>
     * 
     * @param request UpdatePostPaidBindRelRequest
     * @return UpdatePostPaidBindRelResponse
     */
    public UpdatePostPaidBindRelResponse updatePostPaidBindRel(UpdatePostPaidBindRelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePostPaidBindRelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新体检结果</p>
     * 
     * @param request UpdateSecurityCheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecurityCheckResultResponse
     */
    public UpdateSecurityCheckResultResponse updateSecurityCheckResultWithOptions(UpdateSecurityCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecurityCheckResult"),
            new TeaPair("version", "2026-04-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecurityCheckResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新体检结果</p>
     * 
     * @param request UpdateSecurityCheckResultRequest
     * @return UpdateSecurityCheckResultResponse
     */
    public UpdateSecurityCheckResultResponse updateSecurityCheckResult(UpdateSecurityCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecurityCheckResultWithOptions(request, runtime);
    }
}

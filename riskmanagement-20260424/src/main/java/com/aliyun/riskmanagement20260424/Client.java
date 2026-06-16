// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424;

import com.aliyun.tea.*;
import com.aliyun.riskmanagement20260424.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
}

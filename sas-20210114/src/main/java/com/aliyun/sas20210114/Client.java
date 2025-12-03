// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114;

import com.aliyun.tea.*;
import com.aliyun.sas20210114.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-fuzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("eu-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-central-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao-acdr-ut-1", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-mybk", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wuhan-lr", "tds.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-jva", "tds.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>新增或者修改用户大屏设置</p>
     * 
     * @param request CreateScreenSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScreenSettingResponse
     */
    public CreateScreenSettingResponse createScreenSettingWithOptions(CreateScreenSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoPower)) {
            query.put("LogoPower", request.logoPower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorUrl)) {
            query.put("MonitorUrl", request.monitorUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.screenDataMap)) {
            query.put("ScreenDataMap", request.screenDataMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.screenDefault)) {
            query.put("ScreenDefault", request.screenDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScreenSetting"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScreenSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增或者修改用户大屏设置</p>
     * 
     * @param request CreateScreenSettingRequest
     * @return CreateScreenSettingResponse
     */
    public CreateScreenSettingResponse createScreenSetting(CreateScreenSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScreenSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除大屏设置</p>
     * 
     * @param request DeleteScreenSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScreenSettingResponse
     */
    public DeleteScreenSettingResponse deleteScreenSettingWithOptions(DeleteScreenSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScreenSetting"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScreenSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除大屏设置</p>
     * 
     * @param request DeleteScreenSettingRequest
     * @return DeleteScreenSettingResponse
     */
    public DeleteScreenSettingResponse deleteScreenSetting(DeleteScreenSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScreenSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏告警事件</p>
     * 
     * @param request DescribeScreenAlarmEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenAlarmEventListResponse
     */
    public DescribeScreenAlarmEventListResponse describeScreenAlarmEventListWithOptions(DescribeScreenAlarmEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmEventName)) {
            query.put("AlarmEventName", request.alarmEventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmEventType)) {
            query.put("AlarmEventType", request.alarmEventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levels)) {
            query.put("Levels", request.levels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeEnd)) {
            query.put("TimeEnd", request.timeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStart)) {
            query.put("TimeStart", request.timeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenAlarmEventList"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenAlarmEventListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏告警事件</p>
     * 
     * @param request DescribeScreenAlarmEventListRequest
     * @return DescribeScreenAlarmEventListResponse
     */
    public DescribeScreenAlarmEventListResponse describeScreenAlarmEventList(DescribeScreenAlarmEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenAlarmEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏攻击防御事件</p>
     * 
     * @param request DescribeScreenAttackAnalysisDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenAttackAnalysisDataResponse
     */
    public DescribeScreenAttackAnalysisDataResponse describeScreenAttackAnalysisDataWithOptions(DescribeScreenAttackAnalysisDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.base64)) {
            query.put("Base64", request.base64);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenAttackAnalysisData"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenAttackAnalysisDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏攻击防御事件</p>
     * 
     * @param request DescribeScreenAttackAnalysisDataRequest
     * @return DescribeScreenAttackAnalysisDataResponse
     */
    public DescribeScreenAttackAnalysisDataResponse describeScreenAttackAnalysisData(DescribeScreenAttackAnalysisDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenAttackAnalysisDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云产品基线问题</p>
     * 
     * @param request DescribeScreenCloudHcRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenCloudHcRiskResponse
     */
    public DescribeScreenCloudHcRiskResponse describeScreenCloudHcRiskWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenCloudHcRisk"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenCloudHcRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云产品基线问题</p>
     * @return DescribeScreenCloudHcRiskResponse
     */
    public DescribeScreenCloudHcRiskResponse describeScreenCloudHcRisk() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenCloudHcRiskWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取大屏可展示数据列表</p>
     * 
     * @param request DescribeScreenDataMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenDataMapResponse
     */
    public DescribeScreenDataMapResponse describeScreenDataMapWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenDataMap"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenDataMapResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取大屏可展示数据列表</p>
     * @return DescribeScreenDataMapResponse
     */
    public DescribeScreenDataMapResponse describeScreenDataMap() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenDataMapWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询云产品漏洞风险</p>
     * 
     * @param request DescribeScreenEmerRiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenEmerRiskResponse
     */
    public DescribeScreenEmerRiskResponse describeScreenEmerRiskWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenEmerRisk"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenEmerRiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询云产品漏洞风险</p>
     * @return DescribeScreenEmerRiskResponse
     */
    public DescribeScreenEmerRiskResponse describeScreenEmerRisk() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenEmerRiskWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏主机统计数据</p>
     * 
     * @param request DescribeScreenHostStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenHostStatisticsResponse
     */
    public DescribeScreenHostStatisticsResponse describeScreenHostStatisticsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenHostStatistics"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenHostStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏主机统计数据</p>
     * @return DescribeScreenHostStatisticsResponse
     */
    public DescribeScreenHostStatisticsResponse describeScreenHostStatistics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenHostStatisticsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看运营信息</p>
     * 
     * @param request DescribeScreenOperateInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenOperateInfoResponse
     */
    public DescribeScreenOperateInfoResponse describeScreenOperateInfoWithOptions(DescribeScreenOperateInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenOperateInfo"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenOperateInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看运营信息</p>
     * 
     * @param request DescribeScreenOperateInfoRequest
     * @return DescribeScreenOperateInfoResponse
     */
    public DescribeScreenOperateInfoResponse describeScreenOperateInfo(DescribeScreenOperateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenOperateInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏上传信息</p>
     * 
     * @param request DescribeScreenOssUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenOssUploadInfoResponse
     */
    public DescribeScreenOssUploadInfoResponse describeScreenOssUploadInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenOssUploadInfo"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenOssUploadInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏上传信息</p>
     * @return DescribeScreenOssUploadInfoResponse
     */
    public DescribeScreenOssUploadInfoResponse describeScreenOssUploadInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenOssUploadInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏分数趋势</p>
     * 
     * @param request DescribeScreenScoreThreadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenScoreThreadResponse
     */
    public DescribeScreenScoreThreadResponse describeScreenScoreThreadWithOptions(DescribeScreenScoreThreadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenScoreThread"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenScoreThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏分数趋势</p>
     * 
     * @param request DescribeScreenScoreThreadRequest
     * @return DescribeScreenScoreThreadResponse
     */
    public DescribeScreenScoreThreadResponse describeScreenScoreThread(DescribeScreenScoreThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenScoreThreadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已处理的风险</p>
     * 
     * @param request DescribeScreenSecurityStatInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenSecurityStatInfoResponse
     */
    public DescribeScreenSecurityStatInfoResponse describeScreenSecurityStatInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenSecurityStatInfo"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenSecurityStatInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已处理的风险</p>
     * @return DescribeScreenSecurityStatInfoResponse
     */
    public DescribeScreenSecurityStatInfoResponse describeScreenSecurityStatInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenSecurityStatInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏配置</p>
     * 
     * @param request DescribeScreenSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenSettingResponse
     */
    public DescribeScreenSettingResponse describeScreenSettingWithOptions(DescribeScreenSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenSetting"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏配置</p>
     * 
     * @param request DescribeScreenSettingRequest
     * @return DescribeScreenSettingResponse
     */
    public DescribeScreenSettingResponse describeScreenSetting(DescribeScreenSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏统计信息</p>
     * 
     * @param request DescribeScreenSummaryInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenSummaryInfoResponse
     */
    public DescribeScreenSummaryInfoResponse describeScreenSummaryInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenSummaryInfo"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenSummaryInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询大屏统计信息</p>
     * @return DescribeScreenSummaryInfoResponse
     */
    public DescribeScreenSummaryInfoResponse describeScreenSummaryInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenSummaryInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取大屏幕设置全部列表</p>
     * 
     * @param request DescribeScreenTitlesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenTitlesResponse
     */
    public DescribeScreenTitlesResponse describeScreenTitlesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenTitles"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenTitlesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取大屏幕设置全部列表</p>
     * @return DescribeScreenTitlesResponse
     */
    public DescribeScreenTitlesResponse describeScreenTitles() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenTitlesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询上传之后的图片显示地址</p>
     * 
     * @param request DescribeScreenUploadPictureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenUploadPictureResponse
     */
    public DescribeScreenUploadPictureResponse describeScreenUploadPictureWithOptions(DescribeScreenUploadPictureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenUploadPicture"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenUploadPictureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询上传之后的图片显示地址</p>
     * 
     * @param request DescribeScreenUploadPictureRequest
     * @return DescribeScreenUploadPictureResponse
     */
    public DescribeScreenUploadPictureResponse describeScreenUploadPicture(DescribeScreenUploadPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenUploadPictureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏版本配置</p>
     * 
     * @param request DescribeScreenVersionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScreenVersionConfigResponse
     */
    public DescribeScreenVersionConfigResponse describeScreenVersionConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScreenVersionConfig"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScreenVersionConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询安全大屏版本配置</p>
     * @return DescribeScreenVersionConfigResponse
     */
    public DescribeScreenVersionConfigResponse describeScreenVersionConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScreenVersionConfigWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件检测结果。</p>
     * 
     * @param request GetFileDetectResultInnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileDetectResultInnerResponse
     */
    public GetFileDetectResultInnerResponse getFileDetectResultInnerWithOptions(GetFileDetectResultInnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dnaHashKeyList)) {
            query.put("DnaHashKeyList", request.dnaHashKeyList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hashKeyList)) {
            query.put("HashKeyList", request.hashKeyList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileDetectResultInner"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileDetectResultInnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件检测结果。</p>
     * 
     * @param request GetFileDetectResultInnerRequest
     * @return GetFileDetectResultInnerResponse
     */
    public GetFileDetectResultInnerResponse getFileDetectResultInner(GetFileDetectResultInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileDetectResultInnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>首页配置情况汇总接口</p>
     * 
     * @param tmpReq ListGlobalUserConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGlobalUserConfigResponse
     */
    public ListGlobalUserConfigResponse listGlobalUserConfigWithOptions(ListGlobalUserConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListGlobalUserConfigShrinkRequest request = new ListGlobalUserConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.moduleList)) {
            request.moduleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.moduleList, "ModuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.moduleListShrink)) {
            query.put("ModuleList", request.moduleListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGlobalUserConfig"),
            new TeaPair("version", "2021-01-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGlobalUserConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>首页配置情况汇总接口</p>
     * 
     * @param request ListGlobalUserConfigRequest
     * @return ListGlobalUserConfigResponse
     */
    public ListGlobalUserConfigResponse listGlobalUserConfig(ListGlobalUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGlobalUserConfigWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017;

import com.aliyun.tea.*;
import com.aliyun.ossmfd20231017.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ossmfd", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>检查服务是否开通</p>
     * 
     * @param request CheckMfdServiceOpenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckMfdServiceOpenResponse
     */
    public CheckMfdServiceOpenResponse checkMfdServiceOpenWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMfdServiceOpen"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMfdServiceOpenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查服务是否开通</p>
     * @return CheckMfdServiceOpenResponse
     */
    public CheckMfdServiceOpenResponse checkMfdServiceOpen() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMfdServiceOpenWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建bucket扫描任务</p>
     * 
     * @param request CreateOssBucketScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssBucketScanTaskResponse
     */
    public CreateOssBucketScanTaskResponse createOssBucketScanTaskWithOptions(CreateOssBucketScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allKeyPrefix)) {
            query.put("AllKeyPrefix", request.allKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketNameList)) {
            query.put("BucketNameList", request.bucketNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxFileCount)) {
            query.put("DecompressMaxFileCount", request.decompressMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxLayer)) {
            query.put("DecompressMaxLayer", request.decompressMaxLayer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decryptionList)) {
            query.put("DecryptionList", request.decryptionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeKeySuffixList)) {
            query.put("ExcludeKeySuffixList", request.excludeKeySuffixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPrefixList)) {
            query.put("KeyPrefixList", request.keyPrefixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySuffixList)) {
            query.put("KeySuffixList", request.keySuffixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastModifiedStartTime)) {
            query.put("LastModifiedStartTime", request.lastModifiedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanMode)) {
            query.put("ScanMode", request.scanMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssBucketScanTask"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssBucketScanTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建bucket扫描任务</p>
     * 
     * @param request CreateOssBucketScanTaskRequest
     * @return CreateOssBucketScanTaskResponse
     */
    public CreateOssBucketScanTaskResponse createOssBucketScanTask(CreateOssBucketScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOssBucketScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Bucket检测策略配置</p>
     * 
     * @param request CreateOssScanConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssScanConfigResponse
     */
    public CreateOssScanConfigResponse createOssScanConfigWithOptions(CreateOssScanConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allKeyPrefix)) {
            query.put("AllKeyPrefix", request.allKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxFileCount)) {
            query.put("DecompressMaxFileCount", request.decompressMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxLayer)) {
            query.put("DecompressMaxLayer", request.decompressMaxLayer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decryptionList)) {
            query.put("DecryptionList", request.decryptionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPrefixList)) {
            query.put("KeyPrefixList", request.keyPrefixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySuffixList)) {
            query.put("KeySuffixList", request.keySuffixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastModifiedStartTime)) {
            query.put("LastModifiedStartTime", request.lastModifiedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realTimeIncr)) {
            query.put("RealTimeIncr", request.realTimeIncr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanDayList)) {
            query.put("ScanDayList", request.scanDayList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssScanConfig"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssScanConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Bucket检测策略配置</p>
     * 
     * @param request CreateOssScanConfigRequest
     * @return CreateOssScanConfigResponse
     */
    public CreateOssScanConfigResponse createOssScanConfig(CreateOssScanConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOssScanConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出信息</p>
     * 
     * @param request DescribeExportInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExportInfoResponse
     */
    public DescribeExportInfoResponse describeExportInfoWithOptions(DescribeExportInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportId)) {
            query.put("ExportId", request.exportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportInfo"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出信息</p>
     * 
     * @param request DescribeExportInfoRequest
     * @return DescribeExportInfoResponse
     */
    public DescribeExportInfoResponse describeExportInfo(DescribeExportInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询您是否已创建云安全中心服务关联角色</p>
     * 
     * @param request DescribeServiceLinkedRoleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServiceLinkedRoleStatusResponse
     */
    public DescribeServiceLinkedRoleStatusResponse describeServiceLinkedRoleStatusWithOptions(DescribeServiceLinkedRoleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceLinkedRole)) {
            query.put("ServiceLinkedRole", request.serviceLinkedRole);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServiceLinkedRoleStatus"),
            new TeaPair("version", "2023-10-17"),
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
     * <p>查询您是否已创建云安全中心服务关联角色</p>
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
     * <p>导出恶意文件列表</p>
     * 
     * @param request ExportRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportRecordResponse
     */
    public ExportRecordResponse exportRecordWithOptions(ExportRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportRecord"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出恶意文件列表</p>
     * 
     * @param request ExportRecordRequest
     * @return ExportRecordResponse
     */
    public ExportRecordResponse exportRecord(ExportRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取沙箱检测报告。</p>
     * 
     * @param request GetFileDetectReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileDetectReportResponse
     */
    public GetFileDetectReportResponse getFileDetectReportWithOptions(GetFileDetectReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.field)) {
            query.put("Field", request.field);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileHash)) {
            query.put("FileHash", request.fileHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileDetectReport"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileDetectReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取沙箱检测报告。</p>
     * 
     * @param request GetFileDetectReportRequest
     * @return GetFileDetectReportResponse
     */
    public GetFileDetectReportResponse getFileDetectReport(GetFileDetectReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileDetectReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取bucket检测统计信息</p>
     * 
     * @param request GetOssBucketScanStatisticRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssBucketScanStatisticResponse
     */
    public GetOssBucketScanStatisticResponse getOssBucketScanStatisticWithOptions(GetOssBucketScanStatisticRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketNameList)) {
            query.put("BucketNameList", request.bucketNameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssBucketScanStatistic"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssBucketScanStatisticResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取bucket检测统计信息</p>
     * 
     * @param request GetOssBucketScanStatisticRequest
     * @return GetOssBucketScanStatisticResponse
     */
    public GetOssBucketScanStatisticResponse getOssBucketScanStatistic(GetOssBucketScanStatisticRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssBucketScanStatisticWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Bucket检测配置</p>
     * 
     * @param request GetOssScanConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssScanConfigResponse
     */
    public GetOssScanConfigResponse getOssScanConfigWithOptions(GetOssScanConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssScanConfig"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssScanConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Bucket检测配置</p>
     * 
     * @param request GetOssScanConfigRequest
     * @return GetOssScanConfigResponse
     */
    public GetOssScanConfigResponse getOssScanConfig(GetOssScanConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssScanConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件检测告警列表</p>
     * 
     * @param request ListObjectScanEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListObjectScanEventResponse
     */
    public ListObjectScanEventResponse listObjectScanEventWithOptions(ListObjectScanEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchType)) {
            query.put("BatchType", request.batchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5)) {
            query.put("Md5", request.md5);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentEventId)) {
            query.put("ParentEventId", request.parentEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
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
            new TeaPair("action", "ListObjectScanEvent"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListObjectScanEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文件检测告警列表</p>
     * 
     * @param request ListObjectScanEventRequest
     * @return ListObjectScanEventResponse
     */
    public ListObjectScanEventResponse listObjectScanEvent(ListObjectScanEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listObjectScanEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户所有的bucket</p>
     * 
     * @param request ListOssBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOssBucketResponse
     */
    public ListOssBucketResponse listOssBucketWithOptions(ListOssBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOssBucket"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOssBucketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户所有的bucket</p>
     * 
     * @param request ListOssBucketRequest
     * @return ListOssBucketResponse
     */
    public ListOssBucketResponse listOssBucket(ListOssBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOssBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取bucket详情</p>
     * 
     * @param request ListOssBucketScanInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOssBucketScanInfoResponse
     */
    public ListOssBucketScanInfoResponse listOssBucketScanInfoWithOptions(ListOssBucketScanInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fuzzBucketName)) {
            query.put("FuzzBucketName", request.fuzzBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasRisk)) {
            query.put("HasRisk", request.hasRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOssBucketScanInfo"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOssBucketScanInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取bucket详情</p>
     * 
     * @param request ListOssBucketScanInfoRequest
     * @return ListOssBucketScanInfoResponse
     */
    public ListOssBucketScanInfoResponse listOssBucketScanInfo(ListOssBucketScanInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOssBucketScanInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持的文件后缀</p>
     * 
     * @param request ListSupportObjectSuffixRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSupportObjectSuffixResponse
     */
    public ListSupportObjectSuffixResponse listSupportObjectSuffixWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSupportObjectSuffix"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSupportObjectSuffixResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持的文件后缀</p>
     * @return ListSupportObjectSuffixResponse
     */
    public ListSupportObjectSuffixResponse listSupportObjectSuffix() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSupportObjectSuffixWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>操作oss检测任务</p>
     * 
     * @param request OperateBucketScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateBucketScanTaskResponse
     */
    public OperateBucketScanTaskResponse operateBucketScanTaskWithOptions(OperateBucketScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateCode)) {
            query.put("OperateCode", request.operateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateBucketScanTask"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateBucketScanTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>操作oss检测任务</p>
     * 
     * @param request OperateBucketScanTaskRequest
     * @return OperateBucketScanTaskResponse
     */
    public OperateBucketScanTaskResponse operateBucketScanTask(OperateBucketScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateBucketScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改Bucket检测配置</p>
     * 
     * @param request UpdateOssScanConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOssScanConfigResponse
     */
    public UpdateOssScanConfigResponse updateOssScanConfigWithOptions(UpdateOssScanConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allKeyPrefix)) {
            query.put("AllKeyPrefix", request.allKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxFileCount)) {
            query.put("DecompressMaxFileCount", request.decompressMaxFileCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decompressMaxLayer)) {
            query.put("DecompressMaxLayer", request.decompressMaxLayer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decryptionList)) {
            query.put("DecryptionList", request.decryptionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPrefixList)) {
            query.put("KeyPrefixList", request.keyPrefixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keySuffixList)) {
            query.put("KeySuffixList", request.keySuffixList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastModifiedStartTime)) {
            query.put("LastModifiedStartTime", request.lastModifiedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realTimeIncr)) {
            query.put("RealTimeIncr", request.realTimeIncr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanDayList)) {
            query.put("ScanDayList", request.scanDayList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOssScanConfig"),
            new TeaPair("version", "2023-10-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOssScanConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改Bucket检测配置</p>
     * 
     * @param request UpdateOssScanConfigRequest
     * @return UpdateOssScanConfigResponse
     */
    public UpdateOssScanConfigResponse updateOssScanConfig(UpdateOssScanConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOssScanConfigWithOptions(request, runtime);
    }
}

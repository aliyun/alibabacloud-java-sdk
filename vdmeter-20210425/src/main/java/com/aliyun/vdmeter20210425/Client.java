// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425;

import com.aliyun.tea.*;
import com.aliyun.vdmeter20210425.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vdmeter", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeHuYaRecordByDomainResponse describeHuYaRecordByDomainWithOptions(DescribeHuYaRecordByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BusinessType", request.businessType);
        query.put("Domain", request.domain);
        query.put("EndTime", request.endTime);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHuYaRecordByDomain"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHuYaRecordByDomainResponse());
    }

    public DescribeHuYaRecordByDomainResponse describeHuYaRecordByDomain(DescribeHuYaRecordByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHuYaRecordByDomainWithOptions(request, runtime);
    }

    public DescribeHuYaScreenshotByDomainResponse describeHuYaScreenshotByDomainWithOptions(DescribeHuYaScreenshotByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BusinessType", request.businessType);
        query.put("Domain", request.domain);
        query.put("EndTime", request.endTime);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHuYaScreenshotByDomain"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHuYaScreenshotByDomainResponse());
    }

    public DescribeHuYaScreenshotByDomainResponse describeHuYaScreenshotByDomain(DescribeHuYaScreenshotByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHuYaScreenshotByDomainWithOptions(request, runtime);
    }

    public DescribeHuYaTranscodeByDomainResponse describeHuYaTranscodeByDomainWithOptions(DescribeHuYaTranscodeByDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BusinessType", request.businessType);
        query.put("Domain", request.domain);
        query.put("EndTime", request.endTime);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHuYaTranscodeByDomain"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHuYaTranscodeByDomainResponse());
    }

    public DescribeHuYaTranscodeByDomainResponse describeHuYaTranscodeByDomain(DescribeHuYaTranscodeByDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHuYaTranscodeByDomainWithOptions(request, runtime);
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponse describeMeterBypassRtUsageByTaskProfileWithOptions(DescribeMeterBypassRtUsageByTaskProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterBypassRtUsageByTaskProfile"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterBypassRtUsageByTaskProfileResponse());
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponse describeMeterBypassRtUsageByTaskProfile(DescribeMeterBypassRtUsageByTaskProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterBypassRtUsageByTaskProfileWithOptions(request, runtime);
    }

    public DescribeMeterBypassUsageByTaskProfileResponse describeMeterBypassUsageByTaskProfileWithOptions(DescribeMeterBypassUsageByTaskProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTime", request.endTime);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterBypassUsageByTaskProfile"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterBypassUsageByTaskProfileResponse());
    }

    public DescribeMeterBypassUsageByTaskProfileResponse describeMeterBypassUsageByTaskProfile(DescribeMeterBypassUsageByTaskProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterBypassUsageByTaskProfileWithOptions(request, runtime);
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse describeMeterMpuTranscodeRtUsageByTaskProfileWithOptions(DescribeMeterMpuTranscodeRtUsageByTaskProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterMpuTranscodeRtUsageByTaskProfile"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse());
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse describeMeterMpuTranscodeRtUsageByTaskProfile(DescribeMeterMpuTranscodeRtUsageByTaskProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterMpuTranscodeRtUsageByTaskProfileWithOptions(request, runtime);
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponse describeMeterRecordRtUsageByTaskProfileWithOptions(DescribeMeterRecordRtUsageByTaskProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRecordRtUsageByTaskProfile"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRecordRtUsageByTaskProfileResponse());
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponse describeMeterRecordRtUsageByTaskProfile(DescribeMeterRecordRtUsageByTaskProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRecordRtUsageByTaskProfileWithOptions(request, runtime);
    }

    public DescribeMeterRecordUsageByTaskProfileResponse describeMeterRecordUsageByTaskProfileWithOptions(DescribeMeterRecordUsageByTaskProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRecordUsageByTaskProfile"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRecordUsageByTaskProfileResponse());
    }

    public DescribeMeterRecordUsageByTaskProfileResponse describeMeterRecordUsageByTaskProfile(DescribeMeterRecordUsageByTaskProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRecordUsageByTaskProfileWithOptions(request, runtime);
    }

    public DescribeMeterRtcApproxPeakRateResponse describeMeterRtcApproxPeakRateWithOptions(DescribeMeterRtcApproxPeakRateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcApproxPeakRate"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcApproxPeakRateResponse());
    }

    public DescribeMeterRtcApproxPeakRateResponse describeMeterRtcApproxPeakRate(DescribeMeterRtcApproxPeakRateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcApproxPeakRateWithOptions(request, runtime);
    }

    public DescribeMeterRtcBandWidthUsageResponse describeMeterRtcBandWidthUsageWithOptions(DescribeMeterRtcBandWidthUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcBandWidthUsage"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcBandWidthUsageResponse());
    }

    public DescribeMeterRtcBandWidthUsageResponse describeMeterRtcBandWidthUsage(DescribeMeterRtcBandWidthUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcBandWidthUsageWithOptions(request, runtime);
    }

    public DescribeMeterRtcChannelCntDataResponse describeMeterRtcChannelCntDataWithOptions(DescribeMeterRtcChannelCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcChannelCntData"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcChannelCntDataResponse());
    }

    public DescribeMeterRtcChannelCntDataResponse describeMeterRtcChannelCntData(DescribeMeterRtcChannelCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcChannelCntDataWithOptions(request, runtime);
    }

    public DescribeMeterRtcDurationResponse describeMeterRtcDurationWithOptions(DescribeMeterRtcDurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcDuration"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcDurationResponse());
    }

    public DescribeMeterRtcDurationResponse describeMeterRtcDuration(DescribeMeterRtcDurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcDurationWithOptions(request, runtime);
    }

    public DescribeMeterRtcDurationByAppIdResponse describeMeterRtcDurationByAppIdWithOptions(DescribeMeterRtcDurationByAppIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcDurationByAppId"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcDurationByAppIdResponse());
    }

    public DescribeMeterRtcDurationByAppIdResponse describeMeterRtcDurationByAppId(DescribeMeterRtcDurationByAppIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcDurationByAppIdWithOptions(request, runtime);
    }

    public DescribeMeterRtcFlowUsageResponse describeMeterRtcFlowUsageWithOptions(DescribeMeterRtcFlowUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcFlowUsage"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcFlowUsageResponse());
    }

    public DescribeMeterRtcFlowUsageResponse describeMeterRtcFlowUsage(DescribeMeterRtcFlowUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcFlowUsageWithOptions(request, runtime);
    }

    public DescribeMeterRtcPeakChannelCntDataResponse describeMeterRtcPeakChannelCntDataWithOptions(DescribeMeterRtcPeakChannelCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcPeakChannelCntData"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcPeakChannelCntDataResponse());
    }

    public DescribeMeterRtcPeakChannelCntDataResponse describeMeterRtcPeakChannelCntData(DescribeMeterRtcPeakChannelCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcPeakChannelCntDataWithOptions(request, runtime);
    }

    public DescribeMeterRtcPeakUserCntDataResponse describeMeterRtcPeakUserCntDataWithOptions(DescribeMeterRtcPeakUserCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcPeakUserCntData"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcPeakUserCntDataResponse());
    }

    public DescribeMeterRtcPeakUserCntDataResponse describeMeterRtcPeakUserCntData(DescribeMeterRtcPeakUserCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcPeakUserCntDataWithOptions(request, runtime);
    }

    public DescribeMeterRtcRtBandWidthUsageResponse describeMeterRtcRtBandWidthUsageWithOptions(DescribeMeterRtcRtBandWidthUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcRtBandWidthUsage"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcRtBandWidthUsageResponse());
    }

    public DescribeMeterRtcRtBandWidthUsageResponse describeMeterRtcRtBandWidthUsage(DescribeMeterRtcRtBandWidthUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcRtBandWidthUsageWithOptions(request, runtime);
    }

    public DescribeMeterRtcRtFlowUsageResponse describeMeterRtcRtFlowUsageWithOptions(DescribeMeterRtcRtFlowUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcRtFlowUsage"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcRtFlowUsageResponse());
    }

    public DescribeMeterRtcRtFlowUsageResponse describeMeterRtcRtFlowUsage(DescribeMeterRtcRtFlowUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcRtFlowUsageWithOptions(request, runtime);
    }

    public DescribeMeterRtcUserCntDataResponse describeMeterRtcUserCntDataWithOptions(DescribeMeterRtcUserCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("EndTs", request.endTs);
        query.put("Interval", request.interval);
        query.put("ServiceArea", request.serviceArea);
        query.put("StartTs", request.startTs);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeterRtcUserCntData"),
            new TeaPair("version", "2021-04-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeterRtcUserCntDataResponse());
    }

    public DescribeMeterRtcUserCntDataResponse describeMeterRtcUserCntData(DescribeMeterRtcUserCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMeterRtcUserCntDataWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214;

import com.aliyun.tea.*;
import com.aliyun.vdc20201214.models.*;
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
        this._endpoint = this.getEndpoint("vdc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeFaultDiagnosisOverallDataResponse describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFaultDiagnosisOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeFaultDiagnosisOverallDataResponse describeFaultDiagnosisOverallDataWithOptions(DescribeFaultDiagnosisOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeFaultDiagnosisOverallData", "2020-12-14", "HTTPS", "POST", "AK", "/api/diagnosis/describeFaultDiagnosisOverallData", "json", req, runtime), new DescribeFaultDiagnosisOverallDataResponse());
    }

    public DescribeRtcChannelUsersResponse describeRtcChannelUsers(DescribeRtcChannelUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcChannelUsersWithOptions(request, headers, runtime);
    }

    public DescribeRtcChannelUsersResponse describeRtcChannelUsersWithOptions(DescribeRtcChannelUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcChannelUsers", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeRtcChannelUsers", "json", req, runtime), new DescribeRtcChannelUsersResponse());
    }

    public DescribeChannelOverallDataResponse describeChannelOverallData(DescribeChannelOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeChannelOverallDataResponse describeChannelOverallDataWithOptions(DescribeChannelOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelOverallData", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelOverallData", "json", req, runtime), new DescribeChannelOverallDataResponse());
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageOsSdkVersionDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatDataWithOptions(DescribeUsageOsSdkVersionDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUsageOsSdkVersionDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/usage/describeUsageOsSdkVersionDistributionStatData", "json", req, runtime), new DescribeUsageOsSdkVersionDistributionStatDataResponse());
    }

    public DescribeIceDurPeriodByDaySubTypeResponse describeIceDurPeriodByDaySubType(DescribeIceDurPeriodByDaySubTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIceDurPeriodByDaySubTypeWithOptions(request, headers, runtime);
    }

    public DescribeIceDurPeriodByDaySubTypeResponse describeIceDurPeriodByDaySubTypeWithOptions(DescribeIceDurPeriodByDaySubTypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeIceDurPeriodByDaySubType", "2020-12-14", "HTTPS", "POST", "AK", "/api/ice/describeIceDurPeriodByDaySubType", "json", req, runtime), new DescribeIceDurPeriodByDaySubTypeResponse());
    }

    public DescribeCallListResponse describeCallList(DescribeCallListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCallListWithOptions(request, headers, runtime);
    }

    public DescribeCallListResponse describeCallListWithOptions(DescribeCallListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callStatus)) {
            query.put("CallStatus", request.callStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            query.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCallList", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeCallList", "json", req, runtime), new DescribeCallListResponse());
    }

    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityAreaDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatDataWithOptions(DescribeQualityAreaDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQualityAreaDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/quality/describeQualityAreaDistributionStatData", "json", req, runtime), new DescribeQualityAreaDistributionStatDataResponse());
    }

    public DescribeRtcUserEventListResponse describeRtcUserEventList(DescribeRtcUserEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcUserEventListWithOptions(request, headers, runtime);
    }

    public DescribeRtcUserEventListResponse describeRtcUserEventListWithOptions(DescribeRtcUserEventListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcUserEventList", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeRtcUserEventList", "json", req, runtime), new DescribeRtcUserEventListResponse());
    }

    public DeleteAppExpMetricRuleResponse deleteAppExpMetricRule(DeleteAppExpMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppExpMetricRuleWithOptions(request, headers, runtime);
    }

    public DeleteAppExpMetricRuleResponse deleteAppExpMetricRuleWithOptions(DeleteAppExpMetricRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteAppExpMetricRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/deleteAppExpMetricRule", "json", req, runtime), new DeleteAppExpMetricRuleResponse());
    }

    public DescribeEndPointEventListResponse describeEndPointEventList(DescribeEndPointEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEndPointEventListWithOptions(request, headers, runtime);
    }

    public DescribeEndPointEventListResponse describeEndPointEventListWithOptions(DescribeEndPointEventListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEndPointEventList", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeEndPointEventList", "json", req, runtime), new DescribeEndPointEventListResponse());
    }

    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatDataWithOptions(DescribeQualityDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQualityDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/quality/describeQualityDistributionStatData", "json", req, runtime), new DescribeQualityDistributionStatDataResponse());
    }

    public DescribeCallListTestResponse describeCallListTest(DescribeCallListTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCallListTestWithOptions(request, headers, runtime);
    }

    public DescribeCallListTestResponse describeCallListTestWithOptions(DescribeCallListTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCallListTest", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeCallListTest", "json", req, runtime), new DescribeCallListTestResponse());
    }

    public DescribeCallResponse describeCall(DescribeCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCallWithOptions(request, headers, runtime);
    }

    public DescribeCallResponse describeCallWithOptions(DescribeCallRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extDataType)) {
            query.put("ExtDataType", request.extDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryExpInfo)) {
            query.put("QueryExpInfo", request.queryExpInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCall", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeCall", "json", req, runtime), new DescribeCallResponse());
    }

    public DescribeAppFollowCallRuleListResponse describeAppFollowCallRuleList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppFollowCallRuleListWithOptions(headers, runtime);
    }

    public DescribeAppFollowCallRuleListResponse describeAppFollowCallRuleListWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppFollowCallRuleList", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/describeAppFollowCallRuleList", "json", req, runtime), new DescribeAppFollowCallRuleListResponse());
    }

    public DescribeChannelAreaDistributionStatDataResponse describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelAreaDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeChannelAreaDistributionStatDataResponse describeChannelAreaDistributionStatDataWithOptions(DescribeChannelAreaDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelAreaDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelAreaDistributionStatData", "json", req, runtime), new DescribeChannelAreaDistributionStatDataResponse());
    }

    public DescribeAppExpMetricRuleResponse describeAppExpMetricRule(DescribeAppExpMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppExpMetricRuleWithOptions(request, headers, runtime);
    }

    public DescribeAppExpMetricRuleResponse describeAppExpMetricRuleWithOptions(DescribeAppExpMetricRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppExpMetricRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/describeAppExpMetricRule", "json", req, runtime), new DescribeAppExpMetricRuleResponse());
    }

    public DescribeRtcChannelDetailsResponse describeRtcChannelDetails(DescribeRtcChannelDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcChannelDetailsWithOptions(request, headers, runtime);
    }

    public DescribeRtcChannelDetailsResponse describeRtcChannelDetailsWithOptions(DescribeRtcChannelDetailsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcChannelDetails", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeRtcChannelDetails", "json", req, runtime), new DescribeRtcChannelDetailsResponse());
    }

    public DescribeIceDurSummaryOverviewResponse describeIceDurSummaryOverview(DescribeIceDurSummaryOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIceDurSummaryOverviewWithOptions(request, headers, runtime);
    }

    public DescribeIceDurSummaryOverviewResponse describeIceDurSummaryOverviewWithOptions(DescribeIceDurSummaryOverviewRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.curTs)) {
            query.put("CurTs", request.curTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeIceDurSummaryOverview", "2020-12-14", "HTTPS", "POST", "AK", "/api/ice/describeIceDurSummaryOverview", "json", req, runtime), new DescribeIceDurSummaryOverviewResponse());
    }

    public DescribeCallUserExpResponse describeCallUserExp(DescribeCallUserExpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeCallUserExpWithOptions(request, headers, runtime);
    }

    public DescribeCallUserExpResponse describeCallUserExpWithOptions(DescribeCallUserExpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeCallUserExp", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeCallUserExp", "json", req, runtime), new DescribeCallUserExpResponse());
    }

    public DescribeChannelJoinInfoResponse describeChannelJoinInfo(DescribeChannelJoinInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelJoinInfoWithOptions(request, headers, runtime);
    }

    public DescribeChannelJoinInfoResponse describeChannelJoinInfoWithOptions(DescribeChannelJoinInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelJoinInfo", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelJoinInfo", "json", req, runtime), new DescribeChannelJoinInfoResponse());
    }

    public DeleteAppFollowCallRuleResponse deleteAppFollowCallRule(DeleteAppFollowCallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAppFollowCallRuleWithOptions(request, headers, runtime);
    }

    public DeleteAppFollowCallRuleResponse deleteAppFollowCallRuleWithOptions(DeleteAppFollowCallRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteAppFollowCallRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/deleteAppFollowCallRule", "json", req, runtime), new DeleteAppFollowCallRuleResponse());
    }

    public DescribeAppExpMetricRuleListResponse describeAppExpMetricRuleList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppExpMetricRuleListWithOptions(headers, runtime);
    }

    public DescribeAppExpMetricRuleListResponse describeAppExpMetricRuleListWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppExpMetricRuleList", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/describeAppExpMetricRuleList", "json", req, runtime), new DescribeAppExpMetricRuleListResponse());
    }

    public DescribeChannelTopPubUserListResponse describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelTopPubUserListWithOptions(request, headers, runtime);
    }

    public DescribeChannelTopPubUserListResponse describeChannelTopPubUserListWithOptions(DescribeChannelTopPubUserListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelTopPubUserList", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelTopPubUserList", "json", req, runtime), new DescribeChannelTopPubUserListResponse());
    }

    public DescribeAppFollowCallRuleResponse describeAppFollowCallRule(DescribeAppFollowCallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppFollowCallRuleWithOptions(request, headers, runtime);
    }

    public DescribeAppFollowCallRuleResponse describeAppFollowCallRuleWithOptions(DescribeAppFollowCallRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppFollowCallRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/describeAppFollowCallRule", "json", req, runtime), new DescribeAppFollowCallRuleResponse());
    }

    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatDataWithOptions(DescribeUsageDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUsageDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/usage/describeUsageDistributionStatData", "json", req, runtime), new DescribeUsageDistributionStatDataResponse());
    }

    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageAreaDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatDataWithOptions(DescribeUsageAreaDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUsageAreaDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/usage/describeUsageAreaDistributionStatData", "json", req, runtime), new DescribeUsageAreaDistributionStatDataResponse());
    }

    public DescribeEndPointMetricDataResponse describeEndPointMetricData(DescribeEndPointMetricDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeEndPointMetricDataWithOptions(request, headers, runtime);
    }

    public DescribeEndPointMetricDataResponse describeEndPointMetricDataWithOptions(DescribeEndPointMetricDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubUserId)) {
            query.put("PubUserId", request.pubUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubCallIdList)) {
            query.put("PubCallIdList", request.pubCallIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeEndPointMetricData", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeEndPointMetricData", "json", req, runtime), new DescribeEndPointMetricDataResponse());
    }

    public DescribeAppConfigResponse describeAppConfig(DescribeAppConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAppConfigWithOptions(request, headers, runtime);
    }

    public DescribeAppConfigResponse describeAppConfigWithOptions(DescribeAppConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeAppConfig", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/describeAppConfig", "json", req, runtime), new DescribeAppConfigResponse());
    }

    public DescribeUsageOverallDataResponse describeUsageOverallData(DescribeUsageOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageOverallDataResponse describeUsageOverallDataWithOptions(DescribeUsageOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUsageOverallData", "2020-12-14", "HTTPS", "POST", "AK", "/api/usage/describeUsageOverallData", "json", req, runtime), new DescribeUsageOverallDataResponse());
    }

    public UpdateAppExpMetricRuleResponse updateAppExpMetricRule(UpdateAppExpMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppExpMetricRuleWithOptions(request, headers, runtime);
    }

    public UpdateAppExpMetricRuleResponse updateAppExpMetricRuleWithOptions(UpdateAppExpMetricRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAppExpMetricRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/updateAppExpMetricRule", "json", req, runtime), new UpdateAppExpMetricRuleResponse());
    }

    public DescribeFaultDiagnosisUserDetailResponse describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFaultDiagnosisUserDetailWithOptions(request, headers, runtime);
    }

    public DescribeFaultDiagnosisUserDetailResponse describeFaultDiagnosisUserDetailWithOptions(DescribeFaultDiagnosisUserDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultType)) {
            query.put("FaultType", request.faultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCallUserInfo)) {
            query.put("QueryCallUserInfo", request.queryCallUserInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeFaultDiagnosisUserDetail", "2020-12-14", "HTTPS", "POST", "AK", "/api/diagnosis/describeFaultDiagnosisUserDetail", "json", req, runtime), new DescribeFaultDiagnosisUserDetailResponse());
    }

    public DescribeChannelDistributionStatDataResponse describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeChannelDistributionStatDataResponse describeChannelDistributionStatDataWithOptions(DescribeChannelDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelDistributionStatData", "json", req, runtime), new DescribeChannelDistributionStatDataResponse());
    }

    public DescribeChannelUserMetricsResponse describeChannelUserMetrics(DescribeChannelUserMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeChannelUserMetricsWithOptions(request, headers, runtime);
    }

    public DescribeChannelUserMetricsResponse describeChannelUserMetricsWithOptions(DescribeChannelUserMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeChannelUserMetrics", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeChannelUserMetrics", "json", req, runtime), new DescribeChannelUserMetricsResponse());
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponse describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFaultDiagnosisFactorDistributionStatWithOptions(request, headers, runtime);
    }

    public DescribeFaultDiagnosisFactorDistributionStatResponse describeFaultDiagnosisFactorDistributionStatWithOptions(DescribeFaultDiagnosisFactorDistributionStatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeFaultDiagnosisFactorDistributionStat", "2020-12-14", "HTTPS", "POST", "AK", "/api/diagnosis/describeFaultDiagnosisFactorDistributionStat", "json", req, runtime), new DescribeFaultDiagnosisFactorDistributionStatResponse());
    }

    public DescribeRtcChannelListResponse describeRtcChannelList(DescribeRtcChannelListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcChannelListWithOptions(request, headers, runtime);
    }

    public DescribeRtcChannelListResponse describeRtcChannelListWithOptions(DescribeRtcChannelListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcChannelList", "2020-12-14", "HTTPS", "POST", "AK", "/api/channel/describeRtcChannelList", "json", req, runtime), new DescribeRtcChannelListResponse());
    }

    public DescribeFaultDiagnosisUserListResponse describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeFaultDiagnosisUserListWithOptions(request, headers, runtime);
    }

    public DescribeFaultDiagnosisUserListResponse describeFaultDiagnosisUserListWithOptions(DescribeFaultDiagnosisUserListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultTypes)) {
            query.put("FaultTypes", request.faultTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeFaultDiagnosisUserList", "2020-12-14", "HTTPS", "POST", "AK", "/api/diagnosis/describeFaultDiagnosisUserList", "json", req, runtime), new DescribeFaultDiagnosisUserListResponse());
    }

    public DescribeRtcChannelMetricListResponse describeRtcChannelMetricList(DescribeRtcChannelMetricListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcChannelMetricListWithOptions(request, headers, runtime);
    }

    public DescribeRtcChannelMetricListResponse describeRtcChannelMetricListWithOptions(DescribeRtcChannelMetricListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubUid)) {
            query.put("PubUid", request.pubUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUid)) {
            query.put("SubUid", request.subUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcChannelMetricList", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeRtcChannelMetricList", "json", req, runtime), new DescribeRtcChannelMetricListResponse());
    }

    public DescribeQoeMetricDataResponse describeQoeMetricData(DescribeQoeMetricDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQoeMetricDataWithOptions(request, headers, runtime);
    }

    public DescribeQoeMetricDataResponse describeQoeMetricDataWithOptions(DescribeQoeMetricDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQoeMetricData", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describeQoeMetricData", "json", req, runtime), new DescribeQoeMetricDataResponse());
    }

    public DescribePubUserListBySubUserResponse describePubUserListBySubUser(DescribePubUserListBySubUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describePubUserListBySubUserWithOptions(request, headers, runtime);
    }

    public DescribePubUserListBySubUserResponse describePubUserListBySubUserWithOptions(DescribePubUserListBySubUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribePubUserListBySubUser", "2020-12-14", "HTTPS", "POST", "AK", "/api/call/describePubUserListBySubUser", "json", req, runtime), new DescribePubUserListBySubUserResponse());
    }

    public UpdateAppFollowCallRuleResponse updateAppFollowCallRule(UpdateAppFollowCallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppFollowCallRuleWithOptions(request, headers, runtime);
    }

    public UpdateAppFollowCallRuleResponse updateAppFollowCallRuleWithOptions(UpdateAppFollowCallRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("UpdateAppFollowCallRule", "2020-12-14", "HTTPS", "POST", "AK", "/api/config/updateAppFollowCallRule", "json", req, runtime), new UpdateAppFollowCallRuleResponse());
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityOsSdkVersionDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatDataWithOptions(DescribeQualityOsSdkVersionDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQualityOsSdkVersionDistributionStatData", "2020-12-14", "HTTPS", "POST", "AK", "/api/quality/describeQualityOsSdkVersionDistributionStatData", "json", req, runtime), new DescribeQualityOsSdkVersionDistributionStatDataResponse());
    }

    public DescribeRtcRecordMetricDataResponse describeRtcRecordMetricData(DescribeRtcRecordMetricDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcRecordMetricDataWithOptions(request, headers, runtime);
    }

    public DescribeRtcRecordMetricDataResponse describeRtcRecordMetricDataWithOptions(DescribeRtcRecordMetricDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRtcRecordMetricData", "2020-12-14", "HTTPS", "POST", "AK", "/api/record/describeRtcRecordMetricData", "json", req, runtime), new DescribeRtcRecordMetricDataResponse());
    }

    public DescribeQualityOverallDataResponse describeQualityOverallData(DescribeQualityOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityOverallDataResponse describeQualityOverallDataWithOptions(DescribeQualityOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQualityOverallData", "2020-12-14", "HTTPS", "POST", "AK", "/api/quality/describeQualityOverallData", "json", req, runtime), new DescribeQualityOverallDataResponse());
    }
}

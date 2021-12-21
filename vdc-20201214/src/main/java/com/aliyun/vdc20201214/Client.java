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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppExpMetricRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/deleteAppExpMetricRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppExpMetricRuleResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppFollowCallRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/deleteAppFollowCallRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppFollowCallRuleResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppConfig"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/describeAppConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppConfigResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppExpMetricRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/describeAppExpMetricRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppExpMetricRuleResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppExpMetricRuleList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/describeAppExpMetricRuleList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppExpMetricRuleListResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppFollowCallRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/describeAppFollowCallRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppFollowCallRuleResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppFollowCallRuleList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/describeAppFollowCallRuleList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppFollowCallRuleListResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCall"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeCall"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.callStatus)) {
            query.put("CallStatus", request.callStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            query.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCallList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeCallList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallListResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCallListTest"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeCallListTest"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallListTestResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCallUserExp"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeCallUserExp"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallUserExpResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelAreaDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelAreaDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelAreaDistributionStatDataResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelDistributionStatDataResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelJoinInfo"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelJoinInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelJoinInfoResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelOverallData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelOverallData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelOverallDataResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelTopPubUserList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelTopPubUserList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelTopPubUserListResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelUserMetrics"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeChannelUserMetrics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelUserMetricsResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndPointEventList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeEndPointEventList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndPointEventListResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubCallIdList)) {
            query.put("PubCallIdList", request.pubCallIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubUserId)) {
            query.put("PubUserId", request.pubUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndPointMetricData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeEndPointMetricData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndPointMetricDataResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisFactorDistributionStat"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/diagnosis/describeFaultDiagnosisFactorDistributionStat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisFactorDistributionStatResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisOverallData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/diagnosis/describeFaultDiagnosisOverallData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisOverallDataResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.faultType)) {
            query.put("FaultType", request.faultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCallUserInfo)) {
            query.put("QueryCallUserInfo", request.queryCallUserInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisUserDetail"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/diagnosis/describeFaultDiagnosisUserDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisUserDetailResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisUserList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/diagnosis/describeFaultDiagnosisUserList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisUserListResponse());
    }

    public DescribeIceDurPeriodByDaySubTypeResponse describeIceDurPeriodByDaySubType(DescribeIceDurPeriodByDaySubTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeIceDurPeriodByDaySubTypeWithOptions(request, headers, runtime);
    }

    public DescribeIceDurPeriodByDaySubTypeResponse describeIceDurPeriodByDaySubTypeWithOptions(DescribeIceDurPeriodByDaySubTypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIceDurPeriodByDaySubType"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/ice/describeIceDurPeriodByDaySubType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIceDurPeriodByDaySubTypeResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIceDurSummaryOverview"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/ice/describeIceDurSummaryOverview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIceDurSummaryOverviewResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePubUserListBySubUser"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describePubUserListBySubUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePubUserListBySubUserResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQoeMetricData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeQoeMetricData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQoeMetricDataResponse());
    }

    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityAreaDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatDataWithOptions(DescribeQualityAreaDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityAreaDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/quality/describeQualityAreaDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityAreaDistributionStatDataResponse());
    }

    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatDataWithOptions(DescribeQualityDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/quality/describeQualityDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityDistributionStatDataResponse());
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityOsSdkVersionDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatDataWithOptions(DescribeQualityOsSdkVersionDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityOsSdkVersionDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/quality/describeQualityOsSdkVersionDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityOsSdkVersionDistributionStatDataResponse());
    }

    public DescribeQualityOverallDataResponse describeQualityOverallData(DescribeQualityOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQualityOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeQualityOverallDataResponse describeQualityOverallDataWithOptions(DescribeQualityOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityOverallData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/quality/describeQualityOverallData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityOverallDataResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelDetails"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeRtcChannelDetails"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelDetailsResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeRtcChannelList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelListResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubUid)) {
            query.put("PubUid", request.pubUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUid)) {
            query.put("SubUid", request.subUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelMetricList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeRtcChannelMetricList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelMetricListResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelUsers"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/channel/describeRtcChannelUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelUsersResponse());
    }

    public DescribeRtcRecordMetricDataResponse describeRtcRecordMetricData(DescribeRtcRecordMetricDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRtcRecordMetricDataWithOptions(request, headers, runtime);
    }

    public DescribeRtcRecordMetricDataResponse describeRtcRecordMetricDataWithOptions(DescribeRtcRecordMetricDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcRecordMetricData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/record/describeRtcRecordMetricData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcRecordMetricDataResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcUserEventList"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/call/describeRtcUserEventList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcUserEventListResponse());
    }

    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageAreaDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatDataWithOptions(DescribeUsageAreaDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageAreaDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/usage/describeUsageAreaDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageAreaDistributionStatDataResponse());
    }

    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatDataWithOptions(DescribeUsageDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/usage/describeUsageDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageDistributionStatDataResponse());
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageOsSdkVersionDistributionStatDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatDataWithOptions(DescribeUsageOsSdkVersionDistributionStatDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageOsSdkVersionDistributionStatData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/usage/describeUsageOsSdkVersionDistributionStatData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageOsSdkVersionDistributionStatDataResponse());
    }

    public DescribeUsageOverallDataResponse describeUsageOverallData(DescribeUsageOverallDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUsageOverallDataWithOptions(request, headers, runtime);
    }

    public DescribeUsageOverallDataResponse describeUsageOverallDataWithOptions(DescribeUsageOverallDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageOverallData"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/usage/describeUsageOverallData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageOverallDataResponse());
    }

    public UpdateAppExpMetricRuleResponse updateAppExpMetricRule(UpdateAppExpMetricRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppExpMetricRuleWithOptions(request, headers, runtime);
    }

    public UpdateAppExpMetricRuleResponse updateAppExpMetricRuleWithOptions(UpdateAppExpMetricRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppExpMetricRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/updateAppExpMetricRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppExpMetricRuleResponse());
    }

    public UpdateAppFollowCallRuleResponse updateAppFollowCallRule(UpdateAppFollowCallRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAppFollowCallRuleWithOptions(request, headers, runtime);
    }

    public UpdateAppFollowCallRuleResponse updateAppFollowCallRuleWithOptions(UpdateAppFollowCallRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rule)) {
            query.put("Rule", request.rule);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppFollowCallRule"),
            new TeaPair("version", "2020-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/config/updateAppFollowCallRule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppFollowCallRuleResponse());
    }
}

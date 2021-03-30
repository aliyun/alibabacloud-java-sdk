// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200804;

import com.aliyun.tea.*;
import com.aliyun.quickbi_public20200804.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("cn-hongkong", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "quickbi-public-share.aliyuncs.com"),
            new TeaPair("eu-central-1", "quickbi-public-share.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("quickbi-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddShareReportResponse addShareReportWithOptions(AddShareReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("WorksId", request.worksId);
        query.put("ShareToId", request.shareToId);
        query.put("ShareToType", request.shareToType);
        query.put("ExpireDate", request.expireDate);
        query.put("AuthPoint", request.authPoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShareReport"),
            new TeaPair("version", "2020-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShareReportResponse());
    }

    public AddShareReportResponse addShareReport(AddShareReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addShareReportWithOptions(request, runtime);
    }

    public CancelReportShareResponse cancelReportShareWithOptions(CancelReportShareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ReportId", request.reportId);
        query.put("ShareToIds", request.shareToIds);
        query.put("ShareToType", request.shareToType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelReportShare"),
            new TeaPair("version", "2020-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelReportShareResponse());
    }

    public CancelReportShareResponse cancelReportShare(CancelReportShareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelReportShareWithOptions(request, runtime);
    }

    public QueryShareListResponse queryShareListWithOptions(QueryShareListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ReportId", request.reportId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShareList"),
            new TeaPair("version", "2020-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShareListResponse());
    }

    public QueryShareListResponse queryShareList(QueryShareListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryShareListWithOptions(request, runtime);
    }

    public QuerySharesToUserListResponse querySharesToUserListWithOptions(QuerySharesToUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySharesToUserList"),
            new TeaPair("version", "2020-08-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySharesToUserListResponse());
    }

    public QuerySharesToUserListResponse querySharesToUserList(QuerySharesToUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySharesToUserListWithOptions(request, runtime);
    }
}

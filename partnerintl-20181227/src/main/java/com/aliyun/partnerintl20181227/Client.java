// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227;

import com.aliyun.tea.*;
import com.aliyun.partnerintl20181227.models.*;
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
        this._endpoint = this.getEndpoint("partnerintl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeProductResponse describeProductWithOptions(DescribeProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerBid)) {
            body.put("CallerBid", request.callerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("CallerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eagleEyeRpcId)) {
            body.put("EagleEyeRpcId", request.eagleEyeRpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eagleEyeTraceId)) {
            body.put("EagleEyeTraceId", request.eagleEyeTraceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eagleEyeUserData)) {
            body.put("EagleEyeUserData", request.eagleEyeUserData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDraft)) {
            body.put("QueryDraft", request.queryDraft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            body.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerBid)) {
            body.put("StsTokenCallerBid", request.stsTokenCallerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenCallerUid)) {
            body.put("StsTokenCallerUid", request.stsTokenCallerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenPrincipalId)) {
            body.put("StsTokenPrincipalId", request.stsTokenPrincipalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenRoleId)) {
            body.put("StsTokenRoleId", request.stsTokenRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stsTokenUserId)) {
            body.put("StsTokenUserId", request.stsTokenUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProduct"),
            new TeaPair("version", "2018-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductResponse());
    }

    public DescribeProductResponse describeProduct(DescribeProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProductWithOptions(request, runtime);
    }

    public QueryCommodityByServiceIdResponse queryCommodityByServiceIdWithOptions(QueryCommodityByServiceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceIds)) {
            body.put("ServiceIds", request.serviceIds);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommodityByServiceId"),
            new TeaPair("version", "2018-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommodityByServiceIdResponse());
    }

    public QueryCommodityByServiceIdResponse queryCommodityByServiceId(QueryCommodityByServiceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommodityByServiceIdWithOptions(request, runtime);
    }

    public QueryCommodityBySupplierUidResponse queryCommodityBySupplierUidWithOptions(QueryCommodityBySupplierUidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierUid)) {
            body.put("SupplierUid", request.supplierUid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommodityBySupplierUid"),
            new TeaPair("version", "2018-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommodityBySupplierUidResponse());
    }

    public QueryCommodityBySupplierUidResponse queryCommodityBySupplierUid(QueryCommodityBySupplierUidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommodityBySupplierUidWithOptions(request, runtime);
    }

    public QueryImageIdResponse queryImageIdWithOptions(QueryImageIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("Version", request.version);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryImageId"),
            new TeaPair("version", "2018-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryImageIdResponse());
    }

    public QueryImageIdResponse queryImageId(QueryImageIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryImageIdWithOptions(request, runtime);
    }

    public QuerySupplierDetailBySupplierUidResponse querySupplierDetailBySupplierUidWithOptions(QuerySupplierDetailBySupplierUidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierUids)) {
            body.put("SupplierUids", request.supplierUids);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupplierDetailBySupplierUid"),
            new TeaPair("version", "2018-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupplierDetailBySupplierUidResponse());
    }

    public QuerySupplierDetailBySupplierUidResponse querySupplierDetailBySupplierUid(QuerySupplierDetailBySupplierUidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySupplierDetailBySupplierUidWithOptions(request, runtime);
    }
}

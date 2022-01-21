// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227;

import com.aliyun.tea.*;
import com.aliyun.resellertrade20191227.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-south-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-chengdu", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-edge-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-fujian", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-wuhan", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-central-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "resellertrade.aliyuncs.com"),
            new TeaPair("me-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("us-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("us-west-1", "resellertrade.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resellertrade", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetCustomerListResponse getCustomerListWithOptions(GetCustomerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerList"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList(GetCustomerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerListWithOptions(request, runtime);
    }

    public GetRelationResponse getRelationWithOptions(GetRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRelation"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRelationResponse());
    }

    public GetRelationResponse getRelation(GetRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRelationWithOptions(request, runtime);
    }

    public GetResellerPayOrderResponse getResellerPayOrderWithOptions(GetResellerPayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResellerPayOrder"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResellerPayOrderResponse());
    }

    public GetResellerPayOrderResponse getResellerPayOrder(GetResellerPayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResellerPayOrderWithOptions(request, runtime);
    }

    public LabelPartnerUserResponse labelPartnerUserWithOptions(LabelPartnerUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPK)) {
            body.put("UserPK", request.userPK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTag)) {
            body.put("UserTag", request.userTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LabelPartnerUser"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LabelPartnerUserResponse());
    }

    public LabelPartnerUserResponse labelPartnerUser(LabelPartnerUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.labelPartnerUserWithOptions(request, runtime);
    }

    public MigrateResourceResponse migrateResourceWithOptions(MigrateResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            body.put("ActionCode", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateResource"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateResourceResponse());
    }

    public MigrateResourceResponse migrateResource(MigrateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.migrateResourceWithOptions(request, runtime);
    }

    public PayResultCallbackResponse payResultCallbackWithOptions(PayResultCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payStatus)) {
            query.put("PayStatus", request.payStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payTime)) {
            query.put("PayTime", request.payTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PayResultCallback"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayResultCallbackResponse());
    }

    public PayResultCallbackResponse payResultCallback(PayResultCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payResultCallbackWithOptions(request, runtime);
    }

    public TransferResourceResponse transferResourceWithOptions(TransferResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            body.put("ActionCode", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferResource"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferResourceResponse());
    }

    public TransferResourceResponse transferResource(TransferResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferResourceWithOptions(request, runtime);
    }
}

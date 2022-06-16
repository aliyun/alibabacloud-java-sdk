// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520;

import com.aliyun.tea.*;
import com.aliyun.xgippop20220520.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("xgippop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ChangeApplicationInfoResponse changeApplicationInfoWithOptions(ChangeApplicationInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeList)) {
            body.put("AppTypeList", request.appTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingList)) {
            body.put("AppingList", request.appingList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCode)) {
            body.put("ItemCode", request.itemCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeApplicationInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeApplicationInfoResponse());
    }

    public ChangeApplicationInfoResponse changeApplicationInfo(ChangeApplicationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeApplicationInfoWithOptions(request, runtime);
    }

    public CreateApplicationInfoResponse createApplicationInfoWithOptions(CreateApplicationInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeList)) {
            body.put("AppTypeList", request.appTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingList)) {
            body.put("AppingList", request.appingList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCode)) {
            body.put("ItemCode", request.itemCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationInfoResponse());
    }

    public CreateApplicationInfoResponse createApplicationInfo(CreateApplicationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationInfoWithOptions(request, runtime);
    }

    public GetAliyunXgipTokenResponse getAliyunXgipTokenWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAliyunXgipToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAliyunXgipTokenResponse());
    }

    public GetAliyunXgipTokenResponse getAliyunXgipToken() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAliyunXgipTokenWithOptions(runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    public GetFreeFlowInstanceResponse getFreeFlowInstanceWithOptions(GetFreeFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeFlowInstance"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeFlowInstanceResponse());
    }

    public GetFreeFlowInstanceResponse getFreeFlowInstance(GetFreeFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeFlowInstanceWithOptions(request, runtime);
    }

    public GetFreeFlowProductListResponse getFreeFlowProductListWithOptions(GetFreeFlowProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeFlowProductList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeFlowProductListResponse());
    }

    public GetFreeFlowProductListResponse getFreeFlowProductList(GetFreeFlowProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeFlowProductListWithOptions(request, runtime);
    }

    public GetFreeFlowUsageResponse getFreeFlowUsageWithOptions(GetFreeFlowUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeFlowUsage"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeFlowUsageResponse());
    }

    public GetFreeFlowUsageResponse getFreeFlowUsage(GetFreeFlowUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeFlowUsageWithOptions(request, runtime);
    }

    public GetFreeFlowUsageStatisticResponse getFreeFlowUsageStatisticWithOptions(GetFreeFlowUsageStatisticRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFreeFlowUsageStatistic"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFreeFlowUsageStatisticResponse());
    }

    public GetFreeFlowUsageStatisticResponse getFreeFlowUsageStatistic(GetFreeFlowUsageStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFreeFlowUsageStatisticWithOptions(request, runtime);
    }

    public GetOrderFreeFlowProductStatusResponse getOrderFreeFlowProductStatusWithOptions(GetOrderFreeFlowProductStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderFreeFlowProductStatus"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderFreeFlowProductStatusResponse());
    }

    public GetOrderFreeFlowProductStatusResponse getOrderFreeFlowProductStatus(GetOrderFreeFlowProductStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderFreeFlowProductStatusWithOptions(request, runtime);
    }

    public ModifyApplicationResponse modifyApplicationWithOptions(ModifyApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            body.put("AppCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeList)) {
            body.put("AppTypeList", request.appTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingList)) {
            body.put("AppingList", request.appingList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApplication"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApplicationResponse());
    }

    public ModifyApplicationResponse modifyApplication(ModifyApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyApplicationWithOptions(request, runtime);
    }

    public OrderFreeFlowProductResponse orderFreeFlowProductWithOptions(OrderFreeFlowProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerFlowRequestId)) {
            query.put("CustomerFlowRequestId", request.customerFlowRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flowProductId)) {
            query.put("FlowProductId", request.flowProductId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lasting)) {
            query.put("Lasting", request.lasting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobileNumber)) {
            query.put("MobileNumber", request.mobileNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseOrderId)) {
            query.put("PurchaseOrderId", request.purchaseOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderFreeFlowProduct"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderFreeFlowProductResponse());
    }

    public OrderFreeFlowProductResponse orderFreeFlowProduct(OrderFreeFlowProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.orderFreeFlowProductWithOptions(request, runtime);
    }

    public SaveApplicationInfoResponse saveApplicationInfoWithOptions(SaveApplicationInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            body.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appTypeList)) {
            body.put("AppTypeList", request.appTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appingList)) {
            body.put("AppingList", request.appingList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCode)) {
            body.put("ItemCode", request.itemCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveApplicationInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveApplicationInfoResponse());
    }

    public SaveApplicationInfoResponse saveApplicationInfo(SaveApplicationInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveApplicationInfoWithOptions(request, runtime);
    }

    public SdkValidateStatusResponse sdkValidateStatusWithOptions(SdkValidateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SdkValidateStatus"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SdkValidateStatusResponse());
    }

    public SdkValidateStatusResponse sdkValidateStatus(SdkValidateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sdkValidateStatusWithOptions(request, runtime);
    }

    public ValidateStatusResponse validateStatusWithOptions(ValidateStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateStatus"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateStatusResponse());
    }

    public ValidateStatusResponse validateStatus(ValidateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateStatusWithOptions(request, runtime);
    }
}

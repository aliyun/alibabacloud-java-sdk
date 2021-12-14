// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715;

import com.aliyun.tea.*;
import com.aliyun.savingplan20200715.models.*;
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
        this._endpoint = this.getEndpoint("savingplan", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CalculateSavingsPlansResponse calculateSavingsPlansWithOptions(CalculateSavingsPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CommodityCode", request.commodityCode);
        query.put("Cycle", request.cycle);
        query.put("FromAppCode", request.fromAppCode);
        query.put("FromAppName", request.fromAppName);
        query.put("PayMode", request.payMode);
        query.put("RequestId", request.requestId);
        query.put("SpecCode", request.specCode);
        query.put("SpnType", request.spnType);
        query.put("UserId", request.userId);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("Instance", request.instance);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CalculateSavingsPlans"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CalculateSavingsPlansResponse());
    }

    public CalculateSavingsPlansResponse calculateSavingsPlans(CalculateSavingsPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.calculateSavingsPlansWithOptions(request, runtime);
    }

    public CheckResourceActionResponse checkResourceActionWithOptions(CheckResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bid", request.bid);
        query.put("Country", request.country);
        query.put("GmtWakeup", request.gmtWakeup);
        query.put("Hid", request.hid);
        query.put("Interrupt", request.interrupt);
        query.put("Invoker", request.invoker);
        query.put("Level", request.level);
        query.put("Message", request.message);
        query.put("Pk", request.pk);
        query.put("Prompt", request.prompt);
        query.put("Success", request.success);
        query.put("TaskExtraData", request.taskExtraData);
        query.put("TaskIdentifier", request.taskIdentifier);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourceAction"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourceActionResponse());
    }

    public CheckResourceActionResponse checkResourceAction(CheckResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceActionWithOptions(request, runtime);
    }

    public CompleteCommodityResponse completeCommodityWithOptions(CompleteCommodityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteCommodity"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteCommodityResponse());
    }

    public CompleteCommodityResponse completeCommodity(CompleteCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeCommodityWithOptions(request, runtime);
    }

    public CompleteTradeResponse completeTradeWithOptions(CompleteTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteTrade"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteTradeResponse());
    }

    public CompleteTradeResponse completeTrade(CompleteTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeTradeWithOptions(request, runtime);
    }

    public LogicalDeleteResourceActionResponse logicalDeleteResourceActionWithOptions(LogicalDeleteResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bid", request.bid);
        query.put("Country", request.country);
        query.put("GmtWakeup", request.gmtWakeup);
        query.put("Hid", request.hid);
        query.put("Interrupt", request.interrupt);
        query.put("Invoker", request.invoker);
        query.put("Message", request.message);
        query.put("Pk", request.pk);
        query.put("Success", request.success);
        query.put("TaskExtraData", request.taskExtraData);
        query.put("TaskIdentifier", request.taskIdentifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogicalDeleteResourceAction"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogicalDeleteResourceActionResponse());
    }

    public LogicalDeleteResourceActionResponse logicalDeleteResourceAction(LogicalDeleteResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logicalDeleteResourceActionWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PayOrderCallback"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public PhysicalDeleteResourceActionResponse physicalDeleteResourceActionWithOptions(PhysicalDeleteResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Bid", request.bid);
        query.put("Country", request.country);
        query.put("GmtWakeup", request.gmtWakeup);
        query.put("Hid", request.hid);
        query.put("Interrupt", request.interrupt);
        query.put("Invoker", request.invoker);
        query.put("Message", request.message);
        query.put("Pk", request.pk);
        query.put("Success", request.success);
        query.put("TaskExtraData", request.taskExtraData);
        query.put("TaskIdentifier", request.taskIdentifier);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PhysicalDeleteResourceAction"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PhysicalDeleteResourceActionResponse());
    }

    public PhysicalDeleteResourceActionResponse physicalDeleteResourceAction(PhysicalDeleteResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteResourceActionWithOptions(request, runtime);
    }

    public ProcessMessageResponse processMessageWithOptions(ProcessMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessMessage"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessMessageResponse());
    }

    public ProcessMessageResponse processMessage(ProcessMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processMessageWithOptions(request, runtime);
    }

    public QuerySavingPlanInstanceInnerResponse querySavingPlanInstanceInnerWithOptions(QuerySavingPlanInstanceInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("EndTime", request.endTime);
        query.put("FromAppCode", request.fromAppCode);
        query.put("FromAppName", request.fromAppName);
        query.put("InstanceCode", request.instanceCode);
        query.put("InstanceFamily", request.instanceFamily);
        query.put("PageSize", request.pageSize);
        query.put("Region", request.region);
        query.put("RequestId", request.requestId);
        query.put("SpnType", request.spnType);
        query.put("StartTime", request.startTime);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingPlanInstanceInner"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingPlanInstanceInnerResponse());
    }

    public QuerySavingPlanInstanceInnerResponse querySavingPlanInstanceInner(QuerySavingPlanInstanceInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingPlanInstanceInnerWithOptions(request, runtime);
    }

    public VerifyTradeResponse verifyTradeWithOptions(VerifyTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("data", request.data);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyTrade"),
            new TeaPair("version", "2020-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyTradeResponse());
    }

    public VerifyTradeResponse verifyTrade(VerifyTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyTradeWithOptions(request, runtime);
    }
}

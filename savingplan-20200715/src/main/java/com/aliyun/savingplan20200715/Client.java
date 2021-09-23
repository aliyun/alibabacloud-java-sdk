// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715;

import com.aliyun.tea.*;
import com.aliyun.savingplan20200715.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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

    public CompleteTradeResponse completeTradeWithOptions(CompleteTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteTrade", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteTradeResponse());
    }

    public CompleteTradeResponse completeTrade(CompleteTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeTradeWithOptions(request, runtime);
    }

    public LogicalDeleteResourceActionResponse logicalDeleteResourceActionWithOptions(LogicalDeleteResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LogicalDeleteResourceAction", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new LogicalDeleteResourceActionResponse());
    }

    public LogicalDeleteResourceActionResponse logicalDeleteResourceAction(LogicalDeleteResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.logicalDeleteResourceActionWithOptions(request, runtime);
    }

    public QuerySavingPlanInstanceInnerResponse querySavingPlanInstanceInnerWithOptions(QuerySavingPlanInstanceInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySavingPlanInstanceInner", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySavingPlanInstanceInnerResponse());
    }

    public QuerySavingPlanInstanceInnerResponse querySavingPlanInstanceInner(QuerySavingPlanInstanceInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingPlanInstanceInnerWithOptions(request, runtime);
    }

    public CheckResourceActionResponse checkResourceActionWithOptions(CheckResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResourceAction", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourceActionResponse());
    }

    public CheckResourceActionResponse checkResourceAction(CheckResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceActionWithOptions(request, runtime);
    }

    public VerifyTradeResponse verifyTradeWithOptions(VerifyTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyTrade", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyTradeResponse());
    }

    public VerifyTradeResponse verifyTrade(VerifyTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyTradeWithOptions(request, runtime);
    }

    public ProcessMessageResponse processMessageWithOptions(ProcessMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessMessage", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessMessageResponse());
    }

    public ProcessMessageResponse processMessage(ProcessMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processMessageWithOptions(request, runtime);
    }

    public CompleteCommodityResponse completeCommodityWithOptions(CompleteCommodityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CompleteCommodity", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new CompleteCommodityResponse());
    }

    public CompleteCommodityResponse completeCommodity(CompleteCommodityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.completeCommodityWithOptions(request, runtime);
    }

    public CalculateSavingsPlansResponse calculateSavingsPlansWithOptions(CalculateSavingsPlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CalculateSavingsPlans", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new CalculateSavingsPlansResponse());
    }

    public CalculateSavingsPlansResponse calculateSavingsPlans(CalculateSavingsPlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.calculateSavingsPlansWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PayOrderCallback", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public PhysicalDeleteResourceActionResponse physicalDeleteResourceActionWithOptions(PhysicalDeleteResourceActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PhysicalDeleteResourceAction", "2020-07-15", "HTTPS", "POST", "AK", "json", req, runtime), new PhysicalDeleteResourceActionResponse());
    }

    public PhysicalDeleteResourceActionResponse physicalDeleteResourceAction(PhysicalDeleteResourceActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.physicalDeleteResourceActionWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterpspi1_0_0;

import com.aliyun.tea.*;
import com.aliyun.nbfplangjpterpspi1_0_0.models.*;
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
        this._endpoint = this.getEndpoint("nbf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreatePlanOrderResponse createPlanOrder(CreatePlanOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlanOrderWithOptions(request, headers, runtime);
    }

    public CreatePlanOrderResponse createPlanOrderWithOptions(CreatePlanOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.areaCode)) {
            body.put("areaCode", request.areaCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inboundDeadline)) {
            body.put("inboundDeadline", request.inboundDeadline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            body.put("items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerErpCode)) {
            body.put("outerErpCode", request.outerErpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerOrderCode)) {
            body.put("outerOrderCode", request.outerOrderCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplierId)) {
            body.put("supplierId", request.supplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toStoreCode)) {
            body.put("toStoreCode", request.toStoreCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transportType)) {
            body.put("transportType", request.transportType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlanOrder"),
            new TeaPair("version", "plan-gjpt-erp-spi1_0_0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/plan-gjpt-erp-spi/1_0_0/createPlanOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePlanOrderResponse());
    }
}

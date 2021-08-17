// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opt20210730;

import com.aliyun.tea.*;
import com.aliyun.opt20210730.models.*;
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
        this._endpoint = this.getEndpoint("opt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetOrderUsageResponse getOrderUsageWithOptions(GetOrderUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOrderUsage", "2021-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetOrderUsageResponse());
    }

    public GetOrderUsageResponse getOrderUsage(GetOrderUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderUsageWithOptions(request, runtime);
    }

    public GetOrderInfoResponse getOrderInfoWithOptions(GetOrderInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOrderInfo", "2021-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetOrderInfoResponse());
    }

    public GetOrderInfoResponse getOrderInfo(GetOrderInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderInfoWithOptions(request, runtime);
    }

    public GetOpenStatusResponse getOpenStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetOpenStatus", "2021-07-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetOpenStatusResponse());
    }

    public GetOpenStatusResponse getOpenStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpenStatusWithOptions(runtime);
    }
}

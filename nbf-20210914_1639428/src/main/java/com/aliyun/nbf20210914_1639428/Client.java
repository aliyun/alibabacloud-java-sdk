// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210914_1639428;

import com.aliyun.tea.*;
import com.aliyun.nbf20210914_1639428.models.*;
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

    public MultiComplexResponse multiComplex(MultiComplexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multiComplexWithOptions(request, headers, runtime);
    }

    public MultiComplexResponse multiComplexWithOptions(MultiComplexRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MultiComplexShrinkRequest request = new MultiComplexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.arg2))) {
            request.arg2Shrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.arg2), "arg2", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arg0)) {
            query.put("arg0", request.arg0);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg1)) {
            query.put("arg1", request.arg1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg2Shrink)) {
            query.put("arg2", request.arg2Shrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MultiComplex", "2021-09-14_16-39-42-8", "HTTPS", "POST", "AK", "/caiheRoaProduct/8_0_0/multiComplex", "json", req, runtime), new MultiComplexResponse());
    }
}

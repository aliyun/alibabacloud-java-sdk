// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210804_144622100;

import com.aliyun.tea.*;
import com.aliyun.nbftestpop20210804_144622100.models.*;
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
        this._endpoint = this.getEndpoint("nbftestpop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ArrayOutputResponse arrayOutput(ArrayOutputRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.arrayOutputWithOptions(request, headers, runtime);
    }

    public ArrayOutputResponse arrayOutputWithOptions(ArrayOutputRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ArrayOutputShrinkRequest request = new ArrayOutputShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.input))) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.input), "input", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            query.put("input", request.inputShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ArrayOutput", "2021-08-04_14-46-22-100", "HTTP", "POST", "AK", "/kxo/arrayoutput", "array", req, runtime), new ArrayOutputResponse());
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210802_190553680;

import com.aliyun.tea.*;
import com.aliyun.nbftestpop20210802_190553680.models.*;
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

    public AddResponse add() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        AddHeaders headers = new AddHeaders();
        return this.addWithOptions(headers, runtime);
    }

    public AddResponse addWithOptions(AddHeaders headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.x)) {
            realHeaders.put("x", headers.x);
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.y)) {
            realHeaders.put("y", headers.y);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        return TeaModel.toModel(this.doROARequest("Add", "2021-08-02_19-05-53-680", "HTTP", "GET", "AK", "/kxFour/headerTest", "json", req, runtime), new AddResponse());
    }
}

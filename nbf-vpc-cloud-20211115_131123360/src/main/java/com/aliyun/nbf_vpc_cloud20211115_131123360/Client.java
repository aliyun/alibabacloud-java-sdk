// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf_vpc_cloud20211115_131123360;

import com.aliyun.tea.*;
import com.aliyun.nbf_vpc_cloud20211115_131123360.models.*;
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
        this._endpoint = this.getEndpoint("nbf-vpc-cloud", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AdadaAResponse adadaA() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.adadaAWithOptions(headers, runtime);
    }

    public AdadaAResponse adadaAWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("AdadaA", "2021-11-15_13-11-23-360", "HTTP", "POST", "AK", "/caihe_cloud_product_1/1_0_0/adadaA", "json", req, runtime), new AdadaAResponse());
    }

    public YxTestApiResponse yxTestApi() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.yxTestApiWithOptions(headers, runtime);
    }

    public YxTestApiResponse yxTestApiWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("YxTestApi", "2021-11-15_13-11-23-360", "HTTPS", "POST", "AK", "/caihe_cloud_product_1/1_0_0/yxTestApi", "json", req, runtime), new YxTestApiResponse());
    }
}

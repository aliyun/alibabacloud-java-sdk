// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027;

import com.aliyun.tea.*;
import com.aliyun.reid_cloud20201027.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("reid_cloud", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ExtractFaceFeatureCROResponse extractFaceFeatureCROWithOptions(ExtractFaceFeatureCRORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ExtractFaceFeatureCRO", "2020-10-27", "HTTPS", "GET", "AK", "json", req, runtime), new ExtractFaceFeatureCROResponse());
    }

    public ExtractFaceFeatureCROResponse extractFaceFeatureCRO(ExtractFaceFeatureCRORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractFaceFeatureCROWithOptions(request, runtime);
    }

    public ExtractFaceAttributeCROResponse extractFaceAttributeCROWithOptions(ExtractFaceAttributeCRORequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExtractFaceAttributeCRO", "2020-10-27", "HTTPS", "POST", "AK", "json", req, runtime), new ExtractFaceAttributeCROResponse());
    }

    public ExtractFaceAttributeCROResponse extractFaceAttributeCRO(ExtractFaceAttributeCRORequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.extractFaceAttributeCROWithOptions(request, runtime);
    }
}

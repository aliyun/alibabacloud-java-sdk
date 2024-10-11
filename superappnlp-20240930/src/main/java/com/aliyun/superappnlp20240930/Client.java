// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.superappnlp20240930;

import com.aliyun.tea.*;
import com.aliyun.superappnlp20240930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("superappnlp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>地址解析</p>
     * 
     * @param request NlpAddressNormalizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NlpAddressNormalizationResponse
     */
    public NlpAddressNormalizationResponse nlpAddressNormalizationWithOptions(NlpAddressNormalizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityStdManual)) {
            query.put("CityStdManual", request.cityStdManual);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityStr)) {
            query.put("CityStr", request.cityStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtStdManual)) {
            query.put("DistrictStdManual", request.districtStdManual);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceStdManual)) {
            query.put("ProvinceStdManual", request.provinceStdManual);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceStr)) {
            query.put("ProvinceStr", request.provinceStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStr)) {
            query.put("QueryStr", request.queryStr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NlpAddressNormalization"),
            new TeaPair("version", "2024-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NlpAddressNormalizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>地址解析</p>
     * 
     * @param request NlpAddressNormalizationRequest
     * @return NlpAddressNormalizationResponse
     */
    public NlpAddressNormalizationResponse nlpAddressNormalization(NlpAddressNormalizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.nlpAddressNormalizationWithOptions(request, runtime);
    }
}

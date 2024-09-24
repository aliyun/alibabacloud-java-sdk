// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222;

import com.aliyun.tea.*;
import com.aliyun.osssddp20240222.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("osssddp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>查看用户的敏感数据保护版本信息</p>
     * 
     * @param request GetSddpVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSddpVersionResponse
     */
    public GetSddpVersionResponse getSddpVersionWithOptions(GetSddpVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSddpVersion"),
            new TeaPair("version", "2024-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSddpVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看用户的敏感数据保护版本信息</p>
     * 
     * @param request GetSddpVersionRequest
     * @return GetSddpVersionResponse
     */
    public GetSddpVersionResponse getSddpVersion(GetSddpVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSddpVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>升级敏感数据保护版本</p>
     * 
     * @param request UpgradeSddpVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeSddpVersionResponse
     */
    public UpgradeSddpVersionResponse upgradeSddpVersionWithOptions(UpgradeSddpVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossVersion)) {
            query.put("OssVersion", request.ossVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeSddpVersion"),
            new TeaPair("version", "2024-02-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeSddpVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>升级敏感数据保护版本</p>
     * 
     * @param request UpgradeSddpVersionRequest
     * @return UpgradeSddpVersionResponse
     */
    public UpgradeSddpVersionResponse upgradeSddpVersion(UpgradeSddpVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeSddpVersionWithOptions(request, runtime);
    }
}

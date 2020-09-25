// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20160316;

import com.aliyun.tea.*;
import com.aliyun.sas20160316.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "tds.ap-southeast-3.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "tds.cn-shanghai-et2-b01.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public IsSasServiceOpeningResponse isSasServiceOpeningWithOptions(IsSasServiceOpeningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("IsSasServiceOpening", "HTTPS", "POST", "2016-03-16", "AK", null, TeaModel.buildMap(request), runtime), new IsSasServiceOpeningResponse());
    }

    public IsSasServiceOpeningResponse isSasServiceOpening(IsSasServiceOpeningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.isSasServiceOpeningWithOptions(request, runtime);
    }

    public GetEventsCountResponse getEventsCountWithOptions(GetEventsCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEventsCount", "HTTPS", "POST", "2016-03-16", "AK", null, TeaModel.buildMap(request), runtime), new GetEventsCountResponse());
    }

    public GetEventsCountResponse getEventsCount(GetEventsCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventsCountWithOptions(request, runtime);
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
}

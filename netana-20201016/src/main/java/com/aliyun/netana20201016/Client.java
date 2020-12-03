// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.netana20201016;

import com.aliyun.tea.*;
import com.aliyun.netana20201016.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("netana", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListIpGeolocationsResponse listIpGeolocationsWithOptions(ListIpGeolocationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListIpGeolocations", "HTTPS", "POST", "2020-10-16", "AK", null, TeaModel.buildMap(request), runtime), new ListIpGeolocationsResponse());
    }

    public ListIpGeolocationsResponse listIpGeolocations(ListIpGeolocationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIpGeolocationsWithOptions(request, runtime);
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

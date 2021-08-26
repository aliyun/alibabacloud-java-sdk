// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_measure20190905;

import com.aliyun.tea.*;
import com.aliyun.nls_cloud_measure20190905.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "nls-measure.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "nls-measure.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "nls-measure-vpc.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-shanghai", "nls-measure.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nls-cloud-measure", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjects", "2019-09-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListAvailableTtsModelsResponse listAvailableTtsModelsWithOptions(ListAvailableTtsModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAvailableTtsModels", "2019-09-05", "HTTPS", "POST", "AK", "json", req, runtime), new ListAvailableTtsModelsResponse());
    }

    public ListAvailableTtsModelsResponse listAvailableTtsModels(ListAvailableTtsModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableTtsModelsWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521;

import com.aliyun.tea.*;
import com.aliyun.saf20190521.models.*;
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
            new TeaPair("cn-hangzhou", "saf.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("saf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ExecuteExtendServiceResponse executeExtendServiceWithOptions(ExecuteExtendServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteExtendService", "2019-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteExtendServiceResponse());
    }

    public ExecuteExtendServiceResponse executeExtendService(ExecuteExtendServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeExtendServiceWithOptions(request, runtime);
    }

    public ExecuteRequestResponse executeRequestWithOptions(ExecuteRequestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteRequest", "2019-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteRequestResponse());
    }

    public ExecuteRequestResponse executeRequest(ExecuteRequestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeRequestWithOptions(request, runtime);
    }

    public ExecuteRequestMLResponse executeRequestMLWithOptions(ExecuteRequestMLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteRequestML", "2019-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteRequestMLResponse());
    }

    public ExecuteRequestMLResponse executeRequestML(ExecuteRequestMLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeRequestMLWithOptions(request, runtime);
    }

    public ExecuteRequestSGResponse executeRequestSGWithOptions(ExecuteRequestSGRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteRequestSG", "2019-05-21", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteRequestSGResponse());
    }

    public ExecuteRequestSGResponse executeRequestSG(ExecuteRequestSGRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeRequestSGWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf_autotest20210720;

import com.aliyun.tea.*;
import com.aliyun.xixikf_autotest20210720.models.*;
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
        this._endpoint = this.getEndpoint("xixikf-autotest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CommerOutResponse commerOutWithOptions(CommerOutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommerOut", "2021-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new CommerOutResponse());
    }

    public CommerOutResponse commerOut(CommerOutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commerOutWithOptions(request, runtime);
    }

    public CreateEnvironmentResponse createEnvironmentWithOptions(CreateEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEnvironment", "2021-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEnvironmentResponse());
    }

    public CreateEnvironmentResponse createEnvironment(CreateEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEnvironmentWithOptions(request, runtime);
    }

    public CommerInResponse commerInWithOptions(CommerInRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommerIn", "2021-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new CommerInResponse());
    }

    public CommerInResponse commerIn(CommerInRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commerInWithOptions(request, runtime);
    }

    public XixiServicerMockServiceResponse xixiServicerMockServiceWithOptions(XixiServicerMockServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("XixiServicerMockService", "2021-07-20", "HTTPS", "POST", "AK", "json", req, runtime), new XixiServicerMockServiceResponse());
    }

    public XixiServicerMockServiceResponse xixiServicerMockService(XixiServicerMockServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.xixiServicerMockServiceWithOptions(request, runtime);
    }
}

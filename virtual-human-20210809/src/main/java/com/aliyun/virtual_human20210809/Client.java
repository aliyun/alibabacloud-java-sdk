// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809;

import com.aliyun.tea.*;
import com.aliyun.virtual_human20210809.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("virtual-human", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public TextToVideoResponse textToVideoWithOptions(TextToVideoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TextToVideoShrinkRequest request = new TextToVideoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TextToVideo", "2021-08-09", "HTTPS", "POST", "AK", "json", req, runtime), new TextToVideoResponse());
    }

    public TextToVideoResponse textToVideo(TextToVideoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.textToVideoWithOptions(request, runtime);
    }

    public StartResponse startWithOptions(StartRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartShrinkRequest request = new StartShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendParams)) {
            request.extendParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendParams, "ExtendParams", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Start", "2021-08-09", "HTTPS", "POST", "AK", "json", req, runtime), new StartResponse());
    }

    public StartResponse start(StartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startWithOptions(request, runtime);
    }

    public FinishResponse finishWithOptions(FinishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Finish", "2021-08-09", "HTTPS", "POST", "AK", "json", req, runtime), new FinishResponse());
    }

    public FinishResponse finish(FinishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishWithOptions(request, runtime);
    }
}

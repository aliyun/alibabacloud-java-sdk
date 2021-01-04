// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701;

import com.aliyun.tea.*;
import com.aliyun.nlp_automl20190701.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nlp-automl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddMtIntervenePackageResponse addMtIntervenePackageWithOptions(AddMtIntervenePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMtIntervenePackage", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddMtIntervenePackageResponse());
    }

    public AddMtIntervenePackageResponse addMtIntervenePackage(AddMtIntervenePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMtIntervenePackageWithOptions(request, runtime);
    }

    public AddMTInterveneWordResponse addMTInterveneWordWithOptions(AddMTInterveneWordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMTInterveneWord", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddMTInterveneWordResponse());
    }

    public AddMTInterveneWordResponse addMTInterveneWord(AddMTInterveneWordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMTInterveneWordWithOptions(request, runtime);
    }

    public BindIntervenePackageAndModelResponse bindIntervenePackageAndModelWithOptions(BindIntervenePackageAndModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindIntervenePackageAndModel", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindIntervenePackageAndModelResponse());
    }

    public BindIntervenePackageAndModelResponse bindIntervenePackageAndModel(BindIntervenePackageAndModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindIntervenePackageAndModelWithOptions(request, runtime);
    }

    public GetPredictDocResponse getPredictDocWithOptions(GetPredictDocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPredictDoc", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPredictDocResponse());
    }

    public GetPredictDocResponse getPredictDoc(GetPredictDocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPredictDocWithOptions(request, runtime);
    }

    public InvokeActionResponse invokeActionWithOptions(InvokeActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeAction", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeActionResponse());
    }

    public InvokeActionResponse invokeAction(InvokeActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeActionWithOptions(request, runtime);
    }

    public PredictMTModelResponse predictMTModelWithOptions(PredictMTModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PredictMTModel", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new PredictMTModelResponse());
    }

    public PredictMTModelResponse predictMTModel(PredictMTModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.predictMTModelWithOptions(request, runtime);
    }

    public PredictMTModelByDocResponse predictMTModelByDocWithOptions(PredictMTModelByDocRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PredictMTModelByDoc", "2019-07-01", "HTTPS", "POST", "AK", "json", req, runtime), new PredictMTModelByDocResponse());
    }

    public PredictMTModelByDocResponse predictMTModelByDoc(PredictMTModelByDocRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.predictMTModelByDocWithOptions(request, runtime);
    }
}

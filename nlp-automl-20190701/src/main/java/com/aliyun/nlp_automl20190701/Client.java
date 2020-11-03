// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701;

import com.aliyun.tea.*;
import com.aliyun.nlp_automl20190701.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nlp-automl", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public PredictMTModelByDocResponse predictMTModelByDocWithOptions(PredictMTModelByDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PredictMTModelByDoc", "HTTPS", "POST", "2019-07-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new PredictMTModelByDocResponse());
    }

    public PredictMTModelByDocResponse predictMTModelByDoc(PredictMTModelByDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predictMTModelByDocWithOptions(request, runtime);
    }

    public BindIntervenePackageAndModelResponse bindIntervenePackageAndModelWithOptions(BindIntervenePackageAndModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindIntervenePackageAndModel", "HTTPS", "POST", "2019-07-01", "AK,APP,PrivateKey", null, TeaModel.buildMap(request), runtime), new BindIntervenePackageAndModelResponse());
    }

    public BindIntervenePackageAndModelResponse bindIntervenePackageAndModel(BindIntervenePackageAndModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindIntervenePackageAndModelWithOptions(request, runtime);
    }

    public AddMtIntervenePackageResponse addMtIntervenePackageWithOptions(AddMtIntervenePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMtIntervenePackage", "HTTPS", "POST", "2019-07-01", "AK,APP,PrivateKey", null, TeaModel.buildMap(request), runtime), new AddMtIntervenePackageResponse());
    }

    public AddMtIntervenePackageResponse addMtIntervenePackage(AddMtIntervenePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMtIntervenePackageWithOptions(request, runtime);
    }

    public GetPredictDocResponse getPredictDocWithOptions(GetPredictDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPredictDoc", "HTTPS", "POST", "2019-07-01", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new GetPredictDocResponse());
    }

    public GetPredictDocResponse getPredictDoc(GetPredictDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPredictDocWithOptions(request, runtime);
    }

    public AddMTInterveneWordResponse addMTInterveneWordWithOptions(AddMTInterveneWordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddMTInterveneWord", "HTTPS", "POST", "2019-07-01", "AK,APP,PrivateKey", null, TeaModel.buildMap(request), runtime), new AddMTInterveneWordResponse());
    }

    public AddMTInterveneWordResponse addMTInterveneWord(AddMTInterveneWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMTInterveneWordWithOptions(request, runtime);
    }

    public PredictMTModelResponse predictMTModelWithOptions(PredictMTModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PredictMTModel", "HTTPS", "POST", "2019-07-01", "AK", null, TeaModel.buildMap(request), runtime), new PredictMTModelResponse());
    }

    public PredictMTModelResponse predictMTModel(PredictMTModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predictMTModelWithOptions(request, runtime);
    }

    public InvokeActionResponse invokeActionWithOptions(InvokeActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeAction", "HTTPS", "POST", "2019-07-01", "AK", null, TeaModel.buildMap(request), runtime), new InvokeActionResponse());
    }

    public InvokeActionResponse invokeAction(InvokeActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeActionWithOptions(request, runtime);
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

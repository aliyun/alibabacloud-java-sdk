// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701;

import com.aliyun.tea.*;
import com.aliyun.nlp_automl20190701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @param request AddMTInterveneWordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMTInterveneWordResponse
     */
    public AddMTInterveneWordResponse addMTInterveneWordWithOptions(AddMTInterveneWordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            query.put("PackageId", request.packageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceText)) {
            query.put("SourceText", request.sourceText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetText)) {
            query.put("TargetText", request.targetText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMTInterveneWord"),
            new TeaPair("version", "2019-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMTInterveneWordResponse());
    }

    /**
     * @param request AddMTInterveneWordRequest
     * @return AddMTInterveneWordResponse
     */
    public AddMTInterveneWordResponse addMTInterveneWord(AddMTInterveneWordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMTInterveneWordWithOptions(request, runtime);
    }

    /**
     * @param request GetPredictDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPredictDocResponse
     */
    public GetPredictDocResponse getPredictDocWithOptions(GetPredictDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docId)) {
            query.put("DocId", request.docId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPredictDoc"),
            new TeaPair("version", "2019-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPredictDocResponse());
    }

    /**
     * @param request GetPredictDocRequest
     * @return GetPredictDocResponse
     */
    public GetPredictDocResponse getPredictDoc(GetPredictDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPredictDocWithOptions(request, runtime);
    }

    /**
     * @param request PredictMTModelByDocRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PredictMTModelByDocResponse
     */
    public PredictMTModelByDocResponse predictMTModelByDocWithOptions(PredictMTModelByDocRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelId)) {
            query.put("ModelId", request.modelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelVersion)) {
            query.put("ModelVersion", request.modelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needXLIFF)) {
            query.put("NeedXLIFF", request.needXLIFF);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileContent)) {
            body.put("FileContent", request.fileContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PredictMTModelByDoc"),
            new TeaPair("version", "2019-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PredictMTModelByDocResponse());
    }

    /**
     * @param request PredictMTModelByDocRequest
     * @return PredictMTModelByDocResponse
     */
    public PredictMTModelByDocResponse predictMTModelByDoc(PredictMTModelByDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.predictMTModelByDocWithOptions(request, runtime);
    }
}

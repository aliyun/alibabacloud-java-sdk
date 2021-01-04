// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp20180408;

import com.aliyun.tea.*;
import com.aliyun.nlp20180408.models.*;
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
        this._endpoint = this.getEndpoint("nlp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public EntityResponse entity(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.entityWithOptions(Domain, headers, runtime);
    }

    public EntityResponse entityWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("Entity", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/entity/" + Domain + "", "none", req, runtime), new EntityResponse());
    }

    public IEResponse iE(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.iEWithOptions(Domain, headers, runtime);
    }

    public IEResponse iEWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("IE", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/ie/" + Domain + "", "none", req, runtime), new IEResponse());
    }

    public KWEResponse kWE(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.kWEWithOptions(Domain, headers, runtime);
    }

    public KWEResponse kWEWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("KWE", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/kwe/" + Domain + "", "none", req, runtime), new KWEResponse());
    }

    public ReviewAnalysisResponse reviewAnalysis(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reviewAnalysisWithOptions(Domain, headers, runtime);
    }

    public ReviewAnalysisResponse reviewAnalysisWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ReviewAnalysis", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/reviewanalysis/" + Domain + "", "none", req, runtime), new ReviewAnalysisResponse());
    }

    public SentimentResponse sentiment(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sentimentWithOptions(Domain, headers, runtime);
    }

    public SentimentResponse sentimentWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("Sentiment", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/sentiment/" + Domain + "", "none", req, runtime), new SentimentResponse());
    }

    public TextStructureResponse textStructure(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.textStructureWithOptions(Domain, headers, runtime);
    }

    public TextStructureResponse textStructureWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("TextStructure", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/textstructure/" + Domain + "", "none", req, runtime), new TextStructureResponse());
    }

    public TranslateResponse translate(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.translateWithOptions(Domain, headers, runtime);
    }

    public TranslateResponse translateWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("Translate", "2018-04-08", "HTTP", "POST", "AK", "/nlp/api/translate/" + Domain + "", "none", req, runtime), new TranslateResponse());
    }

    public WordPosResponse wordPos(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.wordPosWithOptions(Domain, headers, runtime);
    }

    public WordPosResponse wordPosWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("WordPos", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/wordpos/" + Domain + "", "none", req, runtime), new WordPosResponse());
    }

    public WordSegmentResponse wordSegment(String Domain) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.wordSegmentWithOptions(Domain, headers, runtime);
    }

    public WordSegmentResponse wordSegmentWithOptions(String Domain, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("WordSegment", "2018-04-08", "HTTPS", "POST", "AK", "/nlp/api/wordsegment/" + Domain + "", "none", req, runtime), new WordSegmentResponse());
    }
}

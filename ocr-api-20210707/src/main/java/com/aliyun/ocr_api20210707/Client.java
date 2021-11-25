// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707;

import com.aliyun.tea.*;
import com.aliyun.ocr_api20210707.models.*;
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
        this._endpoint = this.getEndpoint("ocr-api", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public RecognizeAdvancedResponse recognizeAdvancedWithOptions(RecognizeAdvancedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("NeedSortPage", request.needSortPage);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeAdvanced"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeAdvancedResponse());
    }

    public RecognizeAdvancedResponse recognizeAdvanced(RecognizeAdvancedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeAdvancedWithOptions(request, runtime);
    }

    public RecognizeAirItineraryResponse recognizeAirItineraryWithOptions(RecognizeAirItineraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeAirItinerary"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeAirItineraryResponse());
    }

    public RecognizeAirItineraryResponse recognizeAirItinerary(RecognizeAirItineraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeAirItineraryWithOptions(request, runtime);
    }

    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicenseWithOptions(RecognizeBankAccountLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBankAccountLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBankAccountLicenseResponse());
    }

    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBankAccountLicenseWithOptions(request, runtime);
    }

    public RecognizeBankCardResponse recognizeBankCardWithOptions(RecognizeBankCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBankCard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBankCardResponse());
    }

    public RecognizeBankCardResponse recognizeBankCard(RecognizeBankCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBankCardWithOptions(request, runtime);
    }

    public RecognizeBasicResponse recognizeBasicWithOptions(RecognizeBasicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBasic"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBasicResponse());
    }

    public RecognizeBasicResponse recognizeBasic(RecognizeBasicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBasicWithOptions(request, runtime);
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertificationWithOptions(RecognizeBirthCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBirthCertification"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBirthCertificationResponse());
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertification(RecognizeBirthCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBirthCertificationWithOptions(request, runtime);
    }

    public RecognizeBusinessLicenseResponse recognizeBusinessLicenseWithOptions(RecognizeBusinessLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBusinessLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBusinessLicenseResponse());
    }

    public RecognizeBusinessLicenseResponse recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBusinessLicenseWithOptions(request, runtime);
    }

    public RecognizeCarInvoiceResponse recognizeCarInvoiceWithOptions(RecognizeCarInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCarInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCarInvoiceResponse());
    }

    public RecognizeCarInvoiceResponse recognizeCarInvoice(RecognizeCarInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarInvoiceWithOptions(request, runtime);
    }

    public RecognizeCarNumberResponse recognizeCarNumberWithOptions(RecognizeCarNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCarNumber"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCarNumberResponse());
    }

    public RecognizeCarNumberResponse recognizeCarNumber(RecognizeCarNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarNumberWithOptions(request, runtime);
    }

    public RecognizeCarVinCodeResponse recognizeCarVinCodeWithOptions(RecognizeCarVinCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCarVinCode"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCarVinCodeResponse());
    }

    public RecognizeCarVinCodeResponse recognizeCarVinCode(RecognizeCarVinCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarVinCodeWithOptions(request, runtime);
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicenseWithOptions(RecognizeCtwoMedicalDeviceManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCtwoMedicalDeviceManageLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCtwoMedicalDeviceManageLicenseResponse());
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCtwoMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    public RecognizeDrivingLicenseResponse recognizeDrivingLicenseWithOptions(RecognizeDrivingLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeDrivingLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeDrivingLicenseResponse());
    }

    public RecognizeDrivingLicenseResponse recognizeDrivingLicense(RecognizeDrivingLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeDrivingLicenseWithOptions(request, runtime);
    }

    public RecognizeEduFormulaResponse recognizeEduFormulaWithOptions(RecognizeEduFormulaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduFormula"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduFormulaResponse());
    }

    public RecognizeEduFormulaResponse recognizeEduFormula(RecognizeEduFormulaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduFormulaWithOptions(request, runtime);
    }

    public RecognizeEduOralCalculationResponse recognizeEduOralCalculationWithOptions(RecognizeEduOralCalculationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduOralCalculation"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduOralCalculationResponse());
    }

    public RecognizeEduOralCalculationResponse recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduOralCalculationWithOptions(request, runtime);
    }

    public RecognizeEduPaperCutResponse recognizeEduPaperCutWithOptions(RecognizeEduPaperCutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CutType", request.cutType);
        query.put("ImageType", request.imageType);
        query.put("Subject", request.subject);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduPaperCut"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduPaperCutResponse());
    }

    public RecognizeEduPaperCutResponse recognizeEduPaperCut(RecognizeEduPaperCutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperCutWithOptions(request, runtime);
    }

    public RecognizeEduPaperOcrResponse recognizeEduPaperOcrWithOptions(RecognizeEduPaperOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ImageType", request.imageType);
        query.put("OutputOricoord", request.outputOricoord);
        query.put("Subject", request.subject);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduPaperOcr"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduPaperOcrResponse());
    }

    public RecognizeEduPaperOcrResponse recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperOcrWithOptions(request, runtime);
    }

    public RecognizeEduPaperStructedResponse recognizeEduPaperStructedWithOptions(RecognizeEduPaperStructedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduPaperStructed"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduPaperStructedResponse());
    }

    public RecognizeEduPaperStructedResponse recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperStructedWithOptions(request, runtime);
    }

    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcrWithOptions(RecognizeEduQuestionOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEduQuestionOcr"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEduQuestionOcrResponse());
    }

    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduQuestionOcrWithOptions(request, runtime);
    }

    public RecognizeEnglishResponse recognizeEnglishWithOptions(RecognizeEnglishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEnglish"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEnglishResponse());
    }

    public RecognizeEnglishResponse recognizeEnglish(RecognizeEnglishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEnglishWithOptions(request, runtime);
    }

    public RecognizeEstateCertificationResponse recognizeEstateCertificationWithOptions(RecognizeEstateCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeEstateCertification"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEstateCertificationResponse());
    }

    public RecognizeEstateCertificationResponse recognizeEstateCertification(RecognizeEstateCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEstateCertificationWithOptions(request, runtime);
    }

    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicenseWithOptions(RecognizeFoodManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeFoodManageLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeFoodManageLicenseResponse());
    }

    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFoodManageLicenseWithOptions(request, runtime);
    }

    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicenseWithOptions(RecognizeFoodProduceLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeFoodProduceLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeFoodProduceLicenseResponse());
    }

    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFoodProduceLicenseWithOptions(request, runtime);
    }

    public RecognizeGeneralResponse recognizeGeneralWithOptions(RecognizeGeneralRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeGeneral"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeGeneralResponse());
    }

    public RecognizeGeneralResponse recognizeGeneral(RecognizeGeneralRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeGeneralWithOptions(request, runtime);
    }

    public RecognizeHandwritingResponse recognizeHandwritingWithOptions(RecognizeHandwritingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("NeedSortPage", request.needSortPage);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeHandwriting"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHandwritingResponse());
    }

    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHandwritingWithOptions(request, runtime);
    }

    public RecognizeHouseholdResponse recognizeHouseholdWithOptions(RecognizeHouseholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeHousehold"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHouseholdResponse());
    }

    public RecognizeHouseholdResponse recognizeHousehold(RecognizeHouseholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHouseholdWithOptions(request, runtime);
    }

    public RecognizeIdcardResponse recognizeIdcardWithOptions(RecognizeIdcardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeIdcard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeIdcardResponse());
    }

    public RecognizeIdcardResponse recognizeIdcard(RecognizeIdcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeIdcardWithOptions(request, runtime);
    }

    public RecognizeInvoiceResponse recognizeInvoiceWithOptions(RecognizeInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeInvoiceResponse());
    }

    public RecognizeInvoiceResponse recognizeInvoice(RecognizeInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeInvoiceWithOptions(request, runtime);
    }

    public RecognizeJanpaneseResponse recognizeJanpaneseWithOptions(RecognizeJanpaneseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeJanpanese"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeJanpaneseResponse());
    }

    public RecognizeJanpaneseResponse recognizeJanpanese(RecognizeJanpaneseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeJanpaneseWithOptions(request, runtime);
    }

    public RecognizeKoreanResponse recognizeKoreanWithOptions(RecognizeKoreanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeKorean"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeKoreanResponse());
    }

    public RecognizeKoreanResponse recognizeKorean(RecognizeKoreanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeKoreanWithOptions(request, runtime);
    }

    public RecognizeLatinResponse recognizeLatinWithOptions(RecognizeLatinRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeLatin"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeLatinResponse());
    }

    public RecognizeLatinResponse recognizeLatin(RecognizeLatinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeLatinWithOptions(request, runtime);
    }

    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicenseWithOptions(RecognizeMedicalDeviceManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMedicalDeviceManageLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMedicalDeviceManageLicenseResponse());
    }

    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicenseWithOptions(RecognizeMedicalDeviceProduceLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMedicalDeviceProduceLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMedicalDeviceProduceLicenseResponse());
    }

    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMedicalDeviceProduceLicenseWithOptions(request, runtime);
    }

    public RecognizeMixedInvoicesResponse recognizeMixedInvoicesWithOptions(RecognizeMixedInvoicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMixedInvoices"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMixedInvoicesResponse());
    }

    public RecognizeMixedInvoicesResponse recognizeMixedInvoices(RecognizeMixedInvoicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMixedInvoicesWithOptions(request, runtime);
    }

    public RecognizeMultiLanguageResponse recognizeMultiLanguageWithOptions(RecognizeMultiLanguageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMultiLanguageShrinkRequest request = new RecognizeMultiLanguageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.languages)) {
            request.languagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.languages, "Languages", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Languages", request.languagesShrink);
        query.put("NeedRotate", request.needRotate);
        query.put("NeedSortPage", request.needSortPage);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMultiLanguage"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMultiLanguageResponse());
    }

    public RecognizeMultiLanguageResponse recognizeMultiLanguage(RecognizeMultiLanguageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMultiLanguageWithOptions(request, runtime);
    }

    public RecognizePassportResponse recognizePassportWithOptions(RecognizePassportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizePassport"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizePassportResponse());
    }

    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizePassportWithOptions(request, runtime);
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceWithOptions(RecognizeQuotaInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeQuotaInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeQuotaInvoiceResponse());
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeQuotaInvoiceWithOptions(request, runtime);
    }

    public RecognizeRollTicketResponse recognizeRollTicketWithOptions(RecognizeRollTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeRollTicket"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeRollTicketResponse());
    }

    public RecognizeRollTicketResponse recognizeRollTicket(RecognizeRollTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRollTicketWithOptions(request, runtime);
    }

    public RecognizeRussianResponse recognizeRussianWithOptions(RecognizeRussianRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeRussian"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeRussianResponse());
    }

    public RecognizeRussianResponse recognizeRussian(RecognizeRussianRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRussianWithOptions(request, runtime);
    }

    public RecognizeTableOcrResponse recognizeTableOcrWithOptions(RecognizeTableOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTableOcr"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTableOcrResponse());
    }

    public RecognizeTableOcrResponse recognizeTableOcr(RecognizeTableOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTableOcrWithOptions(request, runtime);
    }

    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceWithOptions(RecognizeTaxiInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTaxiInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTaxiInvoiceResponse());
    }

    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTaxiInvoiceWithOptions(request, runtime);
    }

    public RecognizeThaiResponse recognizeThaiWithOptions(RecognizeThaiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NeedRotate", request.needRotate);
        query.put("OutputCharInfo", request.outputCharInfo);
        query.put("OutputTable", request.outputTable);
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeThai"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeThaiResponse());
    }

    public RecognizeThaiResponse recognizeThai(RecognizeThaiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeThaiWithOptions(request, runtime);
    }

    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertificationWithOptions(RecognizeTradeMarkCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTradeMarkCertification"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTradeMarkCertificationResponse());
    }

    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTradeMarkCertificationWithOptions(request, runtime);
    }

    public RecognizeTrainInvoiceResponse recognizeTrainInvoiceWithOptions(RecognizeTrainInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTrainInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTrainInvoiceResponse());
    }

    public RecognizeTrainInvoiceResponse recognizeTrainInvoice(RecognizeTrainInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTrainInvoiceWithOptions(request, runtime);
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicenseWithOptions(RecognizeVehicleLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeVehicleLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeVehicleLicenseResponse());
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeVehicleLicenseWithOptions(request, runtime);
    }

    public RecognizeWaybillResponse recognizeWaybillWithOptions(RecognizeWaybillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Url", request.url);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request)),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeWaybill"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeWaybillResponse());
    }

    public RecognizeWaybillResponse recognizeWaybill(RecognizeWaybillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeWaybillWithOptions(request, runtime);
    }
}

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

    public RecognizeDrivingLicenseResponse recognizeDrivingLicenseWithOptions(RecognizeDrivingLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeDrivingLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeDrivingLicenseResponse());
    }

    public RecognizeDrivingLicenseResponse recognizeDrivingLicense(RecognizeDrivingLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeDrivingLicenseWithOptions(request, runtime);
    }

    public RecognizeKoreanResponse recognizeKoreanWithOptions(RecognizeKoreanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeKorean", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeKoreanResponse());
    }

    public RecognizeKoreanResponse recognizeKorean(RecognizeKoreanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeKoreanWithOptions(request, runtime);
    }

    public RecognizeCarInvoiceResponse recognizeCarInvoiceWithOptions(RecognizeCarInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeCarInvoice", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeCarInvoiceResponse());
    }

    public RecognizeCarInvoiceResponse recognizeCarInvoice(RecognizeCarInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarInvoiceWithOptions(request, runtime);
    }

    public RecognizeMixedInvoicesResponse recognizeMixedInvoicesWithOptions(RecognizeMixedInvoicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMixedInvoices", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeMixedInvoicesResponse());
    }

    public RecognizeMixedInvoicesResponse recognizeMixedInvoices(RecognizeMixedInvoicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMixedInvoicesWithOptions(request, runtime);
    }

    public RecognizeEstateCertificationResponse recognizeEstateCertificationWithOptions(RecognizeEstateCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEstateCertification", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEstateCertificationResponse());
    }

    public RecognizeEstateCertificationResponse recognizeEstateCertification(RecognizeEstateCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEstateCertificationWithOptions(request, runtime);
    }

    public RecognizeCarNumberResponse recognizeCarNumberWithOptions(RecognizeCarNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeCarNumber", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeCarNumberResponse());
    }

    public RecognizeCarNumberResponse recognizeCarNumber(RecognizeCarNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarNumberWithOptions(request, runtime);
    }

    public RecognizeEduPaperOcrResponse recognizeEduPaperOcrWithOptions(RecognizeEduPaperOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduPaperOcr", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduPaperOcrResponse());
    }

    public RecognizeEduPaperOcrResponse recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperOcrWithOptions(request, runtime);
    }

    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertificationWithOptions(RecognizeTradeMarkCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeTradeMarkCertification", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeTradeMarkCertificationResponse());
    }

    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTradeMarkCertificationWithOptions(request, runtime);
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertificationWithOptions(RecognizeBirthCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeBirthCertification", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeBirthCertificationResponse());
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertification(RecognizeBirthCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBirthCertificationWithOptions(request, runtime);
    }

    public RecognizeDoctypeResponse recognizeDoctypeWithOptions(RecognizeDoctypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeDoctype", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeDoctypeResponse());
    }

    public RecognizeDoctypeResponse recognizeDoctype(RecognizeDoctypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeDoctypeWithOptions(request, runtime);
    }

    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicenseWithOptions(RecognizeBankAccountLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeBankAccountLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeBankAccountLicenseResponse());
    }

    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBankAccountLicenseWithOptions(request, runtime);
    }

    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicenseWithOptions(RecognizeFoodManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeFoodManageLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeFoodManageLicenseResponse());
    }

    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFoodManageLicenseWithOptions(request, runtime);
    }

    public RecognizeRollTicketResponse recognizeRollTicketWithOptions(RecognizeRollTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeRollTicket", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeRollTicketResponse());
    }

    public RecognizeRollTicketResponse recognizeRollTicket(RecognizeRollTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRollTicketWithOptions(request, runtime);
    }

    public RecognizeEduFormulaResponse recognizeEduFormulaWithOptions(RecognizeEduFormulaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduFormula", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduFormulaResponse());
    }

    public RecognizeEduFormulaResponse recognizeEduFormula(RecognizeEduFormulaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduFormulaWithOptions(request, runtime);
    }

    public RecognizePassportResponse recognizePassportWithOptions(RecognizePassportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizePassport", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizePassportResponse());
    }

    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizePassportWithOptions(request, runtime);
    }

    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceWithOptions(RecognizeTaxiInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeTaxiInvoice", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeTaxiInvoiceResponse());
    }

    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTaxiInvoiceWithOptions(request, runtime);
    }

    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicenseWithOptions(RecognizeFoodProduceLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeFoodProduceLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeFoodProduceLicenseResponse());
    }

    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeFoodProduceLicenseWithOptions(request, runtime);
    }

    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicenseWithOptions(RecognizeMedicalDeviceProduceLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMedicalDeviceProduceLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeMedicalDeviceProduceLicenseResponse());
    }

    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMedicalDeviceProduceLicenseWithOptions(request, runtime);
    }

    public RecognizeHandwritingResponse recognizeHandwritingWithOptions(RecognizeHandwritingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeHandwriting", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeHandwritingResponse());
    }

    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHandwritingWithOptions(request, runtime);
    }

    public RecognizeAirItineraryResponse recognizeAirItineraryWithOptions(RecognizeAirItineraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeAirItinerary", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeAirItineraryResponse());
    }

    public RecognizeAirItineraryResponse recognizeAirItinerary(RecognizeAirItineraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeAirItineraryWithOptions(request, runtime);
    }

    public RecognizeJanpaneseResponse recognizeJanpaneseWithOptions(RecognizeJanpaneseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeJanpanese", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeJanpaneseResponse());
    }

    public RecognizeJanpaneseResponse recognizeJanpanese(RecognizeJanpaneseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeJanpaneseWithOptions(request, runtime);
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicenseWithOptions(RecognizeCtwoMedicalDeviceManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeCtwoMedicalDeviceManageLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeCtwoMedicalDeviceManageLicenseResponse());
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCtwoMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    public RecognizeThaiResponse recognizeThaiWithOptions(RecognizeThaiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeThai", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeThaiResponse());
    }

    public RecognizeThaiResponse recognizeThai(RecognizeThaiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeThaiWithOptions(request, runtime);
    }

    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicenseWithOptions(RecognizeMedicalDeviceManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMedicalDeviceManageLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeMedicalDeviceManageLicenseResponse());
    }

    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    public RecognizeLatinResponse recognizeLatinWithOptions(RecognizeLatinRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeLatin", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeLatinResponse());
    }

    public RecognizeLatinResponse recognizeLatin(RecognizeLatinRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeLatinWithOptions(request, runtime);
    }

    public RecognizeInvoiceResponse recognizeInvoiceWithOptions(RecognizeInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeInvoice", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeInvoiceResponse());
    }

    public RecognizeInvoiceResponse recognizeInvoice(RecognizeInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeInvoiceWithOptions(request, runtime);
    }

    public RecognizeMixedCardsResponse recognizeMixedCardsWithOptions(RecognizeMixedCardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMixedCards", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeMixedCardsResponse());
    }

    public RecognizeMixedCardsResponse recognizeMixedCards(RecognizeMixedCardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMixedCardsWithOptions(request, runtime);
    }

    public RecognizeWaybillResponse recognizeWaybillWithOptions(RecognizeWaybillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeWaybill", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeWaybillResponse());
    }

    public RecognizeWaybillResponse recognizeWaybill(RecognizeWaybillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeWaybillWithOptions(request, runtime);
    }

    public RecognizeCarVinCodeResponse recognizeCarVinCodeWithOptions(RecognizeCarVinCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeCarVinCode", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeCarVinCodeResponse());
    }

    public RecognizeCarVinCodeResponse recognizeCarVinCode(RecognizeCarVinCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarVinCodeWithOptions(request, runtime);
    }

    public RecognizeAdvancedResponse recognizeAdvancedWithOptions(RecognizeAdvancedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeAdvanced", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeAdvancedResponse());
    }

    public RecognizeAdvancedResponse recognizeAdvanced(RecognizeAdvancedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeAdvancedWithOptions(request, runtime);
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicenseWithOptions(RecognizeVehicleLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeVehicleLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeVehicleLicenseResponse());
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeVehicleLicenseWithOptions(request, runtime);
    }

    public RecognizeRussianResponse recognizeRussianWithOptions(RecognizeRussianRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeRussian", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeRussianResponse());
    }

    public RecognizeRussianResponse recognizeRussian(RecognizeRussianRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRussianWithOptions(request, runtime);
    }

    public RecognizeBasicResponse recognizeBasicWithOptions(RecognizeBasicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeBasic", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeBasicResponse());
    }

    public RecognizeBasicResponse recognizeBasic(RecognizeBasicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBasicWithOptions(request, runtime);
    }

    public RecognizeBusinessLicenseResponse recognizeBusinessLicenseWithOptions(RecognizeBusinessLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeBusinessLicense", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeBusinessLicenseResponse());
    }

    public RecognizeBusinessLicenseResponse recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBusinessLicenseWithOptions(request, runtime);
    }

    public RecognizeBankCardResponse recognizeBankCardWithOptions(RecognizeBankCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeBankCard", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeBankCardResponse());
    }

    public RecognizeBankCardResponse recognizeBankCard(RecognizeBankCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBankCardWithOptions(request, runtime);
    }

    public RecognizeEduPaperCutResponse recognizeEduPaperCutWithOptions(RecognizeEduPaperCutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduPaperCut", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduPaperCutResponse());
    }

    public RecognizeEduPaperCutResponse recognizeEduPaperCut(RecognizeEduPaperCutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperCutWithOptions(request, runtime);
    }

    public RecognizeHouseholdResponse recognizeHouseholdWithOptions(RecognizeHouseholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeHousehold", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeHouseholdResponse());
    }

    public RecognizeHouseholdResponse recognizeHousehold(RecognizeHouseholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHouseholdWithOptions(request, runtime);
    }

    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcrWithOptions(RecognizeEduQuestionOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduQuestionOcr", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduQuestionOcrResponse());
    }

    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduQuestionOcrWithOptions(request, runtime);
    }

    public RecognizeTrainInvoiceResponse recognizeTrainInvoiceWithOptions(RecognizeTrainInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeTrainInvoice", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeTrainInvoiceResponse());
    }

    public RecognizeTrainInvoiceResponse recognizeTrainInvoice(RecognizeTrainInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTrainInvoiceWithOptions(request, runtime);
    }

    public RecognizeTableOcrResponse recognizeTableOcrWithOptions(RecognizeTableOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeTableOcr", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeTableOcrResponse());
    }

    public RecognizeTableOcrResponse recognizeTableOcr(RecognizeTableOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTableOcrWithOptions(request, runtime);
    }

    public RecognizeEnglishResponse recognizeEnglishWithOptions(RecognizeEnglishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEnglish", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEnglishResponse());
    }

    public RecognizeEnglishResponse recognizeEnglish(RecognizeEnglishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEnglishWithOptions(request, runtime);
    }

    public RecognizeMultiLanguageResponse recognizeMultiLanguageWithOptions(RecognizeMultiLanguageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMultiLanguageShrinkRequest request = new RecognizeMultiLanguageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.languages)) {
            request.languagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.languages, "Languages", "simple");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMultiLanguage", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeMultiLanguageResponse());
    }

    public RecognizeMultiLanguageResponse recognizeMultiLanguage(RecognizeMultiLanguageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMultiLanguageWithOptions(request, runtime);
    }

    public RecognizeEduOralCalculationResponse recognizeEduOralCalculationWithOptions(RecognizeEduOralCalculationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduOralCalculation", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduOralCalculationResponse());
    }

    public RecognizeEduOralCalculationResponse recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduOralCalculationWithOptions(request, runtime);
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceWithOptions(RecognizeQuotaInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeQuotaInvoice", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeQuotaInvoiceResponse());
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeQuotaInvoiceWithOptions(request, runtime);
    }

    public RecognizeGeneralResponse recognizeGeneralWithOptions(RecognizeGeneralRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeGeneral", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeGeneralResponse());
    }

    public RecognizeGeneralResponse recognizeGeneral(RecognizeGeneralRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeGeneralWithOptions(request, runtime);
    }

    public RecognizeEduPaperStructedResponse recognizeEduPaperStructedWithOptions(RecognizeEduPaperStructedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeEduPaperStructed", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeEduPaperStructedResponse());
    }

    public RecognizeEduPaperStructedResponse recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEduPaperStructedWithOptions(request, runtime);
    }

    public RecognizeIdcardResponse recognizeIdcardWithOptions(RecognizeIdcardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeIdcard", "2021-07-07", "HTTPS", "GET", "AK", "json", req, runtime), new RecognizeIdcardResponse());
    }

    public RecognizeIdcardResponse recognizeIdcard(RecognizeIdcardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeIdcardWithOptions(request, runtime);
    }
}

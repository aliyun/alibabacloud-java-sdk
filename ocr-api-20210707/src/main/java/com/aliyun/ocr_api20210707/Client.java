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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSortPage)) {
            query.put("NeedSortPage", request.needSortPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noStamp)) {
            query.put("NoStamp", request.noStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paragraph)) {
            query.put("Paragraph", request.paragraph);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.row)) {
            query.put("Row", request.row);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBasicResponse());
    }

    public RecognizeBasicResponse recognizeBasic(RecognizeBasicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBasicWithOptions(request, runtime);
    }

    public RecognizeBatchRecognizeResponse recognizeBatchRecognizeWithOptions(RecognizeBatchRecognizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOp)) {
            query.put("ImageOp", request.imageOp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOssKey)) {
            query.put("ImageOssKey", request.imageOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSortPage)) {
            query.put("NeedSortPage", request.needSortPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBatchRecognize"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBatchRecognizeResponse());
    }

    public RecognizeBatchRecognizeResponse recognizeBatchRecognize(RecognizeBatchRecognizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBatchRecognizeWithOptions(request, runtime);
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertificationWithOptions(RecognizeBirthCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBirthCertificationResponse());
    }

    public RecognizeBirthCertificationResponse recognizeBirthCertification(RecognizeBirthCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBirthCertificationWithOptions(request, runtime);
    }

    public RecognizeBusShipTicketResponse recognizeBusShipTicketWithOptions(RecognizeBusShipTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBusShipTicket"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBusShipTicketResponse());
    }

    public RecognizeBusShipTicketResponse recognizeBusShipTicket(RecognizeBusShipTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeBusShipTicketWithOptions(request, runtime);
    }

    public RecognizeBusinessLicenseResponse recognizeBusinessLicenseWithOptions(RecognizeBusinessLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCarVinCodeResponse());
    }

    public RecognizeCarVinCodeResponse recognizeCarVinCode(RecognizeCarVinCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCarVinCodeWithOptions(request, runtime);
    }

    public RecognizeChinesePassportResponse recognizeChinesePassportWithOptions(RecognizeChinesePassportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeChinesePassport"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeChinesePassportResponse());
    }

    public RecognizeChinesePassportResponse recognizeChinesePassport(RecognizeChinesePassportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeChinesePassportWithOptions(request, runtime);
    }

    public RecognizeCommonPrintedInvoiceResponse recognizeCommonPrintedInvoiceWithOptions(RecognizeCommonPrintedInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCommonPrintedInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCommonPrintedInvoiceResponse());
    }

    public RecognizeCommonPrintedInvoiceResponse recognizeCommonPrintedInvoice(RecognizeCommonPrintedInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCommonPrintedInvoiceWithOptions(request, runtime);
    }

    public RecognizeCosmeticProduceLicenseResponse recognizeCosmeticProduceLicenseWithOptions(RecognizeCosmeticProduceLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCosmeticProduceLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCosmeticProduceLicenseResponse());
    }

    public RecognizeCosmeticProduceLicenseResponse recognizeCosmeticProduceLicense(RecognizeCosmeticProduceLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCosmeticProduceLicenseWithOptions(request, runtime);
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicenseWithOptions(RecognizeCtwoMedicalDeviceManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCtwoMedicalDeviceManageLicenseResponse());
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeCtwoMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    public RecognizeDeleteExcelRecordResponse recognizeDeleteExcelRecordWithOptions(RecognizeDeleteExcelRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeDeleteExcelRecord"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeDeleteExcelRecordResponse());
    }

    public RecognizeDeleteExcelRecordResponse recognizeDeleteExcelRecord(RecognizeDeleteExcelRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeDeleteExcelRecordWithOptions(request, runtime);
    }

    public RecognizeDrivingLicenseResponse recognizeDrivingLicenseWithOptions(RecognizeDrivingLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.cutType)) {
            query.put("CutType", request.cutType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputOricoord)) {
            query.put("OutputOricoord", request.outputOricoord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeEstateCertificationResponse());
    }

    public RecognizeEstateCertificationResponse recognizeEstateCertification(RecognizeEstateCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeEstateCertificationWithOptions(request, runtime);
    }

    public RecognizeExcelExportResponse recognizeExcelExportWithOptions(RecognizeExcelExportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageOp)) {
            query.put("ImageOp", request.imageOp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrImageCount)) {
            query.put("OcrImageCount", request.ocrImageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrResult)) {
            query.put("OcrResult", request.ocrResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrType)) {
            query.put("OcrType", request.ocrType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeExcelExport"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeExcelExportResponse());
    }

    public RecognizeExcelExportResponse recognizeExcelExport(RecognizeExcelExportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeExcelExportWithOptions(request, runtime);
    }

    public RecognizeExcelRecordResponse recognizeExcelRecordWithOptions(RecognizeExcelRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currPage)) {
            query.put("CurrPage", request.currPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeExcelRecord"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeExcelRecordResponse());
    }

    public RecognizeExcelRecordResponse recognizeExcelRecord(RecognizeExcelRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeExcelRecordWithOptions(request, runtime);
    }

    public RecognizeExitEntryPermitToHKResponse recognizeExitEntryPermitToHKWithOptions(RecognizeExitEntryPermitToHKRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeExitEntryPermitToHK"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeExitEntryPermitToHKResponse());
    }

    public RecognizeExitEntryPermitToHKResponse recognizeExitEntryPermitToHK(RecognizeExitEntryPermitToHKRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeExitEntryPermitToHKWithOptions(request, runtime);
    }

    public RecognizeExitEntryPermitToMainlandResponse recognizeExitEntryPermitToMainlandWithOptions(RecognizeExitEntryPermitToMainlandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeExitEntryPermitToMainland"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeExitEntryPermitToMainlandResponse());
    }

    public RecognizeExitEntryPermitToMainlandResponse recognizeExitEntryPermitToMainland(RecognizeExitEntryPermitToMainlandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeExitEntryPermitToMainlandWithOptions(request, runtime);
    }

    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicenseWithOptions(RecognizeFoodManageLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSortPage)) {
            query.put("NeedSortPage", request.needSortPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHandwritingResponse());
    }

    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHandwritingWithOptions(request, runtime);
    }

    public RecognizeHealthCodeResponse recognizeHealthCodeWithOptions(RecognizeHealthCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeHealthCode"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHealthCodeResponse());
    }

    public RecognizeHealthCodeResponse recognizeHealthCode(RecognizeHealthCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHealthCodeWithOptions(request, runtime);
    }

    public RecognizeHotelConsumeResponse recognizeHotelConsumeWithOptions(RecognizeHotelConsumeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeHotelConsume"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHotelConsumeResponse());
    }

    public RecognizeHotelConsumeResponse recognizeHotelConsume(RecognizeHotelConsumeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeHotelConsumeWithOptions(request, runtime);
    }

    public RecognizeHouseholdResponse recognizeHouseholdWithOptions(RecognizeHouseholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.languagesShrink)) {
            query.put("Languages", request.languagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needSortPage)) {
            query.put("NeedSortPage", request.needSortPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", tmpReq.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeMultiLanguage"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeMultiLanguageResponse());
    }

    public RecognizeMultiLanguageResponse recognizeMultiLanguage(RecognizeMultiLanguageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMultiLanguageWithOptions(request, runtime);
    }

    public RecognizeNonTaxInvoiceResponse recognizeNonTaxInvoiceWithOptions(RecognizeNonTaxInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeNonTaxInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeNonTaxInvoiceResponse());
    }

    public RecognizeNonTaxInvoiceResponse recognizeNonTaxInvoice(RecognizeNonTaxInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeNonTaxInvoiceWithOptions(request, runtime);
    }

    public RecognizePassportResponse recognizePassportWithOptions(RecognizePassportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizePassportResponse());
    }

    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizePassportWithOptions(request, runtime);
    }

    public RecognizePaymentRecordResponse recognizePaymentRecordWithOptions(RecognizePaymentRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizePaymentRecord"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizePaymentRecordResponse());
    }

    public RecognizePaymentRecordResponse recognizePaymentRecord(RecognizePaymentRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizePaymentRecordWithOptions(request, runtime);
    }

    public RecognizePurchaseRecordResponse recognizePurchaseRecordWithOptions(RecognizePurchaseRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizePurchaseRecord"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizePurchaseRecordResponse());
    }

    public RecognizePurchaseRecordResponse recognizePurchaseRecord(RecognizePurchaseRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizePurchaseRecordWithOptions(request, runtime);
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceWithOptions(RecognizeQuotaInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeQuotaInvoiceResponse());
    }

    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeQuotaInvoiceWithOptions(request, runtime);
    }

    public RecognizeRideHailingItineraryResponse recognizeRideHailingItineraryWithOptions(RecognizeRideHailingItineraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeRideHailingItinerary"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeRideHailingItineraryResponse());
    }

    public RecognizeRideHailingItineraryResponse recognizeRideHailingItinerary(RecognizeRideHailingItineraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRideHailingItineraryWithOptions(request, runtime);
    }

    public RecognizeRollTicketResponse recognizeRollTicketWithOptions(RecognizeRollTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeRussianResponse());
    }

    public RecognizeRussianResponse recognizeRussian(RecognizeRussianRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeRussianWithOptions(request, runtime);
    }

    public RecognizeSocialSecurityCardResponse recognizeSocialSecurityCardWithOptions(RecognizeSocialSecurityCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeSocialSecurityCard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeSocialSecurityCardResponse());
    }

    public RecognizeSocialSecurityCardResponse recognizeSocialSecurityCard(RecognizeSocialSecurityCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeSocialSecurityCardWithOptions(request, runtime);
    }

    public RecognizeTableOcrResponse recognizeTableOcrWithOptions(RecognizeTableOcrRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lineLess)) {
            query.put("LineLess", request.lineLess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipDetection)) {
            query.put("SkipDetection", request.skipDetection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTableOcrResponse());
    }

    public RecognizeTableOcrResponse recognizeTableOcr(RecognizeTableOcrRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTableOcrWithOptions(request, runtime);
    }

    public RecognizeTaxClearanceCertificateResponse recognizeTaxClearanceCertificateWithOptions(RecognizeTaxClearanceCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTaxClearanceCertificate"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTaxClearanceCertificateResponse());
    }

    public RecognizeTaxClearanceCertificateResponse recognizeTaxClearanceCertificate(RecognizeTaxClearanceCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTaxClearanceCertificateWithOptions(request, runtime);
    }

    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceWithOptions(RecognizeTaxiInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCharInfo)) {
            query.put("OutputCharInfo", request.outputCharInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeThaiResponse());
    }

    public RecognizeThaiResponse recognizeThai(RecognizeThaiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeThaiWithOptions(request, runtime);
    }

    public RecognizeTollInvoiceResponse recognizeTollInvoiceWithOptions(RecognizeTollInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTollInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTollInvoiceResponse());
    }

    public RecognizeTollInvoiceResponse recognizeTollInvoice(RecognizeTollInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTollInvoiceWithOptions(request, runtime);
    }

    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertificationWithOptions(RecognizeTradeMarkCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
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
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTrainInvoiceResponse());
    }

    public RecognizeTrainInvoiceResponse recognizeTrainInvoice(RecognizeTrainInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTrainInvoiceWithOptions(request, runtime);
    }

    public RecognizeTravelCardResponse recognizeTravelCardWithOptions(RecognizeTravelCardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeTravelCard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeTravelCardResponse());
    }

    public RecognizeTravelCardResponse recognizeTravelCard(RecognizeTravelCardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeTravelCardWithOptions(request, runtime);
    }

    public RecognizeUsedCarInvoiceResponse recognizeUsedCarInvoiceWithOptions(RecognizeUsedCarInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeUsedCarInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeUsedCarInvoiceResponse());
    }

    public RecognizeUsedCarInvoiceResponse recognizeUsedCarInvoice(RecognizeUsedCarInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeUsedCarInvoiceWithOptions(request, runtime);
    }

    public RecognizeVehicleCertificationResponse recognizeVehicleCertificationWithOptions(RecognizeVehicleCertificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeVehicleCertification"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeVehicleCertificationResponse());
    }

    public RecognizeVehicleCertificationResponse recognizeVehicleCertification(RecognizeVehicleCertificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeVehicleCertificationWithOptions(request, runtime);
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicenseWithOptions(RecognizeVehicleLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeVehicleLicenseResponse());
    }

    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeVehicleLicenseWithOptions(request, runtime);
    }

    public RecognizeVehicleRegistrationResponse recognizeVehicleRegistrationWithOptions(RecognizeVehicleRegistrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeVehicleRegistration"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeVehicleRegistrationResponse());
    }

    public RecognizeVehicleRegistrationResponse recognizeVehicleRegistration(RecognizeVehicleRegistrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeVehicleRegistrationWithOptions(request, runtime);
    }

    public RecognizeWaybillResponse recognizeWaybillWithOptions(RecognizeWaybillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
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
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeWaybillResponse());
    }

    public RecognizeWaybillResponse recognizeWaybill(RecognizeWaybillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeWaybillWithOptions(request, runtime);
    }
}

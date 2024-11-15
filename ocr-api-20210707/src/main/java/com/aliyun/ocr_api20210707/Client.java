// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707;

import com.aliyun.tea.*;
import com.aliyun.ocr_api20210707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>全文识别高精版</p>
     * 
     * @param request RecognizeAdvancedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeAdvancedResponse
     */
    public RecognizeAdvancedResponse recognizeAdvancedWithOptions(RecognizeAdvancedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>全文识别高精版</p>
     * 
     * @param request RecognizeAdvancedRequest
     * @return RecognizeAdvancedResponse
     */
    public RecognizeAdvancedResponse recognizeAdvanced(RecognizeAdvancedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeAdvancedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>航空行程单</p>
     * 
     * @param request RecognizeAirItineraryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeAirItineraryResponse
     */
    public RecognizeAirItineraryResponse recognizeAirItineraryWithOptions(RecognizeAirItineraryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>航空行程单</p>
     * 
     * @param request RecognizeAirItineraryRequest
     * @return RecognizeAirItineraryResponse
     */
    public RecognizeAirItineraryResponse recognizeAirItinerary(RecognizeAirItineraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeAirItineraryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>统一Api</p>
     * 
     * @param tmpReq RecognizeAllTextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeAllTextResponse
     */
    public RecognizeAllTextResponse recognizeAllTextWithOptions(RecognizeAllTextRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeAllTextShrinkRequest request = new RecognizeAllTextShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.advancedConfig)) {
            request.advancedConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.advancedConfig, "AdvancedConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.idCardConfig)) {
            request.idCardConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.idCardConfig, "IdCardConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.internationalBusinessLicenseConfig)) {
            request.internationalBusinessLicenseConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.internationalBusinessLicenseConfig, "InternationalBusinessLicenseConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.internationalIdCardConfig)) {
            request.internationalIdCardConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.internationalIdCardConfig, "InternationalIdCardConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.multiLanConfig)) {
            request.multiLanConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.multiLanConfig, "MultiLanConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tableConfig)) {
            request.tableConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tableConfig, "TableConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfigShrink)) {
            query.put("AdvancedConfig", request.advancedConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardConfigShrink)) {
            query.put("IdCardConfig", request.idCardConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internationalBusinessLicenseConfigShrink)) {
            query.put("InternationalBusinessLicenseConfig", request.internationalBusinessLicenseConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internationalIdCardConfigShrink)) {
            query.put("InternationalIdCardConfig", request.internationalIdCardConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiLanConfigShrink)) {
            query.put("MultiLanConfig", request.multiLanConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputBarCode)) {
            query.put("OutputBarCode", request.outputBarCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputCoordinate)) {
            query.put("OutputCoordinate", request.outputCoordinate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputKVExcel)) {
            query.put("OutputKVExcel", request.outputKVExcel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputOricoord)) {
            query.put("OutputOricoord", request.outputOricoord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputQrcode)) {
            query.put("OutputQrcode", request.outputQrcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputStamp)) {
            query.put("OutputStamp", request.outputStamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableConfigShrink)) {
            query.put("TableConfig", request.tableConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", tmpReq.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeAllText"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeAllTextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>统一Api</p>
     * 
     * @param request RecognizeAllTextRequest
     * @return RecognizeAllTextResponse
     */
    public RecognizeAllTextResponse recognizeAllText(RecognizeAllTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeAllTextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>银承汇票识别</p>
     * 
     * @param request RecognizeBankAcceptanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBankAcceptanceResponse
     */
    public RecognizeBankAcceptanceResponse recognizeBankAcceptanceWithOptions(RecognizeBankAcceptanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeBankAcceptance"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeBankAcceptanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>银承汇票识别</p>
     * 
     * @param request RecognizeBankAcceptanceRequest
     * @return RecognizeBankAcceptanceResponse
     */
    public RecognizeBankAcceptanceResponse recognizeBankAcceptance(RecognizeBankAcceptanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBankAcceptanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>银行开户许可证识别</p>
     * 
     * @param request RecognizeBankAccountLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBankAccountLicenseResponse
     */
    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicenseWithOptions(RecognizeBankAccountLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>银行开户许可证识别</p>
     * 
     * @param request RecognizeBankAccountLicenseRequest
     * @return RecognizeBankAccountLicenseResponse
     */
    public RecognizeBankAccountLicenseResponse recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBankAccountLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>银行卡识别</p>
     * 
     * @param request RecognizeBankCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBankCardResponse
     */
    public RecognizeBankCardResponse recognizeBankCardWithOptions(RecognizeBankCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>银行卡识别</p>
     * 
     * @param request RecognizeBankCardRequest
     * @return RecognizeBankCardResponse
     */
    public RecognizeBankCardResponse recognizeBankCard(RecognizeBankCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBankCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>电商图片文字识别</p>
     * 
     * @param request RecognizeBasicRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBasicResponse
     */
    public RecognizeBasicResponse recognizeBasicWithOptions(RecognizeBasicRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>电商图片文字识别</p>
     * 
     * @param request RecognizeBasicRequest
     * @return RecognizeBasicResponse
     */
    public RecognizeBasicResponse recognizeBasic(RecognizeBasicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBasicWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>出生证明</p>
     * 
     * @param request RecognizeBirthCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBirthCertificationResponse
     */
    public RecognizeBirthCertificationResponse recognizeBirthCertificationWithOptions(RecognizeBirthCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>出生证明</p>
     * 
     * @param request RecognizeBirthCertificationRequest
     * @return RecognizeBirthCertificationResponse
     */
    public RecognizeBirthCertificationResponse recognizeBirthCertification(RecognizeBirthCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBirthCertificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>客运车船票识别</p>
     * 
     * @param request RecognizeBusShipTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBusShipTicketResponse
     */
    public RecognizeBusShipTicketResponse recognizeBusShipTicketWithOptions(RecognizeBusShipTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>客运车船票识别</p>
     * 
     * @param request RecognizeBusShipTicketRequest
     * @return RecognizeBusShipTicketResponse
     */
    public RecognizeBusShipTicketResponse recognizeBusShipTicket(RecognizeBusShipTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBusShipTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>营业执照识别</p>
     * 
     * @param request RecognizeBusinessLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeBusinessLicenseResponse
     */
    public RecognizeBusinessLicenseResponse recognizeBusinessLicenseWithOptions(RecognizeBusinessLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>营业执照识别</p>
     * 
     * @param request RecognizeBusinessLicenseRequest
     * @return RecognizeBusinessLicenseResponse
     */
    public RecognizeBusinessLicenseResponse recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeBusinessLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机动车销售发票</p>
     * 
     * @param request RecognizeCarInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCarInvoiceResponse
     */
    public RecognizeCarInvoiceResponse recognizeCarInvoiceWithOptions(RecognizeCarInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>机动车销售发票</p>
     * 
     * @param request RecognizeCarInvoiceRequest
     * @return RecognizeCarInvoiceResponse
     */
    public RecognizeCarInvoiceResponse recognizeCarInvoice(RecognizeCarInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCarInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>车牌识别</p>
     * 
     * @param request RecognizeCarNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCarNumberResponse
     */
    public RecognizeCarNumberResponse recognizeCarNumberWithOptions(RecognizeCarNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>车牌识别</p>
     * 
     * @param request RecognizeCarNumberRequest
     * @return RecognizeCarNumberResponse
     */
    public RecognizeCarNumberResponse recognizeCarNumber(RecognizeCarNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCarNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>车辆vin码识别</p>
     * 
     * @param request RecognizeCarVinCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCarVinCodeResponse
     */
    public RecognizeCarVinCodeResponse recognizeCarVinCodeWithOptions(RecognizeCarVinCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>车辆vin码识别</p>
     * 
     * @param request RecognizeCarVinCodeRequest
     * @return RecognizeCarVinCodeResponse
     */
    public RecognizeCarVinCodeResponse recognizeCarVinCode(RecognizeCarVinCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCarVinCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>中国护照识别</p>
     * 
     * @param request RecognizeChinesePassportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeChinesePassportResponse
     */
    public RecognizeChinesePassportResponse recognizeChinesePassportWithOptions(RecognizeChinesePassportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>中国护照识别</p>
     * 
     * @param request RecognizeChinesePassportRequest
     * @return RecognizeChinesePassportResponse
     */
    public RecognizeChinesePassportResponse recognizeChinesePassport(RecognizeChinesePassportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeChinesePassportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用机打发票识别</p>
     * 
     * @param request RecognizeCommonPrintedInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCommonPrintedInvoiceResponse
     */
    public RecognizeCommonPrintedInvoiceResponse recognizeCommonPrintedInvoiceWithOptions(RecognizeCommonPrintedInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>通用机打发票识别</p>
     * 
     * @param request RecognizeCommonPrintedInvoiceRequest
     * @return RecognizeCommonPrintedInvoiceResponse
     */
    public RecognizeCommonPrintedInvoiceResponse recognizeCommonPrintedInvoice(RecognizeCommonPrintedInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCommonPrintedInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>化妆品生产许可证识别</p>
     * 
     * @param request RecognizeCosmeticProduceLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCosmeticProduceLicenseResponse
     */
    public RecognizeCosmeticProduceLicenseResponse recognizeCosmeticProduceLicenseWithOptions(RecognizeCosmeticProduceLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>化妆品生产许可证识别</p>
     * 
     * @param request RecognizeCosmeticProduceLicenseRequest
     * @return RecognizeCosmeticProduceLicenseResponse
     */
    public RecognizeCosmeticProduceLicenseResponse recognizeCosmeticProduceLicense(RecognizeCosmeticProduceLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCosmeticProduceLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>核算检测报告识别</p>
     * 
     * @param request RecognizeCovidTestReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCovidTestReportResponse
     */
    public RecognizeCovidTestReportResponse recognizeCovidTestReportWithOptions(RecognizeCovidTestReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.multipleResult)) {
            query.put("MultipleResult", request.multipleResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeCovidTestReport"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeCovidTestReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>核算检测报告识别</p>
     * 
     * @param request RecognizeCovidTestReportRequest
     * @return RecognizeCovidTestReportResponse
     */
    public RecognizeCovidTestReportResponse recognizeCovidTestReport(RecognizeCovidTestReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCovidTestReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>第二类医疗器械经营备案凭证</p>
     * 
     * @param request RecognizeCtwoMedicalDeviceManageLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeCtwoMedicalDeviceManageLicenseResponse
     */
    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicenseWithOptions(RecognizeCtwoMedicalDeviceManageLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>第二类医疗器械经营备案凭证</p>
     * 
     * @param request RecognizeCtwoMedicalDeviceManageLicenseRequest
     * @return RecognizeCtwoMedicalDeviceManageLicenseResponse
     */
    public RecognizeCtwoMedicalDeviceManageLicenseResponse recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeCtwoMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档结构化识别</p>
     * 
     * @param request RecognizeDocumentStructureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeDocumentStructureResponse
     */
    public RecognizeDocumentStructureResponse recognizeDocumentStructureWithOptions(RecognizeDocumentStructureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.outputTable)) {
            query.put("OutputTable", request.outputTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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

        if (!com.aliyun.teautil.Common.isUnset(request.useNewStyleOutput)) {
            query.put("UseNewStyleOutput", request.useNewStyleOutput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeDocumentStructure"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeDocumentStructureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档结构化识别</p>
     * 
     * @param request RecognizeDocumentStructureRequest
     * @return RecognizeDocumentStructureResponse
     */
    public RecognizeDocumentStructureResponse recognizeDocumentStructure(RecognizeDocumentStructureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeDocumentStructureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>驾驶证识别</p>
     * 
     * @param request RecognizeDrivingLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeDrivingLicenseResponse
     */
    public RecognizeDrivingLicenseResponse recognizeDrivingLicenseWithOptions(RecognizeDrivingLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>驾驶证识别</p>
     * 
     * @param request RecognizeDrivingLicenseRequest
     * @return RecognizeDrivingLicenseResponse
     */
    public RecognizeDrivingLicenseResponse recognizeDrivingLicense(RecognizeDrivingLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeDrivingLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>印刷体数学公式识别</p>
     * 
     * @param request RecognizeEduFormulaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduFormulaResponse
     */
    public RecognizeEduFormulaResponse recognizeEduFormulaWithOptions(RecognizeEduFormulaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>印刷体数学公式识别</p>
     * 
     * @param request RecognizeEduFormulaRequest
     * @return RecognizeEduFormulaResponse
     */
    public RecognizeEduFormulaResponse recognizeEduFormula(RecognizeEduFormulaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduFormulaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>口算判题</p>
     * 
     * @param request RecognizeEduOralCalculationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduOralCalculationResponse
     */
    public RecognizeEduOralCalculationResponse recognizeEduOralCalculationWithOptions(RecognizeEduOralCalculationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>口算判题</p>
     * 
     * @param request RecognizeEduOralCalculationRequest
     * @return RecognizeEduOralCalculationResponse
     */
    public RecognizeEduOralCalculationResponse recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduOralCalculationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>试卷切题识别</p>
     * 
     * @param request RecognizeEduPaperCutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduPaperCutResponse
     */
    public RecognizeEduPaperCutResponse recognizeEduPaperCutWithOptions(RecognizeEduPaperCutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cutType)) {
            query.put("CutType", request.cutType);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>试卷切题识别</p>
     * 
     * @param request RecognizeEduPaperCutRequest
     * @return RecognizeEduPaperCutResponse
     */
    public RecognizeEduPaperCutResponse recognizeEduPaperCut(RecognizeEduPaperCutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduPaperCutWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>整页试卷识别</p>
     * 
     * @param request RecognizeEduPaperOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduPaperOcrResponse
     */
    public RecognizeEduPaperOcrResponse recognizeEduPaperOcrWithOptions(RecognizeEduPaperOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>整页试卷识别</p>
     * 
     * @param request RecognizeEduPaperOcrRequest
     * @return RecognizeEduPaperOcrResponse
     */
    public RecognizeEduPaperOcrResponse recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduPaperOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>精细版结构化切题</p>
     * 
     * @param request RecognizeEduPaperStructedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduPaperStructedResponse
     */
    public RecognizeEduPaperStructedResponse recognizeEduPaperStructedWithOptions(RecognizeEduPaperStructedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>精细版结构化切题</p>
     * 
     * @param request RecognizeEduPaperStructedRequest
     * @return RecognizeEduPaperStructedResponse
     */
    public RecognizeEduPaperStructedResponse recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduPaperStructedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>题目识别</p>
     * 
     * @param request RecognizeEduQuestionOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEduQuestionOcrResponse
     */
    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcrWithOptions(RecognizeEduQuestionOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needRotate)) {
            query.put("NeedRotate", request.needRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>题目识别</p>
     * 
     * @param request RecognizeEduQuestionOcrRequest
     * @return RecognizeEduQuestionOcrResponse
     */
    public RecognizeEduQuestionOcrResponse recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEduQuestionOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>英语专项识别</p>
     * 
     * @param request RecognizeEnglishRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEnglishResponse
     */
    public RecognizeEnglishResponse recognizeEnglishWithOptions(RecognizeEnglishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>英语专项识别</p>
     * 
     * @param request RecognizeEnglishRequest
     * @return RecognizeEnglishResponse
     */
    public RecognizeEnglishResponse recognizeEnglish(RecognizeEnglishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEnglishWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>不动产权证</p>
     * 
     * @param request RecognizeEstateCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeEstateCertificationResponse
     */
    public RecognizeEstateCertificationResponse recognizeEstateCertificationWithOptions(RecognizeEstateCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>不动产权证</p>
     * 
     * @param request RecognizeEstateCertificationRequest
     * @return RecognizeEstateCertificationResponse
     */
    public RecognizeEstateCertificationResponse recognizeEstateCertification(RecognizeEstateCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeEstateCertificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>来往港澳台通行证识别</p>
     * 
     * @param request RecognizeExitEntryPermitToHKRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeExitEntryPermitToHKResponse
     */
    public RecognizeExitEntryPermitToHKResponse recognizeExitEntryPermitToHKWithOptions(RecognizeExitEntryPermitToHKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>来往港澳台通行证识别</p>
     * 
     * @param request RecognizeExitEntryPermitToHKRequest
     * @return RecognizeExitEntryPermitToHKResponse
     */
    public RecognizeExitEntryPermitToHKResponse recognizeExitEntryPermitToHK(RecognizeExitEntryPermitToHKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeExitEntryPermitToHKWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>来往大陆(内地)通行证识别</p>
     * 
     * @param request RecognizeExitEntryPermitToMainlandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeExitEntryPermitToMainlandResponse
     */
    public RecognizeExitEntryPermitToMainlandResponse recognizeExitEntryPermitToMainlandWithOptions(RecognizeExitEntryPermitToMainlandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>来往大陆(内地)通行证识别</p>
     * 
     * @param request RecognizeExitEntryPermitToMainlandRequest
     * @return RecognizeExitEntryPermitToMainlandResponse
     */
    public RecognizeExitEntryPermitToMainlandResponse recognizeExitEntryPermitToMainland(RecognizeExitEntryPermitToMainlandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeExitEntryPermitToMainlandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>食品经营许可证</p>
     * 
     * @param request RecognizeFoodManageLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeFoodManageLicenseResponse
     */
    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicenseWithOptions(RecognizeFoodManageLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>食品经营许可证</p>
     * 
     * @param request RecognizeFoodManageLicenseRequest
     * @return RecognizeFoodManageLicenseResponse
     */
    public RecognizeFoodManageLicenseResponse recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeFoodManageLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>食品生产许可证</p>
     * 
     * @param request RecognizeFoodProduceLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeFoodProduceLicenseResponse
     */
    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicenseWithOptions(RecognizeFoodProduceLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>食品生产许可证</p>
     * 
     * @param request RecognizeFoodProduceLicenseRequest
     * @return RecognizeFoodProduceLicenseResponse
     */
    public RecognizeFoodProduceLicenseResponse recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeFoodProduceLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用文字识别</p>
     * 
     * @param request RecognizeGeneralRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeGeneralResponse
     */
    public RecognizeGeneralResponse recognizeGeneralWithOptions(RecognizeGeneralRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>通用文字识别</p>
     * 
     * @param request RecognizeGeneralRequest
     * @return RecognizeGeneralResponse
     */
    public RecognizeGeneralResponse recognizeGeneral(RecognizeGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeGeneralWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DocMaster</p>
     * 
     * @param tmpReq RecognizeGeneralStructureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeGeneralStructureResponse
     */
    public RecognizeGeneralStructureResponse recognizeGeneralStructureWithOptions(RecognizeGeneralStructureRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeGeneralStructureShrinkRequest request = new RecognizeGeneralStructureShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", tmpReq.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeGeneralStructure"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeGeneralStructureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DocMaster</p>
     * 
     * @param request RecognizeGeneralStructureRequest
     * @return RecognizeGeneralStructureResponse
     */
    public RecognizeGeneralStructureResponse recognizeGeneralStructure(RecognizeGeneralStructureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeGeneralStructureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>香港身份证识别</p>
     * 
     * @param request RecognizeHKIdcardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeHKIdcardResponse
     */
    public RecognizeHKIdcardResponse recognizeHKIdcardWithOptions(RecognizeHKIdcardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeHKIdcard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeHKIdcardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>香港身份证识别</p>
     * 
     * @param request RecognizeHKIdcardRequest
     * @return RecognizeHKIdcardResponse
     */
    public RecognizeHKIdcardResponse recognizeHKIdcard(RecognizeHKIdcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeHKIdcardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用手写体识别</p>
     * 
     * @param request RecognizeHandwritingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeHandwritingResponse
     */
    public RecognizeHandwritingResponse recognizeHandwritingWithOptions(RecognizeHandwritingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.paragraph)) {
            query.put("Paragraph", request.paragraph);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>通用手写体识别</p>
     * 
     * @param request RecognizeHandwritingRequest
     * @return RecognizeHandwritingResponse
     */
    public RecognizeHandwritingResponse recognizeHandwriting(RecognizeHandwritingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeHandwritingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>防疫健康码识别</p>
     * 
     * @param request RecognizeHealthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeHealthCodeResponse
     */
    public RecognizeHealthCodeResponse recognizeHealthCodeWithOptions(RecognizeHealthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>防疫健康码识别</p>
     * 
     * @param request RecognizeHealthCodeRequest
     * @return RecognizeHealthCodeResponse
     */
    public RecognizeHealthCodeResponse recognizeHealthCode(RecognizeHealthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeHealthCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>酒店流水识别</p>
     * 
     * @param request RecognizeHotelConsumeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeHotelConsumeResponse
     */
    public RecognizeHotelConsumeResponse recognizeHotelConsumeWithOptions(RecognizeHotelConsumeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>酒店流水识别</p>
     * 
     * @param request RecognizeHotelConsumeRequest
     * @return RecognizeHotelConsumeResponse
     */
    public RecognizeHotelConsumeResponse recognizeHotelConsume(RecognizeHotelConsumeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeHotelConsumeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>户口本识别</p>
     * 
     * @param request RecognizeHouseholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeHouseholdResponse
     */
    public RecognizeHouseholdResponse recognizeHouseholdWithOptions(RecognizeHouseholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isResidentPage)) {
            query.put("IsResidentPage", request.isResidentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>户口本识别</p>
     * 
     * @param request RecognizeHouseholdRequest
     * @return RecognizeHouseholdResponse
     */
    public RecognizeHouseholdResponse recognizeHousehold(RecognizeHouseholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeHouseholdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>身份证识别</p>
     * 
     * @param request RecognizeIdcardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeIdcardResponse
     */
    public RecognizeIdcardResponse recognizeIdcardWithOptions(RecognizeIdcardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputFigure)) {
            query.put("OutputFigure", request.outputFigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputQualityInfo)) {
            query.put("OutputQualityInfo", request.outputQualityInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>身份证识别</p>
     * 
     * @param request RecognizeIdcardRequest
     * @return RecognizeIdcardResponse
     */
    public RecognizeIdcardResponse recognizeIdcard(RecognizeIdcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeIdcardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际营业执照识别</p>
     * 
     * @param request RecognizeInternationalBusinessLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeInternationalBusinessLicenseResponse
     */
    public RecognizeInternationalBusinessLicenseResponse recognizeInternationalBusinessLicenseWithOptions(RecognizeInternationalBusinessLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeInternationalBusinessLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeInternationalBusinessLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际营业执照识别</p>
     * 
     * @param request RecognizeInternationalBusinessLicenseRequest
     * @return RecognizeInternationalBusinessLicenseResponse
     */
    public RecognizeInternationalBusinessLicenseResponse recognizeInternationalBusinessLicense(RecognizeInternationalBusinessLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeInternationalBusinessLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>国际身份证识别</p>
     * 
     * @param request RecognizeInternationalIdcardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeInternationalIdcardResponse
     */
    public RecognizeInternationalIdcardResponse recognizeInternationalIdcardWithOptions(RecognizeInternationalIdcardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeInternationalIdcard"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeInternationalIdcardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>国际身份证识别</p>
     * 
     * @param request RecognizeInternationalIdcardRequest
     * @return RecognizeInternationalIdcardResponse
     */
    public RecognizeInternationalIdcardResponse recognizeInternationalIdcard(RecognizeInternationalIdcardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeInternationalIdcardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增值税发票识别</p>
     * 
     * @param request RecognizeInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeInvoiceResponse
     */
    public RecognizeInvoiceResponse recognizeInvoiceWithOptions(RecognizeInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>增值税发票识别</p>
     * 
     * @param request RecognizeInvoiceRequest
     * @return RecognizeInvoiceResponse
     */
    public RecognizeInvoiceResponse recognizeInvoice(RecognizeInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>日语识别</p>
     * 
     * @param request RecognizeJanpaneseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeJanpaneseResponse
     */
    public RecognizeJanpaneseResponse recognizeJanpaneseWithOptions(RecognizeJanpaneseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>日语识别</p>
     * 
     * @param request RecognizeJanpaneseRequest
     * @return RecognizeJanpaneseResponse
     */
    public RecognizeJanpaneseResponse recognizeJanpanese(RecognizeJanpaneseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeJanpaneseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>韩语识别</p>
     * 
     * @param request RecognizeKoreanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeKoreanResponse
     */
    public RecognizeKoreanResponse recognizeKoreanWithOptions(RecognizeKoreanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>韩语识别</p>
     * 
     * @param request RecognizeKoreanRequest
     * @return RecognizeKoreanResponse
     */
    public RecognizeKoreanResponse recognizeKorean(RecognizeKoreanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeKoreanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>拉丁语识别</p>
     * 
     * @param request RecognizeLatinRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeLatinResponse
     */
    public RecognizeLatinResponse recognizeLatinWithOptions(RecognizeLatinRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>拉丁语识别</p>
     * 
     * @param request RecognizeLatinRequest
     * @return RecognizeLatinResponse
     */
    public RecognizeLatinResponse recognizeLatin(RecognizeLatinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeLatinWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>医疗器械经营许可证</p>
     * 
     * @param request RecognizeMedicalDeviceManageLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeMedicalDeviceManageLicenseResponse
     */
    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicenseWithOptions(RecognizeMedicalDeviceManageLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>医疗器械经营许可证</p>
     * 
     * @param request RecognizeMedicalDeviceManageLicenseRequest
     * @return RecognizeMedicalDeviceManageLicenseResponse
     */
    public RecognizeMedicalDeviceManageLicenseResponse recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeMedicalDeviceManageLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>医疗器械生产许可证</p>
     * 
     * @param request RecognizeMedicalDeviceProduceLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeMedicalDeviceProduceLicenseResponse
     */
    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicenseWithOptions(RecognizeMedicalDeviceProduceLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>医疗器械生产许可证</p>
     * 
     * @param request RecognizeMedicalDeviceProduceLicenseRequest
     * @return RecognizeMedicalDeviceProduceLicenseResponse
     */
    public RecognizeMedicalDeviceProduceLicenseResponse recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeMedicalDeviceProduceLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>混贴发票识别</p>
     * 
     * @param request RecognizeMixedInvoicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeMixedInvoicesResponse
     */
    public RecognizeMixedInvoicesResponse recognizeMixedInvoicesWithOptions(RecognizeMixedInvoicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mergePdfPages)) {
            query.put("MergePdfPages", request.mergePdfPages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>混贴发票识别</p>
     * 
     * @param request RecognizeMixedInvoicesRequest
     * @return RecognizeMixedInvoicesResponse
     */
    public RecognizeMixedInvoicesResponse recognizeMixedInvoices(RecognizeMixedInvoicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeMixedInvoicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用多语言识别</p>
     * 
     * @param tmpReq RecognizeMultiLanguageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeMultiLanguageResponse
     */
    public RecognizeMultiLanguageResponse recognizeMultiLanguageWithOptions(RecognizeMultiLanguageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", tmpReq.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>通用多语言识别</p>
     * 
     * @param request RecognizeMultiLanguageRequest
     * @return RecognizeMultiLanguageResponse
     */
    public RecognizeMultiLanguageResponse recognizeMultiLanguage(RecognizeMultiLanguageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeMultiLanguageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>非税收入票据识别</p>
     * 
     * @param request RecognizeNonTaxInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeNonTaxInvoiceResponse
     */
    public RecognizeNonTaxInvoiceResponse recognizeNonTaxInvoiceWithOptions(RecognizeNonTaxInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>非税收入票据识别</p>
     * 
     * @param request RecognizeNonTaxInvoiceRequest
     * @return RecognizeNonTaxInvoiceResponse
     */
    public RecognizeNonTaxInvoiceResponse recognizeNonTaxInvoice(RecognizeNonTaxInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeNonTaxInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>护照识别</p>
     * 
     * @param request RecognizePassportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizePassportResponse
     */
    public RecognizePassportResponse recognizePassportWithOptions(RecognizePassportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>护照识别</p>
     * 
     * @param request RecognizePassportRequest
     * @return RecognizePassportResponse
     */
    public RecognizePassportResponse recognizePassport(RecognizePassportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizePassportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>支付详情页识别</p>
     * 
     * @param request RecognizePaymentRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizePaymentRecordResponse
     */
    public RecognizePaymentRecordResponse recognizePaymentRecordWithOptions(RecognizePaymentRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>支付详情页识别</p>
     * 
     * @param request RecognizePaymentRecordRequest
     * @return RecognizePaymentRecordResponse
     */
    public RecognizePaymentRecordResponse recognizePaymentRecord(RecognizePaymentRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizePaymentRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>电商订单页识别</p>
     * 
     * @param request RecognizePurchaseRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizePurchaseRecordResponse
     */
    public RecognizePurchaseRecordResponse recognizePurchaseRecordWithOptions(RecognizePurchaseRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outputMultiOrders)) {
            query.put("OutputMultiOrders", request.outputMultiOrders);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>电商订单页识别</p>
     * 
     * @param request RecognizePurchaseRecordRequest
     * @return RecognizePurchaseRecordResponse
     */
    public RecognizePurchaseRecordResponse recognizePurchaseRecord(RecognizePurchaseRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizePurchaseRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>定额发票</p>
     * 
     * @param request RecognizeQuotaInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeQuotaInvoiceResponse
     */
    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoiceWithOptions(RecognizeQuotaInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>定额发票</p>
     * 
     * @param request RecognizeQuotaInvoiceRequest
     * @return RecognizeQuotaInvoiceResponse
     */
    public RecognizeQuotaInvoiceResponse recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeQuotaInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>网约车行程单识别</p>
     * 
     * @param request RecognizeRideHailingItineraryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeRideHailingItineraryResponse
     */
    public RecognizeRideHailingItineraryResponse recognizeRideHailingItineraryWithOptions(RecognizeRideHailingItineraryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>网约车行程单识别</p>
     * 
     * @param request RecognizeRideHailingItineraryRequest
     * @return RecognizeRideHailingItineraryResponse
     */
    public RecognizeRideHailingItineraryResponse recognizeRideHailingItinerary(RecognizeRideHailingItineraryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeRideHailingItineraryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增值税发票卷票</p>
     * 
     * @param request RecognizeRollTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeRollTicketResponse
     */
    public RecognizeRollTicketResponse recognizeRollTicketWithOptions(RecognizeRollTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>增值税发票卷票</p>
     * 
     * @param request RecognizeRollTicketRequest
     * @return RecognizeRollTicketResponse
     */
    public RecognizeRollTicketResponse recognizeRollTicket(RecognizeRollTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeRollTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>俄语识别</p>
     * 
     * @param request RecognizeRussianRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeRussianResponse
     */
    public RecognizeRussianResponse recognizeRussianWithOptions(RecognizeRussianRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>俄语识别</p>
     * 
     * @param request RecognizeRussianRequest
     * @return RecognizeRussianResponse
     */
    public RecognizeRussianResponse recognizeRussian(RecognizeRussianRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeRussianWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>购物小票识别</p>
     * 
     * @param request RecognizeShoppingReceiptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeShoppingReceiptResponse
     */
    public RecognizeShoppingReceiptResponse recognizeShoppingReceiptWithOptions(RecognizeShoppingReceiptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeShoppingReceipt"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeShoppingReceiptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>购物小票识别</p>
     * 
     * @param request RecognizeShoppingReceiptRequest
     * @return RecognizeShoppingReceiptResponse
     */
    public RecognizeShoppingReceiptResponse recognizeShoppingReceipt(RecognizeShoppingReceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeShoppingReceiptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社会保障卡识别</p>
     * 
     * @param request RecognizeSocialSecurityCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeSocialSecurityCardResponse
     */
    public RecognizeSocialSecurityCardResponse recognizeSocialSecurityCardWithOptions(RecognizeSocialSecurityCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>社会保障卡识别</p>
     * 
     * @param request RecognizeSocialSecurityCardRequest
     * @return RecognizeSocialSecurityCardResponse
     */
    public RecognizeSocialSecurityCardResponse recognizeSocialSecurityCard(RecognizeSocialSecurityCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeSocialSecurityCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>社保卡识别</p>
     * 
     * @param request RecognizeSocialSecurityCardVersionIIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeSocialSecurityCardVersionIIResponse
     */
    public RecognizeSocialSecurityCardVersionIIResponse recognizeSocialSecurityCardVersionIIWithOptions(RecognizeSocialSecurityCardVersionIIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecognizeSocialSecurityCardVersionII"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecognizeSocialSecurityCardVersionIIResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>社保卡识别</p>
     * 
     * @param request RecognizeSocialSecurityCardVersionIIRequest
     * @return RecognizeSocialSecurityCardVersionIIResponse
     */
    public RecognizeSocialSecurityCardVersionIIResponse recognizeSocialSecurityCardVersionII(RecognizeSocialSecurityCardVersionIIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeSocialSecurityCardVersionIIWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>表格识别</p>
     * 
     * @param request RecognizeTableOcrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTableOcrResponse
     */
    public RecognizeTableOcrResponse recognizeTableOcrWithOptions(RecognizeTableOcrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isHandWriting)) {
            query.put("IsHandWriting", request.isHandWriting);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>表格识别</p>
     * 
     * @param request RecognizeTableOcrRequest
     * @return RecognizeTableOcrResponse
     */
    public RecognizeTableOcrResponse recognizeTableOcr(RecognizeTableOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTableOcrWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>税收完税证明识别</p>
     * 
     * @param request RecognizeTaxClearanceCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTaxClearanceCertificateResponse
     */
    public RecognizeTaxClearanceCertificateResponse recognizeTaxClearanceCertificateWithOptions(RecognizeTaxClearanceCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>税收完税证明识别</p>
     * 
     * @param request RecognizeTaxClearanceCertificateRequest
     * @return RecognizeTaxClearanceCertificateResponse
     */
    public RecognizeTaxClearanceCertificateResponse recognizeTaxClearanceCertificate(RecognizeTaxClearanceCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTaxClearanceCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>出租车发票</p>
     * 
     * @param request RecognizeTaxiInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTaxiInvoiceResponse
     */
    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoiceWithOptions(RecognizeTaxiInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>出租车发票</p>
     * 
     * @param request RecognizeTaxiInvoiceRequest
     * @return RecognizeTaxiInvoiceResponse
     */
    public RecognizeTaxiInvoiceResponse recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTaxiInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>泰语识别</p>
     * 
     * @param request RecognizeThaiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeThaiResponse
     */
    public RecognizeThaiResponse recognizeThaiWithOptions(RecognizeThaiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>泰语识别</p>
     * 
     * @param request RecognizeThaiRequest
     * @return RecognizeThaiResponse
     */
    public RecognizeThaiResponse recognizeThai(RecognizeThaiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeThaiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>过路过桥费发票识别</p>
     * 
     * @param request RecognizeTollInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTollInvoiceResponse
     */
    public RecognizeTollInvoiceResponse recognizeTollInvoiceWithOptions(RecognizeTollInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>过路过桥费发票识别</p>
     * 
     * @param request RecognizeTollInvoiceRequest
     * @return RecognizeTollInvoiceResponse
     */
    public RecognizeTollInvoiceResponse recognizeTollInvoice(RecognizeTollInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTollInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>商标注册证</p>
     * 
     * @param request RecognizeTradeMarkCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTradeMarkCertificationResponse
     */
    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertificationWithOptions(RecognizeTradeMarkCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>商标注册证</p>
     * 
     * @param request RecognizeTradeMarkCertificationRequest
     * @return RecognizeTradeMarkCertificationResponse
     */
    public RecognizeTradeMarkCertificationResponse recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTradeMarkCertificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>火车票</p>
     * 
     * @param request RecognizeTrainInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeTrainInvoiceResponse
     */
    public RecognizeTrainInvoiceResponse recognizeTrainInvoiceWithOptions(RecognizeTrainInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>火车票</p>
     * 
     * @param request RecognizeTrainInvoiceRequest
     * @return RecognizeTrainInvoiceResponse
     */
    public RecognizeTrainInvoiceResponse recognizeTrainInvoice(RecognizeTrainInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeTrainInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>二手车统一销售发票识别</p>
     * 
     * @param request RecognizeUsedCarInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeUsedCarInvoiceResponse
     */
    public RecognizeUsedCarInvoiceResponse recognizeUsedCarInvoiceWithOptions(RecognizeUsedCarInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>二手车统一销售发票识别</p>
     * 
     * @param request RecognizeUsedCarInvoiceRequest
     * @return RecognizeUsedCarInvoiceResponse
     */
    public RecognizeUsedCarInvoiceResponse recognizeUsedCarInvoice(RecognizeUsedCarInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeUsedCarInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>车辆合格证识别</p>
     * 
     * @param request RecognizeVehicleCertificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeVehicleCertificationResponse
     */
    public RecognizeVehicleCertificationResponse recognizeVehicleCertificationWithOptions(RecognizeVehicleCertificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>车辆合格证识别</p>
     * 
     * @param request RecognizeVehicleCertificationRequest
     * @return RecognizeVehicleCertificationResponse
     */
    public RecognizeVehicleCertificationResponse recognizeVehicleCertification(RecognizeVehicleCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeVehicleCertificationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>行驶证识别</p>
     * 
     * @param request RecognizeVehicleLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeVehicleLicenseResponse
     */
    public RecognizeVehicleLicenseResponse recognizeVehicleLicenseWithOptions(RecognizeVehicleLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>行驶证识别</p>
     * 
     * @param request RecognizeVehicleLicenseRequest
     * @return RecognizeVehicleLicenseResponse
     */
    public RecognizeVehicleLicenseResponse recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeVehicleLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>机动车注册登记证识别</p>
     * 
     * @param request RecognizeVehicleRegistrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeVehicleRegistrationResponse
     */
    public RecognizeVehicleRegistrationResponse recognizeVehicleRegistrationWithOptions(RecognizeVehicleRegistrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>机动车注册登记证识别</p>
     * 
     * @param request RecognizeVehicleRegistrationRequest
     * @return RecognizeVehicleRegistrationResponse
     */
    public RecognizeVehicleRegistrationResponse recognizeVehicleRegistration(RecognizeVehicleRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeVehicleRegistrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>电子面单识别</p>
     * 
     * @param request RecognizeWaybillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecognizeWaybillResponse
     */
    public RecognizeWaybillResponse recognizeWaybillWithOptions(RecognizeWaybillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", request.body),
            new TeaPair("stream", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>电子面单识别</p>
     * 
     * @param request RecognizeWaybillRequest
     * @return RecognizeWaybillResponse
     */
    public RecognizeWaybillResponse recognizeWaybill(RecognizeWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recognizeWaybillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>营业执照核验</p>
     * 
     * @param request VerifyBusinessLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyBusinessLicenseResponse
     */
    public VerifyBusinessLicenseResponse verifyBusinessLicenseWithOptions(VerifyBusinessLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creditCode)) {
            query.put("CreditCode", request.creditCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalPerson)) {
            query.put("LegalPerson", request.legalPerson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyBusinessLicense"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyBusinessLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>营业执照核验</p>
     * 
     * @param request VerifyBusinessLicenseRequest
     * @return VerifyBusinessLicenseResponse
     */
    public VerifyBusinessLicenseResponse verifyBusinessLicense(VerifyBusinessLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyBusinessLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>增值税发票核验</p>
     * 
     * @param request VerifyVATInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyVATInvoiceResponse
     */
    public VerifyVATInvoiceResponse verifyVATInvoiceWithOptions(VerifyVATInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.invoiceCode)) {
            query.put("InvoiceCode", request.invoiceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceDate)) {
            query.put("InvoiceDate", request.invoiceDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceKind)) {
            query.put("InvoiceKind", request.invoiceKind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceNo)) {
            query.put("InvoiceNo", request.invoiceNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSum)) {
            query.put("InvoiceSum", request.invoiceSum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyVATInvoice"),
            new TeaPair("version", "2021-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyVATInvoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增值税发票核验</p>
     * 
     * @param request VerifyVATInvoiceRequest
     * @return VerifyVATInvoiceResponse
     */
    public VerifyVATInvoiceResponse verifyVATInvoice(VerifyVATInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVATInvoiceWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902;

import com.aliyun.tea.*;
import com.aliyun.trademark20190902.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("trademark", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public BindApplicantResponse bindApplicantWithOptions(BindApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindApplicantResponse());
    }

    public BindApplicantResponse bindApplicant(BindApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindApplicantWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrder"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public CheckAuthorizationLetterResponse checkAuthorizationLetterWithOptions(CheckAuthorizationLetterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantType)) {
            query.put("ApplicantType", request.applicantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.color)) {
            query.put("Color", request.color);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactZipcode)) {
            query.put("ContactZipcode", request.contactZipcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAuthorizationLetter"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAuthorizationLetterResponse());
    }

    public CheckAuthorizationLetterResponse checkAuthorizationLetter(CheckAuthorizationLetterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAuthorizationLetterWithOptions(request, runtime);
    }

    public CheckBizAvailableResponse checkBizAvailableWithOptions(CheckBizAvailableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.biz)) {
            query.put("Biz", request.biz);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckBizAvailable"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBizAvailableResponse());
    }

    public CheckBizAvailableResponse checkBizAvailable(CheckBizAvailableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkBizAvailableWithOptions(request, runtime);
    }

    public CheckDuplicateApplicantRiskResponse checkDuplicateApplicantRiskWithOptions(CheckDuplicateApplicantRiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            query.put("EventSceneType", request.eventSceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDuplicateApplicantRisk"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDuplicateApplicantRiskResponse());
    }

    public CheckDuplicateApplicantRiskResponse checkDuplicateApplicantRisk(CheckDuplicateApplicantRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDuplicateApplicantRiskWithOptions(request, runtime);
    }

    public CheckDuplicateClassificationResponse checkDuplicateClassificationWithOptions(CheckDuplicateClassificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            query.put("EventSceneType", request.eventSceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDuplicateClassification"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDuplicateClassificationResponse());
    }

    public CheckDuplicateClassificationResponse checkDuplicateClassification(CheckDuplicateClassificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDuplicateClassificationWithOptions(request, runtime);
    }

    public CheckDuplicateTrademarkResponse checkDuplicateTrademarkWithOptions(CheckDuplicateTrademarkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            query.put("EventSceneType", request.eventSceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialName)) {
            query.put("MaterialName", request.materialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDuplicateTrademark"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDuplicateTrademarkResponse());
    }

    public CheckDuplicateTrademarkResponse checkDuplicateTrademark(CheckDuplicateTrademarkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDuplicateTrademarkWithOptions(request, runtime);
    }

    public CheckMaterialValidityResponse checkMaterialValidityWithOptions(CheckMaterialValidityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenseOssKey)) {
            query.put("BusinessLicenseOssKey", request.businessLicenseOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardName)) {
            query.put("IdCardName", request.idCardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardNumber)) {
            query.put("IdCardNumber", request.idCardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardOssKey)) {
            query.put("IdCardOssKey", request.idCardOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialRegion)) {
            query.put("MaterialRegion", request.materialRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            query.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckMaterialValidity"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckMaterialValidityResponse());
    }

    public CheckMaterialValidityResponse checkMaterialValidity(CheckMaterialValidityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkMaterialValidityWithOptions(request, runtime);
    }

    public CheckTrademarkNameResponse checkTrademarkNameWithOptions(CheckTrademarkNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            query.put("EventSceneType", request.eventSceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTrademarkName"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTrademarkNameResponse());
    }

    public CheckTrademarkNameResponse checkTrademarkName(CheckTrademarkNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkTrademarkNameWithOptions(request, runtime);
    }

    public CloseTrademarkApplicationResponse closeTrademarkApplicationWithOptions(CloseTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTrademarkApplicationResponse());
    }

    public CloseTrademarkApplicationResponse closeTrademarkApplication(CloseTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeTrademarkApplicationWithOptions(request, runtime);
    }

    public CombineAuthorizationLetterResponse combineAuthorizationLetterWithOptions(CombineAuthorizationLetterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantType)) {
            query.put("ApplicantType", request.applicantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPhone)) {
            query.put("ContactPhone", request.contactPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactPostcode)) {
            query.put("ContactPostcode", request.contactPostcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialName)) {
            query.put("MaterialName", request.materialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nationality)) {
            query.put("Nationality", request.nationality);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmProduceType)) {
            query.put("TmProduceType", request.tmProduceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CombineAuthorizationLetter"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CombineAuthorizationLetterResponse());
    }

    public CombineAuthorizationLetterResponse combineAuthorizationLetter(CombineAuthorizationLetterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.combineAuthorizationLetterWithOptions(request, runtime);
    }

    public ComplementTrademarkApplicationResponse complementTrademarkApplicationWithOptions(ComplementTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementId)) {
            query.put("AgreementId", request.agreementId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBlackIcon)) {
            query.put("IsBlackIcon", request.isBlackIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderData)) {
            query.put("OrderData", request.orderData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkComment)) {
            query.put("TrademarkComment", request.trademarkComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkIconOssKey)) {
            query.put("TrademarkIconOssKey", request.trademarkIconOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNameType)) {
            query.put("TrademarkNameType", request.trademarkNameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkType)) {
            query.put("TrademarkType", request.trademarkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ComplementTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ComplementTrademarkApplicationResponse());
    }

    public ComplementTrademarkApplicationResponse complementTrademarkApplication(ComplementTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.complementTrademarkApplicationWithOptions(request, runtime);
    }

    public ConfirmExpertSolutionResponse confirmExpertSolutionWithOptions(ConfirmExpertSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmExpertSolution"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmExpertSolutionResponse());
    }

    public ConfirmExpertSolutionResponse confirmExpertSolution(ConfirmExpertSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmExpertSolutionWithOptions(request, runtime);
    }

    public CreateApplicantResponse createApplicantWithOptions(CreateApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantRegion)) {
            query.put("ApplicantRegion", request.applicantRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantType)) {
            query.put("ApplicantType", request.applicantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenceOssKey)) {
            query.put("BusinessLicenceOssKey", request.businessLicenceOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactAddress)) {
            query.put("ContactAddress", request.contactAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCity)) {
            query.put("ContactCity", request.contactCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCounty)) {
            query.put("ContactCounty", request.contactCounty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDistrict)) {
            query.put("ContactDistrict", request.contactDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactProvince)) {
            query.put("ContactProvince", request.contactProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactZipcode)) {
            query.put("ContactZipcode", request.contactZipcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EAddress)) {
            query.put("EAddress", request.EAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EName)) {
            query.put("EName", request.EName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardName)) {
            query.put("IdCardName", request.idCardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardNumber)) {
            query.put("IdCardNumber", request.idCardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardOssKey)) {
            query.put("IdCardOssKey", request.idCardOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeOssKey)) {
            query.put("LegalNoticeOssKey", request.legalNoticeOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passportOssKey)) {
            query.put("PassportOssKey", request.passportOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicantResponse());
    }

    public CreateApplicantResponse createApplicant(CreateApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicantWithOptions(request, runtime);
    }

    public CreateCommodityOrderResponse createCommodityOrderWithOptions(CreateCommodityOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCommodityOrderShrinkRequest request = new CreateCommodityOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderParams)) {
            request.orderParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderParams, "OrderParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            query.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParamsShrink)) {
            query.put("OrderParams", request.orderParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specCode)) {
            query.put("SpecCode", request.specCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommodityOrder"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommodityOrderResponse());
    }

    public CreateCommodityOrderResponse createCommodityOrder(CreateCommodityOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCommodityOrderWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementId)) {
            query.put("AgreementId", request.agreementId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blackAndWhiteIcon)) {
            query.put("BlackAndWhiteIcon", request.blackAndWhiteIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classifications)) {
            query.put("Classifications", request.classifications);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeKey)) {
            query.put("LegalNoticeKey", request.legalNoticeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentCallback)) {
            query.put("PaymentCallback", request.paymentCallback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkComment)) {
            query.put("TrademarkComment", request.trademarkComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkIcon)) {
            query.put("TrademarkIcon", request.trademarkIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNameType)) {
            query.put("TrademarkNameType", request.trademarkNameType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public CreateTrademarkApplicationResponse createTrademarkApplicationWithOptions(CreateTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agreementId)) {
            query.put("AgreementId", request.agreementId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blackAndWhiteIcon)) {
            query.put("BlackAndWhiteIcon", request.blackAndWhiteIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classifications)) {
            query.put("Classifications", request.classifications);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotentId)) {
            query.put("IdempotentId", request.idempotentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeKey)) {
            query.put("LegalNoticeKey", request.legalNoticeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkComment)) {
            query.put("TrademarkComment", request.trademarkComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkIcon)) {
            query.put("TrademarkIcon", request.trademarkIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNameType)) {
            query.put("TrademarkNameType", request.trademarkNameType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrademarkApplicationResponse());
    }

    public CreateTrademarkApplicationResponse createTrademarkApplication(CreateTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTrademarkApplicationWithOptions(request, runtime);
    }

    public DeleteSearchConditionResponse deleteSearchConditionWithOptions(DeleteSearchConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionId)) {
            query.put("ConditionId", request.conditionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSearchCondition"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSearchConditionResponse());
    }

    public DeleteSearchConditionResponse deleteSearchCondition(DeleteSearchConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSearchConditionWithOptions(request, runtime);
    }

    public DescribeAdminTrademarkApplicationResponse describeAdminTrademarkApplicationWithOptions(DescribeAdminTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdminTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdminTrademarkApplicationResponse());
    }

    public DescribeAdminTrademarkApplicationResponse describeAdminTrademarkApplication(DescribeAdminTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdminTrademarkApplicationWithOptions(request, runtime);
    }

    public DescribeApplicantResponse describeApplicantWithOptions(DescribeApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicantResponse());
    }

    public DescribeApplicantResponse describeApplicant(DescribeApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicantWithOptions(request, runtime);
    }

    public DescribePartnerTrademarkApplicationResponse describePartnerTrademarkApplicationWithOptions(DescribePartnerTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePartnerTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePartnerTrademarkApplicationResponse());
    }

    public DescribePartnerTrademarkApplicationResponse describePartnerTrademarkApplication(DescribePartnerTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePartnerTrademarkApplicationWithOptions(request, runtime);
    }

    public DescribeQualificationStatusResponse describeQualificationStatusWithOptions(DescribeQualificationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tbUid)) {
            query.put("TbUid", request.tbUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualificationStatus"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualificationStatusResponse());
    }

    public DescribeQualificationStatusResponse describeQualificationStatus(DescribeQualificationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualificationStatusWithOptions(request, runtime);
    }

    /**
      * ****
      *
      * @param request DescribeSupplementRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DescribeSupplementResponse
     */
    public DescribeSupplementResponse describeSupplementWithOptions(DescribeSupplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.supplementId)) {
            query.put("SupplementId", request.supplementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupplement"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupplementResponse());
    }

    /**
      * ****
      *
      * @param request DescribeSupplementRequest
      * @return DescribeSupplementResponse
     */
    public DescribeSupplementResponse describeSupplement(DescribeSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupplementWithOptions(request, runtime);
    }

    public DescribeTrademarkApplicationResponse describeTrademarkApplicationWithOptions(DescribeTrademarkApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrademarkApplication"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrademarkApplicationResponse());
    }

    public DescribeTrademarkApplicationResponse describeTrademarkApplication(DescribeTrademarkApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrademarkApplicationWithOptions(request, runtime);
    }

    public DescribeTrademarkDetailForInnerResponse describeTrademarkDetailForInnerWithOptions(DescribeTrademarkDetailForInnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrademarkDetailForInner"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTrademarkDetailForInnerResponse());
    }

    public DescribeTrademarkDetailForInnerResponse describeTrademarkDetailForInner(DescribeTrademarkDetailForInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTrademarkDetailForInnerWithOptions(request, runtime);
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicyWithOptions(GenerateUploadFilePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadFilePolicy"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadFilePolicyResponse());
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicy(GenerateUploadFilePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadFilePolicyWithOptions(request, runtime);
    }

    public GetAlipayUrlResponse getAlipayUrlWithOptions(GetAlipayUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlipayUrl"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlipayUrlResponse());
    }

    public GetAlipayUrlResponse getAlipayUrl(GetAlipayUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAlipayUrlWithOptions(request, runtime);
    }

    public GetOrderConfirmUrlResponse getOrderConfirmUrlWithOptions(GetOrderConfirmUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTraceCode)) {
            query.put("OutTraceCode", request.outTraceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outTraceType)) {
            query.put("OutTraceType", request.outTraceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderConfirmUrl"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderConfirmUrlResponse());
    }

    public GetOrderConfirmUrlResponse getOrderConfirmUrl(GetOrderConfirmUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderConfirmUrlWithOptions(request, runtime);
    }

    public GetStsByTaobaoUidResponse getStsByTaobaoUidWithOptions(GetStsByTaobaoUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunUid)) {
            query.put("AliyunUid", request.aliyunUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbUid)) {
            query.put("TbUid", request.tbUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStsByTaobaoUid"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStsByTaobaoUidResponse());
    }

    public GetStsByTaobaoUidResponse getStsByTaobaoUid(GetStsByTaobaoUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStsByTaobaoUidWithOptions(request, runtime);
    }

    public ListAdminTrademarkApplicationLogsResponse listAdminTrademarkApplicationLogsWithOptions(ListAdminTrademarkApplicationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdminTrademarkApplicationLogs"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdminTrademarkApplicationLogsResponse());
    }

    public ListAdminTrademarkApplicationLogsResponse listAdminTrademarkApplicationLogs(ListAdminTrademarkApplicationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAdminTrademarkApplicationLogsWithOptions(request, runtime);
    }

    public ListAdminTrademarkApplicationsResponse listAdminTrademarkApplicationsWithOptions(ListAdminTrademarkApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationStatus)) {
            query.put("ApplicationStatus", request.applicationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementStatus)) {
            query.put("SupplementStatus", request.supplementStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNumber)) {
            query.put("TrademarkNumber", request.trademarkNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdminTrademarkApplications"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdminTrademarkApplicationsResponse());
    }

    public ListAdminTrademarkApplicationsResponse listAdminTrademarkApplications(ListAdminTrademarkApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAdminTrademarkApplicationsWithOptions(request, runtime);
    }

    public ListApplicantsResponse listApplicantsWithOptions(ListApplicantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantRegion)) {
            query.put("ApplicantRegion", request.applicantRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantType)) {
            query.put("ApplicantType", request.applicantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantVersion)) {
            query.put("ApplicantVersion", request.applicantVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemVersion)) {
            query.put("SystemVersion", request.systemVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicants"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicantsResponse());
    }

    public ListApplicantsResponse listApplicants(ListApplicantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicantsWithOptions(request, runtime);
    }

    public ListAreasResponse listAreasWithOptions(ListAreasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCode)) {
            query.put("ParentCode", request.parentCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAreas"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAreasResponse());
    }

    public ListAreasResponse listAreas(ListAreasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAreasWithOptions(request, runtime);
    }

    public ListClassificationConditionsResponse listClassificationConditionsWithOptions(ListClassificationConditionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClassificationConditions"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClassificationConditionsResponse());
    }

    public ListClassificationConditionsResponse listClassificationConditions(ListClassificationConditionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClassificationConditionsWithOptions(request, runtime);
    }

    public ListClassificationsResponse listClassificationsWithOptions(ListClassificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentCode)) {
            query.put("ParentCode", request.parentCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClassifications"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClassificationsResponse());
    }

    public ListClassificationsResponse listClassifications(ListClassificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClassificationsWithOptions(request, runtime);
    }

    public ListTrademarkApplicationLogsResponse listTrademarkApplicationLogsWithOptions(ListTrademarkApplicationLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrademarkApplicationLogs"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrademarkApplicationLogsResponse());
    }

    public ListTrademarkApplicationLogsResponse listTrademarkApplicationLogs(ListTrademarkApplicationLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrademarkApplicationLogsWithOptions(request, runtime);
    }

    public ListTrademarkApplicationsResponse listTrademarkApplicationsWithOptions(ListTrademarkApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationStatus)) {
            query.put("ApplicationStatus", request.applicationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeLeft)) {
            query.put("CreateTimeLeft", request.createTimeLeft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRight)) {
            query.put("CreateTimeRight", request.createTimeRight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flag)) {
            query.put("Flag", request.flag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryVoucherOrderDoneFlag)) {
            query.put("QueryVoucherOrderDoneFlag", request.queryVoucherOrderDoneFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryVoucherOrderFlag)) {
            query.put("QueryVoucherOrderFlag", request.queryVoucherOrderFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFiled)) {
            query.put("SortFiled", request.sortFiled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementStatus)) {
            query.put("SupplementStatus", request.supplementStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNumber)) {
            query.put("TrademarkNumber", request.trademarkNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrademarkApplications"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrademarkApplicationsResponse());
    }

    public ListTrademarkApplicationsResponse listTrademarkApplications(ListTrademarkApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrademarkApplicationsWithOptions(request, runtime);
    }

    public ListTrademarkSearchForInnerResponse listTrademarkSearchForInnerWithOptions(ListTrademarkSearchForInnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyBeginTime)) {
            query.put("ApplyBeginTime", request.applyBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyEndTime)) {
            query.put("ApplyEndTime", request.applyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifPrecision)) {
            query.put("IfPrecision", request.ifPrecision);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPreference)) {
            query.put("SearchPreference", request.searchPreference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrademarkSearchForInner"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrademarkSearchForInnerResponse());
    }

    public ListTrademarkSearchForInnerResponse listTrademarkSearchForInner(ListTrademarkSearchForInnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrademarkSearchForInnerWithOptions(request, runtime);
    }

    public PutMeasureDataResponse putMeasureDataWithOptions(PutMeasureDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            body.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureData"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureDataResponse());
    }

    public PutMeasureDataResponse putMeasureData(PutMeasureDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureDataWithOptions(request, runtime);
    }

    public PutMeasureReadyFlagResponse putMeasureReadyFlagWithOptions(PutMeasureReadyFlagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readyFlag)) {
            query.put("ReadyFlag", request.readyFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutMeasureReadyFlag"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutMeasureReadyFlagResponse());
    }

    public PutMeasureReadyFlagResponse putMeasureReadyFlag(PutMeasureReadyFlagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putMeasureReadyFlagWithOptions(request, runtime);
    }

    public QueryActivityItemsResponse queryActivityItemsWithOptions(QueryActivityItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            query.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendInfo)) {
            query.put("ExtendInfo", request.extendInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floorIndex)) {
            query.put("FloorIndex", request.floorIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("Mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refresh)) {
            query.put("Refresh", request.refresh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umId)) {
            query.put("UmId", request.umId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryActivityItems"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryActivityItemsResponse());
    }

    public QueryActivityItemsResponse queryActivityItems(QueryActivityItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryActivityItemsWithOptions(request, runtime);
    }

    public QueryAliyunUidResponse queryAliyunUidWithOptions(QueryAliyunUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tbUid)) {
            query.put("TbUid", request.tbUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAliyunUid"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAliyunUidResponse());
    }

    public QueryAliyunUidResponse queryAliyunUid(QueryAliyunUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAliyunUidWithOptions(request, runtime);
    }

    public QueryDetailItemResponse queryDetailItemWithOptions(QueryDetailItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detailConvertType)) {
            query.put("DetailConvertType", request.detailConvertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailId)) {
            query.put("DetailId", request.detailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.detailType)) {
            query.put("DetailType", request.detailType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("Mock", request.mock);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDetailItem"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDetailItemResponse());
    }

    public QueryDetailItemResponse queryDetailItem(QueryDetailItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDetailItemWithOptions(request, runtime);
    }

    public QueryRemainResourcesResponse queryRemainResourcesWithOptions(QueryRemainResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRemainResources"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRemainResourcesResponse());
    }

    public QueryRemainResourcesResponse queryRemainResources(QueryRemainResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRemainResourcesWithOptions(request, runtime);
    }

    public RefuseSupplementResponse refuseSupplementWithOptions(RefuseSupplementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.supplementId)) {
            query.put("SupplementId", request.supplementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseSupplement"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseSupplementResponse());
    }

    public RefuseSupplementResponse refuseSupplement(RefuseSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refuseSupplementWithOptions(request, runtime);
    }

    public RejectExpertSolutionResponse rejectExpertSolutionWithOptions(RejectExpertSolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectExpertSolution"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectExpertSolutionResponse());
    }

    public RejectExpertSolutionResponse rejectExpertSolution(RejectExpertSolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectExpertSolutionWithOptions(request, runtime);
    }

    public RemoveApplicantResponse removeApplicantWithOptions(RemoveApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApplicantResponse());
    }

    public RemoveApplicantResponse removeApplicant(RemoveApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApplicantWithOptions(request, runtime);
    }

    public SaveSearchConditionResponse saveSearchConditionWithOptions(SaveSearchConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionContent)) {
            body.put("ConditionContent", request.conditionContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            body.put("TagName", request.tagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            body.put("Umid", request.umid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSearchCondition"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSearchConditionResponse());
    }

    public SaveSearchConditionResponse saveSearchCondition(SaveSearchConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSearchConditionWithOptions(request, runtime);
    }

    public SaveTemporaryApplicantResponse saveTemporaryApplicantWithOptions(SaveTemporaryApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenceOssKey)) {
            query.put("BusinessLicenceOssKey", request.businessLicenceOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            query.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.completeApplicant)) {
            query.put("CompleteApplicant", request.completeApplicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactAddress)) {
            query.put("ContactAddress", request.contactAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCity)) {
            query.put("ContactCity", request.contactCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCounty)) {
            query.put("ContactCounty", request.contactCounty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDistrict)) {
            query.put("ContactDistrict", request.contactDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactProvince)) {
            query.put("ContactProvince", request.contactProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactZipCode)) {
            query.put("ContactZipCode", request.contactZipCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            query.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EAddress)) {
            query.put("EAddress", request.EAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EName)) {
            query.put("EName", request.EName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardOssKey)) {
            query.put("IdCardOssKey", request.idCardOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeOssKey)) {
            query.put("LegalNoticeOssKey", request.legalNoticeOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passportOssKey)) {
            query.put("PassportOssKey", request.passportOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.town)) {
            query.put("Town", request.town);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTemporaryApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTemporaryApplicantResponse());
    }

    public SaveTemporaryApplicantResponse saveTemporaryApplicant(SaveTemporaryApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveTemporaryApplicantWithOptions(request, runtime);
    }

    public SearchItemsResponse searchItemsWithOptions(SearchItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludedTags)) {
            query.put("ExcludedTags", request.excludedTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludedUids)) {
            query.put("ExcludedUids", request.excludedUids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.feedsType)) {
            query.put("FeedsType", request.feedsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intCls)) {
            query.put("IntCls", request.intCls);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mock)) {
            query.put("Mock", request.mock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priceLeft)) {
            query.put("PriceLeft", request.priceLeft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priceRight)) {
            query.put("PriceRight", request.priceRight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            query.put("Products", request.products);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNameLength)) {
            query.put("TrademarkNameLength", request.trademarkNameLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkNameType)) {
            query.put("TrademarkNameType", request.trademarkNameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umId)) {
            query.put("UmId", request.umId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchItems"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchItemsResponse());
    }

    public SearchItemsResponse searchItems(SearchItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchItemsWithOptions(request, runtime);
    }

    public SearchSimilarityResponse searchSimilarityWithOptions(SearchSimilarityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchSimilarityShrinkRequest request = new SearchSimilarityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.classifications)) {
            request.classificationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.classifications, "Classifications", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.similarGroups)) {
            request.similarGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.similarGroups, "SimilarGroups", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classificationsShrink)) {
            query.put("Classifications", request.classificationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameUriList)) {
            query.put("NameUriList", request.nameUriList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDetail)) {
            query.put("ShowDetail", request.showDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarGroupsShrink)) {
            query.put("SimilarGroups", request.similarGroupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("Sorter", request.sorter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchSimilarity"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchSimilarityResponse());
    }

    public SearchSimilarityResponse searchSimilarity(SearchSimilarityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchSimilarityWithOptions(request, runtime);
    }

    public SearchSimilarityListResponse searchSimilarityListWithOptions(SearchSimilarityListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchSimilarityListShrinkRequest request = new SearchSimilarityListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.classifications)) {
            request.classificationsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.classifications, "Classifications", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.similarGroups)) {
            request.similarGroupsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.similarGroups, "SimilarGroups", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classificationsShrink)) {
            query.put("Classifications", request.classificationsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarGroupsShrink)) {
            query.put("SimilarGroups", request.similarGroupsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.successSearchType)) {
            query.put("SuccessSearchType", request.successSearchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uri)) {
            query.put("Uri", request.uri);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchSimilarityList"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchSimilarityListResponse());
    }

    public SearchSimilarityListResponse searchSimilarityList(SearchSimilarityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchSimilarityListWithOptions(request, runtime);
    }

    public SendMessageToUserResponse sendMessageToUserWithOptions(SendMessageToUserRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendMessageToUserShrinkRequest request = new SendMessageToUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.templateData)) {
            request.templateDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.templateData, "TemplateData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiverNickName)) {
            query.put("ReceiverNickName", request.receiverNickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNickName)) {
            query.put("SenderNickName", request.senderNickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateDataShrink)) {
            query.put("TemplateData", request.templateDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessageToUser"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageToUserResponse());
    }

    public SendMessageToUserResponse sendMessageToUser(SendMessageToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendMessageToUserWithOptions(request, runtime);
    }

    /**
      * ***
      *
      * @param tmpReq SubmitSupplementRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SubmitSupplementResponse
     */
    public SubmitSupplementResponse submitSupplementWithOptions(SubmitSupplementRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSupplementShrinkRequest request = new SubmitSupplementShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userFiles)) {
            request.userFilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userFiles, "UserFiles", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementId)) {
            query.put("SupplementId", request.supplementId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userFilesShrink)) {
            query.put("UserFiles", request.userFilesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSupplement"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSupplementResponse());
    }

    /**
      * ***
      *
      * @param request SubmitSupplementRequest
      * @return SubmitSupplementResponse
     */
    public SubmitSupplementResponse submitSupplement(SubmitSupplementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSupplementWithOptions(request, runtime);
    }

    public UpdateApplicantResponse updateApplicantWithOptions(UpdateApplicantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicantName)) {
            query.put("ApplicantName", request.applicantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationOssKey)) {
            query.put("AuthorizationOssKey", request.authorizationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenceOssKey)) {
            query.put("BusinessLicenceOssKey", request.businessLicenceOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactAddress)) {
            query.put("ContactAddress", request.contactAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCity)) {
            query.put("ContactCity", request.contactCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCounty)) {
            query.put("ContactCounty", request.contactCounty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactDistrict)) {
            query.put("ContactDistrict", request.contactDistrict);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            query.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactProvince)) {
            query.put("ContactProvince", request.contactProvince);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactZipcode)) {
            query.put("ContactZipcode", request.contactZipcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EAddress)) {
            query.put("EAddress", request.EAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EName)) {
            query.put("EName", request.EName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardName)) {
            query.put("IdCardName", request.idCardName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardNumber)) {
            query.put("IdCardNumber", request.idCardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardOssKey)) {
            query.put("IdCardOssKey", request.idCardOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeOssKey)) {
            query.put("LegalNoticeOssKey", request.legalNoticeOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passportOssKey)) {
            query.put("PassportOssKey", request.passportOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicant"),
            new TeaPair("version", "2019-09-02"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicantResponse());
    }

    public UpdateApplicantResponse updateApplicant(UpdateApplicantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicantWithOptions(request, runtime);
    }
}

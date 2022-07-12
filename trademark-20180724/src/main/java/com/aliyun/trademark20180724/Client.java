// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724;

import com.aliyun.tea.*;
import com.aliyun.trademark20180724.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AcceptPartnerNotificationResponse acceptPartnerNotificationWithOptions(AcceptPartnerNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.material)) {
            query.put("Material", request.material);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptPartnerNotification"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptPartnerNotificationResponse());
    }

    public AcceptPartnerNotificationResponse acceptPartnerNotification(AcceptPartnerNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptPartnerNotificationWithOptions(request, runtime);
    }

    public ApplyNotaryPostResponse applyNotaryPostWithOptions(ApplyNotaryPostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notaryOrderId)) {
            query.put("NotaryOrderId", request.notaryOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverAddress)) {
            query.put("ReceiverAddress", request.receiverAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverName)) {
            query.put("ReceiverName", request.receiverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverPhone)) {
            query.put("ReceiverPhone", request.receiverPhone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyNotaryPost"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyNotaryPostResponse());
    }

    public ApplyNotaryPostResponse applyNotaryPost(ApplyNotaryPostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyNotaryPostWithOptions(request, runtime);
    }

    public AskAdjudicationFileResponse askAdjudicationFileWithOptions(AskAdjudicationFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactProvince)) {
            query.put("ContactProvince", request.contactProvince);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AskAdjudicationFile"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AskAdjudicationFileResponse());
    }

    public AskAdjudicationFileResponse askAdjudicationFile(AskAdjudicationFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.askAdjudicationFileWithOptions(request, runtime);
    }

    public BindMaterialResponse bindMaterialWithOptions(BindMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeKey)) {
            query.put("LegalNoticeKey", request.legalNoticeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindMaterialResponse());
    }

    public BindMaterialResponse bindMaterial(BindMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindMaterialWithOptions(request, runtime);
    }

    public CancelTradeOrderResponse cancelTradeOrderWithOptions(CancelTradeOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelTradeOrder"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelTradeOrderResponse());
    }

    public CancelTradeOrderResponse cancelTradeOrder(CancelTradeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTradeOrderWithOptions(request, runtime);
    }

    public CheckIfCollectedResponse checkIfCollectedWithOptions(CheckIfCollectedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIdList)) {
            query.put("ItemIdList", request.itemIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckIfCollected"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckIfCollectedResponse());
    }

    public CheckIfCollectedResponse checkIfCollected(CheckIfCollectedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkIfCollectedWithOptions(request, runtime);
    }

    public CheckLoaFillResponse checkLoaFillWithOptions(CheckLoaFillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckLoaFill"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckLoaFillResponse());
    }

    public CheckLoaFillResponse checkLoaFill(CheckLoaFillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkLoaFillWithOptions(request, runtime);
    }

    public CheckTrademarkIconResponse checkTrademarkIconWithOptions(CheckTrademarkIconRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            query.put("EventSceneType", request.eventSceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkIconOssKey)) {
            query.put("TrademarkIconOssKey", request.trademarkIconOssKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTrademarkIcon"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTrademarkIconResponse());
    }

    public CheckTrademarkIconResponse checkTrademarkIcon(CheckTrademarkIconRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTrademarkIconWithOptions(request, runtime);
    }

    public CheckTrademarkOrderResponse checkTrademarkOrderWithOptions(CheckTrademarkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBlackIcon)) {
            query.put("IsBlackIcon", request.isBlackIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoGoodsId)) {
            query.put("LogoGoodsId", request.logoGoodsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderData)) {
            query.put("OrderData", request.orderData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerCode)) {
            query.put("PartnerCode", request.partnerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realUserName)) {
            query.put("RealUserName", request.realUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerName)) {
            query.put("RegisterName", request.registerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewInfoId)) {
            query.put("RenewInfoId", request.renewInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootCode)) {
            query.put("RootCode", request.rootCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmComment)) {
            query.put("TmComment", request.tmComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNameType)) {
            query.put("TmNameType", request.tmNameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTrademarkOrder"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTrademarkOrderResponse());
    }

    public CheckTrademarkOrderResponse checkTrademarkOrder(CheckTrademarkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTrademarkOrderWithOptions(request, runtime);
    }

    public CombineLoaResponse combineLoaWithOptions(CombineLoaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
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

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmProduceType)) {
            query.put("TmProduceType", request.tmProduceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trademarkName)) {
            query.put("TrademarkName", request.trademarkName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CombineLoa"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CombineLoaResponse());
    }

    public CombineLoaResponse combineLoa(CombineLoaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.combineLoaWithOptions(request, runtime);
    }

    public ComplementIntentionUserIdResponse complementIntentionUserIdWithOptions(ComplementIntentionUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complementUserId)) {
            body.put("ComplementUserId", request.complementUserId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ComplementIntentionUserId"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ComplementIntentionUserIdResponse());
    }

    public ComplementIntentionUserIdResponse complementIntentionUserId(ComplementIntentionUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.complementIntentionUserIdWithOptions(request, runtime);
    }

    public ConfirmAdditionalMaterialResponse confirmAdditionalMaterialWithOptions(ConfirmAdditionalMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmAdditionalMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmAdditionalMaterialResponse());
    }

    public ConfirmAdditionalMaterialResponse confirmAdditionalMaterial(ConfirmAdditionalMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmAdditionalMaterialWithOptions(request, runtime);
    }

    public ConfirmApplicantResponse confirmApplicantWithOptions(ConfirmApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmApplicant"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmApplicantResponse());
    }

    public ConfirmApplicantResponse confirmApplicant(ConfirmApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmApplicantWithOptions(request, runtime);
    }

    public ConfirmDissentOriginalResponse confirmDissentOriginalWithOptions(ConfirmDissentOriginalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            query.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            query.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactProvince)) {
            query.put("ContactProvince", request.contactProvince);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDissentOriginal"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDissentOriginalResponse());
    }

    public ConfirmDissentOriginalResponse confirmDissentOriginal(ConfirmDissentOriginalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmDissentOriginalWithOptions(request, runtime);
    }

    public ConvertImageToGrayResponse convertImageToGrayWithOptions(ConvertImageToGrayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertImageToGray"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertImageToGrayResponse());
    }

    public ConvertImageToGrayResponse convertImageToGray(ConvertImageToGrayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertImageToGrayWithOptions(request, runtime);
    }

    public CopyApplicantResponse copyApplicantWithOptions(CopyApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyApplicant"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyApplicantResponse());
    }

    public CopyApplicantResponse copyApplicant(CopyApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyApplicantWithOptions(request, runtime);
    }

    public CreateIntentionOrderResponse createIntentionOrderWithOptions(CreateIntentionOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntentionOrder"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntentionOrderResponse());
    }

    public CreateIntentionOrderResponse createIntentionOrder(CreateIntentionOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntentionOrderWithOptions(request, runtime);
    }

    public CreateIntentionOrderGeneratingPayResponse createIntentionOrderGeneratingPayWithOptions(CreateIntentionOrderGeneratingPayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentCallback)) {
            query.put("PaymentCallback", request.paymentCallback);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIntentionOrderGeneratingPay"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIntentionOrderGeneratingPayResponse());
    }

    public CreateIntentionOrderGeneratingPayResponse createIntentionOrderGeneratingPay(CreateIntentionOrderGeneratingPayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntentionOrderGeneratingPayWithOptions(request, runtime);
    }

    public CreateTrademarkOrderResponse createTrademarkOrderWithOptions(CreateTrademarkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bigDipperSource)) {
            query.put("BigDipperSource", request.bigDipperSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBlackIcon)) {
            query.put("IsBlackIcon", request.isBlackIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeKey)) {
            query.put("LegalNoticeKey", request.legalNoticeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderData)) {
            query.put("OrderData", request.orderData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerCode)) {
            query.put("PartnerCode", request.partnerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNum)) {
            query.put("PhoneNum", request.phoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realUserName)) {
            query.put("RealUserName", request.realUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerName)) {
            query.put("RegisterName", request.registerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewInfoId)) {
            query.put("RenewInfoId", request.renewInfoId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rootCode)) {
            query.put("RootCode", request.rootCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmComment)) {
            query.put("TmComment", request.tmComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNameType)) {
            query.put("TmNameType", request.tmNameType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ua)) {
            query.put("Ua", request.ua);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrademarkOrder"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTrademarkOrderResponse());
    }

    public CreateTrademarkOrderResponse createTrademarkOrder(CreateTrademarkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTrademarkOrderWithOptions(request, runtime);
    }

    public DeleteMaterialResponse deleteMaterialWithOptions(DeleteMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialResponse());
    }

    public DeleteMaterialResponse deleteMaterial(DeleteMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMaterialWithOptions(request, runtime);
    }

    public DeleteTmMonitorRuleResponse deleteTmMonitorRuleWithOptions(DeleteTmMonitorRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTmMonitorRule"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTmMonitorRuleResponse());
    }

    public DeleteTmMonitorRuleResponse deleteTmMonitorRule(DeleteTmMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTmMonitorRuleWithOptions(request, runtime);
    }

    public DeleteTrademarkApplicationResponse deleteTrademarkApplicationWithOptions(DeleteTrademarkApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrademarkApplication"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTrademarkApplicationResponse());
    }

    public DeleteTrademarkApplicationResponse deleteTrademarkApplication(DeleteTrademarkApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrademarkApplicationWithOptions(request, runtime);
    }

    public DenySupplementResponse denySupplementWithOptions(DenySupplementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DenySupplement"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DenySupplementResponse());
    }

    public DenySupplementResponse denySupplement(DenySupplementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.denySupplementWithOptions(request, runtime);
    }

    public DescirbeCombineTrademarkResponse descirbeCombineTrademarkWithOptions(DescirbeCombineTrademarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accurateMatch)) {
            query.put("AccurateMatch", request.accurateMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            query.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.products)) {
            query.put("Products", request.products);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationNumber)) {
            query.put("RegistrationNumber", request.registrationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarGroups)) {
            query.put("SimilarGroups", request.similarGroups);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescirbeCombineTrademark"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescirbeCombineTrademarkResponse());
    }

    public DescirbeCombineTrademarkResponse descirbeCombineTrademark(DescirbeCombineTrademarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descirbeCombineTrademarkWithOptions(request, runtime);
    }

    public FillLogisticsResponse fillLogisticsWithOptions(FillLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logistics)) {
            query.put("Logistics", request.logistics);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FillLogistics"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FillLogisticsResponse());
    }

    public FillLogisticsResponse fillLogistics(FillLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fillLogisticsWithOptions(request, runtime);
    }

    public FilterUnavailableCodesResponse filterUnavailableCodesWithOptions(FilterUnavailableCodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FilterUnavailableCodesShrinkRequest request = new FilterUnavailableCodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "Codes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codesShrink)) {
            query.put("Codes", request.codesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FilterUnavailableCodes"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FilterUnavailableCodesResponse());
    }

    public FilterUnavailableCodesResponse filterUnavailableCodes(FilterUnavailableCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.filterUnavailableCodesWithOptions(request, runtime);
    }

    public ForceUploadTrademarkOnsaleResponse forceUploadTrademarkOnsaleWithOptions(ForceUploadTrademarkOnsaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationCode)) {
            query.put("ClassificationCode", request.classificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalPrice)) {
            query.put("OriginalPrice", request.originalPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerEnName)) {
            query.put("OwnerEnName", request.ownerEnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            query.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regAnnDate)) {
            query.put("RegAnnDate", request.regAnnDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryClassification)) {
            query.put("SecondaryClassification", request.secondaryClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdClassification)) {
            query.put("ThirdClassification", request.thirdClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ForceUploadTrademarkOnsale"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ForceUploadTrademarkOnsaleResponse());
    }

    public ForceUploadTrademarkOnsaleResponse forceUploadTrademarkOnsale(ForceUploadTrademarkOnsaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forceUploadTrademarkOnsaleWithOptions(request, runtime);
    }

    public GenerateQrCodeResponse generateQrCodeWithOptions(GenerateQrCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldKey)) {
            query.put("FieldKey", request.fieldKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateQrCode"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateQrCodeResponse());
    }

    public GenerateQrCodeResponse generateQrCode(GenerateQrCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateQrCodeWithOptions(request, runtime);
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicyWithOptions(GenerateUploadFilePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadFilePolicy"),
            new TeaPair("version", "2018-07-24"),
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
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateUploadFilePolicyWithOptions(request, runtime);
    }

    public GetAuthorizationLetterVersionResponse getAuthorizationLetterVersionWithOptions(GetAuthorizationLetterVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationLetterVersion"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationLetterVersionResponse());
    }

    public GetAuthorizationLetterVersionResponse getAuthorizationLetterVersion(GetAuthorizationLetterVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationLetterVersionWithOptions(request, runtime);
    }

    public GetDefaultPrincipalResponse getDefaultPrincipalWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultPrincipal"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultPrincipalResponse());
    }

    public GetDefaultPrincipalResponse getDefaultPrincipal() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultPrincipalWithOptions(runtime);
    }

    public GetDefaultPrincipalNameResponse getDefaultPrincipalNameWithOptions(GetDefaultPrincipalNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultPrincipalName"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultPrincipalNameResponse());
    }

    public GetDefaultPrincipalNameResponse getDefaultPrincipalName(GetDefaultPrincipalNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultPrincipalNameWithOptions(request, runtime);
    }

    public GetNotaryOrderResponse getNotaryOrderWithOptions(GetNotaryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notaryOrderId)) {
            query.put("NotaryOrderId", request.notaryOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNotaryOrder"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNotaryOrderResponse());
    }

    public GetNotaryOrderResponse getNotaryOrder(GetNotaryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNotaryOrderWithOptions(request, runtime);
    }

    public GetSupportPrincipalNameResponse getSupportPrincipalNameWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupportPrincipalName"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupportPrincipalNameResponse());
    }

    public GetSupportPrincipalNameResponse getSupportPrincipalName() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSupportPrincipalNameWithOptions(runtime);
    }

    public InsertMaterialResponse insertMaterialWithOptions(InsertMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
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

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.town)) {
            query.put("Town", request.town);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertMaterialResponse());
    }

    public InsertMaterialResponse insertMaterial(InsertMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertMaterialWithOptions(request, runtime);
    }

    public InsertRenewInfoResponse insertRenewInfoWithOptions(InsertRenewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engAddress)) {
            query.put("EngAddress", request.engAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engName)) {
            query.put("EngName", request.engName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerTime)) {
            query.put("RegisterTime", request.registerTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertRenewInfo"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertRenewInfoResponse());
    }

    public InsertRenewInfoResponse insertRenewInfo(InsertRenewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertRenewInfoWithOptions(request, runtime);
    }

    public InsertTmMonitorRuleResponse insertTmMonitorRuleWithOptions(InsertTmMonitorRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InsertTmMonitorRuleShrinkRequest request = new InsertTmMonitorRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.classification)) {
            request.classificationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.classification, "Classification", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.notifyStatus)) {
            request.notifyStatusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.notifyStatus, "NotifyStatus", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classificationShrink)) {
            query.put("Classification", request.classificationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endApplyDate)) {
            query.put("EndApplyDate", request.endApplyDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStatusShrink)) {
            query.put("NotifyStatus", request.notifyStatusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleKeyword)) {
            query.put("RuleKeyword", request.ruleKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSource)) {
            query.put("RuleSource", request.ruleSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startApplyDate)) {
            query.put("StartApplyDate", request.startApplyDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InsertTmMonitorRule"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsertTmMonitorRuleResponse());
    }

    public InsertTmMonitorRuleResponse insertTmMonitorRule(InsertTmMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertTmMonitorRuleWithOptions(request, runtime);
    }

    public ListNotaryInfosResponse listNotaryInfosWithOptions(ListNotaryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notaryType)) {
            query.put("NotaryType", request.notaryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNotaryInfos"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNotaryInfosResponse());
    }

    public ListNotaryInfosResponse listNotaryInfos(ListNotaryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotaryInfosWithOptions(request, runtime);
    }

    public ListNotaryOrdersResponse listNotaryOrdersWithOptions(ListNotaryOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endOrderDate)) {
            query.put("EndOrderDate", request.endOrderDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notaryStatus)) {
            query.put("NotaryStatus", request.notaryStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notaryType)) {
            query.put("NotaryType", request.notaryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortByType)) {
            query.put("SortByType", request.sortByType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortKeyType)) {
            query.put("SortKeyType", request.sortKeyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOrderDate)) {
            query.put("StartOrderDate", request.startOrderDate);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNotaryOrders"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNotaryOrdersResponse());
    }

    public ListNotaryOrdersResponse listNotaryOrders(ListNotaryOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotaryOrdersWithOptions(request, runtime);
    }

    public ModifySubmitTransferMaterailResponse modifySubmitTransferMaterailWithOptions(ModifySubmitTransferMaterailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifySubmitTransferMaterailShrinkRequest request = new ModifySubmitTransferMaterailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.other)) {
            request.otherShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.other, "Other", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assigneeProxy)) {
            query.put("AssigneeProxy", request.assigneeProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerBusinessLicenseTranslation)) {
            query.put("BuyerBusinessLicenseTranslation", request.buyerBusinessLicenseTranslation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerBusinessLicenseTranslation)) {
            query.put("SellerBusinessLicenseTranslation", request.sellerBusinessLicenseTranslation);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addr)) {
            body.put("Addr", request.addr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerBusinessLicense)) {
            body.put("BuyerBusinessLicense", request.buyerBusinessLicense);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerIdCard)) {
            body.put("BuyerIdCard", request.buyerIdCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNo)) {
            body.put("CardNo", request.cardNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardType)) {
            body.put("CardType", request.cardType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complete)) {
            body.put("Complete", request.complete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            body.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactMobile)) {
            body.put("ContactMobile", request.contactMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notarization)) {
            body.put("Notarization", request.notarization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherShrink)) {
            body.put("Other", request.otherShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationCert)) {
            body.put("RegistrationCert", request.registrationCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerApply)) {
            body.put("SellerApply", request.sellerApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerBusinessLicense)) {
            body.put("SellerBusinessLicense", request.sellerBusinessLicense);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerIdCard)) {
            body.put("SellerIdCard", request.sellerIdCard);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerProxy)) {
            body.put("SellerProxy", request.sellerProxy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySubmitTransferMaterail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySubmitTransferMaterailResponse());
    }

    public ModifySubmitTransferMaterailResponse modifySubmitTransferMaterail(ModifySubmitTransferMaterailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySubmitTransferMaterailWithOptions(request, runtime);
    }

    public PartnerUpdateTrademarkNameResponse partnerUpdateTrademarkNameWithOptions(PartnerUpdateTrademarkNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunKp)) {
            query.put("AliyunKp", request.aliyunKp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            query.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            query.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            query.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSceneType)) {
            body.put("EventSceneType", request.eventSceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            body.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmComment)) {
            body.put("TmComment", request.tmComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            body.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            body.put("TmName", request.tmName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PartnerUpdateTrademarkName"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PartnerUpdateTrademarkNameResponse());
    }

    public PartnerUpdateTrademarkNameResponse partnerUpdateTrademarkName(PartnerUpdateTrademarkNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.partnerUpdateTrademarkNameWithOptions(request, runtime);
    }

    public QueryCommunicationLogsResponse queryCommunicationLogsWithOptions(QueryCommunicationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommunicationLogs"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommunicationLogsResponse());
    }

    public QueryCommunicationLogsResponse queryCommunicationLogs(QueryCommunicationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommunicationLogsWithOptions(request, runtime);
    }

    public QueryCredentialsInfoResponse queryCredentialsInfoWithOptions(QueryCredentialsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.companyName)) {
            query.put("CompanyName", request.companyName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.materialType)) {
            body.put("MaterialType", request.materialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("OssKey", request.ossKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCredentialsInfo"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCredentialsInfoResponse());
    }

    public QueryCredentialsInfoResponse queryCredentialsInfo(QueryCredentialsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCredentialsInfoWithOptions(request, runtime);
    }

    public QueryExtensionAttributeResponse queryExtensionAttributeWithOptions(QueryExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeKey)) {
            query.put("AttributeKey", request.attributeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExtensionAttribute"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExtensionAttributeResponse());
    }

    public QueryExtensionAttributeResponse queryExtensionAttribute(QueryExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryExtensionAttributeWithOptions(request, runtime);
    }

    public QueryIntentionDetailResponse queryIntentionDetailWithOptions(QueryIntentionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIntentionDetail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIntentionDetailResponse());
    }

    public QueryIntentionDetailResponse queryIntentionDetail(QueryIntentionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionDetailWithOptions(request, runtime);
    }

    public QueryIntentionListResponse queryIntentionListWithOptions(QueryIntentionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFiled)) {
            query.put("SortFiled", request.sortFiled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIntentionList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIntentionListResponse());
    }

    public QueryIntentionListResponse queryIntentionList(QueryIntentionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionListWithOptions(request, runtime);
    }

    public QueryIntentionOwnerResponse queryIntentionOwnerWithOptions(QueryIntentionOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIntentionOwner"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIntentionOwnerResponse());
    }

    public QueryIntentionOwnerResponse queryIntentionOwner(QueryIntentionOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionOwnerWithOptions(request, runtime);
    }

    public QueryIntentionPriceResponse queryIntentionPriceWithOptions(QueryIntentionPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIntentionPrice"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIntentionPriceResponse());
    }

    public QueryIntentionPriceResponse queryIntentionPrice(QueryIntentionPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionPriceWithOptions(request, runtime);
    }

    public QueryMaterialResponse queryMaterialWithOptions(QueryMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryUnconfirmedInfo)) {
            query.put("QueryUnconfirmedInfo", request.queryUnconfirmedInfo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialResponse());
    }

    public QueryMaterialResponse queryMaterial(QueryMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMaterialWithOptions(request, runtime);
    }

    public QueryMaterialListResponse queryMaterialListWithOptions(QueryMaterialListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            query.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialId)) {
            query.put("MaterialId", request.materialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialVersion)) {
            query.put("MaterialVersion", request.materialVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialListResponse());
    }

    public QueryMaterialListResponse queryMaterialList(QueryMaterialListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMaterialListWithOptions(request, runtime);
    }

    public QueryMonitorKeywordsResponse queryMonitorKeywordsWithOptions(QueryMonitorKeywordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonitorKeywords"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonitorKeywordsResponse());
    }

    public QueryMonitorKeywordsResponse queryMonitorKeywords(QueryMonitorKeywordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonitorKeywordsWithOptions(request, runtime);
    }

    public QueryOfficialFileCustomListResponse queryOfficialFileCustomListWithOptions(QueryOfficialFileCustomListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOfficialFileCustomList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOfficialFileCustomListResponse());
    }

    public QueryOfficialFileCustomListResponse queryOfficialFileCustomList(QueryOfficialFileCustomListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOfficialFileCustomListWithOptions(request, runtime);
    }

    public QueryOrderLogisticsListResponse queryOrderLogisticsListWithOptions(QueryOrderLogisticsListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.produceOrderId)) {
            body.put("ProduceOrderId", request.produceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            body.put("RegisterNumber", request.registerNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderLogisticsList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderLogisticsListResponse());
    }

    public QueryOrderLogisticsListResponse queryOrderLogisticsList(QueryOrderLogisticsListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderLogisticsListWithOptions(request, runtime);
    }

    public QueryOssResourcesResponse queryOssResourcesWithOptions(QueryOssResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOssResources"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOssResourcesResponse());
    }

    public QueryOssResourcesResponse queryOssResources(QueryOssResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOssResourcesWithOptions(request, runtime);
    }

    public QueryQrCodeUploadStatusResponse queryQrCodeUploadStatusWithOptions(QueryQrCodeUploadStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldKey)) {
            query.put("FieldKey", request.fieldKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQrCodeUploadStatus"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQrCodeUploadStatusResponse());
    }

    public QueryQrCodeUploadStatusResponse queryQrCodeUploadStatus(QueryQrCodeUploadStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQrCodeUploadStatusWithOptions(request, runtime);
    }

    public QuerySupplementDetailResponse querySupplementDetailWithOptions(QuerySupplementDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupplementDetail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupplementDetailResponse());
    }

    public QuerySupplementDetailResponse querySupplementDetail(QuerySupplementDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySupplementDetailWithOptions(request, runtime);
    }

    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskListResponse());
    }

    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    public QueryTmCollectionPageListResponse queryTmCollectionPageListWithOptions(QueryTmCollectionPageListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTmCollectionPageList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTmCollectionPageListResponse());
    }

    public QueryTmCollectionPageListResponse queryTmCollectionPageList(QueryTmCollectionPageListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTmCollectionPageListWithOptions(request, runtime);
    }

    public QueryTradeIntentionUserListResponse queryTradeIntentionUserListWithOptions(QueryTradeIntentionUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begin)) {
            query.put("Begin", request.begin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeIntentionUserList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeIntentionUserListResponse());
    }

    public QueryTradeIntentionUserListResponse queryTradeIntentionUserList(QueryTradeIntentionUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeIntentionUserListWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetailWithOptions(QueryTradeMarkApplicationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeMarkApplicationDetail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeMarkApplicationDetailResponse());
    }

    public QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetail(QueryTradeMarkApplicationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationDetailWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationLogsResponse queryTradeMarkApplicationLogsWithOptions(QueryTradeMarkApplicationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeMarkApplicationLogs"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeMarkApplicationLogsResponse());
    }

    public QueryTradeMarkApplicationLogsResponse queryTradeMarkApplicationLogs(QueryTradeMarkApplicationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationLogsWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationsResponse queryTradeMarkApplicationsWithOptions(QueryTradeMarkApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationCode)) {
            query.put("ClassificationCode", request.classificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidden)) {
            query.put("Hidden", request.hidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logisticsNo)) {
            query.put("LogisticsNo", request.logisticsNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.materialName)) {
            query.put("MaterialName", request.materialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFiled)) {
            query.put("SortFiled", request.sortFiled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supplementStatus)) {
            query.put("SupplementStatus", request.supplementStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeMarkApplications"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeMarkApplicationsResponse());
    }

    public QueryTradeMarkApplicationsResponse queryTradeMarkApplications(QueryTradeMarkApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationsWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationsByIntentionResponse queryTradeMarkApplicationsByIntentionWithOptions(QueryTradeMarkApplicationsByIntentionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentionBizId)) {
            query.put("IntentionBizId", request.intentionBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmProduceStatus)) {
            query.put("TmProduceStatus", request.tmProduceStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeMarkApplicationsByIntention"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeMarkApplicationsByIntentionResponse());
    }

    public QueryTradeMarkApplicationsByIntentionResponse queryTradeMarkApplicationsByIntention(QueryTradeMarkApplicationsByIntentionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationsByIntentionWithOptions(request, runtime);
    }

    public QueryTradeProduceDetailResponse queryTradeProduceDetailWithOptions(QueryTradeProduceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeProduceDetail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeProduceDetailResponse());
    }

    public QueryTradeProduceDetailResponse queryTradeProduceDetail(QueryTradeProduceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeProduceDetailWithOptions(request, runtime);
    }

    public QueryTradeProduceListResponse queryTradeProduceListWithOptions(QueryTradeProduceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerStatus)) {
            query.put("BuyerStatus", request.buyerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOrderId)) {
            query.put("PreOrderId", request.preOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortFiled)) {
            query.put("SortFiled", request.sortFiled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTradeProduceList"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTradeProduceListResponse());
    }

    public QueryTradeProduceListResponse queryTradeProduceList(QueryTradeProduceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeProduceListWithOptions(request, runtime);
    }

    public QueryTrademarkDetailByApplyNumberResponse queryTrademarkDetailByApplyNumberWithOptions(QueryTrademarkDetailByApplyNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyNumber)) {
            query.put("ApplyNumber", request.applyNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkDetailByApplyNumber"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkDetailByApplyNumberResponse());
    }

    public QueryTrademarkDetailByApplyNumberResponse queryTrademarkDetailByApplyNumber(QueryTrademarkDetailByApplyNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkDetailByApplyNumberWithOptions(request, runtime);
    }

    public QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResultsWithOptions(QueryTrademarkMonitorResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyYear)) {
            query.put("ApplyYear", request.applyYear);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procedureStatus)) {
            query.put("ProcedureStatus", request.procedureStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registrationNumber)) {
            query.put("RegistrationNumber", request.registrationNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkMonitorResults"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkMonitorResultsResponse());
    }

    public QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResults(QueryTrademarkMonitorResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkMonitorResultsWithOptions(request, runtime);
    }

    public QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRulesWithOptions(QueryTrademarkMonitorRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUpdate)) {
            query.put("NotifyUpdate", request.notifyUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkMonitorRules"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkMonitorRulesResponse());
    }

    public QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRules(QueryTrademarkMonitorRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkMonitorRulesWithOptions(request, runtime);
    }

    public QueryTrademarkOnSaleResponse queryTrademarkOnSaleWithOptions(QueryTrademarkOnSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCode)) {
            query.put("RegisterCode", request.registerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmType)) {
            query.put("TmType", request.tmType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkOnSale"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkOnSaleResponse());
    }

    public QueryTrademarkOnSaleResponse queryTrademarkOnSale(QueryTrademarkOnSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkOnSaleWithOptions(request, runtime);
    }

    public QueryTrademarkPriceResponse queryTrademarkPriceWithOptions(QueryTrademarkPriceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTrademarkPriceShrinkRequest request = new QueryTrademarkPriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderData)) {
            request.orderDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderData, "OrderData", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderDataShrink)) {
            query.put("OrderData", request.orderDataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkPrice"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkPriceResponse());
    }

    public QueryTrademarkPriceResponse queryTrademarkPrice(QueryTrademarkPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkPriceWithOptions(request, runtime);
    }

    public QueryTrademarkUploadAuditResultResponse queryTrademarkUploadAuditResultWithOptions(QueryTrademarkUploadAuditResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerCode)) {
            query.put("RegisterCode", request.registerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmType)) {
            query.put("TmType", request.tmType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTrademarkUploadAuditResult"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTrademarkUploadAuditResultResponse());
    }

    public QueryTrademarkUploadAuditResultResponse queryTrademarkUploadAuditResult(QueryTrademarkUploadAuditResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkUploadAuditResultWithOptions(request, runtime);
    }

    public RefundProduceResponse refundProduceWithOptions(RefundProduceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundProduce"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundProduceResponse());
    }

    public RefundProduceResponse refundProduce(RefundProduceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundProduceWithOptions(request, runtime);
    }

    public RefuseAdditionalMaterialResponse refuseAdditionalMaterialWithOptions(RefuseAdditionalMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseAdditionalMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseAdditionalMaterialResponse());
    }

    public RefuseAdditionalMaterialResponse refuseAdditionalMaterial(RefuseAdditionalMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseAdditionalMaterialWithOptions(request, runtime);
    }

    public RefuseApplicantResponse refuseApplicantWithOptions(RefuseApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseApplicant"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseApplicantResponse());
    }

    public RefuseApplicantResponse refuseApplicant(RefuseApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseApplicantWithOptions(request, runtime);
    }

    public RejectApplicantResponse rejectApplicantWithOptions(RejectApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectApplicant"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectApplicantResponse());
    }

    public RejectApplicantResponse rejectApplicant(RejectApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rejectApplicantWithOptions(request, runtime);
    }

    public SaveClassificationConditionsResponse saveClassificationConditionsWithOptions(SaveClassificationConditionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.condition)) {
            query.put("Condition", request.condition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveClassificationConditions"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveClassificationConditionsResponse());
    }

    public SaveClassificationConditionsResponse saveClassificationConditions(SaveClassificationConditionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveClassificationConditionsWithOptions(request, runtime);
    }

    public SaveExtensionAttributeResponse saveExtensionAttributeWithOptions(SaveExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributeKey)) {
            query.put("AttributeKey", request.attributeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeValue)) {
            query.put("AttributeValue", request.attributeValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveExtensionAttribute"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveExtensionAttributeResponse());
    }

    public SaveExtensionAttributeResponse saveExtensionAttribute(SaveExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveExtensionAttributeWithOptions(request, runtime);
    }

    public SaveTaskResponse saveTaskWithOptions(SaveTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.request)) {
            query.put("Request", request.request);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTask"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskResponse());
    }

    public SaveTaskResponse saveTask(SaveTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskWithOptions(request, runtime);
    }

    public SaveTaskForOfficialFileCustomResponse saveTaskForOfficialFileCustomWithOptions(SaveTaskForOfficialFileCustomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endAcceptTime)) {
            query.put("EndAcceptTime", request.endAcceptTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAcceptTime)) {
            query.put("StartAcceptTime", request.startAcceptTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTaskForOfficialFileCustom"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTaskForOfficialFileCustomResponse());
    }

    public SaveTaskForOfficialFileCustomResponse saveTaskForOfficialFileCustom(SaveTaskForOfficialFileCustomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForOfficialFileCustomWithOptions(request, runtime);
    }

    public SaveTradeMarkReviewMaterialDetailResponse saveTradeMarkReviewMaterialDetailWithOptions(SaveTradeMarkReviewMaterialDetailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveTradeMarkReviewMaterialDetailShrinkRequest request = new SaveTradeMarkReviewMaterialDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalOssKeyList)) {
            request.additionalOssKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalOssKeyList, "AdditionalOssKeyList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalOssKeyListShrink)) {
            body.put("AdditionalOssKeyList", request.additionalOssKeyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationOssKey)) {
            body.put("ApplicationOssKey", request.applicationOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessLicenceOssKey)) {
            body.put("BusinessLicenceOssKey", request.businessLicenceOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cardNumber)) {
            body.put("CardNumber", request.cardNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactAddress)) {
            body.put("ContactAddress", request.contactAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactEmail)) {
            body.put("ContactEmail", request.contactEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactNumber)) {
            body.put("ContactNumber", request.contactNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.country)) {
            body.put("Country", request.country);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engAddress)) {
            body.put("EngAddress", request.engAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engName)) {
            body.put("EngName", request.engName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idCardOssKey)) {
            body.put("IdCardOssKey", request.idCardOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalNoticeOssKey)) {
            body.put("LegalNoticeOssKey", request.legalNoticeOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            body.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passportOssKey)) {
            body.put("PassportOssKey", request.passportOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reviewMaterialAdditionalJson)) {
            body.put("ReviewMaterialAdditionalJson", request.reviewMaterialAdditionalJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separate)) {
            body.put("Separate", request.separate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitOnline)) {
            body.put("SubmitOnline", request.submitOnline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitType)) {
            body.put("SubmitType", request.submitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveTradeMarkReviewMaterialDetail"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveTradeMarkReviewMaterialDetailResponse());
    }

    public SaveTradeMarkReviewMaterialDetailResponse saveTradeMarkReviewMaterialDetail(SaveTradeMarkReviewMaterialDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTradeMarkReviewMaterialDetailWithOptions(request, runtime);
    }

    public SearchTmOnsalesResponse searchTmOnsalesWithOptions(SearchTmOnsalesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.classification)) {
            query.put("Classification", request.classification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPriceLeft)) {
            query.put("OrderPriceLeft", request.orderPriceLeft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderPriceRight)) {
            query.put("OrderPriceRight", request.orderPriceRight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryAll)) {
            query.put("QueryAll", request.queryAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regLeft)) {
            query.put("RegLeft", request.regLeft);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regRight)) {
            query.put("RegRight", request.regRight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerNumber)) {
            query.put("RegisterNumber", request.registerNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortName)) {
            query.put("SortName", request.sortName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topSearch)) {
            query.put("TopSearch", request.topSearch);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTmOnsales"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTmOnsalesResponse());
    }

    public SearchTmOnsalesResponse searchTmOnsales(SearchTmOnsalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTmOnsalesWithOptions(request, runtime);
    }

    public StartNotaryResponse startNotaryWithOptions(StartNotaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notaryOrderId)) {
            query.put("NotaryOrderId", request.notaryOrderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartNotary"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartNotaryResponse());
    }

    public StartNotaryResponse startNotary(StartNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startNotaryWithOptions(request, runtime);
    }

    public StoreMaterialTemporarilyResponse storeMaterialTemporarilyWithOptions(StoreMaterialTemporarilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
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

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            query.put("LoaOssKey", request.loaOssKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.town)) {
            query.put("Town", request.town);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StoreMaterialTemporarily"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StoreMaterialTemporarilyResponse());
    }

    public StoreMaterialTemporarilyResponse storeMaterialTemporarily(StoreMaterialTemporarilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.storeMaterialTemporarilyWithOptions(request, runtime);
    }

    public SubmitSupplementResponse submitSupplementWithOptions(SubmitSupplementRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSupplementShrinkRequest request = new SubmitSupplementShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uploadOssKeyList)) {
            request.uploadOssKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uploadOssKeyList, "UploadOssKeyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadOssKeyListShrink)) {
            query.put("UploadOssKeyList", request.uploadOssKeyListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSupplement"),
            new TeaPair("version", "2018-07-24"),
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

    public SubmitSupplementResponse submitSupplement(SubmitSupplementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSupplementWithOptions(request, runtime);
    }

    public SubmitTrademarkApplicationComplaintResponse submitTrademarkApplicationComplaintWithOptions(SubmitTrademarkApplicationComplaintRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTrademarkApplicationComplaintShrinkRequest request = new SubmitTrademarkApplicationComplaintShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitTrademarkApplicationComplaint"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitTrademarkApplicationComplaintResponse());
    }

    public SubmitTrademarkApplicationComplaintResponse submitTrademarkApplicationComplaint(SubmitTrademarkApplicationComplaintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTrademarkApplicationComplaintWithOptions(request, runtime);
    }

    public SyncTrademarkResponse syncTrademarkWithOptions(SyncTrademarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationCode)) {
            query.put("ClassificationCode", request.classificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalPrice)) {
            query.put("OriginalPrice", request.originalPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerEnName)) {
            query.put("OwnerEnName", request.ownerEnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            query.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regAnnDate)) {
            query.put("RegAnnDate", request.regAnnDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryClassification)) {
            query.put("SecondaryClassification", request.secondaryClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdClassification)) {
            query.put("ThirdClassification", request.thirdClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncTrademark"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncTrademarkResponse());
    }

    public SyncTrademarkResponse syncTrademark(SyncTrademarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncTrademarkWithOptions(request, runtime);
    }

    public UpdateApplicantContacterResponse updateApplicantContacterWithOptions(UpdateApplicantContacterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicantId)) {
            query.put("ApplicantId", request.applicantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactAddress)) {
            query.put("ContactAddress", request.contactAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactCity)) {
            query.put("ContactCity", request.contactCity);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicantContacter"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicantContacterResponse());
    }

    public UpdateApplicantContacterResponse updateApplicantContacter(UpdateApplicantContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateApplicantContacterWithOptions(request, runtime);
    }

    public UpdateMaterialResponse updateMaterialWithOptions(UpdateMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            query.put("Address", request.address);
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

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
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

        if (!com.aliyun.teautil.Common.isUnset(request.loaId)) {
            query.put("LoaId", request.loaId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.personalType)) {
            query.put("PersonalType", request.personalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.town)) {
            query.put("Town", request.town);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMaterial"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMaterialResponse());
    }

    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMaterialWithOptions(request, runtime);
    }

    public UpdateProduceLoaIdResponse updateProduceLoaIdWithOptions(UpdateProduceLoaIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loaOssKey)) {
            body.put("LoaOssKey", request.loaOssKey);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProduceLoaId"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProduceLoaIdResponse());
    }

    public UpdateProduceLoaIdResponse updateProduceLoaId(UpdateProduceLoaIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProduceLoaIdWithOptions(request, runtime);
    }

    public UpdateSendMaterialNumResponse updateSendMaterialNumWithOptions(UpdateSendMaterialNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.num)) {
            query.put("Num", request.num);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSendMaterialNum"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSendMaterialNumResponse());
    }

    public UpdateSendMaterialNumResponse updateSendMaterialNum(UpdateSendMaterialNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSendMaterialNumWithOptions(request, runtime);
    }

    public UpdateTmMonitorRuleResponse updateTmMonitorRuleWithOptions(UpdateTmMonitorRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyStatus)) {
            query.put("NotifyStatus", request.notifyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTmMonitorRule"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTmMonitorRuleResponse());
    }

    public UpdateTmMonitorRuleResponse updateTmMonitorRule(UpdateTmMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTmMonitorRuleWithOptions(request, runtime);
    }

    public UpdateTrademarkNameResponse updateTrademarkNameWithOptions(UpdateTrademarkNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmComment)) {
            body.put("TmComment", request.tmComment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            body.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            body.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrademarkName"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrademarkNameResponse());
    }

    public UpdateTrademarkNameResponse updateTrademarkName(UpdateTrademarkNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrademarkNameWithOptions(request, runtime);
    }

    public UpdateTrademarkOnsaleResponse updateTrademarkOnsaleWithOptions(UpdateTrademarkOnsaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationCode)) {
            query.put("ClassificationCode", request.classificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalPrice)) {
            query.put("OriginalPrice", request.originalPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerEnName)) {
            query.put("OwnerEnName", request.ownerEnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            query.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regAnnDate)) {
            query.put("RegAnnDate", request.regAnnDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryClassification)) {
            query.put("SecondaryClassification", request.secondaryClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdClassification)) {
            query.put("ThirdClassification", request.thirdClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmType)) {
            query.put("TmType", request.tmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeTmDetailJson)) {
            query.put("TradeTmDetailJson", request.tradeTmDetailJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTrademarkOnsale"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTrademarkOnsaleResponse());
    }

    public UpdateTrademarkOnsaleResponse updateTrademarkOnsale(UpdateTrademarkOnsaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrademarkOnsaleWithOptions(request, runtime);
    }

    public UploadNotaryDataResponse uploadNotaryDataWithOptions(UploadNotaryDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizOrderNo)) {
            query.put("BizOrderNo", request.bizOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notaryType)) {
            query.put("NotaryType", request.notaryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadContext)) {
            query.put("UploadContext", request.uploadContext);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadNotaryData"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadNotaryDataResponse());
    }

    public UploadNotaryDataResponse uploadNotaryData(UploadNotaryDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadNotaryDataWithOptions(request, runtime);
    }

    public UploadTrademarkOnSaleResponse uploadTrademarkOnSaleWithOptions(UploadTrademarkOnSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classificationCode)) {
            query.put("ClassificationCode", request.classificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.label)) {
            query.put("Label", request.label);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalPrice)) {
            query.put("OriginalPrice", request.originalPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerEnName)) {
            query.put("OwnerEnName", request.ownerEnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerName)) {
            query.put("OwnerName", request.ownerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regAnnDate)) {
            query.put("RegAnnDate", request.regAnnDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryClassification)) {
            query.put("SecondaryClassification", request.secondaryClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdClassification)) {
            query.put("ThirdClassification", request.thirdClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmIcon)) {
            query.put("TmIcon", request.tmIcon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmName)) {
            query.put("TmName", request.tmName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmNumber)) {
            query.put("TmNumber", request.tmNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmType)) {
            query.put("TmType", request.tmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeTmDetailJson)) {
            query.put("TradeTmDetailJson", request.tradeTmDetailJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadTrademarkOnSale"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadTrademarkOnSaleResponse());
    }

    public UploadTrademarkOnSaleResponse uploadTrademarkOnSale(UploadTrademarkOnSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadTrademarkOnSaleWithOptions(request, runtime);
    }

    public WriteCommunicationLogResponse writeCommunicationLogWithOptions(WriteCommunicationLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteCommunicationLog"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteCommunicationLogResponse());
    }

    public WriteCommunicationLogResponse writeCommunicationLog(WriteCommunicationLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.writeCommunicationLogWithOptions(request, runtime);
    }

    public WriteIntentionCommunicationLogResponse writeIntentionCommunicationLogWithOptions(WriteIntentionCommunicationLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reject)) {
            query.put("Reject", request.reject);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteIntentionCommunicationLog"),
            new TeaPair("version", "2018-07-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteIntentionCommunicationLogResponse());
    }

    public WriteIntentionCommunicationLogResponse writeIntentionCommunicationLog(WriteIntentionCommunicationLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.writeIntentionCommunicationLogWithOptions(request, runtime);
    }
}

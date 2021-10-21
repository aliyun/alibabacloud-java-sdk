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

    public QueryTradeProduceListResponse queryTradeProduceListWithOptions(QueryTradeProduceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeProduceList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeProduceListResponse());
    }

    public QueryTradeProduceListResponse queryTradeProduceList(QueryTradeProduceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeProduceListWithOptions(request, runtime);
    }

    public QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResultsWithOptions(QueryTrademarkMonitorResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTrademarkMonitorResults", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTrademarkMonitorResultsResponse());
    }

    public QueryTrademarkMonitorResultsResponse queryTrademarkMonitorResults(QueryTrademarkMonitorResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkMonitorResultsWithOptions(request, runtime);
    }

    public CancelTradeOrderResponse cancelTradeOrderWithOptions(CancelTradeOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelTradeOrder", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CancelTradeOrderResponse());
    }

    public CancelTradeOrderResponse cancelTradeOrder(CancelTradeOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelTradeOrderWithOptions(request, runtime);
    }

    public DeleteTmMonitorRuleResponse deleteTmMonitorRuleWithOptions(DeleteTmMonitorRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTmMonitorRule", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTmMonitorRuleResponse());
    }

    public DeleteTmMonitorRuleResponse deleteTmMonitorRule(DeleteTmMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTmMonitorRuleWithOptions(request, runtime);
    }

    public UploadNotaryDataResponse uploadNotaryDataWithOptions(UploadNotaryDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadNotaryData", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UploadNotaryDataResponse());
    }

    public UploadNotaryDataResponse uploadNotaryData(UploadNotaryDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadNotaryDataWithOptions(request, runtime);
    }

    public CopyApplicantResponse copyApplicantWithOptions(CopyApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyApplicant", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CopyApplicantResponse());
    }

    public CopyApplicantResponse copyApplicant(CopyApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyApplicantWithOptions(request, runtime);
    }

    public PartnerUpdateTrademarkNameResponse partnerUpdateTrademarkNameWithOptions(PartnerUpdateTrademarkNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PartnerUpdateTrademarkName", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new PartnerUpdateTrademarkNameResponse());
    }

    public PartnerUpdateTrademarkNameResponse partnerUpdateTrademarkName(PartnerUpdateTrademarkNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.partnerUpdateTrademarkNameWithOptions(request, runtime);
    }

    public QueryIntentionDetailResponse queryIntentionDetailWithOptions(QueryIntentionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIntentionDetail", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIntentionDetailResponse());
    }

    public QueryIntentionDetailResponse queryIntentionDetail(QueryIntentionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionDetailWithOptions(request, runtime);
    }

    public QueryIntentionPriceResponse queryIntentionPriceWithOptions(QueryIntentionPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIntentionPrice", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIntentionPriceResponse());
    }

    public QueryIntentionPriceResponse queryIntentionPrice(QueryIntentionPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionPriceWithOptions(request, runtime);
    }

    public QueryOfficialFileCustomListResponse queryOfficialFileCustomListWithOptions(QueryOfficialFileCustomListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOfficialFileCustomList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOfficialFileCustomListResponse());
    }

    public QueryOfficialFileCustomListResponse queryOfficialFileCustomList(QueryOfficialFileCustomListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOfficialFileCustomListWithOptions(request, runtime);
    }

    public CheckTrademarkIconResponse checkTrademarkIconWithOptions(CheckTrademarkIconRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckTrademarkIcon", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CheckTrademarkIconResponse());
    }

    public CheckTrademarkIconResponse checkTrademarkIcon(CheckTrademarkIconRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTrademarkIconWithOptions(request, runtime);
    }

    public QuerySupplementDetailResponse querySupplementDetailWithOptions(QuerySupplementDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySupplementDetail", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySupplementDetailResponse());
    }

    public QuerySupplementDetailResponse querySupplementDetail(QuerySupplementDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySupplementDetailWithOptions(request, runtime);
    }

    public UploadTrademarkOnSaleResponse uploadTrademarkOnSaleWithOptions(UploadTrademarkOnSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadTrademarkOnSale", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UploadTrademarkOnSaleResponse());
    }

    public UploadTrademarkOnSaleResponse uploadTrademarkOnSale(UploadTrademarkOnSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadTrademarkOnSaleWithOptions(request, runtime);
    }

    public ApplyNotaryPostResponse applyNotaryPostWithOptions(ApplyNotaryPostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyNotaryPost", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyNotaryPostResponse());
    }

    public ApplyNotaryPostResponse applyNotaryPost(ApplyNotaryPostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyNotaryPostWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationsByIntentionResponse queryTradeMarkApplicationsByIntentionWithOptions(QueryTradeMarkApplicationsByIntentionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeMarkApplicationsByIntention", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeMarkApplicationsByIntentionResponse());
    }

    public QueryTradeMarkApplicationsByIntentionResponse queryTradeMarkApplicationsByIntention(QueryTradeMarkApplicationsByIntentionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationsByIntentionWithOptions(request, runtime);
    }

    public SaveExtensionAttributeResponse saveExtensionAttributeWithOptions(SaveExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveExtensionAttribute", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SaveExtensionAttributeResponse());
    }

    public SaveExtensionAttributeResponse saveExtensionAttribute(SaveExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveExtensionAttributeWithOptions(request, runtime);
    }

    public AcceptPartnerNotificationResponse acceptPartnerNotificationWithOptions(AcceptPartnerNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcceptPartnerNotification", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new AcceptPartnerNotificationResponse());
    }

    public AcceptPartnerNotificationResponse acceptPartnerNotification(AcceptPartnerNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptPartnerNotificationWithOptions(request, runtime);
    }

    public SubmitSupplementResponse submitSupplementWithOptions(SubmitSupplementRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitSupplementShrinkRequest request = new SubmitSupplementShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uploadOssKeyList)) {
            request.uploadOssKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uploadOssKeyList, "UploadOssKeyList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitSupplement", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitSupplementResponse());
    }

    public SubmitSupplementResponse submitSupplement(SubmitSupplementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitSupplementWithOptions(request, runtime);
    }

    public ForceUploadTrademarkOnsaleResponse forceUploadTrademarkOnsaleWithOptions(ForceUploadTrademarkOnsaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ForceUploadTrademarkOnsale", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ForceUploadTrademarkOnsaleResponse());
    }

    public ForceUploadTrademarkOnsaleResponse forceUploadTrademarkOnsale(ForceUploadTrademarkOnsaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forceUploadTrademarkOnsaleWithOptions(request, runtime);
    }

    public BindMaterialResponse bindMaterialWithOptions(BindMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new BindMaterialResponse());
    }

    public BindMaterialResponse bindMaterial(BindMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindMaterialWithOptions(request, runtime);
    }

    public GetDefaultPrincipalResponse getDefaultPrincipalWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetDefaultPrincipal", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetDefaultPrincipalResponse());
    }

    public GetDefaultPrincipalResponse getDefaultPrincipal() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultPrincipalWithOptions(runtime);
    }

    public QueryCommunicationLogsResponse queryCommunicationLogsWithOptions(QueryCommunicationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCommunicationLogs", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCommunicationLogsResponse());
    }

    public QueryCommunicationLogsResponse queryCommunicationLogs(QueryCommunicationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCommunicationLogsWithOptions(request, runtime);
    }

    public GenerateQrCodeResponse generateQrCodeWithOptions(GenerateQrCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateQrCode", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateQrCodeResponse());
    }

    public GenerateQrCodeResponse generateQrCode(GenerateQrCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateQrCodeWithOptions(request, runtime);
    }

    public ConfirmDissentOriginalResponse confirmDissentOriginalWithOptions(ConfirmDissentOriginalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmDissentOriginal", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmDissentOriginalResponse());
    }

    public ConfirmDissentOriginalResponse confirmDissentOriginal(ConfirmDissentOriginalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmDissentOriginalWithOptions(request, runtime);
    }

    public ConvertImageToGrayResponse convertImageToGrayWithOptions(ConvertImageToGrayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertImageToGray", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertImageToGrayResponse());
    }

    public ConvertImageToGrayResponse convertImageToGray(ConvertImageToGrayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertImageToGrayWithOptions(request, runtime);
    }

    public QueryIntentionListResponse queryIntentionListWithOptions(QueryIntentionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIntentionList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIntentionListResponse());
    }

    public QueryIntentionListResponse queryIntentionList(QueryIntentionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIntentionListWithOptions(request, runtime);
    }

    public GetAuthorizationLetterVersionResponse getAuthorizationLetterVersionWithOptions(GetAuthorizationLetterVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthorizationLetterVersion", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthorizationLetterVersionResponse());
    }

    public GetAuthorizationLetterVersionResponse getAuthorizationLetterVersion(GetAuthorizationLetterVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthorizationLetterVersionWithOptions(request, runtime);
    }

    public QueryTrademarkPriceResponse queryTrademarkPriceWithOptions(QueryTrademarkPriceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTrademarkPriceShrinkRequest request = new QueryTrademarkPriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderData)) {
            request.orderDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderData, "OrderData", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTrademarkPrice", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTrademarkPriceResponse());
    }

    public QueryTrademarkPriceResponse queryTrademarkPrice(QueryTrademarkPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkPriceWithOptions(request, runtime);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertTmMonitorRule", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new InsertTmMonitorRuleResponse());
    }

    public InsertTmMonitorRuleResponse insertTmMonitorRule(InsertTmMonitorRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertTmMonitorRuleWithOptions(request, runtime);
    }

    public QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRulesWithOptions(QueryTrademarkMonitorRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTrademarkMonitorRules", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTrademarkMonitorRulesResponse());
    }

    public QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRules(QueryTrademarkMonitorRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTrademarkMonitorRulesWithOptions(request, runtime);
    }

    public DenySupplementResponse denySupplementWithOptions(DenySupplementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DenySupplement", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new DenySupplementResponse());
    }

    public DenySupplementResponse denySupplement(DenySupplementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.denySupplementWithOptions(request, runtime);
    }

    public QueryMaterialResponse queryMaterialWithOptions(QueryMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMaterialResponse());
    }

    public QueryMaterialResponse queryMaterial(QueryMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMaterialWithOptions(request, runtime);
    }

    public CreateTrademarkOrderResponse createTrademarkOrderWithOptions(CreateTrademarkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTrademarkOrder", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTrademarkOrderResponse());
    }

    public CreateTrademarkOrderResponse createTrademarkOrder(CreateTrademarkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTrademarkOrderWithOptions(request, runtime);
    }

    public QueryMaterialListResponse queryMaterialListWithOptions(QueryMaterialListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMaterialList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMaterialListResponse());
    }

    public QueryMaterialListResponse queryMaterialList(QueryMaterialListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMaterialListWithOptions(request, runtime);
    }

    public CheckTrademarkOrderResponse checkTrademarkOrderWithOptions(CheckTrademarkOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckTrademarkOrder", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CheckTrademarkOrderResponse());
    }

    public CheckTrademarkOrderResponse checkTrademarkOrder(CheckTrademarkOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTrademarkOrderWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationsResponse queryTradeMarkApplicationsWithOptions(QueryTradeMarkApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeMarkApplications", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeMarkApplicationsResponse());
    }

    public QueryTradeMarkApplicationsResponse queryTradeMarkApplications(QueryTradeMarkApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationsWithOptions(request, runtime);
    }

    public UpdateApplicantContacterResponse updateApplicantContacterWithOptions(UpdateApplicantContacterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApplicantContacter", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateApplicantContacterResponse());
    }

    public UpdateApplicantContacterResponse updateApplicantContacter(UpdateApplicantContacterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateApplicantContacterWithOptions(request, runtime);
    }

    public SaveTaskResponse saveTaskWithOptions(SaveTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTask", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskResponse());
    }

    public SaveTaskResponse saveTask(SaveTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskWithOptions(request, runtime);
    }

    public SubmitTrademarkApplicationComplaintResponse submitTrademarkApplicationComplaintWithOptions(SubmitTrademarkApplicationComplaintRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitTrademarkApplicationComplaintShrinkRequest request = new SubmitTrademarkApplicationComplaintShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitTrademarkApplicationComplaint", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitTrademarkApplicationComplaintResponse());
    }

    public SubmitTrademarkApplicationComplaintResponse submitTrademarkApplicationComplaint(SubmitTrademarkApplicationComplaintRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitTrademarkApplicationComplaintWithOptions(request, runtime);
    }

    public WriteIntentionCommunicationLogResponse writeIntentionCommunicationLogWithOptions(WriteIntentionCommunicationLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WriteIntentionCommunicationLog", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new WriteIntentionCommunicationLogResponse());
    }

    public WriteIntentionCommunicationLogResponse writeIntentionCommunicationLog(WriteIntentionCommunicationLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.writeIntentionCommunicationLogWithOptions(request, runtime);
    }

    public SaveTaskForOfficialFileCustomResponse saveTaskForOfficialFileCustomWithOptions(SaveTaskForOfficialFileCustomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTaskForOfficialFileCustom", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTaskForOfficialFileCustomResponse());
    }

    public SaveTaskForOfficialFileCustomResponse saveTaskForOfficialFileCustom(SaveTaskForOfficialFileCustomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTaskForOfficialFileCustomWithOptions(request, runtime);
    }

    public DescirbeCombineTrademarkResponse descirbeCombineTrademarkWithOptions(DescirbeCombineTrademarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescirbeCombineTrademark", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new DescirbeCombineTrademarkResponse());
    }

    public DescirbeCombineTrademarkResponse descirbeCombineTrademark(DescirbeCombineTrademarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.descirbeCombineTrademarkWithOptions(request, runtime);
    }

    public GetNotaryOrderResponse getNotaryOrderWithOptions(GetNotaryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNotaryOrder", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetNotaryOrderResponse());
    }

    public GetNotaryOrderResponse getNotaryOrder(GetNotaryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNotaryOrderWithOptions(request, runtime);
    }

    public ConfirmAdditionalMaterialResponse confirmAdditionalMaterialWithOptions(ConfirmAdditionalMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmAdditionalMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmAdditionalMaterialResponse());
    }

    public ConfirmAdditionalMaterialResponse confirmAdditionalMaterial(ConfirmAdditionalMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmAdditionalMaterialWithOptions(request, runtime);
    }

    public InsertRenewInfoResponse insertRenewInfoWithOptions(InsertRenewInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertRenewInfo", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new InsertRenewInfoResponse());
    }

    public InsertRenewInfoResponse insertRenewInfo(InsertRenewInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertRenewInfoWithOptions(request, runtime);
    }

    public QueryCredentialsInfoResponse queryCredentialsInfoWithOptions(QueryCredentialsInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCredentialsInfo", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCredentialsInfoResponse());
    }

    public QueryCredentialsInfoResponse queryCredentialsInfo(QueryCredentialsInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCredentialsInfoWithOptions(request, runtime);
    }

    public SearchTmOnsalesResponse searchTmOnsalesWithOptions(SearchTmOnsalesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTmOnsales", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTmOnsalesResponse());
    }

    public SearchTmOnsalesResponse searchTmOnsales(SearchTmOnsalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTmOnsalesWithOptions(request, runtime);
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicyWithOptions(GenerateUploadFilePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateUploadFilePolicy", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateUploadFilePolicyResponse());
    }

    public GenerateUploadFilePolicyResponse generateUploadFilePolicy(GenerateUploadFilePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateUploadFilePolicyWithOptions(request, runtime);
    }

    public DeleteMaterialResponse deleteMaterialWithOptions(DeleteMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMaterialResponse());
    }

    public DeleteMaterialResponse deleteMaterial(DeleteMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMaterialWithOptions(request, runtime);
    }

    public WriteCommunicationLogResponse writeCommunicationLogWithOptions(WriteCommunicationLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("WriteCommunicationLog", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new WriteCommunicationLogResponse());
    }

    public WriteCommunicationLogResponse writeCommunicationLog(WriteCommunicationLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.writeCommunicationLogWithOptions(request, runtime);
    }

    public InsertTradeIntentionUserResponse insertTradeIntentionUserWithOptions(InsertTradeIntentionUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertTradeIntentionUser", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new InsertTradeIntentionUserResponse());
    }

    public InsertTradeIntentionUserResponse insertTradeIntentionUser(InsertTradeIntentionUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertTradeIntentionUserWithOptions(request, runtime);
    }

    public QueryExtensionAttributeResponse queryExtensionAttributeWithOptions(QueryExtensionAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryExtensionAttribute", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryExtensionAttributeResponse());
    }

    public QueryExtensionAttributeResponse queryExtensionAttribute(QueryExtensionAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryExtensionAttributeWithOptions(request, runtime);
    }

    public UpdateTrademarkOnsaleResponse updateTrademarkOnsaleWithOptions(UpdateTrademarkOnsaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTrademarkOnsale", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTrademarkOnsaleResponse());
    }

    public UpdateTrademarkOnsaleResponse updateTrademarkOnsale(UpdateTrademarkOnsaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrademarkOnsaleWithOptions(request, runtime);
    }

    public QueryTradeProduceDetailResponse queryTradeProduceDetailWithOptions(QueryTradeProduceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeProduceDetail", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeProduceDetailResponse());
    }

    public QueryTradeProduceDetailResponse queryTradeProduceDetail(QueryTradeProduceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeProduceDetailWithOptions(request, runtime);
    }

    public QueryQrCodeUploadStatusResponse queryQrCodeUploadStatusWithOptions(QueryQrCodeUploadStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryQrCodeUploadStatus", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryQrCodeUploadStatusResponse());
    }

    public QueryQrCodeUploadStatusResponse queryQrCodeUploadStatus(QueryQrCodeUploadStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQrCodeUploadStatusWithOptions(request, runtime);
    }

    public RejectApplicantResponse rejectApplicantWithOptions(RejectApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RejectApplicant", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new RejectApplicantResponse());
    }

    public RejectApplicantResponse rejectApplicant(RejectApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rejectApplicantWithOptions(request, runtime);
    }

    public QueryTradeIntentionUserListResponse queryTradeIntentionUserListWithOptions(QueryTradeIntentionUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeIntentionUserList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeIntentionUserListResponse());
    }

    public QueryTradeIntentionUserListResponse queryTradeIntentionUserList(QueryTradeIntentionUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeIntentionUserListWithOptions(request, runtime);
    }

    public StoreMaterialTemporarilyResponse storeMaterialTemporarilyWithOptions(StoreMaterialTemporarilyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StoreMaterialTemporarily", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new StoreMaterialTemporarilyResponse());
    }

    public StoreMaterialTemporarilyResponse storeMaterialTemporarily(StoreMaterialTemporarilyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.storeMaterialTemporarilyWithOptions(request, runtime);
    }

    public RefuseAdditionalMaterialResponse refuseAdditionalMaterialWithOptions(RefuseAdditionalMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefuseAdditionalMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new RefuseAdditionalMaterialResponse());
    }

    public RefuseAdditionalMaterialResponse refuseAdditionalMaterial(RefuseAdditionalMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseAdditionalMaterialWithOptions(request, runtime);
    }

    public ListNotaryInfosResponse listNotaryInfosWithOptions(ListNotaryInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNotaryInfos", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListNotaryInfosResponse());
    }

    public ListNotaryInfosResponse listNotaryInfos(ListNotaryInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotaryInfosWithOptions(request, runtime);
    }

    public GetDefaultPrincipalNameResponse getDefaultPrincipalNameWithOptions(GetDefaultPrincipalNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDefaultPrincipalName", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetDefaultPrincipalNameResponse());
    }

    public GetDefaultPrincipalNameResponse getDefaultPrincipalName(GetDefaultPrincipalNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultPrincipalNameWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetailWithOptions(QueryTradeMarkApplicationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeMarkApplicationDetail", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeMarkApplicationDetailResponse());
    }

    public QueryTradeMarkApplicationDetailResponse queryTradeMarkApplicationDetail(QueryTradeMarkApplicationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationDetailWithOptions(request, runtime);
    }

    public SaveClassificationConditionsResponse saveClassificationConditionsWithOptions(SaveClassificationConditionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveClassificationConditions", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SaveClassificationConditionsResponse());
    }

    public SaveClassificationConditionsResponse saveClassificationConditions(SaveClassificationConditionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveClassificationConditionsWithOptions(request, runtime);
    }

    public FillLogisticsResponse fillLogisticsWithOptions(FillLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FillLogistics", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new FillLogisticsResponse());
    }

    public FillLogisticsResponse fillLogistics(FillLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fillLogisticsWithOptions(request, runtime);
    }

    public UpdateMaterialResponse updateMaterialWithOptions(UpdateMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMaterialResponse());
    }

    public UpdateMaterialResponse updateMaterial(UpdateMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMaterialWithOptions(request, runtime);
    }

    public QueryTradeMarkApplicationLogsResponse queryTradeMarkApplicationLogsWithOptions(QueryTradeMarkApplicationLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTradeMarkApplicationLogs", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTradeMarkApplicationLogsResponse());
    }

    public QueryTradeMarkApplicationLogsResponse queryTradeMarkApplicationLogs(QueryTradeMarkApplicationLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTradeMarkApplicationLogsWithOptions(request, runtime);
    }

    public RefundProduceResponse refundProduceWithOptions(RefundProduceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefundProduce", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new RefundProduceResponse());
    }

    public RefundProduceResponse refundProduce(RefundProduceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundProduceWithOptions(request, runtime);
    }

    public SyncTrademarkResponse syncTrademarkWithOptions(SyncTrademarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncTrademark", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SyncTrademarkResponse());
    }

    public SyncTrademarkResponse syncTrademark(SyncTrademarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncTrademarkWithOptions(request, runtime);
    }

    public CombineLoaResponse combineLoaWithOptions(CombineLoaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CombineLoa", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CombineLoaResponse());
    }

    public CombineLoaResponse combineLoa(CombineLoaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.combineLoaWithOptions(request, runtime);
    }

    public FilterUnavailableCodesResponse filterUnavailableCodesWithOptions(FilterUnavailableCodesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FilterUnavailableCodesShrinkRequest request = new FilterUnavailableCodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "Codes", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FilterUnavailableCodes", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new FilterUnavailableCodesResponse());
    }

    public FilterUnavailableCodesResponse filterUnavailableCodes(FilterUnavailableCodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.filterUnavailableCodesWithOptions(request, runtime);
    }

    public InsertMaterialResponse insertMaterialWithOptions(InsertMaterialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertMaterial", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new InsertMaterialResponse());
    }

    public InsertMaterialResponse insertMaterial(InsertMaterialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertMaterialWithOptions(request, runtime);
    }

    public SaveTradeMarkReviewMaterialDetailResponse saveTradeMarkReviewMaterialDetailWithOptions(SaveTradeMarkReviewMaterialDetailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveTradeMarkReviewMaterialDetailShrinkRequest request = new SaveTradeMarkReviewMaterialDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalOssKeyList)) {
            request.additionalOssKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalOssKeyList, "AdditionalOssKeyList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTradeMarkReviewMaterialDetail", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTradeMarkReviewMaterialDetailResponse());
    }

    public SaveTradeMarkReviewMaterialDetailResponse saveTradeMarkReviewMaterialDetail(SaveTradeMarkReviewMaterialDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTradeMarkReviewMaterialDetailWithOptions(request, runtime);
    }

    public QueryMonitorKeywordsResponse queryMonitorKeywordsWithOptions(QueryMonitorKeywordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMonitorKeywords", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMonitorKeywordsResponse());
    }

    public QueryMonitorKeywordsResponse queryMonitorKeywords(QueryMonitorKeywordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonitorKeywordsWithOptions(request, runtime);
    }

    public QueryTaskListResponse queryTaskListWithOptions(QueryTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskList", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskListResponse());
    }

    public QueryTaskListResponse queryTaskList(QueryTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskListWithOptions(request, runtime);
    }

    public UpdateTrademarkNameResponse updateTrademarkNameWithOptions(UpdateTrademarkNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTrademarkName", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTrademarkNameResponse());
    }

    public UpdateTrademarkNameResponse updateTrademarkName(UpdateTrademarkNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTrademarkNameWithOptions(request, runtime);
    }

    public CheckLoaFillResponse checkLoaFillWithOptions(CheckLoaFillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckLoaFill", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CheckLoaFillResponse());
    }

    public CheckLoaFillResponse checkLoaFill(CheckLoaFillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkLoaFillWithOptions(request, runtime);
    }

    public ConfirmApplicantResponse confirmApplicantWithOptions(ConfirmApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmApplicant", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmApplicantResponse());
    }

    public ConfirmApplicantResponse confirmApplicant(ConfirmApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmApplicantWithOptions(request, runtime);
    }

    public CreateIntentionOrderResponse createIntentionOrderWithOptions(CreateIntentionOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIntentionOrder", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIntentionOrderResponse());
    }

    public CreateIntentionOrderResponse createIntentionOrder(CreateIntentionOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntentionOrderWithOptions(request, runtime);
    }

    public QueryOssResourcesResponse queryOssResourcesWithOptions(QueryOssResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOssResources", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOssResourcesResponse());
    }

    public QueryOssResourcesResponse queryOssResources(QueryOssResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOssResourcesWithOptions(request, runtime);
    }

    public RefuseApplicantResponse refuseApplicantWithOptions(RefuseApplicantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefuseApplicant", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new RefuseApplicantResponse());
    }

    public RefuseApplicantResponse refuseApplicant(RefuseApplicantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseApplicantWithOptions(request, runtime);
    }

    public CreateIntentionOrderGeneratingPayResponse createIntentionOrderGeneratingPayWithOptions(CreateIntentionOrderGeneratingPayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIntentionOrderGeneratingPay", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIntentionOrderGeneratingPayResponse());
    }

    public CreateIntentionOrderGeneratingPayResponse createIntentionOrderGeneratingPay(CreateIntentionOrderGeneratingPayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntentionOrderGeneratingPayWithOptions(request, runtime);
    }

    public ListNotaryOrdersResponse listNotaryOrdersWithOptions(ListNotaryOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNotaryOrders", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListNotaryOrdersResponse());
    }

    public ListNotaryOrdersResponse listNotaryOrders(ListNotaryOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotaryOrdersWithOptions(request, runtime);
    }

    public GetSupportPrincipalNameResponse getSupportPrincipalNameWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetSupportPrincipalName", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetSupportPrincipalNameResponse());
    }

    public GetSupportPrincipalNameResponse getSupportPrincipalName() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSupportPrincipalNameWithOptions(runtime);
    }

    public StartNotaryResponse startNotaryWithOptions(StartNotaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartNotary", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new StartNotaryResponse());
    }

    public StartNotaryResponse startNotary(StartNotaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startNotaryWithOptions(request, runtime);
    }

    public UpdateSendMaterialNumResponse updateSendMaterialNumWithOptions(UpdateSendMaterialNumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSendMaterialNum", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSendMaterialNumResponse());
    }

    public UpdateSendMaterialNumResponse updateSendMaterialNum(UpdateSendMaterialNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSendMaterialNumWithOptions(request, runtime);
    }

    public DeleteTrademarkApplicationResponse deleteTrademarkApplicationWithOptions(DeleteTrademarkApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTrademarkApplication", "2018-07-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTrademarkApplicationResponse());
    }

    public DeleteTrademarkApplicationResponse deleteTrademarkApplication(DeleteTrademarkApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTrademarkApplicationWithOptions(request, runtime);
    }
}

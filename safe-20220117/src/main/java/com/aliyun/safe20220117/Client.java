// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117;

import com.aliyun.tea.*;
import com.aliyun.safe20220117.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("safe", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>取消封网接口</p>
     * 
     * @param request CancelBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelBlockResponse
     */
    public CancelBlockResponse cancelBlockWithOptions(CancelBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockId)) {
            body.put("BlockId", request.blockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cancelBLockDesc)) {
            body.put("CancelBLockDesc", request.cancelBLockDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEmpId)) {
            body.put("CreateEmpId", request.createEmpId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelBlock"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelBlockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消封网接口</p>
     * 
     * @param request CancelBlockRequest
     * @return CancelBlockResponse
     */
    public CancelBlockResponse cancelBlock(CancelBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更取消</p>
     * 
     * @param request ChangeCancelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeCancelResponse
     */
    public ChangeCancelResponse changeCancelWithOptions(ChangeCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeCancel"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更取消</p>
     * 
     * @param request ChangeCancelRequest
     * @return ChangeCancelResponse
     */
    public ChangeCancelResponse changeCancel(ChangeCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeCancelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>安全变更check</p>
     * 
     * @param tmpReq ChangeCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeCheckResponse
     */
    public ChangeCheckResponse changeCheckWithOptions(ChangeCheckRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChangeCheckShrinkRequest request = new ChangeCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.damagedChangeNotices)) {
            request.damagedChangeNoticesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.damagedChangeNotices, "DamagedChangeNotices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affectCustomer)) {
            body.put("AffectCustomer", request.affectCustomer);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveFlowParam)) {
            bodyFlat.put("ApproveFlowParam", request.approveFlowParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgCustomTemplateExtraDTO)) {
            bodyFlat.put("BgCustomTemplateExtraDTO", request.bgCustomTemplateExtraDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgVid)) {
            body.put("BgVid", request.bgVid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockInfos)) {
            body.put("BlockInfos", request.blockInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callBackInfo)) {
            bodyFlat.put("CallBackInfo", request.callBackInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeDataType)) {
            body.put("ChangeDataType", request.changeDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeDesc)) {
            body.put("ChangeDesc", request.changeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            body.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEnv)) {
            body.put("ChangeEnv", request.changeEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeItems)) {
            body.put("ChangeItems", request.changeItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeObject)) {
            body.put("ChangeObject", request.changeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptSubType)) {
            body.put("ChangeOptSubType", request.changeOptSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptType)) {
            body.put("ChangeOptType", request.changeOptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeReason)) {
            body.put("ChangeReason", request.changeReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeRmarks)) {
            body.put("ChangeRmarks", request.changeRmarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSchemes)) {
            body.put("ChangeSchemes", request.changeSchemes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            body.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSubTypeDesc)) {
            body.put("ChangeSubTypeDesc", request.changeSubTypeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSystem)) {
            body.put("ChangeSystem", request.changeSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTimes)) {
            body.put("ChangeTimes", request.changeTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTitle)) {
            body.put("ChangeTitle", request.changeTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeValidation)) {
            body.put("ChangeValidation", request.changeValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.damagedChangeNoticesShrink)) {
            body.put("DamagedChangeNotices", request.damagedChangeNoticesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            body.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follower)) {
            body.put("Follower", request.follower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayStatus)) {
            body.put("GrayStatus", request.grayStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmChangeNoticeEnum)) {
            body.put("HarmChangeNoticeEnum", request.harmChangeNoticeEnum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidence)) {
            body.put("Incidence", request.incidence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.influenceInfo)) {
            bodyFlat.put("InfluenceInfo", request.influenceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            bodyFlat.put("Instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needModifyDoc)) {
            body.put("NeedModifyDoc", request.needModifyDoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releasePackageInfos)) {
            body.put("ReleasePackageInfos", request.releasePackageInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuseSourceOrderId)) {
            body.put("ReuseSourceOrderId", request.reuseSourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollback)) {
            body.put("Rollback", request.rollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceName)) {
            body.put("SourceName", request.sourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            body.put("SourceUrl", request.sourceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteType)) {
            body.put("WhiteType", request.whiteType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeCheck"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>安全变更check</p>
     * 
     * @param request ChangeCheckRequest
     * @return ChangeCheckResponse
     */
    public ChangeCheckResponse changeCheck(ChangeCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更执行end</p>
     * 
     * @param request ChangeEndRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeEndResponse
     */
    public ChangeEndResponse changeEndWithOptions(ChangeEndRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            query.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeResult)) {
            query.put("ChangeResult", request.changeResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.curBatchNo)) {
            query.put("CurBatchNo", request.curBatchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            query.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalBatchNo)) {
            query.put("TotalBatchNo", request.totalBatchNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeEnd"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeEndResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更执行end</p>
     * 
     * @param request ChangeEndRequest
     * @return ChangeEndResponse
     */
    public ChangeEndResponse changeEnd(ChangeEndRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeEndWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更执行start</p>
     * 
     * @param request ChangeStartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeStartResponse
     */
    public ChangeStartResponse changeStartWithOptions(ChangeStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            query.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeObject)) {
            query.put("ChangeObject", request.changeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptType)) {
            query.put("ChangeOptType", request.changeOptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            query.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTitle)) {
            query.put("ChangeTitle", request.changeTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            query.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.curBatchNo)) {
            query.put("CurBatchNo", request.curBatchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            query.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalBatchNo)) {
            query.put("TotalBatchNo", request.totalBatchNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeStart"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeStartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更执行start</p>
     * 
     * @param request ChangeStartRequest
     * @return ChangeStartResponse
     */
    public ChangeStartResponse changeStart(ChangeStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeStartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>三方创建封网接口</p>
     * 
     * @param request CreateBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBlockResponse
     */
    public CreateBlockResponse createBlockWithOptions(CreateBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveStrategyNodes)) {
            bodyFlat.put("ApproveStrategyNodes", request.approveStrategyNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockId)) {
            body.put("BlockId", request.blockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.director)) {
            body.put("Director", request.director);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isNeedApprove)) {
            body.put("IsNeedApprove", request.isNeedApprove);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRecall)) {
            body.put("IsRecall", request.isRecall);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTemplate)) {
            body.put("IsTemplate", request.isTemplate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelName)) {
            body.put("LabelName", request.labelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeDesc)) {
            body.put("NoticeDesc", request.noticeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeEnclosureInfos)) {
            bodyFlat.put("NoticeEnclosureInfos", request.noticeEnclosureInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeRequestLink)) {
            body.put("NoticeRequestLink", request.noticeRequestLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noticeType)) {
            body.put("NoticeType", request.noticeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopes)) {
            bodyFlat.put("Scopes", request.scopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("creatorEmpId", request.creatorEmpId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBlock"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBlockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>三方创建封网接口</p>
     * 
     * @param request CreateBlockRequest
     * @return CreateBlockResponse
     */
    public CreateBlockResponse createBlock(CreateBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建蚂蚁封网接口</p>
     * 
     * @param tmpReq CreateMaYiBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMaYiBlockResponse
     */
    public CreateMaYiBlockResponse createMaYiBlockWithOptions(CreateMaYiBlockRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMaYiBlockShrinkRequest request = new CreateMaYiBlockShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scope)) {
            request.scopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scope, "Scope", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blockId)) {
            body.put("BlockId", request.blockId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockTimes)) {
            body.put("BlockTimes", request.blockTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockType)) {
            body.put("BlockType", request.blockType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.director)) {
            body.put("Director", request.director);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultVersion)) {
            body.put("FaultVersion", request.faultVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.information)) {
            body.put("Information", request.information);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeShrink)) {
            body.put("Scope", request.scopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaYiBlock"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMaYiBlockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建蚂蚁封网接口</p>
     * 
     * @param request CreateMaYiBlockRequest
     * @return CreateMaYiBlockResponse
     */
    public CreateMaYiBlockResponse createMaYiBlock(CreateMaYiBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMaYiBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建操作类型</p>
     * 
     * @param request CreateOperatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOperatorResponse
     */
    public CreateOperatorResponse createOperatorWithOptions(CreateOperatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgObject)) {
            body.put("BgObject", request.bgObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgSystem)) {
            body.put("BgSystem", request.bgSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.curEmpId)) {
            body.put("CurEmpId", request.curEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noCheck)) {
            body.put("NoCheck", request.noCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.noRisk)) {
            body.put("NoRisk", request.noRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOperator"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOperatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建操作类型</p>
     * 
     * @param request CreateOperatorRequest
     * @return CreateOperatorResponse
     */
    public CreateOperatorResponse createOperator(CreateOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOperatorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更状态查询</p>
     * 
     * @param request QueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResponse
     */
    public QueryResponse queryWithOptions(QueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needValidate)) {
            query.put("NeedValidate", request.needValidate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更状态查询</p>
     * 
     * @param request QueryRequest
     * @return QueryResponse
     */
    public QueryResponse query(QueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批实例信息</p>
     * 
     * @param request QueryApproveFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryApproveFlowResponse
     */
    public QueryApproveFlowResponse queryApproveFlowWithOptions(QueryApproveFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stage)) {
            query.put("Stage", request.stage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryApproveFlow"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryApproveFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批实例信息</p>
     * 
     * @param request QueryApproveFlowRequest
     * @return QueryApproveFlowResponse
     */
    public QueryApproveFlowResponse queryApproveFlow(QueryApproveFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryApproveFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查封网事件</p>
     * 
     * @param request QueryBlockEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBlockEventResponse
     */
    public QueryBlockEventResponse queryBlockEventWithOptions(QueryBlockEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgSystemName)) {
            body.put("BgSystemName", request.bgSystemName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockHarm)) {
            body.put("BlockHarm", request.blockHarm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deptNo)) {
            body.put("DeptNo", request.deptNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRule)) {
            body.put("NeedRule", request.needRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCodes)) {
            body.put("ProductCodes", request.productCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionReqs)) {
            body.put("RegionReqs", request.regionReqs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBlockEvent"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBlockEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查封网事件</p>
     * 
     * @param request QueryBlockEventRequest
     * @return QueryBlockEventResponse
     */
    public QueryBlockEventResponse queryBlockEvent(QueryBlockEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBlockEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更单详情</p>
     * 
     * @param request QueryChangeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChangeInfoResponse
     */
    public QueryChangeInfoResponse queryChangeInfoWithOptions(QueryChangeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.az)) {
            body.put("Az", request.az);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgVid)) {
            body.put("BgVid", request.bgVid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buId)) {
            body.put("BuId", request.buId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSystem)) {
            body.put("ChangeSystem", request.changeSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.levelTree)) {
            bodyFlat.put("LevelTree", request.levelTree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChangeInfo"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChangeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更单详情</p>
     * 
     * @param request QueryChangeInfoRequest
     * @return QueryChangeInfoResponse
     */
    public QueryChangeInfoResponse queryChangeInfo(QueryChangeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryChangeInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询检测详情接口</p>
     * 
     * @param request QueryCheckInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCheckInfoResponse
     */
    public QueryCheckInfoResponse queryCheckInfoWithOptions(QueryCheckInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCheckInfo"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCheckInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询检测详情接口</p>
     * 
     * @param request QueryCheckInfoRequest
     * @return QueryCheckInfoResponse
     */
    public QueryCheckInfoResponse queryCheckInfo(QueryCheckInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCheckInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询敏感客户</p>
     * 
     * @param request QueryCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomerResponse
     */
    public QueryCustomerResponse queryCustomerWithOptions(QueryCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomer"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询敏感客户</p>
     * 
     * @param request QueryCustomerRequest
     * @return QueryCustomerResponse
     */
    public QueryCustomerResponse queryCustomer(QueryCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行单详情</p>
     * 
     * @param request QueryExecuteInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExecuteInfoResponse
     */
    public QueryExecuteInfoResponse queryExecuteInfoWithOptions(QueryExecuteInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.az)) {
            body.put("Az", request.az);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgVid)) {
            body.put("BgVid", request.bgVid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buId)) {
            body.put("BuId", request.buId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exVid)) {
            body.put("ExVid", request.exVid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.levelTree)) {
            bodyFlat.put("LevelTree", request.levelTree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExecuteInfo"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExecuteInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行单详情</p>
     * 
     * @param request QueryExecuteInfoRequest
     * @return QueryExecuteInfoResponse
     */
    public QueryExecuteInfoResponse queryExecuteInfo(QueryExecuteInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryExecuteInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询内部产品接口</p>
     * 
     * @param request QueryInnerProductInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInnerProductInfoResponse
     */
    public QueryInnerProductInfoResponse queryInnerProductInfoWithOptions(QueryInnerProductInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInnerProductInfo"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInnerProductInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询内部产品接口</p>
     * 
     * @param request QueryInnerProductInfoRequest
     * @return QueryInnerProductInfoResponse
     */
    public QueryInnerProductInfoResponse queryInnerProductInfo(QueryInnerProductInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInnerProductInfoWithOptions(request, runtime);
    }

    /**
     * @param request QueryRegionAzRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRegionAzResponse
     */
    public QueryRegionAzResponse queryRegionAzWithOptions(QueryRegionAzRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRegionAz"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRegionAzResponse());
    }

    /**
     * @param request QueryRegionAzRequest
     * @return QueryRegionAzResponse
     */
    public QueryRegionAzResponse queryRegionAz(QueryRegionAzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRegionAzWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更取消接口</p>
     * 
     * @param request SafeChangeCancelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeCancelResponse
     */
    public SafeChangeCancelResponse safeChangeCancelWithOptions(SafeChangeCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgVid)) {
            body.put("BgVid", request.bgVid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEmpNo)) {
            body.put("OperateEmpNo", request.operateEmpNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeCancel"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更取消接口</p>
     * 
     * @param request SafeChangeCancelRequest
     * @return SafeChangeCancelResponse
     */
    public SafeChangeCancelResponse safeChangeCancel(SafeChangeCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeCancelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更check接口</p>
     * 
     * @param tmpReq SafeChangeCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeCheckResponse
     */
    public SafeChangeCheckResponse safeChangeCheckWithOptions(SafeChangeCheckRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SafeChangeCheckShrinkRequest request = new SafeChangeCheckShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.harmNoticeCombineParam)) {
            request.harmNoticeCombineParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.harmNoticeCombineParam, "HarmNoticeCombineParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checker)) {
            query.put("Checker", request.checker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmChangeNoticeEnum)) {
            query.put("HarmChangeNoticeEnum", request.harmChangeNoticeEnum);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.affectCustomer)) {
            body.put("AffectCustomer", request.affectCustomer);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approveFlowParam)) {
            bodyFlat.put("ApproveFlowParam", request.approveFlowParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgCustomTemplateExtraDTO)) {
            bodyFlat.put("BgCustomTemplateExtraDTO", request.bgCustomTemplateExtraDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockInfos)) {
            body.put("BlockInfos", request.blockInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callBackInfo)) {
            bodyFlat.put("CallBackInfo", request.callBackInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeDataType)) {
            body.put("ChangeDataType", request.changeDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeDesc)) {
            body.put("ChangeDesc", request.changeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            body.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEnv)) {
            body.put("ChangeEnv", request.changeEnv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeItems)) {
            body.put("ChangeItems", request.changeItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeObject)) {
            body.put("ChangeObject", request.changeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptSubType)) {
            body.put("ChangeOptSubType", request.changeOptSubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptType)) {
            body.put("ChangeOptType", request.changeOptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeReason)) {
            body.put("ChangeReason", request.changeReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeRmarks)) {
            body.put("ChangeRmarks", request.changeRmarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSchemes)) {
            body.put("ChangeSchemes", request.changeSchemes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            body.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSubTypeDesc)) {
            body.put("ChangeSubTypeDesc", request.changeSubTypeDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeSystem)) {
            body.put("ChangeSystem", request.changeSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTimes)) {
            body.put("ChangeTimes", request.changeTimes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTitle)) {
            body.put("ChangeTitle", request.changeTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeValidation)) {
            body.put("ChangeValidation", request.changeValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.damagedChangeNotices)) {
            bodyFlat.put("DamagedChangeNotices", request.damagedChangeNotices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            body.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.follower)) {
            body.put("Follower", request.follower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayStatus)) {
            body.put("GrayStatus", request.grayStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.harmNoticeCombineParamShrink)) {
            body.put("HarmNoticeCombineParam", request.harmNoticeCombineParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incidence)) {
            body.put("Incidence", request.incidence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.influenceInfo)) {
            bodyFlat.put("InfluenceInfo", request.influenceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            bodyFlat.put("Instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needModifyDoc)) {
            body.put("NeedModifyDoc", request.needModifyDoc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEmpNo)) {
            body.put("OperateEmpNo", request.operateEmpNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            body.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releasePackageInfos)) {
            body.put("ReleasePackageInfos", request.releasePackageInfos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuseSourceOrderId)) {
            body.put("ReuseSourceOrderId", request.reuseSourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollback)) {
            body.put("Rollback", request.rollback);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceName)) {
            body.put("SourceName", request.sourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceUrl)) {
            body.put("SourceUrl", request.sourceUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteType)) {
            body.put("whiteType", request.whiteType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeCheck"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更check接口</p>
     * 
     * @param request SafeChangeCheckRequest
     * @return SafeChangeCheckResponse
     */
    public SafeChangeCheckResponse safeChangeCheck(SafeChangeCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更End接口</p>
     * 
     * @param request SafeChangeEndRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeEndResponse
     */
    public SafeChangeEndResponse safeChangeEndWithOptions(SafeChangeEndRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            body.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeResult)) {
            body.put("ChangeResult", request.changeResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.curBatchNo)) {
            body.put("CurBatchNo", request.curBatchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            body.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalBatchNo)) {
            body.put("TotalBatchNo", request.totalBatchNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeEnd"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeEndResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更End接口</p>
     * 
     * @param request SafeChangeEndRequest
     * @return SafeChangeEndResponse
     */
    public SafeChangeEndResponse safeChangeEnd(SafeChangeEndRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeEndWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更单查询</p>
     * 
     * @param request SafeChangeQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeQueryResponse
     */
    public SafeChangeQueryResponse safeChangeQueryWithOptions(SafeChangeQueryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.returnType)) {
            query.put("ReturnType", request.returnType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needValidate)) {
            body.put("NeedValidate", request.needValidate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            body.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeQuery"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更单查询</p>
     * 
     * @param request SafeChangeQueryRequest
     * @return SafeChangeQueryResponse
     */
    public SafeChangeQueryResponse safeChangeQuery(SafeChangeQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批实例信息</p>
     * 
     * @param request SafeChangeQueryApproveFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeQueryApproveFlowResponse
     */
    public SafeChangeQueryApproveFlowResponse safeChangeQueryApproveFlowWithOptions(SafeChangeQueryApproveFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stage)) {
            body.put("Stage", request.stage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeQueryApproveFlow"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeQueryApproveFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审批实例信息</p>
     * 
     * @param request SafeChangeQueryApproveFlowRequest
     * @return SafeChangeQueryApproveFlowResponse
     */
    public SafeChangeQueryApproveFlowResponse safeChangeQueryApproveFlow(SafeChangeQueryApproveFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeQueryApproveFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变更Start接口</p>
     * 
     * @param request SafeChangeStartRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeStartResponse
     */
    public SafeChangeStartResponse safeChangeStartWithOptions(SafeChangeStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeEndTime)) {
            body.put("ChangeEndTime", request.changeEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeObject)) {
            body.put("ChangeObject", request.changeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeOptType)) {
            body.put("ChangeOptType", request.changeOptType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeStartTime)) {
            body.put("ChangeStartTime", request.changeStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changeTitle)) {
            body.put("ChangeTitle", request.changeTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.curBatchNo)) {
            body.put("CurBatchNo", request.curBatchNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executorEmpId)) {
            body.put("ExecutorEmpId", request.executorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalBatchNo)) {
            body.put("TotalBatchNo", request.totalBatchNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeStart"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeStartResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变更Start接口</p>
     * 
     * @param request SafeChangeStartRequest
     * @return SafeChangeStartResponse
     */
    public SafeChangeStartResponse safeChangeStart(SafeChangeStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeStartWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交审批</p>
     * 
     * @param request SafeChangeStartApproveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeChangeStartApproveResponse
     */
    public SafeChangeStartApproveResponse safeChangeStartApproveWithOptions(SafeChangeStartApproveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            body.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            body.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeChangeStartApprove"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeChangeStartApproveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交审批</p>
     * 
     * @param request SafeChangeStartApproveRequest
     * @return SafeChangeStartApproveResponse
     */
    public SafeChangeStartApproveResponse safeChangeStartApprove(SafeChangeStartApproveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeChangeStartApproveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>封网范围数据查询</p>
     * 
     * @param request SafeScopeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SafeScopeDataResponse
     */
    public SafeScopeDataResponse safeScopeDataWithOptions(SafeScopeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeList)) {
            body.put("CodeList", request.codeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.factor)) {
            body.put("Factor", request.factor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            body.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idList)) {
            body.put("IdList", request.idList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.item)) {
            body.put("Item", request.item);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needTotalCount)) {
            body.put("NeedTotalCount", request.needTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("OrderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCode)) {
            body.put("ParentCode", request.parentCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNameEn)) {
            body.put("RegionNameEn", request.regionNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SafeScopeData"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SafeScopeDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>封网范围数据查询</p>
     * 
     * @param request SafeScopeDataRequest
     * @return SafeScopeDataResponse
     */
    public SafeScopeDataResponse safeScopeData(SafeScopeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.safeScopeDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交审批</p>
     * 
     * @param request StartApproveRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartApproveResponse
     */
    public StartApproveResponse startApproveWithOptions(StartApproveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            query.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            query.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorEmpId)) {
            query.put("CreatorEmpId", request.creatorEmpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            query.put("ExtraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            query.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOrderId)) {
            query.put("SourceOrderId", request.sourceOrderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartApprove"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartApproveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交审批</p>
     * 
     * @param request StartApproveRequest
     * @return StartApproveResponse
     */
    public StartApproveResponse startApprove(StartApproveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startApproveWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>同步产品接口</p>
     * 
     * @param request SyncProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncProductResponse
     */
    public SyncProductResponse syncProductWithOptions(SyncProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKey)) {
            body.put("AuthKey", request.authKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authSign)) {
            body.put("AuthSign", request.authSign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqTimestamp)) {
            body.put("ReqTimestamp", request.reqTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncProductList)) {
            body.put("SyncProductList", request.syncProductList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncProduct"),
            new TeaPair("version", "2022-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>同步产品接口</p>
     * 
     * @param request SyncProductRequest
     * @return SyncProductResponse
     */
    public SyncProductResponse syncProduct(SyncProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncProductWithOptions(request, runtime);
    }
}

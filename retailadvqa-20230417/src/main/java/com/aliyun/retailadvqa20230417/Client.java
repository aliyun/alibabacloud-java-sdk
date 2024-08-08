// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417;

import com.aliyun.tea.*;
import com.aliyun.retailadvqa20230417.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("retailadvqa", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>开放平台同步会员基础信息</p>
     * 
     * @param tmpReq AddMemberBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMemberBasicInfoResponse
     */
    public AddMemberBasicInfoResponse addMemberBasicInfoWithOptions(AddMemberBasicInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddMemberBasicInfoShrinkRequest request = new AddMemberBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMemberBasicInfo"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMemberBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放平台同步会员基础信息</p>
     * 
     * @param request AddMemberBasicInfoRequest
     * @return AddMemberBasicInfoResponse
     */
    public AddMemberBasicInfoResponse addMemberBasicInfo(AddMemberBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMemberBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量保存订单信息</p>
     * 
     * @param tmpReq BatchSaveOrderPopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSaveOrderPopResponse
     */
    public BatchSaveOrderPopResponse batchSaveOrderPopWithOptions(BatchSaveOrderPopRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchSaveOrderPopShrinkRequest request = new BatchSaveOrderPopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orders)) {
            request.ordersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orders, "Orders", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ordersShrink)) {
            query.put("Orders", request.ordersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSaveOrderPop"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSaveOrderPopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量保存订单信息</p>
     * 
     * @param request BatchSaveOrderPopRequest
     * @return BatchSaveOrderPopResponse
     */
    public BatchSaveOrderPopResponse batchSaveOrderPop(BatchSaveOrderPopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSaveOrderPopWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会员等级初始化</p>
     * 
     * @param tmpReq CalculateMemberLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CalculateMemberLevelResponse
     */
    public CalculateMemberLevelResponse calculateMemberLevelWithOptions(CalculateMemberLevelRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CalculateMemberLevelShrinkRequest request = new CalculateMemberLevelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "Body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("Body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CalculateMemberLevel"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CalculateMemberLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会员等级初始化</p>
     * 
     * @param request CalculateMemberLevelRequest
     * @return CalculateMemberLevelResponse
     */
    public CalculateMemberLevelResponse calculateMemberLevel(CalculateMemberLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.calculateMemberLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会员信息编辑API</p>
     * 
     * @param tmpReq EditMemberBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditMemberBasicInfoResponse
     */
    public EditMemberBasicInfoResponse editMemberBasicInfoWithOptions(EditMemberBasicInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditMemberBasicInfoShrinkRequest request = new EditMemberBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "Body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("Body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditMemberBasicInfo"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditMemberBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会员信息编辑API</p>
     * 
     * @param request EditMemberBasicInfoRequest
     * @return EditMemberBasicInfoResponse
     */
    public EditMemberBasicInfoResponse editMemberBasicInfo(EditMemberBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editMemberBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放平台会员积分明细查询</p>
     * 
     * @param tmpReq MemberAccountDetailPageQueryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MemberAccountDetailPageQueryResponse
     */
    public MemberAccountDetailPageQueryResponse memberAccountDetailPageQueryWithOptions(MemberAccountDetailPageQueryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MemberAccountDetailPageQueryShrinkRequest request = new MemberAccountDetailPageQueryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MemberAccountDetailPageQuery"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MemberAccountDetailPageQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放平台会员积分明细查询</p>
     * 
     * @param request MemberAccountDetailPageQueryRequest
     * @return MemberAccountDetailPageQueryResponse
     */
    public MemberAccountDetailPageQueryResponse memberAccountDetailPageQuery(MemberAccountDetailPageQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.memberAccountDetailPageQueryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>会员积分变更</p>
     * 
     * @param tmpReq MemberPointChangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MemberPointChangeResponse
     */
    public MemberPointChangeResponse memberPointChangeWithOptions(MemberPointChangeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MemberPointChangeShrinkRequest request = new MemberPointChangeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MemberPointChange"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MemberPointChangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>会员积分变更</p>
     * 
     * @param request MemberPointChangeRequest
     * @return MemberPointChangeResponse
     */
    public MemberPointChangeResponse memberPointChange(MemberPointChangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.memberPointChangeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询会员基础信息</p>
     * 
     * @param tmpReq QueryMemberBasicInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMemberBasicInfoResponse
     */
    public QueryMemberBasicInfoResponse queryMemberBasicInfoWithOptions(QueryMemberBasicInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMemberBasicInfoShrinkRequest request = new QueryMemberBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMemberBasicInfo"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMemberBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询会员基础信息</p>
     * 
     * @param request QueryMemberBasicInfoRequest
     * @return QueryMemberBasicInfoResponse
     */
    public QueryMemberBasicInfoResponse queryMemberBasicInfo(QueryMemberBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMemberBasicInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卡券信息同步</p>
     * 
     * @param tmpReq SyncCardInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncCardInfoResponse
     */
    public SyncCardInfoResponse syncCardInfoWithOptions(SyncCardInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncCardInfoShrinkRequest request = new SyncCardInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncCardInfo"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncCardInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>卡券信息同步</p>
     * 
     * @param request SyncCardInfoRequest
     * @return SyncCardInfoResponse
     */
    public SyncCardInfoResponse syncCardInfo(SyncCardInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncCardInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开放平台会员行为信息同步</p>
     * 
     * @param tmpReq SyncMemberBehaviorInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncMemberBehaviorInfoResponse
     */
    public SyncMemberBehaviorInfoResponse syncMemberBehaviorInfoWithOptions(SyncMemberBehaviorInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncMemberBehaviorInfoShrinkRequest request = new SyncMemberBehaviorInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMemberBehaviorInfo"),
            new TeaPair("version", "2023-04-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMemberBehaviorInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开放平台会员行为信息同步</p>
     * 
     * @param request SyncMemberBehaviorInfoRequest
     * @return SyncMemberBehaviorInfoResponse
     */
    public SyncMemberBehaviorInfoResponse syncMemberBehaviorInfo(SyncMemberBehaviorInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncMemberBehaviorInfoWithOptions(request, runtime);
    }
}

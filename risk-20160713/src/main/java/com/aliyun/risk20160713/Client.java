// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713;

import com.aliyun.tea.*;
import com.aliyun.risk20160713.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("risk", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddNameListResponse addNameListWithOptions(AddNameListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddNameListShrinkRequest request = new AddNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("Applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsUrl)) {
            query.put("BpmsUrl", request.bpmsUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mark)) {
            query.put("Mark", request.mark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNameListResponse());
    }

    public AddNameListResponse addNameList(AddNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNameListWithOptions(request, runtime);
    }

    public DelNameListResponse delNameListWithOptions(DelNameListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DelNameListShrinkRequest request = new DelNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("Applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsUrl)) {
            query.put("BpmsUrl", request.bpmsUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mark)) {
            query.put("Mark", request.mark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelNameListResponse());
    }

    public DelNameListResponse delNameList(DelNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delNameListWithOptions(request, runtime);
    }

    public FindRiskResponse findRiskWithOptions(FindRiskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FindRiskShrinkRequest request = new FindRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            query.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mteeCode)) {
            query.put("MteeCode", request.mteeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umid)) {
            query.put("Umid", request.umid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindRisk"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindRiskResponse());
    }

    public FindRiskResponse findRisk(FindRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findRiskWithOptions(request, runtime);
    }

    public PushDataResponse pushDataWithOptions(PushDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushDataShrinkRequest request = new PushDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunIdkp)) {
            query.put("AliyunIdkp", request.aliyunIdkp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            query.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.havanaId)) {
            query.put("HavanaId", request.havanaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mteeCode)) {
            query.put("MteeCode", request.mteeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushData"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDataResponse());
    }

    public PushDataResponse pushData(PushDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushDataWithOptions(request, runtime);
    }

    public QueryHitUserResponse queryHitUserWithOptions(QueryHitUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHitUser"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHitUserResponse());
    }

    public QueryHitUserResponse queryHitUser(QueryHitUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryHitUserWithOptions(request, runtime);
    }

    public QueryNameListResponse queryNameListWithOptions(QueryNameListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryNameListShrinkRequest request = new QueryNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryLike)) {
            query.put("QueryLike", request.queryLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNameListResponse());
    }

    public QueryNameListResponse queryNameList(QueryNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryNameListWithOptions(request, runtime);
    }

    public QueryNameListForLxResponse queryNameListForLxWithOptions(QueryNameListForLxRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryNameListForLxShrinkRequest request = new QueryNameListForLxShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryLike)) {
            query.put("QueryLike", request.queryLike);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNameListForLx"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNameListForLxResponse());
    }

    public QueryNameListForLxResponse queryNameListForLx(QueryNameListForLxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryNameListForLxWithOptions(request, runtime);
    }

    public SendVerifyCodeResponse sendVerifyCodeWithOptions(SendVerifyCodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendVerifyCodeShrinkRequest request = new SendVerifyCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messageParameters)) {
            request.messageParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messageParameters, "MessageParameters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            query.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageParametersShrink)) {
            query.put("MessageParameters", request.messageParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageReiver)) {
            query.put("MessageReiver", request.messageReiver);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mteeCode)) {
            query.put("MteeCode", request.mteeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskRequestId)) {
            query.put("RiskRequestId", request.riskRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeInterval)) {
            query.put("TimeInterval", request.timeInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerifyCode"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerifyCodeResponse());
    }

    public SendVerifyCodeResponse sendVerifyCode(SendVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerifyCodeWithOptions(request, runtime);
    }

    public TunnelReceiveResponse tunnelReceiveWithOptions(TunnelReceiveRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TunnelReceiveShrinkRequest request = new TunnelReceiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apn)) {
            query.put("Apn", request.apn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEndPoint)) {
            query.put("StartEndPoint", request.startEndPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopEndPoint)) {
            query.put("StopEndPoint", request.stopEndPoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TunnelReceive"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TunnelReceiveResponse());
    }

    public TunnelReceiveResponse tunnelReceive(TunnelReceiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tunnelReceiveWithOptions(request, runtime);
    }

    public TunnelSendResponse tunnelSendWithOptions(TunnelSendRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TunnelSendShrinkRequest request = new TunnelSendShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apn)) {
            query.put("Apn", request.apn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataShrink)) {
            query.put("Data", request.dataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEndPoint)) {
            query.put("StartEndPoint", request.startEndPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopEndPoint)) {
            query.put("StopEndPoint", request.stopEndPoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TunnelSend"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TunnelSendResponse());
    }

    public TunnelSendResponse tunnelSend(TunnelSendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tunnelSendWithOptions(request, runtime);
    }

    public UpdateNameListResponse updateNameListWithOptions(UpdateNameListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNameListShrinkRequest request = new UpdateNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicant)) {
            query.put("Applicant", request.applicant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bpmsUrl)) {
            query.put("BpmsUrl", request.bpmsUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataValue)) {
            query.put("DataValue", request.dataValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mark)) {
            query.put("Mark", request.mark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNameListResponse());
    }

    public UpdateNameListResponse updateNameList(UpdateNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNameListWithOptions(request, runtime);
    }

    public ValidateVerifyCodeResponse validateVerifyCodeWithOptions(ValidateVerifyCodeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidateVerifyCodeShrinkRequest request = new ValidateVerifyCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            query.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mteeCode)) {
            query.put("MteeCode", request.mteeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskRequestId)) {
            query.put("RiskRequestId", request.riskRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyCode)) {
            query.put("VerifyCode", request.verifyCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateVerifyCode"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateVerifyCodeResponse());
    }

    public ValidateVerifyCodeResponse validateVerifyCode(ValidateVerifyCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateVerifyCodeWithOptions(request, runtime);
    }

    public VerifyIvTokenResponse verifyIvTokenWithOptions(VerifyIvTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ivToken)) {
            query.put("IvToken", request.ivToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyIvToken"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyIvTokenResponse());
    }

    public VerifyIvTokenResponse verifyIvToken(VerifyIvTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyIvTokenWithOptions(request, runtime);
    }

    public WriteUsscResponse writeUsscWithOptions(WriteUsscRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WriteUsscShrinkRequest request = new WriteUsscShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelType)) {
            query.put("ChannelType", request.channelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            query.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collina)) {
            query.put("Collina", request.collina);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendShrink)) {
            query.put("Extend", request.extendShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            query.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mteeCode)) {
            query.put("MteeCode", request.mteeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sign)) {
            query.put("Sign", request.sign);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signTime)) {
            query.put("SignTime", request.signTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verifyResult)) {
            query.put("VerifyResult", request.verifyResult);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteUssc"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteUsscResponse());
    }

    public WriteUsscResponse writeUssc(WriteUsscRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.writeUsscWithOptions(request, runtime);
    }
}

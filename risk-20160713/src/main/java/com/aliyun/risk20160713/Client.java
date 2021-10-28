// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713;

import com.aliyun.tea.*;
import com.aliyun.risk20160713.models.*;
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

    public AddNameListResponse addNameListWithOptions(AddNameListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddNameListShrinkRequest request = new AddNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Applicant", request.applicant);
        query.put("BpmsUrl", request.bpmsUrl);
        query.put("DataType", request.dataType);
        query.put("DataValue", request.dataValue);
        query.put("Extend", request.extendShrink);
        query.put("Mark", request.mark);
        query.put("Operator", request.operator);
        query.put("Reason", request.reason);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNameListResponse());
    }

    public AddNameListResponse addNameList(AddNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addNameListWithOptions(request, runtime);
    }

    public DelNameListResponse delNameListWithOptions(DelNameListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DelNameListShrinkRequest request = new DelNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Applicant", request.applicant);
        query.put("BpmsUrl", request.bpmsUrl);
        query.put("DataType", request.dataType);
        query.put("DataValue", request.dataValue);
        query.put("Extend", request.extendShrink);
        query.put("Mark", request.mark);
        query.put("Operator", request.operator);
        query.put("Reason", request.reason);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelNameListResponse());
    }

    public DelNameListResponse delNameList(DelNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delNameListWithOptions(request, runtime);
    }

    public FindRiskResponse findRiskWithOptions(FindRiskRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FindRiskShrinkRequest request = new FindRiskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CodeType", request.codeType);
        query.put("Collina", request.collina);
        query.put("Email", request.email);
        query.put("Extend", request.extendShrink);
        query.put("IdType", request.idType);
        query.put("Ip", request.ip);
        query.put("MteeCode", request.mteeCode);
        query.put("Phone", request.phone);
        query.put("Umid", request.umid);
        query.put("UmidToken", request.umidToken);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindRisk"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindRiskResponse());
    }

    public FindRiskResponse findRisk(FindRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findRiskWithOptions(request, runtime);
    }

    public PushDataResponse pushDataWithOptions(PushDataRequest tmpReq, RuntimeOptions runtime) throws Exception {
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
        query.put("AliyunIdkp", request.aliyunIdkp);
        query.put("CodeType", request.codeType);
        query.put("Extend", request.extendShrink);
        query.put("HavanaId", request.havanaId);
        query.put("IdType", request.idType);
        query.put("MteeCode", request.mteeCode);
        query.put("Parameters", request.parametersShrink);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushData"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDataResponse());
    }

    public PushDataResponse pushData(PushDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushDataWithOptions(request, runtime);
    }

    public QueryHitUserResponse queryHitUserWithOptions(QueryHitUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndDate", request.endDate);
        query.put("IdType", request.idType);
        query.put("StartDate", request.startDate);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHitUser"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHitUserResponse());
    }

    public QueryHitUserResponse queryHitUser(QueryHitUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHitUserWithOptions(request, runtime);
    }

    public QueryNameListResponse queryNameListWithOptions(QueryNameListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryNameListShrinkRequest request = new QueryNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataType", request.dataType);
        query.put("DataValue", request.dataValue);
        query.put("Extend", request.extendShrink);
        query.put("QueryLike", request.queryLike);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNameListResponse());
    }

    public QueryNameListResponse queryNameList(QueryNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryNameListWithOptions(request, runtime);
    }

    public QueryNameListForLxResponse queryNameListForLxWithOptions(QueryNameListForLxRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryNameListForLxShrinkRequest request = new QueryNameListForLxShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataType", request.dataType);
        query.put("DataValue", request.dataValue);
        query.put("Extend", request.extendShrink);
        query.put("QueryLike", request.queryLike);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryNameListForLx"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryNameListForLxResponse());
    }

    public QueryNameListForLxResponse queryNameListForLx(QueryNameListForLxRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryNameListForLxWithOptions(request, runtime);
    }

    public SendVerifyCodeResponse sendVerifyCodeWithOptions(SendVerifyCodeRequest tmpReq, RuntimeOptions runtime) throws Exception {
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
        query.put("BizId", request.bizId);
        query.put("ChannelType", request.channelType);
        query.put("CodeType", request.codeType);
        query.put("EventId", request.eventId);
        query.put("Extend", request.extendShrink);
        query.put("IdType", request.idType);
        query.put("MessageParameters", request.messageParametersShrink);
        query.put("MessageReiver", request.messageReiver);
        query.put("MteeCode", request.mteeCode);
        query.put("RiskRequestId", request.riskRequestId);
        query.put("TimeInterval", request.timeInterval);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerifyCode"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerifyCodeResponse());
    }

    public SendVerifyCodeResponse sendVerifyCode(SendVerifyCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendVerifyCodeWithOptions(request, runtime);
    }

    public TunnelReceiveResponse tunnelReceiveWithOptions(TunnelReceiveRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TunnelReceiveShrinkRequest request = new TunnelReceiveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Apn", request.apn);
        query.put("Data", request.dataShrink);
        query.put("StartEndPoint", request.startEndPoint);
        query.put("StopEndPoint", request.stopEndPoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TunnelReceive"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TunnelReceiveResponse());
    }

    public TunnelReceiveResponse tunnelReceive(TunnelReceiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tunnelReceiveWithOptions(request, runtime);
    }

    public TunnelSendResponse tunnelSendWithOptions(TunnelSendRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TunnelSendShrinkRequest request = new TunnelSendShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.data)) {
            request.dataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.data, "Data", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Apn", request.apn);
        query.put("Data", request.dataShrink);
        query.put("StartEndPoint", request.startEndPoint);
        query.put("StopEndPoint", request.stopEndPoint);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TunnelSend"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTP"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TunnelSendResponse());
    }

    public TunnelSendResponse tunnelSend(TunnelSendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tunnelSendWithOptions(request, runtime);
    }

    public UpdateNameListResponse updateNameListWithOptions(UpdateNameListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNameListShrinkRequest request = new UpdateNameListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Applicant", request.applicant);
        query.put("BpmsUrl", request.bpmsUrl);
        query.put("DataType", request.dataType);
        query.put("DataValue", request.dataValue);
        query.put("Extend", request.extendShrink);
        query.put("Mark", request.mark);
        query.put("Operator", request.operator);
        query.put("Reason", request.reason);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNameList"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNameListResponse());
    }

    public UpdateNameListResponse updateNameList(UpdateNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNameListWithOptions(request, runtime);
    }

    public ValidateVerifyCodeResponse validateVerifyCodeWithOptions(ValidateVerifyCodeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidateVerifyCodeShrinkRequest request = new ValidateVerifyCodeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelType", request.channelType);
        query.put("CodeType", request.codeType);
        query.put("Collina", request.collina);
        query.put("Extend", request.extendShrink);
        query.put("IdType", request.idType);
        query.put("Ip", request.ip);
        query.put("MteeCode", request.mteeCode);
        query.put("RiskRequestId", request.riskRequestId);
        query.put("UmidToken", request.umidToken);
        query.put("UserId", request.userId);
        query.put("VerifyCode", request.verifyCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateVerifyCode"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateVerifyCodeResponse());
    }

    public ValidateVerifyCodeResponse validateVerifyCode(ValidateVerifyCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateVerifyCodeWithOptions(request, runtime);
    }

    public VerifyIvTokenResponse verifyIvTokenWithOptions(VerifyIvTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Ip", request.ip);
        query.put("IvToken", request.ivToken);
        query.put("MemberId", request.memberId);
        query.put("SceneCode", request.sceneCode);
        query.put("SessionId", request.sessionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyIvToken"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyIvTokenResponse());
    }

    public VerifyIvTokenResponse verifyIvToken(VerifyIvTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyIvTokenWithOptions(request, runtime);
    }

    public WriteUsscResponse writeUsscWithOptions(WriteUsscRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        WriteUsscShrinkRequest request = new WriteUsscShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extend)) {
            request.extendShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extend, "Extend", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppKey", request.appKey);
        query.put("ChannelType", request.channelType);
        query.put("CodeType", request.codeType);
        query.put("Collina", request.collina);
        query.put("Extend", request.extendShrink);
        query.put("IdType", request.idType);
        query.put("Ip", request.ip);
        query.put("MteeCode", request.mteeCode);
        query.put("Sign", request.sign);
        query.put("SignTime", request.signTime);
        query.put("UmidToken", request.umidToken);
        query.put("UserId", request.userId);
        query.put("VerifyResult", request.verifyResult);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WriteUssc"),
            new TeaPair("version", "2016-07-13"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WriteUsscResponse());
    }

    public WriteUsscResponse writeUssc(WriteUsscRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.writeUsscWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706;

import com.aliyun.tea.*;
import com.aliyun.support_plan20210706.models.*;
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
        this._endpoint = this.getEndpoint("support-plan", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CloseTaskOrderResponse closeTaskOrderWithOptions(CloseTaskOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTaskOrderResponse());
    }

    public CloseTaskOrderResponse closeTaskOrder(CloseTaskOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeTaskOrderWithOptions(request, runtime);
    }

    public CreateTaskOrderResponse createTaskOrderWithOptions(CreateTaskOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CustomerRealName", request.customerRealName);
        query.put("CustomerUserId", request.customerUserId);
        query.put("ImportantDescription", request.importantDescription);
        query.put("IsImportant", request.isImportant);
        query.put("OpenGroupId", request.openGroupId);
        query.put("ProductType", request.productType);
        query.put("ProductTypeName", request.productTypeName);
        query.put("TaskTitle", request.taskTitle);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskOrderResponse());
    }

    public CreateTaskOrderResponse createTaskOrder(CreateTaskOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskOrderWithOptions(request, runtime);
    }

    public CreateTaskOrderByEventReportResponse createTaskOrderByEventReportWithOptions(CreateTaskOrderByEventReportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTaskOrderByEventReportShrinkRequest request = new CreateTaskOrderByEventReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.eventBody))) {
            request.eventBodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.eventBody), "EventBody", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extinfo)) {
            request.extinfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extinfo, "Extinfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Business", request.business);
        query.put("CreateRealName", request.createRealName);
        query.put("CreateUserId", request.createUserId);
        query.put("EventBody", request.eventBodyShrink);
        query.put("Extinfo", request.extinfoShrink);
        query.put("ImportantDesc", request.importantDesc);
        query.put("JoinChildGroupUserIds", request.joinChildGroupUserIds);
        query.put("MonitorCongregation", request.monitorCongregation);
        query.put("OpenGroupId", request.openGroupId);
        query.put("ProductType", request.productType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskOrderByEventReport"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskOrderByEventReportResponse());
    }

    public CreateTaskOrderByEventReportResponse createTaskOrderByEventReport(CreateTaskOrderByEventReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskOrderByEventReportWithOptions(request, runtime);
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(DeleteEnterpriseDingtalkGroupCustomerMemberRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest request = new DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mobiles)) {
            request.mobilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mobiles, "Mobiles", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnterpriseDingtalkGroupCustomerMember"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnterpriseDingtalkGroupCustomerMemberResponse());
    }

    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMember(DeleteEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroupWithOptions(GetEnterpriseDingtalkGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterpriseDingtalkGroup"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseDingtalkGroupResponse());
    }

    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroup(GetEnterpriseDingtalkGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEnterpriseDingtalkGroupWithOptions(request, runtime);
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMemberWithOptions(GetEnterpriseDingtalkGroupCustomerMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnterpriseDingtalkGroupCustomerMember"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnterpriseDingtalkGroupCustomerMemberResponse());
    }

    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMember(GetEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembersWithOptions(ListEnterpriseDingtalkGroupCustomerMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseDingtalkGroupCustomerMembers"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseDingtalkGroupCustomerMembersResponse());
    }

    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnterpriseDingtalkGroupCustomerMembersWithOptions(request, runtime);
    }

    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroupsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseDingtalkGroups"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseDingtalkGroupsResponse());
    }

    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroups() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnterpriseDingtalkGroupsWithOptions(runtime);
    }

    public ListProductByGroupResponse listProductByGroupWithOptions(ListProductByGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OpenGroupId", request.openGroupId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductByGroup"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductByGroupResponse());
    }

    public ListProductByGroupResponse listProductByGroup(ListProductByGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductByGroupWithOptions(request, runtime);
    }

    public QueryTaskInfoResponse queryTaskInfoWithOptions(QueryTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskInfo"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskInfoResponse());
    }

    public QueryTaskInfoResponse queryTaskInfo(QueryTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskInfoWithOptions(request, runtime);
    }

    public ReplyMessageApiResponse replyMessageApiWithOptions(ReplyMessageApiRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MsgContent", request.msgContent);
        query.put("MsgType", request.msgType);
        query.put("OpenGroupId", request.openGroupId);
        query.put("OrderId", request.orderId);
        query.put("UserId", request.userId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplyMessageApi"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplyMessageApiResponse());
    }

    public ReplyMessageApiResponse replyMessageApi(ReplyMessageApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replyMessageApiWithOptions(request, runtime);
    }

    public RestOpenTaskOrderResponse restOpenTaskOrderWithOptions(RestOpenTaskOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OpenGroupId", request.openGroupId);
        query.put("OrderId", request.orderId);
        query.put("ResetContent", request.resetContent);
        query.put("ResetType", request.resetType);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestOpenTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestOpenTaskOrderResponse());
    }

    public RestOpenTaskOrderResponse restOpenTaskOrder(RestOpenTaskOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restOpenTaskOrderWithOptions(request, runtime);
    }
}

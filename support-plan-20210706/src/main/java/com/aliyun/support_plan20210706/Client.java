// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706;

import com.aliyun.tea.*;
import com.aliyun.support_plan20210706.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>关闭任务单</p>
     * 
     * @param request CloseTaskOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseTaskOrderResponse
     */
    public CloseTaskOrderResponse closeTaskOrderWithOptions(CloseTaskOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseTaskOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭任务单</p>
     * 
     * @param request CloseTaskOrderRequest
     * @return CloseTaskOrderResponse
     */
    public CloseTaskOrderResponse closeTaskOrder(CloseTaskOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeTaskOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工单</p>
     * 
     * @param request CreateTaskOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskOrderResponse
     */
    public CreateTaskOrderResponse createTaskOrderWithOptions(CreateTaskOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            query.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isUrgent)) {
            query.put("IsUrgent", request.isUrgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overview)) {
            query.put("Overview", request.overview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urgentDescription)) {
            query.put("UrgentDescription", request.urgentDescription);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工单</p>
     * 
     * @param request CreateTaskOrderRequest
     * @return CreateTaskOrderResponse
     */
    public CreateTaskOrderResponse createTaskOrder(CreateTaskOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>告警建单</p>
     * 
     * @param tmpReq CreateTaskOrderByEventReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskOrderByEventReportResponse
     */
    public CreateTaskOrderByEventReportResponse createTaskOrderByEventReportWithOptions(CreateTaskOrderByEventReportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTaskOrderByEventReportShrinkRequest request = new CreateTaskOrderByEventReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventBody)) {
            request.eventBodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventBody, "EventBody", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extinfo)) {
            request.extinfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extinfo, "Extinfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.business)) {
            query.put("Business", request.business);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createRealName)) {
            query.put("CreateRealName", request.createRealName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createUserId)) {
            query.put("CreateUserId", request.createUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventBodyShrink)) {
            query.put("EventBody", request.eventBodyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extinfoShrink)) {
            query.put("Extinfo", request.extinfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importantDesc)) {
            query.put("ImportantDesc", request.importantDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinChildGroupUserIds)) {
            query.put("JoinChildGroupUserIds", request.joinChildGroupUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorCongregation)) {
            query.put("MonitorCongregation", request.monitorCongregation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskOrderByEventReport"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskOrderByEventReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>告警建单</p>
     * 
     * @param request CreateTaskOrderByEventReportRequest
     * @return CreateTaskOrderByEventReportResponse
     */
    public CreateTaskOrderByEventReportResponse createTaskOrderByEventReport(CreateTaskOrderByEventReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskOrderByEventReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除企业钉群客户侧成员</p>
     * 
     * @param tmpReq DeleteEnterpriseDingtalkGroupCustomerMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnterpriseDingtalkGroupCustomerMemberResponse
     */
    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(DeleteEnterpriseDingtalkGroupCustomerMemberRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest request = new DeleteEnterpriseDingtalkGroupCustomerMemberShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mobiles)) {
            request.mobilesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mobiles, "Mobiles", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobilesShrink)) {
            body.put("Mobiles", request.mobilesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            body.put("OpenGroupId", request.openGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>删除企业钉群客户侧成员</p>
     * 
     * @param request DeleteEnterpriseDingtalkGroupCustomerMemberRequest
     * @return DeleteEnterpriseDingtalkGroupCustomerMemberResponse
     */
    public DeleteEnterpriseDingtalkGroupCustomerMemberResponse deleteEnterpriseDingtalkGroupCustomerMember(DeleteEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询企业钉群</p>
     * 
     * @param request GetEnterpriseDingtalkGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseDingtalkGroupResponse
     */
    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroupWithOptions(GetEnterpriseDingtalkGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            body.put("OpenGroupId", request.openGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>查询企业钉群</p>
     * 
     * @param request GetEnterpriseDingtalkGroupRequest
     * @return GetEnterpriseDingtalkGroupResponse
     */
    public GetEnterpriseDingtalkGroupResponse getEnterpriseDingtalkGroup(GetEnterpriseDingtalkGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEnterpriseDingtalkGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取企业钉群客户侧成员</p>
     * 
     * @param request GetEnterpriseDingtalkGroupCustomerMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEnterpriseDingtalkGroupCustomerMemberResponse
     */
    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMemberWithOptions(GetEnterpriseDingtalkGroupCustomerMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            body.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            body.put("OpenGroupId", request.openGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>获取企业钉群客户侧成员</p>
     * 
     * @param request GetEnterpriseDingtalkGroupCustomerMemberRequest
     * @return GetEnterpriseDingtalkGroupCustomerMemberResponse
     */
    public GetEnterpriseDingtalkGroupCustomerMemberResponse getEnterpriseDingtalkGroupCustomerMember(GetEnterpriseDingtalkGroupCustomerMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEnterpriseDingtalkGroupCustomerMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListDdTaskOrder</p>
     * 
     * @param request ListDdTaskOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDdTaskOrderResponse
     */
    public ListDdTaskOrderResponse listDdTaskOrderWithOptions(ListDdTaskOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createRealName)) {
            query.put("CreateRealName", request.createRealName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isUrgent)) {
            query.put("IsUrgent", request.isUrgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDdTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDdTaskOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListDdTaskOrder</p>
     * 
     * @param request ListDdTaskOrderRequest
     * @return ListDdTaskOrderResponse
     */
    public ListDdTaskOrderResponse listDdTaskOrder(ListDdTaskOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDdTaskOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取钉群中所有客户侧人员信息</p>
     * 
     * @param request ListEnterpriseDingtalkGroupCustomerMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseDingtalkGroupCustomerMembersResponse
     */
    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembersWithOptions(ListEnterpriseDingtalkGroupCustomerMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>获取钉群中所有客户侧人员信息</p>
     * 
     * @param request ListEnterpriseDingtalkGroupCustomerMembersRequest
     * @return ListEnterpriseDingtalkGroupCustomerMembersResponse
     */
    public ListEnterpriseDingtalkGroupCustomerMembersResponse listEnterpriseDingtalkGroupCustomerMembers(ListEnterpriseDingtalkGroupCustomerMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseDingtalkGroupCustomerMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有企业钉群成员</p>
     * 
     * @param request ListEnterpriseDingtalkGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnterpriseDingtalkGroupsResponse
     */
    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroupsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnterpriseDingtalkGroups"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseDingtalkGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询所有企业钉群成员</p>
     * @return ListEnterpriseDingtalkGroupsResponse
     */
    public ListEnterpriseDingtalkGroupsResponse listEnterpriseDingtalkGroups() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnterpriseDingtalkGroupsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取问题分类</p>
     * 
     * @param request ListProductByGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProductByGroupResponse
     */
    public ListProductByGroupResponse listProductByGroupWithOptions(ListProductByGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProductByGroup"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductByGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取问题分类</p>
     * 
     * @param request ListProductByGroupRequest
     * @return ListProductByGroupResponse
     */
    public ListProductByGroupResponse listProductByGroup(ListProductByGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProductByGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工单状态</p>
     * 
     * @param request QueryTaskInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTaskInfoResponse
     */
    public QueryTaskInfoResponse queryTaskInfoWithOptions(QueryTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskInfo"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工单状态</p>
     * 
     * @param request QueryTaskInfoRequest
     * @return QueryTaskInfoResponse
     */
    public QueryTaskInfoResponse queryTaskInfo(QueryTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTaskInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>客户回复消息</p>
     * 
     * @param request ReplyMessageApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplyMessageApiResponse
     */
    public ReplyMessageApiResponse replyMessageApiWithOptions(ReplyMessageApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msgContent)) {
            query.put("MsgContent", request.msgContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgType)) {
            query.put("MsgType", request.msgType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplyMessageApi"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplyMessageApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>客户回复消息</p>
     * 
     * @param request ReplyMessageApiRequest
     * @return ReplyMessageApiResponse
     */
    public ReplyMessageApiResponse replyMessageApi(ReplyMessageApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replyMessageApiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重开任务单(待客户确认状态)</p>
     * 
     * @param request RestOpenTaskOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestOpenTaskOrderResponse
     */
    public RestOpenTaskOrderResponse restOpenTaskOrderWithOptions(RestOpenTaskOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openGroupId)) {
            query.put("OpenGroupId", request.openGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetContent)) {
            query.put("ResetContent", request.resetContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resetType)) {
            query.put("ResetType", request.resetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestOpenTaskOrder"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestOpenTaskOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重开任务单(待客户确认状态)</p>
     * 
     * @param request RestOpenTaskOrderRequest
     * @return RestOpenTaskOrderResponse
     */
    public RestOpenTaskOrderResponse restOpenTaskOrder(RestOpenTaskOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restOpenTaskOrderWithOptions(request, runtime);
    }
}

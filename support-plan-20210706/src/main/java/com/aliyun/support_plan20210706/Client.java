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
     * <p>添加客户服务主群人员进子群</p>
     * 
     * @param request AddEnterpriseGroupMemberToTaskGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEnterpriseGroupMemberToTaskGroupResponse
     */
    public AddEnterpriseGroupMemberToTaskGroupResponse addEnterpriseGroupMemberToTaskGroupWithOptions(AddEnterpriseGroupMemberToTaskGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskOrderId)) {
            query.put("TaskOrderId", request.taskOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEnterpriseGroupMemberToTaskGroup"),
            new TeaPair("version", "2021-07-06"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AddEnterpriseGroupMemberToTaskGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AddEnterpriseGroupMemberToTaskGroupResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>添加客户服务主群人员进子群</p>
     * 
     * @param request AddEnterpriseGroupMemberToTaskGroupRequest
     * @return AddEnterpriseGroupMemberToTaskGroupResponse
     */
    public AddEnterpriseGroupMemberToTaskGroupResponse addEnterpriseGroupMemberToTaskGroup(AddEnterpriseGroupMemberToTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEnterpriseGroupMemberToTaskGroupWithOptions(request, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateTaskOrderResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDdTaskOrderResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDdTaskOrderResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseDingtalkGroupCustomerMembersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEnterpriseDingtalkGroupCustomerMembersResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnterpriseDingtalkGroupsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListEnterpriseDingtalkGroupsResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListProductByGroupResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListProductByGroupResponse());
        }

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
}

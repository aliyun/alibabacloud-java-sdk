// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101;

import com.aliyun.tea.*;
import com.aliyun.quickbi_public20220101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("quickbi-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.\n</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Add selected groups of people incrementally for a single row and column permission rule.</p>
     * 
     * @param request AddDataLevelPermissionRuleUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataLevelPermissionRuleUsersResponse
     */
    public AddDataLevelPermissionRuleUsersResponse addDataLevelPermissionRuleUsersWithOptions(AddDataLevelPermissionRuleUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addUserModel)) {
            query.put("AddUserModel", request.addUserModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataLevelPermissionRuleUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataLevelPermissionRuleUsersResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.\n</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Add selected groups of people incrementally for a single row and column permission rule.</p>
     * 
     * @param request AddDataLevelPermissionRuleUsersRequest
     * @return AddDataLevelPermissionRuleUsersResponse
     */
    public AddDataLevelPermissionRuleUsersResponse addDataLevelPermissionRuleUsers(AddDataLevelPermissionRuleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataLevelPermissionRuleUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>ROW_LEVEL</p>
     * 
     * <b>summary</b> : 
     * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
     * 
     * @param request AddDataLevelPermissionWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDataLevelPermissionWhiteListResponse
     */
    public AddDataLevelPermissionWhiteListResponse addDataLevelPermissionWhiteListWithOptions(AddDataLevelPermissionWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIds)) {
            query.put("TargetIds", request.targetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDataLevelPermissionWhiteList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDataLevelPermissionWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>ROW_LEVEL</p>
     * 
     * <b>summary</b> : 
     * <p>43342<em><strong>435,1553a</strong></em>*41231</p>
     * 
     * @param request AddDataLevelPermissionWhiteListRequest
     * @return AddDataLevelPermissionWhiteListResponse
     */
    public AddDataLevelPermissionWhiteListResponse addDataLevelPermissionWhiteList(AddDataLevelPermissionWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDataLevelPermissionWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add a sharing configuration for data works.</p>
     * 
     * @param request AddShareReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddShareReportResponse
     */
    public AddShareReportResponse addShareReportWithOptions(AddShareReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authPoint)) {
            query.put("AuthPoint", request.authPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireDate)) {
            query.put("ExpireDate", request.expireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareToId)) {
            query.put("ShareToId", request.shareToId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareToType)) {
            query.put("ShareToType", request.shareToType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddShareReport"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddShareReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add a sharing configuration for data works.</p>
     * 
     * @param request AddShareReportRequest
     * @return AddShareReportResponse
     */
    public AddShareReportResponse addShareReport(AddShareReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addShareReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request AddUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserResponse
     */
    public AddUserResponse addUserWithOptions(AddUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adminUser)) {
            query.put("AdminUser", request.adminUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authAdminUser)) {
            query.put("AuthAdminUser", request.authAdminUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            query.put("NickName", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            body.put("RoleIds", request.roleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUser"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request AddUserRequest
     * @return AddUserResponse
     */
    public AddUserResponse addUser(AddUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request AddUserGroupMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserGroupMemberResponse
     */
    public AddUserGroupMemberResponse addUserGroupMemberWithOptions(AddUserGroupMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserGroupMember"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request AddUserGroupMemberRequest
     * @return AddUserGroupMemberResponse
     */
    public AddUserGroupMemberResponse addUserGroupMember(AddUserGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserGroupMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add users to a specified user group at a time.</p>
     * 
     * @param request AddUserGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserGroupMembersResponse
     */
    public AddUserGroupMembersResponse addUserGroupMembersWithOptions(AddUserGroupMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserGroupMembers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserGroupMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add users to a specified user group at a time.</p>
     * 
     * @param request AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     */
    public AddUserGroupMembersResponse addUserGroupMembers(AddUserGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add the metadata of an organization member tag.</p>
     * 
     * @param request AddUserTagMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserTagMetaResponse
     */
    public AddUserTagMetaResponse addUserTagMetaWithOptions(AddUserTagMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagDescription)) {
            query.put("TagDescription", request.tagDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserTagMeta"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserTagMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add the metadata of an organization member tag.</p>
     * 
     * @param request AddUserTagMetaRequest
     * @return AddUserTagMetaResponse
     */
    public AddUserTagMetaResponse addUserTagMeta(AddUserTagMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserTagMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加成员到指定工作空间。</p>
     * 
     * @param request AddUserToWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToWorkspaceResponse
     */
    public AddUserToWorkspaceResponse addUserToWorkspaceWithOptions(AddUserToWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToWorkspace"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加成员到指定工作空间。</p>
     * 
     * @param request AddUserToWorkspaceRequest
     * @return AddUserToWorkspaceResponse
     */
    public AddUserToWorkspaceResponse addUserToWorkspace(AddUserToWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加成员到工作空间。</p>
     * 
     * @param request AddWorkspaceUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWorkspaceUsersResponse
     */
    public AddWorkspaceUsersResponse addWorkspaceUsersWithOptions(AddWorkspaceUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWorkspaceUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWorkspaceUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加成员到工作空间。</p>
     * 
     * @param request AddWorkspaceUsersRequest
     * @return AddWorkspaceUsersResponse
     */
    public AddWorkspaceUsersResponse addWorkspaceUsers(AddWorkspaceUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWorkspaceUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发数据集抽取加速。</p>
     * 
     * @param request AllotDatasetAccelerationTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllotDatasetAccelerationTaskResponse
     */
    public AllotDatasetAccelerationTaskResponse allotDatasetAccelerationTaskWithOptions(AllotDatasetAccelerationTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllotDatasetAccelerationTask"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllotDatasetAccelerationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>触发数据集抽取加速。</p>
     * 
     * @param request AllotDatasetAccelerationTaskRequest
     * @return AllotDatasetAccelerationTaskResponse
     */
    public AllotDatasetAccelerationTaskResponse allotDatasetAccelerationTask(AllotDatasetAccelerationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allotDatasetAccelerationTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch authorization of BI portal menu will be skipped automatically.</p>
     * 
     * @param request AuthorizeMenuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeMenuResponse
     */
    public AuthorizeMenuResponse authorizeMenuWithOptions(AuthorizeMenuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authPointsValue)) {
            query.put("AuthPointsValue", request.authPointsValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataPortalId)) {
            query.put("DataPortalId", request.dataPortalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.menuIds)) {
            query.put("MenuIds", request.menuIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeMenu"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeMenuResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch authorization of BI portal menu will be skipped automatically.</p>
     * 
     * @param request AuthorizeMenuRequest
     * @return AuthorizeMenuResponse
     */
    public AuthorizeMenuResponse authorizeMenu(AuthorizeMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeMenuWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加飞书用户。</p>
     * 
     * @param request BatchAddFeishuUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAddFeishuUsersResponse
     */
    public BatchAddFeishuUsersResponse batchAddFeishuUsersWithOptions(BatchAddFeishuUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.feishuUsers)) {
            query.put("FeishuUsers", request.feishuUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAdmin)) {
            query.put("IsAdmin", request.isAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAuthAdmin)) {
            query.put("IsAuthAdmin", request.isAuthAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddFeishuUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddFeishuUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量添加飞书用户。</p>
     * 
     * @param request BatchAddFeishuUsersRequest
     * @return BatchAddFeishuUsersResponse
     */
    public BatchAddFeishuUsersResponse batchAddFeishuUsers(BatchAddFeishuUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddFeishuUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据门户菜单ID，取消指定用户、用户组的授权记录。</p>
     * 
     * @param request CancelAuthorizationMenuRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAuthorizationMenuResponse
     */
    public CancelAuthorizationMenuResponse cancelAuthorizationMenuWithOptions(CancelAuthorizationMenuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPortalId)) {
            query.put("DataPortalId", request.dataPortalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.menuIds)) {
            query.put("MenuIds", request.menuIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAuthorizationMenu"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelAuthorizationMenuResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据门户菜单ID，取消指定用户、用户组的授权记录。</p>
     * 
     * @param request CancelAuthorizationMenuRequest
     * @return CancelAuthorizationMenuResponse
     */
    public CancelAuthorizationMenuResponse cancelAuthorizationMenu(CancelAuthorizationMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelAuthorizationMenuWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the data works from the user\&quot;s collection.</p>
     * 
     * @param request CancelCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCollectionResponse
     */
    public CancelCollectionResponse cancelCollectionWithOptions(CancelCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCollection"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the data works from the user\&quot;s collection.</p>
     * 
     * @param request CancelCollectionRequest
     * @return CancelCollectionResponse
     */
    public CancelCollectionResponse cancelCollection(CancelCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a share authorization for a data work.</p>
     * 
     * @param request CancelReportShareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelReportShareResponse
     */
    public CancelReportShareResponse cancelReportShareWithOptions(CancelReportShareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareToIds)) {
            query.put("ShareToIds", request.shareToIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareToType)) {
            query.put("ShareToType", request.shareToType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelReportShare"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelReportShareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a share authorization for a data work.</p>
     * 
     * @param request CancelReportShareRequest
     * @return CancelReportShareResponse
     */
    public CancelReportShareResponse cancelReportShare(CancelReportShareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelReportShareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request ChangeVisibilityModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeVisibilityModelResponse
     */
    public ChangeVisibilityModelResponse changeVisibilityModelWithOptions(ChangeVisibilityModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPortalId)) {
            query.put("DataPortalId", request.dataPortalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.menuIds)) {
            query.put("MenuIds", request.menuIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showOnlyWithAccess)) {
            query.put("ShowOnlyWithAccess", request.showOnlyWithAccess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeVisibilityModel"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeVisibilityModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request ChangeVisibilityModelRequest
     * @return ChangeVisibilityModelResponse
     */
    public ChangeVisibilityModelResponse changeVisibilityModel(ChangeVisibilityModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeVisibilityModelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a user has permissions to view data works, such as dashboards and workbooks.</p>
     * 
     * @param request CheckReadableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckReadableResponse
     */
    public CheckReadableResponse checkReadableWithOptions(CheckReadableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckReadable"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckReadableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a user has permissions to view data works, such as dashboards and workbooks.</p>
     * 
     * @param request CheckReadableRequest
     * @return CheckReadableResponse
     */
    public CheckReadableResponse checkReadable(CheckReadableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkReadableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成三方嵌入的ticket。</p>
     * 
     * @param request CreateTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmptId)) {
            query.put("CmptId", request.cmptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalParam)) {
            query.put("GlobalParam", request.globalParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNum)) {
            query.put("TicketNum", request.ticketNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarkParam)) {
            query.put("WatermarkParam", request.watermarkParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成三方嵌入的ticket。</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成智能小Q嵌入ticket。</p>
     * 
     * @param request CreateTicket4CopilotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicket4CopilotResponse
     */
    public CreateTicket4CopilotResponse createTicket4CopilotWithOptions(CreateTicket4CopilotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.copilotId)) {
            query.put("CopilotId", request.copilotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNum)) {
            query.put("TicketNum", request.ticketNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket4Copilot"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicket4CopilotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成智能小Q嵌入ticket。</p>
     * 
     * @param request CreateTicket4CopilotRequest
     * @return CreateTicket4CopilotResponse
     */
    public CreateTicket4CopilotResponse createTicket4Copilot(CreateTicket4CopilotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTicket4CopilotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a user group. You can specify a parent user group.</p>
     * 
     * @param request CreateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroupWithOptions(CreateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentUserGroupId)) {
            query.put("ParentUserGroupId", request.parentUserGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupDescription)) {
            query.put("UserGroupDescription", request.userGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a user group. You can specify a parent user group.</p>
     * 
     * @param request CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    public CreateUserGroupResponse createUserGroup(CreateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询引用指定数据集下的作品信息。</p>
     * 
     * @param request DataSetBloodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DataSetBloodResponse
     */
    public DataSetBloodResponse dataSetBloodWithOptions(DataSetBloodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSetIds)) {
            query.put("DataSetIds", request.dataSetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksType)) {
            query.put("WorksType", request.worksType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DataSetBlood"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DataSetBloodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询引用指定数据集下的作品信息。</p>
     * 
     * @param request DataSetBloodRequest
     * @return DataSetBloodResponse
     */
    public DataSetBloodResponse dataSetBlood(DataSetBloodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dataSetBloodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询引用指定数据源下的数据集信息。</p>
     * 
     * @param request DataSourceBloodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DataSourceBloodResponse
     */
    public DataSourceBloodResponse dataSourceBloodWithOptions(DataSourceBloodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DataSourceBlood"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DataSourceBloodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询引用指定数据源下的数据集信息。</p>
     * 
     * @param request DataSourceBloodRequest
     * @return DataSourceBloodResponse
     */
    public DataSourceBloodResponse dataSourceBlood(DataSourceBloodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dataSourceBloodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the expiration time of the ticket embedded in the report.</p>
     * 
     * @param request DelayTicketExpireTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelayTicketExpireTimeResponse
     */
    public DelayTicketExpireTimeResponse delayTicketExpireTimeWithOptions(DelayTicketExpireTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelayTicketExpireTime"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelayTicketExpireTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the expiration time of the ticket embedded in the report.</p>
     * 
     * @param request DelayTicketExpireTimeRequest
     * @return DelayTicketExpireTimeResponse
     */
    public DelayTicketExpireTimeResponse delayTicketExpireTime(DelayTicketExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delayTicketExpireTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;delModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
     * 
     * <b>summary</b> : 
     * <p>{ &quot;ruleId&quot;: &quot;a5bb24da- ***-a891683e14da&quot;, // The ID of the row-column permission rule. &quot;cubeId&quot;: &quot;7c7223ae- ***-3c744528014b&quot;, // The ID of the dataset. &quot;delModel&quot;: { &quot;userGroups&quot;: [ &quot;0d5fb19b- <em><strong>-1248 fc27ca51&quot;, // Delete the user group ID of the user group. &quot;3d2c23d4-</strong></em>-f6390f325c2d&quot; ], &quot;users&quot;: [ &quot;4334 <em><strong>358&quot;, // Delete the UserID of the user group. &quot;Huang</strong></em>3fa822&quot; ] } }</p>
     * 
     * @param request DeleteDataLevelPermissionRuleUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLevelPermissionRuleUsersResponse
     */
    public DeleteDataLevelPermissionRuleUsersResponse deleteDataLevelPermissionRuleUsersWithOptions(DeleteDataLevelPermissionRuleUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteUserModel)) {
            query.put("DeleteUserModel", request.deleteUserModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLevelPermissionRuleUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLevelPermissionRuleUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>{&quot;ruleId&quot;:&quot;a5bb24da-<em><strong>-a891683e14da&quot;,&quot;cubeId&quot;:&quot;7c7223ae-</strong></em>-3c744528014b&quot;,&quot;delModel&quot;:{&quot;userGroups&quot;:[&quot;0d5fb19b-<em><strong>-1248fc27ca51&quot;,&quot;3d2c23d4-</strong></em>-f6390f325c2d&quot;],&quot;users&quot;:[&quot;4334<em><strong>358&quot;,&quot;Huang</strong></em>3fa822&quot;]}}</p>
     * 
     * <b>summary</b> : 
     * <p>{ &quot;ruleId&quot;: &quot;a5bb24da- ***-a891683e14da&quot;, // The ID of the row-column permission rule. &quot;cubeId&quot;: &quot;7c7223ae- ***-3c744528014b&quot;, // The ID of the dataset. &quot;delModel&quot;: { &quot;userGroups&quot;: [ &quot;0d5fb19b- <em><strong>-1248 fc27ca51&quot;, // Delete the user group ID of the user group. &quot;3d2c23d4-</strong></em>-f6390f325c2d&quot; ], &quot;users&quot;: [ &quot;4334 <em><strong>358&quot;, // Delete the UserID of the user group. &quot;Huang</strong></em>3fa822&quot; ] } }</p>
     * 
     * @param request DeleteDataLevelPermissionRuleUsersRequest
     * @return DeleteDataLevelPermissionRuleUsersResponse
     */
    public DeleteDataLevelPermissionRuleUsersResponse deleteDataLevelPermissionRuleUsers(DeleteDataLevelPermissionRuleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLevelPermissionRuleUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteDataLevelRuleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLevelRuleConfigResponse
     */
    public DeleteDataLevelRuleConfigResponse deleteDataLevelRuleConfigWithOptions(DeleteDataLevelRuleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLevelRuleConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLevelRuleConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ID of the training dataset that you want to remove from the specified custom linguistic model.</p>
     * 
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request DeleteDataLevelRuleConfigRequest
     * @return DeleteDataLevelRuleConfigResponse
     */
    public DeleteDataLevelRuleConfigResponse deleteDataLevelRuleConfig(DeleteDataLevelRuleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLevelRuleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request DeleteTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTicketResponse
     */
    public DeleteTicketResponse deleteTicketWithOptions(DeleteTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTicket"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request DeleteTicketRequest
     * @return DeleteTicketResponse
     */
    public DeleteTicketResponse deleteTicket(DeleteTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.transferUserId)) {
            query.put("TransferUserId", request.transferUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定工作空间的成员。</p>
     * 
     * @param request DeleteUserFromWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserFromWorkspaceResponse
     */
    public DeleteUserFromWorkspaceResponse deleteUserFromWorkspaceWithOptions(DeleteUserFromWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserFromWorkspace"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserFromWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定工作空间的成员。</p>
     * 
     * @param request DeleteUserFromWorkspaceRequest
     * @return DeleteUserFromWorkspaceResponse
     */
    public DeleteUserFromWorkspaceResponse deleteUserFromWorkspace(DeleteUserFromWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserFromWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user group in an organization.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroupWithOptions(DeleteUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user group in an organization.</p>
     * 
     * @param request DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    public DeleteUserGroupResponse deleteUserGroup(DeleteUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified member from a specified user group.</p>
     * 
     * @param request DeleteUserGroupMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupMemberResponse
     */
    public DeleteUserGroupMemberResponse deleteUserGroupMemberWithOptions(DeleteUserGroupMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroupMember"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified member from a specified user group.</p>
     * 
     * @param request DeleteUserGroupMemberRequest
     * @return DeleteUserGroupMemberResponse
     */
    public DeleteUserGroupMemberResponse deleteUserGroupMember(DeleteUserGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * @param request DeleteUserGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserGroupMembersResponse
     */
    public DeleteUserGroupMembersResponse deleteUserGroupMembersWithOptions(DeleteUserGroupMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserGroupMembers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserGroupMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * @param request DeleteUserGroupMembersRequest
     * @return DeleteUserGroupMembersResponse
     */
    public DeleteUserGroupMembersResponse deleteUserGroupMembers(DeleteUserGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the tag metadata of an organization member.</p>
     * 
     * @param request DeleteUserTagMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserTagMetaResponse
     */
    public DeleteUserTagMetaResponse deleteUserTagMetaWithOptions(DeleteUserTagMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserTagMeta"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserTagMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the tag metadata of an organization member.</p>
     * 
     * @param request DeleteUserTagMetaRequest
     * @return DeleteUserTagMetaResponse
     */
    public DeleteUserTagMetaResponse deleteUserTagMeta(DeleteUserTagMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserTagMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源信息</p>
     * 
     * @param request GetDataSourceConnectionInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataSourceConnectionInfoResponse
     */
    public GetDataSourceConnectionInfoResponse getDataSourceConnectionInfoWithOptions(GetDataSourceConnectionInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dsId)) {
            query.put("DsId", request.dsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSourceConnectionInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceConnectionInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据源信息</p>
     * 
     * @param request GetDataSourceConnectionInfoRequest
     * @return GetDataSourceConnectionInfoResponse
     */
    public GetDataSourceConnectionInfoResponse getDataSourceConnectionInfo(GetDataSourceConnectionInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataSourceConnectionInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>组织内查看邮件任务运行状态</p>
     * 
     * @param request GetMailTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMailTaskStatusResponse
     */
    public GetMailTaskStatusResponse getMailTaskStatusWithOptions(GetMailTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailId)) {
            query.put("MailId", request.mailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMailTaskStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMailTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>组织内查看邮件任务运行状态</p>
     * 
     * @param request GetMailTaskStatusRequest
     * @return GetMailTaskStatusResponse
     */
    public GetMailTaskStatusResponse getMailTaskStatus(GetMailTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMailTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Test description</p>
     * 
     * @param request GetUserGroupInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserGroupInfoResponse
     */
    public GetUserGroupInfoResponse getUserGroupInfoWithOptions(GetUserGroupInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserGroupInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserGroupInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Test description</p>
     * 
     * @param request GetUserGroupInfoRequest
     * @return GetUserGroupInfoResponse
     */
    public GetUserGroupInfoResponse getUserGroupInfo(GetUserGroupInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserGroupInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询已嵌入报表列表</p>
     * 
     * @param request GetWorksEmbedListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorksEmbedListResponse
     */
    public GetWorksEmbedListResponse getWorksEmbedListWithOptions(GetWorksEmbedListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksType)) {
            query.put("WorksType", request.worksType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wsId)) {
            query.put("WsId", request.wsId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorksEmbedList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorksEmbedListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已嵌入报表列表</p>
     * 
     * @param request GetWorksEmbedListRequest
     * @return GetWorksEmbedListResponse
     */
    public GetWorksEmbedListResponse getWorksEmbedList(GetWorksEmbedListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorksEmbedListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询API数据源列表。</p>
     * 
     * @param request ListApiDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiDatasourceResponse
     */
    public ListApiDatasourceResponse listApiDatasourceWithOptions(ListApiDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiDatasource"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询API数据源列表。</p>
     * 
     * @param request ListApiDatasourceRequest
     * @return ListApiDatasourceResponse
     */
    public ListApiDatasourceResponse listApiDatasource(ListApiDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user group information at a time by user group ID.</p>
     * 
     * @param request ListByUserGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListByUserGroupIdResponse
     */
    public ListByUserGroupIdResponse listByUserGroupIdWithOptions(ListByUserGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            query.put("UserGroupIds", request.userGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListByUserGroupId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListByUserGroupIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user group information at a time by user group ID.</p>
     * 
     * @param request ListByUserGroupIdRequest
     * @return ListByUserGroupIdResponse
     */
    public ListByUserGroupIdResponse listByUserGroupId(ListByUserGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listByUserGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the work.</p>
     * 
     * @param request ListCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollectionsWithOptions(ListCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCollections"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the work.</p>
     * 
     * @param request ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollections(ListCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can this operation to obtain a list of row and column permission configurations for a specified dataset.</p>
     * 
     * @param request ListCubeDataLevelPermissionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCubeDataLevelPermissionConfigResponse
     */
    public ListCubeDataLevelPermissionConfigResponse listCubeDataLevelPermissionConfigWithOptions(ListCubeDataLevelPermissionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCubeDataLevelPermissionConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCubeDataLevelPermissionConfigResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can this operation to obtain a list of row and column permission configurations for a specified dataset.</p>
     * 
     * @param request ListCubeDataLevelPermissionConfigRequest
     * @return ListCubeDataLevelPermissionConfigResponse
     */
    public ListCubeDataLevelPermissionConfigResponse listCubeDataLevelPermissionConfig(ListCubeDataLevelPermissionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCubeDataLevelPermissionConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据行列权限种类，获取数据集行列权限的白名单列表。</p>
     * 
     * @param request ListDataLevelPermissionWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataLevelPermissionWhiteListResponse
     */
    public ListDataLevelPermissionWhiteListResponse listDataLevelPermissionWhiteListWithOptions(ListDataLevelPermissionWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataLevelPermissionWhiteList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataLevelPermissionWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据行列权限种类，获取数据集行列权限的白名单列表。</p>
     * 
     * @param request ListDataLevelPermissionWhiteListRequest
     * @return ListDataLevelPermissionWhiteListResponse
     */
    public ListDataLevelPermissionWhiteListResponse listDataLevelPermissionWhiteList(ListDataLevelPermissionWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataLevelPermissionWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定空间下的所有数据源</p>
     * 
     * @param request ListDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSourceWithOptions(ListDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            query.put("DsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSource"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定空间下的所有数据源</p>
     * 
     * @param request ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSource(ListDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定用户在首页看板中展示的收藏作品列表。</p>
     * 
     * @param request ListFavoriteReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFavoriteReportsResponse
     */
    public ListFavoriteReportsResponse listFavoriteReportsWithOptions(ListFavoriteReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.treeType)) {
            query.put("TreeType", request.treeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFavoriteReports"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFavoriteReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定用户在首页看板中展示的收藏作品列表。</p>
     * 
     * @param request ListFavoriteReportsRequest
     * @return ListFavoriteReportsResponse
     */
    public ListFavoriteReportsResponse listFavoriteReports(ListFavoriteReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFavoriteReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定组织角色下的用户列表。</p>
     * 
     * @param request ListOrganizationRoleUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationRoleUsersResponse
     */
    public ListOrganizationRoleUsersResponse listOrganizationRoleUsersWithOptions(ListOrganizationRoleUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationRoleUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定组织角色下的用户列表。</p>
     * 
     * @param request ListOrganizationRoleUsersRequest
     * @return ListOrganizationRoleUsersResponse
     */
    public ListOrganizationRoleUsersResponse listOrganizationRoleUsers(ListOrganizationRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationRoleUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取组织级别自定义角色列表。</p>
     * 
     * @param request ListOrganizationRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationRolesResponse
     */
    public ListOrganizationRolesResponse listOrganizationRolesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationRoles"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取组织级别自定义角色列表。</p>
     * @return ListOrganizationRolesResponse
     */
    public ListOrganizationRolesResponse listOrganizationRoles() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationRolesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list of authorization details for a BI portal menu.</p>
     * 
     * @param request ListPortalMenuAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPortalMenuAuthorizationResponse
     */
    public ListPortalMenuAuthorizationResponse listPortalMenuAuthorizationWithOptions(ListPortalMenuAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPortalId)) {
            query.put("DataPortalId", request.dataPortalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPortalMenuAuthorization"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPortalMenuAuthorizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the list of authorization details for a BI portal menu.</p>
     * 
     * @param request ListPortalMenuAuthorizationRequest
     * @return ListPortalMenuAuthorizationResponse
     */
    public ListPortalMenuAuthorizationResponse listPortalMenuAuthorization(ListPortalMenuAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPortalMenuAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a hierarchical list of menus under a specific BI portal.</p>
     * 
     * @param request ListPortalMenusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPortalMenusResponse
     */
    public ListPortalMenusResponse listPortalMenusWithOptions(ListPortalMenusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataPortalId)) {
            query.put("DataPortalId", request.dataPortalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPortalMenus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPortalMenusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets a hierarchical list of menus under a specific BI portal.</p>
     * 
     * @param request ListPortalMenusRequest
     * @return ListPortalMenusResponse
     */
    public ListPortalMenusResponse listPortalMenus(ListPortalMenusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPortalMenusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取首页看板常看和足迹列表。</p>
     * 
     * @param request ListRecentViewReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecentViewReportsResponse
     */
    public ListRecentViewReportsResponse listRecentViewReportsWithOptions(ListRecentViewReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offsetDay)) {
            query.put("OffsetDay", request.offsetDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            query.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.treeType)) {
            query.put("TreeType", request.treeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecentViewReports"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecentViewReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取首页看板常看和足迹列表。</p>
     * 
     * @param request ListRecentViewReportsRequest
     * @return ListRecentViewReportsResponse
     */
    public ListRecentViewReportsResponse listRecentViewReports(ListRecentViewReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecentViewReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定用户在首页看板中展示的被授权的作品列表。</p>
     * 
     * @param request ListSharedReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSharedReportsResponse
     */
    public ListSharedReportsResponse listSharedReportsWithOptions(ListSharedReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.treeType)) {
            query.put("TreeType", request.treeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSharedReports"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSharedReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定用户在首页看板中展示的被授权的作品列表。</p>
     * 
     * @param request ListSharedReportsRequest
     * @return ListSharedReportsResponse
     */
    public ListSharedReportsResponse listSharedReports(ListSharedReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Description</p>
     * 
     * @param request ListUserGroupsByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserGroupsByUserIdResponse
     */
    public ListUserGroupsByUserIdResponse listUserGroupsByUserIdWithOptions(ListUserGroupsByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGroupsByUserId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGroupsByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Description</p>
     * 
     * @param request ListUserGroupsByUserIdRequest
     * @return ListUserGroupsByUserIdResponse
     */
    public ListUserGroupsByUserIdResponse listUserGroupsByUserId(ListUserGroupsByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserGroupsByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定空间角色下的用户列表。</p>
     * 
     * @param request ListWorkspaceRoleUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspaceRoleUsersResponse
     */
    public ListWorkspaceRoleUsersResponse listWorkspaceRoleUsersWithOptions(ListWorkspaceRoleUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaceRoleUsers"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定空间角色下的用户列表。</p>
     * 
     * @param request ListWorkspaceRoleUsersRequest
     * @return ListWorkspaceRoleUsersResponse
     */
    public ListWorkspaceRoleUsersResponse listWorkspaceRoleUsers(ListWorkspaceRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkspaceRoleUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间角色列表。</p>
     * 
     * @param request ListWorkspaceRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspaceRolesResponse
     */
    public ListWorkspaceRolesResponse listWorkspaceRolesWithOptions(ListWorkspaceRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaceRoles"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspaceRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取空间角色列表。</p>
     * 
     * @param request ListWorkspaceRolesRequest
     * @return ListWorkspaceRolesResponse
     */
    public ListWorkspaceRolesResponse listWorkspaceRoles(ListWorkspaceRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkspaceRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>手动执行邮件任务</p>
     * 
     * @param request ManualRunMailTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManualRunMailTaskResponse
     */
    public ManualRunMailTaskResponse manualRunMailTaskWithOptions(ManualRunMailTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailId)) {
            query.put("MailId", request.mailId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManualRunMailTask"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualRunMailTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>手动执行邮件任务</p>
     * 
     * @param request ManualRunMailTaskRequest
     * @return ManualRunMailTaskResponse
     */
    public ManualRunMailTaskResponse manualRunMailTask(ManualRunMailTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualRunMailTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定API数据源参数值。</p>
     * 
     * @param request ModifyApiDatasourceParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApiDatasourceParametersResponse
     */
    public ModifyApiDatasourceParametersResponse modifyApiDatasourceParametersWithOptions(ModifyApiDatasourceParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApiDatasourceParameters"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApiDatasourceParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改指定API数据源参数值。</p>
     * 
     * @param request ModifyApiDatasourceParametersRequest
     * @return ModifyApiDatasourceParametersResponse
     */
    public ModifyApiDatasourceParametersResponse modifyApiDatasourceParameters(ModifyApiDatasourceParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApiDatasourceParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改智能问数嵌入配置。</p>
     * 
     * @param request ModifyCopilotEmbedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCopilotEmbedConfigResponse
     */
    public ModifyCopilotEmbedConfigResponse modifyCopilotEmbedConfigWithOptions(ModifyCopilotEmbedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.copilotId)) {
            query.put("CopilotId", request.copilotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataRange)) {
            query.put("DataRange", request.dataRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCopilotEmbedConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCopilotEmbedConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改智能问数嵌入配置。</p>
     * 
     * @param request ModifyCopilotEmbedConfigRequest
     * @return ModifyCopilotEmbedConfigResponse
     */
    public ModifyCopilotEmbedConfigResponse modifyCopilotEmbedConfig(ModifyCopilotEmbedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCopilotEmbedConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据审批人获取相应的审批流信息。</p>
     * 
     * @param request QueryApprovalInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryApprovalInfoResponse
     */
    public QueryApprovalInfoResponse queryApprovalInfoWithOptions(QueryApprovalInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryApprovalInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryApprovalInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据审批人获取相应的审批流信息。</p>
     * 
     * @param request QueryApprovalInfoRequest
     * @return QueryApprovalInfoResponse
     */
    public QueryApprovalInfoResponse queryApprovalInfo(QueryApprovalInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryApprovalInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询审计日志信息。</p>
     * 
     * @param request QueryAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuditLogResponse
     */
    public QueryAuditLogResponse queryAuditLogWithOptions(QueryAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorId)) {
            query.put("OperatorId", request.operatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorTypes)) {
            query.put("OperatorTypes", request.operatorTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuditLog"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuditLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询审计日志信息。</p>
     * 
     * @param request QueryAuditLogRequest
     * @return QueryAuditLogResponse
     */
    public QueryAuditLogResponse queryAuditLog(QueryAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuditLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件性能列表。</p>
     * 
     * @param request QueryComponentPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryComponentPerformanceResponse
     */
    public QueryComponentPerformanceResponse queryComponentPerformanceWithOptions(QueryComponentPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costTimeAvgMin)) {
            query.put("CostTimeAvgMin", request.costTimeAvgMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryComponentPerformance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryComponentPerformanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组件性能列表。</p>
     * 
     * @param request QueryComponentPerformanceRequest
     * @return QueryComponentPerformanceResponse
     */
    public QueryComponentPerformanceResponse queryComponentPerformance(QueryComponentPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryComponentPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取开通小Q嵌入的配置列表。</p>
     * 
     * @param request QueryCopilotEmbedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCopilotEmbedConfigResponse
     */
    public QueryCopilotEmbedConfigResponse queryCopilotEmbedConfigWithOptions(QueryCopilotEmbedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCopilotEmbedConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCopilotEmbedConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取开通小Q嵌入的配置列表。</p>
     * 
     * @param request QueryCopilotEmbedConfigRequest
     * @return QueryCopilotEmbedConfigResponse
     */
    public QueryCopilotEmbedConfigResponse queryCopilotEmbedConfig(QueryCopilotEmbedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCopilotEmbedConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据集优化建议。</p>
     * 
     * @param request QueryCubeOptimizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCubeOptimizationResponse
     */
    public QueryCubeOptimizationResponse queryCubeOptimizationWithOptions(QueryCubeOptimizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCubeOptimization"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCubeOptimizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据集优化建议。</p>
     * 
     * @param request QueryCubeOptimizationRequest
     * @return QueryCubeOptimizationResponse
     */
    public QueryCubeOptimizationResponse queryCubeOptimization(QueryCubeOptimizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCubeOptimizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据集性能。</p>
     * 
     * @param request QueryCubePerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCubePerformanceResponse
     */
    public QueryCubePerformanceResponse queryCubePerformanceWithOptions(QueryCubePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costTimeAvgMin)) {
            query.put("CostTimeAvgMin", request.costTimeAvgMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCubePerformance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCubePerformanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据集性能。</p>
     * 
     * @param request QueryCubePerformanceRequest
     * @return QueryCubePerformanceResponse
     */
    public QueryCubePerformanceResponse queryCubePerformance(QueryCubePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCubePerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用开放数据服务API。</p>
     * 
     * @param request QueryDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataResponse
     */
    public QueryDataResponse queryDataWithOptions(QueryDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            query.put("Conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFields)) {
            query.put("ReturnFields", request.returnFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryData"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用开放数据服务API。</p>
     * 
     * @param request QueryDataRequest
     * @return QueryDataResponse
     */
    public QueryDataResponse queryData(QueryDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据范围目录列表。</p>
     * 
     * @param request QueryDataRangeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataRangeResponse
     */
    public QueryDataRangeResponse queryDataRangeWithOptions(QueryDataRangeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataRange"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataRangeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据范围目录列表。</p>
     * 
     * @param request QueryDataRangeRequest
     * @return QueryDataRangeResponse
     */
    public QueryDataRangeResponse queryDataRange(QueryDataRangeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDataRangeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>f4cc43bc3***</p>
     * 
     * <b>summary</b> : 
     * <p>The operator for the aggregate operation. Metric fields are available, such as SUM, AVG, and MAX.</p>
     * 
     * @param request QueryDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataServiceResponse
     */
    public QueryDataServiceResponse queryDataServiceWithOptions(QueryDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiId)) {
            query.put("ApiId", request.apiId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            query.put("Conditions", request.conditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnFields)) {
            query.put("ReturnFields", request.returnFields);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataService"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>f4cc43bc3***</p>
     * 
     * <b>summary</b> : 
     * <p>The operator for the aggregate operation. Metric fields are available, such as SUM, AVG, and MAX.</p>
     * 
     * @param request QueryDataServiceRequest
     * @return QueryDataServiceResponse
     */
    public QueryDataServiceResponse queryDataService(QueryDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务API列表。</p>
     * 
     * @param request QueryDataServiceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataServiceListResponse
     */
    public QueryDataServiceListResponse queryDataServiceListWithOptions(QueryDataServiceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataServiceList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataServiceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据服务API列表。</p>
     * 
     * @param request QueryDataServiceListRequest
     * @return QueryDataServiceListResponse
     */
    public QueryDataServiceListResponse queryDataServiceList(QueryDataServiceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDataServiceListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The data source, directory, and dataset model (including dimensions, measures, physical fields, custom SQL text, and association relationships).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified dataset, including the data source, directory, and dataset model.</p>
     * 
     * @param request QueryDatasetDetailInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDatasetDetailInfoResponse
     */
    public QueryDatasetDetailInfoResponse queryDatasetDetailInfoWithOptions(QueryDatasetDetailInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetDetailInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetDetailInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>The data source, directory, and dataset model (including dimensions, measures, physical fields, custom SQL text, and association relationships).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified dataset, including the data source, directory, and dataset model.</p>
     * 
     * @param request QueryDatasetDetailInfoRequest
     * @return QueryDatasetDetailInfoResponse
     */
    public QueryDatasetDetailInfoResponse queryDatasetDetailInfo(QueryDatasetDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetDetailInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the table is a custom SQL table. Valid values:</p>
     * <ul>
     * <li>true: custom SQL table</li>
     * <li>false: non-custom SQL table</li>
     * </ul>
     * 
     * @param request QueryDatasetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDatasetInfoResponse
     */
    public QueryDatasetInfoResponse queryDatasetInfoWithOptions(QueryDatasetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasetId)) {
            query.put("DatasetId", request.datasetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the table is a custom SQL table. Valid values:</p>
     * <ul>
     * <li>true: custom SQL table</li>
     * <li>false: non-custom SQL table</li>
     * </ul>
     * 
     * @param request QueryDatasetInfoRequest
     * @return QueryDatasetInfoResponse
     */
    public QueryDatasetInfoResponse queryDatasetInfo(QueryDatasetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the training dataset.</p>
     * 
     * @param request QueryDatasetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDatasetListResponse
     */
    public QueryDatasetListResponse queryDatasetListWithOptions(QueryDatasetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withChildren)) {
            query.put("WithChildren", request.withChildren);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the training dataset.</p>
     * 
     * @param request QueryDatasetListRequest
     * @return QueryDatasetListResponse
     */
    public QueryDatasetListResponse queryDatasetList(QueryDatasetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集是否开通智能问数</p>
     * 
     * @param request QueryDatasetSmartqStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDatasetSmartqStatusResponse
     */
    public QueryDatasetSmartqStatusResponse queryDatasetSmartqStatusWithOptions(QueryDatasetSmartqStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetSmartqStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetSmartqStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据集是否开通智能问数</p>
     * 
     * @param request QueryDatasetSmartqStatusRequest
     * @return QueryDatasetSmartqStatusResponse
     */
    public QueryDatasetSmartqStatusResponse queryDatasetSmartqStatus(QueryDatasetSmartqStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetSmartqStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定数据集的行级权限开关状态。</p>
     * 
     * @param request QueryDatasetSwitchInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDatasetSwitchInfoResponse
     */
    public QueryDatasetSwitchInfoResponse queryDatasetSwitchInfoWithOptions(QueryDatasetSwitchInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDatasetSwitchInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDatasetSwitchInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定数据集的行级权限开关状态。</p>
     * 
     * @param request QueryDatasetSwitchInfoRequest
     * @return QueryDatasetSwitchInfoResponse
     */
    public QueryDatasetSwitchInfoResponse queryDatasetSwitchInfo(QueryDatasetSwitchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetSwitchInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The number of reports that are currently embedded.</p>
     * 
     * @param request QueryEmbeddedInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEmbeddedInfoResponse
     */
    public QueryEmbeddedInfoResponse queryEmbeddedInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEmbeddedInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEmbeddedInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The number of reports that are currently embedded.</p>
     * @return QueryEmbeddedInfoResponse
     */
    public QueryEmbeddedInfoResponse queryEmbeddedInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEmbeddedInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether embedding is enabled for a report.</p>
     * 
     * @param request QueryEmbeddedStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEmbeddedStatusResponse
     */
    public QueryEmbeddedStatusResponse queryEmbeddedStatusWithOptions(QueryEmbeddedStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEmbeddedStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEmbeddedStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether embedding is enabled for a report.</p>
     * 
     * @param request QueryEmbeddedStatusRequest
     * @return QueryEmbeddedStatusResponse
     */
    public QueryEmbeddedStatusResponse queryEmbeddedStatus(QueryEmbeddedStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEmbeddedStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看用户有哪些数据集和分析主题的问数授权</p>
     * 
     * @param request QueryLlmCubeWithThemeListByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryLlmCubeWithThemeListByUserIdResponse
     */
    public QueryLlmCubeWithThemeListByUserIdResponse queryLlmCubeWithThemeListByUserIdWithOptions(QueryLlmCubeWithThemeListByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLlmCubeWithThemeListByUserId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLlmCubeWithThemeListByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看用户有哪些数据集和分析主题的问数授权</p>
     * 
     * @param request QueryLlmCubeWithThemeListByUserIdRequest
     * @return QueryLlmCubeWithThemeListByUserIdResponse
     */
    public QueryLlmCubeWithThemeListByUserIdResponse queryLlmCubeWithThemeListByUserId(QueryLlmCubeWithThemeListByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryLlmCubeWithThemeListByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定组织角色的配置信息</p>
     * 
     * @param request QueryOrganizationRoleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrganizationRoleConfigResponse
     */
    public QueryOrganizationRoleConfigResponse queryOrganizationRoleConfigWithOptions(QueryOrganizationRoleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrganizationRoleConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrganizationRoleConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定组织角色的配置信息</p>
     * 
     * @param request QueryOrganizationRoleConfigRequest
     * @return QueryOrganizationRoleConfigResponse
     */
    public QueryOrganizationRoleConfigResponse queryOrganizationRoleConfig(QueryOrganizationRoleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrganizationRoleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前组织下的工作空间列表信息。</p>
     * 
     * @param request QueryOrganizationWorkspaceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrganizationWorkspaceListResponse
     */
    public QueryOrganizationWorkspaceListResponse queryOrganizationWorkspaceListWithOptions(QueryOrganizationWorkspaceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrganizationWorkspaceList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrganizationWorkspaceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前组织下的工作空间列表信息。</p>
     * 
     * @param request QueryOrganizationWorkspaceListRequest
     * @return QueryOrganizationWorkspaceListResponse
     */
    public QueryOrganizationWorkspaceListResponse queryOrganizationWorkspaceList(QueryOrganizationWorkspaceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrganizationWorkspaceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The Alibaba Cloud account name of the owner.</p>
     * 
     * @param request QueryReadableResourcesListByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReadableResourcesListByUserIdResponse
     */
    public QueryReadableResourcesListByUserIdResponse queryReadableResourcesListByUserIdWithOptions(QueryReadableResourcesListByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReadableResourcesListByUserId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReadableResourcesListByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The Alibaba Cloud account name of the owner.</p>
     * 
     * @param request QueryReadableResourcesListByUserIdRequest
     * @return QueryReadableResourcesListByUserIdResponse
     */
    public QueryReadableResourcesListByUserIdResponse queryReadableResourcesListByUserId(QueryReadableResourcesListByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReadableResourcesListByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表性能列表</p>
     * 
     * @param request QueryReportPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReportPerformanceResponse
     */
    public QueryReportPerformanceResponse queryReportPerformanceWithOptions(QueryReportPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costTimeAvgMin)) {
            query.put("CostTimeAvgMin", request.costTimeAvgMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryType)) {
            query.put("QueryType", request.queryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReportPerformance"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReportPerformanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报表性能列表</p>
     * 
     * @param request QueryReportPerformanceRequest
     * @return QueryReportPerformanceResponse
     */
    public QueryReportPerformanceResponse queryReportPerformance(QueryReportPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReportPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Xiao Zhang</p>
     * 
     * @param request QueryShareListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryShareListResponse
     */
    public QueryShareListResponse queryShareListWithOptions(QueryShareListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryShareList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryShareListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Xiao Zhang</p>
     * 
     * @param request QueryShareListRequest
     * @return QueryShareListResponse
     */
    public QueryShareListResponse queryShareList(QueryShareListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryShareListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of works authorized to a user.</p>
     * 
     * @param request QuerySharesToUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySharesToUserListResponse
     */
    public QuerySharesToUserListResponse querySharesToUserListWithOptions(QuerySharesToUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySharesToUserList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySharesToUserListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of works authorized to a user.</p>
     * 
     * @param request QuerySharesToUserListRequest
     * @return QuerySharesToUserListResponse
     */
    public QuerySharesToUserListResponse querySharesToUserList(QuerySharesToUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySharesToUserListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看用户是否有某个智能问数数据集权限</p>
     * 
     * @param request QuerySmartqPermissionByCubeIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySmartqPermissionByCubeIdResponse
     */
    public QuerySmartqPermissionByCubeIdResponse querySmartqPermissionByCubeIdWithOptions(QuerySmartqPermissionByCubeIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySmartqPermissionByCubeId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySmartqPermissionByCubeIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看用户是否有某个智能问数数据集权限</p>
     * 
     * @param request QuerySmartqPermissionByCubeIdRequest
     * @return QuerySmartqPermissionByCubeIdResponse
     */
    public QuerySmartqPermissionByCubeIdResponse querySmartqPermissionByCubeId(QuerySmartqPermissionByCubeIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySmartqPermissionByCubeIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request QueryTicketInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTicketInfoResponse
     */
    public QueryTicketInfoResponse queryTicketInfoWithOptions(QueryTicketInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTicketInfo"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTicketInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request QueryTicketInfoRequest
     * @return QueryTicketInfoResponse
     */
    public QueryTicketInfoResponse queryTicketInfo(QueryTicketInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTicketInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can this operation to obtain information about child user groups under a specified parent user group.</p>
     * 
     * @param request QueryUserGroupListByParentIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserGroupListByParentIdResponse
     */
    public QueryUserGroupListByParentIdResponse queryUserGroupListByParentIdWithOptions(QueryUserGroupListByParentIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentUserGroupId)) {
            query.put("ParentUserGroupId", request.parentUserGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserGroupListByParentId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserGroupListByParentIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can this operation to obtain information about child user groups under a specified parent user group.</p>
     * 
     * @param request QueryUserGroupListByParentIdRequest
     * @return QueryUserGroupListByParentIdResponse
     */
    public QueryUserGroupListByParentIdResponse queryUserGroupListByParentId(QueryUserGroupListByParentIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserGroupListByParentIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户组下的成员列表信息。</p>
     * 
     * @param request QueryUserGroupMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserGroupMemberResponse
     */
    public QueryUserGroupMemberResponse queryUserGroupMemberWithOptions(QueryUserGroupMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserGroupMember"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户组下的成员列表信息。</p>
     * 
     * @param request QueryUserGroupMemberRequest
     * @return QueryUserGroupMemberResponse
     */
    public QueryUserGroupMemberResponse queryUserGroupMember(QueryUserGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserGroupMemberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user information based on the Alibaba Cloud ID or Alibaba Cloud account name.</p>
     * 
     * @param request QueryUserInfoByAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserInfoByAccountResponse
     */
    public QueryUserInfoByAccountResponse queryUserInfoByAccountWithOptions(QueryUserInfoByAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentAccountName)) {
            query.put("ParentAccountName", request.parentAccountName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserInfoByAccount"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserInfoByAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user information based on the Alibaba Cloud ID or Alibaba Cloud account name.</p>
     * 
     * @param request QueryUserInfoByAccountRequest
     * @return QueryUserInfoByAccountResponse
     */
    public QueryUserInfoByAccountResponse queryUserInfoByAccount(QueryUserInfoByAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserInfoByAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user information based on the user ID.</p>
     * 
     * @param request QueryUserInfoByUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserInfoByUserIdResponse
     */
    public QueryUserInfoByUserIdResponse queryUserInfoByUserIdWithOptions(QueryUserInfoByUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserInfoByUserId"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserInfoByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user information based on the user ID.</p>
     * 
     * @param request QueryUserInfoByUserIdRequest
     * @return QueryUserInfoByUserIdResponse
     */
    public QueryUserInfoByUserIdResponse queryUserInfoByUserId(QueryUserInfoByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserInfoByUserIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询组织成员列表信息。</p>
     * 
     * @param request QueryUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserListResponse
     */
    public QueryUserListResponse queryUserListWithOptions(QueryUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询组织成员列表信息。</p>
     * 
     * @param request QueryUserListRequest
     * @return QueryUserListResponse
     */
    public QueryUserListResponse queryUserList(QueryUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作空间成员的预置空间角色信息。</p>
     * 
     * @param request QueryUserRoleInfoInWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserRoleInfoInWorkspaceResponse
     */
    public QueryUserRoleInfoInWorkspaceResponse queryUserRoleInfoInWorkspaceWithOptions(QueryUserRoleInfoInWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserRoleInfoInWorkspace"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserRoleInfoInWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定工作空间成员的预置空间角色信息。</p>
     * 
     * @param request QueryUserRoleInfoInWorkspaceRequest
     * @return QueryUserRoleInfoInWorkspaceResponse
     */
    public QueryUserRoleInfoInWorkspaceResponse queryUserRoleInfoInWorkspace(QueryUserRoleInfoInWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserRoleInfoInWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * 
     * @param request QueryUserTagMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserTagMetaListResponse
     */
    public QueryUserTagMetaListResponse queryUserTagMetaListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserTagMetaList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserTagMetaListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>auditing</p>
     * @return QueryUserTagMetaListResponse
     */
    public QueryUserTagMetaListResponse queryUserTagMetaList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserTagMetaListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of tag values for a specific user.</p>
     * 
     * @param request QueryUserTagValueListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserTagValueListResponse
     */
    public QueryUserTagValueListResponse queryUserTagValueListWithOptions(QueryUserTagValueListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserTagValueList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserTagValueListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of tag values for a specific user.</p>
     * 
     * @param request QueryUserTagValueListRequest
     * @return QueryUserTagValueListResponse
     */
    public QueryUserTagValueListResponse queryUserTagValueList(QueryUserTagValueListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserTagValueListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取报表详情</p>
     * 
     * @param request QueryWorksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorksResponse
     */
    public QueryWorksResponse queryWorksWithOptions(QueryWorksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorks"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取报表详情</p>
     * 
     * @param request QueryWorksRequest
     * @return QueryWorksResponse
     */
    public QueryWorksResponse queryWorks(QueryWorksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>abcd****</p>
     * 
     * @param request QueryWorksBloodRelationshipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorksBloodRelationshipResponse
     */
    public QueryWorksBloodRelationshipResponse queryWorksBloodRelationshipWithOptions(QueryWorksBloodRelationshipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorksBloodRelationship"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksBloodRelationshipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>abcd****</p>
     * 
     * @param request QueryWorksBloodRelationshipRequest
     * @return QueryWorksBloodRelationshipResponse
     */
    public QueryWorksBloodRelationshipResponse queryWorksBloodRelationship(QueryWorksBloodRelationshipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorksBloodRelationshipWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The total number of rows in the table.</p>
     * 
     * @param request QueryWorksByOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorksByOrganizationResponse
     */
    public QueryWorksByOrganizationResponse queryWorksByOrganizationWithOptions(QueryWorksByOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartAuthFlag)) {
            query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksType)) {
            query.put("WorksType", request.worksType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorksByOrganization"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksByOrganizationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The total number of rows in the table.</p>
     * 
     * @param request QueryWorksByOrganizationRequest
     * @return QueryWorksByOrganizationResponse
     */
    public QueryWorksByOrganizationResponse queryWorksByOrganization(QueryWorksByOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorksByOrganizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the directory.</p>
     * 
     * @param request QueryWorksByWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorksByWorkspaceResponse
     */
    public QueryWorksByWorkspaceResponse queryWorksByWorkspaceWithOptions(QueryWorksByWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartAuthFlag)) {
            query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksType)) {
            query.put("WorksType", request.worksType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorksByWorkspace"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorksByWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the directory.</p>
     * 
     * @param request QueryWorksByWorkspaceRequest
     * @return QueryWorksByWorkspaceResponse
     */
    public QueryWorksByWorkspaceResponse queryWorksByWorkspace(QueryWorksByWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorksByWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定空间角色的配置信息</p>
     * 
     * @param request QueryWorkspaceRoleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorkspaceRoleConfigResponse
     */
    public QueryWorkspaceRoleConfigResponse queryWorkspaceRoleConfigWithOptions(QueryWorkspaceRoleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorkspaceRoleConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorkspaceRoleConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定空间角色的配置信息</p>
     * 
     * @param request QueryWorkspaceRoleConfigRequest
     * @return QueryWorkspaceRoleConfigResponse
     */
    public QueryWorkspaceRoleConfigResponse queryWorkspaceRoleConfig(QueryWorkspaceRoleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorkspaceRoleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定工作空间下的成员列表信息。</p>
     * 
     * @param request QueryWorkspaceUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryWorkspaceUserListResponse
     */
    public QueryWorkspaceUserListResponse queryWorkspaceUserListWithOptions(QueryWorkspaceUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWorkspaceUserList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWorkspaceUserListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定工作空间下的成员列表信息。</p>
     * 
     * @param request QueryWorkspaceUserListRequest
     * @return QueryWorkspaceUserListResponse
     */
    public QueryWorkspaceUserListResponse queryWorkspaceUserList(QueryWorkspaceUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryWorkspaceUserListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>第三方资源审批回调接口</p>
     * 
     * @param request ResultCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResultCallbackResponse
     */
    public ResultCallbackResponse resultCallbackWithOptions(ResultCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.handleReason)) {
            query.put("HandleReason", request.handleReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResultCallback"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResultCallbackResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>第三方资源审批回调接口</p>
     * 
     * @param request ResultCallbackRequest
     * @return ResultCallbackResponse
     */
    public ResultCallbackResponse resultCallback(ResultCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resultCallbackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add the user\&quot;s collection data works.</p>
     * 
     * @param request SaveFavoritesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveFavoritesResponse
     */
    public SaveFavoritesResponse saveFavoritesWithOptions(SaveFavoritesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveFavorites"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveFavoritesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add the user\&quot;s collection data works.</p>
     * 
     * @param request SaveFavoritesRequest
     * @return SaveFavoritesResponse
     */
    public SaveFavoritesResponse saveFavorites(SaveFavoritesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveFavoritesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置行列权限的额外配置</p>
     * 
     * @param request SetDataLevelPermissionExtraConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataLevelPermissionExtraConfigResponse
     */
    public SetDataLevelPermissionExtraConfigResponse setDataLevelPermissionExtraConfigWithOptions(SetDataLevelPermissionExtraConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missHitPolicy)) {
            query.put("MissHitPolicy", request.missHitPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataLevelPermissionExtraConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataLevelPermissionExtraConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置行列权限的额外配置</p>
     * 
     * @param request SetDataLevelPermissionExtraConfigRequest
     * @return SetDataLevelPermissionExtraConfigResponse
     */
    public SetDataLevelPermissionExtraConfigResponse setDataLevelPermissionExtraConfig(SetDataLevelPermissionExtraConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataLevelPermissionExtraConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置单条数据集行列权限配置信息（新增和更新）</p>
     * 
     * @param request SetDataLevelPermissionRuleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataLevelPermissionRuleConfigResponse
     */
    public SetDataLevelPermissionRuleConfigResponse setDataLevelPermissionRuleConfigWithOptions(SetDataLevelPermissionRuleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleModel)) {
            query.put("RuleModel", request.ruleModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataLevelPermissionRuleConfig"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataLevelPermissionRuleConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置单条数据集行列权限配置信息（新增和更新）</p>
     * 
     * @param request SetDataLevelPermissionRuleConfigRequest
     * @return SetDataLevelPermissionRuleConfigResponse
     */
    public SetDataLevelPermissionRuleConfigResponse setDataLevelPermissionRuleConfig(SetDataLevelPermissionRuleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataLevelPermissionRuleConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets the whitelist for the specified row-level permissions.</p>
     * 
     * @param request SetDataLevelPermissionWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataLevelPermissionWhiteListResponse
     */
    public SetDataLevelPermissionWhiteListResponse setDataLevelPermissionWhiteListWithOptions(SetDataLevelPermissionWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.whiteListModel)) {
            query.put("WhiteListModel", request.whiteListModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDataLevelPermissionWhiteList"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataLevelPermissionWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: You can only Quick BI the new row-column permission model. If you are still using the old row-column permission model, migrate to the new row-column permission model before you call this operation. To migrate row-level permissions to the new row-level permission model, perform the following steps: Choose Organizations&gt; Security Configurations&gt; Upgrade Row-Level Permissions. On the Upgrade Row-Level Permissions page, click <strong>Upgrade</strong>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Sets the whitelist for the specified row-level permissions.</p>
     * 
     * @param request SetDataLevelPermissionWhiteListRequest
     * @return SetDataLevelPermissionWhiteListResponse
     */
    public SetDataLevelPermissionWhiteListResponse setDataLevelPermissionWhiteList(SetDataLevelPermissionWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataLevelPermissionWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将指定用户的问数权限同步给其他用户</p>
     * 
     * @param request SmartqAuthTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmartqAuthTransferResponse
     */
    public SmartqAuthTransferResponse smartqAuthTransferWithOptions(SmartqAuthTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.originUserId)) {
            query.put("OriginUserId", request.originUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserIds)) {
            query.put("TargetUserIds", request.targetUserIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartqAuthTransfer"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartqAuthTransferResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将指定用户的问数权限同步给其他用户</p>
     * 
     * @param request SmartqAuthTransferRequest
     * @return SmartqAuthTransferResponse
     */
    public SmartqAuthTransferResponse smartqAuthTransfer(SmartqAuthTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartqAuthTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量管理智能问数的授权</p>
     * 
     * @param request SmartqAuthorizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmartqAuthorizeResponse
     */
    public SmartqAuthorizeResponse smartqAuthorizeWithOptions(SmartqAuthorizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireDay)) {
            query.put("ExpireDay", request.expireDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmCubeThemes)) {
            query.put("LlmCubeThemes", request.llmCubeThemes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmCubes)) {
            query.put("LlmCubes", request.llmCubes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartqAuthorize"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartqAuthorizeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量管理智能问数的授权</p>
     * 
     * @param request SmartqAuthorizeRequest
     * @return SmartqAuthorizeResponse
     */
    public SmartqAuthorizeResponse smartqAuthorize(SmartqAuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartqAuthorizeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>问数能力开放</p>
     * 
     * @param request SmartqQueryAbilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SmartqQueryAbilityResponse
     */
    public SmartqQueryAbilityResponse smartqQueryAbilityWithOptions(SmartqQueryAbilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userQuestion)) {
            query.put("UserQuestion", request.userQuestion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SmartqQueryAbility"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SmartqQueryAbilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>问数能力开放</p>
     * 
     * @param request SmartqQueryAbilityRequest
     * @return SmartqQueryAbilityResponse
     */
    public SmartqQueryAbilityResponse smartqQueryAbility(SmartqQueryAbilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.smartqQueryAbilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The execution result of the interface. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * @param request UpdateDataLevelPermissionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataLevelPermissionStatusResponse
     */
    public UpdateDataLevelPermissionStatusResponse updateDataLevelPermissionStatusWithOptions(UpdateDataLevelPermissionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cubeId)) {
            query.put("CubeId", request.cubeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpen)) {
            query.put("IsOpen", request.isOpen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataLevelPermissionStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataLevelPermissionStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>The execution result of the interface. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * @param request UpdateDataLevelPermissionStatusRequest
     * @return UpdateDataLevelPermissionStatusResponse
     */
    public UpdateDataLevelPermissionStatusResponse updateDataLevelPermissionStatus(UpdateDataLevelPermissionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataLevelPermissionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateEmbeddedStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEmbeddedStatusResponse
     */
    public UpdateEmbeddedStatusResponse updateEmbeddedStatusWithOptions(UpdateEmbeddedStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartAuthFlag)) {
            query.put("ThirdPartAuthFlag", request.thirdPartAuthFlag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.worksId)) {
            query.put("WorksId", request.worksId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEmbeddedStatus"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEmbeddedStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the request.</p>
     * 
     * @param request UpdateEmbeddedStatusRequest
     * @return UpdateEmbeddedStatusResponse
     */
    public UpdateEmbeddedStatusResponse updateEmbeddedStatus(UpdateEmbeddedStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEmbeddedStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新三方嵌入ticket的票据数量</p>
     * 
     * @param request UpdateTicketNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTicketNumResponse
     */
    public UpdateTicketNumResponse updateTicketNumWithOptions(UpdateTicketNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketNum)) {
            query.put("TicketNum", request.ticketNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTicketNum"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTicketNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新三方嵌入ticket的票据数量</p>
     * 
     * @param request UpdateTicketNumRequest
     * @return UpdateTicketNumResponse
     */
    public UpdateTicketNumResponse updateTicketNum(UpdateTicketNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTicketNumWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified member in an organization.</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminUser)) {
            query.put("AdminUser", request.adminUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authAdminUser)) {
            query.put("AuthAdminUser", request.authAdminUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeleted)) {
            query.put("IsDeleted", request.isDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            query.put("NickName", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            query.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified member in an organization.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information about a specified user group in an organization.</p>
     * 
     * @param request UpdateUserGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroupWithOptions(UpdateUserGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userGroupDescription)) {
            query.put("UserGroupDescription", request.userGroupDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupId)) {
            query.put("UserGroupId", request.userGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupName)) {
            query.put("UserGroupName", request.userGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserGroup"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information about a specified user group in an organization.</p>
     * 
     * @param request UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    public UpdateUserGroupResponse updateUserGroup(UpdateUserGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>用于更新组织成员标签元信息</p>
     * 
     * @param request UpdateUserTagMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserTagMetaResponse
     */
    public UpdateUserTagMetaResponse updateUserTagMetaWithOptions(UpdateUserTagMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagDescription)) {
            query.put("TagDescription", request.tagDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagName)) {
            query.put("TagName", request.tagName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserTagMeta"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserTagMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>用于更新组织成员标签元信息</p>
     * 
     * @param request UpdateUserTagMetaRequest
     * @return UpdateUserTagMetaResponse
     */
    public UpdateUserTagMetaResponse updateUserTagMeta(UpdateUserTagMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserTagMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新组织成员标签值</p>
     * 
     * @param request UpdateUserTagValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserTagValueResponse
     */
    public UpdateUserTagValueResponse updateUserTagValueWithOptions(UpdateUserTagValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagId)) {
            query.put("TagId", request.tagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValue)) {
            query.put("TagValue", request.tagValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserTagValue"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserTagValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新组织成员标签值</p>
     * 
     * @param request UpdateUserTagValueRequest
     * @return UpdateUserTagValueResponse
     */
    public UpdateUserTagValueResponse updateUserTagValue(UpdateUserTagValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserTagValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间下指定成员的角色，已有的角色会被覆盖</p>
     * 
     * @param request UpdateWorkspaceUserRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceUserRoleResponse
     */
    public UpdateWorkspaceUserRoleResponse updateWorkspaceUserRoleWithOptions(UpdateWorkspaceUserRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleIds)) {
            query.put("RoleIds", request.roleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceUserRole"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceUserRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改工作空间下指定成员的角色，已有的角色会被覆盖</p>
     * 
     * @param request UpdateWorkspaceUserRoleRequest
     * @return UpdateWorkspaceUserRoleResponse
     */
    public UpdateWorkspaceUserRoleResponse updateWorkspaceUserRole(UpdateWorkspaceUserRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkspaceUserRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新工作空间成员的角色信息，已有角色会被覆盖</p>
     * 
     * @param request UpdateWorkspaceUsersRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkspaceUsersRoleResponse
     */
    public UpdateWorkspaceUsersRoleResponse updateWorkspaceUsersRoleWithOptions(UpdateWorkspaceUsersRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            query.put("RoleId", request.roleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceUsersRole"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceUsersRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新工作空间成员的角色信息，已有角色会被覆盖</p>
     * 
     * @param request UpdateWorkspaceUsersRoleRequest
     * @return UpdateWorkspaceUsersRoleResponse
     */
    public UpdateWorkspaceUsersRoleResponse updateWorkspaceUsersRole(UpdateWorkspaceUsersRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkspaceUsersRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Make the user exit all user groups. This process is irreversible. Exercise caution when performing this operation.</p>
     * 
     * @param request WithdrawAllUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WithdrawAllUserGroupsResponse
     */
    public WithdrawAllUserGroupsResponse withdrawAllUserGroupsWithOptions(WithdrawAllUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WithdrawAllUserGroups"),
            new TeaPair("version", "2022-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WithdrawAllUserGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Make the user exit all user groups. This process is irreversible. Exercise caution when performing this operation.</p>
     * 
     * @param request WithdrawAllUserGroupsRequest
     * @return WithdrawAllUserGroupsResponse
     */
    public WithdrawAllUserGroupsResponse withdrawAllUserGroups(WithdrawAllUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.withdrawAllUserGroupsWithOptions(request, runtime);
    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301;

import com.aliyun.tea.*;
import com.aliyun.pds20220301.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "pds";
        com.aliyun.gateway.pds.Client gatewayClient = new com.aliyun.gateway.pds.Client();
        this._spi = gatewayClient;
        this._disableHttp2 = true;
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-zhangjiakou", "cn-zhangjiakou.admin.aliyunpds.com"),
            new TeaPair("cn-shenzhen", "cn-shenzhen.admin.aliyunpds.com"),
            new TeaPair("cn-shanghai", "cn-shanghai.admin.aliyunpds.com"),
            new TeaPair("cn-hongkong", "cn-hongkong.admin.aliyunpds.com"),
            new TeaPair("cn-hangzhou", "cn-hangzhou.admin.aliyunpds.com"),
            new TeaPair("cn-guangzhou", "cn-guangzhou.admin.aliyunpds.com"),
            new TeaPair("cn-beijing", "cn-beijing.admin.aliyunpds.com"),
            new TeaPair("ap-southeast-5", "ap-southeast-5.admin.aliyunpds.com"),
            new TeaPair("ap-southeast-1", "ap-southeast-1.admin.aliyunpds.com"),
            new TeaPair("eu-central-1", "eu-central-1.admin.aliyunpds.com"),
            new TeaPair("us-west-1", "us-west-1.admin.aliyunpds.com")
        );
    }


    /**
     * <b>summary</b> : 
     * <p>Adds a member to a group.</p>
     * 
     * @param request AddGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMemberWithOptions(AddGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("member_id", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("member_type", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroupMember"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/add_member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a member to a group.</p>
     * 
     * @param request AddGroupMemberRequest
     * @return AddGroupMemberResponse
     */
    public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must enable the image processing feature.
     * After you create a story, you can manually add files to it.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds files to a specified story.</p>
     * 
     * @param request AddStoryFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddStoryFilesResponse
     */
    public AddStoryFilesResponse addStoryFilesWithOptions(AddStoryFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddStoryFiles"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/add_story_files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AddStoryFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must enable the image processing feature.
     * After you create a story, you can manually add files to it.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds files to a specified story.</p>
     * 
     * @param request AddStoryFilesRequest
     * @return AddStoryFilesResponse
     */
    public AddStoryFilesResponse addStoryFiles(AddStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addStoryFilesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This asynchronous operation archives files and folders into a single package and returns an asynchronous task ID. To check the status of the task, call <code>GetAsyncTask</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Archives files and folders into a package for download.</p>
     * 
     * @param request ArchiveFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ArchiveFilesResponse
     */
    public ArchiveFilesResponse archiveFilesWithOptions(ArchiveFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIds)) {
            body.put("file_ids", request.fileIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ArchiveFiles"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/archive_files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ArchiveFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This asynchronous operation archives files and folders into a single package and returns an asynchronous task ID. To check the status of the task, call <code>GetAsyncTask</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Archives files and folders into a package for download.</p>
     * 
     * @param request ArchiveFilesRequest
     * @return ArchiveFilesResponse
     */
    public ArchiveFilesResponse archiveFiles(ArchiveFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.archiveFilesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation assigns the team administrator role to a user.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation assigns the team administrator role to a user.</p>
     * 
     * @param request AssignRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignRoleResponse
     */
    public AssignRoleResponse assignRoleWithOptions(AssignRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceId)) {
            body.put("manage_resource_id", request.manageResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceType)) {
            body.put("manage_resource_type", request.manageResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignRole"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/role/assign"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AssignRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation assigns the team administrator role to a user.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation assigns the team administrator role to a user.</p>
     * 
     * @param request AssignRoleRequest
     * @return AssignRoleResponse
     */
    public AssignRoleResponse assignRole(AssignRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.assignRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In Drive and Photo Service for Developer, audit logging is a value-added feature. Before using this operation, review the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/pds/drive-and-photo-service-dev/product-overview/billable-items-for-value-added-features">billable items for value-added features</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/document_detail/425220.html">billable items for value-added features</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports audit logs.</p>
     * 
     * @param request AuditLogExportRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditLogExportResponse
     */
    public AuditLogExportResponse auditLogExportWithOptions(AuditLogExportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("file_name", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditLogExport"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/audit_log/export"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AuditLogExportResponse());
    }

    /**
     * <b>description</b> :
     * <p>In Drive and Photo Service for Developer, audit logging is a value-added feature. Before using this operation, review the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/pds/drive-and-photo-service-dev/product-overview/billable-items-for-value-added-features">billable items for value-added features</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/document_detail/425220.html">billable items for value-added features</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports audit logs.</p>
     * 
     * @param request AuditLogExportRequest
     * @return AuditLogExportResponse
     */
    public AuditLogExportResponse auditLogExport(AuditLogExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditLogExportWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For details, see the <a href="https://help.aliyun.com/document_detail/175894.html">user guide</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For details, see the <a href="https://www.alibabacloud.com/help/zh/pds/latest/oauth2-for-web-server-app?spm=a2c63.p38356.0.0.4cce4fccEyosuB">user guide</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests OAuth 2.0 authorization.</p>
     * 
     * @param tmpReq AuthorizeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResponse
     */
    public AuthorizeResponse authorizeWithOptions(AuthorizeRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuthorizeShrinkRequest request = new AuthorizeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scope)) {
            request.scopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scope, "scope", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hideConsent)) {
            query.put("hide_consent", request.hideConsent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginType)) {
            query.put("login_type", request.loginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUri)) {
            query.put("redirect_uri", request.redirectUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseType)) {
            query.put("response_type", request.responseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeShrink)) {
            query.put("scope", request.scopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("state", request.state);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Authorize"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/oauth/authorize"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new AuthorizeResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For details, see the <a href="https://help.aliyun.com/document_detail/175894.html">user guide</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For details, see the <a href="https://www.alibabacloud.com/help/zh/pds/latest/oauth2-for-web-server-app?spm=a2c63.p38356.0.0.4cce4fccEyosuB">user guide</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Requests OAuth 2.0 authorization.</p>
     * 
     * @param request AuthorizeRequest
     * @return AuthorizeResponse
     */
    public AuthorizeResponse authorize(AuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Combine multiple API calls into a single request to improve efficiency.</p>
     * 
     * @param request BatchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchResponse
     */
    public BatchResponse batchWithOptions(BatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requests)) {
            body.put("requests", request.requests);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            body.put("resource", request.resource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Batch"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/batch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new BatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Combine multiple API calls into a single request to improve efficiency.</p>
     * 
     * @param request BatchRequest
     * @return BatchResponse
     */
    public BatchResponse batch(BatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation only revokes the team administrator role.</p>
     * 
     * <b>summary</b> : 
     * <p>Currently, this operation only revokes the team administrator role.</p>
     * 
     * @param request CancelAssignRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelAssignRoleResponse
     */
    public CancelAssignRoleResponse cancelAssignRoleWithOptions(CancelAssignRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceId)) {
            body.put("manage_resource_id", request.manageResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceType)) {
            body.put("manage_resource_type", request.manageResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleId)) {
            body.put("role_id", request.roleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelAssignRole"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/role/cancel_assign"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CancelAssignRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Currently, this operation only revokes the team administrator role.</p>
     * 
     * <b>summary</b> : 
     * <p>Currently, this operation only revokes the team administrator role.</p>
     * 
     * @param request CancelAssignRoleRequest
     * @return CancelAssignRoleResponse
     */
    public CancelAssignRoleResponse cancelAssignRole(CancelAssignRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAssignRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a share link.</p>
     * 
     * @param request CancelShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelShareLinkResponse
     */
    public CancelShareLinkResponse cancelShareLinkWithOptions(CancelShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CancelShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a share link.</p>
     * 
     * @param request CancelShareLinkRequest
     * @return CancelShareLinkResponse
     */
    public CancelShareLinkResponse cancelShareLink(CancelShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Permanently deletes all files and folders in the recycle bin.</p>
     * 
     * @param request ClearRecyclebinRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearRecyclebinResponse
     */
    public ClearRecyclebinResponse clearRecyclebinWithOptions(ClearRecyclebinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearRecyclebin"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/recyclebin/clear"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ClearRecyclebinResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Permanently deletes all files and folders in the recycle bin.</p>
     * 
     * @param request ClearRecyclebinRequest
     * @return ClearRecyclebinResponse
     */
    public ClearRecyclebinResponse clearRecyclebin(ClearRecyclebinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.clearRecyclebinWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For usage instructions, refer to Best Practices: <a href="https://help.aliyun.com/document_detail/175888.html">File upload</a>.
     * During the file upload process, uploaded file parts incur storage fees. The parts are retained for 10 days until the file upload is completed or the parts expire and are cleaned up after 10 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Completes a file upload.</p>
     * 
     * @param request CompleteFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteFileResponse
     */
    public CompleteFileResponse completeFileWithOptions(CompleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crc64Hash)) {
            body.put("crc64_hash", request.crc64Hash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            body.put("upload_id", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/complete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CompleteFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>For usage instructions, refer to Best Practices: <a href="https://help.aliyun.com/document_detail/175888.html">File upload</a>.
     * During the file upload process, uploaded file parts incur storage fees. The parts are retained for 10 days until the file upload is completed or the parts expire and are cleaned up after 10 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Completes a file upload.</p>
     * 
     * @param request CompleteFileRequest
     * @return CompleteFileResponse
     */
    public CompleteFileResponse completeFile(CompleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a file or directory.</p>
     * 
     * @param request CopyFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyFileResponse
     */
    public CopyFileResponse copyFileWithOptions(CopyFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRename)) {
            body.put("auto_rename", request.autoRename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toDriveId)) {
            body.put("to_drive_id", request.toDriveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toParentFileId)) {
            body.put("to_parent_file_id", request.toParentFileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/copy"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CopyFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a file or directory.</p>
     * 
     * @param request CopyFileRequest
     * @return CopyFileResponse
     */
    public CopyFileResponse copyFile(CopyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.copyFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must enable the image processing value-added service. Story-related APIs are free for a limited time.
     * You can create a customized story by providing a list of files. You can freely define the story type and story subtype.</p>
     * <blockquote>
     * <p>Notice: If you specify a story cover, you must include the cover file in the story file list. Otherwise, an error is returned.
     * Notice: You can include only images in the customized story file list.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a customized story. Unlike a recommended story, you specify the files in a customized story.</p>
     * 
     * @param request CreateCustomizedStoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomizedStoryResponse
     */
    public CreateCustomizedStoryResponse createCustomizedStoryWithOptions(CreateCustomizedStoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            body.put("custom_labels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyCover)) {
            body.put("story_cover", request.storyCover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyFiles)) {
            body.put("story_files", request.storyFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("story_name", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            body.put("story_sub_type", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("story_type", request.storyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomizedStory"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/create_customized_story"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateCustomizedStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must enable the image processing value-added service. Story-related APIs are free for a limited time.
     * You can create a customized story by providing a list of files. You can freely define the story type and story subtype.</p>
     * <blockquote>
     * <p>Notice: If you specify a story cover, you must include the cover file in the story file list. Otherwise, an error is returned.
     * Notice: You can include only images in the customized story file list.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a customized story. Unlike a recommended story, you specify the files in a customized story.</p>
     * 
     * @param request CreateCustomizedStoryRequest
     * @return CreateCustomizedStoryResponse
     */
    public CreateCustomizedStoryResponse createCustomizedStory(CreateCustomizedStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomizedStoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Use the parent-child domain feature to implement custom operations on PDS or apply fine-grained controls to tenants. For more information, contact the official DingTalk group: 23146118.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain.</p>
     * 
     * @param request CreateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domain_name", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initDriveEnable)) {
            body.put("init_drive_enable", request.initDriveEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initDriveSize)) {
            body.put("init_drive_size", request.initDriveSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDomainId)) {
            body.put("parent_domain_id", request.parentDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeQuota)) {
            body.put("size_quota", request.sizeQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeRedundancyType)) {
            body.put("store_redundancy_type", request.storeRedundancyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCountQuota)) {
            body.put("user_count_quota", request.userCountQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Use the parent-child domain feature to implement custom operations on PDS or apply fine-grained controls to tenants. For more information, contact the official DingTalk group: 23146118.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a domain.</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before creating a drive, ensure that the specified user or group has not been assigned a drive.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a drive.</p>
     * 
     * @param request CreateDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDriveResponse
     */
    public CreateDriveResponse createDriveWithOptions(CreateDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request._default)) {
            body.put("default", request._default);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveName)) {
            body.put("drive_name", request.driveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveType)) {
            body.put("drive_type", request.driveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerType)) {
            body.put("owner_type", request.ownerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSize)) {
            body.put("total_size", request.totalSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDriveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before creating a drive, ensure that the specified user or group has not been assigned a drive.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a drive.</p>
     * 
     * @param request CreateDriveRequest
     * @return CreateDriveResponse
     */
    public CreateDriveResponse createDrive(CreateDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For the method of creating a file, refer to Best Practices: <a href="https://help.aliyun.com/document_detail/175888.html">File upload</a>.
     * During the file upload procedure, uploaded file parts incur storage fees. Parts are retained for 10 days until the file upload is complete or the parts expire and are cleaned up after 10 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a file or folder.</p>
     * 
     * @param request CreateFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileResponse
     */
    public CreateFileResponse createFileWithOptions(CreateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkNameMode)) {
            body.put("check_name_mode", request.checkNameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentHash)) {
            body.put("content_hash", request.contentHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentHashName)) {
            body.put("content_hash_name", request.contentHashName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("content_type", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidden)) {
            body.put("hidden", request.hidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localCreatedAt)) {
            body.put("local_created_at", request.localCreatedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localModifiedAt)) {
            body.put("local_modified_at", request.localModifiedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelUpload)) {
            body.put("parallel_upload", request.parallelUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFileId)) {
            body.put("parent_file_id", request.parentFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partInfoList)) {
            body.put("part_info_list", request.partInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preHash)) {
            body.put("pre_hash", request.preHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadType)) {
            body.put("upload_type", request.uploadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTags)) {
            body.put("user_tags", request.userTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>For the method of creating a file, refer to Best Practices: <a href="https://help.aliyun.com/document_detail/175888.html">File upload</a>.
     * During the file upload procedure, uploaded file parts incur storage fees. Parts are retained for 10 days until the file upload is complete or the parts expire and are cleaned up after 10 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a file or folder.</p>
     * 
     * @param request CreateFileRequest
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("group_name", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isRoot)) {
            body.put("is_root", request.isRoot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentGroupId)) {
            body.put("parent_group_id", request.parentGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you are building services for many users using PDS, you can use benefit packages to manage user access to features and quotas. For more information, contact our official DingTalk group at 23146118.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mapping between an entity and a benefit package. This operation lets you assign a benefit package to a user.</p>
     * 
     * @param request CreateIdentityToBenefitPkgMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityToBenefitPkgMappingResponse
     */
    public CreateIdentityToBenefitPkgMappingResponse createIdentityToBenefitPkgMappingWithOptions(CreateIdentityToBenefitPkgMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.benefitPkgId)) {
            body.put("benefit_pkg_id", request.benefitPkgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expire_time", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityId)) {
            body.put("identity_id", request.identityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("identity_type", request.identityType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityToBenefitPkgMapping"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/benefit/identity_to_benefit_pkg_mapping/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateIdentityToBenefitPkgMappingResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you are building services for many users using PDS, you can use benefit packages to manage user access to features and quotas. For more information, contact our official DingTalk group at 23146118.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mapping between an entity and a benefit package. This operation lets you assign a benefit package to a user.</p>
     * 
     * @param request CreateIdentityToBenefitPkgMappingRequest
     * @return CreateIdentityToBenefitPkgMappingResponse
     */
    public CreateIdentityToBenefitPkgMappingResponse createIdentityToBenefitPkgMapping(CreateIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建凌霄订单</p>
     * 
     * @param request CreateOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("auto_pay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("auto_renew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            body.put("auto_use_coupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("order_type", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._package)) {
            body.put("package", request._package);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("period_unit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSize)) {
            body.put("total_size", request.totalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            body.put("user_count", request.userCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/create_order"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建凌霄订单</p>
     * 
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A share link allows anonymous users to access one or more files from a user\&quot;s drive. The permissions for the share link determine the level of access.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a share link.</p>
     * 
     * @param request CreateShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateShareLinkResponse
     */
    public CreateShareLinkResponse createShareLinkWithOptions(CreateShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatable)) {
            body.put("creatable", request.creatable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatableFileIdList)) {
            body.put("creatable_file_id_list", request.creatableFileIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDownload)) {
            body.put("disable_download", request.disableDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disablePreview)) {
            body.put("disable_preview", request.disablePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSave)) {
            body.put("disable_save", request.disableSave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadLimit)) {
            body.put("download_limit", request.downloadLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            body.put("expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdList)) {
            body.put("file_id_list", request.fileIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeEditable)) {
            body.put("office_editable", request.officeEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewLimit)) {
            body.put("preview_limit", request.previewLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireLogin)) {
            body.put("require_login", request.requireLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveLimit)) {
            body.put("save_limit", request.saveLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareAllFiles)) {
            body.put("share_all_files", request.shareAllFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareName)) {
            body.put("share_name", request.shareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharePwd)) {
            body.put("share_pwd", request.sharePwd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateShareLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>A share link allows anonymous users to access one or more files from a user\&quot;s drive. The permissions for the share link determine the level of access.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a share link.</p>
     * 
     * @param request CreateShareLinkRequest
     * @return CreateShareLinkResponse
     */
    public CreateShareLinkResponse createShareLink(CreateShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, review the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> for PDS.</em>*
     * To use this feature, you must enable the image processing value-added service. This service is currently free for a limited time.
     * Procedure</p>
     * <ul>
     * <li>Create a similar image clustering task.</li>
     * <li>Use the GetTaskStatus operation to query the status of the similar image clustering task.</li>
     * <li>Use the SearchSimilarImageClusters operation to retrieve the results of the similar image clustering task.
     * Only one similar image clustering task can run at a time in a drive. If you start a new task while another is running, the new request fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task that clusters similar images in a specified drive.</p>
     * 
     * @param request CreateSimilarImageClusterTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimilarImageClusterTaskResponse
     */
    public CreateSimilarImageClusterTaskResponse createSimilarImageClusterTaskWithOptions(CreateSimilarImageClusterTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimilarImageClusterTask"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/create_similar_image_cluster_task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateSimilarImageClusterTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, review the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> for PDS.</em>*
     * To use this feature, you must enable the image processing value-added service. This service is currently free for a limited time.
     * Procedure</p>
     * <ul>
     * <li>Create a similar image clustering task.</li>
     * <li>Use the GetTaskStatus operation to query the status of the similar image clustering task.</li>
     * <li>Use the SearchSimilarImageClusters operation to retrieve the results of the similar image clustering task.
     * Only one similar image clustering task can run at a time in a drive. If you start a new task while another is running, the new request fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task that clusters similar images in a specified drive.</p>
     * 
     * @param request CreateSimilarImageClusterTaskRequest
     * @return CreateSimilarImageClusterTaskResponse
     */
    public CreateSimilarImageClusterTaskResponse createSimilarImageClusterTask(CreateSimilarImageClusterTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSimilarImageClusterTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this API, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> for PDS.</em>*
     * To use this feature, you must enable the Image Processing service. The story-related APIs are free of charge for a limited time.
     * You can specify a story ID when creating a story:</p>
     * <ul>
     * <li>If you specify a story ID:<ul>
     * <li>If the story ID does not exist, a new story is created with the specified ID.</li>
     * <li>If the story ID already exists, PDS regenerates and overwrites the story based on the new request.</li>
     * </ul>
     * </li>
     * <li>If you do not specify a story ID, PDS generates one.<blockquote>
     * <ul>
     * <li>This is an asynchronous API. After creating a story, you can call the GetStory or FindStories APIs to check its creation status.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a suggested story. PDS filters images and videos in a drive based on the story type and time range in the request. PDS then adds the matching files to the story. If no images or videos match the criteria, an empty story is created.</p>
     * 
     * @param request CreateStoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoryResponse
     */
    public CreateStoryResponse createStoryWithOptions(CreateStoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            body.put("custom_labels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxImageCount)) {
            body.put("max_image_count", request.maxImageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minImageCount)) {
            body.put("min_image_count", request.minImageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTime)) {
            body.put("story_end_time", request.storyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("story_name", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTime)) {
            body.put("story_start_time", request.storyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storySubType)) {
            body.put("story_sub_type", request.storySubType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("story_type", request.storyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStory"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/create_story"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this API, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> for PDS.</em>*
     * To use this feature, you must enable the Image Processing service. The story-related APIs are free of charge for a limited time.
     * You can specify a story ID when creating a story:</p>
     * <ul>
     * <li>If you specify a story ID:<ul>
     * <li>If the story ID does not exist, a new story is created with the specified ID.</li>
     * <li>If the story ID already exists, PDS regenerates and overwrites the story based on the new request.</li>
     * </ul>
     * </li>
     * <li>If you do not specify a story ID, PDS generates one.<blockquote>
     * <ul>
     * <li>This is an asynchronous API. After creating a story, you can call the GetStory or FindStories APIs to check its creation status.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a suggested story. PDS filters images and videos in a drive based on the story type and time range in the request. PDS then adds the matching files to the story. If no images or videos match the criteria, an empty story is created.</p>
     * 
     * @param request CreateStoryRequest
     * @return CreateStoryResponse
     */
    public CreateStoryResponse createStory(CreateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a user.</p>
     * 
     * @param request CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfoList)) {
            body.put("group_info_list", request.groupInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            body.put("nick_name", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a user.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content security details of a file.</p>
     * 
     * @param request CsiGetFileInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CsiGetFileInfoResponse
     */
    public CsiGetFileInfoResponse csiGetFileInfoWithOptions(CsiGetFileInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CsiGetFileInfo"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/csi/get_file_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CsiGetFileInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content security details of a file.</p>
     * 
     * @param request CsiGetFileInfoRequest
     * @return CsiGetFileInfoResponse
     */
    public CsiGetFileInfoResponse csiGetFileInfo(CsiGetFileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.csiGetFileInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain.</p>
     * 
     * @param request DeleteDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("domain_id", request.domainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a domain.</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a drive.</p>
     * 
     * @param request DeleteDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDriveResponse
     */
    public DeleteDriveResponse deleteDriveWithOptions(DeleteDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a drive.</p>
     * 
     * @param request DeleteDriveRequest
     * @return DeleteDriveResponse
     */
    public DeleteDriveResponse deleteDrive(DeleteDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a file or folder.</p>
     * 
     * @param request DeleteFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFileWithOptions(DeleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a file or folder.</p>
     * 
     * @param request DeleteFileRequest
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group. Before deleting a group, ensure it contains no other groups or users. Otherwise, the deletion fails.</p>
     * 
     * @param request DeleteGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group. Before deleting a group, ensure it contains no other groups or users. Otherwise, the deletion fails.</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a historical revision. You cannot delete the latest revision.</p>
     * 
     * @param request DeleteRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRevisionResponse
     */
    public DeleteRevisionResponse deleteRevisionWithOptions(DeleteRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionId)) {
            body.put("revision_id", request.revisionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRevision"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/revision/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteRevisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a historical revision. You cannot delete the latest revision.</p>
     * 
     * @param request DeleteRevisionRequest
     * @return DeleteRevisionResponse
     */
    public DeleteRevisionResponse deleteRevision(DeleteRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRevisionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * To use this feature, you must enable the image processing feature, which is a value-added service.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified story.</p>
     * 
     * @param request DeleteStoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStoryResponse
     */
    public DeleteStoryResponse deleteStoryWithOptions(DeleteStoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStory"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/delete_story"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * To use this feature, you must enable the image processing feature, which is a value-added service.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified story.</p>
     * 
     * @param request DeleteStoryRequest
     * @return DeleteStoryResponse
     */
    public DeleteStoryResponse deleteStory(DeleteStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
     * 
     * @param request DeleteUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the latest cursor for delta operations.</p>
     * 
     * @param request DeltaGetLastCursorRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeltaGetLastCursorResponse
     */
    public DeltaGetLastCursorResponse deltaGetLastCursorWithOptions(DeltaGetLastCursorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRootId)) {
            body.put("sync_root_id", request.syncRootId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeltaGetLastCursor"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get_last_cursor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeltaGetLastCursorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the latest cursor for delta operations.</p>
     * 
     * @param request DeltaGetLastCursorRequest
     * @return DeltaGetLastCursorResponse
     */
    public DeltaGetLastCursorResponse deltaGetLastCursor(DeltaGetLastCursorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deltaGetLastCursorWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For best practices, see <a href="https://help.aliyun.com/document_detail/175889.html">file download</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads a file.</p>
     * 
     * @param request DownloadFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadFileResponse
     */
    public DownloadFileResponse downloadFileWithOptions(DownloadFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            query.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            query.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeThumbnailProcess)) {
            query.put("office_thumbnail_process", request.officeThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            query.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoThumbnailProcess)) {
            query.put("video_thumbnail_process", request.videoThumbnailProcess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/download"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "binary")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DownloadFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For best practices, see <a href="https://help.aliyun.com/document_detail/175889.html">file download</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads a file.</p>
     * 
     * @param request DownloadFileRequest
     * @return DownloadFileResponse
     */
    public DownloadFileResponse downloadFile(DownloadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each drive supports a maximum of 1000 authorization records. Authorization records that exceed this limit do not take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants folder-level authorization. Each drive supports a maximum of 1000 authorization records. Authorization records that exceed this limit do not take effect.</p>
     * 
     * @param request FileAddPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileAddPermissionResponse
     */
    public FileAddPermissionResponse fileAddPermissionWithOptions(FileAddPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberList)) {
            body.put("member_list", request.memberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileAddPermission"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/add_permission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new FileAddPermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each drive supports a maximum of 1000 authorization records. Authorization records that exceed this limit do not take effect.</p>
     * 
     * <b>summary</b> : 
     * <p>Grants folder-level authorization. Each drive supports a maximum of 1000 authorization records. Authorization records that exceed this limit do not take effect.</p>
     * 
     * @param request FileAddPermissionRequest
     * @return FileAddPermissionResponse
     */
    public FileAddPermissionResponse fileAddPermission(FileAddPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAddPermissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom tags from a file.</p>
     * 
     * @param request FileDeleteUserTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileDeleteUserTagsResponse
     */
    public FileDeleteUserTagsResponse fileDeleteUserTagsWithOptions(FileDeleteUserTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyList)) {
            body.put("key_list", request.keyList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileDeleteUserTags"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/delete_usertags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new FileDeleteUserTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes custom tags from a file.</p>
     * 
     * @param request FileDeleteUserTagsRequest
     * @return FileDeleteUserTagsResponse
     */
    public FileDeleteUserTagsResponse fileDeleteUserTags(FileDeleteUserTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileDeleteUserTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the permission records for a file.</p>
     * 
     * @param request FileListPermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileListPermissionResponse
     */
    public FileListPermissionResponse fileListPermissionWithOptions(FileListPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileListPermission"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/list_permission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new FileListPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the permission records for a file.</p>
     * 
     * @param request FileListPermissionRequest
     * @return FileListPermissionResponse
     */
    public FileListPermissionResponse fileListPermission(FileListPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileListPermissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation performs an incremental update:</p>
     * <ul>
     * <li>If a tag with the same key already exists, its value is overwritten.</li>
     * <li>If a tag does not exist, it is added.</li>
     * <li>Existing tags with different keys are not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds custom tags to a file.</p>
     * 
     * @param request FilePutUserTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FilePutUserTagsResponse
     */
    public FilePutUserTagsResponse filePutUserTagsWithOptions(FilePutUserTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTags)) {
            body.put("user_tags", request.userTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FilePutUserTags"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/put_usertags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new FilePutUserTagsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation performs an incremental update:</p>
     * <ul>
     * <li>If a tag with the same key already exists, its value is overwritten.</li>
     * <li>If a tag does not exist, it is added.</li>
     * <li>Existing tags with different keys are not affected.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds custom tags to a file.</p>
     * 
     * @param request FilePutUserTagsRequest
     * @return FilePutUserTagsResponse
     */
    public FilePutUserTagsResponse filePutUserTags(FilePutUserTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.filePutUserTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a file sharing permission.</p>
     * 
     * @param request FileRemovePermissionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileRemovePermissionResponse
     */
    public FileRemovePermissionResponse fileRemovePermissionWithOptions(FileRemovePermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberList)) {
            body.put("member_list", request.memberList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileRemovePermission"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/remove_permission"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new FileRemovePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a file sharing permission.</p>
     * 
     * @param request FileRemovePermissionRequest
     * @return FileRemovePermissionResponse
     */
    public FileRemovePermissionResponse fileRemovePermission(FileRemovePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileRemovePermissionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about an asynchronous task.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTaskWithOptions(GetAsyncTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncTaskId)) {
            body.put("async_task_id", request.asyncTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncTask"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/async_task/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAsyncTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about an asynchronous task.</p>
     * 
     * @param request GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    public GetAsyncTaskResponse getAsyncTask(GetAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the default drive for a specified user.</p>
     * 
     * @param request GetDefaultDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDefaultDriveResponse
     */
    public GetDefaultDriveResponse getDefaultDriveWithOptions(GetDefaultDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/get_default_drive"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDefaultDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the default drive for a specified user.</p>
     * 
     * @param request GetDefaultDriveRequest
     * @return GetDefaultDriveResponse
     */
    public GetDefaultDriveResponse getDefaultDrive(GetDefaultDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDefaultDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain domain information.</p>
     * 
     * @param request GetDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(GetDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("domain_id", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getQuotaUsed)) {
            body.put("get_quota_used", request.getQuotaUsed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain domain information.</p>
     * 
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get domain quota</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainQuotaResponse
     */
    public GetDomainQuotaResponse getDomainQuotaWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainQuota"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/get_quota"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDomainQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get domain quota</p>
     * @return GetDomainQuotaResponse
     */
    public GetDomainQuotaResponse getDomainQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainQuotaWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL for a file.</p>
     * 
     * @param request GetDownloadUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDownloadUrlResponse
     */
    public GetDownloadUrlResponse getDownloadUrlWithOptions(GetDownloadUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSec)) {
            body.put("expire_sec", request.expireSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("file_name", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseContentType)) {
            body.put("response_content_type", request.responseContentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDownloadUrl"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get_download_url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the download URL for a file.</p>
     * 
     * @param request GetDownloadUrlRequest
     * @return GetDownloadUrlResponse
     */
    public GetDownloadUrlResponse getDownloadUrl(GetDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDownloadUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns information about a drive.</p>
     * 
     * @param request GetDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDriveResponse
     */
    public GetDriveResponse getDriveWithOptions(GetDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns information about a drive.</p>
     * 
     * @param request GetDriveRequest
     * @return GetDriveResponse
     */
    public GetDriveResponse getDrive(GetDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a file.</p>
     * 
     * @param request GetFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileResponse
     */
    public GetFileResponse getFileWithOptions(GetFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnailProcesses)) {
            body.put("thumbnail_processes", request.thumbnailProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Gets the details of a file.</p>
     * 
     * @param request GetFileRequest
     * @return GetFileResponse
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a group.</p>
     * 
     * @param request GetGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a group.</p>
     * 
     * @param request GetGroupRequest
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the mapping between an identity and a benefit package. Use this operation to query the benefit packages that are bound to a user.</p>
     * 
     * @param request GetIdentityToBenefitPkgMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityToBenefitPkgMappingResponse
     */
    public GetIdentityToBenefitPkgMappingResponse getIdentityToBenefitPkgMappingWithOptions(GetIdentityToBenefitPkgMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.benefitPkgId)) {
            body.put("benefit_pkg_id", request.benefitPkgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityId)) {
            body.put("identity_id", request.identityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("identity_type", request.identityType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityToBenefitPkgMapping"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/benefit/identity_to_benefit_pkg_mapping/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetIdentityToBenefitPkgMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the mapping between an identity and a benefit package. Use this operation to query the benefit packages that are bound to a user.</p>
     * 
     * @param request GetIdentityToBenefitPkgMappingRequest
     * @return GetIdentityToBenefitPkgMappingResponse
     */
    public GetIdentityToBenefitPkgMappingResponse getIdentityToBenefitPkgMapping(GetIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves account information.</p>
     * 
     * @param request GetLinkInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLinkInfoResponse
     */
    public GetLinkInfoResponse getLinkInfoWithOptions(GetLinkInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLinkInfo"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/account/get_link_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLinkInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves account information.</p>
     * 
     * @param request GetLinkInfoRequest
     * @return GetLinkInfoResponse
     */
    public GetLinkInfoResponse getLinkInfo(GetLinkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLinkInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain account information by user ID.</p>
     * 
     * @param request GetLinkInfoByUserIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLinkInfoByUserIdResponse
     */
    public GetLinkInfoByUserIdResponse getLinkInfoByUserIdWithOptions(GetLinkInfoByUserIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLinkInfoByUserId"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/account/get_link_info_by_user_id"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetLinkInfoByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain account information by user ID.</p>
     * 
     * @param request GetLinkInfoByUserIdRequest
     * @return GetLinkInfoByUserIdResponse
     */
    public GetLinkInfoByUserIdResponse getLinkInfoByUserId(GetLinkInfoByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLinkInfoByUserIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a file revision.</p>
     * 
     * @param request GetRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRevisionResponse
     */
    public GetRevisionResponse getRevisionWithOptions(GetRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionId)) {
            body.put("revision_id", request.revisionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRevision"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/revision/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetRevisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a file revision.</p>
     * 
     * @param request GetRevisionRequest
     * @return GetRevisionResponse
     */
    public GetRevisionResponse getRevision(GetRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRevisionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a share link.</p>
     * 
     * @param request GetShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetShareLinkResponse
     */
    public GetShareLinkResponse getShareLinkWithOptions(GetShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a share link.</p>
     * 
     * @param request GetShareLinkRequest
     * @return GetShareLinkResponse
     */
    public GetShareLinkResponse getShareLink(GetShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the metadata of a share link without authentication.</p>
     * 
     * @param request GetShareLinkByAnonymousRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetShareLinkByAnonymousResponse
     */
    public GetShareLinkByAnonymousResponse getShareLinkByAnonymousWithOptions(GetShareLinkByAnonymousRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShareLinkByAnonymous"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/get_by_anonymous"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetShareLinkByAnonymousResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the metadata of a share link without authentication.</p>
     * 
     * @param request GetShareLinkByAnonymousRequest
     * @return GetShareLinkByAnonymousResponse
     */
    public GetShareLinkByAnonymousResponse getShareLinkByAnonymous(GetShareLinkByAnonymousRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkByAnonymousWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A share token is required to access any shared file, including public ones that do not have a password (where the <code>share_pwd</code> parameter is empty).</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a share token anonymously.</p>
     * 
     * @param request GetShareLinkTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetShareLinkTokenResponse
     */
    public GetShareLinkTokenResponse getShareLinkTokenWithOptions(GetShareLinkTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireSec)) {
            body.put("expire_sec", request.expireSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharePwd)) {
            body.put("share_pwd", request.sharePwd);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShareLinkToken"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/get_share_token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetShareLinkTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>A share token is required to access any shared file, including public ones that do not have a password (where the <code>share_pwd</code> parameter is empty).</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a share token anonymously.</p>
     * 
     * @param request GetShareLinkTokenRequest
     * @return GetShareLinkTokenResponse
     */
    public GetShareLinkTokenResponse getShareLinkToken(GetShareLinkTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * You must activate the image processing value-added service to use this feature.
     * This operation retrieves the details of a story.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a story, including its cover and file list.</p>
     * 
     * @param request GetStoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStoryResponse
     */
    public GetStoryResponse getStoryWithOptions(GetStoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverImageThumbnailProcess)) {
            body.put("cover_image_thumbnail_process", request.coverImageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverVideoThumbnailProcess)) {
            body.put("cover_video_thumbnail_process", request.coverVideoThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            body.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrlProcess)) {
            body.put("image_url_process", request.imageUrlProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoThumbnailProcess)) {
            body.put("video_thumbnail_process", request.videoThumbnailProcess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStory"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/get_story"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * You must activate the image processing value-added service to use this feature.
     * This operation retrieves the details of a story.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a story, including its cover and file list.</p>
     * 
     * @param request GetStoryRequest
     * @return GetStoryResponse
     */
    public GetStoryResponse getStory(GetStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this API, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must activate the image processing value-added service.
     * To check the status of an asynchronous task for a value-added service, first obtain a task_id by calling an API such as <code>CreateSimilarImageClusterTask</code>. Then, call this API with the task_id to determine if the task has succeeded.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the status of an asynchronous task for a value-added service.
     * This API currently supports tasks created by operations such as <code>CreateSimilarImageClusterTask</code>.</p>
     * 
     * @param request GetTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("task_id", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/get_task_status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this API, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS</em>*.
     * To use this feature, you must activate the image processing value-added service.
     * To check the status of an asynchronous task for a value-added service, first obtain a task_id by calling an API such as <code>CreateSimilarImageClusterTask</code>. Then, call this API with the task_id to determine if the task has succeeded.</p>
     * 
     * <b>summary</b> : 
     * <p>Gets the status of an asynchronous task for a value-added service.
     * This API currently supports tasks created by operations such as <code>CreateSimilarImageClusterTask</code>.</p>
     * 
     * @param request GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the upload address.</p>
     * 
     * @param request GetUploadUrlRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadUrlResponse
     */
    public GetUploadUrlResponse getUploadUrlWithOptions(GetUploadUrlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partInfoList)) {
            body.put("part_info_list", request.partInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            body.put("upload_id", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadUrl"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get_upload_url"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetUploadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the upload address.</p>
     * 
     * @param request GetUploadUrlRequest
     * @return GetUploadUrlResponse
     */
    public GetUploadUrlResponse getUploadUrl(GetUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadUrlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves user information.</p>
     * 
     * @param request GetUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves user information.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of Cloud Drive and Photo Service.</strong></li>
     * <li>Before you call this operation, make sure that the transcoding feature for the specified category is enabled for the current domain. To enable the transcoding feature and configure transcoding templates, contact our technical support. For more information, see <a href="https://help.aliyun.com/document_detail/175917.html">Contact us</a>.</li>
     * <li>This operation is synchronous. If the requested file has not been transcoded by using the specified transcoding method, the operation returns a <strong>202 VideoPreviewWaitAndRetry</strong> response to prompt you to wait and retry. If the requested file cannot be transcoded by using the specified transcoding method, the operation returns a <strong>404 NotFound.VideoPreviewInfo</strong> response.</li>
     * <li>This operation generates transcoding data and saves it to the value-added data space of the tenant domain for end users to play audio and video online. For specific transcoding methods, this operation provides domain-level deduplicated transcoding capabilities.</li>
     * <li>When the transcoding type is quick_video, the playback URL returned by this operation contains unencoded <code>{</code> and <code>}</code> characters. When you develop applications for iOS, make sure to decode and then encode the returned URL to prevent decoding failures in the system NSURL library.</li>
     * <li>When the transcoding type is quick_video, Range Get is not supported when you obtain segment content based on the m3u8 content corresponding to the playback URL returned by this operation.
     * &lt;props=&quot;china&quot;&gt;For more information, see the Best Practices document: <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves video playback information.</p>
     * 
     * @param request GetVideoPreviewPlayInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoPreviewPlayInfoResponse
     */
    public GetVideoPreviewPlayInfoResponse getVideoPreviewPlayInfoWithOptions(GetVideoPreviewPlayInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getMasterUrl)) {
            body.put("get_master_url", request.getMasterUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getSubtitleInfo)) {
            body.put("get_subtitle_info", request.getSubtitleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getWithoutUrl)) {
            body.put("get_without_url", request.getWithoutUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reTranscode)) {
            body.put("re_transcode", request.reTranscode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("template_id", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoPreviewPlayInfo"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get_video_preview_play_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVideoPreviewPlayInfoResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of Cloud Drive and Photo Service.</strong></li>
     * <li>Before you call this operation, make sure that the transcoding feature for the specified category is enabled for the current domain. To enable the transcoding feature and configure transcoding templates, contact our technical support. For more information, see <a href="https://help.aliyun.com/document_detail/175917.html">Contact us</a>.</li>
     * <li>This operation is synchronous. If the requested file has not been transcoded by using the specified transcoding method, the operation returns a <strong>202 VideoPreviewWaitAndRetry</strong> response to prompt you to wait and retry. If the requested file cannot be transcoded by using the specified transcoding method, the operation returns a <strong>404 NotFound.VideoPreviewInfo</strong> response.</li>
     * <li>This operation generates transcoding data and saves it to the value-added data space of the tenant domain for end users to play audio and video online. For specific transcoding methods, this operation provides domain-level deduplicated transcoding capabilities.</li>
     * <li>When the transcoding type is quick_video, the playback URL returned by this operation contains unencoded <code>{</code> and <code>}</code> characters. When you develop applications for iOS, make sure to decode and then encode the returned URL to prevent decoding failures in the system NSURL library.</li>
     * <li>When the transcoding type is quick_video, Range Get is not supported when you obtain segment content based on the m3u8 content corresponding to the playback URL returned by this operation.
     * &lt;props=&quot;china&quot;&gt;For more information, see the Best Practices document: <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves video playback information.</p>
     * 
     * @param request GetVideoPreviewPlayInfoRequest
     * @return GetVideoPreviewPlayInfoResponse
     */
    public GetVideoPreviewPlayInfoResponse getVideoPreviewPlayInfo(GetVideoPreviewPlayInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoPreviewPlayInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For details, see the best practice: <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the video playback metadata.</p>
     * 
     * @param request GetVideoPreviewPlayMetaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoPreviewPlayMetaResponse
     */
    public GetVideoPreviewPlayMetaResponse getVideoPreviewPlayMetaWithOptions(GetVideoPreviewPlayMetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoPreviewPlayMeta"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/get_video_preview_play_meta"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVideoPreviewPlayMetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For details, see the best practice: <a href="https://help.aliyun.com/document_detail/427477.html">Preview videos online</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the video playback metadata.</p>
     * 
     * @param request GetVideoPreviewPlayMetaRequest
     * @return GetVideoPreviewPlayMetaResponse
     */
    public GetVideoPreviewPlayMetaResponse getVideoPreviewPlayMeta(GetVideoPreviewPlayMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoPreviewPlayMetaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update user group name</p>
     * 
     * @param request GroupUpdateNameRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GroupUpdateNameResponse
     */
    public GroupUpdateNameResponse groupUpdateNameWithOptions(GroupUpdateNameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GroupUpdateName"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/update_name"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GroupUpdateNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update user group name</p>
     * 
     * @param request GroupUpdateNameRequest
     * @return GroupUpdateNameResponse
     */
    public GroupUpdateNameResponse groupUpdateName(GroupUpdateNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.groupUpdateNameWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a user.</p>
     * 
     * @param request ImportUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportUserResponse
     */
    public ImportUserResponse importUserWithOptions(ImportUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationDisplayName)) {
            body.put("authentication_display_name", request.authenticationDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationType)) {
            body.put("authentication_type", request.authenticationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateDrive)) {
            body.put("auto_create_drive", request.autoCreateDrive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveTotalSize)) {
            body.put("drive_total_size", request.driveTotalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            body.put("nick_name", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentGroupId)) {
            body.put("parent_group_id", request.parentGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/import"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ImportUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Imports a user.</p>
     * 
     * @param request ImportUserRequest
     * @return ImportUserResponse
     */
    public ImportUserResponse importUser(ImportUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation investigates images and videos, but does not investigate their audio tracks. It captures one frame per second for an animated image (up to 100 frames), slices a long image into a maximum of 100 sections, and captures one frame every 3 seconds for a video (up to 1,500 frames). You can retrieve investigation results by calling operations such as List Files, Get File Details, and Get File Content Security Details, or receive them through event notifications. To prevent resource-related failures, do not use this operation for bulk submissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a file for investigation.</p>
     * 
     * @param request InvestigateFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvestigateFileResponse
     */
    public InvestigateFileResponse investigateFileWithOptions(InvestigateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveFileIds)) {
            body.put("drive_file_ids", request.driveFileIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvestigateFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/csi/investigate_file"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new InvestigateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation investigates images and videos, but does not investigate their audio tracks. It captures one frame per second for an animated image (up to 100 frames), slices a long image into a maximum of 100 sections, and captures one frame every 3 seconds for a video (up to 1,500 frames). You can retrieve investigation results by calling operations such as List Files, Get File Details, and Get File Content Security Details, or receive them through event notifications. To prevent resource-related failures, do not use this operation for bulk submissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a file for investigation.</p>
     * 
     * @param request InvestigateFileRequest
     * @return InvestigateFileResponse
     */
    public InvestigateFileResponse investigateFile(InvestigateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.investigateFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Links an account.</p>
     * 
     * @param request LinkAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return LinkAccountResponse
     */
    public LinkAccountResponse linkAccountWithOptions(LinkAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LinkAccount"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/account/link"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new LinkAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Links an account.</p>
     * 
     * @param request LinkAccountRequest
     * @return LinkAccountResponse
     */
    public LinkAccountResponse linkAccount(LinkAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.linkAccountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists address groups.</p>
     * 
     * @param request ListAddressGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddressGroupsResponse
     */
    public ListAddressGroupsResponse listAddressGroupsWithOptions(ListAddressGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            body.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoThumbnailProcess)) {
            body.put("video_thumbnail_process", request.videoThumbnailProcess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddressGroups"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/list_address_groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAddressGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists address groups.</p>
     * 
     * @param request ListAddressGroupsRequest
     * @return ListAddressGroupsResponse
     */
    public ListAddressGroupsResponse listAddressGroups(ListAddressGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddressGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists role assignments.</p>
     * 
     * @param request ListAssignmentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAssignmentResponse
     */
    public ListAssignmentResponse listAssignmentWithOptions(ListAssignmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceId)) {
            body.put("manage_resource_id", request.manageResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.manageResourceType)) {
            body.put("manage_resource_type", request.manageResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAssignment"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/role/list_assignment"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListAssignmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists role assignments.</p>
     * 
     * @param request ListAssignmentRequest
     * @return ListAssignmentResponse
     */
    public ListAssignmentResponse listAssignment(ListAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAssignmentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists incremental information.</p>
     * 
     * @param request ListDeltaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeltaResponse
     */
    public ListDeltaResponse listDeltaWithOptions(ListDeltaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRootId)) {
            body.put("sync_root_id", request.syncRootId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDelta"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/list_delta"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDeltaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists incremental information.</p>
     * 
     * @param request ListDeltaRequest
     * @return ListDeltaResponse
     */
    public ListDeltaResponse listDelta(ListDeltaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeltaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List domains.</p>
     * 
     * @param request ListDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDomainId)) {
            body.put("parent_domain_id", request.parentDomainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("service_code", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List domains.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists drives.</p>
     * 
     * @param request ListDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDriveResponse
     */
    public ListDriveResponse listDriveWithOptions(ListDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerType)) {
            body.put("owner_type", request.ownerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists drives.</p>
     * 
     * @param request ListDriveRequest
     * @return ListDriveResponse
     */
    public ListDriveResponse listDrive(ListDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists face groups.</p>
     * 
     * @param request ListFacegroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFacegroupsResponse
     */
    public ListFacegroupsResponse listFacegroupsWithOptions(ListFacegroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("remarks", request.remarks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnTotalCount)) {
            body.put("return_total_count", request.returnTotalCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFacegroups"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/list_facegroups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListFacegroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists face groups.</p>
     * 
     * @param request ListFacegroupsRequest
     * @return ListFacegroupsResponse
     */
    public ListFacegroupsResponse listFacegroups(ListFacegroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFacegroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the files and folders that are immediate children of a specified folder.</p>
     * 
     * @param request ListFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileResponse
     */
    public ListFileResponse listFileWithOptions(ListFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            body.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFileId)) {
            body.put("parent_file_id", request.parentFileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnailProcesses)) {
            body.put("thumbnail_processes", request.thumbnailProcesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the files and folders that are immediate children of a specified folder.</p>
     * 
     * @param request ListFileRequest
     * @return ListFileResponse
     */
    public ListFileResponse listFile(ListFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists groups.</p>
     * 
     * @param request ListGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroupWithOptions(ListGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists groups.</p>
     * 
     * @param request ListGroupRequest
     * @return ListGroupResponse
     */
    public ListGroupResponse listGroup(ListGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists group members.</p>
     * 
     * @param request ListGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupMemberResponse
     */
    public ListGroupMemberResponse listGroupMemberWithOptions(ListGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("member_type", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupMember"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/list_member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists group members.</p>
     * 
     * @param request ListGroupMemberRequest
     * @return ListGroupMemberResponse
     */
    public ListGroupMemberResponse listGroupMember(ListGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户或团队已分配的角色列表</p>
     * 
     * @param request ListIdentityRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityRoleResponse
     */
    public ListIdentityRoleResponse listIdentityRoleWithOptions(ListIdentityRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityRole"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/role/list_identity_role"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListIdentityRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列举用户或团队已分配的角色列表</p>
     * 
     * @param request ListIdentityRoleRequest
     * @return ListIdentityRoleResponse
     */
    public ListIdentityRoleResponse listIdentityRole(ListIdentityRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the mappings between identities and benefit packages. Use this API to retrieve the benefit packages bound to a user.</p>
     * 
     * @param request ListIdentityToBenefitPkgMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityToBenefitPkgMappingResponse
     */
    public ListIdentityToBenefitPkgMappingResponse listIdentityToBenefitPkgMappingWithOptions(ListIdentityToBenefitPkgMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityId)) {
            body.put("identity_id", request.identityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("identity_type", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeExpired)) {
            body.put("include_expired", request.includeExpired);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityToBenefitPkgMapping"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/benefit/identity_to_benefit_pkg_mapping/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListIdentityToBenefitPkgMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the mappings between identities and benefit packages. Use this API to retrieve the benefit packages bound to a user.</p>
     * 
     * @param request ListIdentityToBenefitPkgMappingRequest
     * @return ListIdentityToBenefitPkgMappingResponse
     */
    public ListIdentityToBenefitPkgMappingResponse listIdentityToBenefitPkgMapping(ListIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of Drives for the logged-in user.</p>
     * 
     * @param request ListMyDrivesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMyDrivesResponse
     */
    public ListMyDrivesResponse listMyDrivesWithOptions(ListMyDrivesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMyDrives"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/list_my_drives"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMyDrivesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of Drives for the logged-in user.</p>
     * 
     * @param request ListMyDrivesRequest
     * @return ListMyDrivesResponse
     */
    public ListMyDrivesResponse listMyDrives(ListMyDrivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMyDrivesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorized group drives.</p>
     * 
     * @param request ListMyGroupDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMyGroupDriveResponse
     */
    public ListMyGroupDriveResponse listMyGroupDriveWithOptions(ListMyGroupDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveName)) {
            body.put("drive_name", request.driveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMyGroupDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/list_my_group_drive"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListMyGroupDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorized group drives.</p>
     * 
     * @param request ListMyGroupDriveRequest
     * @return ListMyGroupDriveResponse
     */
    public ListMyGroupDriveResponse listMyGroupDrive(ListMyGroupDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMyGroupDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists files shared with the current user from a personal space.</p>
     * 
     * @param request ListReceivedFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReceivedFileResponse
     */
    public ListReceivedFileResponse listReceivedFileWithOptions(ListReceivedFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReceivedFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/list_received_file"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListReceivedFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists files shared with the current user from a personal space.</p>
     * 
     * @param request ListReceivedFileRequest
     * @return ListReceivedFileResponse
     */
    public ListReceivedFileResponse listReceivedFile(ListReceivedFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReceivedFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the files and folders in the recycle bin.</p>
     * 
     * @param request ListRecyclebinRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecyclebinResponse
     */
    public ListRecyclebinResponse listRecyclebinWithOptions(ListRecyclebinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnailProcesses)) {
            body.put("thumbnail_processes", request.thumbnailProcesses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecyclebin"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/recyclebin/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListRecyclebinResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the files and folders in the recycle bin.</p>
     * 
     * @param request ListRecyclebinRequest
     * @return ListRecyclebinResponse
     */
    public ListRecyclebinResponse listRecyclebin(ListRecyclebinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecyclebinWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the revisions of a file.</p>
     * 
     * @param request ListRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRevisionResponse
     */
    public ListRevisionResponse listRevisionWithOptions(ListRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRevision"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/revision/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListRevisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the revisions of a file.</p>
     * 
     * @param request ListRevisionRequest
     * @return ListRevisionResponse
     */
    public ListRevisionResponse listRevision(ListRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRevisionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deprecated. Use <code>SearchShareLink</code> instead.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists shares.</p>
     * 
     * @param request ListShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListShareLinkResponse
     */
    public ListShareLinkResponse listShareLinkWithOptions(ListShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeCancelled)) {
            body.put("include_cancelled", request.includeCancelled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("order_direction", request.orderDirection);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListShareLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deprecated. Use <code>SearchShareLink</code> instead.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists shares.</p>
     * 
     * @param request ListShareLinkRequest
     * @return ListShareLinkResponse
     */
    public ListShareLinkResponse listShareLink(ListShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns the top 2,000 tag groups for a specified drive, sorted by the number of photos in each group.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tag groups.</p>
     * 
     * @param request ListTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagsResponse
     */
    public ListTagsResponse listTagsWithOptions(ListTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            body.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoThumbnailProcess)) {
            body.put("video_thumbnail_process", request.videoThumbnailProcess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTags"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/list_tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListTagsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation returns the top 2,000 tag groups for a specified drive, sorted by the number of photos in each group.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists tag groups.</p>
     * 
     * @param request ListTagsRequest
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the parts that have been successfully uploaded for a specific multipart upload.</p>
     * 
     * @param request ListUploadedPartsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUploadedPartsResponse
     */
    public ListUploadedPartsResponse listUploadedPartsWithOptions(ListUploadedPartsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partNumberMarker)) {
            body.put("part_number_marker", request.partNumberMarker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            body.put("upload_id", request.uploadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUploadedParts"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/list_uploaded_parts"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListUploadedPartsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the parts that have been successfully uploaded for a specific multipart upload.</p>
     * 
     * @param request ListUploadedPartsRequest
     * @return ListUploadedPartsResponse
     */
    public ListUploadedPartsResponse listUploadedParts(ListUploadedPartsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUploadedPartsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists users.</p>
     * 
     * @param request ListUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserResponse
     */
    public ListUserResponse listUserWithOptions(ListUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ListUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists users.</p>
     * 
     * @param request ListUserRequest
     * @return ListUserResponse
     */
    public ListUserResponse listUser(ListUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file or folder.</p>
     * 
     * @param request MoveFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveFileResponse
     */
    public MoveFileResponse moveFileWithOptions(MoveFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkNameMode)) {
            body.put("check_name_mode", request.checkNameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toParentFileId)) {
            body.put("to_parent_file_id", request.toParentFileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/move"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new MoveFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file or folder.</p>
     * 
     * @param request MoveFileRequest
     * @return MoveFileResponse
     */
    public MoveFileResponse moveFile(MoveFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Penalty information file.</p>
     * 
     * @param request PunishFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PunishFileResponse
     */
    public PunishFileResponse punishFileWithOptions(PunishFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            body.put("action_code", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.punishReason)) {
            body.put("punish_reason", request.punishReason);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PunishFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/csi/business/punish_file"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new PunishFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Penalty information file.</p>
     * 
     * @param request PunishFileRequest
     * @return PunishFileResponse
     */
    public PunishFileResponse punishFile(PunishFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.punishFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询凌霄订单价格</p>
     * 
     * @param request QueryOrderPriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderPriceResponse
     */
    public QueryOrderPriceResponse queryOrderPriceWithOptions(QueryOrderPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("commodity_code", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            body.put("from_app", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            body.put("order_type", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._package)) {
            body.put("package", request._package);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("period_unit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSize)) {
            body.put("total_size", request.totalSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCount)) {
            body.put("user_count", request.userCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderPrice"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/query_order_price"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new QueryOrderPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询凌霄订单价格</p>
     * 
     * @param request QueryOrderPriceRequest
     * @return QueryOrderPriceResponse
     */
    public QueryOrderPriceResponse queryOrderPrice(QueryOrderPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOrderPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a file from a face group.</p>
     * 
     * @param request RemoveFaceGroupFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFaceGroupFileResponse
     */
    public RemoveFaceGroupFileResponse removeFaceGroupFileWithOptions(RemoveFaceGroupFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupId)) {
            body.put("face_group_id", request.faceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFaceGroupFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/albums/unassign_facegroup_item"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveFaceGroupFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a file from a face group.</p>
     * 
     * @param request RemoveFaceGroupFileRequest
     * @return RemoveFaceGroupFileResponse
     */
    public RemoveFaceGroupFileResponse removeFaceGroupFile(RemoveFaceGroupFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFaceGroupFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a member from a group.</p>
     * 
     * @param request RemoveGroupMemberRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveGroupMemberResponse
     */
    public RemoveGroupMemberResponse removeGroupMemberWithOptions(RemoveGroupMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("member_id", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberType)) {
            body.put("member_type", request.memberType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveGroupMember"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/remove_member"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveGroupMemberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a member from a group.</p>
     * 
     * @param request RemoveGroupMemberRequest
     * @return RemoveGroupMemberResponse
     */
    public RemoveGroupMemberResponse removeGroupMember(RemoveGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeGroupMemberWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand PDS billing and review its <a href="https://help.aliyun.com/document_detail/425220.html">Pricing</a>.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * After you create a story, you can remove unwanted files from it as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more files from a specified story.</p>
     * 
     * @param request RemoveStoryFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveStoryFilesResponse
     */
    public RemoveStoryFilesResponse removeStoryFilesWithOptions(RemoveStoryFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveStoryFiles"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/remove_story_files"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RemoveStoryFilesResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, ensure you understand PDS billing and review its <a href="https://help.aliyun.com/document_detail/425220.html">Pricing</a>.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * After you create a story, you can remove unwanted files from it as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more files from a specified story.</p>
     * 
     * @param request RemoveStoryFilesRequest
     * @return RemoveStoryFilesResponse
     */
    public RemoveStoryFilesResponse removeStoryFiles(RemoveStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeStoryFilesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores a file or folder from the recycle bin.</p>
     * 
     * @param request RestoreFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreFileResponse
     */
    public RestoreFileResponse restoreFileWithOptions(RestoreFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/recyclebin/restore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RestoreFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restores a file or folder from the recycle bin.</p>
     * 
     * @param request RestoreFileRequest
     * @return RestoreFileResponse
     */
    public RestoreFileResponse restoreFile(RestoreFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores a historical revision of a file, making it the latest revision. This action creates a new revision, and the original historical revision remains unchanged. You cannot restore the latest revision.</p>
     * 
     * @param request RestoreRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreRevisionResponse
     */
    public RestoreRevisionResponse restoreRevisionWithOptions(RestoreRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionId)) {
            body.put("revision_id", request.revisionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreRevision"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/revision/restore"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new RestoreRevisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restores a historical revision of a file, making it the latest revision. This action creates a new revision, and the original historical revision remains unchanged. You cannot restore the latest revision.</p>
     * 
     * @param request RestoreRevisionRequest
     * @return RestoreRevisionResponse
     */
    public RestoreRevisionResponse restoreRevision(RestoreRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreRevisionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scans a file.</p>
     * 
     * @param request ScanFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanFileResponse
     */
    public ScanFileResponse scanFileWithOptions(ScanFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/scan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new ScanFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scans a file.</p>
     * 
     * @param request ScanFileRequest
     * @return ScanFileResponse
     */
    public ScanFileResponse scanFile(ScanFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for address groups based on a list of locations or a geographic area.</p>
     * 
     * @param request SearchAddressGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAddressGroupsResponse
     */
    public SearchAddressGroupsResponse searchAddressGroupsWithOptions(SearchAddressGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressLevel)) {
            body.put("address_level", request.addressLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addressNames)) {
            body.put("address_names", request.addressNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brGeoPoint)) {
            body.put("br_geo_point", request.brGeoPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            body.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlGeoPoint)) {
            body.put("tl_geo_point", request.tlGeoPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoThumbnailProcess)) {
            body.put("video_thumbnail_process", request.videoThumbnailProcess);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAddressGroups"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/search_address_groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchAddressGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for address groups based on a list of locations or a geographic area.</p>
     * 
     * @param request SearchAddressGroupsRequest
     * @return SearchAddressGroupsResponse
     */
    public SearchAddressGroupsResponse searchAddressGroups(SearchAddressGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchAddressGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for domains</p>
     * 
     * @param request SearchDomainsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchDomainsResponse
     */
    public SearchDomainsResponse searchDomainsWithOptions(SearchDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchDomains"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for domains</p>
     * 
     * @param request SearchDomainsRequest
     * @return SearchDomainsResponse
     */
    public SearchDomainsResponse searchDomains(SearchDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDomainsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for drives.</p>
     * 
     * @param request SearchDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchDriveResponse
     */
    public SearchDriveResponse searchDriveWithOptions(SearchDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveName)) {
            body.put("drive_name", request.driveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerType)) {
            body.put("owner_type", request.ownerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for drives.</p>
     * 
     * @param request SearchDriveRequest
     * @return SearchDriveResponse
     */
    public SearchDriveResponse searchDrive(SearchDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For best practices, see <a href="https://help.aliyun.com/document_detail/175890.html">Search files</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for files.</p>
     * 
     * @param request SearchFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchFileResponse
     */
    public SearchFileResponse searchFileWithOptions(SearchFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fields)) {
            body.put("fields", request.fields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            body.put("recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnTotalCount)) {
            body.put("return_total_count", request.returnTotalCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnailProcesses)) {
            body.put("thumbnail_processes", request.thumbnailProcesses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For best practices, see <a href="https://help.aliyun.com/document_detail/175890.html">Search files</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for files.</p>
     * 
     * @param request SearchFileRequest
     * @return SearchFileResponse
     */
    public SearchFileResponse searchFile(SearchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for shares.</p>
     * 
     * @param request SearchShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchShareLinkResponse
     */
    public SearchShareLinkResponse searchShareLinkWithOptions(SearchShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creators)) {
            body.put("creators", request.creators);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("order_by", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("order_direction", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnTotalCount)) {
            body.put("return_total_count", request.returnTotalCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for shares.</p>
     * 
     * @param request SearchShareLinkRequest
     * @return SearchShareLinkResponse
     */
    public SearchShareLinkResponse searchShareLink(SearchShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * To query for similar image cluster results, you must first call the CreateSimilarImageClusterTask API to create a clustering task and obtain its task_id. Then, call the GetTaskStatus API to confirm that the task has succeeded. You can then call the SearchSimilarImageClusters API to retrieve the results.</p>
     * <blockquote>
     * <p>Notice: 
     * \- If you call this API before a clustering task has run, the API returns an empty list.
     * \- Similar image clustering tasks update clustering results incrementally. If the current clustering task is not yet complete, the API returns the results from the last successful task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves similar image clusters in a specified drive.</p>
     * 
     * @param request SearchSimilarImageClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchSimilarImageClustersResponse
     */
    public SearchSimilarImageClustersResponse searchSimilarImageClustersWithOptions(SearchSimilarImageClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageThumbnailProcess)) {
            body.put("image_thumbnail_process", request.imageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchSimilarImageClusters"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/query_similar_image_clusters"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchSimilarImageClustersResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this API, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * To query for similar image cluster results, you must first call the CreateSimilarImageClusterTask API to create a clustering task and obtain its task_id. Then, call the GetTaskStatus API to confirm that the task has succeeded. You can then call the SearchSimilarImageClusters API to retrieve the results.</p>
     * <blockquote>
     * <p>Notice: 
     * \- If you call this API before a clustering task has run, the API returns an empty list.
     * \- Similar image clustering tasks update clustering results incrementally. If the current clustering task is not yet complete, the API returns the results from the last successful task.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves similar image clusters in a specified drive.</p>
     * 
     * @param request SearchSimilarImageClustersRequest
     * @return SearchSimilarImageClustersResponse
     */
    public SearchSimilarImageClustersResponse searchSimilarImageClusters(SearchSimilarImageClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchSimilarImageClustersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, ensure you understand PDS billing and its <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a>.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * Before you retrieve a list of stories, you must call the CreateStory or CreateCustomizedStory operation. Otherwise, an empty list is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves stories from a specified drive that match the specified conditions.</p>
     * 
     * @param request SearchStoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchStoriesResponse
     */
    public SearchStoriesResponse searchStoriesWithOptions(SearchStoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverImageThumbnailProcess)) {
            body.put("cover_image_thumbnail_process", request.coverImageThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverVideoThumbnailProcess)) {
            body.put("cover_video_thumbnail_process", request.coverVideoThumbnailProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeRange)) {
            body.put("create_time_range", request.createTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            body.put("custom_labels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faceGroupIds)) {
            body.put("face_group_ids", request.faceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            body.put("sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyEndTimeRange)) {
            body.put("story_end_time_range", request.storyEndTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("story_name", request.storyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyStartTimeRange)) {
            body.put("story_start_time_range", request.storyStartTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyType)) {
            body.put("story_type", request.storyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urlExpireSec)) {
            body.put("url_expire_sec", request.urlExpireSec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withEmptyStories)) {
            body.put("with_empty_stories", request.withEmptyStories);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchStories"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/find_stories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchStoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before using this operation, ensure you understand PDS billing and its <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a>.</em>*
     * To use this feature, you must enable the image processing value-added service.
     * Before you retrieve a list of stories, you must call the CreateStory or CreateCustomizedStory operation. Otherwise, an empty list is returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves stories from a specified drive that match the specified conditions.</p>
     * 
     * @param request SearchStoriesRequest
     * @return SearchStoriesResponse
     */
    public SearchStoriesResponse searchStories(SearchStoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchStoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for users.</p>
     * 
     * @param request SearchUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchUserResponse
     */
    public SearchUserResponse searchUserWithOptions(SearchUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            body.put("marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            body.put("nick_name", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickNameForFuzzy)) {
            body.put("nick_name_for_fuzzy", request.nickNameForFuzzy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for users.</p>
     * 
     * @param request SearchUserRequest
     * @return SearchUserResponse
     */
    public SearchUserResponse searchUser(SearchUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For more information, see the <a href="https://help.aliyun.com/document_detail/175894.html">user guide</a>.
     * &lt;props=&quot;china&quot;&gt;
     * For details on JWT-based logon, see <a href="https://help.aliyun.com/document_detail/175893.html">JWT-based logon</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For more information, see the <a href="https://www.alibabacloud.com/help/zh/pds/latest/oauth2-for-web-server-app?spm=a2c63.p38356.0.0.267148fbJdRB0P">user guide</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For details on JWT-based logon, see <a href="https://www.alibabacloud.com/help/zh/pds/latest/jwt-application?spm=a2c63.p38356.0.0.45ab5f06NnPJqj">JWT-based logon</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token as part of the OAuth 2.0 authorization flow.</p>
     * 
     * @param request TokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TokenResponse
     */
    public TokenResponse tokenWithOptions(TokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assertion)) {
            body.put("assertion", request.assertion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            body.put("client_secret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            body.put("grant_type", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUri)) {
            body.put("redirect_uri", request.redirectUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            body.put("refresh_token", request.refreshToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Token"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/oauth/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new TokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * For more information, see the <a href="https://help.aliyun.com/document_detail/175894.html">user guide</a>.
     * &lt;props=&quot;china&quot;&gt;
     * For details on JWT-based logon, see <a href="https://help.aliyun.com/document_detail/175893.html">JWT-based logon</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For more information, see the <a href="https://www.alibabacloud.com/help/zh/pds/latest/oauth2-for-web-server-app?spm=a2c63.p38356.0.0.267148fbJdRB0P">user guide</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * For details on JWT-based logon, see <a href="https://www.alibabacloud.com/help/zh/pds/latest/jwt-application?spm=a2c63.p38356.0.0.45ab5f06NnPJqj">JWT-based logon</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token as part of the OAuth 2.0 authorization flow.</p>
     * 
     * @param request TokenRequest
     * @return TokenResponse
     */
    public TokenResponse token(TokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file or folder to the trash.</p>
     * 
     * @param request TrashFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TrashFileResponse
     */
    public TrashFileResponse trashFileWithOptions(TrashFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrashFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/recyclebin/trash"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new TrashFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a file or folder to the trash.</p>
     * 
     * @param request TrashFileRequest
     * @return TrashFileResponse
     */
    public TrashFileResponse trashFile(TrashFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trashFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlinks a specified identity from a user account.</p>
     * 
     * @param request UnLinkAccountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnLinkAccountResponse
     */
    public UnLinkAccountResponse unLinkAccountWithOptions(UnLinkAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extra)) {
            body.put("extra", request.extra);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnLinkAccount"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/account/unlink"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UnLinkAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unlinks a specified identity from a user account.</p>
     * 
     * @param request UnLinkAccountRequest
     * @return UnLinkAccountResponse
     */
    public UnLinkAccountResponse unLinkAccount(UnLinkAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unLinkAccountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update domain information.</p>
     * 
     * @param request UpdateDomainRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomainWithOptions(UpdateDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("domain_id", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("domain_name", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initDriveEnable)) {
            body.put("init_drive_enable", request.initDriveEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initDriveSize)) {
            body.put("init_drive_size", request.initDriveSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishedAppAccessStrategy)) {
            body.put("published_app_access_strategy", request.publishedAppAccessStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sizeQuota)) {
            body.put("size_quota", request.sizeQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCountQuota)) {
            body.put("user_count_quota", request.userCountQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomain"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/domain/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update domain information.</p>
     * 
     * @param request UpdateDomainRequest
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDomainWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies drive information.</p>
     * 
     * @param request UpdateDriveRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDriveResponse
     */
    public UpdateDriveResponse updateDriveWithOptions(UpdateDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveName)) {
            body.put("drive_name", request.driveName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            body.put("owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalSize)) {
            body.put("total_size", request.totalSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDrive"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/drive/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateDriveResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies drive information.</p>
     * 
     * @param request UpdateDriveRequest
     * @return UpdateDriveResponse
     */
    public UpdateDriveResponse updateDrive(UpdateDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDriveWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information for a specified face group.</p>
     * 
     * @param request UpdateFacegroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFacegroupResponse
     */
    public UpdateFacegroupResponse updateFacegroupWithOptions(UpdateFacegroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupCoverFaceId)) {
            body.put("group_cover_face_id", request.groupCoverFaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("group_name", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("remarks", request.remarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFacegroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/update_facegroup_info"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFacegroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information for a specified face group.</p>
     * 
     * @param request UpdateFacegroupRequest
     * @return UpdateFacegroupResponse
     */
    public UpdateFacegroupResponse updateFacegroup(UpdateFacegroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFacegroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the metadata of a file without modifying its content.</p>
     * 
     * @param request UpdateFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFileWithOptions(UpdateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkNameMode)) {
            body.put("check_name_mode", request.checkNameMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hidden)) {
            body.put("hidden", request.hidden);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localModifiedAt)) {
            body.put("local_modified_at", request.localModifiedAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.starred)) {
            body.put("starred", request.starred);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFile"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the metadata of a file without modifying its content.</p>
     * 
     * @param request UpdateFileRequest
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a specified group.</p>
     * 
     * @param request UpdateGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("group_id", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("group_name", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/group/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a specified group.</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the association between an identity and a benefit package. Use this operation to assign a benefit package to a user.</p>
     * 
     * @param request UpdateIdentityToBenefitPkgMappingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityToBenefitPkgMappingResponse
     */
    public UpdateIdentityToBenefitPkgMappingResponse updateIdentityToBenefitPkgMappingWithOptions(UpdateIdentityToBenefitPkgMappingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.benefitPkgId)) {
            body.put("benefit_pkg_id", request.benefitPkgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            body.put("expire_time", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityId)) {
            body.put("identity_id", request.identityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            body.put("identity_type", request.identityType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityToBenefitPkgMapping"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/benefit/identity_to_benefit_pkg_mapping/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateIdentityToBenefitPkgMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the association between an identity and a benefit package. Use this operation to assign a benefit package to a user.</p>
     * 
     * @param request UpdateIdentityToBenefitPkgMappingRequest
     * @return UpdateIdentityToBenefitPkgMappingResponse
     */
    public UpdateIdentityToBenefitPkgMappingResponse updateIdentityToBenefitPkgMapping(UpdateIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information for a revision. You can set a revision to be kept forever or add a description. A maximum of 50 revisions per file can be kept forever.</p>
     * 
     * @param request UpdateRevisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRevisionResponse
     */
    public UpdateRevisionResponse updateRevisionWithOptions(UpdateRevisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            body.put("file_id", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepForever)) {
            body.put("keep_forever", request.keepForever);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionDescription)) {
            body.put("revision_description", request.revisionDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revisionId)) {
            body.put("revision_id", request.revisionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRevision"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/revision/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateRevisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates information for a revision. You can set a revision to be kept forever or add a description. A maximum of 50 revisions per file can be kept forever.</p>
     * 
     * @param request UpdateRevisionRequest
     * @return UpdateRevisionResponse
     */
    public UpdateRevisionResponse updateRevision(UpdateRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRevisionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a share link.</p>
     * 
     * @param request UpdateShareLinkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateShareLinkResponse
     */
    public UpdateShareLinkResponse updateShareLinkWithOptions(UpdateShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableDownload)) {
            body.put("disable_download", request.disableDownload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disablePreview)) {
            body.put("disable_preview", request.disablePreview);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableSave)) {
            body.put("disable_save", request.disableSave);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadCount)) {
            body.put("download_count", request.downloadCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.downloadLimit)) {
            body.put("download_limit", request.downloadLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            body.put("expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeEditable)) {
            body.put("office_editable", request.officeEditable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewCount)) {
            body.put("preview_count", request.previewCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewLimit)) {
            body.put("preview_limit", request.previewLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportCount)) {
            body.put("report_count", request.reportCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveCount)) {
            body.put("save_count", request.saveCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saveLimit)) {
            body.put("save_limit", request.saveLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareId)) {
            body.put("share_id", request.shareId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareName)) {
            body.put("share_name", request.shareName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharePwd)) {
            body.put("share_pwd", request.sharePwd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPreviewCount)) {
            body.put("video_preview_count", request.videoPreviewCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateShareLink"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/share_link/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateShareLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a share link.</p>
     * 
     * @param request UpdateShareLinkRequest
     * @return UpdateShareLinkResponse
     */
    public UpdateShareLinkResponse updateShareLink(UpdateShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateShareLinkWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * This feature requires the image processing value-added service.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified story, including its name, tags, and cover.</p>
     * 
     * @param request UpdateStoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStoryResponse
     */
    public UpdateStoryResponse updateStoryWithOptions(UpdateStoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cover)) {
            body.put("cover", request.cover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customLabels)) {
            body.put("custom_labels", request.customLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.driveId)) {
            body.put("drive_id", request.driveId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyId)) {
            body.put("story_id", request.storyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storyName)) {
            body.put("story_name", request.storyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStory"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/image/update_story"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateStoryResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, ensure you understand the billing methods and <a href="https://help.aliyun.com/document_detail/425220.html">pricing</a> of PDS.</em>*
     * This feature requires the image processing value-added service.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified story, including its name, tags, and cover.</p>
     * 
     * @param request UpdateStoryRequest
     * @return UpdateStoryResponse
     */
    public UpdateStoryResponse updateStory(UpdateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies user information.</p>
     * 
     * @param request UpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupInfoList)) {
            body.put("group_info_list", request.groupInfoList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            body.put("nick_name", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("user_data", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/user/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies user information.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Acquires a DRM license for a video.</p>
     * 
     * @param request VideoDRMLicenseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return VideoDRMLicenseResponse
     */
    public VideoDRMLicenseResponse videoDRMLicenseWithOptions(VideoDRMLicenseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.drmType)) {
            body.put("drmType", request.drmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseRequest)) {
            body.put("licenseRequest", request.licenseRequest);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VideoDRMLicense"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/file/video_drm_license"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new VideoDRMLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Acquires a DRM license for a video.</p>
     * 
     * @param request VideoDRMLicenseRequest
     * @return VideoDRMLicenseResponse
     */
    public VideoDRMLicenseResponse videoDRMLicense(VideoDRMLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.videoDRMLicenseWithOptions(request, headers, runtime);
    }
}

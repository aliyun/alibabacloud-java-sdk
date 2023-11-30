// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301;

import com.aliyun.tea.*;
import com.aliyun.pds20220301.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public com.aliyun.gateway.spi.Client _client;
    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._client = new com.aliyun.gateway.pds.Client();
        this._spi = _client;
        this._signatureAlgorithm = "v2";
        this._endpointRule = "";
    }


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

    public AddGroupMemberResponse addGroupMember(AddGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGroupMemberWithOptions(request, headers, runtime);
    }

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

    public AddStoryFilesResponse addStoryFiles(AddStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addStoryFilesWithOptions(request, headers, runtime);
    }

    /**
      * You can call this operation to assign a group administrator role to a user.
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
      * You can call this operation to assign a group administrator role to a user.
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
      * For more information, see "OAuth 2.0 For Web Server Applications" at [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/en/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications) in User Guide.
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
      * For more information, see "OAuth 2.0 For Web Server Applications" at [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/en/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications) in User Guide.
      *
      * @param request AuthorizeRequest
      * @return AuthorizeResponse
     */
    public AuthorizeResponse authorize(AuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authorizeWithOptions(request, headers, runtime);
    }

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

    public BatchResponse batch(BatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchWithOptions(request, headers, runtime);
    }

    /**
      * You can cancel only the group administrator role.
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
      * You can cancel only the group administrator role.
      *
      * @param request CancelAssignRoleRequest
      * @return CancelAssignRoleResponse
     */
    public CancelAssignRoleResponse cancelAssignRole(CancelAssignRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAssignRoleWithOptions(request, headers, runtime);
    }

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

    public CancelShareLinkResponse cancelShareLink(CancelShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelShareLinkWithOptions(request, headers, runtime);
    }

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

    public ClearRecyclebinResponse clearRecyclebin(ClearRecyclebinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.clearRecyclebinWithOptions(request, headers, runtime);
    }

    public CompleteFileResponse completeFileWithOptions(CompleteFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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

    public CompleteFileResponse completeFile(CompleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.completeFileWithOptions(request, headers, runtime);
    }

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

    public CopyFileResponse copyFile(CopyFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.copyFileWithOptions(request, headers, runtime);
    }

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

    public CreateCustomizedStoryResponse createCustomizedStory(CreateCustomizedStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomizedStoryWithOptions(request, headers, runtime);
    }

    /**
      * If you want to perform secondary operations based on Drive and Photo Service and perform fine-grained control on your tenants, you can use the parent-child domain feature of Drive and Photo Service. For more information, join the DingTalk group whose ID is 23146118.
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
      * If you want to perform secondary operations based on Drive and Photo Service and perform fine-grained control on your tenants, you can use the parent-child domain feature of Drive and Photo Service. For more information, join the DingTalk group whose ID is 23146118.
      *
      * @param request CreateDomainRequest
      * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDomainWithOptions(request, headers, runtime);
    }

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

    public CreateDriveResponse createDrive(CreateDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDriveWithOptions(request, headers, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.imageMediaMetadata)) {
            body.put("image_media_metadata", request.imageMediaMetadata);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userTags)) {
            body.put("user_tags", request.userTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoMediaMetadata)) {
            body.put("video_media_metadata", request.videoMediaMetadata);
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

    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileWithOptions(request, headers, runtime);
    }

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

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupWithOptions(request, headers, runtime);
    }

    /**
      * If you need to manage a large number of users based on Drive and Photo Service, you can control the features and quotas that users can use based on the benefits to which they are entitled. For more information, join the DingTalk group (ID 23146118).
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
      * If you need to manage a large number of users based on Drive and Photo Service, you can control the features and quotas that users can use based on the benefits to which they are entitled. For more information, join the DingTalk group (ID 23146118).
      *
      * @param request CreateIdentityToBenefitPkgMappingRequest
      * @return CreateIdentityToBenefitPkgMappingResponse
     */
    public CreateIdentityToBenefitPkgMappingResponse createIdentityToBenefitPkgMapping(CreateIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("auto_pay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("auto_renew", request.autoRenew);
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

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderWithOptions(request, headers, runtime);
    }

    /**
      * A share is a file view container. You can grant anonymous users the permissions to access files in the user drive by using the share URL. Anonymous users can access the files based on the granted permissions.
      *
      * @param request CreateShareLinkRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateShareLinkResponse
     */
    public CreateShareLinkResponse createShareLinkWithOptions(CreateShareLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
      * A share is a file view container. You can grant anonymous users the permissions to access files in the user drive by using the share URL. Anonymous users can access the files based on the granted permissions.
      *
      * @param request CreateShareLinkRequest
      * @return CreateShareLinkResponse
     */
    public CreateShareLinkResponse createShareLink(CreateShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createShareLinkWithOptions(request, headers, runtime);
    }

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

    public CreateSimilarImageClusterTaskResponse createSimilarImageClusterTask(CreateSimilarImageClusterTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSimilarImageClusterTaskWithOptions(request, headers, runtime);
    }

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

    public CreateStoryResponse createStory(CreateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStoryWithOptions(request, headers, runtime);
    }

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

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(request, headers, runtime);
    }

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

    public CsiGetFileInfoResponse csiGetFileInfo(CsiGetFileInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.csiGetFileInfoWithOptions(request, headers, runtime);
    }

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

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDomainWithOptions(request, headers, runtime);
    }

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

    public DeleteDriveResponse deleteDrive(DeleteDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDriveWithOptions(request, headers, runtime);
    }

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

    public DeleteFileResponse deleteFile(DeleteFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFileWithOptions(request, headers, runtime);
    }

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

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteGroupWithOptions(request, headers, runtime);
    }

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

    public DeleteRevisionResponse deleteRevision(DeleteRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRevisionWithOptions(request, headers, runtime);
    }

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

    public DeleteStoryResponse deleteStory(DeleteStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteStoryWithOptions(request, headers, runtime);
    }

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

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteUserWithOptions(request, headers, runtime);
    }

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

    public DeltaGetLastCursorResponse deltaGetLastCursor(DeltaGetLastCursorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deltaGetLastCursorWithOptions(request, headers, runtime);
    }

    /**
      * For information about best practices for downloading a file.
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
      * For information about best practices for downloading a file.
      *
      * @param request DownloadFileRequest
      * @return DownloadFileResponse
     */
    public DownloadFileResponse downloadFile(DownloadFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadFileWithOptions(request, headers, runtime);
    }

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

    public FileAddPermissionResponse fileAddPermission(FileAddPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileAddPermissionWithOptions(request, headers, runtime);
    }

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

    public FileDeleteUserTagsResponse fileDeleteUserTags(FileDeleteUserTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileDeleteUserTagsWithOptions(request, headers, runtime);
    }

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

    public FileListPermissionResponse fileListPermission(FileListPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileListPermissionWithOptions(request, headers, runtime);
    }

    /**
      * This operation is an incremental update operation. Take note of the following items:
      * *   If a tag name specified in the request is the same as an existing tag name, the existing tag is overwritten.
      * *   If a tag name specified in the request is different from the existing tag names, the specified tag is added.
      * *   The existing tags with unique names are not affected.
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
      * This operation is an incremental update operation. Take note of the following items:
      * *   If a tag name specified in the request is the same as an existing tag name, the existing tag is overwritten.
      * *   If a tag name specified in the request is different from the existing tag names, the specified tag is added.
      * *   The existing tags with unique names are not affected.
      *
      * @param request FilePutUserTagsRequest
      * @return FilePutUserTagsResponse
     */
    public FilePutUserTagsResponse filePutUserTags(FilePutUserTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.filePutUserTagsWithOptions(request, headers, runtime);
    }

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

    public FileRemovePermissionResponse fileRemovePermission(FileRemovePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileRemovePermissionWithOptions(request, headers, runtime);
    }

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

    public GetAsyncTaskResponse getAsyncTask(GetAsyncTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncTaskWithOptions(request, headers, runtime);
    }

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

    public GetDefaultDriveResponse getDefaultDrive(GetDefaultDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDefaultDriveWithOptions(request, headers, runtime);
    }

    public GetDomainResponse getDomainWithOptions(GetDomainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            body.put("domain_id", request.domainId);
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

    public GetDomainResponse getDomain(GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainWithOptions(request, headers, runtime);
    }

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

    public GetDomainQuotaResponse getDomainQuota() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDomainQuotaWithOptions(headers, runtime);
    }

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

    public GetDownloadUrlResponse getDownloadUrl(GetDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDownloadUrlWithOptions(request, headers, runtime);
    }

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

    public GetDriveResponse getDrive(GetDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDriveWithOptions(request, headers, runtime);
    }

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

    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileWithOptions(request, headers, runtime);
    }

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

    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGroupWithOptions(request, headers, runtime);
    }

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

    public GetIdentityToBenefitPkgMappingResponse getIdentityToBenefitPkgMapping(GetIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

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

    public GetLinkInfoResponse getLinkInfo(GetLinkInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLinkInfoWithOptions(request, headers, runtime);
    }

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

    public GetLinkInfoByUserIdResponse getLinkInfoByUserId(GetLinkInfoByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLinkInfoByUserIdWithOptions(request, headers, runtime);
    }

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

    public GetRevisionResponse getRevision(GetRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRevisionWithOptions(request, headers, runtime);
    }

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

    public GetShareLinkResponse getShareLink(GetShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkWithOptions(request, headers, runtime);
    }

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

    public GetShareLinkByAnonymousResponse getShareLinkByAnonymous(GetShareLinkByAnonymousRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkByAnonymousWithOptions(request, headers, runtime);
    }

    /**
      * To access a file by using a share link, you must first obtain a share token, even if the value of share_pwd of this share is an empty string, which specifies that the share is not private.
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
      * To access a file by using a share link, you must first obtain a share token, even if the value of share_pwd of this share is an empty string, which specifies that the share is not private.
      *
      * @param request GetShareLinkTokenRequest
      * @return GetShareLinkTokenResponse
     */
    public GetShareLinkTokenResponse getShareLinkToken(GetShareLinkTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getShareLinkTokenWithOptions(request, headers, runtime);
    }

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

    public GetStoryResponse getStory(GetStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStoryWithOptions(request, headers, runtime);
    }

    /**
      * **Before you call this operation, make sure that you are familiar with the [billing](~~425220~~) of Drive and Photo Service**.
      * To call this operation, make sure that the value-added image processing feature is enabled.
      * Before you call this operation, a value-added asynchronous task must be created. For example, you can call the CreateSimilarImageClusterTask operation to create an asynchronous task. Then, you can call this operation to query the execution status of the asynchronous task based on the task ID.
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
      * **Before you call this operation, make sure that you are familiar with the [billing](~~425220~~) of Drive and Photo Service**.
      * To call this operation, make sure that the value-added image processing feature is enabled.
      * Before you call this operation, a value-added asynchronous task must be created. For example, you can call the CreateSimilarImageClusterTask operation to create an asynchronous task. Then, you can call this operation to query the execution status of the asynchronous task based on the task ID.
      *
      * @param request GetTaskStatusRequest
      * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTaskStatusWithOptions(request, headers, runtime);
    }

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

    public GetUploadUrlResponse getUploadUrl(GetUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUploadUrlWithOptions(request, headers, runtime);
    }

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

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
      * For more information about best practices, see [Preview videos online](~~427477~~).
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

        if (!com.aliyun.teautil.Common.isUnset(request.getWithoutUrl)) {
            body.put("get_without_url", request.getWithoutUrl);
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
      * For more information about best practices, see [Preview videos online](~~427477~~).
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
      * For more information about best practices, see [Preview videos online](~~427477~~).
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
      * For more information about best practices, see [Preview videos online](~~427477~~).
      *
      * @param request GetVideoPreviewPlayMetaRequest
      * @return GetVideoPreviewPlayMetaResponse
     */
    public GetVideoPreviewPlayMetaResponse getVideoPreviewPlayMeta(GetVideoPreviewPlayMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoPreviewPlayMetaWithOptions(request, headers, runtime);
    }

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

    public GroupUpdateNameResponse groupUpdateName(GroupUpdateNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.groupUpdateNameWithOptions(request, headers, runtime);
    }

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

    public ImportUserResponse importUser(ImportUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importUserWithOptions(request, headers, runtime);
    }

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

    public InvestigateFileResponse investigateFile(InvestigateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.investigateFileWithOptions(request, headers, runtime);
    }

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

    public LinkAccountResponse linkAccount(LinkAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.linkAccountWithOptions(request, headers, runtime);
    }

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

    public ListAddressGroupsResponse listAddressGroups(ListAddressGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAddressGroupsWithOptions(request, headers, runtime);
    }

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

    public ListAssignmentResponse listAssignment(ListAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAssignmentWithOptions(request, headers, runtime);
    }

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

    public ListDeltaResponse listDelta(ListDeltaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeltaWithOptions(request, headers, runtime);
    }

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

    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDomainsWithOptions(request, headers, runtime);
    }

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

    public ListDriveResponse listDrive(ListDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDriveWithOptions(request, headers, runtime);
    }

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

    public ListFacegroupsResponse listFacegroups(ListFacegroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFacegroupsWithOptions(request, headers, runtime);
    }

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

    public ListFileResponse listFile(ListFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFileWithOptions(request, headers, runtime);
    }

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

    public ListGroupResponse listGroup(ListGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupWithOptions(request, headers, runtime);
    }

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

    public ListGroupMemberResponse listGroupMember(ListGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGroupMemberWithOptions(request, headers, runtime);
    }

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

    public ListIdentityRoleResponse listIdentityRole(ListIdentityRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityRoleWithOptions(request, headers, runtime);
    }

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

    public ListIdentityToBenefitPkgMappingResponse listIdentityToBenefitPkgMapping(ListIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

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

    public ListMyDrivesResponse listMyDrives(ListMyDrivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMyDrivesWithOptions(request, headers, runtime);
    }

    public ListMyGroupDriveResponse listMyGroupDriveWithOptions(ListMyGroupDriveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    public ListMyGroupDriveResponse listMyGroupDrive(ListMyGroupDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMyGroupDriveWithOptions(request, headers, runtime);
    }

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

    public ListReceivedFileResponse listReceivedFile(ListReceivedFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listReceivedFileWithOptions(request, headers, runtime);
    }

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

    public ListRecyclebinResponse listRecyclebin(ListRecyclebinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRecyclebinWithOptions(request, headers, runtime);
    }

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

    public ListRevisionResponse listRevision(ListRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRevisionWithOptions(request, headers, runtime);
    }

    /**
      * This operation is discontinued. To query shares, you can call the SearchShareLink operation.
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
      * This operation is discontinued. To query shares, you can call the SearchShareLink operation.
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
      * You can call this operation to query the tags within the specified drive at a time. The top 2,000 tags of the images are returned.
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
      * You can call this operation to query the tags within the specified drive at a time. The top 2,000 tags of the images are returned.
      *
      * @param request ListTagsRequest
      * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagsWithOptions(request, headers, runtime);
    }

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

    public ListUploadedPartsResponse listUploadedParts(ListUploadedPartsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUploadedPartsWithOptions(request, headers, runtime);
    }

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

    public ListUserResponse listUser(ListUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserWithOptions(request, headers, runtime);
    }

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

    public MoveFileResponse moveFile(MoveFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveFileWithOptions(request, headers, runtime);
    }

    public QueryOrderPriceResponse queryOrderPriceWithOptions(QueryOrderPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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

    public QueryOrderPriceResponse queryOrderPrice(QueryOrderPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOrderPriceWithOptions(request, headers, runtime);
    }

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

    public RemoveFaceGroupFileResponse removeFaceGroupFile(RemoveFaceGroupFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeFaceGroupFileWithOptions(request, headers, runtime);
    }

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

    public RemoveGroupMemberResponse removeGroupMember(RemoveGroupMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeGroupMemberWithOptions(request, headers, runtime);
    }

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

    public RemoveStoryFilesResponse removeStoryFiles(RemoveStoryFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeStoryFilesWithOptions(request, headers, runtime);
    }

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

    public RestoreFileResponse restoreFile(RestoreFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreFileWithOptions(request, headers, runtime);
    }

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

    public RestoreRevisionResponse restoreRevision(RestoreRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.restoreRevisionWithOptions(request, headers, runtime);
    }

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

    public ScanFileResponse scanFile(ScanFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.scanFileWithOptions(request, headers, runtime);
    }

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

    public SearchAddressGroupsResponse searchAddressGroups(SearchAddressGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchAddressGroupsWithOptions(request, headers, runtime);
    }

    public SearchDomainsResponse searchDomainsWithOptions(SearchDomainsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instance_id", request.instanceId);
        }

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

    public SearchDomainsResponse searchDomains(SearchDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDomainsWithOptions(request, headers, runtime);
    }

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

    public SearchDriveResponse searchDrive(SearchDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchDriveWithOptions(request, headers, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.returnTotalCount)) {
            body.put("return_total_count", request.returnTotalCount);
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

    public SearchFileResponse searchFile(SearchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchFileWithOptions(request, headers, runtime);
    }

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

    public SearchShareLinkResponse searchShareLink(SearchShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchShareLinkWithOptions(request, headers, runtime);
    }

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

    public SearchSimilarImageClustersResponse searchSimilarImageClusters(SearchSimilarImageClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchSimilarImageClustersWithOptions(request, headers, runtime);
    }

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

    public SearchStoriesResponse searchStories(SearchStoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchStoriesWithOptions(request, headers, runtime);
    }

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

    public SearchUserResponse searchUser(SearchUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchUserWithOptions(request, headers, runtime);
    }

    /**
      * For more information about how to access Drive and Photo Service from a web server application by using OAuth 2.0, visit [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications).<props="intl">只发布国际站</props>
      * For more information about how to access Drive and Photo Service by using a JSON Web Token (JWT) application, visit [Access process for JWT applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/access-process-for-jwt-applications).<props="intl">只发布国际站</props>
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
      * For more information about how to access Drive and Photo Service from a web server application by using OAuth 2.0, visit [OAuth 2.0 For Web Server Applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/oauth-2-0-access-process-for-web-server-applications).<props="intl">只发布国际站</props>
      * For more information about how to access Drive and Photo Service by using a JSON Web Token (JWT) application, visit [Access process for JWT applications](https://www.alibabacloud.com/help/zh/pds/drive-and-photo-service-dev/user-guide/access-process-for-jwt-applications).<props="intl">只发布国际站</props>
      *
      * @param request TokenRequest
      * @return TokenResponse
     */
    public TokenResponse token(TokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tokenWithOptions(request, headers, runtime);
    }

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

    public TrashFileResponse trashFile(TrashFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trashFileWithOptions(request, headers, runtime);
    }

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

    public UnLinkAccountResponse unLinkAccount(UnLinkAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unLinkAccountWithOptions(request, headers, runtime);
    }

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

    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDomainWithOptions(request, headers, runtime);
    }

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

    public UpdateDriveResponse updateDrive(UpdateDriveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDriveWithOptions(request, headers, runtime);
    }

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

    public UpdateFacegroupResponse updateFacegroup(UpdateFacegroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFacegroupWithOptions(request, headers, runtime);
    }

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

    public UpdateFileResponse updateFile(UpdateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFileWithOptions(request, headers, runtime);
    }

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

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGroupWithOptions(request, headers, runtime);
    }

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

    public UpdateIdentityToBenefitPkgMappingResponse updateIdentityToBenefitPkgMapping(UpdateIdentityToBenefitPkgMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIdentityToBenefitPkgMappingWithOptions(request, headers, runtime);
    }

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

    public UpdateRevisionResponse updateRevision(UpdateRevisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRevisionWithOptions(request, headers, runtime);
    }

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

    public UpdateShareLinkResponse updateShareLink(UpdateShareLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateShareLinkWithOptions(request, headers, runtime);
    }

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

    public UpdateStoryResponse updateStory(UpdateStoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateStoryWithOptions(request, headers, runtime);
    }

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

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(request, headers, runtime);
    }
}

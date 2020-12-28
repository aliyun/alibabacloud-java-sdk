// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501;

import com.aliyun.tea.*;
import com.aliyun.ram20150501.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ram", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddUserToGroupResponse addUserToGroupWithOptions(AddUserToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserToGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserToGroupResponse());
    }

    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToGroupWithOptions(request, runtime);
    }

    public AttachPolicyToGroupResponse attachPolicyToGroupWithOptions(AttachPolicyToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachPolicyToGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AttachPolicyToGroupResponse());
    }

    public AttachPolicyToGroupResponse attachPolicyToGroup(AttachPolicyToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPolicyToGroupWithOptions(request, runtime);
    }

    public AttachPolicyToRoleResponse attachPolicyToRoleWithOptions(AttachPolicyToRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachPolicyToRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AttachPolicyToRoleResponse());
    }

    public AttachPolicyToRoleResponse attachPolicyToRole(AttachPolicyToRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPolicyToRoleWithOptions(request, runtime);
    }

    public AttachPolicyToUserResponse attachPolicyToUserWithOptions(AttachPolicyToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachPolicyToUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AttachPolicyToUserResponse());
    }

    public AttachPolicyToUserResponse attachPolicyToUser(AttachPolicyToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPolicyToUserWithOptions(request, runtime);
    }

    public BindMFADeviceResponse bindMFADeviceWithOptions(BindMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindMFADevice", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new BindMFADeviceResponse());
    }

    public BindMFADeviceResponse bindMFADevice(BindMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindMFADeviceWithOptions(request, runtime);
    }

    public ChangePasswordResponse changePasswordWithOptions(ChangePasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangePassword", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ChangePasswordResponse());
    }

    public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changePasswordWithOptions(request, runtime);
    }

    public ClearAccountAliasResponse clearAccountAliasWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ClearAccountAlias", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ClearAccountAliasResponse());
    }

    public ClearAccountAliasResponse clearAccountAlias() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearAccountAliasWithOptions(runtime);
    }

    public CreateAccessKeyResponse createAccessKeyWithOptions(CreateAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAccessKey", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAccessKeyResponse());
    }

    public CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessKeyWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupResponse());
    }

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public CreateLoginProfileResponse createLoginProfileWithOptions(CreateLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLoginProfile", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLoginProfileResponse());
    }

    public CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoginProfileWithOptions(request, runtime);
    }

    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolicyResponse());
    }

    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    public CreatePolicyVersionResponse createPolicyVersionWithOptions(CreatePolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePolicyVersion", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolicyVersionResponse());
    }

    public CreatePolicyVersionResponse createPolicyVersion(CreatePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyVersionWithOptions(request, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoleResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateVirtualMFADeviceResponse createVirtualMFADeviceWithOptions(CreateVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVirtualMFADevice", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVirtualMFADeviceResponse());
    }

    public CreateVirtualMFADeviceResponse createVirtualMFADevice(CreateVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualMFADeviceWithOptions(request, runtime);
    }

    public DeleteAccessKeyResponse deleteAccessKeyWithOptions(DeleteAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAccessKey", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAccessKeyResponse());
    }

    public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessKeyWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupResponse());
    }

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteLoginProfileResponse deleteLoginProfileWithOptions(DeleteLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoginProfile", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoginProfileResponse());
    }

    public DeleteLoginProfileResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoginProfileWithOptions(request, runtime);
    }

    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePolicyResponse());
    }

    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    public DeletePolicyVersionResponse deletePolicyVersionWithOptions(DeletePolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePolicyVersion", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePolicyVersionResponse());
    }

    public DeletePolicyVersionResponse deletePolicyVersion(DeletePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyVersionWithOptions(request, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRoleResponse());
    }

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVirtualMFADevice", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVirtualMFADeviceResponse());
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public DetachPolicyFromGroupResponse detachPolicyFromGroupWithOptions(DetachPolicyFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachPolicyFromGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetachPolicyFromGroupResponse());
    }

    public DetachPolicyFromGroupResponse detachPolicyFromGroup(DetachPolicyFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachPolicyFromGroupWithOptions(request, runtime);
    }

    public DetachPolicyFromRoleResponse detachPolicyFromRoleWithOptions(DetachPolicyFromRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachPolicyFromRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetachPolicyFromRoleResponse());
    }

    public DetachPolicyFromRoleResponse detachPolicyFromRole(DetachPolicyFromRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachPolicyFromRoleWithOptions(request, runtime);
    }

    public DetachPolicyFromUserResponse detachPolicyFromUserWithOptions(DetachPolicyFromUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachPolicyFromUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DetachPolicyFromUserResponse());
    }

    public DetachPolicyFromUserResponse detachPolicyFromUser(DetachPolicyFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachPolicyFromUserWithOptions(request, runtime);
    }

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsedWithOptions(GetAccessKeyLastUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccessKeyLastUsed", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetAccessKeyLastUsedResponse());
    }

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccessKeyLastUsedWithOptions(request, runtime);
    }

    public GetAccountAliasResponse getAccountAliasWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetAccountAlias", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetAccountAliasResponse());
    }

    public GetAccountAliasResponse getAccountAlias() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountAliasWithOptions(runtime);
    }

    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetGroupResponse());
    }

    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupWithOptions(request, runtime);
    }

    public GetLoginProfileResponse getLoginProfileWithOptions(GetLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoginProfile", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoginProfileResponse());
    }

    public GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginProfileWithOptions(request, runtime);
    }

    public GetPasswordPolicyResponse getPasswordPolicyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetPasswordPolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPasswordPolicyResponse());
    }

    public GetPasswordPolicyResponse getPasswordPolicy() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPasswordPolicyWithOptions(runtime);
    }

    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolicyResponse());
    }

    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    public GetPolicyVersionResponse getPolicyVersionWithOptions(GetPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPolicyVersion", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolicyVersionResponse());
    }

    public GetPolicyVersionResponse getPolicyVersion(GetPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyVersionWithOptions(request, runtime);
    }

    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoleResponse());
    }

    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    public GetSecurityPreferenceResponse getSecurityPreferenceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetSecurityPreference", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetSecurityPreferenceResponse());
    }

    public GetSecurityPreferenceResponse getSecurityPreference() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecurityPreferenceWithOptions(runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetUserMFAInfoResponse getUserMFAInfoWithOptions(GetUserMFAInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserMFAInfo", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserMFAInfoResponse());
    }

    public GetUserMFAInfoResponse getUserMFAInfo(GetUserMFAInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserMFAInfoWithOptions(request, runtime);
    }

    public ListAccessKeysResponse listAccessKeysWithOptions(ListAccessKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccessKeys", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccessKeysResponse());
    }

    public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessKeysWithOptions(request, runtime);
    }

    public ListEntitiesForPolicyResponse listEntitiesForPolicyWithOptions(ListEntitiesForPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEntitiesForPolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListEntitiesForPolicyResponse());
    }

    public ListEntitiesForPolicyResponse listEntitiesForPolicy(ListEntitiesForPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEntitiesForPolicyWithOptions(request, runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroups", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupsResponse());
    }

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    public ListGroupsForUserResponse listGroupsForUserWithOptions(ListGroupsForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGroupsForUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListGroupsForUserResponse());
    }

    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicies", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesResponse());
    }

    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    public ListPoliciesForGroupResponse listPoliciesForGroupWithOptions(ListPoliciesForGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPoliciesForGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesForGroupResponse());
    }

    public ListPoliciesForGroupResponse listPoliciesForGroup(ListPoliciesForGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesForGroupWithOptions(request, runtime);
    }

    public ListPoliciesForRoleResponse listPoliciesForRoleWithOptions(ListPoliciesForRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPoliciesForRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesForRoleResponse());
    }

    public ListPoliciesForRoleResponse listPoliciesForRole(ListPoliciesForRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesForRoleWithOptions(request, runtime);
    }

    public ListPoliciesForUserResponse listPoliciesForUserWithOptions(ListPoliciesForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPoliciesForUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesForUserResponse());
    }

    public ListPoliciesForUserResponse listPoliciesForUser(ListPoliciesForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesForUserWithOptions(request, runtime);
    }

    public ListPolicyVersionsResponse listPolicyVersionsWithOptions(ListPolicyVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicyVersions", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPolicyVersionsResponse());
    }

    public ListPolicyVersionsResponse listPolicyVersions(ListPolicyVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPolicyVersionsWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListUsersForGroupResponse listUsersForGroupWithOptions(ListUsersForGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsersForGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersForGroupResponse());
    }

    public ListUsersForGroupResponse listUsersForGroup(ListUsersForGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersForGroupWithOptions(request, runtime);
    }

    public ListVirtualMFADevicesResponse listVirtualMFADevicesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListVirtualMFADevices", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListVirtualMFADevicesResponse());
    }

    public ListVirtualMFADevicesResponse listVirtualMFADevices() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVirtualMFADevicesWithOptions(runtime);
    }

    public RemoveUserFromGroupResponse removeUserFromGroupWithOptions(RemoveUserFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveUserFromGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveUserFromGroupResponse());
    }

    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUserFromGroupWithOptions(request, runtime);
    }

    public SetAccountAliasResponse setAccountAliasWithOptions(SetAccountAliasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAccountAlias", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetAccountAliasResponse());
    }

    public SetAccountAliasResponse setAccountAlias(SetAccountAliasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAccountAliasWithOptions(request, runtime);
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersionWithOptions(SetDefaultPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultPolicyVersion", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultPolicyVersionResponse());
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultPolicyVersionWithOptions(request, runtime);
    }

    public SetPasswordPolicyResponse setPasswordPolicyWithOptions(SetPasswordPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetPasswordPolicy", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetPasswordPolicyResponse());
    }

    public SetPasswordPolicyResponse setPasswordPolicy(SetPasswordPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPasswordPolicyWithOptions(request, runtime);
    }

    public SetSecurityPreferenceResponse setSecurityPreferenceWithOptions(SetSecurityPreferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetSecurityPreference", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetSecurityPreferenceResponse());
    }

    public SetSecurityPreferenceResponse setSecurityPreference(SetSecurityPreferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSecurityPreferenceWithOptions(request, runtime);
    }

    public UnbindMFADeviceResponse unbindMFADeviceWithOptions(UnbindMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindMFADevice", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindMFADeviceResponse());
    }

    public UnbindMFADeviceResponse unbindMFADevice(UnbindMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindMFADeviceWithOptions(request, runtime);
    }

    public UpdateAccessKeyResponse updateAccessKeyWithOptions(UpdateAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAccessKey", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAccessKeyResponse());
    }

    public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccessKeyWithOptions(request, runtime);
    }

    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroup", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupResponse());
    }

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    public UpdateLoginProfileResponse updateLoginProfileWithOptions(UpdateLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLoginProfile", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLoginProfileResponse());
    }

    public UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoginProfileWithOptions(request, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRole", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2015-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}

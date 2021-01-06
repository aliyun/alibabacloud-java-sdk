// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331;

import com.aliyun.tea.*;
import com.aliyun.resourcemanager20200331.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resourcemanager", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateServiceLinkedRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatusWithOptions(GetServiceLinkedRoleDeletionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceLinkedRoleDeletionStatus", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceLinkedRoleDeletionStatusResponse());
    }

    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceLinkedRoleDeletionStatusWithOptions(request, runtime);
    }

    public ListTrustedServiceStatusResponse listTrustedServiceStatusWithOptions(ListTrustedServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTrustedServiceStatus", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListTrustedServiceStatusResponse());
    }

    public ListTrustedServiceStatusResponse listTrustedServiceStatus(ListTrustedServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTrustedServiceStatusWithOptions(request, runtime);
    }

    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRoleWithOptions(DeleteServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteServiceLinkedRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeleteServiceLinkedRoleResponse());
    }

    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceLinkedRoleWithOptions(request, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResources", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListResourcesResponse());
    }

    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    public CreateCloudAccountResponse createCloudAccountWithOptions(CreateCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCloudAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateCloudAccountResponse());
    }

    public CreateCloudAccountResponse createCloudAccount(CreateCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudAccountWithOptions(request, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRoleResponse());
    }

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetRoleResponse());
    }

    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRoles", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRole", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateRoleResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    public ListPolicyAttachmentsResponse listPolicyAttachmentsWithOptions(ListPolicyAttachmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPolicyAttachments", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListPolicyAttachmentsResponse());
    }

    public ListPolicyAttachmentsResponse listPolicyAttachments(ListPolicyAttachmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPolicyAttachmentsWithOptions(request, runtime);
    }

    public DetachPolicyResponse detachPolicyWithOptions(DetachPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DetachPolicy", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DetachPolicyResponse());
    }

    public DetachPolicyResponse detachPolicy(DetachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachPolicyWithOptions(request, runtime);
    }

    public AttachPolicyResponse attachPolicyWithOptions(AttachPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AttachPolicy", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new AttachPolicyResponse());
    }

    public AttachPolicyResponse attachPolicy(AttachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPolicyWithOptions(request, runtime);
    }

    public GetPolicyVersionResponse getPolicyVersionWithOptions(GetPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPolicyVersion", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetPolicyVersionResponse());
    }

    public GetPolicyVersionResponse getPolicyVersion(GetPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyVersionWithOptions(request, runtime);
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersionWithOptions(SetDefaultPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDefaultPolicyVersion", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new SetDefaultPolicyVersionResponse());
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultPolicyVersionWithOptions(request, runtime);
    }

    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteResourceGroup", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeleteResourceGroupResponse());
    }

    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPolicy", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetPolicyResponse());
    }

    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    public UpdateResourceGroupResponse updateResourceGroupWithOptions(UpdateResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateResourceGroup", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new UpdateResourceGroupResponse());
    }

    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceGroupWithOptions(request, runtime);
    }

    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListResourceGroups", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListResourceGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPolicies", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListPoliciesResponse());
    }

    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    public ListPolicyVersionsResponse listPolicyVersionsWithOptions(ListPolicyVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPolicyVersions", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListPolicyVersionsResponse());
    }

    public ListPolicyVersionsResponse listPolicyVersions(ListPolicyVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPolicyVersionsWithOptions(request, runtime);
    }

    public CreateResourceAccountResponse createResourceAccountWithOptions(CreateResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResourceAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateResourceAccountResponse());
    }

    public CreateResourceAccountResponse createResourceAccount(CreateResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceAccountWithOptions(request, runtime);
    }

    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectoryWithOptions(ListHandshakesForResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListHandshakesForResourceDirectory", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListHandshakesForResourceDirectoryResponse());
    }

    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHandshakesForResourceDirectoryWithOptions(request, runtime);
    }

    public DestroyResourceDirectoryResponse destroyResourceDirectoryWithOptions(DestroyResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DestroyResourceDirectory", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DestroyResourceDirectoryResponse());
    }

    public DestroyResourceDirectoryResponse destroyResourceDirectory(DestroyResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyResourceDirectoryWithOptions(request, runtime);
    }

    public CreatePolicyVersionResponse createPolicyVersionWithOptions(CreatePolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePolicyVersion", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreatePolicyVersionResponse());
    }

    public CreatePolicyVersionResponse createPolicyVersion(CreatePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyVersionWithOptions(request, runtime);
    }

    public DeletePolicyVersionResponse deletePolicyVersionWithOptions(DeletePolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePolicyVersion", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeletePolicyVersionResponse());
    }

    public DeletePolicyVersionResponse deletePolicyVersion(DeletePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyVersionWithOptions(request, runtime);
    }

    public GetResourceGroupResponse getResourceGroupWithOptions(GetResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceGroup", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetResourceGroupResponse());
    }

    public GetResourceGroupResponse getResourceGroup(GetResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceGroupWithOptions(request, runtime);
    }

    public InitResourceDirectoryResponse initResourceDirectoryWithOptions(InitResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InitResourceDirectory", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new InitResourceDirectoryResponse());
    }

    public InitResourceDirectoryResponse initResourceDirectory(InitResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initResourceDirectoryWithOptions(request, runtime);
    }

    public GetHandshakeResponse getHandshakeWithOptions(GetHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetHandshake", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetHandshakeResponse());
    }

    public GetHandshakeResponse getHandshake(GetHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHandshakeWithOptions(request, runtime);
    }

    public CancelHandshakeResponse cancelHandshakeWithOptions(CancelHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelHandshake", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CancelHandshakeResponse());
    }

    public CancelHandshakeResponse cancelHandshake(CancelHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelHandshakeWithOptions(request, runtime);
    }

    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreatePolicy", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreatePolicyResponse());
    }

    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    public DeclineHandshakeResponse declineHandshakeWithOptions(DeclineHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeclineHandshake", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeclineHandshakeResponse());
    }

    public DeclineHandshakeResponse declineHandshake(DeclineHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.declineHandshakeWithOptions(request, runtime);
    }

    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeletePolicy", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeletePolicyResponse());
    }

    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    public ListHandshakesForAccountResponse listHandshakesForAccountWithOptions(ListHandshakesForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListHandshakesForAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListHandshakesForAccountResponse());
    }

    public ListHandshakesForAccountResponse listHandshakesForAccount(ListHandshakesForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHandshakesForAccountWithOptions(request, runtime);
    }

    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectoryWithOptions(InviteAccountToResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InviteAccountToResourceDirectory", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new InviteAccountToResourceDirectoryResponse());
    }

    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inviteAccountToResourceDirectoryWithOptions(request, runtime);
    }

    public AcceptHandshakeResponse acceptHandshakeWithOptions(AcceptHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AcceptHandshake", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new AcceptHandshakeResponse());
    }

    public AcceptHandshakeResponse acceptHandshake(AcceptHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptHandshakeWithOptions(request, runtime);
    }

    public UpdateAccountResponse updateAccountWithOptions(UpdateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAccountResponse());
    }

    public UpdateAccountResponse updateAccount(UpdateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccountWithOptions(request, runtime);
    }

    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetFolder", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    public ListAccountsForParentResponse listAccountsForParentWithOptions(ListAccountsForParentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAccountsForParent", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListAccountsForParentResponse());
    }

    public ListAccountsForParentResponse listAccountsForParent(ListAccountsForParentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountsForParentWithOptions(request, runtime);
    }

    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResourceGroup", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateResourceGroupResponse());
    }

    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    public PromoteResourceAccountResponse promoteResourceAccountWithOptions(PromoteResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PromoteResourceAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new PromoteResourceAccountResponse());
    }

    public PromoteResourceAccountResponse promoteResourceAccount(PromoteResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.promoteResourceAccountWithOptions(request, runtime);
    }

    public ListAccountsResponse listAccountsWithOptions(ListAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAccounts", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListAccountsResponse());
    }

    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountsWithOptions(request, runtime);
    }

    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccountWithOptions(CancelPromoteResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelPromoteResourceAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CancelPromoteResourceAccountResponse());
    }

    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPromoteResourceAccountWithOptions(request, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateFolder", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteFolder", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    public GetAccountResponse getAccountWithOptions(GetAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetAccountResponse());
    }

    public GetAccountResponse getAccount(GetAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountWithOptions(request, runtime);
    }

    public GetResourceDirectoryResponse getResourceDirectoryWithOptions(GetResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourceDirectory", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetResourceDirectoryResponse());
    }

    public GetResourceDirectoryResponse getResourceDirectory(GetResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceDirectoryWithOptions(request, runtime);
    }

    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateFolder", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new UpdateFolderResponse());
    }

    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    public MoveAccountResponse moveAccountWithOptions(MoveAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MoveAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new MoveAccountResponse());
    }

    public MoveAccountResponse moveAccount(MoveAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAccountWithOptions(request, runtime);
    }

    public ListAncestorsResponse listAncestorsWithOptions(ListAncestorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAncestors", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListAncestorsResponse());
    }

    public ListAncestorsResponse listAncestors(ListAncestorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAncestorsWithOptions(request, runtime);
    }

    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmailWithOptions(ResendCreateCloudAccountEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResendCreateCloudAccountEmail", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ResendCreateCloudAccountEmailResponse());
    }

    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendCreateCloudAccountEmailWithOptions(request, runtime);
    }

    public GetPayerForAccountResponse getPayerForAccountWithOptions(GetPayerForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPayerForAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new GetPayerForAccountResponse());
    }

    public GetPayerForAccountResponse getPayerForAccount(GetPayerForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPayerForAccountWithOptions(request, runtime);
    }

    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmailWithOptions(ResendPromoteResourceAccountEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResendPromoteResourceAccountEmail", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ResendPromoteResourceAccountEmailResponse());
    }

    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendPromoteResourceAccountEmailWithOptions(request, runtime);
    }

    public ListFoldersForParentResponse listFoldersForParentWithOptions(ListFoldersForParentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFoldersForParent", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new ListFoldersForParentResponse());
    }

    public ListFoldersForParentResponse listFoldersForParent(ListFoldersForParentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFoldersForParentWithOptions(request, runtime);
    }

    public RemoveCloudAccountResponse removeCloudAccountWithOptions(RemoveCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveCloudAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new RemoveCloudAccountResponse());
    }

    public RemoveCloudAccountResponse removeCloudAccount(RemoveCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeCloudAccountWithOptions(request, runtime);
    }

    public CancelCreateCloudAccountResponse cancelCreateCloudAccountWithOptions(CancelCreateCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelCreateCloudAccount", "HTTPS", "POST", "2020-03-31", "AK", null, TeaModel.buildMap(request), runtime), new CancelCreateCloudAccountResponse());
    }

    public CancelCreateCloudAccountResponse cancelCreateCloudAccount(CancelCreateCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCreateCloudAccountWithOptions(request, runtime);
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
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331;

import com.aliyun.tea.*;
import com.aliyun.resourcemanager20200331.models.*;
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
        this._endpoint = this.getEndpoint("resourcemanager", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AcceptHandshakeResponse acceptHandshakeWithOptions(AcceptHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcceptHandshake", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AcceptHandshakeResponse());
    }

    public AcceptHandshakeResponse acceptHandshake(AcceptHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptHandshakeWithOptions(request, runtime);
    }

    public AttachControlPolicyResponse attachControlPolicyWithOptions(AttachControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AttachControlPolicyResponse());
    }

    public AttachControlPolicyResponse attachControlPolicy(AttachControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachControlPolicyWithOptions(request, runtime);
    }

    public AttachPolicyResponse attachPolicyWithOptions(AttachPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AttachPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AttachPolicyResponse());
    }

    public AttachPolicyResponse attachPolicy(AttachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.attachPolicyWithOptions(request, runtime);
    }

    public CancelCreateCloudAccountResponse cancelCreateCloudAccountWithOptions(CancelCreateCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelCreateCloudAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CancelCreateCloudAccountResponse());
    }

    public CancelCreateCloudAccountResponse cancelCreateCloudAccount(CancelCreateCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelCreateCloudAccountWithOptions(request, runtime);
    }

    public CancelHandshakeResponse cancelHandshakeWithOptions(CancelHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelHandshake", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CancelHandshakeResponse());
    }

    public CancelHandshakeResponse cancelHandshake(CancelHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelHandshakeWithOptions(request, runtime);
    }

    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccountWithOptions(CancelPromoteResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelPromoteResourceAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CancelPromoteResourceAccountResponse());
    }

    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelPromoteResourceAccountWithOptions(request, runtime);
    }

    public CreateCloudAccountResponse createCloudAccountWithOptions(CreateCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCloudAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCloudAccountResponse());
    }

    public CreateCloudAccountResponse createCloudAccount(CreateCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudAccountWithOptions(request, runtime);
    }

    public CreateControlPolicyResponse createControlPolicyWithOptions(CreateControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateControlPolicyResponse());
    }

    public CreateControlPolicyResponse createControlPolicy(CreateControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createControlPolicyWithOptions(request, runtime);
    }

    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFolder", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFolderResponse());
    }

    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolicyResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreatePolicyVersion", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePolicyVersionResponse());
    }

    public CreatePolicyVersionResponse createPolicyVersion(CreatePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPolicyVersionWithOptions(request, runtime);
    }

    public CreateResourceAccountResponse createResourceAccountWithOptions(CreateResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourceAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceAccountResponse());
    }

    public CreateResourceAccountResponse createResourceAccount(CreateResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceAccountWithOptions(request, runtime);
    }

    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourceGroup", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceGroupResponse());
    }

    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoleResponse());
    }

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    public DeclineHandshakeResponse declineHandshakeWithOptions(DeclineHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeclineHandshake", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeclineHandshakeResponse());
    }

    public DeclineHandshakeResponse declineHandshake(DeclineHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.declineHandshakeWithOptions(request, runtime);
    }

    public DeleteControlPolicyResponse deleteControlPolicyWithOptions(DeleteControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteControlPolicyResponse());
    }

    public DeleteControlPolicyResponse deleteControlPolicy(DeleteControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteControlPolicyWithOptions(request, runtime);
    }

    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFolder", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFolderResponse());
    }

    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePolicyResponse());
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
        return TeaModel.toModel(this.doRPCRequest("DeletePolicyVersion", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePolicyVersionResponse());
    }

    public DeletePolicyVersionResponse deletePolicyVersion(DeletePolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePolicyVersionWithOptions(request, runtime);
    }

    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteResourceGroup", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteResourceGroupResponse());
    }

    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRoleResponse());
    }

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRoleWithOptions(DeleteServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteServiceLinkedRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteServiceLinkedRoleResponse());
    }

    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteServiceLinkedRoleWithOptions(request, runtime);
    }

    public DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministratorWithOptions(DeregisterDelegatedAdministratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeregisterDelegatedAdministrator", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeregisterDelegatedAdministratorResponse());
    }

    public DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterDelegatedAdministratorWithOptions(request, runtime);
    }

    public DestroyResourceDirectoryResponse destroyResourceDirectoryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DestroyResourceDirectory", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DestroyResourceDirectoryResponse());
    }

    public DestroyResourceDirectoryResponse destroyResourceDirectory() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destroyResourceDirectoryWithOptions(runtime);
    }

    public DetachControlPolicyResponse detachControlPolicyWithOptions(DetachControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DetachControlPolicyResponse());
    }

    public DetachControlPolicyResponse detachControlPolicy(DetachControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachControlPolicyWithOptions(request, runtime);
    }

    public DetachPolicyResponse detachPolicyWithOptions(DetachPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DetachPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DetachPolicyResponse());
    }

    public DetachPolicyResponse detachPolicy(DetachPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.detachPolicyWithOptions(request, runtime);
    }

    public DisableControlPolicyResponse disableControlPolicyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DisableControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DisableControlPolicyResponse());
    }

    public DisableControlPolicyResponse disableControlPolicy() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableControlPolicyWithOptions(runtime);
    }

    public EnableControlPolicyResponse enableControlPolicyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("EnableControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new EnableControlPolicyResponse());
    }

    public EnableControlPolicyResponse enableControlPolicy() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableControlPolicyWithOptions(runtime);
    }

    public GetAccountResponse getAccountWithOptions(GetAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetAccountResponse());
    }

    public GetAccountResponse getAccount(GetAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountWithOptions(request, runtime);
    }

    public GetControlPolicyResponse getControlPolicyWithOptions(GetControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetControlPolicyResponse());
    }

    public GetControlPolicyResponse getControlPolicy(GetControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getControlPolicyWithOptions(request, runtime);
    }

    public GetControlPolicyEnablementStatusResponse getControlPolicyEnablementStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetControlPolicyEnablementStatus", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetControlPolicyEnablementStatusResponse());
    }

    public GetControlPolicyEnablementStatusResponse getControlPolicyEnablementStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getControlPolicyEnablementStatusWithOptions(runtime);
    }

    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetFolder", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetFolderResponse());
    }

    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    public GetHandshakeResponse getHandshakeWithOptions(GetHandshakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHandshake", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetHandshakeResponse());
    }

    public GetHandshakeResponse getHandshake(GetHandshakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHandshakeWithOptions(request, runtime);
    }

    public GetPayerForAccountResponse getPayerForAccountWithOptions(GetPayerForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPayerForAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetPayerForAccountResponse());
    }

    public GetPayerForAccountResponse getPayerForAccount(GetPayerForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPayerForAccountWithOptions(request, runtime);
    }

    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolicyResponse());
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
        return TeaModel.toModel(this.doRPCRequest("GetPolicyVersion", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetPolicyVersionResponse());
    }

    public GetPolicyVersionResponse getPolicyVersion(GetPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPolicyVersionWithOptions(request, runtime);
    }

    public GetResourceDirectoryResponse getResourceDirectoryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetResourceDirectory", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourceDirectoryResponse());
    }

    public GetResourceDirectoryResponse getResourceDirectory() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceDirectoryWithOptions(runtime);
    }

    public GetResourceGroupResponse getResourceGroupWithOptions(GetResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceGroup", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourceGroupResponse());
    }

    public GetResourceGroupResponse getResourceGroup(GetResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceGroupWithOptions(request, runtime);
    }

    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoleResponse());
    }

    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatusWithOptions(GetServiceLinkedRoleDeletionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceLinkedRoleDeletionStatus", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceLinkedRoleDeletionStatusResponse());
    }

    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceLinkedRoleDeletionStatusWithOptions(request, runtime);
    }

    public InitResourceDirectoryResponse initResourceDirectoryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("InitResourceDirectory", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new InitResourceDirectoryResponse());
    }

    public InitResourceDirectoryResponse initResourceDirectory() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initResourceDirectoryWithOptions(runtime);
    }

    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectoryWithOptions(InviteAccountToResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InviteAccountToResourceDirectory", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new InviteAccountToResourceDirectoryResponse());
    }

    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inviteAccountToResourceDirectoryWithOptions(request, runtime);
    }

    public ListAccountsResponse listAccountsWithOptions(ListAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccounts", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccountsResponse());
    }

    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountsWithOptions(request, runtime);
    }

    public ListAccountsForParentResponse listAccountsForParentWithOptions(ListAccountsForParentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAccountsForParent", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListAccountsForParentResponse());
    }

    public ListAccountsForParentResponse listAccountsForParent(ListAccountsForParentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccountsForParentWithOptions(request, runtime);
    }

    public ListAncestorsResponse listAncestorsWithOptions(ListAncestorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAncestors", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListAncestorsResponse());
    }

    public ListAncestorsResponse listAncestors(ListAncestorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAncestorsWithOptions(request, runtime);
    }

    public ListControlPoliciesResponse listControlPoliciesWithOptions(ListControlPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListControlPolicies", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListControlPoliciesResponse());
    }

    public ListControlPoliciesResponse listControlPolicies(ListControlPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listControlPoliciesWithOptions(request, runtime);
    }

    public ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTargetWithOptions(ListControlPolicyAttachmentsForTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListControlPolicyAttachmentsForTarget", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListControlPolicyAttachmentsForTargetResponse());
    }

    public ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listControlPolicyAttachmentsForTargetWithOptions(request, runtime);
    }

    public ListDelegatedAdministratorsResponse listDelegatedAdministratorsWithOptions(ListDelegatedAdministratorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDelegatedAdministrators", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListDelegatedAdministratorsResponse());
    }

    public ListDelegatedAdministratorsResponse listDelegatedAdministrators(ListDelegatedAdministratorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDelegatedAdministratorsWithOptions(request, runtime);
    }

    public ListDelegatedServicesForAccountResponse listDelegatedServicesForAccountWithOptions(ListDelegatedServicesForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDelegatedServicesForAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListDelegatedServicesForAccountResponse());
    }

    public ListDelegatedServicesForAccountResponse listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDelegatedServicesForAccountWithOptions(request, runtime);
    }

    public ListFoldersForParentResponse listFoldersForParentWithOptions(ListFoldersForParentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFoldersForParent", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListFoldersForParentResponse());
    }

    public ListFoldersForParentResponse listFoldersForParent(ListFoldersForParentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFoldersForParentWithOptions(request, runtime);
    }

    public ListHandshakesForAccountResponse listHandshakesForAccountWithOptions(ListHandshakesForAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHandshakesForAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListHandshakesForAccountResponse());
    }

    public ListHandshakesForAccountResponse listHandshakesForAccount(ListHandshakesForAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHandshakesForAccountWithOptions(request, runtime);
    }

    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectoryWithOptions(ListHandshakesForResourceDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHandshakesForResourceDirectory", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListHandshakesForResourceDirectoryResponse());
    }

    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHandshakesForResourceDirectoryWithOptions(request, runtime);
    }

    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicies", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListPoliciesResponse());
    }

    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    public ListPolicyAttachmentsResponse listPolicyAttachmentsWithOptions(ListPolicyAttachmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicyAttachments", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListPolicyAttachmentsResponse());
    }

    public ListPolicyAttachmentsResponse listPolicyAttachments(ListPolicyAttachmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPolicyAttachmentsWithOptions(request, runtime);
    }

    public ListPolicyVersionsResponse listPolicyVersionsWithOptions(ListPolicyVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPolicyVersions", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListPolicyVersionsResponse());
    }

    public ListPolicyVersionsResponse listPolicyVersions(ListPolicyVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPolicyVersionsWithOptions(request, runtime);
    }

    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceGroups", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourceGroupsResponse());
    }

    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResources", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourcesResponse());
    }

    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public ListTargetAttachmentsForControlPolicyResponse listTargetAttachmentsForControlPolicyWithOptions(ListTargetAttachmentsForControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTargetAttachmentsForControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListTargetAttachmentsForControlPolicyResponse());
    }

    public ListTargetAttachmentsForControlPolicyResponse listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTargetAttachmentsForControlPolicyWithOptions(request, runtime);
    }

    public ListTrustedServiceStatusResponse listTrustedServiceStatusWithOptions(ListTrustedServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTrustedServiceStatus", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListTrustedServiceStatusResponse());
    }

    public ListTrustedServiceStatusResponse listTrustedServiceStatus(ListTrustedServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTrustedServiceStatusWithOptions(request, runtime);
    }

    public MoveAccountResponse moveAccountWithOptions(MoveAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new MoveAccountResponse());
    }

    public MoveAccountResponse moveAccount(MoveAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveAccountWithOptions(request, runtime);
    }

    public PromoteResourceAccountResponse promoteResourceAccountWithOptions(PromoteResourceAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PromoteResourceAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new PromoteResourceAccountResponse());
    }

    public PromoteResourceAccountResponse promoteResourceAccount(PromoteResourceAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.promoteResourceAccountWithOptions(request, runtime);
    }

    public RegisterDelegatedAdministratorResponse registerDelegatedAdministratorWithOptions(RegisterDelegatedAdministratorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterDelegatedAdministrator", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterDelegatedAdministratorResponse());
    }

    public RegisterDelegatedAdministratorResponse registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDelegatedAdministratorWithOptions(request, runtime);
    }

    public RemoveCloudAccountResponse removeCloudAccountWithOptions(RemoveCloudAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveCloudAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveCloudAccountResponse());
    }

    public RemoveCloudAccountResponse removeCloudAccount(RemoveCloudAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeCloudAccountWithOptions(request, runtime);
    }

    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmailWithOptions(ResendCreateCloudAccountEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResendCreateCloudAccountEmail", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ResendCreateCloudAccountEmailResponse());
    }

    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendCreateCloudAccountEmailWithOptions(request, runtime);
    }

    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmailWithOptions(ResendPromoteResourceAccountEmailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResendPromoteResourceAccountEmail", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ResendPromoteResourceAccountEmailResponse());
    }

    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resendPromoteResourceAccountEmailWithOptions(request, runtime);
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersionWithOptions(SetDefaultPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetDefaultPolicyVersion", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new SetDefaultPolicyVersionResponse());
    }

    public SetDefaultPolicyVersionResponse setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultPolicyVersionWithOptions(request, runtime);
    }

    public UpdateAccountResponse updateAccountWithOptions(UpdateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAccount", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAccountResponse());
    }

    public UpdateAccountResponse updateAccount(UpdateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccountWithOptions(request, runtime);
    }

    public UpdateControlPolicyResponse updateControlPolicyWithOptions(UpdateControlPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateControlPolicy", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateControlPolicyResponse());
    }

    public UpdateControlPolicyResponse updateControlPolicy(UpdateControlPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateControlPolicyWithOptions(request, runtime);
    }

    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFolder", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFolderResponse());
    }

    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    public UpdateResourceGroupResponse updateResourceGroupWithOptions(UpdateResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResourceGroup", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceGroupResponse());
    }

    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceGroupWithOptions(request, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRole", "2020-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRoleResponse());
    }

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }
}

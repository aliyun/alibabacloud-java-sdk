// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331;

import com.aliyun.tea.*;
import com.aliyun.resourcemanager20200331.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>description</b> :
     * <p>After the invited Alibaba Cloud account successfully joins a resource directory, the account becomes a member of the resource directory. The resource directory uses the name of the invited Alibaba Cloud account as the display name and account name of the member by default.
     * This topic provides an example on how the invited Alibaba Cloud account <code>177242285274****</code> accepts an invitation from the resource directory <code>rd-3G****</code>. The handshake ID is <code>h-Ih8IuPfvV0t0****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts an invitation by the invited Alibaba Cloud account by calling AcceptHandshake.</p>
     * 
     * @param request AcceptHandshakeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptHandshakeResponse
     */
    public AcceptHandshakeResponse acceptHandshakeWithOptions(AcceptHandshakeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.handshakeId)) {
            query.put("HandshakeId", request.handshakeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptHandshake"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptHandshakeResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the invited Alibaba Cloud account successfully joins a resource directory, the account becomes a member of the resource directory. The resource directory uses the name of the invited Alibaba Cloud account as the display name and account name of the member by default.
     * This topic provides an example on how the invited Alibaba Cloud account <code>177242285274****</code> accepts an invitation from the resource directory <code>rd-3G****</code>. The handshake ID is <code>h-Ih8IuPfvV0t0****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts an invitation by the invited Alibaba Cloud account by calling AcceptHandshake.</p>
     * 
     * @param request AcceptHandshakeRequest
     * @return AcceptHandshakeResponse
     */
    public AcceptHandshakeResponse acceptHandshake(AcceptHandshakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptHandshakeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the control policy is attached, the resource folder or member immediately becomes subject to the control policy. Make sure that the result of the attach operation is as expected to avoid affecting your business.
     * The system attaches the system policy FullAliyunAccess to resource folders and members by default.
     * A control policy takes effect on the entire node to which it is attached. A control policy attached to a parent resource folder also takes effect on its child resource folders and members.
     * Each node (resource folder or member) can have a maximum of 10 control policies attached.
     * This topic provides an example on how to attach the custom policy <code>cp-jExXAqIYkwHN****</code> to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a control policy to a specified target.</p>
     * 
     * @param request AttachControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachControlPolicyResponse
     */
    public AttachControlPolicyResponse attachControlPolicyWithOptions(AttachControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the control policy is attached, the resource folder or member immediately becomes subject to the control policy. Make sure that the result of the attach operation is as expected to avoid affecting your business.
     * The system attaches the system policy FullAliyunAccess to resource folders and members by default.
     * A control policy takes effect on the entire node to which it is attached. A control policy attached to a parent resource folder also takes effect on its child resource folders and members.
     * Each node (resource folder or member) can have a maximum of 10 control policies attached.
     * This topic provides an example on how to attach the custom policy <code>cp-jExXAqIYkwHN****</code> to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a control policy to a specified target.</p>
     * 
     * @param request AttachControlPolicyRequest
     * @return AttachControlPolicyResponse
     */
    public AttachControlPolicyResponse attachControlPolicy(AttachControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes AttachPolicy to add an access policy to an authorization object (a Resource Access Management (RAM) user, RAM user group, or RAM role), which is authorization. After the authorization is complete, the authorized object obtains access permissions on resources within the specified resource group or Alibaba Cloud account.</p>
     * 
     * @param request AttachPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachPolicyResponse
     */
    public AttachPolicyResponse attachPolicyWithOptions(AttachPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invokes AttachPolicy to add an access policy to an authorization object (a Resource Access Management (RAM) user, RAM user group, or RAM role), which is authorization. After the authorization is complete, the authorized object obtains access permissions on resources within the specified resource group or Alibaba Cloud account.</p>
     * 
     * @param request AttachPolicyRequest
     * @return AttachPolicyResponse
     */
    public AttachPolicyResponse attachPolicy(AttachPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API operation is used only to set a secure phone number for a resource account for the first time. It cannot be used to modify an existing secure phone number.
     * To ensure that the system can record the specific author of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.
     * This topic provides an example of how to set a secure phone number for the member <code>138660628348****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a secure phone number for a member of the resource account type.</p>
     * 
     * @param request BindSecureMobilePhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindSecureMobilePhoneResponse
     */
    public BindSecureMobilePhoneResponse bindSecureMobilePhoneWithOptions(BindSecureMobilePhoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secureMobilePhone)) {
            query.put("SecureMobilePhone", request.secureMobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCode)) {
            query.put("VerificationCode", request.verificationCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindSecureMobilePhone"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindSecureMobilePhoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API operation is used only to set a secure phone number for a resource account for the first time. It cannot be used to modify an existing secure phone number.
     * To ensure that the system can record the specific author of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.
     * This topic provides an example of how to set a secure phone number for the member <code>138660628348****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets a secure phone number for a member of the resource account type.</p>
     * 
     * @param request BindSecureMobilePhoneRequest
     * @return BindSecureMobilePhoneResponse
     */
    public BindSecureMobilePhoneResponse bindSecureMobilePhone(BindSecureMobilePhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindSecureMobilePhoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the modification of a member account email address.</p>
     * 
     * @param request CancelChangeAccountEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelChangeAccountEmailResponse
     */
    public CancelChangeAccountEmailResponse cancelChangeAccountEmailWithOptions(CancelChangeAccountEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelChangeAccountEmail"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelChangeAccountEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the modification of a member account email address.</p>
     * 
     * @param request CancelChangeAccountEmailRequest
     * @return CancelChangeAccountEmailResponse
     */
    public CancelChangeAccountEmailResponse cancelChangeAccountEmail(CancelChangeAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelChangeAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the creation of a member of the cloud account type in a resource directory.</p>
     * 
     * @param request CancelCreateCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCreateCloudAccountResponse
     */
    public CancelCreateCloudAccountResponse cancelCreateCloudAccountWithOptions(CancelCreateCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCreateCloudAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCreateCloudAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the creation of a member of the cloud account type in a resource directory.</p>
     * 
     * @param request CancelCreateCloudAccountRequest
     * @return CancelCreateCloudAccountResponse
     */
    public CancelCreateCloudAccountResponse cancelCreateCloudAccount(CancelCreateCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCreateCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to cancel the handshake whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a handshake.</p>
     * 
     * @param request CancelHandshakeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelHandshakeResponse
     */
    public CancelHandshakeResponse cancelHandshakeWithOptions(CancelHandshakeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.handshakeId)) {
            query.put("HandshakeId", request.handshakeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelHandshake"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelHandshakeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to cancel the handshake whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a handshake.</p>
     * 
     * @param request CancelHandshakeRequest
     * @return CancelHandshakeResponse
     */
    public CancelHandshakeResponse cancelHandshake(CancelHandshakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelHandshakeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the upgrade of a resource directory resource account to an Alibaba Cloud account.</p>
     * 
     * @param request CancelPromoteResourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelPromoteResourceAccountResponse
     */
    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccountWithOptions(CancelPromoteResourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelPromoteResourceAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelPromoteResourceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the upgrade of a resource directory resource account to an Alibaba Cloud account.</p>
     * 
     * @param request CancelPromoteResourceAccountRequest
     * @return CancelPromoteResourceAccountResponse
     */
    public CancelPromoteResourceAccountResponse cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelPromoteResourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the email address of a member account by calling ChangeAccountEmail.</p>
     * 
     * @param request ChangeAccountEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAccountEmailResponse
     */
    public ChangeAccountEmailResponse changeAccountEmailWithOptions(ChangeAccountEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAccountEmail"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAccountEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the email address of a member account by calling ChangeAccountEmail.</p>
     * 
     * @param request ChangeAccountEmailRequest
     * @return ChangeAccountEmailResponse
     */
    public ChangeAccountEmailResponse changeAccountEmail(ChangeAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before deleting a member account, call this API to perform a pre-deletion condition check on the target member account.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CheckAccountDelete to perform a member account deletion check task.</p>
     * 
     * @param request CheckAccountDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccountDeleteResponse
     */
    public CheckAccountDeleteResponse checkAccountDeleteWithOptions(CheckAccountDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccountDelete"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountDeleteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before deleting a member account, call this API to perform a pre-deletion condition check on the target member account.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CheckAccountDelete to perform a member account deletion check task.</p>
     * 
     * @param request CheckAccountDeleteRequest
     * @return CheckAccountDeleteResponse
     */
    public CheckAccountDeleteResponse checkAccountDelete(CheckAccountDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccountDeleteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 10 custom allocation rules, and each custom allocation rule supports up to 10 rule content entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic allocation rule by calling CreateAutoGroupingRule. Two types are supported: custom allocation rules and attached-resource allocation rules.</p>
     * 
     * @param request CreateAutoGroupingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoGroupingRuleResponse
     */
    public CreateAutoGroupingRuleResponse createAutoGroupingRuleWithOptions(CreateAutoGroupingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            query.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            query.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            query.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceTypesScope)) {
            query.put("ExcludeResourceTypesScope", request.excludeResourceTypesScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            query.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            query.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            query.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScope)) {
            query.put("ResourceTypesScope", request.resourceTypesScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleContents)) {
            query.put("RuleContents", request.ruleContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDesc)) {
            query.put("RuleDesc", request.ruleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoGroupingRule"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoGroupingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 10 custom allocation rules, and each custom allocation rule supports up to 10 rule content entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an automatic allocation rule by calling CreateAutoGroupingRule. Two types are supported: custom allocation rules and attached-resource allocation rules.</p>
     * 
     * @param request CreateAutoGroupingRuleRequest
     * @return CreateAutoGroupingRuleResponse
     */
    public CreateAutoGroupingRuleResponse createAutoGroupingRule(CreateAutoGroupingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoGroupingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A resource directory contains two types of members: resource accounts and cloud accounts. </p>
     * <ul>
     * <li>Resource account (recommended): A resource account serves only as a resource container and fully depends on the resource directory. It is a more secure account type that is easier to create. To create a resource account type member, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>. <blockquote>
     * <p>A resource account can also be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a>.</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root logon access.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the cloud account type in a resource directory.</p>
     * 
     * @param request CreateCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudAccountResponse
     */
    public CreateCloudAccountResponse createCloudAccountWithOptions(CreateCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerAccountId)) {
            query.put("PayerAccountId", request.payerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>A resource directory contains two types of members: resource accounts and cloud accounts. </p>
     * <ul>
     * <li>Resource account (recommended): A resource account serves only as a resource container and fully depends on the resource directory. It is a more secure account type that is easier to create. To create a resource account type member, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>. <blockquote>
     * <p>A resource account can also be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a>.</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root logon access.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the cloud account type in a resource directory.</p>
     * 
     * @param request CreateCloudAccountRequest
     * @return CreateCloudAccountResponse
     */
    public CreateCloudAccountResponse createCloudAccount(CreateCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a control policy named <code>ExampleControlPolicy</code> that prohibits modifications to the ResourceDirectoryAccountAccessRole role and its permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateControlPolicy to create a custom control policy.</p>
     * 
     * @param request CreateControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateControlPolicyResponse
     */
    public CreateControlPolicyResponse createControlPolicyWithOptions(CreateControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectScope)) {
            query.put("EffectScope", request.effectScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyDocument)) {
            query.put("PolicyDocument", request.policyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a control policy named <code>ExampleControlPolicy</code> that prohibits modifications to the ResourceDirectoryAccountAccessRole role and its permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateControlPolicy to create a custom control policy.</p>
     * 
     * @param request CreateControlPolicyRequest
     * @return CreateControlPolicyResponse
     */
    public CreateControlPolicyResponse createControlPolicy(CreateControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of five levels of resource folders.
     * This topic provides an example of how to create a resource folder named <code>rdFolder</code> under the Root folder.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource folder by calling CreateFolder.</p>
     * 
     * @param request CreateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolderWithOptions(CreateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderName)) {
            query.put("FolderName", request.folderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFolderResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of five levels of resource folders.
     * This topic provides an example of how to create a resource folder named <code>rdFolder</code> under the Root folder.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource folder by calling CreateFolder.</p>
     * 
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access policy.</p>
     * 
     * @param request CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyDocument)) {
            query.put("PolicyDocument", request.policyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an access policy.</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version of an access policy by calling CreatePolicyVersion.</p>
     * 
     * @param request CreatePolicyVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyVersionResponse
     */
    public CreatePolicyVersionResponse createPolicyVersionWithOptions(CreatePolicyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyDocument)) {
            query.put("PolicyDocument", request.policyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.setAsDefault)) {
            query.put("SetAsDefault", request.setAsDefault);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicyVersion"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a version of an access policy by calling CreatePolicyVersion.</p>
     * 
     * @param request CreatePolicyVersionRequest
     * @return CreatePolicyVersionResponse
     */
    public CreatePolicyVersionResponse createPolicyVersion(CreatePolicyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In a resource directory, a member serves as a resource container and is a resource grouping unit. A member typically represents a project or application. Resources in each member are physically isolated from resources in other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the resource account type by calling CreateResourceAccount.</p>
     * 
     * @param request CreateResourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceAccountResponse
     */
    public CreateResourceAccountResponse createResourceAccountWithOptions(CreateResourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNamePrefix)) {
            query.put("AccountNamePrefix", request.accountNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerAccountId)) {
            query.put("PayerAccountId", request.payerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resellAccountType)) {
            query.put("ResellAccountType", request.resellAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>In a resource directory, a member serves as a resource container and is a resource grouping unit. A member typically represents a project or application. Resources in each member are physically isolated from resources in other members.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the resource account type by calling CreateResourceAccount.</p>
     * 
     * @param request CreateResourceAccountRequest
     * @return CreateResourceAccountResponse
     */
    public CreateResourceAccountResponse createResourceAccount(CreateResourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of 30 resource groups within an Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of 30 resource groups within an Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a role by calling CreateRole.</p>
     * 
     * @param request CreateRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assumeRolePolicyDocument)) {
            query.put("AssumeRolePolicyDocument", request.assumeRolePolicyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSessionDuration)) {
            query.put("MaxSessionDuration", request.maxSessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a role by calling CreateRole.</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customSuffix)) {
            query.put("CustomSuffix", request.customSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Declines a handshake invitation by the invited Alibaba Cloud account.</p>
     * 
     * @param request DeclineHandshakeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeclineHandshakeResponse
     */
    public DeclineHandshakeResponse declineHandshakeWithOptions(DeclineHandshakeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.handshakeId)) {
            query.put("HandshakeId", request.handshakeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeclineHandshake"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeclineHandshakeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Declines a handshake invitation by the invited Alibaba Cloud account.</p>
     * 
     * @param request DeclineHandshakeRequest
     * @return DeclineHandshakeResponse
     */
    public DeclineHandshakeResponse declineHandshake(DeclineHandshakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.declineHandshakeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before deleting a member, call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> and <a href="https://help.aliyun.com/document_detail/448775.html">GetAccountDeletionCheckResult</a> to perform a pre-deletion check on the member. Only members that meet the deletion conditions can be successfully deleted by calling DeleteAccount.
     * After you successfully submit a member deletion request, you can call <a href="https://help.aliyun.com/document_detail/449001.html">GetAccountDeletionStatus</a> to query the deletion status. Once a member is deleted, all resources and data in the member are deleted. You can no longer log on to or use the member, and the data cannot be recovered. Proceed with caution. For more information about member deletion, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a member of the resource account type by calling DeleteAccount.</p>
     * 
     * @param tmpReq DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAccountShrinkRequest request = new DeleteAccountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.abandonableCheckId)) {
            request.abandonableCheckIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.abandonableCheckId, "AbandonableCheckId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.abandonableCheckIdShrink)) {
            query.put("AbandonableCheckId", request.abandonableCheckIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before deleting a member, call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> and <a href="https://help.aliyun.com/document_detail/448775.html">GetAccountDeletionCheckResult</a> to perform a pre-deletion check on the member. Only members that meet the deletion conditions can be successfully deleted by calling DeleteAccount.
     * After you successfully submit a member deletion request, you can call <a href="https://help.aliyun.com/document_detail/449001.html">GetAccountDeletionStatus</a> to query the deletion status. Once a member is deleted, all resources and data in the member are deleted. You can no longer log on to or use the member, and the data cannot be recovered. Proceed with caution. For more information about member deletion, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a member of the resource account type by calling DeleteAccount.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automatic group transfer rule.</p>
     * 
     * @param request DeleteAutoGroupingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoGroupingRuleResponse
     */
    public DeleteAutoGroupingRuleResponse deleteAutoGroupingRuleWithOptions(DeleteAutoGroupingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoGroupingRule"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoGroupingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an automatic group transfer rule.</p>
     * 
     * @param request DeleteAutoGroupingRuleRequest
     * @return DeleteAutoGroupingRuleResponse
     */
    public DeleteAutoGroupingRuleResponse deleteAutoGroupingRule(DeleteAutoGroupingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoGroupingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To delete a custom control policy that is attached to a resource folder or member accounts, invoke <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> to detach the policy first.
     * This topic provides an example on how to delete the custom control policy cp-SImPt8GCEwiq****.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom control policy.</p>
     * 
     * @param request DeleteControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteControlPolicyResponse
     */
    public DeleteControlPolicyResponse deleteControlPolicyWithOptions(DeleteControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>To delete a custom control policy that is attached to a resource folder or member accounts, invoke <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> to detach the policy first.
     * This topic provides an example on how to delete the custom control policy cp-SImPt8GCEwiq****.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom control policy.</p>
     * 
     * @param request DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    public DeleteControlPolicyResponse deleteControlPolicy(DeleteControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before deleting a folder, make sure that the folder does not contain any member accounts or subfolders.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a folder.</p>
     * 
     * @param request DeleteFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolderWithOptions(DeleteFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFolder"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFolderResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before deleting a folder, make sure that the folder does not contain any member accounts or subfolders.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a folder.</p>
     * 
     * @param request DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    public DeleteFolderResponse deleteFolder(DeleteFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before deleting an access policy, delete all non-default versions of the policy. For information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before deleting an access policy, make sure that the policy is not referenced, meaning it is not attached to any Resource Access Management (RAM) user, user group, or RAM role. For information about how to remove an authorization, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified access policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before deleting an access policy, delete all non-default versions of the policy. For information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before deleting an access policy, make sure that the policy is not referenced, meaning it is not attached to any Resource Access Management (RAM) user, user group, or RAM role. For information about how to remove an authorization, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified access policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The default version of an access policy cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a version of an access policy.</p>
     * 
     * @param request DeletePolicyVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyVersionResponse
     */
    public DeletePolicyVersionResponse deletePolicyVersionWithOptions(DeletePolicyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicyVersion"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyVersionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The default version of an access policy cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a version of an access policy.</p>
     * 
     * @param request DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     */
    public DeletePolicyVersionResponse deletePolicyVersion(DeletePolicyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you delete a resource group, delete all resources in the resource group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you delete a resource group, delete all resources in the resource group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a role.</p>
     * 
     * @param request DeleteRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a role.</p>
     * 
     * @param request DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service-linked role.</p>
     * 
     * @param request DeleteServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServiceLinkedRoleResponse
     */
    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRoleWithOptions(DeleteServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServiceLinkedRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a service-linked role.</p>
     * 
     * @param request DeleteServiceLinkedRoleRequest
     * @return DeleteServiceLinkedRoleResponse
     */
    public DeleteServiceLinkedRoleResponse deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If the delegated administrator account being removed has historical management tasks in the trusted service, the removal may affect the normal use of the trusted service. Carefully consider the potential impact before performing the removal.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeregisterDelegatedAdministrator operation to remove the delegated administrator account of a trusted service.</p>
     * 
     * @param request DeregisterDelegatedAdministratorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterDelegatedAdministratorResponse
     */
    public DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministratorWithOptions(DeregisterDelegatedAdministratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePrincipal)) {
            query.put("ServicePrincipal", request.servicePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterDelegatedAdministrator"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterDelegatedAdministratorResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>If the delegated administrator account being removed has historical management tasks in the trusted service, the removal may affect the normal use of the trusted service. Carefully consider the potential impact before performing the removal.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Calls the DeregisterDelegatedAdministrator operation to remove the delegated administrator account of a trusted service.</p>
     * 
     * @param request DeregisterDelegatedAdministratorRequest
     * @return DeregisterDelegatedAdministratorResponse
     */
    public DeregisterDelegatedAdministratorResponse deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deregisterDelegatedAdministratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before closing a resource directory, make sure that you have completed the following operations:</p>
     * <ul>
     * <li>All members in the resource directory have been removed. For information about how to remove a member, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the Root folder in the resource directory have been deleted. For information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Closes a resource directory by calling DestroyResourceDirectory. This operation is irreversible. Proceed with caution.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DestroyResourceDirectoryResponse
     */
    public DestroyResourceDirectoryResponse destroyResourceDirectoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyResourceDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before closing a resource directory, make sure that you have completed the following operations:</p>
     * <ul>
     * <li>All members in the resource directory have been removed. For information about how to remove a member, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the Root folder in the resource directory have been deleted. For information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Closes a resource directory by calling DestroyResourceDirectory. This operation is irreversible. Proceed with caution.</p>
     * @return DestroyResourceDirectoryResponse
     */
    public DestroyResourceDirectoryResponse destroyResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the control policy is detached, the resource folder or member that was previously associated with the policy immediately loses the governance enforced by the policy. Make sure that the result of the detach operation is as expected to avoid impact on your business.
     * Both system policies and custom control policies can be detached. However, the last control policy associated with a resource folder or member cannot be detached.
     * This topic provides an example on how to detach the custom policy <code>cp-jExXAqIYkwHN****</code> from the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches a control policy from a resource folder or member.</p>
     * 
     * @param request DetachControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachControlPolicyResponse
     */
    public DetachControlPolicyResponse detachControlPolicyWithOptions(DetachControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the control policy is detached, the resource folder or member that was previously associated with the policy immediately loses the governance enforced by the policy. Make sure that the result of the detach operation is as expected to avoid impact on your business.
     * Both system policies and custom control policies can be detached. However, the last control policy associated with a resource folder or member cannot be detached.
     * This topic provides an example on how to detach the custom policy <code>cp-jExXAqIYkwHN****</code> from the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches a control policy from a resource folder or member.</p>
     * 
     * @param request DetachControlPolicyRequest
     * @return DetachControlPolicyResponse
     */
    public DetachControlPolicyResponse detachControlPolicy(DetachControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches an access policy from a specified identity. After the policy is detached, the identity loses the permissions to manage resources in the specified resource group or Alibaba Cloud account.</p>
     * 
     * @param request DetachPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachPolicyResponse
     */
    public DetachPolicyResponse detachPolicyWithOptions(DetachPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches an access policy from a specified identity. After the policy is detached, the identity loses the permissions to manage resources in the specified resource group or Alibaba Cloud account.</p>
     * 
     * @param request DetachPolicyRequest
     * @return DetachPolicyResponse
     */
    public DetachPolicyResponse detachPolicy(DetachPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the attached-resource allocation feature for associated resources.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAssociatedTransferResponse
     */
    public DisableAssociatedTransferResponse disableAssociatedTransferWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAssociatedTransfer"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAssociatedTransferResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the attached-resource allocation feature for associated resources.</p>
     * @return DisableAssociatedTransferResponse
     */
    public DisableAssociatedTransferResponse disableAssociatedTransfer() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAssociatedTransferWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables automatic resource group transfer. After this feature is disabled, the custom condition rules and attached-resource transfer rules that have been configured are deleted. The resource groups of existing resources are not affected. If needed, you can re-enable this feature 1 minute after disabling it.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAutoGroupingResponse
     */
    public DisableAutoGroupingResponse disableAutoGroupingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoGrouping"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAutoGroupingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables automatic resource group transfer. After this feature is disabled, the custom condition rules and attached-resource transfer rules that have been configured are deleted. The resource groups of existing resources are not affected. If needed, you can re-enable this feature 1 minute after disabling it.</p>
     * @return DisableAutoGroupingResponse
     */
    public DisableAutoGroupingResponse disableAutoGrouping() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoGroupingWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you disable the control policy feature, all control policies that are attached to resource folders and member accounts are automatically detached. However, the control policies are not deleted. They cannot be attached to any target nodes.</p>
     * <blockquote>
     * <p>Disabling the control policy feature affects the permissions of resource folders and member accounts in the entire resource directory. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the control policy feature.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableControlPolicyResponse
     */
    public DisableControlPolicyResponse disableControlPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you disable the control policy feature, all control policies that are attached to resource folders and member accounts are automatically detached. However, the control policies are not deleted. They cannot be attached to any target nodes.</p>
     * <blockquote>
     * <p>Disabling the control policy feature affects the permissions of resource folders and member accounts in the entire resource directory. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the control policy feature.</p>
     * @return DisableControlPolicyResponse
     */
    public DisableControlPolicyResponse disableControlPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableControlPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a resource group event notification that is currently enabled. If the notification is already disabled, the error code <code>UnsupportedOperation.RepeatDisableResourceGroupNotification</code> is returned. You can call <code>EnableResourceGroupNotification</code> to enable the notification first.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableResourceGroupNotificationResponse
     */
    public DisableResourceGroupNotificationResponse disableResourceGroupNotificationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableResourceGroupNotification"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableResourceGroupNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a resource group event notification that is currently enabled. If the notification is already disabled, the error code <code>UnsupportedOperation.RepeatDisableResourceGroupNotification</code> is returned. You can call <code>EnableResourceGroupNotification</code> to enable the notification first.</p>
     * @return DisableResourceGroupNotificationResponse
     */
    public DisableResourceGroupNotificationResponse disableResourceGroupNotification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableResourceGroupNotificationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the attached-resource allocation feature for resource group transfers.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAssociatedTransferResponse
     */
    public EnableAssociatedTransferResponse enableAssociatedTransferWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAssociatedTransfer"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAssociatedTransferResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the attached-resource allocation feature for resource group transfers.</p>
     * @return EnableAssociatedTransferResponse
     */
    public EnableAssociatedTransferResponse enableAssociatedTransfer() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAssociatedTransferWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables automatic grouping. After automatic grouping is enabled, you can create, update, delete, and query automatic grouping rules.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAutoGroupingResponse
     */
    public EnableAutoGroupingResponse enableAutoGroupingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoGrouping"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoGroupingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables automatic grouping. After automatic grouping is enabled, you can create, update, delete, and query automatic grouping rules.</p>
     * @return EnableAutoGroupingResponse
     */
    public EnableAutoGroupingResponse enableAutoGrouping() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoGroupingWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>A resource directory control policy is an access control policy based on the resource structure (resource folders or member accounts). It allows you to centrally manage the access permissions border for resource access at each level of the resource directory and establish overall or localized access control principles for your enterprise. Control policies define only the access permissions border and do not actually grant permissions. You must also set permissions by using Resource Access Management (RAM) in a member account before the corresponding identity can have access permissions to resources. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of control policies</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the control policy feature by calling EnableControlPolicy.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableControlPolicyResponse
     */
    public EnableControlPolicyResponse enableControlPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>A resource directory control policy is an access control policy based on the resource structure (resource folders or member accounts). It allows you to centrally manage the access permissions border for resource access at each level of the resource directory and establish overall or localized access control principles for your enterprise. Control policies define only the access permissions border and do not actually grant permissions. You must also set permissions by using Resource Access Management (RAM) in a member account before the corresponding identity can have access permissions to resources. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of control policies</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the control policy feature by calling EnableControlPolicy.</p>
     * @return EnableControlPolicyResponse
     */
    public EnableControlPolicyResponse enableControlPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableControlPolicyWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can enable a resource directory by using the current logon account or by creating a new management account. For more information, refer to <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * This topic provides an example of how to enable a resource directory by using the current logon account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a resource directory.</p>
     * 
     * @param request EnableResourceDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableResourceDirectoryResponse
     */
    public EnableResourceDirectoryResponse enableResourceDirectoryWithOptions(EnableResourceDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableMode)) {
            query.put("EnableMode", request.enableMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MAName)) {
            query.put("MAName", request.MAName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MASecureMobilePhone)) {
            query.put("MASecureMobilePhone", request.MASecureMobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCode)) {
            query.put("VerificationCode", request.verificationCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableResourceDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can enable a resource directory by using the current logon account or by creating a new management account. For more information, refer to <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * This topic provides an example of how to enable a resource directory by using the current logon account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a resource directory.</p>
     * 
     * @param request EnableResourceDirectoryRequest
     * @return EnableResourceDirectoryResponse
     */
    public EnableResourceDirectoryResponse enableResourceDirectory(EnableResourceDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableResourceDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables resource group event notifications by calling EnableResourceGroupNotification.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableResourceGroupNotificationResponse
     */
    public EnableResourceGroupNotificationResponse enableResourceGroupNotificationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableResourceGroupNotification"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableResourceGroupNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables resource group event notifications by calling EnableResourceGroupNotification.</p>
     * @return EnableResourceGroupNotificationResponse
     */
    public EnableResourceGroupNotificationResponse enableResourceGroupNotification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableResourceGroupNotificationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls GetAccount to retrieve member account information.</p>
     * 
     * @param request GetAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountResponse
     */
    public GetAccountResponse getAccountWithOptions(GetAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls GetAccount to retrieve member account information.</p>
     * 
     * @param request GetAccountRequest
     * @return GetAccountResponse
     */
    public GetAccountResponse getAccount(GetAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> to perform a member deletion check task, you can call GetAccountDeletionCheckResult to query the result of the member deletion check. If the deletion check requirements are met, the member account can be deleted. Otherwise, manually handle the non-compliant items until all requirements are met.
     * This topic provides an example on how to query the deletion check result of the member account <code>179855839641****</code> that you want to delete. The response shows that the member account does not meet the deletion requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of a member deletion check by calling GetAccountDeletionCheckResult.</p>
     * 
     * @param request GetAccountDeletionCheckResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountDeletionCheckResultResponse
     */
    public GetAccountDeletionCheckResultResponse getAccountDeletionCheckResultWithOptions(GetAccountDeletionCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountDeletionCheckResult"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountDeletionCheckResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> to perform a member deletion check task, you can call GetAccountDeletionCheckResult to query the result of the member deletion check. If the deletion check requirements are met, the member account can be deleted. Otherwise, manually handle the non-compliant items until all requirements are met.
     * This topic provides an example on how to query the deletion check result of the member account <code>179855839641****</code> that you want to delete. The response shows that the member account does not meet the deletion requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of a member deletion check by calling GetAccountDeletionCheckResult.</p>
     * 
     * @param request GetAccountDeletionCheckResultRequest
     * @return GetAccountDeletionCheckResultResponse
     */
    public GetAccountDeletionCheckResultResponse getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountDeletionCheckResultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the deletion status of the member account <code>169946124551****</code>. The response shows that the member account has been successfully deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the deletion status of a member account.</p>
     * 
     * @param request GetAccountDeletionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountDeletionStatusResponse
     */
    public GetAccountDeletionStatusResponse getAccountDeletionStatusWithOptions(GetAccountDeletionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountDeletionStatus"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountDeletionStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the deletion status of the member account <code>169946124551****</code>. The response shows that the member account has been successfully deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the deletion status of a member account.</p>
     * 
     * @param request GetAccountDeletionStatusRequest
     * @return GetAccountDeletionStatusResponse
     */
    public GetAccountDeletionStatusResponse getAccountDeletionStatus(GetAccountDeletionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountDeletionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an automatic resource group transfer rule.</p>
     * 
     * @param request GetAutoGroupingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoGroupingRuleResponse
     */
    public GetAutoGroupingRuleResponse getAutoGroupingRuleWithOptions(GetAutoGroupingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoGroupingRule"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoGroupingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an automatic resource group transfer rule.</p>
     * 
     * @param request GetAutoGroupingRuleRequest
     * @return GetAutoGroupingRuleResponse
     */
    public GetAutoGroupingRuleResponse getAutoGroupingRule(GetAutoGroupingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoGroupingRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of automatic resource group transfer settings by calling GetAutoGroupingStatus.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoGroupingStatusResponse
     */
    public GetAutoGroupingStatusResponse getAutoGroupingStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoGroupingStatus"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoGroupingStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of automatic resource group transfer settings by calling GetAutoGroupingStatus.</p>
     * @return GetAutoGroupingStatusResponse
     */
    public GetAutoGroupingStatusResponse getAutoGroupingStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoGroupingStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a control policy.</p>
     * 
     * @param request GetControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetControlPolicyResponse
     */
    public GetControlPolicyResponse getControlPolicyWithOptions(GetControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a control policy.</p>
     * 
     * @param request GetControlPolicyRequest
     * @return GetControlPolicyResponse
     */
    public GetControlPolicyResponse getControlPolicy(GetControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the enabling status of the control policy feature.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetControlPolicyEnablementStatusResponse
     */
    public GetControlPolicyEnablementStatusResponse getControlPolicyEnablementStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetControlPolicyEnablementStatus"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetControlPolicyEnablementStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the enabling status of the control policy feature.</p>
     * @return GetControlPolicyEnablementStatusResponse
     */
    public GetControlPolicyEnablementStatusResponse getControlPolicyEnablementStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getControlPolicyEnablementStatusWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls GetFolder to retrieve the information about a folder.</p>
     * 
     * @param request GetFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolderWithOptions(GetFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFolder"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls GetFolder to retrieve the information about a folder.</p>
     * 
     * @param request GetFolderRequest
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to retrieve the information about the handshake whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves handshake information by calling GetHandshake.</p>
     * 
     * @param request GetHandshakeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHandshakeResponse
     */
    public GetHandshakeResponse getHandshakeWithOptions(GetHandshakeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.handshakeId)) {
            query.put("HandshakeId", request.handshakeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHandshake"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHandshakeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to retrieve the information about the handshake whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves handshake information by calling GetHandshake.</p>
     * 
     * @param request GetHandshakeRequest
     * @return GetHandshakeResponse
     */
    public GetHandshakeResponse getHandshake(GetHandshakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHandshakeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the billing account information of a member account by calling GetPayerForAccount.</p>
     * 
     * @param request GetPayerForAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPayerForAccountResponse
     */
    public GetPayerForAccountResponse getPayerForAccountWithOptions(GetPayerForAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPayerForAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPayerForAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the billing account information of a member account by calling GetPayerForAccount.</p>
     * 
     * @param request GetPayerForAccountRequest
     * @return GetPayerForAccountResponse
     */
    public GetPayerForAccountResponse getPayerForAccount(GetPayerForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPayerForAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a specified access policy.</p>
     * 
     * @param request GetPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a specified access policy.</p>
     * 
     * @param request GetPolicyRequest
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a version of an access policy.</p>
     * 
     * @param request GetPolicyVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyVersionResponse
     */
    public GetPolicyVersionResponse getPolicyVersionWithOptions(GetPolicyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicyVersion"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a version of an access policy.</p>
     * 
     * @param request GetPolicyVersionRequest
     * @return GetPolicyVersionResponse
     */
    public GetPolicyVersionResponse getPolicyVersion(GetPolicyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to use a management account to query the details of the resource directory created by the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries resource directory information. When called by a management account, returns the details of the resource directory created by the management account. When called by a member, returns the details of the resource directory to which the member belongs.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceDirectoryResponse
     */
    public GetResourceDirectoryResponse getResourceDirectoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to use a management account to query the details of the resource directory created by the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries resource directory information. When called by a management account, returns the details of the resource directory created by the management account. When called by a member, returns the details of the resource directory to which the member belongs.</p>
     * @return GetResourceDirectoryResponse
     */
    public GetResourceDirectoryResponse getResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a resource group.</p>
     * 
     * @param request GetResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroupWithOptions(GetResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a resource group.</p>
     * 
     * @param request GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroup(GetResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the administrator settings of a resource group.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupAdminSettingResponse
     */
    public GetResourceGroupAdminSettingResponse getResourceGroupAdminSettingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupAdminSetting"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupAdminSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the administrator settings of a resource group.</p>
     * @return GetResourceGroupAdminSettingResponse
     */
    public GetResourceGroupAdminSettingResponse getResourceGroupAdminSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupAdminSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the notification settings of a resource group by calling GetResourceGroupNotificationSetting.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupNotificationSettingResponse
     */
    public GetResourceGroupNotificationSettingResponse getResourceGroupNotificationSettingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupNotificationSetting"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupNotificationSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the notification settings of a resource group by calling GetResourceGroupNotificationSetting.</p>
     * @return GetResourceGroupNotificationSettingResponse
     */
    public GetResourceGroupNotificationSettingResponse getResourceGroupNotificationSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupNotificationSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource count in visible resource groups.</p>
     * 
     * @param request GetResourceGroupResourceCountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResourceCountsResponse
     */
    public GetResourceGroupResourceCountsResponse getResourceGroupResourceCountsWithOptions(GetResourceGroupResourceCountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupByKey)) {
            query.put("GroupByKey", request.groupByKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupResourceCounts"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResourceCountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource count in visible resource groups.</p>
     * 
     * @param request GetResourceGroupResourceCountsRequest
     * @return GetResourceGroupResourceCountsResponse
     */
    public GetResourceGroupResourceCountsResponse getResourceGroupResourceCounts(GetResourceGroupResourceCountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupResourceCountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a role by calling GetRole.</p>
     * 
     * @param request GetRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleResponse
     */
    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a role by calling GetRole.</p>
     * 
     * @param request GetRoleRequest
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a task that deletes a service-linked role.</p>
     * 
     * @param request GetServiceLinkedRoleDeletionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceLinkedRoleDeletionStatusResponse
     */
    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatusWithOptions(GetServiceLinkedRoleDeletionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletionTaskId)) {
            query.put("DeletionTaskId", request.deletionTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceLinkedRoleDeletionStatus"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceLinkedRoleDeletionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a task that deletes a service-linked role.</p>
     * 
     * @param request GetServiceLinkedRoleDeletionStatusRequest
     * @return GetServiceLinkedRoleDeletionStatusResponse
     */
    public GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceLinkedRoleDeletionStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Use an account that has passed enterprise real-name verification to enable a resource directory. An account that has passed only individual real-name verification cannot enable a resource directory.</li>
     * <li>Use the management account only as the administrator of the resource directory. Do not purchase cloud service resources with the management account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Calls InitResourceDirectory to enable a resource directory. After you enable a resource directory, the system creates a Root folder and sets the current account as the management account. The management account has all permissions to manage the resource directory.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitResourceDirectoryResponse
     */
    public InitResourceDirectoryResponse initResourceDirectoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitResourceDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Use an account that has passed enterprise real-name verification to enable a resource directory. An account that has passed only individual real-name verification cannot enable a resource directory.</li>
     * <li>Use the management account only as the administrator of the resource directory. Do not purchase cloud service resources with the management account.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Calls InitResourceDirectory to enable a resource directory. After you enable a resource directory, the system creates a Root folder and sets the current account as the management account. The management account has all permissions to manage the resource directory.</p>
     * @return InitResourceDirectoryResponse
     */
    public InitResourceDirectoryResponse initResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to invite the external account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites an external account to join a resource directory.</p>
     * 
     * @param request InviteAccountToResourceDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InviteAccountToResourceDirectoryResponse
     */
    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectoryWithOptions(InviteAccountToResourceDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            query.put("Note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetEntity)) {
            query.put("TargetEntity", request.targetEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteAccountToResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteAccountToResourceDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to invite the external account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites an external account to join a resource directory.</p>
     * 
     * @param request InviteAccountToResourceDirectoryRequest
     * @return InviteAccountToResourceDirectoryResponse
     */
    public InviteAccountToResourceDirectoryResponse inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteAccountToResourceDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The management account of the resource directory and the delegated administrator accounts of trusted services can call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all member accounts in a resource directory by calling ListAccounts.</p>
     * 
     * @param request ListAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccountsWithOptions(ListAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccounts"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The management account of the resource directory and the delegated administrator accounts of trusted services can call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of all member accounts in a resource directory by calling ListAccounts.</p>
     * 
     * @param request ListAccountsRequest
     * @return ListAccountsResponse
     */
    public ListAccountsResponse listAccounts(ListAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of member accounts in a resource folder by calling ListAccountsForParent.</p>
     * 
     * @param request ListAccountsForParentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccountsForParentResponse
     */
    public ListAccountsForParentResponse listAccountsForParentWithOptions(ListAccountsForParentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyword)) {
            query.put("QueryKeyword", request.queryKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccountsForParent"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccountsForParentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of member accounts in a resource folder by calling ListAccountsForParent.</p>
     * 
     * @param request ListAccountsForParentRequest
     * @return ListAccountsForParentResponse
     */
    public ListAccountsForParentResponse listAccountsForParent(ListAccountsForParentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsForParentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about all parent folders of a specified folder. The results are displayed in order from top to bottom.</p>
     * 
     * @param request ListAncestorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAncestorsResponse
     */
    public ListAncestorsResponse listAncestorsWithOptions(ListAncestorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childId)) {
            query.put("ChildId", request.childId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAncestors"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAncestorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about all parent folders of a specified folder. The results are displayed in order from top to bottom.</p>
     * 
     * @param request ListAncestorsRequest
     * @return ListAncestorsResponse
     */
    public ListAncestorsResponse listAncestors(ListAncestorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAncestorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the settings of the associated resource group transfer feature.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAssociatedTransferSettingResponse
     */
    public ListAssociatedTransferSettingResponse listAssociatedTransferSettingWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAssociatedTransferSetting"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAssociatedTransferSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the settings of the associated resource group transfer feature.</p>
     * @return ListAssociatedTransferSettingResponse
     */
    public ListAssociatedTransferSettingResponse listAssociatedTransferSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAssociatedTransferSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists auto-grouping remediation records.</p>
     * 
     * @param request ListAutoGroupingRemediationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoGroupingRemediationsResponse
     */
    public ListAutoGroupingRemediationsResponse listAutoGroupingRemediationsWithOptions(ListAutoGroupingRemediationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.earliestRemediationTime)) {
            query.put("EarliestRemediationTime", request.earliestRemediationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latestRemediationTime)) {
            query.put("LatestRemediationTime", request.latestRemediationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceGroupId)) {
            query.put("TargetResourceGroupId", request.targetResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoGroupingRemediations"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoGroupingRemediationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists auto-grouping remediation records.</p>
     * 
     * @param request ListAutoGroupingRemediationsRequest
     * @return ListAutoGroupingRemediationsResponse
     */
    public ListAutoGroupingRemediationsResponse listAutoGroupingRemediations(ListAutoGroupingRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoGroupingRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of automatic group transfer rules.</p>
     * 
     * @param request ListAutoGroupingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoGroupingRulesResponse
     */
    public ListAutoGroupingRulesResponse listAutoGroupingRulesWithOptions(ListAutoGroupingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoGroupingRules"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoGroupingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of automatic group transfer rules.</p>
     * 
     * @param request ListAutoGroupingRulesRequest
     * @return ListAutoGroupingRulesResponse
     */
    public ListAutoGroupingRulesResponse listAutoGroupingRules(ListAutoGroupingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoGroupingRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of control policies.</p>
     * 
     * @param request ListControlPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListControlPoliciesResponse
     */
    public ListControlPoliciesResponse listControlPoliciesWithOptions(ListControlPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListControlPolicies"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListControlPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of control policies.</p>
     * 
     * @param request ListControlPoliciesRequest
     * @return ListControlPoliciesResponse
     */
    public ListControlPoliciesResponse listControlPolicies(ListControlPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listControlPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the list of control policies attached to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of control policies attached to a resource folder or member account.</p>
     * 
     * @param request ListControlPolicyAttachmentsForTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListControlPolicyAttachmentsForTargetResponse
     */
    public ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTargetWithOptions(ListControlPolicyAttachmentsForTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListControlPolicyAttachmentsForTarget"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListControlPolicyAttachmentsForTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the list of control policies attached to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of control policies attached to a resource folder or member account.</p>
     * 
     * @param request ListControlPolicyAttachmentsForTargetRequest
     * @return ListControlPolicyAttachmentsForTargetResponse
     */
    public ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listControlPolicyAttachmentsForTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of delegated administrator accounts for a trusted service.</p>
     * 
     * @param request ListDelegatedAdministratorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDelegatedAdministratorsResponse
     */
    public ListDelegatedAdministratorsResponse listDelegatedAdministratorsWithOptions(ListDelegatedAdministratorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePrincipal)) {
            query.put("ServicePrincipal", request.servicePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDelegatedAdministrators"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDelegatedAdministratorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of delegated administrator accounts for a trusted service.</p>
     * 
     * @param request ListDelegatedAdministratorsRequest
     * @return ListDelegatedAdministratorsResponse
     */
    public ListDelegatedAdministratorsResponse listDelegatedAdministrators(ListDelegatedAdministratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDelegatedAdministratorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trusted services for which a specified member is set as a delegated administrator account.</p>
     * 
     * @param request ListDelegatedServicesForAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDelegatedServicesForAccountResponse
     */
    public ListDelegatedServicesForAccountResponse listDelegatedServicesForAccountWithOptions(ListDelegatedServicesForAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDelegatedServicesForAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDelegatedServicesForAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the trusted services for which a specified member is set as a delegated administrator account.</p>
     * 
     * @param request ListDelegatedServicesForAccountRequest
     * @return ListDelegatedServicesForAccountResponse
     */
    public ListDelegatedServicesForAccountResponse listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDelegatedServicesForAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the subfolders at the next level of the specified folder. You cannot query subfolders at deeper levels.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the subfolders of a specified folder.</p>
     * 
     * @param request ListFoldersForParentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFoldersForParentResponse
     */
    public ListFoldersForParentResponse listFoldersForParentWithOptions(ListFoldersForParentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyword)) {
            query.put("QueryKeyword", request.queryKeyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFoldersForParent"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFoldersForParentResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the subfolders at the next level of the specified folder. You cannot query subfolders at deeper levels.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the subfolders of a specified folder.</p>
     * 
     * @param request ListFoldersForParentRequest
     * @return ListFoldersForParentResponse
     */
    public ListFoldersForParentResponse listFoldersForParent(ListFoldersForParentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersForParentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the invitation records of the current management account <code>172841235500****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invitation records under the current account.</p>
     * 
     * @param request ListHandshakesForAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHandshakesForAccountResponse
     */
    public ListHandshakesForAccountResponse listHandshakesForAccountWithOptions(ListHandshakesForAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHandshakesForAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHandshakesForAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the invitation records of the current management account <code>172841235500****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invitation records under the current account.</p>
     * 
     * @param request ListHandshakesForAccountRequest
     * @return ListHandshakesForAccountResponse
     */
    public ListHandshakesForAccountResponse listHandshakesForAccount(ListHandshakesForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHandshakesForAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all invitations in a resource directory.</p>
     * 
     * @param request ListHandshakesForResourceDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHandshakesForResourceDirectoryResponse
     */
    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectoryWithOptions(ListHandshakesForResourceDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHandshakesForResourceDirectory"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHandshakesForResourceDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all invitations in a resource directory.</p>
     * 
     * @param request ListHandshakesForResourceDirectoryRequest
     * @return ListHandshakesForResourceDirectoryResponse
     */
    public ListHandshakesForResourceDirectoryResponse listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHandshakesForResourceDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls ListPolicies to query a list of access policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicies"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls ListPolicies to query a list of access policies.</p>
     * 
     * @param request ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the following information:</p>
     * <ul>
     * <li>All authorization records under an Alibaba Cloud account or a resource group.</li>
     * <li>All access policies granted to a Resource Access Management (RAM) user, RAM user group, or RAM role.</li>
     * <li>RAM users, RAM user groups, and RAM roles that have a specific permission under an Alibaba Cloud account or a resource group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of policy attachments by calling ListPolicyAttachments.</p>
     * 
     * @param request ListPolicyAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyAttachmentsResponse
     */
    public ListPolicyAttachmentsResponse listPolicyAttachmentsWithOptions(ListPolicyAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            query.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyAttachments"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyAttachmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the following information:</p>
     * <ul>
     * <li>All authorization records under an Alibaba Cloud account or a resource group.</li>
     * <li>All access policies granted to a Resource Access Management (RAM) user, RAM user group, or RAM role.</li>
     * <li>RAM users, RAM user groups, and RAM roles that have a specific permission under an Alibaba Cloud account or a resource group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of policy attachments by calling ListPolicyAttachments.</p>
     * 
     * @param request ListPolicyAttachmentsRequest
     * @return ListPolicyAttachmentsResponse
     */
    public ListPolicyAttachmentsResponse listPolicyAttachments(ListPolicyAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an access policy.</p>
     * 
     * @param request ListPolicyVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicyVersionsResponse
     */
    public ListPolicyVersionsResponse listPolicyVersionsWithOptions(ListPolicyVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicyVersions"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicyVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of an access policy.</p>
     * 
     * @param request ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     */
    public ListPolicyVersionsResponse listPolicyVersions(ListPolicyVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicyVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the capability items of resource groups.</p>
     * 
     * @param request ListResourceGroupCapabilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupCapabilityResponse
     */
    public ListResourceGroupCapabilityResponse listResourceGroupCapabilityWithOptions(ListResourceGroupCapabilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportResourceGroupEvent)) {
            query.put("SupportResourceGroupEvent", request.supportResourceGroupEvent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupCapability"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupCapabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the capability items of resource groups.</p>
     * 
     * @param request ListResourceGroupCapabilityRequest
     * @return ListResourceGroupCapabilityResponse
     */
    public ListResourceGroupCapabilityResponse listResourceGroupCapability(ListResourceGroupCapabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupCapabilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all resource groups under the current account. You can also filter resource groups by resource group status, resource group ID, resource group identifier, or resource group display name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource groups.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all resource groups under the current account. You can also filter resource groups by resource group status, resource group ID, resource group identifier, or resource group display name.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource groups.</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists resource groups along with user authorization details.</p>
     * 
     * @param request ListResourceGroupsWithAuthDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsWithAuthDetailsResponse
     */
    public ListResourceGroupsWithAuthDetailsResponse listResourceGroupsWithAuthDetailsWithOptions(ListResourceGroupsWithAuthDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeTags)) {
            query.put("IncludeTags", request.includeTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceRegionId)) {
            query.put("ResourceRegionId", request.resourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupsWithAuthDetails"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsWithAuthDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists resource groups along with user authorization details.</p>
     * 
     * @param request ListResourceGroupsWithAuthDetailsRequest
     * @return ListResourceGroupsWithAuthDetailsResponse
     */
    public ListResourceGroupsWithAuthDetailsResponse listResourceGroupsWithAuthDetails(ListResourceGroupsWithAuthDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceGroupsWithAuthDetailsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API can be called by assuming a RAM role, but session policies for the role are not supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in the resource groups accessible to the current account.</p>
     * 
     * @param request ListResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResources"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API can be called by assuming a RAM role, but session policies for the role are not supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in the resource groups accessible to the current account.</p>
     * 
     * @param request ListResourcesRequest
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of roles by calling ListRoles.</p>
     * 
     * @param request ListRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of roles by calling ListRoles.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag key list of resource directory member accounts by calling ListTagKeys.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyFilter)) {
            query.put("KeyFilter", request.keyFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag key list of resource directory member accounts by calling ListTagKeys.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a resource group or a resource directory member.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are attached to a resource group or a resource directory member.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to query the tag values of the tag key k1. The response shows that the tag value corresponding to the tag key k1 is v1.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag values of a specified tag key by calling ListTagValues.</p>
     * 
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.valueFilter)) {
            query.put("ValueFilter", request.valueFilter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to query the tag values of the tag key k1. The response shows that the tag value corresponding to the tag key k1 is v1.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tag values of a specified tag key by calling ListTagValues.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nodes to which a control policy is attached.</p>
     * 
     * @param request ListTargetAttachmentsForControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTargetAttachmentsForControlPolicyResponse
     */
    public ListTargetAttachmentsForControlPolicyResponse listTargetAttachmentsForControlPolicyWithOptions(ListTargetAttachmentsForControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTargetAttachmentsForControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTargetAttachmentsForControlPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nodes to which a control policy is attached.</p>
     * 
     * @param request ListTargetAttachmentsForControlPolicyRequest
     * @return ListTargetAttachmentsForControlPolicyResponse
     */
    public ListTargetAttachmentsForControlPolicyResponse listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTargetAttachmentsForControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation can be called only by the management account or a delegated administrator account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of trusted services enabled by the management account or a delegated administrator account.</p>
     * 
     * @param request ListTrustedServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTrustedServiceStatusResponse
     */
    public ListTrustedServiceStatusResponse listTrustedServiceStatusWithOptions(ListTrustedServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adminAccountId)) {
            query.put("AdminAccountId", request.adminAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTrustedServiceStatus"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTrustedServiceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation can be called only by the management account or a delegated administrator account.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of trusted services enabled by the management account or a delegated administrator account.</p>
     * 
     * @param request ListTrustedServiceStatusRequest
     * @return ListTrustedServiceStatusResponse
     */
    public ListTrustedServiceStatusResponse listTrustedServiceStatus(ListTrustedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTrustedServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource group events.</p>
     * 
     * @param request LookupResourceGroupEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LookupResourceGroupEventsResponse
     */
    public LookupResourceGroupEventsResponse lookupResourceGroupEventsWithOptions(LookupResourceGroupEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventCategory)) {
            query.put("EventCategory", request.eventCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lookupAttributes)) {
            query.put("LookupAttributes", request.lookupAttributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupDisplayName)) {
            query.put("ResourceGroupDisplayName", request.resourceGroupDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LookupResourceGroupEvents"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LookupResourceGroupEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource group events.</p>
     * 
     * @param request LookupResourceGroupEventsRequest
     * @return LookupResourceGroupEventsResponse
     */
    public LookupResourceGroupEventsResponse lookupResourceGroupEvents(LookupResourceGroupEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lookupResourceGroupEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a member to another folder.</p>
     * 
     * @param request MoveAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveAccountResponse
     */
    public MoveAccountResponse moveAccountWithOptions(MoveAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationFolderId)) {
            query.put("DestinationFolderId", request.destinationFolderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Moves a member to another folder.</p>
     * 
     * @param request MoveAccountRequest
     * @return MoveAccountResponse
     */
    public MoveAccountResponse moveAccount(MoveAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supports batch transfer of resources across regions, cloud services, and resource groups.
     * For cloud services that support resource group transfer, see the <strong>API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls MoveResources to move resources from one resource group to another.</p>
     * 
     * @param request MoveResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourcesResponse
     */
    public MoveResourcesResponse moveResourcesWithOptions(MoveResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResources"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Supports batch transfer of resources across regions, cloud services, and resource groups.
     * For cloud services that support resource group transfer, see the <strong>API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls MoveResources to move resources from one resource group to another.</p>
     * 
     * @param request MoveResourcesRequest
     * @return MoveResourcesResponse
     */
    public MoveResourcesResponse moveResources(MoveResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a resource account to an Alibaba Cloud account. This is an asynchronous operation.</p>
     * 
     * @param request PromoteResourceAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PromoteResourceAccountResponse
     */
    public PromoteResourceAccountResponse promoteResourceAccountWithOptions(PromoteResourceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PromoteResourceAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PromoteResourceAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a resource account to an Alibaba Cloud account. This is an asynchronous operation.</p>
     * 
     * @param request PromoteResourceAccountRequest
     * @return PromoteResourceAccountResponse
     */
    public PromoteResourceAccountResponse promoteResourceAccount(PromoteResourceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.promoteResourceAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After the settings are complete, the delegated administrator account is granted authorization to access the organizational information of the resource directory, which provides visibility into the organization members and structure. The delegated administrator account executes service-related management operations on behalf of the management account in the specified trusted service.
     * Limits:</p>
     * <ul>
     * <li>Only some trusted services support the delegated administrator feature. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of the resource directory and authorized Resource Access Management (RAM) users and RAM roles under the management account can invoke this API operation.</li>
     * <li>The maximum number of delegated administrator accounts that can be added is defined by each trusted service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a member account in a resource directory as a delegated administrator account for a trusted service.</p>
     * 
     * @param request RegisterDelegatedAdministratorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDelegatedAdministratorResponse
     */
    public RegisterDelegatedAdministratorResponse registerDelegatedAdministratorWithOptions(RegisterDelegatedAdministratorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePrincipal)) {
            query.put("ServicePrincipal", request.servicePrincipal);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDelegatedAdministrator"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDelegatedAdministratorResponse());
    }

    /**
     * <b>description</b> :
     * <p>After the settings are complete, the delegated administrator account is granted authorization to access the organizational information of the resource directory, which provides visibility into the organization members and structure. The delegated administrator account executes service-related management operations on behalf of the management account in the specified trusted service.
     * Limits:</p>
     * <ul>
     * <li>Only some trusted services support the delegated administrator feature. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of the resource directory and authorized Resource Access Management (RAM) users and RAM roles under the management account can invoke this API operation.</li>
     * <li>The maximum number of delegated administrator accounts that can be added is defined by each trusted service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets a member account in a resource directory as a delegated administrator account for a trusted service.</p>
     * 
     * @param request RegisterDelegatedAdministratorRequest
     * @return RegisterDelegatedAdministratorResponse
     */
    public RegisterDelegatedAdministratorResponse registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDelegatedAdministratorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a member of the cloud account type. After the member is removed, it exists as an independent Alibaba Cloud account and is no longer managed by the management account of the resource directory.</p>
     * 
     * @param request RemoveCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveCloudAccountResponse
     */
    public RemoveCloudAccountResponse removeCloudAccountWithOptions(RemoveCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCloudAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveCloudAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a member of the cloud account type. After the member is removed, it exists as an independent Alibaba Cloud account and is no longer managed by the management account of the resource directory.</p>
     * 
     * @param request RemoveCloudAccountRequest
     * @return RemoveCloudAccountResponse
     */
    public RemoveCloudAccountResponse removeCloudAccount(RemoveCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for creating a cloud account.</p>
     * 
     * @param request ResendCreateCloudAccountEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendCreateCloudAccountEmailResponse
     */
    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmailWithOptions(ResendCreateCloudAccountEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendCreateCloudAccountEmail"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendCreateCloudAccountEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for creating a cloud account.</p>
     * 
     * @param request ResendCreateCloudAccountEmailRequest
     * @return ResendCreateCloudAccountEmailResponse
     */
    public ResendCreateCloudAccountEmailResponse resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendCreateCloudAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for upgrading a resource account to a cloud account.</p>
     * 
     * @param request ResendPromoteResourceAccountEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendPromoteResourceAccountEmailResponse
     */
    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmailWithOptions(ResendPromoteResourceAccountEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendPromoteResourceAccountEmail"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendPromoteResourceAccountEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for upgrading a resource account to a cloud account.</p>
     * 
     * @param request ResendPromoteResourceAccountEmailRequest
     * @return ResendPromoteResourceAccountEmailResponse
     */
    public ResendPromoteResourceAccountEmailResponse resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendPromoteResourceAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for changing the email address of a member account.</p>
     * 
     * @param request RetryChangeAccountEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryChangeAccountEmailResponse
     */
    public RetryChangeAccountEmailResponse retryChangeAccountEmailWithOptions(RetryChangeAccountEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryChangeAccountEmail"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryChangeAccountEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resends the confirmation email for changing the email address of a member account.</p>
     * 
     * @param request RetryChangeAccountEmailRequest
     * @return RetryChangeAccountEmailResponse
     */
    public RetryChangeAccountEmailResponse retryChangeAccountEmail(RetryChangeAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryChangeAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource directory management permission (AliyunResourceDirectoryFullAccess) to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to a secure phone number when you set the secure phone number for a member of the resource account type by calling SendVerificationCodeForBindSecureMobilePhone.</p>
     * 
     * @param request SendVerificationCodeForBindSecureMobilePhoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendVerificationCodeForBindSecureMobilePhoneResponse
     */
    public SendVerificationCodeForBindSecureMobilePhoneResponse sendVerificationCodeForBindSecureMobilePhoneWithOptions(SendVerificationCodeForBindSecureMobilePhoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secureMobilePhone)) {
            query.put("SecureMobilePhone", request.secureMobilePhone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerificationCodeForBindSecureMobilePhone"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerificationCodeForBindSecureMobilePhoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource directory management permission (AliyunResourceDirectoryFullAccess) to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to a secure phone number when you set the secure phone number for a member of the resource account type by calling SendVerificationCodeForBindSecureMobilePhone.</p>
     * 
     * @param request SendVerificationCodeForBindSecureMobilePhoneRequest
     * @return SendVerificationCodeForBindSecureMobilePhoneResponse
     */
    public SendVerificationCodeForBindSecureMobilePhoneResponse sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerificationCodeForBindSecureMobilePhoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can send up to 100 verification codes per day.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to the secure phone number of a new management account when you call SendVerificationCodeForEnableRD to enable a resource directory by creating a new management account.</p>
     * 
     * @param request SendVerificationCodeForEnableRDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendVerificationCodeForEnableRDResponse
     */
    public SendVerificationCodeForEnableRDResponse sendVerificationCodeForEnableRDWithOptions(SendVerificationCodeForEnableRDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secureMobilePhone)) {
            query.put("SecureMobilePhone", request.secureMobilePhone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendVerificationCodeForEnableRD"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendVerificationCodeForEnableRDResponse());
    }

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can send up to 100 verification codes per day.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to the secure phone number of a new management account when you call SendVerificationCodeForEnableRD to enable a resource directory by creating a new management account.</p>
     * 
     * @param request SendVerificationCodeForEnableRDRequest
     * @return SendVerificationCodeForEnableRDResponse
     */
    public SendVerificationCodeForEnableRDResponse sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerificationCodeForEnableRDWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the default version of an access policy.</p>
     * 
     * @param request SetDefaultPolicyVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultPolicyVersionResponse
     */
    public SetDefaultPolicyVersionResponse setDefaultPolicyVersionWithOptions(SetDefaultPolicyVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            query.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultPolicyVersion"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultPolicyVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the default version of an access policy.</p>
     * 
     * @param request SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     */
    public SetDefaultPolicyVersionResponse setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultPolicyVersionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete members of the resource account type only after the member deletion permission is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the member deletion permission by calling SetMemberDeletionPermission.</p>
     * 
     * @param request SetMemberDeletionPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetMemberDeletionPermissionResponse
     */
    public SetMemberDeletionPermissionResponse setMemberDeletionPermissionWithOptions(SetMemberDeletionPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetMemberDeletionPermission"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetMemberDeletionPermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete members of the resource account type only after the member deletion permission is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the member deletion permission by calling SetMemberDeletionPermission.</p>
     * 
     * @param request SetMemberDeletionPermissionRequest
     * @return SetMemberDeletionPermissionResponse
     */
    public SetMemberDeletionPermissionResponse setMemberDeletionPermission(SetMemberDeletionPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMemberDeletionPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches labels to resource groups or member accounts of a resource directory.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches labels to resource groups or member accounts of a resource directory.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds tags from resource groups or resource directory members.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds tags from resource groups or resource directory members.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.</li>
     * <li>For the conditions that must be met to switch a resource account to a cloud account, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>For the conditions that must be met to switch a cloud account to a resource account, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a member or switches the member type by calling UpdateAccount.</p>
     * 
     * @param request UpdateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccountResponse
     */
    public UpdateAccountResponse updateAccountWithOptions(UpdateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAccountType)) {
            query.put("NewAccountType", request.newAccountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccount"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccountResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.</li>
     * <li>For the conditions that must be met to switch a resource account to a cloud account, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>For the conditions that must be met to switch a cloud account to a resource account, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a member or switches the member type by calling UpdateAccount.</p>
     * 
     * @param request UpdateAccountRequest
     * @return UpdateAccountResponse
     */
    public UpdateAccountResponse updateAccount(UpdateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For cloud resources that support the attached-resource allocation feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Attached-resource allocation</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of the associated resource group transfer feature by calling UpdateAssociatedTransferSetting.</p>
     * 
     * @param request UpdateAssociatedTransferSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAssociatedTransferSettingResponse
     */
    public UpdateAssociatedTransferSettingResponse updateAssociatedTransferSettingWithOptions(UpdateAssociatedTransferSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableExistingResourcesTransfer)) {
            query.put("EnableExistingResourcesTransfer", request.enableExistingResourcesTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleSettings)) {
            query.put("RuleSettings", request.ruleSettings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAssociatedTransferSetting"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAssociatedTransferSettingResponse());
    }

    /**
     * <b>description</b> :
     * <p>For cloud resources that support the attached-resource allocation feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Attached-resource allocation</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of the associated resource group transfer feature by calling UpdateAssociatedTransferSetting.</p>
     * 
     * @param request UpdateAssociatedTransferSettingRequest
     * @return UpdateAssociatedTransferSettingResponse
     */
    public UpdateAssociatedTransferSettingResponse updateAssociatedTransferSetting(UpdateAssociatedTransferSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAssociatedTransferSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls UpdateAutoGroupingConfig to update the automatic group transfer settings. Currently, only the setting for whether to enable existing associated resources to follow the group transfer task is supported.</p>
     * 
     * @param request UpdateAutoGroupingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoGroupingConfigResponse
     */
    public UpdateAutoGroupingConfigResponse updateAutoGroupingConfigWithOptions(UpdateAutoGroupingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableExistingResourcesTransfer)) {
            query.put("EnableExistingResourcesTransfer", request.enableExistingResourcesTransfer);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoGroupingConfig"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoGroupingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls UpdateAutoGroupingConfig to update the automatic group transfer settings. Currently, only the setting for whether to enable existing associated resources to follow the group transfer task is supported.</p>
     * 
     * @param request UpdateAutoGroupingConfigRequest
     * @return UpdateAutoGroupingConfigResponse
     */
    public UpdateAutoGroupingConfigResponse updateAutoGroupingConfig(UpdateAutoGroupingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoGroupingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an automatic resource group transfer rule by calling UpdateAutoGroupingRule.</p>
     * 
     * @param request UpdateAutoGroupingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoGroupingRuleResponse
     */
    public UpdateAutoGroupingRuleResponse updateAutoGroupingRuleWithOptions(UpdateAutoGroupingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            query.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            query.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            query.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceTypesScope)) {
            query.put("ExcludeResourceTypesScope", request.excludeResourceTypesScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            query.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            query.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            query.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScope)) {
            query.put("ResourceTypesScope", request.resourceTypesScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleContents)) {
            query.put("RuleContents", request.ruleContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDesc)) {
            query.put("RuleDesc", request.ruleDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoGroupingRule"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoGroupingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an automatic resource group transfer rule by calling UpdateAutoGroupingRule.</p>
     * 
     * @param request UpdateAutoGroupingRuleRequest
     * @return UpdateAutoGroupingRuleResponse
     */
    public UpdateAutoGroupingRuleResponse updateAutoGroupingRule(UpdateAutoGroupingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoGroupingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify the name of the control policy <code>cp-jExXAqIYkwHN****</code> to <code>NewControlPolicy</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom control policy by calling UpdateControlPolicy.</p>
     * 
     * @param request UpdateControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateControlPolicyResponse
     */
    public UpdateControlPolicyResponse updateControlPolicyWithOptions(UpdateControlPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPolicyDocument)) {
            query.put("NewPolicyDocument", request.newPolicyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPolicyName)) {
            query.put("NewPolicyName", request.newPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyId)) {
            query.put("PolicyId", request.policyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateControlPolicy"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateControlPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify the name of the control policy <code>cp-jExXAqIYkwHN****</code> to <code>NewControlPolicy</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom control policy by calling UpdateControlPolicy.</p>
     * 
     * @param request UpdateControlPolicyRequest
     * @return UpdateControlPolicyResponse
     */
    public UpdateControlPolicyResponse updateControlPolicy(UpdateControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a folder by calling UpdateFolder.</p>
     * 
     * @param request UpdateFolderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolderWithOptions(UpdateFolderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newFolderName)) {
            query.put("NewFolderName", request.newFolderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFolder"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFolderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a folder by calling UpdateFolder.</p>
     * 
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the display name of a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroupWithOptions(UpdateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroup"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the display name of a resource group.</p>
     * 
     * @param request UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the administrator settings of a resource group by calling UpdateResourceGroupAdminSetting.</p>
     * 
     * @param request UpdateResourceGroupAdminSettingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceGroupAdminSettingResponse
     */
    public UpdateResourceGroupAdminSettingResponse updateResourceGroupAdminSettingWithOptions(UpdateResourceGroupAdminSettingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorAsAdmin)) {
            query.put("CreatorAsAdmin", request.creatorAsAdmin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceGroupAdminSetting"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceGroupAdminSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the administrator settings of a resource group by calling UpdateResourceGroupAdminSetting.</p>
     * 
     * @param request UpdateResourceGroupAdminSettingRequest
     * @return UpdateResourceGroupAdminSettingResponse
     */
    public UpdateResourceGroupAdminSettingResponse updateResourceGroupAdminSetting(UpdateResourceGroupAdminSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupAdminSettingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a RAM role.</p>
     * 
     * @param request UpdateRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newAssumeRolePolicyDocument)) {
            query.put("NewAssumeRolePolicyDocument", request.newAssumeRolePolicyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newMaxSessionDuration)) {
            query.put("NewMaxSessionDuration", request.newMaxSessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2020-03-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a RAM role.</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }
}

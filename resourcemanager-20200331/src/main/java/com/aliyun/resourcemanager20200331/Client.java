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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.
     * This topic provides an example on how to call the API operation to accept the invitation <code>h-Ih8IuPfvV0t0****</code> that is initiated to invite the Alibaba Cloud account <code>177242285274****</code> to join the resource directory <code>rd-3G****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts an invitation.</p>
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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.
     * This topic provides an example on how to call the API operation to accept the invitation <code>h-Ih8IuPfvV0t0****</code> that is initiated to invite the Alibaba Cloud account <code>177242285274****</code> to join the resource directory <code>rd-3G****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Accepts an invitation.</p>
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
     * <p>After you attach an access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.
     * This topic provides an example on how to call the API operation to attach the custom access control policy <code>cp-jExXAqIYkwHN****</code> to the folder <code>fd-ZDNPiT****</code>.</p>
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
     * <p>After you attach an access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.
     * This topic provides an example on how to call the API operation to attach the custom access control policy <code>cp-jExXAqIYkwHN****</code> to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request AttachControlPolicyRequest
     * @return AttachControlPolicyResponse
     */
    public AttachControlPolicyResponse attachControlPolicy(AttachControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the policy <code>AdministratorAccess</code> is attached to the RAM user <code>alice@demo.onaliyun.com</code> and takes effect only for resources in the <code>rg-9gLOoK****</code> resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a permission policy to an object, which can be a RAM user, RAM user group, or RAM role. After you attach a permission policy to an object, the object has the operation permissions on the resources in a specific resource group or within a specific Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <p>In this example, the policy <code>AdministratorAccess</code> is attached to the RAM user <code>alice@demo.onaliyun.com</code> and takes effect only for resources in the <code>rg-9gLOoK****</code> resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a permission policy to an object, which can be a RAM user, RAM user group, or RAM role. After you attach a permission policy to an object, the object has the operation permissions on the resources in a specific resource group or within a specific Alibaba Cloud account.</p>
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
     * <p>You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
     * This topic provides an example on how to call the API operation to bind a mobile phone number to the member <code>138660628348****</code> for security purposes.</p>
     * 
     * <b>summary</b> : 
     * <p>设置安全手机号</p>
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
     * <p>You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
     * This topic provides an example on how to call the API operation to bind a mobile phone number to the member <code>138660628348****</code> for security purposes.</p>
     * 
     * <b>summary</b> : 
     * <p>设置安全手机号</p>
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
     * <p>取消修改邮箱</p>
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
     * <p>取消修改邮箱</p>
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
     * <p>取消创建云账号类型的成员</p>
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
     * <p>取消创建云账号类型的成员</p>
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
     * <p>This topic provides an example on how to call the API operation to cancel the invitation whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an invitation.</p>
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
     * <p>This topic provides an example on how to call the API operation to cancel the invitation whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an invitation.</p>
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
     * <p>取消升级资源账号</p>
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
     * <p>取消升级资源账号</p>
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
     * <p>成员账号设置安全邮箱</p>
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
     * <p>成员账号设置安全邮箱</p>
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
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.
     * This topic provides an example on how to call the API operation to perform a deletion check on the member whose ID is <code>179855839641****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a member deletion check.</p>
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
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.
     * This topic provides an example on how to call the API operation to perform a deletion check on the member whose ID is <code>179855839641****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a member deletion check.</p>
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
     * <p>You can create up to 10 custom transfer rules. Each custom transfer rule can contain up to 10 content records.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a transfer rule. Custom transfer rules and transfer rules for associated resources are supported.</p>
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
     * <p>You can create up to 10 custom transfer rules. Each custom transfer rule can contain up to 10 content records.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a transfer rule. Custom transfer rules and transfer rules for associated resources are supported.</p>
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
     * <p>A resource directory supports two types of member accounts: resource accounts and cloud accounts.</p>
     * <ul>
     * <li>Resource account (recommended): A resource account is only used as a resource container and fully depends on a resource directory. Such member accounts are secure and easy-to-create. For more information about how to create a resource account, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>.<blockquote>
     * <p> A resource account can be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a> .</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建云账号</p>
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
     * <p>A resource directory supports two types of member accounts: resource accounts and cloud accounts.</p>
     * <ul>
     * <li>Resource account (recommended): A resource account is only used as a resource container and fully depends on a resource directory. Such member accounts are secure and easy-to-create. For more information about how to create a resource account, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>.<blockquote>
     * <p> A resource account can be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a> .</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root permissions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>创建云账号</p>
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
     * <p>This topic provides an example on how to call the API operation to create a custom access control policy named <code>ExampleControlPolicy</code>. This access control policy is used to prohibit modifications to the ResourceDirectoryAccountAccessRole role and the permissions of the role.</p>
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
     * <p>This topic provides an example on how to call the API operation to create a custom access control policy named <code>ExampleControlPolicy</code>. This access control policy is used to prohibit modifications to the ResourceDirectoryAccountAccessRole role and the permissions of the role.</p>
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
     * <p> A maximum of five levels of folders can be created under the root folder.
     * In this example, a folder named <code>rdFolder</code> is created under the root folder.</p>
     * </blockquote>
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
     * <p> A maximum of five levels of folders can be created under the root folder.
     * In this example, a folder named <code>rdFolder</code> is created under the root folder.</p>
     * </blockquote>
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
     * <p>Creates a permission policy.</p>
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
     * <p>Creates a permission policy.</p>
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
     * <p>Creates a version for a permission policy.</p>
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
     * <p>Creates a version for a permission policy.</p>
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
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the resource account type.</p>
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
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a member of the resource account type.</p>
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
     * <p>A maximum of 30 resource groups can be created within an Alibaba Cloud account.</p>
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
     * <p>A maximum of 30 resource groups can be created within an Alibaba Cloud account.</p>
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
     * <p>Creates a RAM role.</p>
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
     * <p>Creates a RAM role.</p>
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
     * <p>Rejects an invitation.</p>
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
     * <p>Rejects an invitation.</p>
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
     * <p>The ID of the member that you want to delete.</p>
     * 
     * <b>summary</b> : 
     * <p>账号一键删除</p>
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
     * <p>The ID of the member that you want to delete.</p>
     * 
     * <b>summary</b> : 
     * <p>账号一键删除</p>
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
     * <p>Deletes a transfer rule.</p>
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
     * <p>Deletes a transfer rule.</p>
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
     * <p>If you want to delete a custom control policy that is attached to folders or member accounts, you must call the <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> operation to detach the policy before you delete it.
     * In this example, the custom control policy <code>cp-SImPt8GCEwiq****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>删除管控策略</p>
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
     * <p>If you want to delete a custom control policy that is attached to folders or member accounts, you must call the <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> operation to detach the policy before you delete it.
     * In this example, the custom control policy <code>cp-SImPt8GCEwiq****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>删除管控策略</p>
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
     * <p> Before you delete a folder, make sure that the folder does not contain any member accounts or child folders.</p>
     * </blockquote>
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
     * <p> Before you delete a folder, make sure that the folder does not contain any member accounts or child folders.</p>
     * </blockquote>
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
     * </blockquote>
     * <ul>
     * <li>Before you delete a permission policy, you must delete its all non-default versions. For information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before you delete a permission policy, you must make sure that the policy is not attached to a RAM user, a RAM user group, or a RAM role. For information about how to detach a policy, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission policy.</p>
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
     * </blockquote>
     * <ul>
     * <li>Before you delete a permission policy, you must delete its all non-default versions. For information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before you delete a permission policy, you must make sure that the policy is not attached to a RAM user, a RAM user group, or a RAM role. For information about how to detach a policy, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a permission policy.</p>
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
     * <p> The default version of a policy cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a version of a permission policy.</p>
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
     * <p> The default version of a policy cannot be deleted.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a version of a permission policy.</p>
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
     * <p> Before you delete a resource group, you must delete all the resources in it.
     * In this example, the resource group whose ID is <code>rg-9gLOoK****</code> is deleted.</p>
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
     * <p> Before you delete a resource group, you must delete all the resources in it.
     * In this example, the resource group whose ID is <code>rg-9gLOoK****</code> is deleted.</p>
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
     * <p>Deletes a RAM role.</p>
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
     * <p>Deletes a RAM role.</p>
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
     * <p> If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
     * This topic provides an example on how to call the API operation to remove the delegated administrator account <code>181761095690****</code> for Cloud Firewall.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>注销代理管理员</p>
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
     * <p> If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
     * This topic provides an example on how to call the API operation to remove the delegated administrator account <code>181761095690****</code> for Cloud Firewall.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>注销代理管理员</p>
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
     * <p>Before you disable a resource directory, make sure that the following requirements are met:</p>
     * <ul>
     * <li>All member accounts must be removed from the resource directory. For more information about how to remove a member account, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the root folder must be deleted from the resource directory. For more information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * 
     * @param request DestroyResourceDirectoryRequest
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
     * <p>Before you disable a resource directory, make sure that the following requirements are met:</p>
     * <ul>
     * <li>All member accounts must be removed from the resource directory. For more information about how to remove a member account, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the root folder must be deleted from the resource directory. For more information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * @return DestroyResourceDirectoryResponse
     */
    public DestroyResourceDirectoryResponse destroyResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
     * This topic provides an example on how to call the API operation to detach the custom control policy <code>cp-jExXAqIYkwHN****</code> from the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>解绑管控策略</p>
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
     * <p>After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
     * This topic provides an example on how to call the API operation to detach the custom control policy <code>cp-jExXAqIYkwHN****</code> from the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>解绑管控策略</p>
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
     * <p>Detaches a permission policy from an object. After you detach a policy from an object, the object does not have the operation permissions on the current resource group or the resources within the current account.</p>
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
     * <p>Detaches a permission policy from an object. After you detach a policy from an object, the object does not have the operation permissions on the current resource group or the resources within the current account.</p>
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
     * <p>Disables the Transfer Associated Resources feature.</p>
     * 
     * @param request DisableAssociatedTransferRequest
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
     * <p>Disables the Transfer Associated Resources feature.</p>
     * @return DisableAssociatedTransferResponse
     */
    public DisableAssociatedTransferResponse disableAssociatedTransfer() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAssociatedTransferWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Automatic Resource Transfer feature. After the feature is disabled, existing custom transfer rules and existing transfer rules for associated resources are deleted. However, existing relationships between resources and resource groups are not affected. If you still want to use this feature, you can enable it again 1 minute later.</p>
     * 
     * @param request DisableAutoGroupingRequest
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
     * <p>Disables the Automatic Resource Transfer feature. After the feature is disabled, existing custom transfer rules and existing transfer rules for associated resources are deleted. However, existing relationships between resources and resource groups are not affected. If you still want to use this feature, you can enable it again 1 minute later.</p>
     * @return DisableAutoGroupingResponse
     */
    public DisableAutoGroupingResponse disableAutoGrouping() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoGroupingWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you disable the Control Policy feature, the system automatically detaches all control policies that are attached to folders and member accounts. The system does not delete these control policies, but you cannot attach them to folders or member accounts again.</p>
     * <blockquote>
     * <p> If you disable the Control Policy feature, the permissions of all folders and member accounts in a resource directory are affected. You must proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>禁用管控策略</p>
     * 
     * @param request DisableControlPolicyRequest
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
     * <p>After you disable the Control Policy feature, the system automatically detaches all control policies that are attached to folders and member accounts. The system does not delete these control policies, but you cannot attach them to folders or member accounts again.</p>
     * <blockquote>
     * <p> If you disable the Control Policy feature, the permissions of all folders and member accounts in a resource directory are affected. You must proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>禁用管控策略</p>
     * @return DisableControlPolicyResponse
     */
    public DisableControlPolicyResponse disableControlPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableControlPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables group event notification.</p>
     * 
     * @param request DisableResourceGroupNotificationRequest
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
     * <p>Disables group event notification.</p>
     * @return DisableResourceGroupNotificationResponse
     */
    public DisableResourceGroupNotificationResponse disableResourceGroupNotification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableResourceGroupNotificationWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Transfer Associated Resources feature.</p>
     * 
     * @param request EnableAssociatedTransferRequest
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
     * <p>Enables the Transfer Associated Resources feature.</p>
     * @return EnableAssociatedTransferResponse
     */
    public EnableAssociatedTransferResponse enableAssociatedTransfer() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAssociatedTransferWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Automatic Resource Transfer feature. After the feature is enabled, you can create, update, delete, and query transfer rules.</p>
     * 
     * @param request EnableAutoGroupingRequest
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
     * <p>Enables the Automatic Resource Transfer feature. After the feature is enabled, you can create, update, delete, and query transfer rules.</p>
     * @return EnableAutoGroupingResponse
     */
    public EnableAutoGroupingResponse enableAutoGrouping() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoGroupingWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>The Control Policy feature allows you to manage the permission boundaries of the folders or member accounts in a resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member account in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the Control Policy feature.</p>
     * 
     * @param request EnableControlPolicyRequest
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
     * <p>The Control Policy feature allows you to manage the permission boundaries of the folders or member accounts in a resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member account in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the Control Policy feature.</p>
     * @return EnableControlPolicyResponse
     */
    public EnableControlPolicyResponse enableControlPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableControlPolicyWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * In this example, the current account is used to enable a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>开启RD</p>
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
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * In this example, the current account is used to enable a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>开启RD</p>
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
     * <p>Enables group event notification.</p>
     * 
     * @param request EnableResourceGroupNotificationRequest
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
     * <p>Enables group event notification.</p>
     * @return EnableResourceGroupNotificationResponse
     */
    public EnableResourceGroupNotificationResponse enableResourceGroupNotification() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableResourceGroupNotificationWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information of the member whose Alibaba Cloud account ID is <code>181761095690****</code>.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information of the member whose Alibaba Cloud account ID is <code>181761095690****</code>.</p>
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
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> operation to perform a member deletion check, you can call the GetAccountDeletionCheckResult operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
     * This topic provides an example on how to call the API operation to query the result of the deletion check for the member whose ID is <code>179855839641****</code>. The response shows that the member does not meet deletion requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of a member deletion check.</p>
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
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> operation to perform a member deletion check, you can call the GetAccountDeletionCheckResult operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
     * This topic provides an example on how to call the API operation to query the result of the deletion check for the member whose ID is <code>179855839641****</code>. The response shows that the member does not meet deletion requirements.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of a member deletion check.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the deletion status of the member whose Alibaba Cloud account ID is <code>169946124551****</code>. The response shows that the member is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>获取账号删除状态</p>
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
     * <p>This topic provides an example on how to call the API operation to query the deletion status of the member whose Alibaba Cloud account ID is <code>169946124551****</code>. The response shows that the member is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>获取账号删除状态</p>
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
     * <p>Queries the information about a transfer rule.</p>
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
     * <p>Queries the information about a transfer rule.</p>
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
     * <p>Queries the status of the Automatic Resource Transfer feature.</p>
     * 
     * @param request GetAutoGroupingStatusRequest
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
     * <p>Queries the status of the Automatic Resource Transfer feature.</p>
     * @return GetAutoGroupingStatusResponse
     */
    public GetAutoGroupingStatusResponse getAutoGroupingStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoGroupingStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the details of the access control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the details of the access control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
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
     * <p>Queries the status of the Control Policy feature.</p>
     * 
     * @param request GetControlPolicyEnablementStatusRequest
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
     * <p>Queries the status of the Control Policy feature.</p>
     * @return GetControlPolicyEnablementStatusResponse
     */
    public GetControlPolicyEnablementStatusResponse getControlPolicyEnablementStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getControlPolicyEnablementStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information of the folder <code>fd-Jyl5U7****</code> is queried.</p>
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
     * <b>description</b> :
     * <p>In this example, the information of the folder <code>fd-Jyl5U7****</code> is queried.</p>
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
     * <p>In this example, the information of the invitation whose ID is <code>h-ycm4rp****</code> is queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of an invitation.</p>
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
     * <p>In this example, the information of the invitation whose ID is <code>h-ycm4rp****</code> is queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of an invitation.</p>
     * 
     * @param request GetHandshakeRequest
     * @return GetHandshakeResponse
     */
    public GetHandshakeResponse getHandshake(GetHandshakeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHandshakeWithOptions(request, runtime);
    }

    /**
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
     * @param request GetPayerForAccountRequest
     * @return GetPayerForAccountResponse
     */
    public GetPayerForAccountResponse getPayerForAccount(GetPayerForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPayerForAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a permission policy.</p>
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
     * <p>Queries the information about a permission policy.</p>
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
     * <p>Queries the information about a version of a permission policy.</p>
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
     * <p>Queries the information about a version of a permission policy.</p>
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
     * <p>This topic provides an example on how to use a management account to call the API operation to query the information of the resource directory that is enabled by using the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of a resource directory. If you use a management account to call this API operation, the system returns the information of the resource directory that is enabled by using the management account. If you use a member to call this operation, the system returns the information of</p>
     * 
     * @param request GetResourceDirectoryRequest
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
     * <p>This topic provides an example on how to use a management account to call the API operation to query the information of the resource directory that is enabled by using the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of a resource directory. If you use a management account to call this API operation, the system returns the information of the resource directory that is enabled by using the management account. If you use a member to call this operation, the system returns the information of</p>
     * @return GetResourceDirectoryResponse
     */
    public GetResourceDirectoryResponse getResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a resource group.</p>
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
     * <p>Queries the information of a resource group.</p>
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
     * <p>Queries the configurations of a resource group administrator.</p>
     * 
     * @param request GetResourceGroupAdminSettingRequest
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
     * <p>Queries the configurations of a resource group administrator.</p>
     * @return GetResourceGroupAdminSettingResponse
     */
    public GetResourceGroupAdminSettingResponse getResourceGroupAdminSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupAdminSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the notification settings of a resource group.</p>
     * 
     * @param request GetResourceGroupNotificationSettingRequest
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
     * <p>Queries the notification settings of a resource group.</p>
     * @return GetResourceGroupNotificationSettingResponse
     */
    public GetResourceGroupNotificationSettingResponse getResourceGroupNotificationSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceGroupNotificationSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the number of resources in a visible resource group.</p>
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
     * <p>Queries the number of resources in a visible resource group.</p>
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
     * <p>Queries the information about a RAM role.</p>
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
     * <p>Queries the information about a RAM role.</p>
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
     * <p>Queries the status of the task that is used to delete a service-linked role.</p>
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
     * <p>Queries the status of the task that is used to delete a service-linked role.</p>
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
     * </blockquote>
     * <ul>
     * <li>An account can be used to enable a resource directory only after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.</li>
     * <li>We recommend that you only use the enterprise management account as the administrator of the resource directory. Do not use the enterprise management account to purchase cloud resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a resource directory. After you enable a resource directory, the system automatically creates a root folder and sets the current account as the enterprise management account of the resource directory. The enterprise management account has all administrative permissions on this resource direc</p>
     * 
     * @param request InitResourceDirectoryRequest
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
     * </blockquote>
     * <ul>
     * <li>An account can be used to enable a resource directory only after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.</li>
     * <li>We recommend that you only use the enterprise management account as the administrator of the resource directory. Do not use the enterprise management account to purchase cloud resources.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a resource directory. After you enable a resource directory, the system automatically creates a root folder and sets the current account as the enterprise management account of the resource directory. The enterprise management account has all administrative permissions on this resource direc</p>
     * @return InitResourceDirectoryResponse
     */
    public InitResourceDirectoryResponse initResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to invite the account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites an account to join a resource directory.</p>
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
     * <p>This topic provides an example on how to call the API operation to invite the account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites an account to join a resource directory.</p>
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
     * <p>You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all the members in a resource directory.</p>
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
     * <p>You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all the members in a resource directory.</p>
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
     * <p>Queries the information of members in a folder.</p>
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
     * <p>Queries the information of members in a folder.</p>
     * 
     * @param request ListAccountsForParentRequest
     * @return ListAccountsForParentResponse
     */
    public ListAccountsForParentResponse listAccountsForParent(ListAccountsForParentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccountsForParentWithOptions(request, runtime);
    }

    /**
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
     * @param request ListAncestorsRequest
     * @return ListAncestorsResponse
     */
    public ListAncestorsResponse listAncestors(ListAncestorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAncestorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of the Transfer Associated Resources feature.</p>
     * 
     * @param request ListAssociatedTransferSettingRequest
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
     * <p>Queries the settings of the Transfer Associated Resources feature.</p>
     * @return ListAssociatedTransferSettingResponse
     */
    public ListAssociatedTransferSettingResponse listAssociatedTransferSetting() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAssociatedTransferSettingWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of automatic grouping remediation records.</p>
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
     * <p>Queries a list of automatic grouping remediation records.</p>
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
     * <p>Queries a list of transfer rules.</p>
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
     * <p>Queries a list of transfer rules.</p>
     * 
     * @param request ListAutoGroupingRulesRequest
     * @return ListAutoGroupingRulesResponse
     */
    public ListAutoGroupingRulesResponse listAutoGroupingRules(ListAutoGroupingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoGroupingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the system access control policies within a resource directory. The response shows that the resource directory has only one system access control policy. The policy is named <code>FullAliyunAccess</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access control policies.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the system access control policies within a resource directory. The response shows that the resource directory has only one system access control policy. The policy is named <code>FullAliyunAccess</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access control policies.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the access control policies that are attached to the folder <code>fd-ZDNPiT****</code>.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the access control policies that are attached to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request ListControlPolicyAttachmentsForTargetRequest
     * @return ListControlPolicyAttachmentsForTargetResponse
     */
    public ListControlPolicyAttachmentsForTargetResponse listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listControlPolicyAttachmentsForTargetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query all delegated administrator accounts in a resource directory. The response shows that two delegated administrator accounts for Cloud Firewall exist in the resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的代理管理员</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query all delegated administrator accounts in a resource directory. The response shows that two delegated administrator accounts for Cloud Firewall exist in the resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的代理管理员</p>
     * 
     * @param request ListDelegatedAdministratorsRequest
     * @return ListDelegatedAdministratorsResponse
     */
    public ListDelegatedAdministratorsResponse listDelegatedAdministrators(ListDelegatedAdministratorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDelegatedAdministratorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the trusted services for which the member <code>138660628348****</code> is specified as a delegated administrator account. The response shows that the member is specified as a delegated administrator account of Cloud Firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>查看指定账号被设置为哪些可信服务的委派管理员</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the trusted services for which the member <code>138660628348****</code> is specified as a delegated administrator account. The response shows that the member is specified as a delegated administrator account of Cloud Firewall.</p>
     * 
     * <b>summary</b> : 
     * <p>查看指定账号被设置为哪些可信服务的委派管理员</p>
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
     * <p> You can view the information of only the first-level subfolders of a folder.</p>
     * </blockquote>
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
     * <p> You can view the information of only the first-level subfolders of a folder.</p>
     * </blockquote>
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
     * <p>This topic provides an example on how to call the API operation to query the invitations that are associated with the management account <code>172841235500****</code>. The response shows that two invitations are associated with the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invitations that are associated with an account.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the invitations that are associated with the management account <code>172841235500****</code>. The response shows that two invitations are associated with the management account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the invitations that are associated with an account.</p>
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
     * <p>Queries invitations in a resource directory.</p>
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
     * <p>Queries invitations in a resource directory.</p>
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
     * <p>Queries a list of permission policies.</p>
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
     * <p>Queries a list of permission policies.</p>
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
     * <p>You can view the following information:</p>
     * <ul>
     * <li>Policy attachment records within an Alibaba Cloud account or a resource group</li>
     * <li>Permission policies attached to RAM users, RAM user groups, or RAM roles</li>
     * <li>RAM users, RAM user groups, or RAM roles to which permission policies are attached within an Alibaba Cloud account or a resource group</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries policy attachment records.</p>
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
     * <p>You can view the following information:</p>
     * <ul>
     * <li>Policy attachment records within an Alibaba Cloud account or a resource group</li>
     * <li>Permission policies attached to RAM users, RAM user groups, or RAM roles</li>
     * <li>RAM users, RAM user groups, or RAM roles to which permission policies are attached within an Alibaba Cloud account or a resource group</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries policy attachment records.</p>
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
     * <p>Queries a list of versions of a policy.</p>
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
     * <p>Queries a list of versions of a policy.</p>
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
     * <p>列出资源组能力项</p>
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
     * <p>列出资源组能力项</p>
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
     * <p>You can call this API operation to query all resource groups within the current account. You can also call this API operation to query a specific resource group based on the status, ID, identifier, or display name of the resource group.
     * This topic provides an example on how to call the API operation to query the basic information about the resource groups <code>rg-1hSBH2****</code> and <code>rg-9gLOoK****</code> within the current account.</p>
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
     * <p>You can call this API operation to query all resource groups within the current account. You can also call this API operation to query a specific resource group based on the status, ID, identifier, or display name of the resource group.
     * This topic provides an example on how to call the API operation to query the basic information about the resource groups <code>rg-1hSBH2****</code> and <code>rg-9gLOoK****</code> within the current account.</p>
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
     * <p>列出资源组与用户授权信息</p>
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
     * <p>列出资源组与用户授权信息</p>
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
     * <p> You can use a RAM role that is not associated with a session policy to call this API operation.
     * This topic provides an example on how to call the API operation to query resources that can be accessed by the current account in resource groups. The response shows that the current account can access only the Elastic Compute Service (ECS) instance <code>i-23v38****</code> in the resource group <code>rg-uPJpP****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries resources that can be accessed by the current account in resource groups.</p>
     * 
     * @param request ListResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesResponse
     */
    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <p> You can use a RAM role that is not associated with a session policy to call this API operation.
     * This topic provides an example on how to call the API operation to query resources that can be accessed by the current account in resource groups. The response shows that the current account can access only the Elastic Compute Service (ECS) instance <code>i-23v38****</code> in the resource group <code>rg-uPJpP****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries resources that can be accessed by the current account in resource groups.</p>
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
     * <p>Queries a list of RAM roles.</p>
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
     * <p>Queries a list of RAM roles.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query tag keys. The response shows that the custom tag key team exists.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的Tag key</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query tag keys. The response shows that the custom tag key team exists.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的Tag key</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tags that are added to the resource group with an ID of <code>rg-aekz6bre2uq****</code>. The response shows that only the <code>k1:v1</code> tag is added to the resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resource groups or the members in a resource directory.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tags that are added to the resource group with an ID of <code>rg-aekz6bre2uq****</code>. The response shows that only the <code>k1:v1</code> tag is added to the resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added to resource groups or the members in a resource directory.</p>
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
     * <p>This topic provides an example on how to call the API operation to query the tag values of the tag key k1. The response shows that the tag value of the tag key k1 is v1.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的Tag values</p>
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
     * <p>This topic provides an example on how to call the API operation to query the tag values of the tag key k1. The response shows that the tag value of the tag key k1 is v1.</p>
     * 
     * <b>summary</b> : 
     * <p>列出所有的Tag values</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the folders or member accounts to which the control policy <code>cp-jExXAqIYkwHN****</code> is attached are queried. The returned result shows that the control policy is attached to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the objects to which a specific control policy is attached.</p>
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
     * <b>description</b> :
     * <p>In this example, the folders or member accounts to which the control policy <code>cp-jExXAqIYkwHN****</code> is attached are queried. The returned result shows that the control policy is attached to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the objects to which a specific control policy is attached.</p>
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
     * <p> Only an enterprise management account or delegated administrator account can be used to call this operation.
     * In this example, the trusted services that are enabled within an enterprise management account are queried. The returned result shows that the trusted services Cloud Config and ActionTrail are enabled within the enterprise management account.</p>
     * </blockquote>
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
     * <p> Only an enterprise management account or delegated administrator account can be used to call this operation.
     * In this example, the trusted services that are enabled within an enterprise management account are queried. The returned result shows that the trusted services Cloud Config and ActionTrail are enabled within the enterprise management account.</p>
     * </blockquote>
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
     * <p>查询资源组事件</p>
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
     * <p>查询资源组事件</p>
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
     * <p>移动账号</p>
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
     * <p>移动账号</p>
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
     * <p>For more information about Alibaba Cloud services whose resources can be moved between resource groups, see the <strong>Supported by the API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Alibaba Cloud services that support resource groups</a>.
     * In this example, two virtual private clouds (VPCs) <code>vpc-bp1sig0mjktx5ewx1****</code> and <code>vpc-bp1visxm225pv49dz****</code> that reside in different regions and belong to different resource groups are moved to the resource group <code>rg-aekzmeobk5w****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves resources from one resource group to another. You can move multiple resources that reside in different regions, are used by different Alibaba Cloud services, or belong to different resource groups.</p>
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
     * <p>For more information about Alibaba Cloud services whose resources can be moved between resource groups, see the <strong>Supported by the API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Alibaba Cloud services that support resource groups</a>.
     * In this example, two virtual private clouds (VPCs) <code>vpc-bp1sig0mjktx5ewx1****</code> and <code>vpc-bp1visxm225pv49dz****</code> that reside in different regions and belong to different resource groups are moved to the resource group <code>rg-aekzmeobk5w****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Moves resources from one resource group to another. You can move multiple resources that reside in different regions, are used by different Alibaba Cloud services, or belong to different resource groups.</p>
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
     * <p>升级资源账号</p>
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
     * <p>升级资源账号</p>
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
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory.
     * When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
     * This topic provides an example on how to call the API operation to specify the member <code>181761095690****</code> as a delegated administrator account of Cloud Firewall.</li>
     * </ul>
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
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory.
     * When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
     * This topic provides an example on how to call the API operation to specify the member <code>181761095690****</code> as a delegated administrator account of Cloud Firewall.</li>
     * </ul>
     * 
     * @param request RegisterDelegatedAdministratorRequest
     * @return RegisterDelegatedAdministratorResponse
     */
    public RegisterDelegatedAdministratorResponse registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDelegatedAdministratorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the member <code>177242285274****</code> from a resource directory.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the member <code>177242285274****</code> from a resource directory.</p>
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
     * <p>重新发送创建云账号的邮箱验证</p>
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
     * <p>重新发送创建云账号的邮箱验证</p>
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
     * <p>重新发送升级资源账号的邮箱验证</p>
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
     * <p>重新发送升级资源账号的邮箱验证</p>
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
     * <p>重新发送确认邮件</p>
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
     * <p>重新发送确认邮件</p>
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
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
     * In this example, a verification code is sent to the mobile phone number that you want to bind to the resource account <code>138660628348****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>发送绑定安全手机验证码</p>
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
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
     * In this example, a verification code is sent to the mobile phone number that you want to bind to the resource account <code>138660628348****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>发送绑定安全手机验证码</p>
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
     * <p>Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.</p>
     * 
     * <b>summary</b> : 
     * <p>发送开启资源目录短信</p>
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
     * <p>Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.</p>
     * 
     * <b>summary</b> : 
     * <p>发送开启资源目录短信</p>
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
     * <p>Sets a default version for a permission policy.</p>
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
     * <p>Sets a default version for a permission policy.</p>
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
     * <p>Members of the resource account type can be deleted only after the member deletion feature is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>开启或关闭成员删除许可</p>
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
     * <p>Members of the resource account type can be deleted only after the member deletion feature is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>开启或关闭成员删除许可</p>
     * 
     * @param request SetMemberDeletionPermissionRequest
     * @return SetMemberDeletionPermissionResponse
     */
    public SetMemberDeletionPermissionResponse setMemberDeletionPermission(SetMemberDeletionPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMemberDeletionPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to add the tag <code>k1:v1</code> to the resource group with an ID of <code>rg-aekz6bre2uq****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to resource groups or the members in a resource directory.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to add the tag <code>k1:v1</code> to the resource group with an ID of <code>rg-aekz6bre2uq****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds tags to resource groups or the members in a resource directory.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the tag whose tag key is <code>k1</code> from the resource group whose ID is <code>rg-aek2dpwyrfr****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resource groups or the members in a resource directory.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the tag whose tag key is <code>k1</code> from the resource group whose ID is <code>rg-aek2dpwyrfr****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from resource groups or the members in a resource directory.</p>
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
     * <p>  To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.</p>
     * <ul>
     * <li>Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.
     * This example provides an example on how to call the API operation to change the display name of the member <code>12323344****</code> to <code>admin</code>.</li>
     * </ul>
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
     * <p>  To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.</p>
     * <ul>
     * <li>Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.
     * This example provides an example on how to call the API operation to change the display name of the member <code>12323344****</code> to <code>admin</code>.</li>
     * </ul>
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
     * <p>For information about the resources that support the Transfer Associated Resources feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Use the Transfer Associated Resources feature</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of the Transfer Associated Resources feature.</p>
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
     * <p>For information about the resources that support the Transfer Associated Resources feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Use the Transfer Associated Resources feature</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the settings of the Transfer Associated Resources feature.</p>
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
     * <p>Updates the configuration of the Automatic Resource Transfer feature. You can update only the configuration of the Transfer Existing Associated Resources feature.</p>
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
     * <p>Updates the configuration of the Automatic Resource Transfer feature. You can update only the configuration of the Transfer Existing Associated Resources feature.</p>
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
     * <p>Updates a transfer rule.</p>
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
     * <p>Updates a transfer rule.</p>
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
     * <p>In this example, the name of the access control policy whose ID is <code>cp-jExXAqIYkwHN****</code> is changed to <code>NewControlPolicy</code>.</p>
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
     * <p>In this example, the name of the access control policy whose ID is <code>cp-jExXAqIYkwHN****</code> is changed to <code>NewControlPolicy</code>.</p>
     * 
     * @param request UpdateControlPolicyRequest
     * @return UpdateControlPolicyResponse
     */
    public UpdateControlPolicyResponse updateControlPolicy(UpdateControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateControlPolicyWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    public UpdateFolderResponse updateFolder(UpdateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the display name of the resource group <code>rg-9gLOoK****</code> is changed to <code>project</code>.</p>
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
     * <b>description</b> :
     * <p>In this example, the display name of the resource group <code>rg-9gLOoK****</code> is changed to <code>project</code>.</p>
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
     * <p>Updates the configurations of a resource group administrator.</p>
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
     * <p>Updates the configurations of a resource group administrator.</p>
     * 
     * @param request UpdateResourceGroupAdminSettingRequest
     * @return UpdateResourceGroupAdminSettingResponse
     */
    public UpdateResourceGroupAdminSettingResponse updateResourceGroupAdminSetting(UpdateResourceGroupAdminSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupAdminSettingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the description of the RAM role <code>ECSAdmin</code> is updated to <code>ECS administrator</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about a Resource Access Management (RAM) role.</p>
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
     * <b>description</b> :
     * <p>In this example, the description of the RAM role <code>ECSAdmin</code> is updated to <code>ECS administrator</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information about a Resource Access Management (RAM) role.</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }
}

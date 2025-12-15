// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419;

import com.aliyun.tea.*;
import com.aliyun.resourcedirectorymaster20220419.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resourcedirectorymaster", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.</p>
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
     * <b>summary</b> : 
     * <p>Adds a contact.</p>
     * 
     * @param request AddMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddMessageContactResponse
     */
    public AddMessageContactResponse addMessageContactWithOptions(AddMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.emailAddress)) {
            query.put("EmailAddress", request.emailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTypes)) {
            query.put("MessageTypes", request.messageTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a contact.</p>
     * 
     * @param request AddMessageContactRequest
     * @return AddMessageContactResponse
     */
    public AddMessageContactResponse addMessageContact(AddMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a contact to a resource directory, folder, or member.</p>
     * 
     * @param request AssociateMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateMembersResponse
     */
    public AssociateMembersResponse associateMembersWithOptions(AssociateMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateMembers"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a contact to a resource directory, folder, or member.</p>
     * 
     * @param request AssociateMembersRequest
     * @return AssociateMembersResponse
     */
    public AssociateMembersResponse associateMembers(AssociateMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you attach a custom access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>After you attach a custom access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an access control policy.</p>
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
     * <p>You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a mobile phone number to a member of the resource account type in a resource directory for security purposes.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Binds a mobile phone number to a member of the resource account type in a resource directory for security purposes.</p>
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
     * <p>Cancels the email address change of a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Cancels the email address change of a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Cancels the update of the mobile phone number or email address of a contact.</p>
     * 
     * @param request CancelMessageContactUpdateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelMessageContactUpdateResponse
     */
    public CancelMessageContactUpdateResponse cancelMessageContactUpdateWithOptions(CancelMessageContactUpdateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailAddress)) {
            query.put("EmailAddress", request.emailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelMessageContactUpdate"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelMessageContactUpdateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the update of the mobile phone number or email address of a contact.</p>
     * 
     * @param request CancelMessageContactUpdateRequest
     * @return CancelMessageContactUpdateResponse
     */
    public CancelMessageContactUpdateResponse cancelMessageContactUpdate(CancelMessageContactUpdateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelMessageContactUpdateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the email address that is bound to a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Changes the email address that is bound to a member.</p>
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
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.</p>
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
     * <b>summary</b> : 
     * <p>Creates a custom access control policy.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateControlPolicy"),
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Creates a custom access control policy.</p>
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
     * <p>A maximum of five levels of folders can be created under the Root folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a folder.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFolder"),
            new TeaPair("version", "2022-04-19"),
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
     * <p>A maximum of five levels of folders can be created under the Root folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a folder.</p>
     * 
     * @param request CreateFolderRequest
     * @return CreateFolderResponse
     */
    public CreateFolderResponse createFolder(CreateFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFolderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
     * This topic provides an example on how to call the API operation to create a member in the <code>fd-r23M55****</code> folder. The display name of the member is <code>Dev</code>, and the prefix for the Alibaba Cloud account name of the member is <code>alice</code>.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
     * This topic provides an example on how to call the API operation to create a member in the <code>fd-r23M55****</code> folder. The display name of the member is <code>Dev</code>, and the prefix for the Alibaba Cloud account name of the member is <code>alice</code>.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Before you delete a member, we recommend that you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> and <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operations to check whether the member meets deletion requirements. You can call the DeleteAccount operation to delete only members that meet the deletion requirements.
     * After you submit a deletion request for a member, you can call the <a href="~~GetAccountDeletionStatus~~">GetAccountDeletionStatus</a> operation to query the deletion status of the member. After a member is deleted, the resources and data within the member are deleted, and you can no longer use the member to log on to the Alibaba Cloud Management Console. In addition, the member cannot be recovered. Proceed with caution. For more information about how to delete a member, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a member of the resource account type.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Before you delete a member, we recommend that you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> and <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operations to check whether the member meets deletion requirements. You can call the DeleteAccount operation to delete only members that meet the deletion requirements.
     * After you submit a deletion request for a member, you can call the <a href="~~GetAccountDeletionStatus~~">GetAccountDeletionStatus</a> operation to query the deletion status of the member. After a member is deleted, the resources and data within the member are deleted, and you can no longer use the member to log on to the Alibaba Cloud Management Console. In addition, the member cannot be recovered. Proceed with caution. For more information about how to delete a member, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a member of the resource account type.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you want to delete a custom access control policy that is attached to folders or members, you must call the <a href="~~DetachControlPolicy~~">DetachControlPolicy</a> operation to detach the policy before you delete it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>If you want to delete a custom access control policy that is attached to folders or members, you must call the <a href="~~DetachControlPolicy~~">DetachControlPolicy</a> operation to detach the policy before you delete it.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom access control policy.</p>
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
     * <p>Before you delete a folder, you must make sure that the folder does not contain members or subfolders.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Before you delete a folder, you must make sure that the folder does not contain members or subfolders.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMessageContactResponse
     */
    public DeleteMessageContactResponse deleteMessageContactWithOptions(DeleteMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainContactInMembers)) {
            query.put("RetainContactInMembers", request.retainContactInMembers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a contact.</p>
     * 
     * @param request DeleteMessageContactRequest
     * @return DeleteMessageContactResponse
     */
    public DeleteMessageContactResponse deleteMessageContact(DeleteMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a delegated administrator account for a trusted service.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a delegated administrator account for a trusted service.</p>
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
     * <p>Before you disable a resource directory, you must make sure that the following requirements are met:</p>
     * <ul>
     * <li>All members of the cloud account type in the resource directory are removed. You can call the <a href="~~RemoveCloudAccount~~">RemoveCloudAccount</a> operation to remove a member of the cloud account type.</li>
     * <li>All folders except the Root folder are deleted from the resource directory. You can call the <a href="~~DeleteFolder~~">DeleteFolder</a> operation to delete a folder.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a resource directory. This operation cannot be undone. Therefore, proceed with caution.</p>
     * 
     * @param request DestroyResourceDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DestroyResourceDirectoryResponse
     */
    public DestroyResourceDirectoryResponse destroyResourceDirectoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyResourceDirectory"),
            new TeaPair("version", "2022-04-19"),
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
     * <p>Before you disable a resource directory, you must make sure that the following requirements are met:</p>
     * <ul>
     * <li>All members of the cloud account type in the resource directory are removed. You can call the <a href="~~RemoveCloudAccount~~">RemoveCloudAccount</a> operation to remove a member of the cloud account type.</li>
     * <li>All folders except the Root folder are deleted from the resource directory. You can call the <a href="~~DeleteFolder~~">DeleteFolder</a> operation to delete a folder.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a resource directory. This operation cannot be undone. Therefore, proceed with caution.</p>
     * @return DestroyResourceDirectoryResponse
     */
    public DestroyResourceDirectoryResponse destroyResourceDirectory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyResourceDirectoryWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches an access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches an access control policy.</p>
     * 
     * @param request DetachControlPolicyRequest
     * @return DetachControlPolicyResponse
     */
    public DetachControlPolicyResponse detachControlPolicy(DetachControlPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachControlPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you disable the Control Policy feature, the system automatically detaches all access control policies that are attached to folders and members. The system does not delete these access control policies, but you cannot attach them to folders or members again.</p>
     * <blockquote>
     * <p>If you disable the Control Policy feature, the permissions of all folders and members in your resource directory are affected. Therefore, proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the Control Policy feature.</p>
     * 
     * @param request DisableControlPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableControlPolicyResponse
     */
    public DisableControlPolicyResponse disableControlPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableControlPolicy"),
            new TeaPair("version", "2022-04-19"),
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
     * <p>After you disable the Control Policy feature, the system automatically detaches all access control policies that are attached to folders and members. The system does not delete these access control policies, but you cannot attach them to folders or members again.</p>
     * <blockquote>
     * <p>If you disable the Control Policy feature, the permissions of all folders and members in your resource directory are affected. Therefore, proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the Control Policy feature.</p>
     * @return DisableControlPolicyResponse
     */
    public DisableControlPolicyResponse disableControlPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableControlPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a contact from a resource directory, folder, or member.</p>
     * 
     * @param request DisassociateMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisassociateMembersResponse
     */
    public DisassociateMembersResponse disassociateMembersWithOptions(DisassociateMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.members)) {
            query.put("Members", request.members);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisassociateMembers"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisassociateMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a contact from a resource directory, folder, or member.</p>
     * 
     * @param request DisassociateMembersRequest
     * @return DisassociateMembersResponse
     */
    public DisassociateMembersResponse disassociateMembers(DisassociateMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disassociateMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The Control Policy feature provided by the Resource Directory service allows you to manage the permission boundaries of the folders or members in your resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>The Control Policy feature provided by the Resource Directory service allows you to manage the permission boundaries of the folders or members in your resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
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
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

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
            new TeaPair("version", "2022-04-19"),
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
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.</p>
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
     * <p>Queries the information of a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the information of a member.</p>
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
     * <p>After you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> operation to perform a member deletion check, you can call the <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>After you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> operation to perform a member deletion check, you can call the <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.</p>
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
     * <b>summary</b> : 
     * <p>Queries the deletion status of a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the deletion status of a member.</p>
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
     * <p>Queries the details of an access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the details of an access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the information about a folder.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the information about a folder.</p>
     * 
     * @param request GetFolderRequest
     * @return GetFolderResponse
     */
    public GetFolderResponse getFolder(GetFolderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFolderWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the information about a contact.</p>
     * 
     * @param request GetMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessageContactResponse
     */
    public GetMessageContactResponse getMessageContactWithOptions(GetMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a contact.</p>
     * 
     * @param request GetMessageContactRequest
     * @return GetMessageContactResponse
     */
    public GetMessageContactResponse getMessageContact(GetMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deletion status of a contact.</p>
     * 
     * @param request GetMessageContactDeletionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessageContactDeletionStatusResponse
     */
    public GetMessageContactDeletionStatusResponse getMessageContactDeletionStatusWithOptions(GetMessageContactDeletionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessageContactDeletionStatus"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessageContactDeletionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deletion status of a contact.</p>
     * 
     * @param request GetMessageContactDeletionStatusRequest
     * @return GetMessageContactDeletionStatusResponse
     */
    public GetMessageContactDeletionStatusResponse getMessageContactDeletionStatus(GetMessageContactDeletionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessageContactDeletionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a billing account.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the information of a billing account.</p>
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
            new TeaPair("version", "2022-04-19"),
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

        if (!com.aliyun.teautil.Common.isUnset(request.parentFolderId)) {
            query.put("ParentFolderId", request.parentFolderId);
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries a list of members in a resource directory.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
            new TeaPair("action", "ListAccounts"),
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries a list of members in a resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the information of all the parent folders of a specified folder.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the information of all the parent folders of a specified folder.</p>
     * 
     * @param request ListAncestorsRequest
     * @return ListAncestorsResponse
     */
    public ListAncestorsResponse listAncestors(ListAncestorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAncestorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The permission to query member information refers to the permission to call the <a href="~~GetAccount~~">GetAccount</a> API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of members who have the permission to query member information in a resource directory.</p>
     * 
     * @param request ListAuthorizedAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedAccountsResponse
     */
    public ListAuthorizedAccountsResponse listAuthorizedAccountsWithOptions(ListAuthorizedAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAuthorizedAccounts"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The permission to query member information refers to the permission to call the <a href="~~GetAccount~~">GetAccount</a> API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of members who have the permission to query member information in a resource directory.</p>
     * 
     * @param request ListAuthorizedAccountsRequest
     * @return ListAuthorizedAccountsResponse
     */
    public ListAuthorizedAccountsResponse listAuthorizedAccounts(ListAuthorizedAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The permissions to query subfolder information refer to the permissions to call the <a href="~~ListAccountsForParent~~">ListAccountsForParent</a> and <a href="~~ListFoldersForParent~~">ListFoldersForParent</a> API operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of folders that have permissions to query subfolder information in a resource directory.</p>
     * 
     * @param request ListAuthorizedFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedFoldersResponse
     */
    public ListAuthorizedFoldersResponse listAuthorizedFoldersWithOptions(ListAuthorizedFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListAuthorizedFolders"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedFoldersResponse());
    }

    /**
     * <b>description</b> :
     * <p>The permissions to query subfolder information refer to the permissions to call the <a href="~~ListAccountsForParent~~">ListAccountsForParent</a> and <a href="~~ListFoldersForParent~~">ListFoldersForParent</a> API operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of folders that have permissions to query subfolder information in a resource directory.</p>
     * 
     * @param request ListAuthorizedFoldersRequest
     * @return ListAuthorizedFoldersResponse
     */
    public ListAuthorizedFoldersResponse listAuthorizedFolders(ListAuthorizedFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedFoldersWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListControlPolicies"),
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the access control policies that are attached to a folder or member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the access control policies that are attached to a folder or member.</p>
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
     * <p>Queries delegated administrator accounts.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries delegated administrator accounts.</p>
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
     * <p>Queries the trusted services for which a member is specified as a delegated administrator account.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the trusted services for which a member is specified as a delegated administrator account.</p>
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
     * <p>You can call this API operation to view the information of only the first-level subfolders of a folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of all subfolders of a folder.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFoldersForParent"),
            new TeaPair("version", "2022-04-19"),
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
     * <p>You can call this API operation to view the information of only the first-level subfolders of a folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of all subfolders of a folder.</p>
     * 
     * @param request ListFoldersForParentRequest
     * @return ListFoldersForParentResponse
     */
    public ListFoldersForParentResponse listFoldersForParent(ListFoldersForParentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFoldersForParentWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2022-04-19"),
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the mobile phone number or email address to be verified for a contact.</p>
     * 
     * @param request ListMessageContactVerificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessageContactVerificationsResponse
     */
    public ListMessageContactVerificationsResponse listMessageContactVerificationsWithOptions(ListMessageContactVerificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
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
            new TeaPair("action", "ListMessageContactVerifications"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessageContactVerificationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the mobile phone number or email address to be verified for a contact.</p>
     * 
     * @param request ListMessageContactVerificationsRequest
     * @return ListMessageContactVerificationsResponse
     */
    public ListMessageContactVerificationsResponse listMessageContactVerifications(ListMessageContactVerificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMessageContactVerificationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries contacts.</p>
     * 
     * @param request ListMessageContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessageContactsResponse
     */
    public ListMessageContactsResponse listMessageContactsWithOptions(ListMessageContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.member)) {
            query.put("Member", request.member);
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
            new TeaPair("action", "ListMessageContacts"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessageContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries contacts.</p>
     * 
     * @param request ListMessageContactsRequest
     * @return ListMessageContactsResponse
     */
    public ListMessageContactsResponse listMessageContacts(ListMessageContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMessageContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tag keys.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries tag keys.</p>
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
     * <p>Queries the tags that are added to the members in a resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the tags that are added to the members in a resource directory.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tag values of a tag key.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Queries the tag values of a tag key.</p>
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
     * <p>Queries the objects to which an access control policy is attached.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Queries the objects to which an access control policy is attached.</p>
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
     * <p>Only a management account or delegated administrator account can be used to call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the trusted services that are enabled within a management account or delegated administrator account.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Only a management account or delegated administrator account can be used to call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the trusted services that are enabled within a management account or delegated administrator account.</p>
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
     * <p>Moves a member from a folder to another.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Moves a member from a folder to another.</p>
     * 
     * @param request MoveAccountRequest
     * @return MoveAccountResponse
     */
    public MoveAccountResponse moveAccount(MoveAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a management account or member can be used as a main financial account.</p>
     * 
     * @param request PrecheckForConsolidatedBillingAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrecheckForConsolidatedBillingAccountResponse
     */
    public PrecheckForConsolidatedBillingAccountResponse precheckForConsolidatedBillingAccountWithOptions(PrecheckForConsolidatedBillingAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingAccountId)) {
            query.put("BillingAccountId", request.billingAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrecheckForConsolidatedBillingAccount"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrecheckForConsolidatedBillingAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a management account or member can be used as a main financial account.</p>
     * 
     * @param request PrecheckForConsolidatedBillingAccountRequest
     * @return PrecheckForConsolidatedBillingAccountResponse
     */
    public PrecheckForConsolidatedBillingAccountResponse precheckForConsolidatedBillingAccount(PrecheckForConsolidatedBillingAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.precheckForConsolidatedBillingAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory. When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Specifies a member in a resource directory as a delegated administrator account of a trusted service.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory. When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Specifies a member in a resource directory as a delegated administrator account of a trusted service.</p>
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
     * <p>Removes a member of the cloud account type.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Removes a member of the cloud account type.</p>
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
     * <p>Resends a verification email for the email address change of a member.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Resends a verification email for the email address change of a member.</p>
     * 
     * @param request RetryChangeAccountEmailRequest
     * @return RetryChangeAccountEmailResponse
     */
    public RetryChangeAccountEmailResponse retryChangeAccountEmail(RetryChangeAccountEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryChangeAccountEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends verification information to the email address of a contact.</p>
     * 
     * @param request SendEmailVerificationForMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendEmailVerificationForMessageContactResponse
     */
    public SendEmailVerificationForMessageContactResponse sendEmailVerificationForMessageContactWithOptions(SendEmailVerificationForMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailAddress)) {
            query.put("EmailAddress", request.emailAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendEmailVerificationForMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendEmailVerificationForMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends verification information to the email address of a contact.</p>
     * 
     * @param request SendEmailVerificationForMessageContactRequest
     * @return SendEmailVerificationForMessageContactResponse
     */
    public SendEmailVerificationForMessageContactResponse sendEmailVerificationForMessageContact(SendEmailVerificationForMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendEmailVerificationForMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends verification information to the mobile phone number of a contact.</p>
     * 
     * @param request SendPhoneVerificationForMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendPhoneVerificationForMessageContactResponse
     */
    public SendPhoneVerificationForMessageContactResponse sendPhoneVerificationForMessageContactWithOptions(SendPhoneVerificationForMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendPhoneVerificationForMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendPhoneVerificationForMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends verification information to the mobile phone number of a contact.</p>
     * 
     * @param request SendPhoneVerificationForMessageContactRequest
     * @return SendPhoneVerificationForMessageContactResponse
     */
    public SendPhoneVerificationForMessageContactResponse sendPhoneVerificationForMessageContact(SendPhoneVerificationForMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendPhoneVerificationForMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to the mobile phone number that you want to bind to a member of the resource account type in a resource directory for security purposes.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a verification code to the mobile phone number that you want to bind to a member of the resource account type in a resource directory for security purposes.</p>
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
     * <p>Sends a verification code to the mobile phone number bound to a newly created account when you use the account to enable a resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Sends a verification code to the mobile phone number bound to a newly created account when you use the account to enable a resource directory.</p>
     * 
     * @param request SendVerificationCodeForEnableRDRequest
     * @return SendVerificationCodeForEnableRDResponse
     */
    public SendVerificationCodeForEnableRDResponse sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendVerificationCodeForEnableRDWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Members of the resource account type can be deleted only after the member deletion feature is enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the member deletion feature.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Enables or disables the member deletion feature.</p>
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
     * <p>Enables or disables the Member Display Name Synchronization feature.</p>
     * 
     * @param request SetMemberDisplayNameSyncStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetMemberDisplayNameSyncStatusResponse
     */
    public SetMemberDisplayNameSyncStatusResponse setMemberDisplayNameSyncStatusWithOptions(SetMemberDisplayNameSyncStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetMemberDisplayNameSyncStatus"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetMemberDisplayNameSyncStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the Member Display Name Synchronization feature.</p>
     * 
     * @param request SetMemberDisplayNameSyncStatusRequest
     * @return SetMemberDisplayNameSyncStatusResponse
     */
    public SetMemberDisplayNameSyncStatusResponse setMemberDisplayNameSyncStatus(SetMemberDisplayNameSyncStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMemberDisplayNameSyncStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to the members in a resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Adds tags to the members in a resource directory.</p>
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
     * <p>Removes tags from the members in a resource directory.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Removes tags from the members in a resource directory.</p>
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
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the display name of a member, or switches the type of a member.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
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
            new TeaPair("version", "2022-04-19"),
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
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the display name of a member, or switches the type of a member.</p>
     * 
     * @param request UpdateAccountRequest
     * @return UpdateAccountResponse
     */
    public UpdateAccountResponse updateAccount(UpdateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom access control policy.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <b>summary</b> : 
     * <p>Updates a custom access control policy.</p>
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
     * <p>Changes the name of a folder.</p>
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
            new TeaPair("version", "2022-04-19"),
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
     * <p>Changes the name of a folder.</p>
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
     * <p>Updates a contact.</p>
     * 
     * @param request UpdateMessageContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMessageContactResponse
     */
    public UpdateMessageContactResponse updateMessageContactWithOptions(UpdateMessageContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailAddress)) {
            query.put("EmailAddress", request.emailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageTypes)) {
            query.put("MessageTypes", request.messageTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMessageContact"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMessageContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a contact.</p>
     * 
     * @param request UpdateMessageContactRequest
     * @return UpdateMessageContactResponse
     */
    public UpdateMessageContactResponse updateMessageContact(UpdateMessageContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMessageContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the billing account of a member.</p>
     * 
     * @param request UpdatePayerForAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePayerForAccountResponse
     */
    public UpdatePayerForAccountResponse updatePayerForAccountWithOptions(UpdatePayerForAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerAccountId)) {
            query.put("PayerAccountId", request.payerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePayerForAccount"),
            new TeaPair("version", "2022-04-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePayerForAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the billing account of a member.</p>
     * 
     * @param request UpdatePayerForAccountRequest
     * @return UpdatePayerForAccountResponse
     */
    public UpdatePayerForAccountResponse updatePayerForAccount(UpdatePayerForAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePayerForAccountWithOptions(request, runtime);
    }
}

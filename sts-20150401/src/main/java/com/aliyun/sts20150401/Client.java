// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401;

import com.aliyun.tea.*;
import com.aliyun.sts20150401.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "sts.aliyuncs.com"),
            new TeaPair("ap-south-1", "sts.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "sts.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-edge-1", "sts.aliyuncs.com"),
            new TeaPair("cn-fujian", "sts.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "sts.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "sts.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "sts.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "sts.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-wuhan", "sts.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "sts.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "sts.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "sts.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "sts.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h3>Prerequisites</h3>
     * <p>You cannot use an Alibaba Cloud account to call this operation. The requester of this operation can only be a RAM user or RAM role. Make sure that the AliyunSTSAssumeRoleAccess policy is attached to the requester. After this policy is attached to the requester, the requester has the management permissions on STS.
     * If you do not attach the AliyunSTSAssumeRoleAccess policy to the requester, the following error message is returned:
     * <code>You are not authorized to do this action. You should be authorized by RAM.</code>
     * You can refer to the following information to troubleshoot the error:</p>
     * <ul>
     * <li>Cause of the error: The policy that is required to assume a RAM role is not attached to the requester. To resolve this issue, attach the AliyunSTSAssumeRoleAccess policy or a custom policy to the requester. For more information, see <a href="https://help.aliyun.com/document_detail/39744.html">Can I specify the RAM role that a RAM user can assume?</a> and <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * <li>Cause of the error: The requester is not authorized to assume the RAM role. To resolve this issue, add the requester to the Principal element in the trust policy of the RAM role For more information, see <a href="https://help.aliyun.com/document_detail/116819.html">Edit the trust policy of a RAM role</a>.</li>
     * </ul>
     * <h3>Best practices</h3>
     * <p>An STS token is valid for a period of time after it is issued, and the number of STS tokens that can be issued within an interval is also limited. Therefore, we recommend that you configure a proper validity period for an STS token and repeatedly use the token within this period. This prevents frequent issuing of STS tokens from adversely affecting your services if a large number of requests are sent. For more information about the limit, see <a href="https://help.aliyun.com/document_detail/39744.html">Is the number of STS API requests limited?</a> You can configure the <code>DurationSeconds</code> parameter to specify a validity period for an STS token.
     * When you upload or download Object Storage Service (OSS) objects on mobile devices, a large number of STS API requests are sent. In this case, repeated use of an STS token may not meet your business requirements. To avoid the limit on STS API requests from affecting access to OSS, you can <strong>add a signature to the URL of an OSS object</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/31952.html">Add signatures to URLs</a> and <a href="https://help.aliyun.com/document_detail/31926.html">Obtain signature information from the server and upload data to OSS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a Security Token Service (STS) token to assume a Resource Access Management (RAM) role.</p>
     * 
     * @param request AssumeRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssumeRoleResponse
     */
    public AssumeRoleResponse assumeRoleWithOptions(AssumeRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.durationSeconds)) {
            query.put("DurationSeconds", request.durationSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            query.put("ExternalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleSessionName)) {
            query.put("RoleSessionName", request.roleSessionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIdentity)) {
            query.put("SourceIdentity", request.sourceIdentity);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssumeRole"),
            new TeaPair("version", "2015-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssumeRoleResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>You cannot use an Alibaba Cloud account to call this operation. The requester of this operation can only be a RAM user or RAM role. Make sure that the AliyunSTSAssumeRoleAccess policy is attached to the requester. After this policy is attached to the requester, the requester has the management permissions on STS.
     * If you do not attach the AliyunSTSAssumeRoleAccess policy to the requester, the following error message is returned:
     * <code>You are not authorized to do this action. You should be authorized by RAM.</code>
     * You can refer to the following information to troubleshoot the error:</p>
     * <ul>
     * <li>Cause of the error: The policy that is required to assume a RAM role is not attached to the requester. To resolve this issue, attach the AliyunSTSAssumeRoleAccess policy or a custom policy to the requester. For more information, see <a href="https://help.aliyun.com/document_detail/39744.html">Can I specify the RAM role that a RAM user can assume?</a> and <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * <li>Cause of the error: The requester is not authorized to assume the RAM role. To resolve this issue, add the requester to the Principal element in the trust policy of the RAM role For more information, see <a href="https://help.aliyun.com/document_detail/116819.html">Edit the trust policy of a RAM role</a>.</li>
     * </ul>
     * <h3>Best practices</h3>
     * <p>An STS token is valid for a period of time after it is issued, and the number of STS tokens that can be issued within an interval is also limited. Therefore, we recommend that you configure a proper validity period for an STS token and repeatedly use the token within this period. This prevents frequent issuing of STS tokens from adversely affecting your services if a large number of requests are sent. For more information about the limit, see <a href="https://help.aliyun.com/document_detail/39744.html">Is the number of STS API requests limited?</a> You can configure the <code>DurationSeconds</code> parameter to specify a validity period for an STS token.
     * When you upload or download Object Storage Service (OSS) objects on mobile devices, a large number of STS API requests are sent. In this case, repeated use of an STS token may not meet your business requirements. To avoid the limit on STS API requests from affecting access to OSS, you can <strong>add a signature to the URL of an OSS object</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/31952.html">Add signatures to URLs</a> and <a href="https://help.aliyun.com/document_detail/31926.html">Obtain signature information from the server and upload data to OSS</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a Security Token Service (STS) token to assume a Resource Access Management (RAM) role.</p>
     * 
     * @param request AssumeRoleRequest
     * @return AssumeRoleResponse
     */
    public AssumeRoleResponse assumeRole(AssumeRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>An OIDC token is obtained from an external identity provider (IdP).</li>
     * <li>An OIDC IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/327123.html">Create an OIDC IdP</a> or <a href="https://help.aliyun.com/document_detail/327135.html">CreateOIDCProvider</a>.</li>
     * <li>A RAM role whose trusted entity is an OIDC IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Security Token Service (STS) token to assume a Resource Access Management (RAM) role during role-based single sign-on (SSO) by using OpenID Connect (OIDC).</p>
     * 
     * @param request AssumeRoleWithOIDCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssumeRoleWithOIDCResponse
     */
    public AssumeRoleWithOIDCResponse assumeRoleWithOIDCWithOptions(AssumeRoleWithOIDCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.durationSeconds)) {
            query.put("DurationSeconds", request.durationSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderArn)) {
            query.put("OIDCProviderArn", request.OIDCProviderArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCToken)) {
            query.put("OIDCToken", request.OIDCToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleSessionName)) {
            query.put("RoleSessionName", request.roleSessionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssumeRoleWithOIDC"),
            new TeaPair("version", "2015-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new AssumeRoleWithOIDCResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>An OIDC token is obtained from an external identity provider (IdP).</li>
     * <li>An OIDC IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/327123.html">Create an OIDC IdP</a> or <a href="https://help.aliyun.com/document_detail/327135.html">CreateOIDCProvider</a>.</li>
     * <li>A RAM role whose trusted entity is an OIDC IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a Security Token Service (STS) token to assume a Resource Access Management (RAM) role during role-based single sign-on (SSO) by using OpenID Connect (OIDC).</p>
     * 
     * @param request AssumeRoleWithOIDCRequest
     * @return AssumeRoleWithOIDCResponse
     */
    public AssumeRoleWithOIDCResponse assumeRoleWithOIDC(AssumeRoleWithOIDCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeRoleWithOIDCWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>A SAML response is obtained from an external identity provider (IdP).</li>
     * <li>A SAML IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116083.html">Create a SAML IdP</a> or <a href="https://help.aliyun.com/document_detail/186846.html">CreateSAMLProvider</a>.</li>
     * <li>A RAM role whose trusted entity is a SAML IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a Security Token Service (STS) token to assume a Resource Access Management (RAM) role during role-based single sign-on (SSO) by using Security Assertion Markup Language (SAML).</p>
     * 
     * @param request AssumeRoleWithSAMLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssumeRoleWithSAMLResponse
     */
    public AssumeRoleWithSAMLResponse assumeRoleWithSAMLWithOptions(AssumeRoleWithSAMLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.durationSeconds)) {
            query.put("DurationSeconds", request.durationSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SAMLAssertion)) {
            query.put("SAMLAssertion", request.SAMLAssertion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderArn)) {
            query.put("SAMLProviderArn", request.SAMLProviderArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssumeRoleWithSAML"),
            new TeaPair("version", "2015-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new AssumeRoleWithSAMLResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>A SAML response is obtained from an external identity provider (IdP).</li>
     * <li>A SAML IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116083.html">Create a SAML IdP</a> or <a href="https://help.aliyun.com/document_detail/186846.html">CreateSAMLProvider</a>.</li>
     * <li>A RAM role whose trusted entity is a SAML IdP is created in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116805.html">Create a RAM role for a trusted IdP</a> or <a href="https://help.aliyun.com/document_detail/28710.html">CreateRole</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains a Security Token Service (STS) token to assume a Resource Access Management (RAM) role during role-based single sign-on (SSO) by using Security Assertion Markup Language (SAML).</p>
     * 
     * @param request AssumeRoleWithSAMLRequest
     * @return AssumeRoleWithSAMLResponse
     */
    public AssumeRoleWithSAMLResponse assumeRoleWithSAML(AssumeRoleWithSAMLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeRoleWithSAMLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the Alibaba Cloud account to which the current requester belongs.</p>
     * 
     * @param request GetCallerIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallerIdentityResponse
     */
    public GetCallerIdentityResponse getCallerIdentityWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallerIdentity"),
            new TeaPair("version", "2015-04-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallerIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the Alibaba Cloud account to which the current requester belongs.</p>
     * @return GetCallerIdentityResponse
     */
    public GetCallerIdentityResponse getCallerIdentity() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallerIdentityWithOptions(runtime);
    }
}

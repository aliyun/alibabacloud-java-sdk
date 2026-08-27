// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DecodeDiagnosticMessageResponseBody extends TeaModel {
    /**
     * <p>The decoded diagnostic message.</p>
     */
    @NameInMap("DecodedDiagnosticMessage")
    public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage decodedDiagnosticMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D2331703-AADF-5564-BA9B-26CD51A33BA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DecodeDiagnosticMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecodeDiagnosticMessageResponseBody self = new DecodeDiagnosticMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DecodeDiagnosticMessageResponseBody setDecodedDiagnosticMessage(DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage decodedDiagnosticMessage) {
        this.decodedDiagnosticMessage = decodedDiagnosticMessage;
        return this;
    }
    public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage getDecodedDiagnosticMessage() {
        return this.decodedDiagnosticMessage;
    }

    public DecodeDiagnosticMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions extends TeaModel {
        /**
         * <p>The key of the authentication condition.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:SourceIp</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>The list of values corresponding to the authentication condition key.</p>
         */
        @NameInMap("ConditionValues")
        public java.util.List<String> conditionValues;

        public static DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions build(java.util.Map<String, ?> map) throws Exception {
            DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions self = new DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions();
            return TeaModel.build(map, self);
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions setConditionKey(String conditionKey) {
            this.conditionKey = conditionKey;
            return this;
        }
        public String getConditionKey() {
            return this.conditionKey;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions setConditionValues(java.util.List<String> conditionValues) {
            this.conditionValues = conditionValues;
            return this;
        }
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

    }

    public static class DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal extends TeaModel {
        /**
         * <p>The identity identifier used for authentication in the user request, as follows:</p>
         * <ul>
         * <li><p>RAM user: The UID of the RAM user.</p>
         * </li>
         * <li><p>RAM role: The role name and role session name (for example, RoleName:RoleSessionName).</p>
         * </li>
         * <li><p>SSO federated identity: The identity provider type and name (for example, saml-provider/AzureAD).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>28877424437521****</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The Alibaba Cloud account UID of the identity used for authentication in the user request.</p>
         * 
         * <strong>example:</strong>
         * <p>196813200012****</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type used for authentication in the user request.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        public static DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal build(java.util.Map<String, ?> map) throws Exception {
            DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal self = new DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal();
            return TeaModel.build(map, self);
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

    }

    public static class DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies extends TeaModel {
        /**
         * <p>The entity type to which the policy is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        @NameInMap("AttachedEntityType")
        public String attachedEntityType;

        /**
         * <p>The scope to which the policy is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>Account</p>
         */
        @NameInMap("AttachedScope")
        public String attachedScope;

        /**
         * <p>The policy effect.</p>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The policy name, as follows:</p>
         * <ul>
         * <li><p>Control policy: The control policy ID.</p>
         * </li>
         * <li><p>RAM access policy: The access policy name.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MyPolicyName</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The policy version number.</p>
         * <blockquote>
         * <p>Only custom policies have version numbers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("PolicyVersion")
        public String policyVersion;

        public static DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies build(java.util.Map<String, ?> map) throws Exception {
            DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies self = new DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies();
            return TeaModel.build(map, self);
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setAttachedEntityType(String attachedEntityType) {
            this.attachedEntityType = attachedEntityType;
            return this;
        }
        public String getAttachedEntityType() {
            return this.attachedEntityType;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setAttachedScope(String attachedScope) {
            this.attachedScope = attachedScope;
            return this;
        }
        public String getAttachedScope() {
            return this.attachedScope;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setPolicyIdentifier(String policyIdentifier) {
            this.policyIdentifier = policyIdentifier;
            return this;
        }
        public String getPolicyIdentifier() {
            return this.policyIdentifier;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies setPolicyVersion(String policyVersion) {
            this.policyVersion = policyVersion;
            return this;
        }
        public String getPolicyVersion() {
            return this.policyVersion;
        }

    }

    public static class DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage extends TeaModel {
        /**
         * <p>The action used for authentication in the user request.</p>
         * 
         * <strong>example:</strong>
         * <p>ram:DecodeDiagnosticMessage</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The list of conditions used for authentication in the user request.</p>
         */
        @NameInMap("AuthConditions")
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions> authConditions;

        /**
         * <p>The principal used for authentication in the user request.</p>
         */
        @NameInMap("AuthPrincipal")
        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal authPrincipal;

        /**
         * <p>The resource used for authentication in the user request.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AuthResource")
        public String authResource;

        /**
         * <p>Indicates whether the denial is explicit.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExplicitDeny")
        public Boolean explicitDeny;

        /**
         * <p>The list of policies matched during authentication.</p>
         */
        @NameInMap("MatchedPolicies")
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies> matchedPolicies;

        /**
         * <p>The policy type that caused the permission denial.</p>
         * 
         * <strong>example:</strong>
         * <p>AccountLevelIdentityBasedPolicy</p>
         */
        @NameInMap("NoPermissionPolicyType")
        public String noPermissionPolicyType;

        public static DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage build(java.util.Map<String, ?> map) throws Exception {
            DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage self = new DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage();
            return TeaModel.build(map, self);
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setAuthConditions(java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions> authConditions) {
            this.authConditions = authConditions;
            return this;
        }
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions> getAuthConditions() {
            return this.authConditions;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setAuthPrincipal(DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal authPrincipal) {
            this.authPrincipal = authPrincipal;
            return this;
        }
        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal getAuthPrincipal() {
            return this.authPrincipal;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setAuthResource(String authResource) {
            this.authResource = authResource;
            return this;
        }
        public String getAuthResource() {
            return this.authResource;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setExplicitDeny(Boolean explicitDeny) {
            this.explicitDeny = explicitDeny;
            return this;
        }
        public Boolean getExplicitDeny() {
            return this.explicitDeny;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setMatchedPolicies(java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies> matchedPolicies) {
            this.matchedPolicies = matchedPolicies;
            return this;
        }
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies> getMatchedPolicies() {
            return this.matchedPolicies;
        }

        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage setNoPermissionPolicyType(String noPermissionPolicyType) {
            this.noPermissionPolicyType = noPermissionPolicyType;
            return this;
        }
        public String getNoPermissionPolicyType() {
            return this.noPermissionPolicyType;
        }

    }

}

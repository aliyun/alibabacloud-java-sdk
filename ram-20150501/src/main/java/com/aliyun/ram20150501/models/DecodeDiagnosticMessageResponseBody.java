// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DecodeDiagnosticMessageResponseBody extends TeaModel {
    /**
     * <p>The decoded diagnostic information.</p>
     */
    @NameInMap("DecodedDiagnosticMessage")
    public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessage decodedDiagnosticMessage;

    /**
     * <p>The request ID.</p>
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
         * <p>The key of the condition.</p>
         */
        @NameInMap("ConditionKey")
        public String conditionKey;

        /**
         * <p>The values that correspond to the key.</p>
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
         * <p>The identity.</p>
         * <br>
         * <p>*   If the operator is a RAM user, the ID of the user is displayed.</p>
         * <p>*   If the operator is a RAM role, the name and session name of the role are displayed. Example: RoleName:RoleSessionName.</p>
         * <p>*   If the operator is an SSO federated identity, the type and name of the identity provider (IdP) are displayed. Example: saml-provider/AzureAD.</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The ID of the Alibaba Cloud account to which the identity belongs.</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type that is used for authentication in the request.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SubUser: RAM user</p>
         * <p>*   AssumedRoleUser: RAM role</p>
         * <p>*   Federated: SSO federated identity</p>
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
         * <p>The type of the entity to which the policy is attached.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   RamUser: RAM user</p>
         * <p>*   RamRole: RAM role</p>
         * <p>*   ResourceDirectoryTarget: entity in a resource directory</p>
         * <p>*   RamGroup: RAM user group</p>
         */
        @NameInMap("AttachedEntityType")
        public String attachedEntityType;

        /**
         * <p>The authorization scope of the policy.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Account: Alibaba Cloud account</p>
         * <p>*   Folder: folder in the resource directory</p>
         * <p>*   ResourceGroup: resource group</p>
         */
        @NameInMap("AttachedScope")
        public String attachedScope;

        /**
         * <p>The effect of the policy.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Deny</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Allow</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Effect")
        public String effect;

        /**
         * <p>The identifier of the policy.</p>
         * <br>
         * <p>*   Control policy: the ID of the control policy</p>
         * <p>*   RAM policy: the name of the policy</p>
         */
        @NameInMap("PolicyIdentifier")
        public String policyIdentifier;

        /**
         * <p>The type of the policy.</p>
         * <br>
         * <p>Valid values:</p>
         * <p>*   Custom: custom policy</p>
         * <p>*   System: system policy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The version number of the policy.</p>
         * <br>
         * <p>> Only custom policies have version numbers.</p>
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
         * <p>The operation that is used for authentication in the request.</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The conditions that are used for authentication in the request.</p>
         */
        @NameInMap("AuthConditions")
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthConditions> authConditions;

        /**
         * <p>The operator that is used for authentication in the request.</p>
         */
        @NameInMap("AuthPrincipal")
        public DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageAuthPrincipal authPrincipal;

        /**
         * <p>The resource that is used for authentication in the request.</p>
         */
        @NameInMap("AuthResource")
        public String authResource;

        /**
         * <p>Indicates whether the access denied error is caused by an explicit deny.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ExplicitDeny")
        public Boolean explicitDeny;

        /**
         * <p>The policies that are matched.</p>
         */
        @NameInMap("MatchedPolicies")
        public java.util.List<DecodeDiagnosticMessageResponseBodyDecodedDiagnosticMessageMatchedPolicies> matchedPolicies;

        /**
         * <p>The type of the policy that causes the access denied error.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   AssumeRolePolicy: role-specific trust policy</p>
         * <p>*   ControlPolicy: control policy</p>
         * <p>*   AccountLevelIdentityBasedPolicy: identity-based policy at the account level</p>
         * <p>*   ResourceGroupLevelIdentityBasedPolicy: identity-based policy at the resource group level</p>
         * <p>*   SessionPolicy: session policy</p>
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

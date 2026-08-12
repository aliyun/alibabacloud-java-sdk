// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionListResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Success.</li>
     * <li><strong>Other (400, 500)</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetSecuritySuggestionListResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>855FCC89-0B13-5FC0-AAD2-120878081C1C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.         </li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSecuritySuggestionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionListResponseBody self = new GetSecuritySuggestionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSecuritySuggestionListResponseBody setData(GetSecuritySuggestionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSecuritySuggestionListResponseBodyData getData() {
        return this.data;
    }

    public GetSecuritySuggestionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSecuritySuggestionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecuritySuggestionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject extends TeaModel {
        /**
         * <p>The compliance evaluation result of the rule. Valid values:</p>
         * <ul>
         * <li><strong>COMPLIANT</strong>: Compliant.</li>
         * <li><strong>NON_COMPLIANT</strong>: Non-compliant.</li>
         * <li><strong>NOT_APPLICABLE</strong>: Not applicable.</li>
         * <li><strong>INSUFFICIENT_DATA</strong>: Insufficient data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NON_COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of evaluations corresponding to the summary result of the rule evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject self = new GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy extends TeaModel {
        /**
         * <p>The ID of the compliance package to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-fdc8626622af00f9****</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The compliance package name.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the compliance package.</p>
         */
        @NameInMap("CompliancePackName")
        public String compliancePackName;

        public static GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy self = new GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy setCompliancePackName(String compliancePackName) {
            this.compliancePackName = compliancePackName;
            return this;
        }
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

    }

    public static class GetSecuritySuggestionListResponseBodyDataConfigRuleListTags extends TeaModel {
        /**
         * <p>The tag key of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>prod</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetSecuritySuggestionListResponseBodyDataConfigRuleListTags build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListResponseBodyDataConfigRuleListTags self = new GetSecuritySuggestionListResponseBodyDataConfigRuleListTags();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetSecuritySuggestionListResponseBodyDataConfigRuleList extends TeaModel {
        /**
         * <p>The ID of the account to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1625772519123804</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The remediation type. Only OOS (CloudOps Orchestration Service) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>OOS</p>
         */
        @NameInMap("AutomationType")
        public String automationType;

        /**
         * <p>The aggregated compliance result of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{count=1, complianceType=NON_COMPLIANT}</p>
         */
        @NameInMap("Compliance")
        public String compliance;

        /**
         * <p>The aggregated compliance result of the rule.</p>
         */
        @NameInMap("ComplianceObject")
        public GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject complianceObject;

        /**
         * <p>The ARN of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:config::100931896542****:rule/cr-fdc8626622af00f9****</p>
         */
        @NameInMap("ConfigRuleArn")
        public String configRuleArn;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-bqa2f25bc5ce00af6323</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <p>The rule running status. Valid values:</p>
         * <ul>
         * <li><strong>ACTIVE</strong>: Active.</li>
         * <li><strong>DELETING</strong>: Being deleted.</li>
         * <li><strong>EVALUATING</strong>: Being evaluated.</li>
         * <li><strong>INACTIVE</strong>: Inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <p>The information about the rule creator.</p>
         */
        @NameInMap("CreateBy")
        public GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy createBy;

        /**
         * <p>The rule description.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The resource type scope. Multiple resource types are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::EIP::EipAddress</p>
         */
        @NameInMap("ResourceTypesScope")
        public String resourceTypesScope;

        /**
         * <p>The risk level of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: High risk.</li>
         * <li><strong>2</strong>: Medium risk.</li>
         * <li><strong>3</strong>: Low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RiskLevel")
        public Integer riskLevel;

        /**
         * <p>The rule identifier.</p>
         * <ul>
         * <li><p>If the rule uses a managed rule, this parameter is the managed rule name.</p>
         * </li>
         * <li><p>If the rule uses a custom function, this parameter is the function ARN.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eip-bandwidth-limit</p>
         */
        @NameInMap("SourceIdentifier")
        public String sourceIdentifier;

        /**
         * <p>The owner of the rule source. Valid values:</p>
         * <ul>
         * <li><strong>CUSTOM_FC</strong>: Custom rule.</li>
         * <li><strong>ALIYUN</strong>: Rule template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("SourceOwner")
        public String sourceOwner;

        /**
         * <p>The tags of the rule.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleListTags> tags;

        public static GetSecuritySuggestionListResponseBodyDataConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListResponseBodyDataConfigRuleList self = new GetSecuritySuggestionListResponseBodyDataConfigRuleList();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setAutomationType(String automationType) {
            this.automationType = automationType;
            return this;
        }
        public String getAutomationType() {
            return this.automationType;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setCompliance(String compliance) {
            this.compliance = compliance;
            return this;
        }
        public String getCompliance() {
            return this.compliance;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setComplianceObject(GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject complianceObject) {
            this.complianceObject = complianceObject;
            return this;
        }
        public GetSecuritySuggestionListResponseBodyDataConfigRuleListComplianceObject getComplianceObject() {
            return this.complianceObject;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setConfigRuleArn(String configRuleArn) {
            this.configRuleArn = configRuleArn;
            return this;
        }
        public String getConfigRuleArn() {
            return this.configRuleArn;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setCreateBy(GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy createBy) {
            this.createBy = createBy;
            return this;
        }
        public GetSecuritySuggestionListResponseBodyDataConfigRuleListCreateBy getCreateBy() {
            return this.createBy;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setResourceTypesScope(String resourceTypesScope) {
            this.resourceTypesScope = resourceTypesScope;
            return this;
        }
        public String getResourceTypesScope() {
            return this.resourceTypesScope;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setSourceIdentifier(String sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }
        public String getSourceIdentifier() {
            return this.sourceIdentifier;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setSourceOwner(String sourceOwner) {
            this.sourceOwner = sourceOwner;
            return this;
        }
        public String getSourceOwner() {
            return this.sourceOwner;
        }

        public GetSecuritySuggestionListResponseBodyDataConfigRuleList setTags(java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleListTags> getTags() {
            return this.tags;
        }

    }

    public static class GetSecuritySuggestionListResponseBodyData extends TeaModel {
        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("ConfigRuleList")
        public java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleList> configRuleList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetSecuritySuggestionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListResponseBodyData self = new GetSecuritySuggestionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListResponseBodyData setConfigRuleList(java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleList> configRuleList) {
            this.configRuleList = configRuleList;
            return this;
        }
        public java.util.List<GetSecuritySuggestionListResponseBodyDataConfigRuleList> getConfigRuleList() {
            return this.configRuleList;
        }

        public GetSecuritySuggestionListResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetSecuritySuggestionListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSecuritySuggestionListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

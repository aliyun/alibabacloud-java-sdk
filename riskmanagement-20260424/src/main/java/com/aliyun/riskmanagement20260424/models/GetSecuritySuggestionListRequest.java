// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionListRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     */
    @NameInMap("ListConfigRulesRequest")
    public GetSecuritySuggestionListRequestListConfigRulesRequest listConfigRulesRequest;

    public static GetSecuritySuggestionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionListRequest self = new GetSecuritySuggestionListRequest();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionListRequest setListConfigRulesRequest(GetSecuritySuggestionListRequestListConfigRulesRequest listConfigRulesRequest) {
        this.listConfigRulesRequest = listConfigRulesRequest;
        return this;
    }
    public GetSecuritySuggestionListRequestListConfigRulesRequest getListConfigRulesRequest() {
        return this.listConfigRulesRequest;
    }

    public static class GetSecuritySuggestionListRequestListConfigRulesRequest extends TeaModel {
        /**
         * <p>The compliance package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cp-d7b061dbe91500aa179a</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><strong>COMPLIANT</strong>: Compliant.</li>
         * <li><strong>NON_COMPLIANT</strong>: Non-compliant.</li>
         * <li><strong>NOT_APPLICABLE</strong>: Not applicable.</li>
         * <li><strong>INSUFFICIENT_DATA</strong>: Insufficient data.</li>
         * <li><strong>IGNORED</strong>: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

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
         * <p>The query keyword.</p>
         * <p>Supports fuzzy match on the rule ID, rule name, rule description, and rule template identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number.</p>
         * <blockquote>
         * <p>Minimum value: 1. Default value: 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * <blockquote>
         * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The resource type evaluated by the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceTypes")
        public String resourceTypes;

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

        public static GetSecuritySuggestionListRequestListConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
            GetSecuritySuggestionListRequestListConfigRulesRequest self = new GetSecuritySuggestionListRequestListConfigRulesRequest();
            return TeaModel.build(map, self);
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setConfigRuleState(String configRuleState) {
            this.configRuleState = configRuleState;
            return this;
        }
        public String getConfigRuleState() {
            return this.configRuleState;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setResourceTypes(String resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public String getResourceTypes() {
            return this.resourceTypes;
        }

        public GetSecuritySuggestionListRequestListConfigRulesRequest setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}

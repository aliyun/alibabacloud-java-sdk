// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionListRequest extends TeaModel {
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
         * <strong>example:</strong>
         * <p>cp-d7b061dbe91500aa179a</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <strong>example:</strong>
         * <p>The name of the rule.</p>
         */
        @NameInMap("ConfigRuleName")
        public String configRuleName;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ConfigRuleState")
        public String configRuleState;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceTypes")
        public String resourceTypes;

        /**
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

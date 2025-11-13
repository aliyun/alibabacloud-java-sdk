// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckPoliciesRequest extends TeaModel {
    /**
     * <p>The types of policies to be queried (default queries both custom and system predefined policies).</p>
     */
    @NameInMap("CheckTypes")
    public java.util.List<String> checkTypes;

    /**
     * <p>Specifies the page number from which to start displaying the query results. The starting value is <strong>1</strong>. The default value is <strong>1</strong>, indicating that the display starts from the <strong>1st</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>ID of the associated parent policy.</p>
     * <p>(The specific dependency relationship from low to high is: Section -&gt; Requirement -&gt; Standard)</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000002</p>
     */
    @NameInMap("DependentPolicyId")
    public Long dependentPolicyId;

    /**
     * <p>Language type for request and response messages, with a default value of <strong>zh</strong>. Possible values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Number of check item information entries displayed per page during pagination. The default value is <strong>50</strong>, indicating 50 entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of the newly added classification setting.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("PolicyId")
    public Long policyId;

    /**
     * <p>Name of the newly added classification setting.</p>
     * 
     * <strong>example:</strong>
     * <p>testPolicyName</p>
     */
    @NameInMap("PolicyShowName")
    public String policyShowName;

    /**
     * <p>Policy type of the custom check item rule:</p>
     * <ul>
     * <li><strong>STANDARD</strong>: New standard</li>
     * <li><strong>REQUIREMENT</strong>: New requirement</li>
     * <li><strong>SECTION</strong>: New section</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>Name of the associated major policy category (required when PolicyType is STANDARD):</p>
     * <ul>
     * <li><strong>AISPM</strong>: AI Configuration Management (AI-SPM)</li>
     * <li><strong>IDENTITY_PERMISSION</strong>: Identity and Permission Management (CIEM)</li>
     * <li><strong>RISK</strong>: Security Risk</li>
     * <li><strong>COMPLIANCE</strong>: Compliance Risk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AISPM</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCheckPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckPoliciesRequest self = new ListCheckPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckPoliciesRequest setCheckTypes(java.util.List<String> checkTypes) {
        this.checkTypes = checkTypes;
        return this;
    }
    public java.util.List<String> getCheckTypes() {
        return this.checkTypes;
    }

    public ListCheckPoliciesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckPoliciesRequest setDependentPolicyId(Long dependentPolicyId) {
        this.dependentPolicyId = dependentPolicyId;
        return this;
    }
    public Long getDependentPolicyId() {
        return this.dependentPolicyId;
    }

    public ListCheckPoliciesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckPoliciesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckPoliciesRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public ListCheckPoliciesRequest setPolicyShowName(String policyShowName) {
        this.policyShowName = policyShowName;
        return this;
    }
    public String getPolicyShowName() {
        return this.policyShowName;
    }

    public ListCheckPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListCheckPoliciesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

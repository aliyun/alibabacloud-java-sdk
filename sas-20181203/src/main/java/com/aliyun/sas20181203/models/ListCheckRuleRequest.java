// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> API to get the check item ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The name of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>checkName</p>
     */
    @NameInMap("CheckName")
    public String checkName;

    /**
     * <p>The page number displayed in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Set the language type for the request and response messages. The default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of check items displayed per page in a paginated query. The default value is <strong>20</strong>, indicating 20 check items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of rule. Default is <strong>WHITE</strong>. Values:</p>
     * <ul>
     * <li><strong>WHITE</strong>: Add to whitelist</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The scope where the rule applies. Values:</p>
     * <ul>
     * <li><strong>INSTNACE</strong>: Instance</li>
     * <li><strong>ITEM</strong>: Check item</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    public static ListCheckRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRuleRequest self = new ListCheckRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckRuleRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public ListCheckRuleRequest setCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }
    public String getCheckName() {
        return this.checkName;
    }

    public ListCheckRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListCheckRuleRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

}

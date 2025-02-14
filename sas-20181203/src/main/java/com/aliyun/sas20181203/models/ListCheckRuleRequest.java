// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <strong>example:</strong>
     * <p>checkName</p>
     */
    @NameInMap("CheckName")
    public String checkName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
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

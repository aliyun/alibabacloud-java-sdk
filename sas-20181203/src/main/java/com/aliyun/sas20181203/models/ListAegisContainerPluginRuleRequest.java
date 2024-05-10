// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The query condition.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <br>
     * <p>*   **0**: custom</p>
     * <p>*   **1**: system</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    public static ListAegisContainerPluginRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAegisContainerPluginRuleRequest self = new ListAegisContainerPluginRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListAegisContainerPluginRuleRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListAegisContainerPluginRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAegisContainerPluginRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAegisContainerPluginRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAegisContainerPluginRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

}

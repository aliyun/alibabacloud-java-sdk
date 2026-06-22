// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAegisContainerPluginRuleRequest extends TeaModel {
    /**
     * <p>The query conditions. The format is as follows:</p>
     * <pre><code class="language-json">[
     *   {
     *     &quot;name&quot;: &quot;ruleName&quot;,
     *     &quot;value&quot;: &quot;test&quot;
     *   }
     * ]
     * </code></pre>
     * <p><strong>- name</strong>: The condition name. The following conditions are supported:</p>
     * <ul>
     * <li><strong>ruleName</strong>: The rule name.</li>
     * </ul>
     * <p><strong>- value</strong>: The condition value.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;: \&quot;name\&quot;, \&quot;value\&quot;: \&quot;test-1818\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the current page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies the language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: User-defined.</li>
     * <li><strong>1</strong>: System built-in.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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

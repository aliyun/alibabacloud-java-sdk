// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <ul>
     * <li><p><strong>name</strong>: the name of the search condition.</p>
     * </li>
     * <li><p><strong>value</strong>: the value of the search condition.</p>
     * </li>
     * <li><p><strong>logicalExp</strong>: the logical relation for multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;ruleName\&quot;,\&quot;value\&quot;:\&quot;test-1818\&quot;,\&quot;logicalExp\&quot;:\&quot;AND\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relation for multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions use a logical <strong>OR</strong>.</li>
     * <li><strong>AND</strong>: The search conditions use a logical <strong>AND</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListSasContainerWebDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSasContainerWebDefenseRuleRequest self = new ListSasContainerWebDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSasContainerWebDefenseRuleRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListSasContainerWebDefenseRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListSasContainerWebDefenseRuleRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public ListSasContainerWebDefenseRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The conditions for searching assets. This parameter is in JSON format and contains the following fields:</p>
     * <ul>
     * <li><strong>name</strong>: The search item.</li>
     * <li><strong>value</strong>: The value of the search item.</li>
     * <li><strong>logicalExp</strong>: The logical relationship among multiple search item values. Valid values:<ul>
     * <li><strong>OR</strong>: The search item values are evaluated by using the OR operator.</li>
     * <li><strong>AND</strong>: The search item values are evaluated by using the AND operator.</li>
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
     * <p>The page number of the current page in a paged query. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The logical relationship among multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated by using the OR operator.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated by using the AND operator.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>20</strong>, which indicates that 20 entries are displayed per page.</p>
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

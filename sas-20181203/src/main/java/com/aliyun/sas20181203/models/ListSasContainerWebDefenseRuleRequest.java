// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSasContainerWebDefenseRuleRequest extends TeaModel {
    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LogicalExp")
    public String logicalExp;

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

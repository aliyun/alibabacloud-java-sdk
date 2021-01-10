// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("MyOwner")
    public String myOwner;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortType")
    public String sortType;

    @NameInMap("Status")
    public String status;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static ListClriskIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueRequest self = new ListClriskIssueRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskIssueRequest setMyOwner(String myOwner) {
        this.myOwner = myOwner;
        return this;
    }
    public String getMyOwner() {
        return this.myOwner;
    }

    public ListClriskIssueRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskIssueRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskIssueRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListClriskIssueRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public ListClriskIssueRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListClriskIssueRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListClriskIssueRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListClriskIssueRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListClriskIssueRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}

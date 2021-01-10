// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelsRequest extends TeaModel {
    @NameInMap("DataNode")
    public String dataNode;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SelectType")
    public String selectType;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortType")
    public String sortType;

    @NameInMap("Status")
    public String status;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static ListClriskModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelsRequest self = new ListClriskModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskModelsRequest setDataNode(String dataNode) {
        this.dataNode = dataNode;
        return this;
    }
    public String getDataNode() {
        return this.dataNode;
    }

    public ListClriskModelsRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListClriskModelsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskModelsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskModelsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListClriskModelsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListClriskModelsRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public ListClriskModelsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListClriskModelsRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

    public ListClriskModelsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListClriskModelsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListClriskModelsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListClriskModelsRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}

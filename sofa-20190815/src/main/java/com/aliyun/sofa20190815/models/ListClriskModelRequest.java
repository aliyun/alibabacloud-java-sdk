// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskModelRequest extends TeaModel {
    @NameInMap("DataNode")
    public String dataNode;

    @NameInMap("IsUpdate")
    public Boolean isUpdate;

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

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TriggerMode")
    public String triggerMode;

    public static ListClriskModelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskModelRequest self = new ListClriskModelRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskModelRequest setDataNode(String dataNode) {
        this.dataNode = dataNode;
        return this;
    }
    public String getDataNode() {
        return this.dataNode;
    }

    public ListClriskModelRequest setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
        return this;
    }
    public Boolean getIsUpdate() {
        return this.isUpdate;
    }

    public ListClriskModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListClriskModelRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskModelRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskModelRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public ListClriskModelRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListClriskModelRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public ListClriskModelRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListClriskModelRequest setSelectType(String selectType) {
        this.selectType = selectType;
        return this;
    }
    public String getSelectType() {
        return this.selectType;
    }

    public ListClriskModelRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListClriskModelRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListClriskModelRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListClriskModelRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListClriskModelRequest setTriggerMode(String triggerMode) {
        this.triggerMode = triggerMode;
        return this;
    }
    public String getTriggerMode() {
        return this.triggerMode;
    }

}

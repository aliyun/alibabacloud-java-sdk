// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleRecordsRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RuleCode")
    public String ruleCode;

    public static ListClriskRuleRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleRecordsRequest self = new ListClriskRuleRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleRecordsRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public ListClriskRuleRecordsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskRuleRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskRuleRecordsRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

}

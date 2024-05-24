// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentsRequest extends TeaModel {
    @NameInMap("creator")
    public String creator;

    @NameInMap("executionMode")
    public String executionMode;

    @NameInMap("labelKey")
    public String labelKey;

    @NameInMap("labelValueArray")
    public String labelValueArray;

    @NameInMap("modifier")
    public String modifier;

    @NameInMap("name")
    public String name;

    @NameInMap("pageIndex")
    public Integer pageIndex;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("status")
    public String status;

    public static ListDeploymentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsRequest self = new ListDeploymentsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListDeploymentsRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public ListDeploymentsRequest setLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }
    public String getLabelKey() {
        return this.labelKey;
    }

    public ListDeploymentsRequest setLabelValueArray(String labelValueArray) {
        this.labelValueArray = labelValueArray;
        return this;
    }
    public String getLabelValueArray() {
        return this.labelValueArray;
    }

    public ListDeploymentsRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ListDeploymentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDeploymentsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDeploymentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

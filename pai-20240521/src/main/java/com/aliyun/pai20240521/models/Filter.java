// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class Filter extends TeaModel {
    @NameInMap("FilterBy")
    public String filterBy;

    @NameInMap("FilterCondition")
    public String filterCondition;

    @NameInMap("FilterOperation")
    public String filterOperation;

    public static Filter build(java.util.Map<String, ?> map) throws Exception {
        Filter self = new Filter();
        return TeaModel.build(map, self);
    }

    public Filter setFilterBy(String filterBy) {
        this.filterBy = filterBy;
        return this;
    }
    public String getFilterBy() {
        return this.filterBy;
    }

    public Filter setFilterCondition(String filterCondition) {
        this.filterCondition = filterCondition;
        return this;
    }
    public String getFilterCondition() {
        return this.filterCondition;
    }

    public Filter setFilterOperation(String filterOperation) {
        this.filterOperation = filterOperation;
        return this;
    }
    public String getFilterOperation() {
        return this.filterOperation;
    }

}

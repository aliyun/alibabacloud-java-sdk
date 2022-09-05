// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskWorkforceStatisticRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StatType")
    public String statType;

    public static GetTaskWorkforceStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskWorkforceStatisticRequest self = new GetTaskWorkforceStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskWorkforceStatisticRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetTaskWorkforceStatisticRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTaskWorkforceStatisticRequest setStatType(String statType) {
        this.statType = statType;
        return this;
    }
    public String getStatType() {
        return this.statType;
    }

}

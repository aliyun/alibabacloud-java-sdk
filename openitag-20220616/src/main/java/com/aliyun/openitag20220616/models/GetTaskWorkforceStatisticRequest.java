// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskWorkforceStatisticRequest extends TeaModel {
    /**
     * <p>The page number of the member list. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of members per page in a paged query. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The statistics type. Valid values:</p>
     * <ul>
     * <li>ITEM: Statistics are collected based on individual review records.</li>
     * <li>OPERATORCELL: Statistics are collected based on operation units. A single ITEM may contain multiple operation units.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ITEM</p>
     */
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

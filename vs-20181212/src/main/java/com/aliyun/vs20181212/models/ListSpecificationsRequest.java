// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListSpecificationsRequest extends TeaModel {
    /**
     * <p>The page number of the query list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The specification.</p>
     * 
     * <strong>example:</strong>
     * <p>ew.gn8t6xlarge-rb.x1p</p>
     */
    @NameInMap("Specification")
    public String specification;

    public static ListSpecificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificationsRequest self = new ListSpecificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListSpecificationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSpecificationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSpecificationsRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

}

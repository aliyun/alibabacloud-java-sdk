// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAclRequest extends TeaModel {
    /**
     * <p>The condition that you specify to filter the ACLs. If you do not specify this parameter, all ACLs are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>CID-TEST</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListInstanceAclRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAclRequest self = new ListInstanceAclRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAclRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListInstanceAclRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceAclRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

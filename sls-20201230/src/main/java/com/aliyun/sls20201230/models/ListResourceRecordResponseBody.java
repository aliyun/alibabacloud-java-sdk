// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListResourceRecordResponseBody extends TeaModel {
    /**
     * <p>The number of records returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The list of resource records.</p>
     */
    @NameInMap("items")
    public java.util.List<ResourceRecord> items;

    /**
     * <p>The total number of records that match the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>245</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListResourceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRecordResponseBody self = new ListResourceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceRecordResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListResourceRecordResponseBody setItems(java.util.List<ResourceRecord> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ResourceRecord> getItems() {
        return this.items;
    }

    public ListResourceRecordResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}

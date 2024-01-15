// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The Logstores that meet the query conditions.</p>
     */
    @NameInMap("logstores")
    public java.util.List<String> logstores;

    /**
     * <p>The number of the Logstores that meet the query conditions.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListLogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresResponseBody self = new ListLogStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogStoresResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListLogStoresResponseBody setLogstores(java.util.List<String> logstores) {
        this.logstores = logstores;
        return this;
    }
    public java.util.List<String> getLogstores() {
        return this.logstores;
    }

    public ListLogStoresResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

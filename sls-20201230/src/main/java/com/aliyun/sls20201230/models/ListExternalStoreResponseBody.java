// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListExternalStoreResponseBody extends TeaModel {
    /**
     * <p>The number of external stores returned on the current page.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The names of the external stores.</p>
     */
    @NameInMap("externalstores")
    public java.util.List<String> externalstores;

    /**
     * <p>The number of external stores that meet the query conditions.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListExternalStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExternalStoreResponseBody self = new ListExternalStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExternalStoreResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListExternalStoreResponseBody setExternalstores(java.util.List<String> externalstores) {
        this.externalstores = externalstores;
        return this;
    }
    public java.util.List<String> getExternalstores() {
        return this.externalstores;
    }

    public ListExternalStoreResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

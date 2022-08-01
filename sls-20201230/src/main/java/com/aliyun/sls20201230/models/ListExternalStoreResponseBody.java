// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListExternalStoreResponseBody extends TeaModel {
    @NameInMap("count")
    public Integer count;

    @NameInMap("externalstores")
    public java.util.List<ExternalStore> externalstores;

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

    public ListExternalStoreResponseBody setExternalstores(java.util.List<ExternalStore> externalstores) {
        this.externalstores = externalstores;
        return this;
    }
    public java.util.List<ExternalStore> getExternalstores() {
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

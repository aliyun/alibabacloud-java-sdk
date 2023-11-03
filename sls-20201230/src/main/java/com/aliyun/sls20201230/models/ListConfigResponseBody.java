// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListConfigResponseBody extends TeaModel {
    @NameInMap("configs")
    public java.util.List<String> configs;

    @NameInMap("count")
    public Integer count;

    @NameInMap("total")
    public Integer total;

    public static ListConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigResponseBody self = new ListConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigResponseBody setConfigs(java.util.List<String> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<String> getConfigs() {
        return this.configs;
    }

    public ListConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListConfigResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}

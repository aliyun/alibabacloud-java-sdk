// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogStoresResponseBody extends TeaModel {
    @NameInMap("logstores")
    public java.util.List<String> logstores;

    @NameInMap("total")
    public Integer total;

    public static ListLogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogStoresResponseBody self = new ListLogStoresResponseBody();
        return TeaModel.build(map, self);
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

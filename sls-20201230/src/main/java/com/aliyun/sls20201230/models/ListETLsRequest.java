// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListETLsRequest extends TeaModel {
    @NameInMap("logstore")
    public String logstore;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListETLsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListETLsRequest self = new ListETLsRequest();
        return TeaModel.build(map, self);
    }

    public ListETLsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListETLsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListETLsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListSavedSearchRequest extends TeaModel {
    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListSavedSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSavedSearchRequest self = new ListSavedSearchRequest();
        return TeaModel.build(map, self);
    }

    public ListSavedSearchRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListSavedSearchRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

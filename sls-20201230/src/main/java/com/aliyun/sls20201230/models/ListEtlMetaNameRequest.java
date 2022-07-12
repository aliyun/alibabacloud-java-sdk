// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListEtlMetaNameRequest extends TeaModel {
    // 默认值为 0。
    @NameInMap("offset")
    public Integer offset;

    // 默认值 200。
    @NameInMap("size")
    public Integer size;

    public static ListEtlMetaNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEtlMetaNameRequest self = new ListEtlMetaNameRequest();
        return TeaModel.build(map, self);
    }

    public ListEtlMetaNameRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListEtlMetaNameRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

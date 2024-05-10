// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListStoreViewsRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    @NameInMap("storeType")
    public String storeType;

    public static ListStoreViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStoreViewsRequest self = new ListStoreViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListStoreViewsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListStoreViewsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListStoreViewsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListStoreViewsRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}

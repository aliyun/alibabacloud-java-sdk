// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMetricStoresRequest extends TeaModel {
    @NameInMap("mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>metric_store</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListMetricStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetricStoresRequest self = new ListMetricStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListMetricStoresRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListMetricStoresRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMetricStoresRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListMetricStoresRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMetricStoresRequest extends TeaModel {
    /**
     * <p>The type of the Metricstore. For example, you can set the parameter to standard to query Standard Metricstores.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("mode")
    public String mode;

    /**
     * <p>The name of the Metricstore. Fuzzy search is supported. If you do not specify this parameter, all Metricstores are involved.</p>
     * 
     * <strong>example:</strong>
     * <p>metric_store</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The start position of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page.</p>
     * 
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

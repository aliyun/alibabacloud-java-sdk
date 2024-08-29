// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListStoreViewsRequest extends TeaModel {
    /**
     * <p>The dataset name that is used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>my_storeview</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The offset of the datasets to return. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of datasets to return. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Integer size;

    /**
     * <p>The type of the datasets to return. By default, datasets are not filtered by type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>metricstore</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>logstore</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>logstore</p>
     */
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

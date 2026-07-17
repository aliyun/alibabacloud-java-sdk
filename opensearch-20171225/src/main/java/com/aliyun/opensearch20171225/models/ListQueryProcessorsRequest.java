// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return default rules. The default value is 0. Valid values:</p>
     * <ul>
     * <li><p>0: Returns all query analysis rules.</p>
     * </li>
     * <li><p>1: Returns only default query analysis rules.</p>
     * </li>
     * <li><p>2: Returns only non-default query analysis rules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("isActive")
    public Integer isActive;

    public static ListQueryProcessorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQueryProcessorsRequest self = new ListQueryProcessorsRequest();
        return TeaModel.build(map, self);
    }

    public ListQueryProcessorsRequest setIsActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }
    public Integer getIsActive() {
        return this.isActive;
    }

}

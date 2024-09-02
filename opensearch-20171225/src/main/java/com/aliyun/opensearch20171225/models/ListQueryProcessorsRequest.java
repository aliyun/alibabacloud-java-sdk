// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListQueryProcessorsRequest extends TeaModel {
    /**
     * <p>The scope of query analysis rules to be queried. Default value: 0. Valid values:</p>
     * <ul>
     * <li>0: queries all query analysis rules.</li>
     * <li>1: queries the default query analysis rules.</li>
     * <li>2: queries the query analysis rules that are not the default rules.</li>
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

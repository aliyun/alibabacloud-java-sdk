// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ABTestGroup extends TeaModel {
    /**
     * <p>The alias of the test group.</p>
     * 
     * <strong>example:</strong>
     * <p>“kevin_test”</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status of the test group. Valid values:</p>
     * <ul>
     * <li>0: not in effect</li>
     * <li>1: in effect</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    public static ABTestGroup build(java.util.Map<String, ?> map) throws Exception {
        ABTestGroup self = new ABTestGroup();
        return TeaModel.build(map, self);
    }

    public ABTestGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ABTestGroup setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}

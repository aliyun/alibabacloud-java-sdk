// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ABTestScene extends TeaModel {
    /**
     * <p>The alias of the test scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status of the test scenario. Valid values:</p>
     * <ul>
     * <li>0: not in effect</li>
     * <li>1: in effect</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The ID of the test scenario</p>
     */
    @NameInMap("values")
    public java.util.List<String> values;

    public static ABTestScene build(java.util.Map<String, ?> map) throws Exception {
        ABTestScene self = new ABTestScene();
        return TeaModel.build(map, self);
    }

    public ABTestScene setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ABTestScene setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ABTestScene setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}

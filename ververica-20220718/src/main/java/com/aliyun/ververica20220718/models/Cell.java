// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Cell extends TeaModel {
    @NameInMap("value")
    public String value;

    public static Cell build(java.util.Map<String, ?> map) throws Exception {
        Cell self = new Cell();
        return TeaModel.build(map, self);
    }

    public Cell setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AddTestRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static AddTestRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTestRequest self = new AddTestRequest();
        return TeaModel.build(map, self);
    }

    public AddTestRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public AddTestRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}

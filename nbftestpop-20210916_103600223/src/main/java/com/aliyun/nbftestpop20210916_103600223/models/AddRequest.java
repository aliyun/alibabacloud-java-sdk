// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223.models;

import com.aliyun.tea.*;

public class AddRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static AddRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRequest self = new AddRequest();
        return TeaModel.build(map, self);
    }

    public AddRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public AddRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}

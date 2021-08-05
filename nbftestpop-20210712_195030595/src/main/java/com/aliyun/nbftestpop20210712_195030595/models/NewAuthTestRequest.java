// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210712_195030595.models;

import com.aliyun.tea.*;

public class NewAuthTestRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static NewAuthTestRequest build(java.util.Map<String, ?> map) throws Exception {
        NewAuthTestRequest self = new NewAuthTestRequest();
        return TeaModel.build(map, self);
    }

    public NewAuthTestRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public NewAuthTestRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}

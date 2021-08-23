// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class PublishTestRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static PublishTestRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishTestRequest self = new PublishTestRequest();
        return TeaModel.build(map, self);
    }

    public PublishTestRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public PublishTestRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}

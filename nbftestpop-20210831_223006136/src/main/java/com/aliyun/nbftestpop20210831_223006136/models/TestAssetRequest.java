// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class TestAssetRequest extends TeaModel {
    @NameInMap("x")
    public Integer x;

    @NameInMap("y")
    public Integer y;

    public static TestAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        TestAssetRequest self = new TestAssetRequest();
        return TeaModel.build(map, self);
    }

    public TestAssetRequest setX(Integer x) {
        this.x = x;
        return this;
    }
    public Integer getX() {
        return this.x;
    }

    public TestAssetRequest setY(Integer y) {
        this.y = y;
        return this;
    }
    public Integer getY() {
        return this.y;
    }

}

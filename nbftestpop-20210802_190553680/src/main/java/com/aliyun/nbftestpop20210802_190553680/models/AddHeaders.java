// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210802_190553680.models;

import com.aliyun.tea.*;

public class AddHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x")
    public String x;

    @NameInMap("y")
    public String y;

    public static AddHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddHeaders self = new AddHeaders();
        return TeaModel.build(map, self);
    }

    public AddHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddHeaders setX(String x) {
        this.x = x;
        return this;
    }
    public String getX() {
        return this.x;
    }

    public AddHeaders setY(String y) {
        this.y = y;
        return this;
    }
    public String getY() {
        return this.y;
    }

}

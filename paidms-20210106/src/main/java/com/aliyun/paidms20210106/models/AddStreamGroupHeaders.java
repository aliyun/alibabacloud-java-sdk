// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class AddStreamGroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("TransToAlink")
    public String transToAlink;

    public static AddStreamGroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddStreamGroupHeaders self = new AddStreamGroupHeaders();
        return TeaModel.build(map, self);
    }

    public AddStreamGroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddStreamGroupHeaders setTransToAlink(String transToAlink) {
        this.transToAlink = transToAlink;
        return this;
    }
    public String getTransToAlink() {
        return this.transToAlink;
    }

}

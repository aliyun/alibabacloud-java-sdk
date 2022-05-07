// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class MapTestResponseBody extends TeaModel {
    @NameInMap("Requestid")
    public java.util.Map<String, ?> requestid;

    public static MapTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapTestResponseBody self = new MapTestResponseBody();
        return TeaModel.build(map, self);
    }

    public MapTestResponseBody setRequestid(java.util.Map<String, ?> requestid) {
        this.requestid = requestid;
        return this;
    }
    public java.util.Map<String, ?> getRequestid() {
        return this.requestid;
    }

}

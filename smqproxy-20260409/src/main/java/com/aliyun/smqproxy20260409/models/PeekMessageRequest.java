// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class PeekMessageRequest extends TeaModel {
    @NameInMap("peekonly")
    public Boolean peekonly;

    public static PeekMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PeekMessageRequest self = new PeekMessageRequest();
        return TeaModel.build(map, self);
    }

    public PeekMessageRequest setPeekonly(Boolean peekonly) {
        this.peekonly = peekonly;
        return this;
    }
    public Boolean getPeekonly() {
        return this.peekonly;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class ReceiveMessageRequest extends TeaModel {
    @NameInMap("waitseconds")
    public Integer waitseconds;

    public static ReceiveMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveMessageRequest self = new ReceiveMessageRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveMessageRequest setWaitseconds(Integer waitseconds) {
        this.waitseconds = waitseconds;
        return this;
    }
    public Integer getWaitseconds() {
        return this.waitseconds;
    }

}

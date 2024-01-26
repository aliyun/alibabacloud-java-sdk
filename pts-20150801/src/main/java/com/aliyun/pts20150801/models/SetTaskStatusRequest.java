// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SetTaskStatusRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Wskey")
    public String wskey;

    public static SetTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTaskStatusRequest self = new SetTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetTaskStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetTaskStatusRequest setWskey(String wskey) {
        this.wskey = wskey;
        return this;
    }
    public String getWskey() {
        return this.wskey;
    }

}

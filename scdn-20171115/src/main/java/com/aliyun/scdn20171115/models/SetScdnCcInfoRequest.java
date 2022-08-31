// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class SetScdnCcInfoRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    public static SetScdnCcInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SetScdnCcInfoRequest self = new SetScdnCcInfoRequest();
        return TeaModel.build(map, self);
    }

    public SetScdnCcInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}

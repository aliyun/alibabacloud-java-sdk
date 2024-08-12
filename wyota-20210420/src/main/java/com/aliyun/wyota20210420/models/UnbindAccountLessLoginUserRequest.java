// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindAccountLessLoginUserRequest extends TeaModel {
    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Uuid")
    public String uuid;

    public static UnbindAccountLessLoginUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAccountLessLoginUserRequest self = new UnbindAccountLessLoginUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAccountLessLoginUserRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public UnbindAccountLessLoginUserRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

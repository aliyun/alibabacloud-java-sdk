// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class BindAccountLessLoginUserRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Uuid")
    public String uuid;

    public static BindAccountLessLoginUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAccountLessLoginUserRequest self = new BindAccountLessLoginUserRequest();
        return TeaModel.build(map, self);
    }

    public BindAccountLessLoginUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public BindAccountLessLoginUserRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public BindAccountLessLoginUserRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindPasswordFreeLoginUserRequest extends TeaModel {
    @NameInMap("MainBizType")
    public String mainBizType;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Uuid")
    public String uuid;

    public static UnbindPasswordFreeLoginUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindPasswordFreeLoginUserRequest self = new UnbindPasswordFreeLoginUserRequest();
        return TeaModel.build(map, self);
    }

    public UnbindPasswordFreeLoginUserRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

    public UnbindPasswordFreeLoginUserRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public UnbindPasswordFreeLoginUserRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

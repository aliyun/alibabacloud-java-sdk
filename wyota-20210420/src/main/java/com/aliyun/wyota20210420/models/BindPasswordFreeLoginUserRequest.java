// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class BindPasswordFreeLoginUserRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("MainBizType")
    public String mainBizType;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Uuid")
    public String uuid;

    public static BindPasswordFreeLoginUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindPasswordFreeLoginUserRequest self = new BindPasswordFreeLoginUserRequest();
        return TeaModel.build(map, self);
    }

    public BindPasswordFreeLoginUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public BindPasswordFreeLoginUserRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
    }

    public BindPasswordFreeLoginUserRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public BindPasswordFreeLoginUserRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindDeviceSeatsRequest extends TeaModel {
    @NameInMap("SerialNoList")
    public java.util.List<String> serialNoList;

    public static UnbindDeviceSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceSeatsRequest self = new UnbindDeviceSeatsRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceSeatsRequest setSerialNoList(java.util.List<String> serialNoList) {
        this.serialNoList = serialNoList;
        return this;
    }
    public java.util.List<String> getSerialNoList() {
        return this.serialNoList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindDeviceSeatsShrinkRequest extends TeaModel {
    @NameInMap("SerialNoList")
    public String serialNoListShrink;

    public static UnbindDeviceSeatsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceSeatsShrinkRequest self = new UnbindDeviceSeatsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceSeatsShrinkRequest setSerialNoListShrink(String serialNoListShrink) {
        this.serialNoListShrink = serialNoListShrink;
        return this;
    }
    public String getSerialNoListShrink() {
        return this.serialNoListShrink;
    }

}

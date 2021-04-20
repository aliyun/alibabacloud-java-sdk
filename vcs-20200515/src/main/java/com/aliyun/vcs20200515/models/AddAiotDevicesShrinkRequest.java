// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotDevicesShrinkRequest extends TeaModel {
    @NameInMap("AiotDeviceList")
    public String aiotDeviceListShrink;

    public static AddAiotDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotDevicesShrinkRequest self = new AddAiotDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotDevicesShrinkRequest setAiotDeviceListShrink(String aiotDeviceListShrink) {
        this.aiotDeviceListShrink = aiotDeviceListShrink;
        return this;
    }
    public String getAiotDeviceListShrink() {
        return this.aiotDeviceListShrink;
    }

}

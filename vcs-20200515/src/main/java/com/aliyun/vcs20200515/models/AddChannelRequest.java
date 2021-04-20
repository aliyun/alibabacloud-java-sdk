// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddChannelRequest extends TeaModel {
    @NameInMap("ParentDeviceGbId")
    public String parentDeviceGbId;

    public static AddChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChannelRequest self = new AddChannelRequest();
        return TeaModel.build(map, self);
    }

    public AddChannelRequest setParentDeviceGbId(String parentDeviceGbId) {
        this.parentDeviceGbId = parentDeviceGbId;
        return this;
    }
    public String getParentDeviceGbId() {
        return this.parentDeviceGbId;
    }

}

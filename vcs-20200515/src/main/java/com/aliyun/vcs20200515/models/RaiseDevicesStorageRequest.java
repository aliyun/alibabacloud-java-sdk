// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RaiseDevicesStorageRequest extends TeaModel {
    @NameInMap("Json")
    public String json;

    public static RaiseDevicesStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        RaiseDevicesStorageRequest self = new RaiseDevicesStorageRequest();
        return TeaModel.build(map, self);
    }

    public RaiseDevicesStorageRequest setJson(String json) {
        this.json = json;
        return this;
    }
    public String getJson() {
        return this.json;
    }

}

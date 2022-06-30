// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCountRequest extends TeaModel {
    @NameInMap("UpStreamMode")
    public String upStreamMode;

    public static GetDeviceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCountRequest self = new GetDeviceCountRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceCountRequest setUpStreamMode(String upStreamMode) {
        this.upStreamMode = upStreamMode;
        return this;
    }
    public String getUpStreamMode() {
        return this.upStreamMode;
    }

}

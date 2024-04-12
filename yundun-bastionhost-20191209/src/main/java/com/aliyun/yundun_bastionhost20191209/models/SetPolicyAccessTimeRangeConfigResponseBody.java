// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyAccessTimeRangeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAccessTimeRangeConfigResponseBody self = new SetPolicyAccessTimeRangeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyAccessTimeRangeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateMPULayoutResponseBody extends TeaModel {
    @NameInMap("LayoutId")
    public Long layoutId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateMPULayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMPULayoutResponseBody self = new CreateMPULayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMPULayoutResponseBody setLayoutId(Long layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public Long getLayoutId() {
        return this.layoutId;
    }

    public CreateMPULayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

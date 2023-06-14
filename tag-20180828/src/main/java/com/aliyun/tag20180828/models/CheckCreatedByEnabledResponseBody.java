// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class CheckCreatedByEnabledResponseBody extends TeaModel {
    @NameInMap("OpenStatus")
    public Boolean openStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckCreatedByEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCreatedByEnabledResponseBody self = new CheckCreatedByEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCreatedByEnabledResponseBody setOpenStatus(Boolean openStatus) {
        this.openStatus = openStatus;
        return this;
    }
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    public CheckCreatedByEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

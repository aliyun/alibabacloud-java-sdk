// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CheckSharingWithResourceDirectoryStatusResponseBody extends TeaModel {
    @NameInMap("EnableSharingWithRd")
    public Boolean enableSharingWithRd;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckSharingWithResourceDirectoryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSharingWithResourceDirectoryStatusResponseBody self = new CheckSharingWithResourceDirectoryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSharingWithResourceDirectoryStatusResponseBody setEnableSharingWithRd(Boolean enableSharingWithRd) {
        this.enableSharingWithRd = enableSharingWithRd;
        return this;
    }
    public Boolean getEnableSharingWithRd() {
        return this.enableSharingWithRd;
    }

    public CheckSharingWithResourceDirectoryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

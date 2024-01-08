// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class CheckSharingWithResourceDirectoryStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether resource sharing within a resource directory is enabled. Valid values:</p>
     * <br>
     * <p>*   false</p>
     * <p>*   true</p>
     */
    @NameInMap("EnableSharingWithRd")
    public Boolean enableSharingWithRd;

    /**
     * <p>The request ID.</p>
     */
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

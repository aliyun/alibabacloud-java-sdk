// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallRaspAttachResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>86CFF42E-E00A-57A3-8656-22291EFB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InstallRaspAttachResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallRaspAttachResponseBody self = new InstallRaspAttachResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallRaspAttachResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

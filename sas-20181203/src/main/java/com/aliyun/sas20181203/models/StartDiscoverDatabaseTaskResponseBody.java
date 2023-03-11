// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartDiscoverDatabaseTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the scan task.</p>
     */
    @NameInMap("CreateMark")
    public String createMark;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDiscoverDatabaseTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDiscoverDatabaseTaskResponseBody self = new StartDiscoverDatabaseTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDiscoverDatabaseTaskResponseBody setCreateMark(String createMark) {
        this.createMark = createMark;
        return this;
    }
    public String getCreateMark() {
        return this.createMark;
    }

    public StartDiscoverDatabaseTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

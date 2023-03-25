// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class StartPreCheckDatabaseResponseBody extends TeaModel {
    /**
     * <p>The ID of the database precheck task.</p>
     */
    @NameInMap("CreateMark")
    public String createMark;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartPreCheckDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPreCheckDatabaseResponseBody self = new StartPreCheckDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPreCheckDatabaseResponseBody setCreateMark(String createMark) {
        this.createMark = createMark;
        return this;
    }
    public String getCreateMark() {
        return this.createMark;
    }

    public StartPreCheckDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

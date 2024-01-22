// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetApplicationLogsOutput extends TeaModel {
    @NameInMap("logEntrys")
    public java.util.List<LogEntry> logEntrys;

    @NameInMap("nextOffset")
    public Long nextOffset;

    @NameInMap("requestId")
    public String requestId;

    public static GetApplicationLogsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationLogsOutput self = new GetApplicationLogsOutput();
        return TeaModel.build(map, self);
    }

    public GetApplicationLogsOutput setLogEntrys(java.util.List<LogEntry> logEntrys) {
        this.logEntrys = logEntrys;
        return this;
    }
    public java.util.List<LogEntry> getLogEntrys() {
        return this.logEntrys;
    }

    public GetApplicationLogsOutput setNextOffset(Long nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }
    public Long getNextOffset() {
        return this.nextOffset;
    }

    public GetApplicationLogsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

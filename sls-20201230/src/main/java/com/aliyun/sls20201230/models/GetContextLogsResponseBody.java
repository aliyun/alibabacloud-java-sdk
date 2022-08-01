// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsResponseBody extends TeaModel {
    @NameInMap("back_lines")
    public Long backLines;

    @NameInMap("forward_lines")
    public Long forwardLines;

    @NameInMap("logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    @NameInMap("progress")
    public String progress;

    @NameInMap("total_lines")
    public Long totalLines;

    public static GetContextLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContextLogsResponseBody self = new GetContextLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContextLogsResponseBody setBackLines(Long backLines) {
        this.backLines = backLines;
        return this;
    }
    public Long getBackLines() {
        return this.backLines;
    }

    public GetContextLogsResponseBody setForwardLines(Long forwardLines) {
        this.forwardLines = forwardLines;
        return this;
    }
    public Long getForwardLines() {
        return this.forwardLines;
    }

    public GetContextLogsResponseBody setLogs(java.util.List<java.util.Map<String, ?>> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLogs() {
        return this.logs;
    }

    public GetContextLogsResponseBody setProgress(String progress) {
        this.progress = progress;
        return this;
    }
    public String getProgress() {
        return this.progress;
    }

    public GetContextLogsResponseBody setTotalLines(Long totalLines) {
        this.totalLines = totalLines;
        return this;
    }
    public Long getTotalLines() {
        return this.totalLines;
    }

}

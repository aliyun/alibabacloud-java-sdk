// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsResponseBody extends TeaModel {
    // 向前查询到的日志条数。
    @NameInMap("back_lines")
    public Long backLines;

    // 向后查询到的日志条数。
    @NameInMap("forward_lines")
    public Long forwardLines;

    // 获取到的日志，按上下文顺序排列。当根据指定起始日志查询不到上下文日志时，此参数为空。
    @NameInMap("logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    // 查询的结果是否完整。
    // Complete：查询已经完成，返回结果为完整结果。
    // Incomplete：查询已经完成，返回结果为不完整结果，需要重复请求以获得完整结果。
    @NameInMap("progress")
    public String progress;

    // 返回的总日志条数，包含请求参数中所指定的起始日志。
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

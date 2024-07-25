// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetContextLogsResponseBody extends TeaModel {
    /**
     * <p>The number of logs that are generated before the generation time of the start log.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("back_lines")
    public Long backLines;

    /**
     * <p>The number of logs that are generated after the generation time of the start log.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("forward_lines")
    public Long forwardLines;

    /**
     * <p>The logs that are returned.</p>
     */
    @NameInMap("logs")
    public java.util.List<java.util.Map<String, ?>> logs;

    /**
     * <p>Indicates whether the query and analysis results are complete. Valid values:</p>
     * <ul>
     * <li>Complete: The query is successful, and the complete query and analysis results are returned.</li>
     * <li>Incomplete: The query is successful, but the query and analysis results are incomplete. To obtain the complete results, you must repeat the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("progress")
    public String progress;

    /**
     * <p>The total number of logs that are returned. The logs include the start log that is specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>201</p>
     */
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

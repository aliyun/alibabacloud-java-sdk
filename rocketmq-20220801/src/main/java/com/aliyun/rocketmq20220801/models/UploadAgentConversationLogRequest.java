// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UploadAgentConversationLogRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>H4sIAAAAAAAAEzMyMDLTNbDUNTQKMTSwMgAhbQMLKwMDBU8/N3+F4sq8kozUksxkheSczNS8EoWc/HSF4pLEohIuIwydhgR1pualcAEAN/JXaXIAAAA=</p>
     */
    @NameInMap("contentGzipB64")
    public String contentGzipB64;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>client.log</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>2026-09-12T11:00:00+08:00</p>
     */
    @NameInMap("timeRangeEnd")
    public String timeRangeEnd;

    /**
     * <strong>example:</strong>
     * <p>2026-09-12T10:00:00+08:00</p>
     */
    @NameInMap("timeRangeStart")
    public String timeRangeStart;

    public static UploadAgentConversationLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentConversationLogRequest self = new UploadAgentConversationLogRequest();
        return TeaModel.build(map, self);
    }

    public UploadAgentConversationLogRequest setContentGzipB64(String contentGzipB64) {
        this.contentGzipB64 = contentGzipB64;
        return this;
    }
    public String getContentGzipB64() {
        return this.contentGzipB64;
    }

    public UploadAgentConversationLogRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadAgentConversationLogRequest setTimeRangeEnd(String timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
        return this;
    }
    public String getTimeRangeEnd() {
        return this.timeRangeEnd;
    }

    public UploadAgentConversationLogRequest setTimeRangeStart(String timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
        return this;
    }
    public String getTimeRangeStart() {
        return this.timeRangeStart;
    }

}

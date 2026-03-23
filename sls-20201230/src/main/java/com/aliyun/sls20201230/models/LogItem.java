// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogItem extends TeaModel {
    /**
     * <p>日志字段列表。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Contents")
    public java.util.List<LogContent> contents;

    /**
     * <p>日志时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1690254376</p>
     */
    @NameInMap("Time")
    public Integer time;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("TimeNs")
    public Integer timeNs;

    public static LogItem build(java.util.Map<String, ?> map) throws Exception {
        LogItem self = new LogItem();
        return TeaModel.build(map, self);
    }

    public LogItem setContents(java.util.List<LogContent> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<LogContent> getContents() {
        return this.contents;
    }

    public LogItem setTime(Integer time) {
        this.time = time;
        return this;
    }
    public Integer getTime() {
        return this.time;
    }

    public LogItem setTimeNs(Integer timeNs) {
        this.timeNs = timeNs;
        return this;
    }
    public Integer getTimeNs() {
        return this.timeNs;
    }

}

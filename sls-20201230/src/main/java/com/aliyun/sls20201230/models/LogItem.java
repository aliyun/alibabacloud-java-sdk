// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class LogItem extends TeaModel {
    @NameInMap("Contents")
    public java.util.List<LogContent> contents;

    @NameInMap("Time")
    public Long time;

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

    public LogItem setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}

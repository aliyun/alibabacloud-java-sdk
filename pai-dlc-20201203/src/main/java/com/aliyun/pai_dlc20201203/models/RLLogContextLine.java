// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLLogContextLine extends TeaModel {
    /**
     * <p>The log text (&lt;= 2000 characters, with ANSI escape codes stripped).</p>
     * 
     * <strong>example:</strong>
     * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The millisecond timestamp of the log line.</p>
     * 
     * <strong>example:</strong>
     * <p>1787293208012</p>
     */
    @NameInMap("TimestampMs")
    public Long timestampMs;

    public static RLLogContextLine build(java.util.Map<String, ?> map) throws Exception {
        RLLogContextLine self = new RLLogContextLine();
        return TeaModel.build(map, self);
    }

    public RLLogContextLine setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RLLogContextLine setTimestampMs(Long timestampMs) {
        this.timestampMs = timestampMs;
        return this;
    }
    public Long getTimestampMs() {
        return this.timestampMs;
    }

}

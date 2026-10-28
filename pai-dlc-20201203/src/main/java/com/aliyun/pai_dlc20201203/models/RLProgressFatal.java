// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressFatal extends TeaModel {
    /**
     * <p>The agent_collect_time of the anchor line, represented as a nanosecond string that exceeds the JavaScript safe integer limit.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713456789</p>
     */
    @NameInMap("CollectNs")
    public String collectNs;

    /**
     * <p>The error message, truncated to 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The raw log line, truncated to 2000 characters. It is passed as AnchorMessage when calling GetRLLogContext.</p>
     * 
     * <strong>example:</strong>
     * <p>[rank0]: torch.OutOfMemoryError: CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("RawMessage")
    public String rawMessage;

    /**
     * <p>The nanosecond offset within the same second, used for sorting logs within the same second.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("SubsecNs")
    public Long subsecNs;

    /**
     * <p>The log time in UNIX seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487</p>
     */
    @NameInMap("Time")
    public Long time;

    public static RLProgressFatal build(java.util.Map<String, ?> map) throws Exception {
        RLProgressFatal self = new RLProgressFatal();
        return TeaModel.build(map, self);
    }

    public RLProgressFatal setCollectNs(String collectNs) {
        this.collectNs = collectNs;
        return this;
    }
    public String getCollectNs() {
        return this.collectNs;
    }

    public RLProgressFatal setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RLProgressFatal setRawMessage(String rawMessage) {
        this.rawMessage = rawMessage;
        return this;
    }
    public String getRawMessage() {
        return this.rawMessage;
    }

    public RLProgressFatal setSubsecNs(Long subsecNs) {
        this.subsecNs = subsecNs;
        return this;
    }
    public Long getSubsecNs() {
        return this.subsecNs;
    }

    public RLProgressFatal setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

}

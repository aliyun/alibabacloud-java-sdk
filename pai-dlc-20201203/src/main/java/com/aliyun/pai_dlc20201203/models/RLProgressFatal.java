// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLProgressFatal extends TeaModel {
    /**
     * <p>锚点行 agent_collect_time（纳秒字符串，超 JS 安全整数）</p>
     * 
     * <strong>example:</strong>
     * <p>1787474487713456789</p>
     */
    @NameInMap("CollectNs")
    public String collectNs;

    /**
     * <p>错误文案（截断至 500 字符）</p>
     * 
     * <strong>example:</strong>
     * <p>CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>原始日志行（截断至 2000 字符）；调用 GetRLLogContext 时作为 AnchorMessage 传入</p>
     * 
     * <strong>example:</strong>
     * <p>[rank0]: torch.OutOfMemoryError: CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("RawMessage")
    public String rawMessage;

    /**
     * <p>同秒内的纳秒偏移，用于同秒日志排序</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("SubsecNs")
    public Long subsecNs;

    /**
     * <p>日志时间（unix 秒）</p>
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

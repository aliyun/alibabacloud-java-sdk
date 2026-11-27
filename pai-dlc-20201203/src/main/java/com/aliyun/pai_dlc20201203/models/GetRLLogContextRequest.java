// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLLogContextRequest extends TeaModel {
    /**
     * <p>The text of the anchor log. The fallback path locates the log by prefix matching. This value is derived from Fatal[].RawMessage.</p>
     * 
     * <strong>example:</strong>
     * <p>[rank0]: torch.OutOfMemoryError: CUDA out of memory. Tried to allocate 2.00 GiB</p>
     */
    @NameInMap("AnchorMessage")
    public String anchorMessage;

    /**
     * <p>The timestamp of the anchor log line in UTC RFC 3339 format with second precision.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-05T16:36:55Z</p>
     */
    @NameInMap("AnchorTime")
    public String anchorTime;

    /**
     * <p>The agent_collect_time of the anchor line as a nanosecond string. This value is derived from Fatal[].CollectNs. If provided, the exact path is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1785947815190122847</p>
     */
    @NameInMap("CollectTime")
    public String collectTime;

    public static GetRLLogContextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRLLogContextRequest self = new GetRLLogContextRequest();
        return TeaModel.build(map, self);
    }

    public GetRLLogContextRequest setAnchorMessage(String anchorMessage) {
        this.anchorMessage = anchorMessage;
        return this;
    }
    public String getAnchorMessage() {
        return this.anchorMessage;
    }

    public GetRLLogContextRequest setAnchorTime(String anchorTime) {
        this.anchorTime = anchorTime;
        return this;
    }
    public String getAnchorTime() {
        return this.anchorTime;
    }

    public GetRLLogContextRequest setCollectTime(String collectTime) {
        this.collectTime = collectTime;
        return this;
    }
    public String getCollectTime() {
        return this.collectTime;
    }

}

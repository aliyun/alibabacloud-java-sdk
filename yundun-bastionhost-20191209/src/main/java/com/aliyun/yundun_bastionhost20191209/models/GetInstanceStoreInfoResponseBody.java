// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceStoreInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>102400</p>
     */
    @NameInMap("Max")
    public Long max;

    /**
     * <strong>example:</strong>
     * <p>5EAB922E-F476-5DFA-9290-313C608E724B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Usage")
    public Long usage;

    public static GetInstanceStoreInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStoreInfoResponseBody self = new GetInstanceStoreInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceStoreInfoResponseBody setMax(Long max) {
        this.max = max;
        return this;
    }
    public Long getMax() {
        return this.max;
    }

    public GetInstanceStoreInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStoreInfoResponseBody setUsage(Long usage) {
        this.usage = usage;
        return this;
    }
    public Long getUsage() {
        return this.usage;
    }

}

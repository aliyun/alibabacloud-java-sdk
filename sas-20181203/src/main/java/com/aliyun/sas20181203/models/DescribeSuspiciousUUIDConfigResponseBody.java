// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousUUIDConfigResponseBody extends TeaModel {
    /**
     * <p>The total number of servers on which proactive defense of the specified type takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6044DC07-86F1-5DDA-A611-EC578EA4EEE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The UUIDs of servers on which proactive defense of the specified type takes effect.</p>
     */
    @NameInMap("UUIDList")
    public java.util.List<String> UUIDList;

    public static DescribeSuspiciousUUIDConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousUUIDConfigResponseBody self = new DescribeSuspiciousUUIDConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousUUIDConfigResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSuspiciousUUIDConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspiciousUUIDConfigResponseBody setUUIDList(java.util.List<String> UUIDList) {
        this.UUIDList = UUIDList;
        return this;
    }
    public java.util.List<String> getUUIDList() {
        return this.UUIDList;
    }

}

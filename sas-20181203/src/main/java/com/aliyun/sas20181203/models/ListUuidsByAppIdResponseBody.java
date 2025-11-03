// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUuidsByAppIdResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The UUIDs of SAE instances.</p>
     */
    @NameInMap("Uuids")
    public java.util.List<String> uuids;

    public static ListUuidsByAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUuidsByAppIdResponseBody self = new ListUuidsByAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUuidsByAppIdResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListUuidsByAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUuidsByAppIdResponseBody setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

}

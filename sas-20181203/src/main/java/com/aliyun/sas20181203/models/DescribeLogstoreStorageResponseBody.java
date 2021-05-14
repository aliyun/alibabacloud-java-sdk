// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageResponseBody extends TeaModel {
    @NameInMap("Used")
    public Long used;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Logstore")
    public String logstore;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Preserve")
    public Long preserve;

    public static DescribeLogstoreStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageResponseBody self = new DescribeLogstoreStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public DescribeLogstoreStorageResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeLogstoreStorageResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DescribeLogstoreStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogstoreStorageResponseBody setPreserve(Long preserve) {
        this.preserve = preserve;
        return this;
    }
    public Long getPreserve() {
        return this.preserve;
    }

}

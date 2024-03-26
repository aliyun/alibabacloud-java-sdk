// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSlsLogStoreResponseBody extends TeaModel {
    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The name of the Simple Log Service project.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The capacity of the Logstore. Unit: bytes.</p>
     */
    @NameInMap("Quota")
    public Long quota;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The storage duration of the Logstore. Unit: days.</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The used capacity of the Logstore. Unit: bytes.</p>
     */
    @NameInMap("Used")
    public Long used;

    public static DescribeSlsLogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogStoreResponseBody self = new DescribeSlsLogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogStoreResponseBody setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeSlsLogStoreResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeSlsLogStoreResponseBody setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

    public DescribeSlsLogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSlsLogStoreResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeSlsLogStoreResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

}

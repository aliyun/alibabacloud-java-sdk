// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageResponseBody extends TeaModel {
    // The name of the dedicated Logstore that is used to store full logs of Security Center. The value is fixed as **sas-log**.
    @NameInMap("Logstore")
    public String logstore;

    // The purchased log storage capacity, in GB.
    @NameInMap("Preserve")
    public Long preserve;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The number of days during which logs can be retained. The value is fixed as **180**, which indicates that logs can be retained for 180 days.
    // 
    // >  You are not allowed to change the value of this parameter.
    @NameInMap("Ttl")
    public Integer ttl;

    // The used log storage capacity, in GB.
    @NameInMap("Used")
    public Long used;

    // The name of the dedicated Project that is used to store full logs of Security Center.
    @NameInMap("UserProject")
    public String userProject;

    public static DescribeLogstoreStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageResponseBody self = new DescribeLogstoreStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public DescribeLogstoreStorageResponseBody setPreserve(Long preserve) {
        this.preserve = preserve;
        return this;
    }
    public Long getPreserve() {
        return this.preserve;
    }

    public DescribeLogstoreStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogstoreStorageResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeLogstoreStorageResponseBody setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public DescribeLogstoreStorageResponseBody setUserProject(String userProject) {
        this.userProject = userProject;
        return this;
    }
    public String getUserProject() {
        return this.userProject;
    }

}

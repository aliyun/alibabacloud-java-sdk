// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageResponseBody extends TeaModel {
    /**
     * <p>The name of the dedicated Logstore that is used to store full logs of Security Center. The value is fixed as <strong>sas-log</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-log</p>
     */
    @NameInMap("Logstore")
    public String logstore;

    /**
     * <p>The purchased log storage capacity, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>12240</p>
     */
    @NameInMap("Preserve")
    public Long preserve;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>25EC270F-5783-4416-AD7C-1EDF063A039C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of days during which logs can be retained. The value is fixed as <strong>180</strong>, which indicates that logs can be retained for 180 days.</p>
     * <blockquote>
     * <p> You are not allowed to change the value of this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The used log storage capacity, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>335</p>
     */
    @NameInMap("Used")
    public Long used;

    /**
     * <p>The name of the dedicated Project that is used to store full logs of Security Center.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-log-XXXX-cn-hangzhou</p>
     */
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

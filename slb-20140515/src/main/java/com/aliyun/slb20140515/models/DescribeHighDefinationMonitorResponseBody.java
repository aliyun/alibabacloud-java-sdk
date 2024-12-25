// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHighDefinationMonitorResponseBody extends TeaModel {
    /**
     * <p>The name of the Log Service project.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>my-log-store</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F398FF5-B349-5C01-8638-8E9A0BF1DBE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeHighDefinationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighDefinationMonitorResponseBody self = new DescribeHighDefinationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighDefinationMonitorResponseBody setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public DescribeHighDefinationMonitorResponseBody setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public DescribeHighDefinationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighDefinationMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}

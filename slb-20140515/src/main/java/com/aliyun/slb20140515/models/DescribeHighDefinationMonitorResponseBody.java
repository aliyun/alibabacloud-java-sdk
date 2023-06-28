// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHighDefinationMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    @NameInMap("LogStore")
    public String logStore;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeHighDefinationMonitor**.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

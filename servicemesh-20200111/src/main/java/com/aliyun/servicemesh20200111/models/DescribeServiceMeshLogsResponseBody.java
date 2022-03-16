// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<DescribeServiceMeshLogsResponseBodyLogs> logs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceMeshLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshLogsResponseBody self = new DescribeServiceMeshLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshLogsResponseBody setLogs(java.util.List<DescribeServiceMeshLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribeServiceMeshLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribeServiceMeshLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceMeshLogsResponseBodyLogs extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Log")
        public String log;

        @NameInMap("ServiceMeshId")
        public String serviceMeshId;

        public static DescribeServiceMeshLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceMeshLogsResponseBodyLogs self = new DescribeServiceMeshLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeServiceMeshLogsResponseBodyLogs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeServiceMeshLogsResponseBodyLogs setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

        public DescribeServiceMeshLogsResponseBodyLogs setServiceMeshId(String serviceMeshId) {
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

    }

}

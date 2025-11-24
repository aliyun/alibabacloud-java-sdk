// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshLogsResponseBody extends TeaModel {
    /**
     * <p>The details of the logs.</p>
     */
    @NameInMap("Logs")
    public java.util.List<DescribeServiceMeshLogsResponseBodyLogs> logs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
     */
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
        /**
         * <p>The point in time when the logs were generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-19T15:21:53+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The content of the logs.</p>
         * 
         * <strong>example:</strong>
         * <p>[RequestID: 31d3a0f0-07ed-4f6e-9004-1804498c****, UID-110982038403****] c096d641835af4658827a4c66c234**** | Start to add cluster c186a6d9641a24098b5499d4d8313****</p>
         */
        @NameInMap("Log")
        public String log;

        /**
         * <p>The ASM instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca04bc38979214bf2882be79d39b4****</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLogMetaResponseBody extends TeaModel {
    /**
     * <p>The data of a data shipping task.</p>
     */
    @NameInMap("LogMeta")
    public GetLogMetaResponseBodyLogMeta logMeta;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLogMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogMetaResponseBody self = new GetLogMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogMetaResponseBody setLogMeta(GetLogMetaResponseBodyLogMeta logMeta) {
        this.logMeta = logMeta;
        return this;
    }
    public GetLogMetaResponseBodyLogMeta getLogMeta() {
        return this.logMeta;
    }

    public GetLogMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLogMetaResponseBodyLogMeta extends TeaModel {
        /**
         * <p>The name of the dedicated Logstore in which logs are stored.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The status of a data shipping task of a log. Valid values:</p>
         * <br>
         * <p>*   **enabled**</p>
         * <p>*   **disabled**</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetLogMetaResponseBodyLogMeta build(java.util.Map<String, ?> map) throws Exception {
            GetLogMetaResponseBodyLogMeta self = new GetLogMetaResponseBodyLogMeta();
            return TeaModel.build(map, self);
        }

        public GetLogMetaResponseBodyLogMeta setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public GetLogMetaResponseBodyLogMeta setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetLogMetaResponseBodyLogMeta setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

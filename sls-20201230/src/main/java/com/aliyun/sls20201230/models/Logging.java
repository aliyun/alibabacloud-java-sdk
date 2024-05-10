// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logging extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<LoggingLoggingDetails> loggingDetails;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("loggingProject")
    public String loggingProject;

    public static Logging build(java.util.Map<String, ?> map) throws Exception {
        Logging self = new Logging();
        return TeaModel.build(map, self);
    }

    public Logging setLoggingDetails(java.util.List<LoggingLoggingDetails> loggingDetails) {
        this.loggingDetails = loggingDetails;
        return this;
    }
    public java.util.List<LoggingLoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    public Logging setLoggingProject(String loggingProject) {
        this.loggingProject = loggingProject;
        return this;
    }
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static class LoggingLoggingDetails extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("type")
        public String type;

        public static LoggingLoggingDetails build(java.util.Map<String, ?> map) throws Exception {
            LoggingLoggingDetails self = new LoggingLoggingDetails();
            return TeaModel.build(map, self);
        }

        public LoggingLoggingDetails setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public LoggingLoggingDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

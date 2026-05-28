// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logging extends TeaModel {
    /**
     * <p>The settings of the service log feature.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<LoggingLoggingDetails> loggingDetails;

    /**
     * <p>The name of the project to which service logs are stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
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
         * <p>The logstore name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The type of the service logs. Valid values:</p>
         * <ul>
         * <li>consumergroup_log: the consumption delay logs of consumer groups.</li>
         * <li>logtail_alarm: the alert logs of Logtail.</li>
         * <li>operation_log: the operation logs. You are charged for operation logs.</li>
         * <li>logtail_profile: the collection logs of Logtail.</li>
         * <li>metering: the metering logs.</li>
         * <li>logtail_status: the status logs of Logtail.</li>
         * <li>scheduledsqlalert: the operational logs of scheduled SQL jobs.</li>
         * <li>etl_alert: the operational logs of data transformation jobs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumergroup_log</p>
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

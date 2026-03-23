// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Logging extends TeaModel {
    /**
     * <p>服务日志配置列表。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<LoggingLoggingDetails> loggingDetails;

    /**
     * <p>服务日志要保存到的Project名称。</p>
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
         * <p>Logstore名称。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>服务日志的种类。取值包括：</p>
         * <ul>
         * <li>consumergroup_log：消费组延迟日志</li>
         * <li>logtail_alarm：Logtail告警日志</li>
         * <li>operation_log：操作日志（此项服务收费）</li>
         * <li>logtail_profile：Logtail采集日志</li>
         * <li>metering：计量日志</li>
         * <li>logtail_status：Logtail状态日志</li>
         * <li>scheduledsqlalert：定时SQL任务运行日志</li>
         * <li>etl_alert：数据加工任务的运行日志</li>
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

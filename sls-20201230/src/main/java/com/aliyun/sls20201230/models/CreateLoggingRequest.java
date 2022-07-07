// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLoggingRequest extends TeaModel {
    // 服务日志配置列表。
    @NameInMap("loggingDetails")
    public java.util.List<CreateLoggingRequestLoggingDetails> loggingDetails;

    // 服务日志要保存到的 project 名称。
    @NameInMap("loggingProject")
    public String loggingProject;

    public static CreateLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoggingRequest self = new CreateLoggingRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoggingRequest setLoggingDetails(java.util.List<CreateLoggingRequestLoggingDetails> loggingDetails) {
        this.loggingDetails = loggingDetails;
        return this;
    }
    public java.util.List<CreateLoggingRequestLoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    public CreateLoggingRequest setLoggingProject(String loggingProject) {
        this.loggingProject = loggingProject;
        return this;
    }
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static class CreateLoggingRequestLoggingDetails extends TeaModel {
        // 该种类服务日志要保存到的 logstore 名称。
        @NameInMap("logstore")
        public String logstore;

        // 服务日志的种类。可选 "consumergroup_log"、 "logtail_alarm"、"operation_log"、"logtail_profile"、"metering"、"logtail_status"、"scheduled_sql_alert"、 "etl_alert" 等。
        @NameInMap("type")
        public String type;

        public static CreateLoggingRequestLoggingDetails build(java.util.Map<String, ?> map) throws Exception {
            CreateLoggingRequestLoggingDetails self = new CreateLoggingRequestLoggingDetails();
            return TeaModel.build(map, self);
        }

        public CreateLoggingRequestLoggingDetails setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateLoggingRequestLoggingDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

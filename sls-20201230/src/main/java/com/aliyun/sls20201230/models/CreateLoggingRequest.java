// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLoggingRequest extends TeaModel {
    /**
     * <p>The configurations of service logs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<CreateLoggingRequestLoggingDetails> loggingDetails;

    /**
     * <p>The name of the project to which service logs are stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
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
        /**
         * <p>The name of the Logstore to which service logs of the type are stored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The type of service logs. Valid values:</p>
         * <ul>
         * <li>consumergroup_log: the consumption delay logs of consumer groups.</li>
         * <li>logtail_alarm: the alert logs of Logtail.</li>
         * <li>operation_log: the operation logs.</li>
         * <li>logtail_profile: the collection logs of Logtail.</li>
         * <li>metering: the metering logs.</li>
         * <li>logtail_status: the status logs of Logtail.</li>
         * <li>scheduledsqlalert: the run logs of Scheduled SQL jobs.</li>
         * <li>etl_alert: the run logs of data transformation jobs.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumergroup_log</p>
         */
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

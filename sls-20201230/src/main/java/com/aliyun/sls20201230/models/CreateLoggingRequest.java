// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLoggingRequest extends TeaModel {
    /**
     * <p>The configurations of service logs.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<CreateLoggingRequestLoggingDetails> loggingDetails;

    /**
     * <p>The name of the project to which service logs are stored.</p>
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
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The type of service logs. Valid values:</p>
         * <br>
         * <p>*   consumergroup_log: the consumption delay logs of consumer groups.</p>
         * <p>*   logtail_alarm: the alert logs of Logtail.</p>
         * <p>*   operation_log: the operation logs.</p>
         * <p>*   logtail_profile: the collection logs of Logtail.</p>
         * <p>*   metering: the metering logs.</p>
         * <p>*   logtail_status: the status logs of Logtail.</p>
         * <p>*   scheduledsqlalert: the run logs of Scheduled SQL jobs.</p>
         * <p>*   etl_alert: the run logs of data transformation jobs.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLoggingRequest extends TeaModel {
    /**
     * <p>The configurations of service logs.</p>
     */
    @NameInMap("loggingDetails")
    public java.util.List<UpdateLoggingRequestLoggingDetails> loggingDetails;

    /**
     * <p>The name of the project to which you want to save service logs.</p>
     */
    @NameInMap("loggingProject")
    public String loggingProject;

    public static UpdateLoggingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoggingRequest self = new UpdateLoggingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoggingRequest setLoggingDetails(java.util.List<UpdateLoggingRequestLoggingDetails> loggingDetails) {
        this.loggingDetails = loggingDetails;
        return this;
    }
    public java.util.List<UpdateLoggingRequestLoggingDetails> getLoggingDetails() {
        return this.loggingDetails;
    }

    public UpdateLoggingRequest setLoggingProject(String loggingProject) {
        this.loggingProject = loggingProject;
        return this;
    }
    public String getLoggingProject() {
        return this.loggingProject;
    }

    public static class UpdateLoggingRequestLoggingDetails extends TeaModel {
        /**
         * <p>The name of the Logstore to which you want to save service logs.</p>
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
         * <p>*   scheduledsqlalert: the operational logs of Scheduled SQL jobs.</p>
         * <p>*   etl_alert: the operational logs of data transformation jobs.</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateLoggingRequestLoggingDetails build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoggingRequestLoggingDetails self = new UpdateLoggingRequestLoggingDetails();
            return TeaModel.build(map, self);
        }

        public UpdateLoggingRequestLoggingDetails setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateLoggingRequestLoggingDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

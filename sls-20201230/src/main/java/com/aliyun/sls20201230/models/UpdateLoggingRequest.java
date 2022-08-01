// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLoggingRequest extends TeaModel {
    @NameInMap("loggingDetails")
    public java.util.List<UpdateLoggingRequestLoggingDetails> loggingDetails;

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
        @NameInMap("logstore")
        public String logstore;

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

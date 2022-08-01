// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateLoggingRequest extends TeaModel {
    @NameInMap("loggingDetails")
    public java.util.List<CreateLoggingRequestLoggingDetails> loggingDetails;

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
        @NameInMap("logstore")
        public String logstore;

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

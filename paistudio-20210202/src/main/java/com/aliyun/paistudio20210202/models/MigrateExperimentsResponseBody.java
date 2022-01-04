// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MigrateExperimentsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateExperimentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateExperimentsResponseBody self = new MigrateExperimentsResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateExperimentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MigrateExperimentsResponseBody setData(MigrateExperimentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MigrateExperimentsResponseBodyData getData() {
        return this.data;
    }

    public MigrateExperimentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateExperimentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MigrateExperimentsResponseBodyData extends TeaModel {
        @NameInMap("AlreadyExists")
        public Boolean alreadyExists;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Updated")
        public Boolean updated;

        public static MigrateExperimentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MigrateExperimentsResponseBodyData self = new MigrateExperimentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MigrateExperimentsResponseBodyData setAlreadyExists(Boolean alreadyExists) {
            this.alreadyExists = alreadyExists;
            return this;
        }
        public Boolean getAlreadyExists() {
            return this.alreadyExists;
        }

        public MigrateExperimentsResponseBodyData setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public MigrateExperimentsResponseBodyData setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

    }

}

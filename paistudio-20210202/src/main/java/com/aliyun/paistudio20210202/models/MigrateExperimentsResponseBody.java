// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class MigrateExperimentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NO_PERMISSION</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MigrateExperimentsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>NotExistError</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E7C42CC7-2E85-508A-84F4-923B605FD10F</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AlreadyExists")
        public Boolean alreadyExists;

        /**
         * <strong>example:</strong>
         * <p>draft-8u3ck2or5pw2i4auhf</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBatchRepeatJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("JobGroup")
    public CreateBatchRepeatJobResponseBodyJobGroup jobGroup;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateBatchRepeatJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchRepeatJobResponseBody self = new CreateBatchRepeatJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchRepeatJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBatchRepeatJobResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBatchRepeatJobResponseBody setJobGroup(CreateBatchRepeatJobResponseBodyJobGroup jobGroup) {
        this.jobGroup = jobGroup;
        return this;
    }
    public CreateBatchRepeatJobResponseBodyJobGroup getJobGroup() {
        return this.jobGroup;
    }

    public CreateBatchRepeatJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBatchRepeatJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchRepeatJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBatchRepeatJobResponseBodyJobGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinConcurrency")
        public Long minConcurrency;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("RingingDuration")
        public Long ringingDuration;

        public static CreateBatchRepeatJobResponseBodyJobGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchRepeatJobResponseBodyJobGroup self = new CreateBatchRepeatJobResponseBodyJobGroup();
            return TeaModel.build(map, self);
        }

        public CreateBatchRepeatJobResponseBodyJobGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateBatchRepeatJobResponseBodyJobGroup setMinConcurrency(Long minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Long getMinConcurrency() {
            return this.minConcurrency;
        }

        public CreateBatchRepeatJobResponseBodyJobGroup setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateBatchRepeatJobResponseBodyJobGroup setRingingDuration(Long ringingDuration) {
            this.ringingDuration = ringingDuration;
            return this;
        }
        public Long getRingingDuration() {
            return this.ringingDuration;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class BatchDeleteJobsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether multiple jobs were deleted at a time. Valid values:</p>
     * <br>
     * <p>*   **true**: Multiple jobs were deleted at a time.</p>
     * <p>*   **false**: Multiple jobs were not deleted at a time.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchDeleteJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteJobsResponseBody self = new BatchDeleteJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BatchDeleteJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateImageEventOperationResponseBody extends TeaModel {
    /**
     * <p>The status code returned by the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public UpdateImageEventOperationResponseBodyData data;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the request response. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateImageEventOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageEventOperationResponseBody self = new UpdateImageEventOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageEventOperationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateImageEventOperationResponseBody setData(UpdateImageEventOperationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateImageEventOperationResponseBodyData getData() {
        return this.data;
    }

    public UpdateImageEventOperationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateImageEventOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateImageEventOperationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateImageEventOperationResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the alert handling rule, which is the same as the alert handling rule ID in the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>67429</p>
         */
        @NameInMap("Id")
        public Long id;

        public static UpdateImageEventOperationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageEventOperationResponseBodyData self = new UpdateImageEventOperationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateImageEventOperationResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

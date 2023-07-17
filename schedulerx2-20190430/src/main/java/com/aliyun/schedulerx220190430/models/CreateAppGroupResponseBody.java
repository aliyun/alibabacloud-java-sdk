// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the job group.</p>
     */
    @NameInMap("Data")
    public CreateAppGroupResponseBodyData data;

    /**
     * <p>The error message that is returned only if the corresponding error occurs.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application was created. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAppGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponseBody self = new CreateAppGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAppGroupResponseBody setData(CreateAppGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateAppGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAppGroupResponseBodyData extends TeaModel {
        /**
         * <p>The job group ID.</p>
         */
        @NameInMap("AppGroupId")
        public Long appGroupId;

        /**
         * <p>The AppKey for the application.</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        public static CreateAppGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppGroupResponseBodyData self = new CreateAppGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppGroupResponseBodyData setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        public CreateAppGroupResponseBodyData setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

    }

}

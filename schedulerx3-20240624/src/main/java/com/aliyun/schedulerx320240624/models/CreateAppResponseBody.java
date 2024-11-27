// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateAppResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponseBody self = new CreateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAppResponseBody setData(CreateAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppResponseBodyData getData() {
        return this.data;
    }

    public CreateAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAppResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4a0fae835cd741f3b12376d8a5a8e549v3</p>
         */
        @NameInMap("AccessToken")
        public String accessToken;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AppGroupId")
        public Long appGroupId;

        public static CreateAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppResponseBodyData self = new CreateAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppResponseBodyData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public CreateAppResponseBodyData setAppGroupId(Long appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Long getAppGroupId() {
            return this.appGroupId;
        }

    }

}

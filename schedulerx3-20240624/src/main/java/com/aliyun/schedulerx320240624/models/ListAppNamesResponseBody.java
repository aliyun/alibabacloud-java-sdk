// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAppNamesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppNamesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3881C59F-59F1-5B2E-8110-7D689CA9B207</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppNamesResponseBody self = new ListAppNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppNamesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppNamesResponseBody setData(java.util.List<ListAppNamesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppNamesResponseBodyData> getData() {
        return this.data;
    }

    public ListAppNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppNamesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppGroupId")
        public String appGroupId;

        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Title")
        public String title;

        public static ListAppNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppNamesResponseBodyData self = new ListAppNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppNamesResponseBodyData setAppGroupId(String appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public String getAppGroupId() {
            return this.appGroupId;
        }

        public ListAppNamesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppNamesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppNamesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

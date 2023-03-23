// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the versions.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppVersionsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the historical versions of the application were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the historical versions of the application were obtained.</p>
     * <p>*   **false**: indicates that the historical versions of the application could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionsResponseBody self = new ListAppVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionsResponseBody setData(java.util.List<ListAppVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppVersionsResponseBodyData> getData() {
        return this.data;
    }

    public ListAppVersionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAppVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppVersionsResponseBodyData extends TeaModel {
        /**
         * <p>The download link of the WAR or JAR package. This parameter is returned when the **Type** parameter is set to **url**.</p>
         */
        @NameInMap("BuildPackageUrl")
        public String buildPackageUrl;

        /**
         * <p>The time when the application was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the version.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The deployment method of the application. Valid values:</p>
         * <br>
         * <p>*   **image**: indicates that the application was deployed by using an image.</p>
         * <p>*   **upload**: indicates that the application was deployed by uploading a WAR or JAR package.</p>
         * <p>*   **url**: indicates that the application was deployed by specifying the URL of a WAR or JAR package.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>*   The address of the image. This parameter is returned when the **Type** parameter is set to **image**.</p>
         * <p>*   The download link of the WAR or JAR package. This parameter is returned when the **Type** parameter is set to **upload**.</p>
         */
        @NameInMap("WarUrl")
        public String warUrl;

        public static ListAppVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionsResponseBodyData self = new ListAppVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppVersionsResponseBodyData setBuildPackageUrl(String buildPackageUrl) {
            this.buildPackageUrl = buildPackageUrl;
            return this;
        }
        public String getBuildPackageUrl() {
            return this.buildPackageUrl;
        }

        public ListAppVersionsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppVersionsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAppVersionsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAppVersionsResponseBodyData setWarUrl(String warUrl) {
            this.warUrl = warUrl;
            return this;
        }
        public String getWarUrl() {
            return this.warUrl;
        }

    }

}

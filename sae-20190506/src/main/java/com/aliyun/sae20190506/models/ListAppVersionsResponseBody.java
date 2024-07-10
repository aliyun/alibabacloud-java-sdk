// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the historical versions of the application were obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: indicates that the historical versions of the application were obtained.</li>
     * <li><strong>false</strong>: indicates that the historical versions of the application could not be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The deployment method of the application. Valid values:</p>
     * <ul>
     * <li><strong>image</strong>: indicates that the application was deployed by using an image.</li>
     * <li><strong>upload</strong>: indicates that the application was deployed by uploading a WAR or JAR package.</li>
     * <li><strong>url</strong>: indicates that the application was deployed by specifying the URL of a WAR or JAR package.</li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListAppVersionsResponseBodyData> data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: indicates that the request was successful.</li>
     * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
     * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
     * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about the versions.</p>
     * 
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li>The address of the image. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>image</strong>.</li>
         * <li>The download link of the WAR or JAR package. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>upload</strong>.</li>
         * </ul>
         */
        @NameInMap("BuildPackageUrl")
        public String buildPackageUrl;

        /**
         * <p>The download link of the WAR or JAR package. This parameter is returned when the <strong>Type</strong> parameter is set to <strong>url</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1590124643553</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a0ce266c-d354-423a-9bd6-4083405a****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the version.</p>
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

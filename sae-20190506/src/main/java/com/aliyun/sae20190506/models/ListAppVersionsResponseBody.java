// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListAppVersionsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The call is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The call is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The version information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppVersionsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>This parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the historical versions of the application were successfully queried. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The query was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The query failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The download URL of the code package. If you uploaded the package using SAE, note the following:</p>
         * <ul>
         * <li><p>This URL is not a direct download link. You must call the GetPackageVersionAccessableUrl operation to obtain a downloadable URL that is valid for 10 minutes.</p>
         * </li>
         * <li><p>SAE stores the package for a maximum of 90 days. After this period, the URL is not returned and the package cannot be downloaded.</p>
         * </li>
         * </ul>
         */
        @NameInMap("BuildPackageUrl")
        public String buildPackageUrl;

        /**
         * <p>The time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1590124643553</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a0ce266c-d354-423a-9bd6-4083405a****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li><p><strong>image</strong>: The application is deployed using an image.</p>
         * </li>
         * <li><p><strong>url</strong>: The application is deployed using a code package.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the WAR package.</p>
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

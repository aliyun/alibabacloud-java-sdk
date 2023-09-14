// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **200**: success</p>
     * <p>*   **400**: client error</p>
     * <p>*   **401**: identity authentication failed</p>
     * <p>*   **404**: request page not found</p>
     * <p>*   **500**: server error</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DetachWhitelistTemplateToInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <br>
     * <p>*   **200**: success</p>
     * <p>*   **400**: client error</p>
     * <p>*   **500**: server error</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DetachWhitelistTemplateToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachWhitelistTemplateToInstanceResponseBody self = new DetachWhitelistTemplateToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachWhitelistTemplateToInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setData(DetachWhitelistTemplateToInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetachWhitelistTemplateToInstanceResponseBodyData getData() {
        return this.data;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachWhitelistTemplateToInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetachWhitelistTemplateToInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The status code returned. Valid values:</p>
         * <br>
         * <p>*   **ok**: The request is successful.</p>
         * <p>*   **error**: The request fails.</p>
         */
        @NameInMap("Status")
        public String status;

        public static DetachWhitelistTemplateToInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetachWhitelistTemplateToInstanceResponseBodyData self = new DetachWhitelistTemplateToInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetachWhitelistTemplateToInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyWhitelistTemplateResponseBody extends TeaModel {
    /**
     * <p>The response code returned. Valid values:</p>
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
    public ModifyWhitelistTemplateResponseBodyData data;

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
     * <p>The returned message.</p>
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

    public static ModifyWhitelistTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyWhitelistTemplateResponseBody self = new ModifyWhitelistTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyWhitelistTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyWhitelistTemplateResponseBody setData(ModifyWhitelistTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyWhitelistTemplateResponseBodyData getData() {
        return this.data;
    }

    public ModifyWhitelistTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyWhitelistTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyWhitelistTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyWhitelistTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyWhitelistTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The status code returned. Valid values:</p>
         * <br>
         * <p>*   **ok**: The request is successful.</p>
         * <p>*   **error**: The request fails.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ModifyWhitelistTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyWhitelistTemplateResponseBodyData self = new ModifyWhitelistTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyWhitelistTemplateResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

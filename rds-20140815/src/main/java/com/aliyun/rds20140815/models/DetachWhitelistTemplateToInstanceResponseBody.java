// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Normal.</li>
     * <li><strong>400</strong>: Client fault.</li>
     * <li><strong>401</strong>: Failed to authenticate.</li>
     * <li><strong>404</strong>: The requested page is not found.</li>
     * <li><strong>500</strong>: Server fault.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("Data")
    public DetachWhitelistTemplateToInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: Successful.</li>
     * <li><strong>400</strong>: Client error.</li>
     * <li><strong>500</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>224DB9F7-3100-4899-AB9C-C938BCCB43E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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
         * <p>The returned status. Valid values:</p>
         * <ul>
         * <li><strong>ok</strong>: Successful.</li>
         * <li><strong>error</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
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

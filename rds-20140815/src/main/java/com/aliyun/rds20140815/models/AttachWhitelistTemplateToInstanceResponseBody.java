// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    /**
     * <p>The response code returned. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: success</li>
     * <li><strong>400</strong>: client error</li>
     * <li><strong>401</strong>: identity authentication failed</li>
     * <li><strong>404</strong>: request page not found</li>
     * <li><strong>500</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public AttachWhitelistTemplateToInstanceResponseBodyData data;

    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <ul>
     * <li><strong>200</strong>: success</li>
     * <li><strong>400</strong>: client error</li>
     * <li><strong>500</strong>: server error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
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
     * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AttachWhitelistTemplateToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachWhitelistTemplateToInstanceResponseBody self = new AttachWhitelistTemplateToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachWhitelistTemplateToInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setData(AttachWhitelistTemplateToInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AttachWhitelistTemplateToInstanceResponseBodyData getData() {
        return this.data;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachWhitelistTemplateToInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AttachWhitelistTemplateToInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The status code returned. Valid values:</p>
         * <ul>
         * <li><strong>ok</strong>: The request is successful.</li>
         * <li><strong>error</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        public static AttachWhitelistTemplateToInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AttachWhitelistTemplateToInstanceResponseBodyData self = new AttachWhitelistTemplateToInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AttachWhitelistTemplateToInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}

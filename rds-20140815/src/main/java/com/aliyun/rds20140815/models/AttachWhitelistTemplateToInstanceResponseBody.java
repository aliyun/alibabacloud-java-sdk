// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachWhitelistTemplateToInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AttachWhitelistTemplateToInstanceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

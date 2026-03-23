// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyWhitelistTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ModifyWhitelistTemplateResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetSensitiveDefineRuleConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetSensitiveDefineRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSensitiveDefineRuleConfigResponseBody self = new SetSensitiveDefineRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSensitiveDefineRuleConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetSensitiveDefineRuleConfigResponseBody setData(SetSensitiveDefineRuleConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetSensitiveDefineRuleConfigResponseBodyData getData() {
        return this.data;
    }

    public SetSensitiveDefineRuleConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetSensitiveDefineRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSensitiveDefineRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetSensitiveDefineRuleConfigResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static SetSensitiveDefineRuleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetSensitiveDefineRuleConfigResponseBodyData self = new SetSensitiveDefineRuleConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetSensitiveDefineRuleConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

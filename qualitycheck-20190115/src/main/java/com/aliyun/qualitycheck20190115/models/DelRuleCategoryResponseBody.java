// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelRuleCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DelRuleCategoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DelRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelRuleCategoryResponseBody self = new DelRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DelRuleCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DelRuleCategoryResponseBody setData(DelRuleCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DelRuleCategoryResponseBodyData getData() {
        return this.data;
    }

    public DelRuleCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DelRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelRuleCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DelRuleCategoryResponseBodyData extends TeaModel {
        @NameInMap("Select")
        public Boolean select;

        public static DelRuleCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DelRuleCategoryResponseBodyData self = new DelRuleCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DelRuleCategoryResponseBodyData setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

    }

}

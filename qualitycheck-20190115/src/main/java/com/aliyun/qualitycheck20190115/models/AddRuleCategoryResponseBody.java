// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleCategoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AddRuleCategoryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRuleCategoryResponseBody self = new AddRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRuleCategoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddRuleCategoryResponseBody setData(AddRuleCategoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddRuleCategoryResponseBodyData getData() {
        return this.data;
    }

    public AddRuleCategoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddRuleCategoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddRuleCategoryResponseBodyData extends TeaModel {
        @NameInMap("Select")
        public Boolean select;

        public static AddRuleCategoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddRuleCategoryResponseBodyData self = new AddRuleCategoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddRuleCategoryResponseBodyData setSelect(Boolean select) {
            this.select = select;
            return this;
        }
        public Boolean getSelect() {
            return this.select;
        }

    }

}

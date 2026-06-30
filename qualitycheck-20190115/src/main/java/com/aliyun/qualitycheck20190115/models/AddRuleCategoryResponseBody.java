// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleCategoryResponseBody extends TeaModel {
    /**
     * <p>Response code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return Result</p>
     */
    @NameInMap("Data")
    public AddRuleCategoryResponseBodyData data;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D10B9203-1A6A-49DA-AE56-4D160DD37DBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether the newly added rule category is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Select")
        public Boolean select;

        /**
         * <p>Rule category ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

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

        public AddRuleCategoryResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public SetSensitiveDefineRuleConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
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
        /**
         * <p>The custom primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>44616</p>
         */
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

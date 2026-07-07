// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateContactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateContactResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2C3E52FF-CBE9-5C0E-8252-37ACFF1F5EFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContactResponseBody self = new CreateContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContactResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateContactResponseBody setData(CreateContactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateContactResponseBodyData getData() {
        return this.data;
    }

    public CreateContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateContactResponseBodyData extends TeaModel {
        /**
         * <p>新建联系人的 id，后续 Update/Delete 时使用</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        public static CreateContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateContactResponseBodyData self = new CreateContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateContactResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

    }

}

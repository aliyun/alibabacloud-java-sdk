// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateContactResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateContactResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C3E52FF-CBE9-5C0E-8252-37ACFF1F5EFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
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
         * <p>The contact ID.</p>
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

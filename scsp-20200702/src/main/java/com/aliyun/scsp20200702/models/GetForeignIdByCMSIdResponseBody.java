// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetForeignIdByCMSIdResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetForeignIdByCMSIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetForeignIdByCMSIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetForeignIdByCMSIdResponseBody self = new GetForeignIdByCMSIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetForeignIdByCMSIdResponseBody setData(GetForeignIdByCMSIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetForeignIdByCMSIdResponseBodyData getData() {
        return this.data;
    }

    public GetForeignIdByCMSIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetForeignIdByCMSIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetForeignIdByCMSIdResponseBodyData extends TeaModel {
        @NameInMap("Anonymity")
        public Boolean anonymity;

        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Code")
        public String code;

        @NameInMap("CustomerTypeId")
        public Integer customerTypeId;

        @NameInMap("ForeignId")
        public String foreignId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("UserId")
        public String userId;

        public static GetForeignIdByCMSIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetForeignIdByCMSIdResponseBodyData self = new GetForeignIdByCMSIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetForeignIdByCMSIdResponseBodyData setAnonymity(Boolean anonymity) {
            this.anonymity = anonymity;
            return this;
        }
        public Boolean getAnonymity() {
            return this.anonymity;
        }

        public GetForeignIdByCMSIdResponseBodyData setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetForeignIdByCMSIdResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetForeignIdByCMSIdResponseBodyData setCustomerTypeId(Integer customerTypeId) {
            this.customerTypeId = customerTypeId;
            return this;
        }
        public Integer getCustomerTypeId() {
            return this.customerTypeId;
        }

        public GetForeignIdByCMSIdResponseBodyData setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public GetForeignIdByCMSIdResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetForeignIdByCMSIdResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetForeignIdByCMSIdResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetForeignIdByCMSIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetForeignIdByCMSIdResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetForeignIdByCMSIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

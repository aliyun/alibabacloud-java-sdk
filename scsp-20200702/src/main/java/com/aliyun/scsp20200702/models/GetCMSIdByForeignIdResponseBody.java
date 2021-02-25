// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetCMSIdByForeignIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetCMSIdByForeignIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetCMSIdByForeignIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCMSIdByForeignIdResponseBody self = new GetCMSIdByForeignIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCMSIdByForeignIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCMSIdByForeignIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCMSIdByForeignIdResponseBody setData(GetCMSIdByForeignIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCMSIdByForeignIdResponseBodyData getData() {
        return this.data;
    }

    public GetCMSIdByForeignIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCMSIdByForeignIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCMSIdByForeignIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CustomerTypeId")
        public Integer customerTypeId;

        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("ForeignId")
        public String foreignId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Nick")
        public String nick;

        @NameInMap("Anonymity")
        public Boolean anonymity;

        @NameInMap("Phone")
        public String phone;

        public static GetCMSIdByForeignIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCMSIdByForeignIdResponseBodyData self = new GetCMSIdByForeignIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCMSIdByForeignIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetCMSIdByForeignIdResponseBodyData setCustomerTypeId(Integer customerTypeId) {
            this.customerTypeId = customerTypeId;
            return this;
        }
        public Integer getCustomerTypeId() {
            return this.customerTypeId;
        }

        public GetCMSIdByForeignIdResponseBodyData setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public GetCMSIdByForeignIdResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetCMSIdByForeignIdResponseBodyData setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public GetCMSIdByForeignIdResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetCMSIdByForeignIdResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetCMSIdByForeignIdResponseBodyData setAnonymity(Boolean anonymity) {
            this.anonymity = anonymity;
            return this;
        }
        public Boolean getAnonymity() {
            return this.anonymity;
        }

        public GetCMSIdByForeignIdResponseBodyData setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

}

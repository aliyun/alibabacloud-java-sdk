// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetUserByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUserByIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserByIdResponseBody self = new GetUserByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserByIdResponseBody setData(GetUserByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserByIdResponseBodyData getData() {
        return this.data;
    }

    public GetUserByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserByIdResponseBodyData extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("extraInfo")
        public String extraInfo;

        @NameInMap("foreignId")
        public String foreignId;

        @NameInMap("id")
        public Long id;

        @NameInMap("nick")
        public String nick;

        @NameInMap("sourceId")
        public Long sourceId;

        @NameInMap("telephone")
        public String telephone;

        @NameInMap("type")
        public Long type;

        public static GetUserByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserByIdResponseBodyData self = new GetUserByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserByIdResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserByIdResponseBodyData setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetUserByIdResponseBodyData setForeignId(String foreignId) {
            this.foreignId = foreignId;
            return this;
        }
        public String getForeignId() {
            return this.foreignId;
        }

        public GetUserByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetUserByIdResponseBodyData setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public GetUserByIdResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetUserByIdResponseBodyData setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public GetUserByIdResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class LabelPartnerUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LabelPartnerUserResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static LabelPartnerUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LabelPartnerUserResponseBody self = new LabelPartnerUserResponseBody();
        return TeaModel.build(map, self);
    }

    public LabelPartnerUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LabelPartnerUserResponseBody setData(LabelPartnerUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LabelPartnerUserResponseBodyData getData() {
        return this.data;
    }

    public LabelPartnerUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LabelPartnerUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LabelPartnerUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LabelPartnerUserResponseBodyData extends TeaModel {
        @NameInMap("UserPK")
        public Long userPK;

        @NameInMap("UserTag")
        public String userTag;

        public static LabelPartnerUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LabelPartnerUserResponseBodyData self = new LabelPartnerUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LabelPartnerUserResponseBodyData setUserPK(Long userPK) {
            this.userPK = userPK;
            return this;
        }
        public Long getUserPK() {
            return this.userPK;
        }

        public LabelPartnerUserResponseBodyData setUserTag(String userTag) {
            this.userTag = userTag;
            return this;
        }
        public String getUserTag() {
            return this.userTag;
        }

    }

}

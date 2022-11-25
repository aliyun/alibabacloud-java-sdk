// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class GetUserInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetUserInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoResponseBody self = new GetUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInfoResponseBody setData(GetUserInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserInfoResponseBodyData getData() {
        return this.data;
    }

    public GetUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserInfoResponseBodyData extends TeaModel {
        @NameInMap("ParentUid")
        public String parentUid;

        @NameInMap("UserType")
        public String userType;

        public static GetUserInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserInfoResponseBodyData self = new GetUserInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserInfoResponseBodyData setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public GetUserInfoResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}

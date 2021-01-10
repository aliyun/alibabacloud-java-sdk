// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSUsersResponseBodyData data;

    public static GetDWSUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSUsersResponseBody self = new GetDWSUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSUsersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSUsersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSUsersResponseBody setData(GetDWSUsersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSUsersResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSUsersResponseBodyData extends TeaModel {
        @NameInMap("RealName")
        public String realName;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static GetDWSUsersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSUsersResponseBodyData self = new GetDWSUsersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSUsersResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetDWSUsersResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public GetDWSUsersResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UserList")
    public java.util.List<ListClriskUsersResponseBodyUserList> userList;

    public static ListClriskUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskUsersResponseBody self = new ListClriskUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskUsersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskUsersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskUsersResponseBody setUserList(java.util.List<ListClriskUsersResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<ListClriskUsersResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class ListClriskUsersResponseBodyUserList extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("OriginId")
        public String originId;

        @NameInMap("Type")
        public String type;

        public static ListClriskUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskUsersResponseBodyUserList self = new ListClriskUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListClriskUsersResponseBodyUserList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListClriskUsersResponseBodyUserList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public ListClriskUsersResponseBodyUserList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListClriskUsersResponseBodyUserList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListClriskUsersResponseBodyUserList setOriginId(String originId) {
            this.originId = originId;
            return this;
        }
        public String getOriginId() {
            return this.originId;
        }

        public ListClriskUsersResponseBodyUserList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

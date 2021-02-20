// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcUserListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserList")
    public DescribeRtcUserListResponseBodyUserList userList;

    public static DescribeRtcUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcUserListResponseBody self = new DescribeRtcUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcUserListResponseBody setUserList(DescribeRtcUserListResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public DescribeRtcUserListResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class DescribeRtcUserListResponseBodyUserListUserList extends TeaModel {
        @NameInMap("User")
        public String user;

        public static DescribeRtcUserListResponseBodyUserListUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserListResponseBodyUserListUserList self = new DescribeRtcUserListResponseBodyUserListUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserListResponseBodyUserListUserList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class DescribeRtcUserListResponseBodyUserList extends TeaModel {
        @NameInMap("UserList")
        public java.util.List<DescribeRtcUserListResponseBodyUserListUserList> userList;

        public static DescribeRtcUserListResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcUserListResponseBodyUserList self = new DescribeRtcUserListResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcUserListResponseBodyUserList setUserList(java.util.List<DescribeRtcUserListResponseBodyUserListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<DescribeRtcUserListResponseBodyUserListUserList> getUserList() {
            return this.userList;
        }

    }

}

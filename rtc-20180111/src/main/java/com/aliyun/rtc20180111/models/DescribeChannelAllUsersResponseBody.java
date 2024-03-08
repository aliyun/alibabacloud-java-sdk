// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAllUsersResponseBody extends TeaModel {
    @NameInMap("ChannelExist")
    public Boolean channelExist;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<DescribeChannelAllUsersResponseBodyUsers> users;

    public static DescribeChannelAllUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAllUsersResponseBody self = new DescribeChannelAllUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAllUsersResponseBody setChannelExist(Boolean channelExist) {
        this.channelExist = channelExist;
        return this;
    }
    public Boolean getChannelExist() {
        return this.channelExist;
    }

    public DescribeChannelAllUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelAllUsersResponseBody setUsers(java.util.List<DescribeChannelAllUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<DescribeChannelAllUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class DescribeChannelAllUsersResponseBodyUsers extends TeaModel {
        @NameInMap("UserId")
        public String userId;

        public static DescribeChannelAllUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelAllUsersResponseBodyUsers self = new DescribeChannelAllUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeChannelAllUsersResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

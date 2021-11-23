// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelParticipantsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Timestamp")
    public Integer timestamp;

    @NameInMap("TotalNum")
    public Integer totalNum;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("UserList")
    public DescribeChannelParticipantsResponseBodyUserList userList;

    public static DescribeChannelParticipantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelParticipantsResponseBody self = new DescribeChannelParticipantsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelParticipantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelParticipantsResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public DescribeChannelParticipantsResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeChannelParticipantsResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeChannelParticipantsResponseBody setUserList(DescribeChannelParticipantsResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public DescribeChannelParticipantsResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class DescribeChannelParticipantsResponseBodyUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<String> user;

        public static DescribeChannelParticipantsResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelParticipantsResponseBodyUserList self = new DescribeChannelParticipantsResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeChannelParticipantsResponseBodyUserList setUser(java.util.List<String> user) {
            this.user = user;
            return this;
        }
        public java.util.List<String> getUser() {
            return this.user;
        }

    }

}

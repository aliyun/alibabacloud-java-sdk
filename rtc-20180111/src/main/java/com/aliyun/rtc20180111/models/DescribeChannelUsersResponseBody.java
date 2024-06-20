// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelProfile")
    public Integer channelProfile;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CommTotalNum")
    public Integer commTotalNum;

    @NameInMap("InteractiveUserList")
    public java.util.List<String> interactiveUserList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InteractiveUserNum")
    public Integer interactiveUserNum;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsChannelExist")
    public Boolean isChannelExist;

    @NameInMap("LiveUserList")
    public java.util.List<String> liveUserList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LiveUserNum")
    public Integer liveUserNum;

    /**
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1557909133</p>
     */
    @NameInMap("Timestamp")
    public Integer timestamp;

    @NameInMap("UserList")
    public java.util.List<String> userList;

    public static DescribeChannelUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUsersResponseBody self = new DescribeChannelUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUsersResponseBody setChannelProfile(Integer channelProfile) {
        this.channelProfile = channelProfile;
        return this;
    }
    public Integer getChannelProfile() {
        return this.channelProfile;
    }

    public DescribeChannelUsersResponseBody setCommTotalNum(Integer commTotalNum) {
        this.commTotalNum = commTotalNum;
        return this;
    }
    public Integer getCommTotalNum() {
        return this.commTotalNum;
    }

    public DescribeChannelUsersResponseBody setInteractiveUserList(java.util.List<String> interactiveUserList) {
        this.interactiveUserList = interactiveUserList;
        return this;
    }
    public java.util.List<String> getInteractiveUserList() {
        return this.interactiveUserList;
    }

    public DescribeChannelUsersResponseBody setInteractiveUserNum(Integer interactiveUserNum) {
        this.interactiveUserNum = interactiveUserNum;
        return this;
    }
    public Integer getInteractiveUserNum() {
        return this.interactiveUserNum;
    }

    public DescribeChannelUsersResponseBody setIsChannelExist(Boolean isChannelExist) {
        this.isChannelExist = isChannelExist;
        return this;
    }
    public Boolean getIsChannelExist() {
        return this.isChannelExist;
    }

    public DescribeChannelUsersResponseBody setLiveUserList(java.util.List<String> liveUserList) {
        this.liveUserList = liveUserList;
        return this;
    }
    public java.util.List<String> getLiveUserList() {
        return this.liveUserList;
    }

    public DescribeChannelUsersResponseBody setLiveUserNum(Integer liveUserNum) {
        this.liveUserNum = liveUserNum;
        return this;
    }
    public Integer getLiveUserNum() {
        return this.liveUserNum;
    }

    public DescribeChannelUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelUsersResponseBody setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Integer getTimestamp() {
        return this.timestamp;
    }

    public DescribeChannelUsersResponseBody setUserList(java.util.List<String> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<String> getUserList() {
        return this.userList;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUsersResponseBody extends TeaModel {
    /**
     * <p>The channel mode. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Communication (communication mode).</p>
     * </li>
     * <li><p><strong>2</strong>: Interactive_live (live streaming mode).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelProfile")
    public Integer channelProfile;

    /**
     * <p>The total number of users in the channel in communication mode. If the channel is not in communication mode, this parameter is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("CommTotalNum")
    public Integer commTotalNum;

    /**
     * <p>The list of interactive user IDs in the channel in live streaming mode. This parameter is empty if the channel is not in live streaming mode.</p>
     */
    @NameInMap("InteractiveUserList")
    public java.util.List<String> interactiveUserList;

    /**
     * <p>The total number of interactive users in the channel in live streaming mode. If the channel is not in live streaming mode, this parameter is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InteractiveUserNum")
    public Integer interactiveUserNum;

    /**
     * <p>Indicates whether the channel exists. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The channel exists.</p>
     * </li>
     * <li><p><strong>false</strong>: The channel does not exist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsChannelExist")
    public Boolean isChannelExist;

    /**
     * <p>The list of viewer IDs in the channel in live streaming mode. A maximum of 1,000 viewers are returned. This parameter is empty if the channel is not in live streaming mode.</p>
     */
    @NameInMap("LiveUserList")
    public java.util.List<String> liveUserList;

    /**
     * <p>The total number of viewers in the channel in live streaming mode. If the channel is not in live streaming mode, this parameter is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LiveUserNum")
    public Integer liveUserNum;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6159ba01-6687-4fb2-a831-f0cd8d188648</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timestamp of the current time in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1557909133</p>
     */
    @NameInMap("Timestamp")
    public Integer timestamp;

    /**
     * <p>The list of user IDs in the channel in communication mode. This parameter is empty if the channel is not in communication mode.</p>
     */
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

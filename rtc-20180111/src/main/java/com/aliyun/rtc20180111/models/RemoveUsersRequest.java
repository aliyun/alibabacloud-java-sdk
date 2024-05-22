// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RemoveUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Users")
    public java.util.List<RemoveUsersRequestUsers> users;

    public static RemoveUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersRequest self = new RemoveUsersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RemoveUsersRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RemoveUsersRequest setUsers(java.util.List<RemoveUsersRequestUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<RemoveUsersRequestUsers> getUsers() {
        return this.users;
    }

    public static class RemoveUsersRequestUsers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static RemoveUsersRequestUsers build(java.util.Map<String, ?> map) throws Exception {
            RemoveUsersRequestUsers self = new RemoveUsersRequestUsers();
            return TeaModel.build(map, self);
        }

        public RemoveUsersRequestUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

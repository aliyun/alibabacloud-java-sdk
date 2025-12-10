// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsUsersStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F082BD0D-21E1-5F9B-81A0-AB07485B03CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<GetExperimentsUsersStatisticsResponseBodyUsers> users;

    public static GetExperimentsUsersStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsUsersStatisticsResponseBody self = new GetExperimentsUsersStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentsUsersStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentsUsersStatisticsResponseBody setUsers(java.util.List<GetExperimentsUsersStatisticsResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<GetExperimentsUsersStatisticsResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class GetExperimentsUsersStatisticsResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345******67890</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetExperimentsUsersStatisticsResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentsUsersStatisticsResponseBodyUsers self = new GetExperimentsUsersStatisticsResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public GetExperimentsUsersStatisticsResponseBodyUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the host group that you want to query.</p>
     * <br>
     * <p>>  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroup")
    public GetHostGroupResponseBodyHostGroup hostGroup;

    /**
     * <p>my host group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupResponseBody self = new GetHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostGroupResponseBody setHostGroup(GetHostGroupResponseBodyHostGroup hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public GetHostGroupResponseBodyHostGroup getHostGroup() {
        return this.hostGroup;
    }

    public GetHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHostGroupResponseBodyHostGroup extends TeaModel {
        /**
         * <p>The details of the host group returned.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The description of the host group.</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The ID of the host group.</p>
         */
        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static GetHostGroupResponseBodyHostGroup build(java.util.Map<String, ?> map) throws Exception {
            GetHostGroupResponseBodyHostGroup self = new GetHostGroupResponseBodyHostGroup();
            return TeaModel.build(map, self);
        }

        public GetHostGroupResponseBodyHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetHostGroupResponseBodyHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public GetHostGroupResponseBodyHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

}

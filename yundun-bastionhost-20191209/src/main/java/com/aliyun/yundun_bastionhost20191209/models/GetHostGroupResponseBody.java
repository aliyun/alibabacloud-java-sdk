// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostGroupResponseBody extends TeaModel {
    /**
     * <p>The returned detailed information about the asset group.</p>
     */
    @NameInMap("HostGroup")
    public GetHostGroupResponseBodyHostGroup hostGroup;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
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
         * <p>The remarks of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The asset group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HostGroupId")
        public String hostGroupId;

        /**
         * <p>The name of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>Host group 1</p>
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

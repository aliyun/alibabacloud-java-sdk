// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the RAM user group.</p>
     */
    @NameInMap("Group")
    public GetGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D4065824-E422-3ED6-68B1-1AF7D5C7804C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponseBody self = new GetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupResponseBody setGroup(GetGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public GetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The description of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The time when the RAM user group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The ID of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>g-FpMEHiMysofp****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-02-11T03:15:21Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static GetGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyGroup self = new GetGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetGroupResponseBodyGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGroupResponseBodyGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}

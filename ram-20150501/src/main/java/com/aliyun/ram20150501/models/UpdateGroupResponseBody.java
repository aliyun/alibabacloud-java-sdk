// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the RAM user group.</p>
     */
    @NameInMap("Group")
    public UpdateGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC6647CC-0A36-EC7A-BA72-CC81BF3DE182</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponseBody self = new UpdateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponseBody setGroup(UpdateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public UpdateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public UpdateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>NewDev-Team</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The creation time.</p>
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
         * <p>NewDev-Team</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-01-23T12:33:18Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseBodyGroup self = new UpdateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseBodyGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public UpdateGroupResponseBodyGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGroupResponseBodyGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}

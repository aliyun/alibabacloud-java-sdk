// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    @NameInMap("Group")
    public CreateGroupResponseBodyGroup group;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGroup(CreateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public CreateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGroupResponseBodyGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("CreateDate")
        public String createDate;

        public static CreateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyGroup self = new CreateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGroupResponseBodyGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public CreateGroupResponseBodyGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public CreateGroupResponseGroup group;

    public static CreateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponse self = new CreateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateGroupResponseGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static CreateGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseGroup self = new CreateGroupResponseGroup();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public UpdateGroupResponseGroup group;

    public static UpdateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponse self = new UpdateGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class UpdateGroupResponseGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        public static UpdateGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseGroup self = new UpdateGroupResponseGroup();
            return TeaModel.build(map, self);
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public GetGroupResponseGroup group;

    public static GetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponse self = new GetGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class GetGroupResponseGroup extends TeaModel {
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

        public static GetGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseGroup self = new GetGroupResponseGroup();
            return TeaModel.build(map, self);
        }

    }

}

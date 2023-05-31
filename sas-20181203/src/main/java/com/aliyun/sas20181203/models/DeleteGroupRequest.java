// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    /**
     * <p>The ID of the server group that you want to delete.</p>
     * <br>
     * <p>>  To delete a server group, you must provide the ID of the server group. You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the ID.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupRequest self = new DeleteGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

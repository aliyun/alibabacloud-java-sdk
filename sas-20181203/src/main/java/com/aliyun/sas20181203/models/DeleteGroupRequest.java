// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    /**
     * <p>WB01014029</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>DeleteGroup</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     * <p>If you want to query the name of a RAM user group, you can call the <a href="https://help.aliyun.com/document_detail/28703.html">ListGroups</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Dev-Team</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static DeleteGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupRequest self = new DeleteGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleWorkforce extends TeaModel {
    /**
     * <p>List of personnel information.</p>
     */
    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    /**
     * <p>Node ID. For more information, see <a href="https://help.aliyun.com/document_detail/454697.html">GetTaskWorkforce</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("WorkNodeId")
    public Integer workNodeId;

    public static SimpleWorkforce build(java.util.Map<String, ?> map) throws Exception {
        SimpleWorkforce self = new SimpleWorkforce();
        return TeaModel.build(map, self);
    }

    public SimpleWorkforce setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public SimpleWorkforce setWorkNodeId(Integer workNodeId) {
        this.workNodeId = workNodeId;
        return this;
    }
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

}

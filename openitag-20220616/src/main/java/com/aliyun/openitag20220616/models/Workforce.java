// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class Workforce extends TeaModel {
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("Users")
    public java.util.List<SimpleUser> users;

    @NameInMap("WorkNodeId")
    public Integer workNodeId;

    public static Workforce build(java.util.Map<String, ?> map) throws Exception {
        Workforce self = new Workforce();
        return TeaModel.build(map, self);
    }

    public Workforce setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public Workforce setUsers(java.util.List<SimpleUser> users) {
        this.users = users;
        return this;
    }
    public java.util.List<SimpleUser> getUsers() {
        return this.users;
    }

    public Workforce setWorkNodeId(Integer workNodeId) {
        this.workNodeId = workNodeId;
        return this;
    }
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

}

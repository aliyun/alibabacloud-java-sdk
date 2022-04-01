// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class NodeCountConstraint extends TeaModel {
    // bizNodeGroupType
    @NameInMap("bizNodeGroupType")
    public String bizNodeGroupType;

    @NameInMap("ha")
    public Constraint ha;

    // normal
    @NameInMap("normal")
    public Constraint normal;

    public static NodeCountConstraint build(java.util.Map<String, ?> map) throws Exception {
        NodeCountConstraint self = new NodeCountConstraint();
        return TeaModel.build(map, self);
    }

    public NodeCountConstraint setBizNodeGroupType(String bizNodeGroupType) {
        this.bizNodeGroupType = bizNodeGroupType;
        return this;
    }
    public String getBizNodeGroupType() {
        return this.bizNodeGroupType;
    }

    public NodeCountConstraint setHa(Constraint ha) {
        this.ha = ha;
        return this;
    }
    public Constraint getHa() {
        return this.ha;
    }

    public NodeCountConstraint setNormal(Constraint normal) {
        this.normal = normal;
        return this;
    }
    public Constraint getNormal() {
        return this.normal;
    }

}

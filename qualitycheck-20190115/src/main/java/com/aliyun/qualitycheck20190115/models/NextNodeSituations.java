// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class NextNodeSituations extends TeaModel {
    @NameInMap("ConditionGroup")
    public java.util.List<NextNodeSituationsConditionGroup> conditionGroup;

    @NameInMap("Type")
    public String type;

    public static NextNodeSituations build(java.util.Map<String, ?> map) throws Exception {
        NextNodeSituations self = new NextNodeSituations();
        return TeaModel.build(map, self);
    }

    public NextNodeSituations setConditionGroup(java.util.List<NextNodeSituationsConditionGroup> conditionGroup) {
        this.conditionGroup = conditionGroup;
        return this;
    }
    public java.util.List<NextNodeSituationsConditionGroup> getConditionGroup() {
        return this.conditionGroup;
    }

    public NextNodeSituations setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class NextNodeSituationsConditionGroup extends TeaModel {
        @NameInMap("Conditions")
        public java.util.List<JudgeNodeMetaDesc> conditions;

        @NameInMap("Type")
        public String type;

        public static NextNodeSituationsConditionGroup build(java.util.Map<String, ?> map) throws Exception {
            NextNodeSituationsConditionGroup self = new NextNodeSituationsConditionGroup();
            return TeaModel.build(map, self);
        }

        public NextNodeSituationsConditionGroup setConditions(java.util.List<JudgeNodeMetaDesc> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<JudgeNodeMetaDesc> getConditions() {
            return this.conditions;
        }

        public NextNodeSituationsConditionGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

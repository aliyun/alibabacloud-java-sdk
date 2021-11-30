// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationRuleProgress extends TeaModel {
    // action
    @NameInMap("Action")
    public String action;

    // id
    @NameInMap("ID")
    public String ID;

    @NameInMap("PrefixSet")
    public ReplicationPrefixSet prefixSet;

    public static ReplicationRuleProgress build(java.util.Map<String, ?> map) throws Exception {
        ReplicationRuleProgress self = new ReplicationRuleProgress();
        return TeaModel.build(map, self);
    }

    public ReplicationRuleProgress setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ReplicationRuleProgress setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public ReplicationRuleProgress setPrefixSet(ReplicationPrefixSet prefixSet) {
        this.prefixSet = prefixSet;
        return this;
    }
    public ReplicationPrefixSet getPrefixSet() {
        return this.prefixSet;
    }

}

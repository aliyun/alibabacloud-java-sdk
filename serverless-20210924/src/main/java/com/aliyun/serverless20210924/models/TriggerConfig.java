// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class TriggerConfig extends TeaModel {
    @NameInMap("branch")
    public String branch;

    @NameInMap("commit")
    public String commit;

    @NameInMap("on")
    public String on;

    public static TriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        TriggerConfig self = new TriggerConfig();
        return TeaModel.build(map, self);
    }

    public TriggerConfig setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public TriggerConfig setCommit(String commit) {
        this.commit = commit;
        return this;
    }
    public String getCommit() {
        return this.commit;
    }

    public TriggerConfig setOn(String on) {
        this.on = on;
        return this;
    }
    public String getOn() {
        return this.on;
    }

}

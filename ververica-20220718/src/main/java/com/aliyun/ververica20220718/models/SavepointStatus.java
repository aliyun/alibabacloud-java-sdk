// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class SavepointStatus extends TeaModel {
    @NameInMap("failure")
    public SavepointFailure failure;

    @NameInMap("state")
    public String state;

    public static SavepointStatus build(java.util.Map<String, ?> map) throws Exception {
        SavepointStatus self = new SavepointStatus();
        return TeaModel.build(map, self);
    }

    public SavepointStatus setFailure(SavepointFailure failure) {
        this.failure = failure;
        return this;
    }
    public SavepointFailure getFailure() {
        return this.failure;
    }

    public SavepointStatus setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}

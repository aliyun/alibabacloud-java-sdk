// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktIterationlockRequest extends TeaModel {
    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Locked")
    public String locked;

    public static SaveLinkeLinktIterationlockRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktIterationlockRequest self = new SaveLinkeLinktIterationlockRequest();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktIterationlockRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public SaveLinkeLinktIterationlockRequest setLocked(String locked) {
        this.locked = locked;
        return this;
    }
    public String getLocked() {
        return this.locked;
    }

}

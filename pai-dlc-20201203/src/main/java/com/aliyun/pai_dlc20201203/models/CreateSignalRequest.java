// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class CreateSignalRequest extends TeaModel {
    /**
     * <p>The signal code.</p>
     * 
     * <strong>example:</strong>
     * <p>SIGUSR1</p>
     */
    @NameInMap("Signal")
    public String signal;

    /**
     * <p>The signal delivery scope.</p>
     */
    @NameInMap("Target")
    public SignalTarget target;

    public static CreateSignalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignalRequest self = new CreateSignalRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignalRequest setSignal(String signal) {
        this.signal = signal;
        return this;
    }
    public String getSignal() {
        return this.signal;
    }

    public CreateSignalRequest setTarget(SignalTarget target) {
        this.target = target;
        return this;
    }
    public SignalTarget getTarget() {
        return this.target;
    }

}

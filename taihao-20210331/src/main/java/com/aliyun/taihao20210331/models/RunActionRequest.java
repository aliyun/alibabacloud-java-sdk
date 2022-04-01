// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RunActionRequest extends TeaModel {
    // runActionParam
    @NameInMap("runActionParam")
    public RunActionParam runActionParam;

    public static RunActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunActionRequest self = new RunActionRequest();
        return TeaModel.build(map, self);
    }

    public RunActionRequest setRunActionParam(RunActionParam runActionParam) {
        this.runActionParam = runActionParam;
        return this;
    }
    public RunActionParam getRunActionParam() {
        return this.runActionParam;
    }

}

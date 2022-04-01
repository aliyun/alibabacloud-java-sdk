// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipWorkflowInstanceRequest extends TeaModel {
    // SkipWorkflowInstanceParam
    @NameInMap("skipWorkflowInstanceParam")
    public SkipWorkflowInstanceParam skipWorkflowInstanceParam;

    public static SkipWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipWorkflowInstanceRequest self = new SkipWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public SkipWorkflowInstanceRequest setSkipWorkflowInstanceParam(SkipWorkflowInstanceParam skipWorkflowInstanceParam) {
        this.skipWorkflowInstanceParam = skipWorkflowInstanceParam;
        return this;
    }
    public SkipWorkflowInstanceParam getSkipWorkflowInstanceParam() {
        return this.skipWorkflowInstanceParam;
    }

}

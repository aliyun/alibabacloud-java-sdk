// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktWorkitemrelationRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("TargetSign")
    public String targetSign;

    @NameInMap("WorkItemRelationType")
    public String workItemRelationType;

    public static RemoveLinkeLinktWorkitemrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktWorkitemrelationRequest self = new RemoveLinkeLinktWorkitemrelationRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktWorkitemrelationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RemoveLinkeLinktWorkitemrelationRequest setTargetSign(String targetSign) {
        this.targetSign = targetSign;
        return this;
    }
    public String getTargetSign() {
        return this.targetSign;
    }

    public RemoveLinkeLinktWorkitemrelationRequest setWorkItemRelationType(String workItemRelationType) {
        this.workItemRelationType = workItemRelationType;
        return this;
    }
    public String getWorkItemRelationType() {
        return this.workItemRelationType;
    }

}

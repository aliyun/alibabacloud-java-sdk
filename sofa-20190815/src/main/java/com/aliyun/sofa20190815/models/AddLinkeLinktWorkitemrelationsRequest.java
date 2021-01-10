// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktWorkitemrelationsRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("Targets")
    public String targets;

    @NameInMap("WorkItemRelationType")
    public String workItemRelationType;

    public static AddLinkeLinktWorkitemrelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktWorkitemrelationsRequest self = new AddLinkeLinktWorkitemrelationsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktWorkitemrelationsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AddLinkeLinktWorkitemrelationsRequest setTargets(String targets) {
        this.targets = targets;
        return this;
    }
    public String getTargets() {
        return this.targets;
    }

    public AddLinkeLinktWorkitemrelationsRequest setWorkItemRelationType(String workItemRelationType) {
        this.workItemRelationType = workItemRelationType;
        return this;
    }
    public String getWorkItemRelationType() {
        return this.workItemRelationType;
    }

}

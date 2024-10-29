// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public UpdateJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

}

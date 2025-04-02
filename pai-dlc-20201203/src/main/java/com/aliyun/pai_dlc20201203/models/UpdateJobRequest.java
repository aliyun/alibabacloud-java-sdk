// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The job visibility. Valid values:</p>
     * <ul>
     * <li>PUBLIC: The job is visible to all members in the workspace.</li>
     * <li>PRIVATE: The job is visible only to you and the administrator of the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The job priority. Valid values: 1 to 9.</p>
     * <ul>
     * <li>1: the lowest priority.</li>
     * <li>9: the highest priority.</li>
     * </ul>
     * 
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

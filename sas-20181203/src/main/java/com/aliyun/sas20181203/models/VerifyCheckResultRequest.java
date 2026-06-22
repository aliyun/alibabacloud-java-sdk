// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultRequest extends TeaModel {
    /**
     * <p>The list of check item IDs.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The list of instance IDs of the assets associated with the check items.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The task source. Valid values:</p>
     * <ul>
     * <li><strong>YAO_CHI</strong>: ApsaraDB console.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>YAO_CHI</p>
     */
    @NameInMap("TaskSource")
    public String taskSource;

    public static VerifyCheckResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckResultRequest self = new VerifyCheckResultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckResultRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public VerifyCheckResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public VerifyCheckResultRequest setTaskSource(String taskSource) {
        this.taskSource = taskSource;
        return this;
    }
    public String getTaskSource() {
        return this.taskSource;
    }

}

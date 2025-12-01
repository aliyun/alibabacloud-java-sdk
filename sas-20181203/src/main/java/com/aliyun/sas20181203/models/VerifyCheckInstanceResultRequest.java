// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckInstanceResultRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The instance IDs of the assets on which risks are detected based on the check item.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The source of task.</p>
     * 
     * <strong>example:</strong>
     * <p>YAO_CHI</p>
     */
    @NameInMap("TaskSource")
    public String taskSource;

    public static VerifyCheckInstanceResultRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckInstanceResultRequest self = new VerifyCheckInstanceResultRequest();
        return TeaModel.build(map, self);
    }

    public VerifyCheckInstanceResultRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public VerifyCheckInstanceResultRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public VerifyCheckInstanceResultRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public VerifyCheckInstanceResultRequest setTaskSource(String taskSource) {
        this.taskSource = taskSource;
        return this;
    }
    public String getTaskSource() {
        return this.taskSource;
    }

}

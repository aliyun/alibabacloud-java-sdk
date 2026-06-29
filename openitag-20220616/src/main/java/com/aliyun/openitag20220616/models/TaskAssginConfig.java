// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskAssginConfig extends TeaModel {
    /**
     * <p>Allocation quantity.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AssignCount")
    public Long assignCount;

    /**
     * <p>Assign by field.</p>
     * 
     * <strong>example:</strong>
     * <p>label_field</p>
     */
    @NameInMap("AssignField")
    public String assignField;

    /**
     * <p>If average allocation is selected, specify the number of job packages.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AssignSubTaskCount")
    public String assignSubTaskCount;

    /**
     * <p>The allocation rule for job packages. Valid values:</p>
     * <ul>
     * <li>FIXED_SIZE: Assign by fixed size.</li>
     * <li>AVG_SIZE: Assign by average quantity.</li>
     * <li>FIELD_BASE: Assign by imported field.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FIXED_SIZE</p>
     */
    @NameInMap("AssignType")
    public String assignType;

    public static TaskAssginConfig build(java.util.Map<String, ?> map) throws Exception {
        TaskAssginConfig self = new TaskAssginConfig();
        return TeaModel.build(map, self);
    }

    public TaskAssginConfig setAssignCount(Long assignCount) {
        this.assignCount = assignCount;
        return this;
    }
    public Long getAssignCount() {
        return this.assignCount;
    }

    public TaskAssginConfig setAssignField(String assignField) {
        this.assignField = assignField;
        return this;
    }
    public String getAssignField() {
        return this.assignField;
    }

    public TaskAssginConfig setAssignSubTaskCount(String assignSubTaskCount) {
        this.assignSubTaskCount = assignSubTaskCount;
        return this;
    }
    public String getAssignSubTaskCount() {
        return this.assignSubTaskCount;
    }

    public TaskAssginConfig setAssignType(String assignType) {
        this.assignType = assignType;
        return this;
    }
    public String getAssignType() {
        return this.assignType;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskAssginConfig extends TeaModel {
    @NameInMap("AssignCount")
    public Long assignCount;

    @NameInMap("AssignField")
    public String assignField;

    @NameInMap("AssignSubTaskCount")
    public String assignSubTaskCount;

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

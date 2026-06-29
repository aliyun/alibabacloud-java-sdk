// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class UpdateTaskDTO extends TeaModel {
    /**
     * <p>Extended field</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, String> exif;

    /**
     * <p>Remark information</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>List of labels</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>Task Name</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateTaskDTO build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskDTO self = new UpdateTaskDTO();
        return TeaModel.build(map, self);
    }

    public UpdateTaskDTO setExif(java.util.Map<String, String> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, String> getExif() {
        return this.exif;
    }

    public UpdateTaskDTO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateTaskDTO setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public UpdateTaskDTO setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}

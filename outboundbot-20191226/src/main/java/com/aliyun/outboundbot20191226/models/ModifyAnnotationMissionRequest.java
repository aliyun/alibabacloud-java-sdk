// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAnnotationMissionRequest extends TeaModel {
    /**
     * <p>Annotation task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c88cc004-de69-4eee-aa5f-2efed533a54e</p>
     */
    @NameInMap("AnnotationMissionId")
    public String annotationMissionId;

    /**
     * <p>Annotation task name.</p>
     * 
     * <strong>example:</strong>
     * <p>询问卖车-标注任务-20230506-112934</p>
     */
    @NameInMap("AnnotationMissionName")
    public String annotationMissionName;

    /**
     * <p>Annotation task status.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AnnotationStatus")
    public Integer annotationStatus;

    /**
     * <p>Delete the task.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Delete")
    public Boolean delete;

    public static ModifyAnnotationMissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnnotationMissionRequest self = new ModifyAnnotationMissionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAnnotationMissionRequest setAnnotationMissionId(String annotationMissionId) {
        this.annotationMissionId = annotationMissionId;
        return this;
    }
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    public ModifyAnnotationMissionRequest setAnnotationMissionName(String annotationMissionName) {
        this.annotationMissionName = annotationMissionName;
        return this;
    }
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    public ModifyAnnotationMissionRequest setAnnotationStatus(Integer annotationStatus) {
        this.annotationStatus = annotationStatus;
        return this;
    }
    public Integer getAnnotationStatus() {
        return this.annotationStatus;
    }

    public ModifyAnnotationMissionRequest setDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }
    public Boolean getDelete() {
        return this.delete;
    }

}

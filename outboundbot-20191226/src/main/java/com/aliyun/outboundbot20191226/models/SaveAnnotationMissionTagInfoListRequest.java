// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionTagInfoListRequest extends TeaModel {
    @NameInMap("AnnotationMissionTagInfoList")
    public java.util.List<SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList> annotationMissionTagInfoList;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AnnotationMissionTagInfoListJsonString")
    public String annotationMissionTagInfoListJsonString;

    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reset")
    public Boolean reset;

    public static SaveAnnotationMissionTagInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionTagInfoListRequest self = new SaveAnnotationMissionTagInfoListRequest();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionTagInfoListRequest setAnnotationMissionTagInfoList(java.util.List<SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList> annotationMissionTagInfoList) {
        this.annotationMissionTagInfoList = annotationMissionTagInfoList;
        return this;
    }
    public java.util.List<SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList> getAnnotationMissionTagInfoList() {
        return this.annotationMissionTagInfoList;
    }

    public SaveAnnotationMissionTagInfoListRequest setAnnotationMissionTagInfoListJsonString(String annotationMissionTagInfoListJsonString) {
        this.annotationMissionTagInfoListJsonString = annotationMissionTagInfoListJsonString;
        return this;
    }
    public String getAnnotationMissionTagInfoListJsonString() {
        return this.annotationMissionTagInfoListJsonString;
    }

    public SaveAnnotationMissionTagInfoListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveAnnotationMissionTagInfoListRequest setReset(Boolean reset) {
        this.reset = reset;
        return this;
    }
    public Boolean getReset() {
        return this.reset;
    }

    public static class SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList extends TeaModel {
        @NameInMap("AnnotationMissionTagInfoDescription")
        public String annotationMissionTagInfoDescription;

        /**
         * <p>tag id</p>
         */
        @NameInMap("AnnotationMissionTagInfoId")
        public String annotationMissionTagInfoId;

        @NameInMap("AnnotationMissionTagInfoName")
        public String annotationMissionTagInfoName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <strong>example:</strong>
         * <p>bdbff6a5-1f68-4b41-8d37-6ff805ce165a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>bdbff6a5-1f68-4b41-8d37-6ff805ce165a</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList build(java.util.Map<String, ?> map) throws Exception {
            SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList self = new SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList();
            return TeaModel.build(map, self);
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setAnnotationMissionTagInfoDescription(String annotationMissionTagInfoDescription) {
            this.annotationMissionTagInfoDescription = annotationMissionTagInfoDescription;
            return this;
        }
        public String getAnnotationMissionTagInfoDescription() {
            return this.annotationMissionTagInfoDescription;
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
            this.annotationMissionTagInfoId = annotationMissionTagInfoId;
            return this;
        }
        public String getAnnotationMissionTagInfoId() {
            return this.annotationMissionTagInfoId;
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
            this.annotationMissionTagInfoName = annotationMissionTagInfoName;
            return this;
        }
        public String getAnnotationMissionTagInfoName() {
            return this.annotationMissionTagInfoName;
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setDelete(Boolean delete) {
            this.delete = delete;
            return this;
        }
        public Boolean getDelete() {
            return this.delete;
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}

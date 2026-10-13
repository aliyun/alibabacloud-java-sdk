// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionTagInfoListRequest extends TeaModel {
    /**
     * <p>The tag list.</p>
     * <blockquote>
     * <p>This parameter is the same as the AnnotationMissionTagInfoListJsonString parameter. Specify either one.</p>
     * </blockquote>
     */
    @NameInMap("AnnotationMissionTagInfoList")
    public java.util.List<SaveAnnotationMissionTagInfoListRequestAnnotationMissionTagInfoList> annotationMissionTagInfoList;

    /**
     * <p>The tag JSON data.</p>
     * <blockquote>
     * <p>The parameters in the JSON are the same as those in the AnnotationMissionTagInfoList parameter. Specify either this parameter or AnnotationMissionTagInfoList.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;delete&quot;:false,				&quot;InstanceId&quot;:&quot;00b37342-e759-4fe5-b296-aef775933af0&quot;,					&quot;AnnotationMissionTagInfoName&quot;:&quot;TestData1&quot;,					&quot;AnnotationMissionTagInfoDescription&quot;:&quot;Test&quot;}]</p>
     */
    @NameInMap("AnnotationMissionTagInfoListJsonString")
    public String annotationMissionTagInfoListJsonString;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to restore the default tag values.</p>
     * 
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
        /**
         * <p>The tag description.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag description</p>
         */
        @NameInMap("AnnotationMissionTagInfoDescription")
        public String annotationMissionTagInfoDescription;

        /**
         * <p>The tag ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bdbff6a5-1f68-4b41-8d37-6ff805ce165a</p>
         */
        @NameInMap("AnnotationMissionTagInfoId")
        public String annotationMissionTagInfoId;

        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>Tag</p>
         */
        @NameInMap("AnnotationMissionTagInfoName")
        public String annotationMissionTagInfoName;

        /**
         * <p>Specifies whether to delete the tag.</p>
         * <blockquote>
         * <p>Set this parameter to true to delete the tag, or false to add the tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delete")
        public Boolean delete;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bdbff6a5-1f68-4b41-8d37-6ff805ce165a</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The tenant ID.</p>
         * 
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

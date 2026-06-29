// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateView extends TeaModel {
    /**
     * <p>View List</p>
     */
    @NameInMap("Fields")
    public java.util.List<TemplateViewFields> fields;

    public static TemplateView build(java.util.Map<String, ?> map) throws Exception {
        TemplateView self = new TemplateView();
        return TeaModel.build(map, self);
    }

    public TemplateView setFields(java.util.List<TemplateViewFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<TemplateViewFields> getFields() {
        return this.fields;
    }

    public static class TemplateViewFieldsVisitInfo extends TeaModel {
        /**
         * <p>Afts Configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expiredTime&quot;:20}</p>
         */
        @NameInMap("AftsConf")
        public java.util.Map<String, ?> aftsConf;

        /**
         * <p>OSS Configuration</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ossEndpoint&quot;:&quot;<em><strong>&quot;,&quot;ossAk&quot;:&quot;</strong></em>&quot;,&quot;ossAs&quot;:&quot;***&quot;,&quot;ossOwner&quot;:&quot;&quot;,&quot;ossBucket&quot;:&quot;&quot;}</p>
         */
        @NameInMap("OssConf")
        public java.util.Map<String, ?> ossConf;

        public static TemplateViewFieldsVisitInfo build(java.util.Map<String, ?> map) throws Exception {
            TemplateViewFieldsVisitInfo self = new TemplateViewFieldsVisitInfo();
            return TeaModel.build(map, self);
        }

        public TemplateViewFieldsVisitInfo setAftsConf(java.util.Map<String, ?> aftsConf) {
            this.aftsConf = aftsConf;
            return this;
        }
        public java.util.Map<String, ?> getAftsConf() {
            return this.aftsConf;
        }

        public TemplateViewFieldsVisitInfo setOssConf(java.util.Map<String, ?> ossConf) {
            this.ossConf = ossConf;
            return this;
        }
        public java.util.Map<String, ?> getOssConf() {
            return this.ossConf;
        }

    }

    public static class TemplateViewFields extends TeaModel {
        /**
         * <p>Whether to Display Original Image</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisplayOriImg")
        public Boolean displayOriImg;

        /**
         * <p>Associated Column Name</p>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>View Type</p>
         * 
         * <strong>example:</strong>
         * <p>IMG</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Access Information</p>
         */
        @NameInMap("VisitInfo")
        public TemplateViewFieldsVisitInfo visitInfo;

        public static TemplateViewFields build(java.util.Map<String, ?> map) throws Exception {
            TemplateViewFields self = new TemplateViewFields();
            return TeaModel.build(map, self);
        }

        public TemplateViewFields setDisplayOriImg(Boolean displayOriImg) {
            this.displayOriImg = displayOriImg;
            return this;
        }
        public Boolean getDisplayOriImg() {
            return this.displayOriImg;
        }

        public TemplateViewFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public TemplateViewFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TemplateViewFields setVisitInfo(TemplateViewFieldsVisitInfo visitInfo) {
            this.visitInfo = visitInfo;
            return this;
        }
        public TemplateViewFieldsVisitInfo getVisitInfo() {
            return this.visitInfo;
        }

    }

}

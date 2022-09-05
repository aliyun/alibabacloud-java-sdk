// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateView extends TeaModel {
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
        @NameInMap("AftsConf")
        public java.util.Map<String, ?> aftsConf;

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
        @NameInMap("DisplayOriImg")
        public Boolean displayOriImg;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("Type")
        public String type;

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

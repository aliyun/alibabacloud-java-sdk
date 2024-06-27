// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyTemplateRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("description")
    public String description;

    @NameInMap("eventCode")
    public String eventCode;

    @NameInMap("inputFields")
    public ModifyTemplateRequestInputFields inputFields;

    @NameInMap("regId")
    public String regId;

    @NameInMap("templateId")
    public Long templateId;

    @NameInMap("templateType")
    public String templateType;

    @NameInMap("version")
    public Integer version;

    public static ModifyTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTemplateRequest self = new ModifyTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyTemplateRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ModifyTemplateRequest setInputFields(ModifyTemplateRequestInputFields inputFields) {
        this.inputFields = inputFields;
        return this;
    }
    public ModifyTemplateRequestInputFields getInputFields() {
        return this.inputFields;
    }

    public ModifyTemplateRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public ModifyTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ModifyTemplateRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public static class ModifyTemplateRequestInputFields extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("fieldCode")
        public String fieldCode;

        @NameInMap("fieldRank")
        public Integer fieldRank;

        @NameInMap("fieldSource")
        public String fieldSource;

        @NameInMap("fieldType")
        public String fieldType;

        @NameInMap("title")
        public String title;

        public static ModifyTemplateRequestInputFields build(java.util.Map<String, ?> map) throws Exception {
            ModifyTemplateRequestInputFields self = new ModifyTemplateRequestInputFields();
            return TeaModel.build(map, self);
        }

        public ModifyTemplateRequestInputFields setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyTemplateRequestInputFields setFieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }
        public String getFieldCode() {
            return this.fieldCode;
        }

        public ModifyTemplateRequestInputFields setFieldRank(Integer fieldRank) {
            this.fieldRank = fieldRank;
            return this;
        }
        public Integer getFieldRank() {
            return this.fieldRank;
        }

        public ModifyTemplateRequestInputFields setFieldSource(String fieldSource) {
            this.fieldSource = fieldSource;
            return this;
        }
        public String getFieldSource() {
            return this.fieldSource;
        }

        public ModifyTemplateRequestInputFields setFieldType(String fieldType) {
            this.fieldType = fieldType;
            return this;
        }
        public String getFieldType() {
            return this.fieldType;
        }

        public ModifyTemplateRequestInputFields setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}

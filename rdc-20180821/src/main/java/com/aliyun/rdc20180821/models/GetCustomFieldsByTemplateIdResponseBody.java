// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetCustomFieldsByTemplateIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetCustomFieldsByTemplateIdResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomFieldsByTemplateIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomFieldsByTemplateIdResponseBody self = new GetCustomFieldsByTemplateIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomFieldsByTemplateIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomFieldsByTemplateIdResponseBody setData(java.util.List<GetCustomFieldsByTemplateIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCustomFieldsByTemplateIdResponseBodyData> getData() {
        return this.data;
    }

    public GetCustomFieldsByTemplateIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCustomFieldsByTemplateIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomFieldsByTemplateIdResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Editable")
        public Boolean editable;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("IsRemember")
        public Boolean isRemember;

        @NameInMap("IsDelete")
        public Boolean isDelete;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("MaxLength")
        public Integer maxLength;

        @NameInMap("FieldFormat")
        public String fieldFormat;

        @NameInMap("Description")
        public String description;

        @NameInMap("Dynamic")
        public Boolean dynamic;

        @NameInMap("IsRequired")
        public Boolean isRequired;

        @NameInMap("NameI18N")
        public String nameI18N;

        @NameInMap("PossibleValues")
        public String possibleValues;

        @NameInMap("MinLength")
        public Integer minLength;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Other")
        public String other;

        @NameInMap("Id")
        public Integer id;

        public static GetCustomFieldsByTemplateIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomFieldsByTemplateIdResponseBodyData self = new GetCustomFieldsByTemplateIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setIsRemember(Boolean isRemember) {
            this.isRemember = isRemember;
            return this;
        }
        public Boolean getIsRemember() {
            return this.isRemember;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setIsDelete(Boolean isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Boolean getIsDelete() {
            return this.isDelete;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setMaxLength(Integer maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Integer getMaxLength() {
            return this.maxLength;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setIsRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }
        public Boolean getIsRequired() {
            return this.isRequired;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setNameI18N(String nameI18N) {
            this.nameI18N = nameI18N;
            return this;
        }
        public String getNameI18N() {
            return this.nameI18N;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setPossibleValues(String possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public String getPossibleValues() {
            return this.possibleValues;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setMinLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }
        public Integer getMinLength() {
            return this.minLength;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

        public GetCustomFieldsByTemplateIdResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}

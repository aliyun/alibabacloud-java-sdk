// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktTemplateselectablecustomfieldsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData> data;

    public static ListLinkeLinktTemplateselectablecustomfieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktTemplateselectablecustomfieldsResponseBody self = new ListLinkeLinktTemplateselectablecustomfieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktTemplateselectablecustomfieldsResponseBody setData(java.util.List<ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData extends TeaModel {
        @NameInMap("CopyFrom")
        public Long copyFrom;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("DynamicOptionFetchUrl")
        public String dynamicOptionFetchUrl;

        @NameInMap("Editable")
        public Boolean editable;

        @NameInMap("EnableSearch")
        public Boolean enableSearch;

        @NameInMap("FieldFormat")
        public String fieldFormat;

        @NameInMap("FieldLabel")
        public String fieldLabel;

        @NameInMap("FormInvisible")
        public Boolean formInvisible;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Invisible")
        public Boolean invisible;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Type")
        public Long type;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("DynamicFieldRequiredDependentFields")
        public java.util.List<Long> dynamicFieldRequiredDependentFields;

        @NameInMap("DynamicFieldRequiredInfluencedFields")
        public java.util.List<Long> dynamicFieldRequiredInfluencedFields;

        @NameInMap("DynamicOptionFetchDependentFields")
        public java.util.List<Long> dynamicOptionFetchDependentFields;

        @NameInMap("DynamicOptionFetchInfluencedFields")
        public java.util.List<Long> dynamicOptionFetchInfluencedFields;

        @NameInMap("PossibleValues")
        public java.util.List<String> possibleValues;

        public static ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData self = new ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setCopyFrom(Long copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public Long getCopyFrom() {
            return this.copyFrom;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDynamicOptionFetchUrl(String dynamicOptionFetchUrl) {
            this.dynamicOptionFetchUrl = dynamicOptionFetchUrl;
            return this;
        }
        public String getDynamicOptionFetchUrl() {
            return this.dynamicOptionFetchUrl;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setFieldLabel(String fieldLabel) {
            this.fieldLabel = fieldLabel;
            return this;
        }
        public String getFieldLabel() {
            return this.fieldLabel;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setFormInvisible(Boolean formInvisible) {
            this.formInvisible = formInvisible;
            return this;
        }
        public Boolean getFormInvisible() {
            return this.formInvisible;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setInvisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }
        public Boolean getInvisible() {
            return this.invisible;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDynamicFieldRequiredDependentFields(java.util.List<Long> dynamicFieldRequiredDependentFields) {
            this.dynamicFieldRequiredDependentFields = dynamicFieldRequiredDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredDependentFields() {
            return this.dynamicFieldRequiredDependentFields;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDynamicFieldRequiredInfluencedFields(java.util.List<Long> dynamicFieldRequiredInfluencedFields) {
            this.dynamicFieldRequiredInfluencedFields = dynamicFieldRequiredInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredInfluencedFields() {
            return this.dynamicFieldRequiredInfluencedFields;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDynamicOptionFetchDependentFields(java.util.List<Long> dynamicOptionFetchDependentFields) {
            this.dynamicOptionFetchDependentFields = dynamicOptionFetchDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchDependentFields() {
            return this.dynamicOptionFetchDependentFields;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setDynamicOptionFetchInfluencedFields(java.util.List<Long> dynamicOptionFetchInfluencedFields) {
            this.dynamicOptionFetchInfluencedFields = dynamicOptionFetchInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchInfluencedFields() {
            return this.dynamicOptionFetchInfluencedFields;
        }

        public ListLinkeLinktTemplateselectablecustomfieldsResponseBodyData setPossibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public java.util.List<String> getPossibleValues() {
            return this.possibleValues;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjectusedcustomfieldsResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinktProjectusedcustomfieldsResponseBodyData> data;

    public static ListLinkeLinktProjectusedcustomfieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjectusedcustomfieldsResponseBody self = new ListLinkeLinktProjectusedcustomfieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktProjectusedcustomfieldsResponseBody setData(java.util.List<ListLinkeLinktProjectusedcustomfieldsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktProjectusedcustomfieldsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktProjectusedcustomfieldsResponseBodyData extends TeaModel {
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

        public static ListLinkeLinktProjectusedcustomfieldsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktProjectusedcustomfieldsResponseBodyData self = new ListLinkeLinktProjectusedcustomfieldsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setCopyFrom(Long copyFrom) {
            this.copyFrom = copyFrom;
            return this;
        }
        public Long getCopyFrom() {
            return this.copyFrom;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDynamicOptionFetchUrl(String dynamicOptionFetchUrl) {
            this.dynamicOptionFetchUrl = dynamicOptionFetchUrl;
            return this;
        }
        public String getDynamicOptionFetchUrl() {
            return this.dynamicOptionFetchUrl;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setEditable(Boolean editable) {
            this.editable = editable;
            return this;
        }
        public Boolean getEditable() {
            return this.editable;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setEnableSearch(Boolean enableSearch) {
            this.enableSearch = enableSearch;
            return this;
        }
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setFieldFormat(String fieldFormat) {
            this.fieldFormat = fieldFormat;
            return this;
        }
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setFieldLabel(String fieldLabel) {
            this.fieldLabel = fieldLabel;
            return this;
        }
        public String getFieldLabel() {
            return this.fieldLabel;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setFormInvisible(Boolean formInvisible) {
            this.formInvisible = formInvisible;
            return this;
        }
        public Boolean getFormInvisible() {
            return this.formInvisible;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setInvisible(Boolean invisible) {
            this.invisible = invisible;
            return this;
        }
        public Boolean getInvisible() {
            return this.invisible;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDynamicFieldRequiredDependentFields(java.util.List<Long> dynamicFieldRequiredDependentFields) {
            this.dynamicFieldRequiredDependentFields = dynamicFieldRequiredDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredDependentFields() {
            return this.dynamicFieldRequiredDependentFields;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDynamicFieldRequiredInfluencedFields(java.util.List<Long> dynamicFieldRequiredInfluencedFields) {
            this.dynamicFieldRequiredInfluencedFields = dynamicFieldRequiredInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicFieldRequiredInfluencedFields() {
            return this.dynamicFieldRequiredInfluencedFields;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDynamicOptionFetchDependentFields(java.util.List<Long> dynamicOptionFetchDependentFields) {
            this.dynamicOptionFetchDependentFields = dynamicOptionFetchDependentFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchDependentFields() {
            return this.dynamicOptionFetchDependentFields;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setDynamicOptionFetchInfluencedFields(java.util.List<Long> dynamicOptionFetchInfluencedFields) {
            this.dynamicOptionFetchInfluencedFields = dynamicOptionFetchInfluencedFields;
            return this;
        }
        public java.util.List<Long> getDynamicOptionFetchInfluencedFields() {
            return this.dynamicOptionFetchInfluencedFields;
        }

        public ListLinkeLinktProjectusedcustomfieldsResponseBodyData setPossibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            return this;
        }
        public java.util.List<String> getPossibleValues() {
            return this.possibleValues;
        }

    }

}

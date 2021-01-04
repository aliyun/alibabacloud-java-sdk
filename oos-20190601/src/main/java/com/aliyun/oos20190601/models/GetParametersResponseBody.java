// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParametersResponseBody extends TeaModel {
    @NameInMap("Parameters")
    public java.util.List<GetParametersResponseBodyParameters> parameters;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InvalidParameters")
    public java.util.List<String> invalidParameters;

    public static GetParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParametersResponseBody self = new GetParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParametersResponseBody setParameters(java.util.List<GetParametersResponseBodyParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<GetParametersResponseBodyParameters> getParameters() {
        return this.parameters;
    }

    public GetParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParametersResponseBody setInvalidParameters(java.util.List<String> invalidParameters) {
        this.invalidParameters = invalidParameters;
        return this;
    }
    public java.util.List<String> getInvalidParameters() {
        return this.invalidParameters;
    }

    public static class GetParametersResponseBodyParameters extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedDate")
        public String updatedDate;

        @NameInMap("UpdatedBy")
        public String updatedBy;

        @NameInMap("Value")
        public String value;

        @NameInMap("Constraints")
        public String constraints;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedBy")
        public String createdBy;

        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        @NameInMap("CreatedDate")
        public String createdDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("ShareType")
        public String shareType;

        public static GetParametersResponseBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            GetParametersResponseBodyParameters self = new GetParametersResponseBodyParameters();
            return TeaModel.build(map, self);
        }

        public GetParametersResponseBodyParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParametersResponseBodyParameters setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetParametersResponseBodyParameters setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetParametersResponseBodyParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetParametersResponseBodyParameters setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetParametersResponseBodyParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParametersResponseBodyParameters setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetParametersResponseBodyParameters setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetParametersResponseBodyParameters setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetParametersResponseBodyParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParametersResponseBodyParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetParametersResponseBodyParameters setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

    }

}

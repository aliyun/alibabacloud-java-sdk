// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetParameterResponseBody extends TeaModel {
    /**
     * <p>The information about the common parameter.</p>
     */
    @NameInMap("Parameter")
    public GetParameterResponseBodyParameter parameter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BA326372-2A10-4C3B-BE3E-6439DB7557CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParameterResponseBody self = new GetParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParameterResponseBody setParameter(GetParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public GetParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public GetParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The constraints of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;{\&quot;\&quot;AllowedValues&quot;:[&quot;parameter&quot;],&quot;AllowedPattern&quot;:&quot;parameter&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}\&quot;</p>
         */
        @NameInMap("Constraints")
        public String constraints;

        /**
         * <p>The user who created the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The time when the common parameter was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T08:01:43Z</p>
         */
        @NameInMap("CreatedDate")
        public String createdDate;

        /**
         * <p>The description of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>parameter</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>p-4c4b401cab6747xxxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyParameter</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The version number of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m*****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The share type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The tags added to the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The data type of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user who updated the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>root(130900000)</p>
         */
        @NameInMap("UpdatedBy")
        public String updatedBy;

        /**
         * <p>The time when the common parameter was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-01T08:01:43Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        /**
         * <p>The value of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>parameter</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            GetParameterResponseBodyParameter self = new GetParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public GetParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public GetParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public GetParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public GetParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public GetParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public GetParameterResponseBodyParameter setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public GetParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public GetParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public GetParameterResponseBodyParameter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

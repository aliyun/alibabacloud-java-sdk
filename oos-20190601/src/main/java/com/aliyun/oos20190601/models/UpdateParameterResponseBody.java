// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateParameterResponseBody extends TeaModel {
    /**
     * <p>The information about the common parameter.</p>
     */
    @NameInMap("Parameter")
    public UpdateParameterResponseBodyParameter parameter;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AF1AE6DE-61C4-435E-8687-072CFACCCEC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterResponseBody self = new UpdateParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateParameterResponseBody setParameter(UpdateParameterResponseBodyParameter parameter) {
        this.parameter = parameter;
        return this;
    }
    public UpdateParameterResponseBodyParameter getParameter() {
        return this.parameter;
    }

    public UpdateParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateParameterResponseBodyParameter extends TeaModel {
        /**
         * <p>The constraints of the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;AllowedValues\&quot;:[\&quot;parameter\&quot;],\&quot;AllowedPattern\&quot;:\&quot;parameter\&quot;,\&quot;MinLength\&quot;:0,\&quot;MaxLength\&quot;:20}&quot;</p>
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
         * <p>update</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The parameter ID.</p>
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
         * <p>2</p>
         */
        @NameInMap("ParameterVersion")
        public Integer parameterVersion;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
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
         * <p>The tag added to the common parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
         */
        @NameInMap("Tags")
        public String tags;

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
         * <p>2020-09-01T08:04:23Z</p>
         */
        @NameInMap("UpdatedDate")
        public String updatedDate;

        public static UpdateParameterResponseBodyParameter build(java.util.Map<String, ?> map) throws Exception {
            UpdateParameterResponseBodyParameter self = new UpdateParameterResponseBodyParameter();
            return TeaModel.build(map, self);
        }

        public UpdateParameterResponseBodyParameter setConstraints(String constraints) {
            this.constraints = constraints;
            return this;
        }
        public String getConstraints() {
            return this.constraints;
        }

        public UpdateParameterResponseBodyParameter setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public UpdateParameterResponseBodyParameter setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public String getCreatedDate() {
            return this.createdDate;
        }

        public UpdateParameterResponseBodyParameter setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateParameterResponseBodyParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateParameterResponseBodyParameter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateParameterResponseBodyParameter setParameterVersion(Integer parameterVersion) {
            this.parameterVersion = parameterVersion;
            return this;
        }
        public Integer getParameterVersion() {
            return this.parameterVersion;
        }

        public UpdateParameterResponseBodyParameter setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateParameterResponseBodyParameter setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public UpdateParameterResponseBodyParameter setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public UpdateParameterResponseBodyParameter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateParameterResponseBodyParameter setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public UpdateParameterResponseBodyParameter setUpdatedDate(String updatedDate) {
            this.updatedDate = updatedDate;
            return this;
        }
        public String getUpdatedDate() {
            return this.updatedDate;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductVersionResponseBody extends TeaModel {
    /**
     * <p>The details of the product version.</p>
     */
    @NameInMap("ProductVersionDetail")
    public GetProductVersionResponseBodyProductVersionDetail productVersionDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResponseBody self = new GetProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResponseBody setProductVersionDetail(GetProductVersionResponseBodyProductVersionDetail productVersionDetail) {
        this.productVersionDetail = productVersionDetail;
        return this;
    }
    public GetProductVersionResponseBodyProductVersionDetail getProductVersionDetail() {
        return this.productVersionDetail;
    }

    public GetProductVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProductVersionResponseBodyProductVersionDetail extends TeaModel {
        /**
         * <p>Indicates whether the product version is visible to end users. Valid values:</p>
         * <br>
         * <p>*   true: The product version is visible to end users. This is the default value.</p>
         * <p>*   false: The product version is invisible to end users.</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The time when the product version was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the product version.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The recommendation information. Valid values:</p>
         * <br>
         * <p>*   Default: No recommendation information is provided. This is the default value.</p>
         * <p>*   Recommended: the recommendation version.</p>
         * <p>*   Latest: the latest version.</p>
         * <p>*   Deprecated: the version that is about to be deprecated.</p>
         */
        @NameInMap("Guidance")
        public String guidance;

        /**
         * <p>The ID of the product to which the product version belongs.</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The ID of the product version.</p>
         */
        @NameInMap("ProductVersionId")
        public String productVersionId;

        /**
         * <p>The name of the product version.</p>
         */
        @NameInMap("ProductVersionName")
        public String productVersionName;

        /**
         * <p>The type of the template.</p>
         * <br>
         * <p>The value is fixed as RosTerraformTemplate, which indicates that the Terraform template is supported by Resource Orchestration Service (ROS).</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The URL of the template.</p>
         */
        @NameInMap("TemplateUrl")
        public String templateUrl;

        public static GetProductVersionResponseBodyProductVersionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionResponseBodyProductVersionDetail self = new GetProductVersionResponseBodyProductVersionDetail();
            return TeaModel.build(map, self);
        }

        public GetProductVersionResponseBodyProductVersionDetail setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public GetProductVersionResponseBodyProductVersionDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProductVersionResponseBodyProductVersionDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductVersionResponseBodyProductVersionDetail setGuidance(String guidance) {
            this.guidance = guidance;
            return this;
        }
        public String getGuidance() {
            return this.guidance;
        }

        public GetProductVersionResponseBodyProductVersionDetail setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetProductVersionResponseBodyProductVersionDetail setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public GetProductVersionResponseBodyProductVersionDetail setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public GetProductVersionResponseBodyProductVersionDetail setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetProductVersionResponseBodyProductVersionDetail setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

}

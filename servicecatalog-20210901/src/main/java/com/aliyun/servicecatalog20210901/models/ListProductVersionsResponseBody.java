// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductVersionsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the product versions.</p>
     */
    @NameInMap("ProductVersionDetails")
    public java.util.List<ListProductVersionsResponseBodyProductVersionDetails> productVersionDetails;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProductVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsResponseBody self = new ListProductVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsResponseBody setProductVersionDetails(java.util.List<ListProductVersionsResponseBodyProductVersionDetails> productVersionDetails) {
        this.productVersionDetails = productVersionDetails;
        return this;
    }
    public java.util.List<ListProductVersionsResponseBodyProductVersionDetails> getProductVersionDetails() {
        return this.productVersionDetails;
    }

    public ListProductVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProductVersionsResponseBodyProductVersionDetails extends TeaModel {
        /**
         * <p>Indicates whether the product version is visible to end users. Valid values:</p>
         * <br>
         * <p>true: The product version is visible to end users. This is the default value. false: The product version is invisible to end users.</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The time when the product version is created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
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

        public static ListProductVersionsResponseBodyProductVersionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsResponseBodyProductVersionDetails self = new ListProductVersionsResponseBodyProductVersionDetails();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsResponseBodyProductVersionDetails setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setGuidance(String guidance) {
            this.guidance = guidance;
            return this;
        }
        public String getGuidance() {
            return this.guidance;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setProductVersionId(String productVersionId) {
            this.productVersionId = productVersionId;
            return this;
        }
        public String getProductVersionId() {
            return this.productVersionId;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setProductVersionName(String productVersionName) {
            this.productVersionName = productVersionName;
            return this;
        }
        public String getProductVersionName() {
            return this.productVersionName;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public ListProductVersionsResponseBodyProductVersionDetails setTemplateUrl(String templateUrl) {
            this.templateUrl = templateUrl;
            return this;
        }
        public String getTemplateUrl() {
            return this.templateUrl;
        }

    }

}

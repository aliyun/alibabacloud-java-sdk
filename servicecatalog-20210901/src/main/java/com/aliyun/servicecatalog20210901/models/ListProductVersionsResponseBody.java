// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductVersionsResponseBody extends TeaModel {
    // 产品版本列表
    @NameInMap("ProductVersionDetails")
    public java.util.List<ListProductVersionsResponseBodyProductVersionDetails> productVersionDetails;

    // 请求ID
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
        // 是否启用
        @NameInMap("Active")
        public Boolean active;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 产品版本描述
        @NameInMap("Description")
        public String description;

        // 推荐信息
        @NameInMap("Guidance")
        public String guidance;

        // 产品版本ID
        @NameInMap("ProductVersionId")
        public String productVersionId;

        // 产品版本名称
        @NameInMap("ProductVersionName")
        public String productVersionName;

        // 模板类型
        @NameInMap("TemplateType")
        public String templateType;

        // 模板的OSS地址
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

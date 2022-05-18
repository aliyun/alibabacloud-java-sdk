// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProductVersionResponseBody extends TeaModel {
    // 产品版本详情
    @NameInMap("ProductVersionDetail")
    public GetProductVersionResponseBodyProductVersionDetail productVersionDetail;

    // 请求ID
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

        // 产品版本所属的产品ID
        @NameInMap("ProductId")
        public String productId;

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

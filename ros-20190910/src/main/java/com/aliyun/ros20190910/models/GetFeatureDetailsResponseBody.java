// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetFeatureDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Terraform")
    public GetFeatureDetailsResponseBodyTerraform terraform;

    public static GetFeatureDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureDetailsResponseBody self = new GetFeatureDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureDetailsResponseBody setTerraform(GetFeatureDetailsResponseBodyTerraform terraform) {
        this.terraform = terraform;
        return this;
    }
    public GetFeatureDetailsResponseBodyTerraform getTerraform() {
        return this.terraform;
    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes extends TeaModel {
        @NameInMap("CustomTag")
        public java.util.List<String> customTag;

        @NameInMap("EstimateCost")
        public java.util.List<String> estimateCost;

        @NameInMap("SystemTag")
        public java.util.List<String> systemTag;

        public static GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes self = new GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setCustomTag(java.util.List<String> customTag) {
            this.customTag = customTag;
            return this;
        }
        public java.util.List<String> getCustomTag() {
            return this.customTag;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setEstimateCost(java.util.List<String> estimateCost) {
            this.estimateCost = estimateCost;
            return this;
        }
        public java.util.List<String> getEstimateCost() {
            return this.estimateCost;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes setSystemTag(java.util.List<String> systemTag) {
            this.systemTag = systemTag;
            return this;
        }
        public java.util.List<String> getSystemTag() {
            return this.systemTag;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions extends TeaModel {
        @NameInMap("ProviderName")
        public String providerName;

        @NameInMap("SupportedVersions")
        public java.util.List<String> supportedVersions;

        public static GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions self = new GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions setSupportedVersions(java.util.List<String> supportedVersions) {
            this.supportedVersions = supportedVersions;
            return this;
        }
        public java.util.List<String> getSupportedVersions() {
            return this.supportedVersions;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraformSupportedVersions extends TeaModel {
        @NameInMap("ProviderVersions")
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> providerVersions;

        @NameInMap("TerraformVersion")
        public String terraformVersion;

        @NameInMap("Transform")
        public String transform;

        public static GetFeatureDetailsResponseBodyTerraformSupportedVersions build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraformSupportedVersions self = new GetFeatureDetailsResponseBodyTerraformSupportedVersions();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setProviderVersions(java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> providerVersions) {
            this.providerVersions = providerVersions;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersionsProviderVersions> getProviderVersions() {
            return this.providerVersions;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetFeatureDetailsResponseBodyTerraformSupportedVersions setTransform(String transform) {
            this.transform = transform;
            return this;
        }
        public String getTransform() {
            return this.transform;
        }

    }

    public static class GetFeatureDetailsResponseBodyTerraform extends TeaModel {
        @NameInMap("SupportedResourceTypes")
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes supportedResourceTypes;

        @NameInMap("SupportedVersions")
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> supportedVersions;

        public static GetFeatureDetailsResponseBodyTerraform build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureDetailsResponseBodyTerraform self = new GetFeatureDetailsResponseBodyTerraform();
            return TeaModel.build(map, self);
        }

        public GetFeatureDetailsResponseBodyTerraform setSupportedResourceTypes(GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public GetFeatureDetailsResponseBodyTerraformSupportedResourceTypes getSupportedResourceTypes() {
            return this.supportedResourceTypes;
        }

        public GetFeatureDetailsResponseBodyTerraform setSupportedVersions(java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> supportedVersions) {
            this.supportedVersions = supportedVersions;
            return this;
        }
        public java.util.List<GetFeatureDetailsResponseBodyTerraformSupportedVersions> getSupportedVersions() {
            return this.supportedVersions;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceCertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ModifyCloudResourceCertRequestCertificates> certificates;

    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    @Deprecated
    public Integer port;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>lb-bp1*****jqnnqk5uj2p</p>
     */
    @NameInMap("ResourceInstanceId")
    @Deprecated
    public String resourceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>clb4</p>
     */
    @NameInMap("ResourceProduct")
    @Deprecated
    public String resourceProduct;

    public static ModifyCloudResourceCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudResourceCertRequest self = new ModifyCloudResourceCertRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudResourceCertRequest setCertificates(java.util.List<ModifyCloudResourceCertRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<ModifyCloudResourceCertRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public ModifyCloudResourceCertRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public ModifyCloudResourceCertRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
    public ModifyCloudResourceCertRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyCloudResourceCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    @Deprecated
    public ModifyCloudResourceCertRequest setResourceInstanceId(String resourceInstanceId) {
        this.resourceInstanceId = resourceInstanceId;
        return this;
    }
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    @Deprecated
    public ModifyCloudResourceCertRequest setResourceProduct(String resourceProduct) {
        this.resourceProduct = resourceProduct;
        return this;
    }
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public static class ModifyCloudResourceCertRequestCertificates extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>232***-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static ModifyCloudResourceCertRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudResourceCertRequestCertificates self = new ModifyCloudResourceCertRequestCertificates();
            return TeaModel.build(map, self);
        }

        public ModifyCloudResourceCertRequestCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public ModifyCloudResourceCertRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

}

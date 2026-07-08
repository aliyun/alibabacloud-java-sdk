// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyCloudResourceCertRequest extends TeaModel {
    /**
     * <p>The list of certificates.</p>
     * <blockquote>
     * <p>Enter all certificate IDs. This includes the default certificate and all additional certificates. After you submit the request, WAF compares the submitted IDs with the existing ones. WAF adds new certificates and deletes certificates that are not in your list. Deleting a certificate may affect related services.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<ModifyCloudResourceCertRequestCertificates> certificates;

    /**
     * <p>The ID of the resource that is added to WAF. WAF automatically generates this ID when you add the resource in cloud native mode.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2839876.html">CreateCloudResource</a> operation to add a resource. Then, view the resource ID in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-bp*********k5uj2p-443-clb7</p>
     */
    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port of the cloud product that is added to WAF.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("Port")
    @Deprecated
    public Integer port;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud product instance.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1*****jqnnqk5uj2p</p>
     */
    @NameInMap("ResourceInstanceId")
    @Deprecated
    public String resourceInstanceId;

    /**
     * <p>The type of the cloud product. Valid values:</p>
     * <ul>
     * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
     * </li>
     * <li><p><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</p>
     * </li>
     * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
     * </li>
     * </ul>
     * 
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
         * <p>The type of the certificate for the HTTPS protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: the default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: the additional certificate.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The ID of the certificate.</p>
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

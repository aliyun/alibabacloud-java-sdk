// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAttestorRequest extends TeaModel {
    /**
     * <p>The ID of the KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>2e81355b-f8e7-4090-8082-a8f8124a****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The region ID of the Key Management Service (KMS) key.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("KeyRegionId")
    public String keyRegionId;

    /**
     * <p>The version ID of the KMS key.</p>
     * 
     * <strong>example:</strong>
     * <p>8d7c9c91-57ce-4cf4-a959-1e700e13****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <p>The name of the witness.</p>
     * 
     * <strong>example:</strong>
     * <p>attestor-auto-ad5316</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>attestor</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateAttestorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAttestorRequest self = new CreateAttestorRequest();
        return TeaModel.build(map, self);
    }

    public CreateAttestorRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public CreateAttestorRequest setKeyRegionId(String keyRegionId) {
        this.keyRegionId = keyRegionId;
        return this;
    }
    public String getKeyRegionId() {
        return this.keyRegionId;
    }

    public CreateAttestorRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public CreateAttestorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAttestorRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateAttestorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAttestorRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAttestorRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>key-********</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("KeyRegionId")
    public String keyRegionId;

    /**
     * <strong>example:</strong>
     * <p>key-****</p>
     */
    @NameInMap("KeyVersionId")
    public String keyVersionId;

    /**
     * <strong>example:</strong>
     * <p>attestor-auto-ad5316</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyAttestorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAttestorRequest self = new ModifyAttestorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAttestorRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ModifyAttestorRequest setKeyRegionId(String keyRegionId) {
        this.keyRegionId = keyRegionId;
        return this;
    }
    public String getKeyRegionId() {
        return this.keyRegionId;
    }

    public ModifyAttestorRequest setKeyVersionId(String keyVersionId) {
        this.keyVersionId = keyVersionId;
        return this;
    }
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    public ModifyAttestorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAttestorRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ModifyAttestorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAttestorRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

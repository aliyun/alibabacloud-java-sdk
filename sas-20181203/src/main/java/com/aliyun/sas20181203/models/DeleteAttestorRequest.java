// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteAttestorRequest extends TeaModel {
    /**
     * <p>The name of the witness.</p>
     * 
     * <strong>example:</strong>
     * <p>attestor</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>221.214.XXX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteAttestorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttestorRequest self = new DeleteAttestorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAttestorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteAttestorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteAttestorRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

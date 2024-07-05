// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsCertificateDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cert-539xxxx</p>
     */
    @NameInMap("CertName")
    public String certName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeVsCertificateDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsCertificateDetailRequest self = new DescribeVsCertificateDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsCertificateDetailRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public DescribeVsCertificateDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

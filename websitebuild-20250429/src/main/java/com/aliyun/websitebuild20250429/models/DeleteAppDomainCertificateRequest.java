// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DeleteAppDomainCertificateRequest extends TeaModel {
    /**
     * <p>Business ID of the application instance</p>
     * 
     * <strong>example:</strong>
     * <p>202506170003</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Domain name</p>
     * 
     * <strong>example:</strong>
     * <p>aliwmzs.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DeleteAppDomainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppDomainCertificateRequest self = new DeleteAppDomainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppDomainCertificateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DeleteAppDomainCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}

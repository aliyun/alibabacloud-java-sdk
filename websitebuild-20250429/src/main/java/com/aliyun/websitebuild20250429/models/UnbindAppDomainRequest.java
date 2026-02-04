// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UnbindAppDomainRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250908140837000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Domain Name</p>
     * 
     * <strong>example:</strong>
     * <p>conway.cn</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static UnbindAppDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAppDomainRequest self = new UnbindAppDomainRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAppDomainRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UnbindAppDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}

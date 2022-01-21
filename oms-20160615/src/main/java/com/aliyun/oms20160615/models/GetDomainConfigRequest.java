// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetDomainConfigRequest extends TeaModel {
    @NameInMap("CompressEnable")
    public Boolean compressEnable;

    @NameInMap("DomainCode")
    public String domainCode;

    public static GetDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainConfigRequest self = new GetDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainConfigRequest setCompressEnable(Boolean compressEnable) {
        this.compressEnable = compressEnable;
        return this;
    }
    public Boolean getCompressEnable() {
        return this.compressEnable;
    }

    public GetDomainConfigRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetIcpFilingInfoForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250703155602000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static GetIcpFilingInfoForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIcpFilingInfoForPartnerRequest self = new GetIcpFilingInfoForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GetIcpFilingInfoForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetIcpFilingInfoForPartnerRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}

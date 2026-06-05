// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSeoStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250814102215000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SeType")
    public String seType;

    public static GetAppSeoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSeoStatusRequest self = new GetAppSeoStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSeoStatusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetAppSeoStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetAppSeoStatusRequest setSeType(String seType) {
        this.seType = seType;
        return this;
    }
    public String getSeType() {
        return this.seType;
    }

}

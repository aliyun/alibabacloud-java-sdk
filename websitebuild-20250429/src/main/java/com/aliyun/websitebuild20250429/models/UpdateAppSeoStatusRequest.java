// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSeoStatusRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Domain Name</p>
     * 
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Search Engine Type</p>
     * 
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SeType")
    public String seType;

    public static UpdateAppSeoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppSeoStatusRequest self = new UpdateAppSeoStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppSeoStatusRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateAppSeoStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateAppSeoStatusRequest setSeType(String seType) {
        this.seType = seType;
        return this;
    }
    public String getSeType() {
        return this.seType;
    }

}

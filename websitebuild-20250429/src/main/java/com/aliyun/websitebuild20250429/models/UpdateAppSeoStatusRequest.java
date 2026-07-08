// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppSeoStatusRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WS20250801154628000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>yjdw.bpu.edu.cn-waf</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("SeAuthInfo")
    public String seAuthInfo;

    /**
     * <p>The search engine type.</p>
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

    public UpdateAppSeoStatusRequest setSeAuthInfo(String seAuthInfo) {
        this.seAuthInfo = seAuthInfo;
        return this;
    }
    public String getSeAuthInfo() {
        return this.seAuthInfo;
    }

    public UpdateAppSeoStatusRequest setSeType(String seType) {
        this.seType = seType;
        return this;
    }
    public String getSeType() {
        return this.seType;
    }

}

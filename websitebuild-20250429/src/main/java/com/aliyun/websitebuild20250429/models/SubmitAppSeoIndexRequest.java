// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SubmitAppSeoIndexRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SeType")
    public String seType;

    @NameInMap("SubmitLater")
    public Boolean submitLater;

    public static SubmitAppSeoIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAppSeoIndexRequest self = new SubmitAppSeoIndexRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAppSeoIndexRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SubmitAppSeoIndexRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SubmitAppSeoIndexRequest setSeType(String seType) {
        this.seType = seType;
        return this;
    }
    public String getSeType() {
        return this.seType;
    }

    public SubmitAppSeoIndexRequest setSubmitLater(Boolean submitLater) {
        this.submitLater = submitLater;
        return this;
    }
    public Boolean getSubmitLater() {
        return this.submitLater;
    }

}

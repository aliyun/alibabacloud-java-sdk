// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BindAppDomainRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>WD20250820143531000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>xiaoniu.link</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Extend")
    public String extend;

    /**
     * <strong>example:</strong>
     * <p>vul_fix</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    public static BindAppDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAppDomainRequest self = new BindAppDomainRequest();
        return TeaModel.build(map, self);
    }

    public BindAppDomainRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public BindAppDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BindAppDomainRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public BindAppDomainRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}

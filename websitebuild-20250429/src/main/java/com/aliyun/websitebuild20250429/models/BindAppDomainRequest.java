// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BindAppDomainRequest extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250820143531000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Domain Name</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoniu.link</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Extended Information (OverwriteExistingRecord)</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;deliveryNodeName\&quot;:\&quot;网站验收\&quot;,\&quot;deliveryNodeStatus\&quot;:\&quot;Reject\&quot;,\&quot;deliveryOperatorRole\&quot;:\&quot;Customer\&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Domain Binding - Operation Type</p>
     * 
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

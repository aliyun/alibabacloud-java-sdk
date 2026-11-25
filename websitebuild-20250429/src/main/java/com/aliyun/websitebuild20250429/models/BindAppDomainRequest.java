// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class BindAppDomainRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250820143531000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The optional domain hosting method. A value of CUSTOMER_ESA indicates that the customer&quot;s own ESA is used. If you do not specify this parameter, the original hosting process is used. This parameter is supported only when DomainType is set to CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>CDN</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>xiaoniu.link</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The domain management type. Valid values: CUSTOM and PLATFORM_PREFIX. If you do not specify this parameter, CUSTOM is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The extended information (OverwriteExistingRecord).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;deliveryNodeName&quot;:&quot;Website acceptance&quot;,&quot;deliveryNodeStatus&quot;:&quot;Reject&quot;,&quot;deliveryOperatorRole&quot;:&quot;Customer&quot;}</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The operation type for domain binding.</p>
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

    public BindAppDomainRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public BindAppDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BindAppDomainRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
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

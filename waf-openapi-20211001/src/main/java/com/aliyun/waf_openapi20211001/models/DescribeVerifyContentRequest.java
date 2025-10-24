// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessOrigin")
    public String accessOrigin;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyContentRequest self = new DescribeVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyContentRequest setAccessOrigin(String accessOrigin) {
        this.accessOrigin = accessOrigin;
        return this;
    }
    public String getAccessOrigin() {
        return this.accessOrigin;
    }

    public DescribeVerifyContentRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVerifyContentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

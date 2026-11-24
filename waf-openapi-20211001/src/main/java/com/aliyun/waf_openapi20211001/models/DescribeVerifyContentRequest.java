// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentRequest extends TeaModel {
    /**
     * <p>The access source. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong>: public cloud CNAME access</p>
     * </li>
     * <li><p><strong>asset</strong>: custom asset access</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: hybrid cloud CNAME access</p>
     * </li>
     * <li><p><strong>tgw</strong>: cloud native mode</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>share</p>
     */
    @NameInMap("AccessOrigin")
    public String accessOrigin;

    /**
     * <p>The domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the WAF instance. You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the current WAF instance.</p>
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

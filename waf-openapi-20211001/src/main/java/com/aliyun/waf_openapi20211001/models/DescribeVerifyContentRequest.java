// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeVerifyContentRequest extends TeaModel {
    /**
     * <p>The source of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>share</strong>: The domain name is added to WAF in CNAME record mode.</p>
     * </li>
     * <li><p><strong>asset</strong>: The domain name is added to WAF as a custom asset.</p>
     * </li>
     * <li><p><strong>hybrid_cloud_cname</strong>: The domain name is added to WAF in hybrid cloud CNAME record mode.</p>
     * </li>
     * <li><p><strong>tgw</strong>: The domain name is added to WAF in cloud native mode.</p>
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
     * <p>The domain name that you want to query for ownership verification content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the WAF instance.</p>
     * <blockquote>
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
     * </blockquote>
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

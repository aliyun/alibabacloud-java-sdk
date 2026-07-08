// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerRequest extends TeaModel {
    /**
     * <p>The domain name whose ownership you want to verify.</p>
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
     * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the WAF instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The protocol type used for file verification. This parameter is required only when you set VerifyType to fileCheck. Valid values:</p>
     * <ul>
     * <li><p><strong>HTTP</strong>: the HTTP protocol.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: the HTTPS protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The verification method. Valid values:</p>
     * <ul>
     * <li><p><strong>dnsCheck</strong>: DNS verification.</p>
     * </li>
     * <li><p><strong>fileCheck</strong>: File verification.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dnsCheck</p>
     */
    @NameInMap("VerifyType")
    public String verifyType;

    public static VerifyDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerRequest self = new VerifyDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public VerifyDomainOwnerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VerifyDomainOwnerRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public VerifyDomainOwnerRequest setVerifyType(String verifyType) {
        this.verifyType = verifyType;
        return this;
    }
    public String getVerifyType() {
        return this.verifyType;
    }

}

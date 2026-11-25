// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class DescribeAppDomainDnsRecordRequest extends TeaModel {
    /**
     * <p>The business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>WD20250821114240000001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>rayihealth.cn</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The purpose of querying the DNS configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>restore</p>
     */
    @NameInMap("Purpose")
    public String purpose;

    public static DescribeAppDomainDnsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDomainDnsRecordRequest self = new DescribeAppDomainDnsRecordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppDomainDnsRecordRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeAppDomainDnsRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeAppDomainDnsRecordRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityStatInfoRequest extends TeaModel {
    /**
     * <p>The numbers of low-risk unfixed vulnerabilities at all points in time.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of **high-risk** unfixed vulnerabilities at each point in time.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public String resourceDirectoryAccountId;

    /**
     * <p>The total number of baseline risk items on the current day.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecurityStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityStatInfoRequest self = new DescribeSecurityStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityStatInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityStatInfoRequest setResourceDirectoryAccountId(String resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public String getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSecurityStatInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>113.110.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of configuration. By default, all types of configurations are queried. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability.</li>
     * <li><strong>sys</strong>: Windows system vulnerability.</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
     * <li><strong>app</strong>: application vulnerability that is detected by using web scanner.</li>
     * <li><strong>emg</strong>: urgent vulnerability.</li>
     * <li><strong>scanMode</strong>: displays easily exploitable vulnerability.</li>
     * <li><strong>imageVulClean</strong>: vulnerability retention duration.</li>
     * <li><strong>yum</strong>: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeVulConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulConfigRequest self = new DescribeVulConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeVulConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

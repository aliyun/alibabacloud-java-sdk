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
     * <p>The type of vulnerability management configuration. By default, all types of configurations are queried. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability (web scanner)</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * <li><strong>scanMode</strong>: display real-risk vulnerabilities</li>
     * <li><strong>imageVulClean</strong>: vulnerability retention period</li>
     * <li><strong>yum</strong>: prioritize Alibaba Cloud sources for vulnerability fixing.</li>
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

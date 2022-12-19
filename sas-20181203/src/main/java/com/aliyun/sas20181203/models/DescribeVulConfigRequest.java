// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigRequest extends TeaModel {
    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of configuration. By default, all types of configurations are queried. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **app**: application vulnerability that is detected by using web scanner
    // *   **emg**: urgent vulnerability
    // *   **scanMode**: displays easily exploitable vulnerability
    // *   **imageVulClean**: vulnerability retention duration
    // *   **yum**: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities
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

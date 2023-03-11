// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of configuration. By default, all types of configurations are queried. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability.</p>
     * <p>*   **sys**: Windows system vulnerability.</p>
     * <p>*   **cms**: Web-CMS vulnerability.</p>
     * <p>*   **app**: application vulnerability that is detected by using web scanner.</p>
     * <p>*   **emg**: urgent vulnerability.</p>
     * <p>*   **scanMode**: displays easily exploitable vulnerability.</p>
     * <p>*   **imageVulClean**: vulnerability retention duration.</p>
     * <p>*   **yum**: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</p>
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

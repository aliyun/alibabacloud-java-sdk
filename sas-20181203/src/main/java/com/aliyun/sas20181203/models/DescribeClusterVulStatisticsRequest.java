// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterVulStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerabilities</p>
     * <p>*   **app**: application vulnerabilities</p>
     * <p>*   **sca**: vulnerabilities that are detected based on software component analysis</p>
     */
    @NameInMap("Types")
    public String types;

    public static DescribeClusterVulStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterVulStatisticsRequest self = new DescribeClusterVulStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterVulStatisticsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterVulStatisticsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

}

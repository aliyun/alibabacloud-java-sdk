// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceVulStatisticsRequest extends TeaModel {
    /**
     * <p>The vulnerability type of the serverless instance. Valid values:</p>
     * <ul>
     * <li><strong>sca</strong>: middleware vulnerabilities</li>
     * <li><strong>app</strong>: application vulnerabilities detected by using a scanner</li>
     * </ul>
     * <blockquote>
     * <p> Serverless instances allow you to detect only application vulnerabilities by using a scanner.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca,app</p>
     */
    @NameInMap("Types")
    public String types;

    /**
     * <p>The UUID of the instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID of the instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b268326-273e-44fc-a0e3-9482435c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeInstanceVulStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVulStatisticsRequest self = new DescribeInstanceVulStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVulStatisticsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public DescribeInstanceVulStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}

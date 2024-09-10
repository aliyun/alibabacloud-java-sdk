// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceVulStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sca,app</p>
     */
    @NameInMap("Types")
    public String types;

    /**
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

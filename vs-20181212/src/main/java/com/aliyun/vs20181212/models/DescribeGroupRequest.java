// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupRequest extends TeaModel {
    /**
     * <p>Space ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>337639*****224964-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Specifies whether to return the statistics of devices in the group. The default value is false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeStats")
    public Boolean includeStats;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupRequest self = new DescribeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeGroupRequest setIncludeStats(Boolean includeStats) {
        this.includeStats = includeStats;
        return this;
    }
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    public DescribeGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}

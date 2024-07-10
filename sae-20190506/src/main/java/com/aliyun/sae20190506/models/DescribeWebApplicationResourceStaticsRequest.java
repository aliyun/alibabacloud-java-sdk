// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebApplicationResourceStaticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1687832980387</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1562831689704</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeWebApplicationResourceStaticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebApplicationResourceStaticsRequest self = new DescribeWebApplicationResourceStaticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebApplicationResourceStaticsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeWebApplicationResourceStaticsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeWebApplicationResourceStaticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeWebApplicationResourceStaticsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}

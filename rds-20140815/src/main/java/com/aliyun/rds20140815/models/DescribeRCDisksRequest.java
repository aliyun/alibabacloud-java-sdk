// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDisksRequest extends TeaModel {
    /**
     * <p>The IDs of cloud disks, local disks, or elastic ephemeral disks. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rcd-bp67acfmxazb4p****&quot;, &quot;rcd-bp67acfmxazb4g****&quot;, … &quot;rcd-bp67acfmxazb4d****&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>30</strong> to <strong>100</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRCDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCDisksRequest self = new DescribeRCDisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCDisksRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public DescribeRCDisksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCDisksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCDisksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRCDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

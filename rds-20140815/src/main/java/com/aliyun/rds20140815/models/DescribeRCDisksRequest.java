// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDisksRequest extends TeaModel {
    /**
     * <p>The disk IDs. The value is a JSON array that contains up to 100 IDs separated by commas (,). Format: <code>[&quot;Disk ID1&quot;,&quot;Disk ID2&quot;]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rcd-bp67acfmxazb4p****&quot;, &quot;rcd-bp67acfmxazb4g****&quot;, … &quot;rcd-bp67acfmxazb4d****&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The type of cloud disk or elastic ephemeral disk to query. Valid values:
     * ● all: queries both system cloud disks and data cloud disks.
     * ● system: queries only system cloud disks.
     * ● data: queries only data cloud disks.
     * Default value: all.</p>
     * 
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("DiskType")
    public String diskType;

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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The disk status. Valid values:
     * ● In_use: in use.
     * ● Available: to be attached.
     * ● Attaching: being attached.
     * ● Detaching: being detached.
     * ● Creating: being created.
     * ● ReIniting: being initialized.
     * ● All: all statuses.
     * Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeRCDisksRequestTag> tag;

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

    public DescribeRCDisksRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
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

    public DescribeRCDisksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRCDisksRequest setTag(java.util.List<DescribeRCDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRCDisksRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeRCDisksRequestTag extends TeaModel {
        /**
         * <p>The tag key. Empty values and duplicate values are <strong>not allowed</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Empty values are <strong>allowed</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRCDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCDisksRequestTag self = new DescribeRCDisksRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCDisksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCDisksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

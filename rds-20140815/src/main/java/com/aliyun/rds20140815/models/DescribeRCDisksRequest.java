// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCDisksRequest extends TeaModel {
    /**
     * <p>The disk ID. The value is a JSON array that consists of up to 100 disk IDs. Separate the disk IDs with commas (,). Format: <code>[&quot;Disk ID1&quot;,&quot;Disk ID2&quot;]</code>.</p>
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
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of the tags.</p>
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

    public DescribeRCDisksRequest setTag(java.util.List<DescribeRCDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRCDisksRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeRCDisksRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. The tag key <strong>cannot be</strong> an empty string or a duplicate value.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value <strong>can be</strong> an empty string.</p>
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

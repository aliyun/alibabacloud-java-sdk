// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCSnapshotsRequest extends TeaModel {
    /**
     * <p>The cloud disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9c8isqly8637zw****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

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
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The snapshot IDs.</p>
     * <p>You can specify a maximum of 100 IDs. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;rcds-bp67acfmxazb4p****&quot;, &quot;rcds-bp67acfmxazb5p****&quot;, … &quot;rcds-bp67acfmxazb6p****&quot;]</p>
     */
    @NameInMap("SnapshotIds")
    public String snapshotIds;

    @NameInMap("Tag")
    public java.util.List<DescribeRCSnapshotsRequestTag> tag;

    public static DescribeRCSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCSnapshotsRequest self = new DescribeRCSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCSnapshotsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeRCSnapshotsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCSnapshotsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRCSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCSnapshotsRequest setSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeRCSnapshotsRequest setTag(java.util.List<DescribeRCSnapshotsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeRCSnapshotsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeRCSnapshotsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeRCSnapshotsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCSnapshotsRequestTag self = new DescribeRCSnapshotsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeRCSnapshotsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRCSnapshotsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

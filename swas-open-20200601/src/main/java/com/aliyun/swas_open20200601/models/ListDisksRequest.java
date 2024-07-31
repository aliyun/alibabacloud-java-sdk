// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListDisksRequest extends TeaModel {
    /**
     * <p>The IDs of the disks. The value can be a JSON array that consists of up to 100 disk IDs. Separate multiple disk IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;d-bp14wq0149cpp2x****&quot;, &quot;d-bp14wq0149cpp2y****&quot;]</p>
     */
    @NameInMap("DiskIds")
    public String diskIds;

    /**
     * <p>The disk type. Valid values:</p>
     * <ul>
     * <li>system: system disk</li>
     * <li>data: data disk</li>
     * </ul>
     * <p>By default, system disks and data disks are both queried.</p>
     * 
     * <strong>example:</strong>
     * <p>System</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The ID of the simple application server.</p>
     * 
     * <strong>example:</strong>
     * <p>2ad1ae67295445f598017499dc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the disks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bti7cf7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags that are added to the disks.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListDisksRequestTag> tag;

    public static ListDisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDisksRequest self = new ListDisksRequest();
        return TeaModel.build(map, self);
    }

    public ListDisksRequest setDiskIds(String diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public String getDiskIds() {
        return this.diskIds;
    }

    public ListDisksRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ListDisksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDisksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDisksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDisksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListDisksRequest setTag(java.util.List<ListDisksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListDisksRequestTag> getTag() {
        return this.tag;
    }

    public static class ListDisksRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 64 characters in length. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDisksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListDisksRequestTag self = new ListDisksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListDisksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDisksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeResourcePackagesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of cross-cloud resource plans.</p>
     */
    @NameInMap("ResourcePackageList")
    public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageList> resourcePackageList;

    public static DescribeResourcePackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackagesResponseBody self = new DescribeResourcePackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackagesResponseBody setResourcePackageList(java.util.List<DescribeResourcePackagesResponseBodyResourcePackageList> resourcePackageList) {
        this.resourcePackageList = resourcePackageList;
        return this;
    }
    public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageList> getResourcePackageList() {
        return this.resourcePackageList;
    }

    public static class DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList extends TeaModel {
        /**
         * <p>The capacity allocated to the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AllocatedCapacity")
        public Long allocatedCapacity;

        /**
         * <p>The ID of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pj-87681rbcef6******</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The used capacity of the resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        public static DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList self = new DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList setAllocatedCapacity(Long allocatedCapacity) {
            this.allocatedCapacity = allocatedCapacity;
            return this;
        }
        public Long getAllocatedCapacity() {
            return this.allocatedCapacity;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

    }

    public static class DescribeResourcePackagesResponseBodyResourcePackageListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeResourcePackagesResponseBodyResourcePackageListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackagesResponseBodyResourcePackageListTags self = new DescribeResourcePackagesResponseBodyResourcePackageListTags();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackagesResponseBodyResourcePackageListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeResourcePackagesResponseBodyResourcePackageList extends TeaModel {
        /**
         * <p>Indicates whether automatic quota allocation is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoQuota")
        public Boolean autoQuota;

        /**
         * <p>The time when the resource plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1744621511000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the resource plan expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1747238400000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the cross-cloud resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>pm-bp11b0i9389******</p>
         */
        @NameInMap("ResourcePackageId")
        public String resourcePackageId;

        /**
         * <p>The quota allocation details.</p>
         */
        @NameInMap("ResourcePackageQuotaList")
        public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList> resourcePackageQuotaList;

        /**
         * <p>The type of the cross-cloud resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("ResourcePackageType")
        public String resourcePackageType;

        /**
         * <p>The status of the cross-cloud resource plan. Valid values:</p>
         * <ul>
         * <li><p>Normal: Normal.</p>
         * </li>
         * <li><p>Maintaining: Under maintenance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListTags> tags;

        /**
         * <p>The total capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCapacity")
        public Long totalCapacity;

        /**
         * <p>The used capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        public static DescribeResourcePackagesResponseBodyResourcePackageList build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourcePackagesResponseBodyResourcePackageList self = new DescribeResourcePackagesResponseBodyResourcePackageList();
            return TeaModel.build(map, self);
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setAutoQuota(Boolean autoQuota) {
            this.autoQuota = autoQuota;
            return this;
        }
        public Boolean getAutoQuota() {
            return this.autoQuota;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setResourcePackageId(String resourcePackageId) {
            this.resourcePackageId = resourcePackageId;
            return this;
        }
        public String getResourcePackageId() {
            return this.resourcePackageId;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setResourcePackageQuotaList(java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList> resourcePackageQuotaList) {
            this.resourcePackageQuotaList = resourcePackageQuotaList;
            return this;
        }
        public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListResourcePackageQuotaList> getResourcePackageQuotaList() {
            return this.resourcePackageQuotaList;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setResourcePackageType(String resourcePackageType) {
            this.resourcePackageType = resourcePackageType;
            return this;
        }
        public String getResourcePackageType() {
            return this.resourcePackageType;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setTags(java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeResourcePackagesResponseBodyResourcePackageListTags> getTags() {
            return this.tags;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setTotalCapacity(Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeResourcePackagesResponseBodyResourcePackageList setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

    }

}

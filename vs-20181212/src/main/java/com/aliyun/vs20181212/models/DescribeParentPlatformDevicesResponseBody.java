// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> devices;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Long pageCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Long pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeParentPlatformDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformDevicesResponseBody self = new DescribeParentPlatformDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParentPlatformDevicesResponseBody setDevices(java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public DescribeParentPlatformDevicesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeParentPlatformDevicesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public DescribeParentPlatformDevicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeParentPlatformDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParentPlatformDevicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeParentPlatformDevicesResponseBodyDevices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>310101*****7542007</p>
         */
        @NameInMap("GbId")
        public String gbId;

        /**
         * <strong>example:</strong>
         * <p>3484*****8732174-cn-qingdao</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>3487*****323380-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>3614*****766212-cn-qingdao</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        public static DescribeParentPlatformDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeParentPlatformDevicesResponseBodyDevices self = new DescribeParentPlatformDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeParentPlatformDevicesResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("Devices")
    public java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> devices;

    public static DescribeParentPlatformDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParentPlatformDevicesResponseBody self = new DescribeParentPlatformDevicesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeParentPlatformDevicesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public DescribeParentPlatformDevicesResponseBody setDevices(java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<DescribeParentPlatformDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public static class DescribeParentPlatformDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static DescribeParentPlatformDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            DescribeParentPlatformDevicesResponseBodyDevices self = new DescribeParentPlatformDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
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

        public DescribeParentPlatformDevicesResponseBodyDevices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeParentPlatformDevicesResponseBodyDevices setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

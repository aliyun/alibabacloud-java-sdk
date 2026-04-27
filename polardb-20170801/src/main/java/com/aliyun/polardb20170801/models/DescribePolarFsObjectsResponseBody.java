// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsObjectsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribePolarFsObjectsResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>pfs-2ze0i7*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribePolarFsObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsObjectsResponseBody self = new DescribePolarFsObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsObjectsResponseBody setItems(java.util.List<DescribePolarFsObjectsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribePolarFsObjectsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribePolarFsObjectsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarFsObjectsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsObjectsResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePolarFsObjectsResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsObjectsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarFsObjectsResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("LastModified")
        public Long lastModified;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LinkTarget")
        public String linkTarget;

        /**
         * <strong>example:</strong>
         * <p>755</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Nlink")
        public Integer nlink;

        /**
         * <p>Owner</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <strong>example:</strong>
         * <p>directory</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribePolarFsObjectsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsObjectsResponseBodyItems self = new DescribePolarFsObjectsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsObjectsResponseBodyItems setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public DescribePolarFsObjectsResponseBodyItems setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public DescribePolarFsObjectsResponseBodyItems setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public DescribePolarFsObjectsResponseBodyItems setLinkTarget(String linkTarget) {
            this.linkTarget = linkTarget;
            return this;
        }
        public String getLinkTarget() {
            return this.linkTarget;
        }

        public DescribePolarFsObjectsResponseBodyItems setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribePolarFsObjectsResponseBodyItems setNlink(Integer nlink) {
            this.nlink = nlink;
            return this;
        }
        public Integer getNlink() {
            return this.nlink;
        }

        public DescribePolarFsObjectsResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribePolarFsObjectsResponseBodyItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarFsObjectsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

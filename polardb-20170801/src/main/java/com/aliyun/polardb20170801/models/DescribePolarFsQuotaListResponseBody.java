// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsQuotaListResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The number of records per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The PolarFS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-test****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>A list of directory quotas.</p>
     */
    @NameInMap("QuotaItems")
    public java.util.List<DescribePolarFsQuotaListResponseBodyQuotaItems> quotaItems;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EBEAA83D-1734-42E3-85E3-E25F6E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribePolarFsQuotaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsQuotaListResponseBody self = new DescribePolarFsQuotaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsQuotaListResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsQuotaListResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarFsQuotaListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsQuotaListResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsQuotaListResponseBody setQuotaItems(java.util.List<DescribePolarFsQuotaListResponseBodyQuotaItems> quotaItems) {
        this.quotaItems = quotaItems;
        return this;
    }
    public java.util.List<DescribePolarFsQuotaListResponseBodyQuotaItems> getQuotaItems() {
        return this.quotaItems;
    }

    public DescribePolarFsQuotaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsQuotaListResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarFsQuotaListResponseBodyQuotaItems extends TeaModel {
        /**
         * <p>The capacity in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1073741824</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <p>The inode quota.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Inodes")
        public Long inodes;

        /**
         * <p>The directory path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The used capacity in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>104857600</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        /**
         * <p>The number of inodes in use.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedInodes")
        public Long usedInodes;

        public static DescribePolarFsQuotaListResponseBodyQuotaItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsQuotaListResponseBodyQuotaItems self = new DescribePolarFsQuotaListResponseBodyQuotaItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsQuotaListResponseBodyQuotaItems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribePolarFsQuotaListResponseBodyQuotaItems setInodes(Long inodes) {
            this.inodes = inodes;
            return this;
        }
        public Long getInodes() {
            return this.inodes;
        }

        public DescribePolarFsQuotaListResponseBodyQuotaItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribePolarFsQuotaListResponseBodyQuotaItems setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public DescribePolarFsQuotaListResponseBodyQuotaItems setUsedInodes(Long usedInodes) {
            this.usedInodes = usedInodes;
            return this;
        }
        public Long getUsedInodes() {
            return this.usedInodes;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListSpecificationsResponseBody extends TeaModel {
    /**
     * <p>The result objects.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListSpecificationsResponseBodyItems> items;

    /**
     * <p>The page number of the query list. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxx-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSpecificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificationsResponseBody self = new ListSpecificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpecificationsResponseBody setItems(java.util.List<ListSpecificationsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSpecificationsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSpecificationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSpecificationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSpecificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpecificationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSpecificationsResponseBodyItems extends TeaModel {
        /**
         * <p>The specification family.</p>
         * 
         * <strong>example:</strong>
         * <p>4090CU</p>
         */
        @NameInMap("Class")
        public String _class;

        /**
         * <p>The number of cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public Integer cores;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The number of cards per single load.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Shard")
        public Integer shard;

        /**
         * <p><code>RenderingSpec</code></p>
         * 
         * <strong>example:</strong>
         * <p>crs.xic.s1</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The maximum storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        public static ListSpecificationsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSpecificationsResponseBodyItems self = new ListSpecificationsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSpecificationsResponseBodyItems set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public ListSpecificationsResponseBodyItems setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public ListSpecificationsResponseBodyItems setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListSpecificationsResponseBodyItems setShard(Integer shard) {
            this.shard = shard;
            return this;
        }
        public Integer getShard() {
            return this.shard;
        }

        public ListSpecificationsResponseBodyItems setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public ListSpecificationsResponseBodyItems setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

    }

}

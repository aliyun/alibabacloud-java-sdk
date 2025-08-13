// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeFieldListResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeFieldListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFieldListResponseBody self = new DescribeFieldListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFieldListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFieldListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeFieldListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeFieldListResponseBody setResultObject(java.util.List<DescribeFieldListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeFieldListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeFieldListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeFieldListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeFieldListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Field classification</p>
         * 
         * <strong>example:</strong>
         * <p>REQUEST_PARAM</p>
         */
        @NameInMap("classify")
        public String classify;

        /**
         * <p>Description information.</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Enum data</p>
         * 
         * <strong>example:</strong>
         * <p>STATUS</p>
         */
        @NameInMap("enumData")
        public String enumData;

        /**
         * <p>Field ID.</p>
         * 
         * <strong>example:</strong>
         * <p>497</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>Field name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Field source</p>
         * 
         * <strong>example:</strong>
         * <p>DEFINE</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>Status.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>Field type</p>
         * 
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("type")
        public String type;

        public static DescribeFieldListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFieldListResponseBodyResultObject self = new DescribeFieldListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFieldListResponseBodyResultObject setClassify(String classify) {
            this.classify = classify;
            return this;
        }
        public String getClassify() {
            return this.classify;
        }

        public DescribeFieldListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFieldListResponseBodyResultObject setEnumData(String enumData) {
            this.enumData = enumData;
            return this;
        }
        public String getEnumData() {
            return this.enumData;
        }

        public DescribeFieldListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeFieldListResponseBodyResultObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFieldListResponseBodyResultObject setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeFieldListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFieldListResponseBodyResultObject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeFieldListResponseBodyResultObject setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

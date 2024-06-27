// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeFieldListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeFieldListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("classify")
        public String classify;

        @NameInMap("description")
        public String description;

        @NameInMap("enumData")
        public String enumData;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("source")
        public String source;

        @NameInMap("status")
        public String status;

        @NameInMap("title")
        public String title;

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
